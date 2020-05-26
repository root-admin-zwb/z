package com.mp;

public class demo1 {
    public static void main(String[] args) {
        int a[] = {2,5,8,1,3,9,4,6,7};

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-1;j++){
                if (a[j]<a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
