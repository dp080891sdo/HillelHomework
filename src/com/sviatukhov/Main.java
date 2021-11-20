package com.sviatukhov;

public class Main {

    /*
2) Найти количество счастливых билетиков на трамвай от 000001 до 999999 -
 те у которых сумма первых 3 цифр равна сумме последних 3
    */

    public static void main(String[] args) {
        String tramtickets[] = new String[999999];
        for (int i = 0; i < tramtickets.length; i++) {
            if (i >= 0 && i < 10) {
                tramtickets[i] = "00000" + (i + 1);
            } else if (i >= 10 && i < 100) {
                tramtickets[i] = "0000" + (i + 1);
            } else if (i >= 100 && i < 1000) {
                tramtickets[i] = "000" + (i + 1);
            } else if (i >= 1000 && i < 10000) {
                tramtickets[i] = "00" + (i + 1);
            } else if (i >= 10000 && i < 100000) {
                tramtickets[i] = "0" + (i + 1);
            } else tramtickets[i] = "" + (i + 1);
        }

        int count = 0;
        for (int i = 0; i < tramtickets.length; i++) {
            char a1 = tramtickets[i].charAt(0);
            char a2 = tramtickets[i].charAt(1);
            char a3 = tramtickets[i].charAt(2);
            char a4 = tramtickets[i].charAt(3);
            char a5 = tramtickets[i].charAt(4);
            char a6 = tramtickets[i].charAt(5);
            int a11 = Character.getNumericValue(a1);
            int a22 = Character.getNumericValue(a2);
            int a33 = Character.getNumericValue(a3);
            int a44 = Character.getNumericValue(a4);
            int a55 = Character.getNumericValue(a5);
            int a66 = Character.getNumericValue(a6);

            if ((a11 + a22 + a33) == (a44 + a55 + a66)) {
                count++;
            }
        }
        System.out.println(count);
    }
}