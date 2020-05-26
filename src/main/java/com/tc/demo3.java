package com.tc;

public class demo3 {
    public static void main(String[] args) {
        System.out.println(demo3.getValue(2));
    }
    public static  int getValue(int i){
        int result =0;
        switch (i){
            case 1:
                result = result +1;
            case 2:
                result = result +1*2;
            case 3:
                result = result +1*3;

        }
        return  result;
    }
}
