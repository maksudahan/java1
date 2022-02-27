package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

     System.out.println(calculator(1,2,3,4,5,6));

}
    static int calculator(int ...asel) {
        int counter = 0;
        for (int i = 0; i < asel.length; i++) {
            counter += asel[i];
        }
        return counter;

    }
}
