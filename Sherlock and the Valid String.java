public static String isValid(String s) {
        if(s == null)
            return "NO";
        if(s.length() == 0)
            return "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        int x = map.get(s.charAt(0));
        int count = 1;
        for(char ch : map.keySet()) {
            if(map.get(ch) != x)
                count++;
        }
        if(count > 2)
            return "NO";
        else
            return "YES";
    }
