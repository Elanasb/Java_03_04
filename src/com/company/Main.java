package com.company;

import java.util.Scanner;

public class Main {
    public static final int EXIT_CODE = 0;

    public static void main(String[] args) {
        Main objektas = new Main();
    }

    public Main() {
        float skaicius = 0;
        float suma = 0;
        do {
            skaicius = duokGarantuotaiSkaiciu();
            suma += skaicius;
        } while (skaicius != EXIT_CODE);
        System.out.println("Skaiciu suma yra: " + suma);

    }

    public float duokGarantuotaiSkaiciu() {
        float rezultatas = 0;
        Scanner sc = new Scanner(System.in);
        boolean arPavyko = false;
        while (arPavyko == false) {
            System.out.println("Iveskite skaiciu");
            try {
                rezultatas = sc.nextFloat();
                arPavyko = true;
            } catch (Exception klaida) {
                System.out.println("Ivestas tekstas yra ne skaicius");
                sc.next();
            }
        }
        return rezultatas;
    }
}