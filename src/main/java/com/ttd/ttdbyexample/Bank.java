package com.ttd.ttdbyexample;


import java.util.HashMap;

public class Bank {

    private final HashMap<Pair, Integer> rateMap = new HashMap<>();

    Money reduce(Expression source) {
        return source.reduce(this, "USD");
    }

    public int rate(String from, String to) {
        if(from.equals(to))
            return 1;
        final Integer integer = rateMap.get(new Pair(from, to));
        return integer;
//        return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
    }

    public void addRate(String from, String to, int rate) {
        rateMap.put(new Pair(from, to), rate);
    }
}
