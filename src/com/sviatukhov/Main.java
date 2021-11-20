package com.sviatukhov;

public class Main {

    /*
1) Электронные часы показывают время в формате от 00:00 до 23:59.
Подсчитать сколько раз за сутки случается так,
что слева от двоеточия показывается симметричная комбинация для той,
что справа от двоеточия (например, 02:20, 11:11 или 15:51).
    */

    public static void main(String[] args) {
        String hours[] = new String[24];
        for (int i = 0; i < hours.length; i++) {
            if (i < 10) {
                hours[i] = "0" + i;
            } else hours[i] = "" + i;
        }

        String minutes[] = new String[60];
        for (int i = 0; i < minutes.length; i++) {
            if (i < 10) {
                minutes[i] = "0" + i;
            } else minutes[i] = "" + i;
        }

        String hoursReverse[] = new String[hours.length];
        for (int i = 0; i < hours.length; i++) {
            hoursReverse[i] = new StringBuilder(hours[i]).reverse().toString();
        }

        int count = 0;
        for (int i = 0; i < hoursReverse.length; i++) {
            for (int j = 0; j < minutes.length; j++) {
                if (hoursReverse[i].equals(minutes[j])) {
                    count++;
                }
            }
        }
        System.out.println("Count of symmetrical is " + count);
    }
}

class task2 {

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