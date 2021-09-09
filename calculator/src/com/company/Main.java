package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] arabic  = new String[] {"1","2","3","4","5","6","7","8","9","10"};
        List ar = new ArrayList<>(Arrays.asList(arabic));

        String[] rim  = new String[] {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        List ri = new ArrayList<>(Arrays.asList(rim));

        String[] rim2 = new String[] {"0","I","II","III","IV","V","VI","VII","VIII","IX","X",
                "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
                "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
                "XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL",
                "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L",
                "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX",
                "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX",
                "LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX",
                "LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC",
                "XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};

        Scanner sc = new Scanner(System.in);
        String dano = sc.nextLine();
        dano = dano.replaceAll(" ", "");

        if (dano.contains("+")) {
            String[] da = dano.split("\\+");
            String aa = da[0];
            String bb = da[1];
            if (da.length > 2) {
                System.out.print("Вы ввели слишком много чисел!");
            }
            else {
                if (ar.contains(aa) && ar.contains(bb)) {
                    int a = Integer.parseInt(aa);
                    int b = Integer.parseInt(bb);
                    int otvet = a + b;
                    System.out.print(otvet);
                }
                else if (ri.contains(aa) && ri.contains(bb)) {
                    int a = Arrays.asList(rim).indexOf(aa) + 1;
                    int b = Arrays.asList(rim).indexOf(bb) + 1;
                    int otvet = a + b;
                    String perevod = rim2[otvet];
                    System.out.print(perevod);
                }
                else {
                    System.out.print("Вы ввели некорректные данные!");
                }
            }
        }

        else if (dano.contains("-")) {
            String[] da = dano.split("-");
            String aa = da[0];
            String bb = da[1];
            if (da.length > 2) {
                System.out.print("Вы ввели слишком много чисел!");
            }
            else {
                if (ar.contains(aa) && ar.contains(bb)) {
                    int a = Integer.parseInt(aa);
                    int b = Integer.parseInt(bb);
                    int otvet = a - b;
                    System.out.print(otvet);
                }
                else if (ri.contains(aa) && ri.contains(bb)) {
                    int a = Arrays.asList(rim).indexOf(aa) + 1;
                    int b = Arrays.asList(rim).indexOf(bb) + 1;
                    int otvet = a - b;
                    if (otvet >= 1) {
                        String perevod = rim2[otvet];
                        System.out.print(perevod);
                    }
                    else {
                        System.out.print("С римскими цифрами такого не бывает!");
                    }
                }
                else {
                    System.out.print("Вы ввели некорректные данные!");
                }
            }
        }

        else if (dano.contains("*")) {
            String[] da = dano.split("\\*");
            String aa = da[0];
            String bb = da[1];
            if (da.length > 2) {
                System.out.print("Вы ввели слишком много чисел!");
            }
            else {
                if (ar.contains(aa) && ar.contains(bb)) {
                    int a = Integer.parseInt(aa);
                    int b = Integer.parseInt(bb);
                    int otvet = a * b;
                    System.out.print(otvet);
                }
                else if (ri.contains(aa) && ri.contains(bb)) {
                    int a = Arrays.asList(rim).indexOf(aa) + 1;
                    int b = Arrays.asList(rim).indexOf(bb) + 1;
                    int otvet = a * b;
                    String perevod = rim2[otvet];
                    System.out.print(perevod);
                }
                else {
                    System.out.print("Вы ввели некорректные данные!");
                }
            }
        }

        else if (dano.contains("/")) {
            String[] da = dano.split("/");
            String aa = da[0];
            String bb = da[1];
            if (da.length > 2) {
                System.out.print("Вы ввели слишком много чисел!");
            }
            else {
                if (ar.contains(aa) && ar.contains(bb)) {
                    int a = Integer.parseInt(aa);
                    int b = Integer.parseInt(bb);
                    int otvet = a / b;
                    System.out.print(otvet);
                }
                else if (ri.contains(aa) && ri.contains(bb)) {
                    int a = Arrays.asList(rim).indexOf(aa) + 1;
                    int b = Arrays.asList(rim).indexOf(bb) + 1;
                    int otvet = a / b;
                    if (otvet >= 1) {
                        String perevod = rim2[otvet];
                        System.out.print(perevod);
                    }
                    else {
                        System.out.print("С римскими цифрами такого не бывает!");
                    }
                }
                else {
                    System.out.print("Вы ввели некорректные данные!");
                }
            }
        }
        else {
            System.out.print("Вы ввели некорректные данные!");
        }
    }
}

