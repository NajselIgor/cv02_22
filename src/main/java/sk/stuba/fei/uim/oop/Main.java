package sk.stuba.fei.uim.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavestnica = new Scanner(System.in);
        String a = "a";
        String b = "a";
        System.out.println("Zadaj pismeno: ");
        String c = klavestnica.nextLine();
        System.out.println("a == a " + (a == a));
        System.out.println("a == b " + (a == b));
        System.out.println("a == c " + (a == c));
        System.out.println("a.equals(c) " + (a.equals(c)));
    }
}
