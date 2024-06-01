class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char c:word1.toCharArray())map1.put( c , map1.getOrDefault(c,0)+1 );

        HashMap<Integer,Integer> ocuur = new HashMap<>();
        for(Integer i:map1.values())ocuur.put( i , ocuur.getOrDefault(i,0)+1 );

        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char c:word2.toCharArray())map2.put( c , map2.getOrDefault(c,0)+1 );

        for(Character i:map2.keySet()){

            if(!map1.containsKey(i))return false;

            Integer val = map2.get(i);
            if(ocuur.containsKey(val) && ocuur.get(val)>0 ){
                ocuur.put( val , ocuur.get(val)-1 );
            }else return false;
            
        }
        return true;
    }
}