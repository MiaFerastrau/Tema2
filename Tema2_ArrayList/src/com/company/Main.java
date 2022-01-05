package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//initializam o lista goala de tip Integer
        ArrayList<Integer> numberList = new ArrayList<>();

    //initializam un scanner pe care sa il folosim la citirea numarului de elemente din lista
        Scanner input = new Scanner(System.in);
        System.out.println("Please specify the number of the elements on the list:");
        //citim de la tastatura numarul de elemente (n)
        int numberOfElements = input.nextInt();

        //populam lista cu numere de la 1 la n, n fiind numarul salvat in variabila numberOfElements
        for (int i =1; i<= numberOfElements; i++) {
            numberList.add(i);

        }

        //printam numerele din lista pentru a fi siguri ca totul este in regula
        System.out.println("The numbers stored in the list are:");
        for (int i = 0; i< numberList.size();i++) {
            System.out.println(numberList.get(i) + " ");
        }
        int random = (int) (Math.random()*5);
        System.out.println(("The missing number is: " + random));
        numberList.remove(2);
    }
}
