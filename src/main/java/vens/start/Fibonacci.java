package vens.start;

import java.math.BigInteger;

public class Fibonacci {

    public BigInteger start(BigInteger n){
        if(n.equals(BigInteger.valueOf(2)) || n.compareTo(BigInteger.valueOf(2)) >0){
            return start(n.subtract(BigInteger.ONE)).add(start(n.subtract(BigInteger.valueOf(2))));
        }
        else{
            return n;
        }
    }



}
