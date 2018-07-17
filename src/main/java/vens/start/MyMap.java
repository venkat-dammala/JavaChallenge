package vens.start;

import java.util.*;

public class MyMap {
    public static void main(String args[]){
        class MyKey {
            String i;
            public MyKey(String i){
                this.i =i;
            }

            @Override
            public int hashCode() {

                return i.hashCode();
            }
        }
        Date begin = new Date();
        Map <MyKey,String> myMap= new HashMap(2500000,1);
        System.out.println("Strt (ms) "+ (begin.getTime()));
        for (int i=0;i<2000000;i++){

            myMap.put( new MyKey("ven"+i), "test "+i);
        }

        Date end = new Date();
        System.out.println("Duration (ms) "+ (end.getTime()-begin.getTime()));
    }

}
