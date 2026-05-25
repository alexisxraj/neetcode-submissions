class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sletter = new HashMap<>();
        HashMap<Character, Integer> tletter = new HashMap<>();

        if(s.length()!=t.length())
        return false;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(sletter.containsKey(c))
            {
                int v = sletter.get(c);
                sletter.put(c,v+1);
            }
            else
            {
                sletter.put(c,1);
            }
        }

        for(int i=0;i<t.length();i++)
        {
            char c = t.charAt(i);
            if(tletter.containsKey(c))
            {
                int v = tletter.get(c);
                tletter.put(c,v+1);
            }
            else
            {
                tletter.put(c,1);
            }
        }

        return sletter.equals(tletter);
    }
}
