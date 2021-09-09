
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
                        } else if (ri.contains(aa) && ri.contains(bb)) {

                            int a = Arrays.asList(rim).indexOf(aa) + 1;
                            int b = Arrays.asList(rim).indexOf(bb) + 1;
                            int otvet = a + b;
                            if (otvet >= 1) {
                                if (otvet == 1) {
                                    System.out.print("I");
                                } else if (otvet == 2) {
                                    System.out.print("II");
                                } else if (otvet == 3) {
                                    System.out.print("III");
                                } else if (otvet == 4) {
                                    System.out.print("IV");
                                } else if (otvet == 5) {
                                    System.out.print("V");
                                } else if (otvet == 6) {
                                    System.out.print("VI");
                                } else if (otvet == 7) {
                                    System.out.print("VII");
                                } else if (otvet == 8) {
                                    System.out.print("VIII");
                                } else if (otvet == 9) {
                                    System.out.print("IX");
                                } else if (otvet == 10) {
                                    System.out.print("X");
                                } else if (otvet == 11) {
                                    System.out.print("XI");
                                } else if (otvet == 12) {
                                    System.out.print("XII");
                                } else if (otvet == 13) {
                                    System.out.print("XIII");
                                } else if (otvet == 14) {
                                    System.out.print("XIV");
                                } else if (otvet == 15) {
                                    System.out.print("XV");
                                } else if (otvet == 16) {
                                    System.out.print("XVI");
                                } else if (otvet == 17) {
                                    System.out.print("XVII");
                                } else if (otvet == 18) {
                                    System.out.print("XVIII");
                                } else if (otvet == 19) {
                                    System.out.print("XIX");
                                } else if (otvet == 20) {
                                    System.out.print("XX");
                                }

                            } else {
                                System.out.print("С римскими цифрами такого не бывает!");
                            }
                        } else {
                            System.out.print("Вы ввели некорректные данные!");
                        }
                    }
                }


                else if (dano.contains("-")) {
                    String[] da = dano.split("\\-");
                    String aa = da[0];
                    String bb = da[1];
                    if (da.length > 2) {
                        System.out.print("Вы ввели слишком много чисел!");
                    } else {

                        if (ar.contains(aa) && ar.contains(bb)) {
                            int a = Integer.parseInt(aa);
                            int b = Integer.parseInt(bb);
                            int otvet = a - b;
                            System.out.print(otvet);
                        } else if (ri.contains(aa) && ri.contains(bb)) {

                            int a = Arrays.asList(rim).indexOf(aa) + 1;
                            int b = Arrays.asList(rim).indexOf(bb) + 1;
                            int otvet = a - b;
                            if (otvet >= 1) {
                                if (otvet == 1) {
                                    System.out.print("I");
                                } else if (otvet == 2) {
                                    System.out.print("II");
                                } else if (otvet == 3) {
                                    System.out.print("III");
                                } else if (otvet == 4) {
                                    System.out.print("IV");
                                } else if (otvet == 5) {
                                    System.out.print("V");
                                } else if (otvet == 6) {
                                    System.out.print("VI");
                                } else if (otvet == 7) {
                                    System.out.print("VII");
                                } else if (otvet == 8) {
                                    System.out.print("VIII");
                                } else if (otvet == 9) {
                                    System.out.print("IX");
                                }

                            } else {
                                System.out.print("С римскими цифрами такого не бывает!");
                            }
                        } else {
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
                    } else {

                        if (ar.contains(aa) && ar.contains(bb)) {
                            int a = Integer.parseInt(aa);
                            int b = Integer.parseInt(bb);
                            int otvet = a * b;
                            System.out.print(otvet);
                        } else if (ri.contains(aa) && ri.contains(bb)) {

                            int a = Arrays.asList(rim).indexOf(aa) + 1;
                            int b = Arrays.asList(rim).indexOf(bb) + 1;
                            int otvet = a * b;
                            if (otvet >= 1) {
                                if (otvet == 1) {
                                    System.out.print("I");
                                } else if (otvet == 2) {
                                    System.out.print("II");
                                } else if (otvet == 3) {
                                    System.out.print("III");
                                } else if (otvet == 4) {
                                    System.out.print("IV");
                                } else if (otvet == 5) {
                                    System.out.print("V");
                                } else if (otvet == 6) {
                                    System.out.print("VI");
                                } else if (otvet == 7) {
                                    System.out.print("VII");
                                } else if (otvet == 8) {
                                    System.out.print("VIII");
                                } else if (otvet == 9) {
                                    System.out.print("IX");
                                } else if (otvet == 10) {
                                    System.out.print("X");
                                } else if (otvet == 11) {
                                    System.out.print("XI");
                                } else if (otvet == 12) {
                                    System.out.print("XII");
                                } else if (otvet == 13) {
                                    System.out.print("XIII");
                                } else if (otvet == 14) {
                                    System.out.print("XIV");
                                } else if (otvet == 15) {
                                    System.out.print("XV");
                                } else if (otvet == 16) {
                                    System.out.print("XVI");
                                } else if (otvet == 17) {
                                    System.out.print("XVII");
                                } else if (otvet == 18) {
                                    System.out.print("XVIII");
                                } else if (otvet == 19) {
                                    System.out.print("XIX");
                                } else if (otvet == 20) {
                                    System.out.print("XX");
                                } else if (otvet == 21) {
                                    System.out.print("XXI");
                                } else if (otvet == 22) {
                                    System.out.print("XXII");
                                } else if (otvet == 23) {
                                    System.out.print("XXIII");
                                } else if (otvet == 24) {
                                    System.out.print("XXIV");
                                } else if (otvet == 25) {
                                    System.out.print("XXV");
                                } else if (otvet == 26) {
                                    System.out.print("XXVI");
                                } else if (otvet == 27) {
                                    System.out.print("XXVII");
                                } else if (otvet == 28) {
                                    System.out.print("XXVIII");
                                } else if (otvet == 29) {
                                    System.out.print("XXIX");
                                } else if (otvet == 30) {
                                    System.out.print("XXX");
                                } else if (otvet == 31) {
                                    System.out.print("XXXI");
                                } else if (otvet == 32) {
                                    System.out.print("XXXII");
                                } else if (otvet == 33) {
                                    System.out.print("XXXIII");
                                } else if (otvet == 34) {
                                    System.out.print("XXXIV");
                                } else if (otvet == 35) {
                                    System.out.print("XXXV");
                                } else if (otvet == 36) {
                                    System.out.print("XXXVI");
                                } else if (otvet == 37) {
                                    System.out.print("XXXVII");
                                } else if (otvet == 38) {
                                    System.out.print("XXXVIII");
                                } else if (otvet == 39) {
                                    System.out.print("XXXIX");
                                } else if (otvet == 40) {
                                    System.out.print("XL");
                                } else if (otvet == 41) {
                                    System.out.print("XLI");
                                } else if (otvet == 42) {
                                    System.out.print("XLII");
                                } else if (otvet == 43) {
                                    System.out.print("XLIII");
                                } else if (otvet == 44) {
                                    System.out.print("XLIV");
                                } else if (otvet == 45) {
                                    System.out.print("XLV");
                                } else if (otvet == 46) {
                                    System.out.print("XLVI");
                                } else if (otvet == 47) {
                                    System.out.print("XLVII");
                                } else if (otvet == 48) {
                                    System.out.print("XLVIII");
                                } else if (otvet == 49) {
                                    System.out.print("XLIX");
                                } else if (otvet == 50) {
                                    System.out.print("L");
                                } else if (otvet == 51) {
                                    System.out.print("LI");
                                } else if (otvet == 52) {
                                    System.out.print("LII");
                                } else if (otvet == 53) {
                                    System.out.print("LIII");
                                } else if (otvet == 54) {
                                    System.out.print("LIV");
                                } else if (otvet == 55) {
                                    System.out.print("LV");
                                } else if (otvet == 56) {
                                    System.out.print("LVI");
                                } else if (otvet == 57) {
                                    System.out.print("LVII");
                                } else if (otvet == 58) {
                                    System.out.print("LVIII");
                                } else if (otvet == 59) {
                                    System.out.print("LIX");
                                } else if (otvet == 60) {
                                    System.out.print("LX");
                                } else if (otvet == 61) {
                                    System.out.print("LXI");
                                } else if (otvet == 62) {
                                    System.out.print("LXII");
                                } else if (otvet == 63) {
                                    System.out.print("LXIII");
                                } else if (otvet == 64) {
                                    System.out.print("LXIV");
                                } else if (otvet == 65) {
                                    System.out.print("LXV");
                                } else if (otvet == 66) {
                                    System.out.print("LXVI");
                                } else if (otvet == 67) {
                                    System.out.print("LXVII");
                                } else if (otvet == 68) {
                                    System.out.print("LXVIII");
                                } else if (otvet == 69) {
                                    System.out.print("LXIX");
                                } else if (otvet == 70) {
                                    System.out.print("LXX");
                                } else if (otvet == 71) {
                                    System.out.print("LXXI");
                                } else if (otvet == 72) {
                                    System.out.print("LXXII");
                                } else if (otvet == 73) {
                                    System.out.print("LXXIII");
                                } else if (otvet == 74) {
                                    System.out.print("LXXIV");
                                } else if (otvet == 75) {
                                    System.out.print("LXXV");
                                } else if (otvet == 76) {
                                    System.out.print("LXXVI");
                                } else if (otvet == 77) {
                                    System.out.print("LXXVII");
                                } else if (otvet == 78) {
                                    System.out.print("LXXVIII");
                                } else if (otvet == 79) {
                                    System.out.print("LXXIX");
                                } else if (otvet == 80) {
                                    System.out.print("LXXX");
                                } else if (otvet == 81) {
                                    System.out.print("LXXXI");
                                } else if (otvet == 82) {
                                    System.out.print("LXXXII");
                                } else if (otvet == 83) {
                                    System.out.print("LXXXIII");
                                } else if (otvet == 84) {
                                    System.out.print("LXXXIV");
                                } else if (otvet == 85) {
                                    System.out.print("LXXXV");
                                } else if (otvet == 86) {
                                    System.out.print("LXXXVI");
                                } else if (otvet == 87) {
                                    System.out.print("LXXXVII");
                                } else if (otvet == 88) {
                                    System.out.print("LXXXVIII");
                                } else if (otvet == 89) {
                                    System.out.print("LXXXIX");
                                } else if (otvet == 90) {
                                    System.out.print("XC");
                                } else if (otvet == 91) {
                                    System.out.print("XCI");
                                } else if (otvet == 92) {
                                    System.out.print("XCII");
                                } else if (otvet == 93) {
                                    System.out.print("XCIII");
                                } else if (otvet == 94) {
                                    System.out.print("XCIV");
                                } else if (otvet == 95) {
                                    System.out.print("XCV");
                                } else if (otvet == 96) {
                                    System.out.print("XCVI");
                                } else if (otvet == 97) {
                                    System.out.print("XCVII");
                                } else if (otvet == 98) {
                                    System.out.print("XCVIII");
                                } else if (otvet == 99) {
                                    System.out.print("XCIX");
                                } else if (otvet == 100) {
                                    System.out.print("C");
                                }


                            } else {
                                System.out.print("С римскими цифрами такого не бывает!");
                            }
                        } else {
                            System.out.print("Вы ввели некорректные данные!");
                        }
                    }
                }

                else if (dano.contains("/")) {
                    String[] da = dano.split("\\/");
                    String aa = da[0];
                    String bb = da[1];
                    if (da.length > 2) {
                        System.out.print("Вы ввели слишком много чисел!");
                    } else {

                        if (ar.contains(aa) && ar.contains(bb)) {
                            int a = Integer.parseInt(aa);
                            int b = Integer.parseInt(bb);
                            int otvet = a / b;
                            System.out.print(otvet);
                        } else if (ri.contains(aa) && ri.contains(bb)) {

                            int a = Arrays.asList(rim).indexOf(aa) + 1;
                            int b = Arrays.asList(rim).indexOf(bb) + 1;
                            int otvet = a / b;
                            if (otvet >= 1) {
                                if (otvet == 1) {
                                    System.out.print("I");
                                } else if (otvet == 2) {
                                    System.out.print("II");
                                } else if (otvet == 3) {
                                    System.out.print("III");
                                } else if (otvet == 4) {
                                    System.out.print("IV");
                                } else if (otvet == 5) {
                                    System.out.print("V");
                                } else if (otvet == 6) {
                                    System.out.print("VI");
                                } else if (otvet == 7) {
                                    System.out.print("VII");
                                } else if (otvet == 8) {
                                    System.out.print("VIII");
                                } else if (otvet == 9) {
                                    System.out.print("IX");
                                } else if (otvet == 10) {
                                    System.out.print("X");
                                }
                            } else {
                                System.out.print("С римскими цифрами такого не бывает!");
                            }
                        } else {
                            System.out.print("Вы ввели некорректные данные!");
                        }
                    }
                }
                else {
                    System.out.print("Вы ввели некорректные данные!");
                }

            }
        }


