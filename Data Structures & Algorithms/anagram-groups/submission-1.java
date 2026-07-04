class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs){

            int[] count = new int[26];

            for(char ch : word.toCharArray()){
                count[ch - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for(int num : count){
                key.append('#');
                key.append(num);
            }

            String finalKey = key.toString();

            map.putIfAbsent(finalKey, new ArrayList<>());

            map.get(finalKey).add(word);
        }

        return new ArrayList<>(map.values());
    }
}