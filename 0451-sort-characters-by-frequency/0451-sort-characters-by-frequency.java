class Solution {
    public String frequencySort(String s) {
        if(s.length()==0) return "";
        if(s.length()==1) return s;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
         List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue())); //Sorted the Map in descending order of Frequency
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<list.size();i++) {
            for(int j=0;j<list.get(i).getValue();j++){
                sb.append(list.get(i).getKey());
            }
        }
        String str = sb.toString();
        return str;
    }
}