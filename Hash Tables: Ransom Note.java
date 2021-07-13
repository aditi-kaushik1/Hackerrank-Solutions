public static void checkMagazine(List<String> magazine, List<String> note) {
        Map<String, Integer> map = new HashMap<>();
        for(String x : magazine)
            map.put(x, map.getOrDefault(x, 0) + 1);
        for(String s : note) {
            if(!map.containsKey(s) || map.get(s) <= 0) {
                System.out.println("No");
                return;
            }
            map.put(s, map.get(s) - 1);
        }
        System.out.println("Yes");
    }
