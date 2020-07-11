
package com.company;

public class New {
    public static void main(String[] args) {
        int[] array = new int[300];
        for(int i=0; i<array.length; i++){
            array[i] = i;

        }
        for(int a: array){
            System.out.println(a);
        }

    }
}
