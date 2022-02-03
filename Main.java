class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> hm = new HashMap<>(); // HashMap, to count the number of times a character is present in the string. 
        // Iterating through the string using a for-each loop.
        for(char c: s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0)+1); 
        }
        int v=hm.get(s.charAt(0)); // Initiating an integer to get the value present at the first key.
        int count=0; // Initializing an integer to count the number of keys with same value.
        // Iterating through the HashMap using a for-each loop.
        for(int i:hm.values()){ 
            if(v==i) count++; // If the value of current key is equal to the value of first key, then increment count by '1'.
        }
        if(count==hm.size()) return true; // Checking if count is equal to the number of values in the HashMap, if sp then return true.
        return false; // Otherwise return false.
    }
}
