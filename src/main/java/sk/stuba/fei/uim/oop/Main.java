package sk.stuba.fei.uim.oop;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner klavestnica = new Scanner(System.in);
        String a = "a";
        String b = "a";
        System.out.println("Zadaj pismeno: ");
        String c = klavestnica.nextLine();
        System.out.println("a == a " + (a == a));
        System.out.println("a == b " + (a == b));
        System.out.println("a == c " + (a == c));
        System.out.println("a.equals(c) " + (a.equals(c)));

        int x = 5;
        int[] y = new int[]{1, 2, 3};


        System.out.println("pred zmenou: ");
        System.out.println(x);
        System.out.println(y[0]);

        testPrimitive(x);
        testArray(y);

        System.out.println("po zmene: ");
        System.out.println(x);
        System.out.println(y[0]);

        Cislo cislo = new Cislo();
        cislo.a = 10;

        System.out.println("objekt pred zmenou");
        System.out.println(cislo.a);

        testPrimitive(cislo);

        System.out.println("objekt po zmene");
        System.out.println(cislo.a);

        testSpread("slovo1", y);
        testSpread("slovo2", 5,1,1,5,6,8,1);
        testSpread("slovo3", 150);*/
        Scanner fromKeyboard = new Scanner(System.in);

        int[] pole = new int[]{};
        int vstup;
        do {
            vstup = fromKeyboard.nextInt();
            pole = appendElement(pole, vstup);
        } while (vstup != 0);

        System.out.println(Arrays.toString(pole));

    int [][] pole2D = new int[3][3];
    int toAppend = 0;

    for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++) {
            pole2D[i][j] = toAppend;
            toAppend++;
        }
        for (int i = 0; i < 3; i++)
                System.out.println(Arrays.toString(pole2D[i]));
    }




    public static int[] appendElement(int[] pole, int toAppend) {
        int[] newArray = new int[pole.length + 1];

        for (int i = 0; i < pole.length; i++) {
            newArray[i] = pole[i];
        }

        newArray[pole.length] = toAppend;

        return newArray;
    }

    public static void testPrimitive(int cislo) {
        cislo = 10;
    }

    public static void testPrimitive(Cislo cislo) {
        cislo.a = 150;
    }

    public static void testArray(int[] array) {
        array[0] = 10;
    }

    public static void testSpread(String text, int... poleOrVariable) {
        System.out.println(Arrays.toString(poleOrVariable));
        System.out.println("Nulty prvok: " + (poleOrVariable[0]));
        System.out.println(text + " VarArg parameter musi byt posledny v zozname vstupnych parametrov do funkcie");
    }


}
