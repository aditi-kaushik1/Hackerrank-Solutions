public static String primality(int n) {
        if(n == 2)
            return "Prime";
        if(n % 2 == 0 || n == 1)
            return "Not prime";
        for(int i = 2; i <= Math.pow(n, 0.5); i++) {
            if((n % i) == 0)
                return "Not prime";
        }
        return "Prime";
    }
