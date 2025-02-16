class Solution {
     public  String minWindow(String s, String t) {
        if(s.length()==0 || t.length()==0 || s.length()<t.length()) return "";
        Map<Character,Integer> tmap = new HashMap<>();
        for(char ch : t.toCharArray()){
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
        }
        Map<Character,Integer> smap = new HashMap<>();
        int minlen = Integer.MAX_VALUE;
        int minleft = -1;
        int minright = -1;
        int left = 0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            if(tmap.containsKey(ch)){
                smap.put(ch, smap.getOrDefault(ch, 0) + 1);
            }
            while(left<=right && isSmapFreqGtTmap(smap,tmap)){
                int len = right-left+1;
                if(minlen>len){
                    minlen = len;
                    minleft = left;
                    minright = right;
                }
                char chl = s.charAt(left);
                if(tmap.containsKey(chl)){
                    smap.put(chl,smap.getOrDefault(chl,0)-1);
                }
                left++;
            }
        }
        return (minlen==Integer.MAX_VALUE)?"":s.substring(minleft,minright+1);
    }
    public boolean isSmapFreqGtTmap(Map<Character,Integer> smap,Map<Character,Integer> tmap){
        for(Character ch : tmap.keySet()){
            if(smap.getOrDefault(ch,0)<tmap.get(ch)){
                return false;
            }
        }
        return true;
    }
}