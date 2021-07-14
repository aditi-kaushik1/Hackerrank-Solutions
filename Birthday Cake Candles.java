public static int birthdayCakeCandles(List<Integer> candles) {
        int max = candles.get(0);
        int count = 0;
        for(int i = 0; i < candles.size(); i++)
            if(candles.get(i) > max) 
                max = candles.get(i);
        for(int i = 0; i < candles.size(); i++)
            if(candles.get(i) == max)
                count++;
        return count;
    }
