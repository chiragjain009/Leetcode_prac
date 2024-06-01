class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> ocuur = new HashMap<>();
        for(char c:word1.toCharArray())map1.put( c , map1.getOrDefault(c,0)+1 );
        
        for(Integer i:map1.values())ocuur.put( i , ocuur.getOrDefault(i,0)+1 );

        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char c:word2.toCharArray())map2.put( c , map2.getOrDefault(c,0)+1 );

        for(char c: word2.toCharArray()){
            if(!map1.containsKey(c))return false;
        }
        System.out.println(ocuur);
        for(Character i:map2.keySet()){
            Integer val = map2.get(i);
            if(ocuur.containsKey(val) && ocuur.get(val)>0 ){
                ocuur.put( val , ocuur.get(val)-1 );
            }else return false;
        }
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(ocuur);

        return true;
    }
}