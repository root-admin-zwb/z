package com.kspx;

public class demo2 {
    public static void main(String[] args) {
        int a[] = {2,5,8,1,3,9,4,6,7};

        demo2.sort(a,0,a.length-1);

        for (int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void sort(int a[],int hight,int low){
        int tou = hight;
        int wei = low;
        int key = a[hight];

        while (wei>tou){

            while (wei>tou&&a[wei]>=key)
            wei--;
            if (a[wei]<key){
                int temp = a[wei];
                a[wei] = a[tou];
                a[tou] = temp;
            }

            while (wei>tou&&a[tou]<=key)
            tou++;
            if (a[tou]>=key){
                int temp = a[tou];
                a[tou] = a[wei];
                a[wei] = temp;
            }

        }

        if (tou>hight)sort(a,hight,tou-1);
        if (wei<low)sort(a,wei+1,low);
    }
}
