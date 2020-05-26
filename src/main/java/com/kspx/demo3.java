package com.kspx;

public class demo3 {
    public static void main(String[] args) {
        int a[] = {1,5,6,7,2,3,8,9,4};

       sort(a,0,a.length-1);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void sort(int arr[],int t,int w){
        int tou=t;
        int wei=w;
        int key=arr[t];
        while (wei>tou){
            while (wei>tou&&arr[wei]>=key)
                wei--;
            if (arr[wei]<=key){
                int tomp = arr[wei];
                arr[wei] = arr[tou];
                arr[tou] = tomp;
            }
            while (wei>tou&&arr[tou]<=key)
                tou++;
            if (arr[tou]>=key){
                int tomp = arr[tou];
                arr[tou] = arr[wei];
                arr[wei] = tomp;
            }
        }
        if (tou>t) sort(arr,t,tou-1);
        if (wei<w) sort(arr,wei+1,w);
    }



}
