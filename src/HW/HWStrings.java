package HW;

import java.util.Arrays;
import java.util.Scanner;

public class HWStrings {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        //Даны 2 слова, состоящие из четного числа букв. Получить слово состоящее из первой половины первого слова и второй половины второго слова.
        char[] chars = {'B', 'e', 'a', 'r'};
        char[] chars1 = {'F', 'i', 'r', 'e'};
        String charStr = new String(chars);
        String charStr1 = new String(chars1);
        System.out.println("1. " + charStr);
        System.out.println("2. " + charStr1);
        char[] charsMix = new char[4];
        for (int i = 0; i < 4; i++) {
            if (i < 2) {
                charsMix[i] = chars[i];
            } else {
                charsMix[i] = chars1[i];
            }
        }
        String charMixStr = new String(charsMix);
        System.out.println(charMixStr);

        System.out.println("Задание 2:");
        //Пользователь вводит названия городов через пробел. Вы их присваиваете переменной. Переставьте названия так, чтобы они были упорядочены по алфавиту.
        System.out.println("Введите 5 названий городов:");
        String city;
        String[] cities = new String[5];
        Scanner in = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            System.out.println("Название " + i + "-ого города:");
            city = in.next();
            cities[i - 1] = city;
        }
        System.out.println(Arrays.toString(cities));
        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));

        System.out.println("Задание 3:");
        //Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.
        String sent = "This is a simple sentence";
        String[] mass = sent.split("\\s");
        System.out.println(Arrays.toString(mass));// честно говоря я не понимаю, как выполнить это задание без компаратора, поэтому вывел все ручками
        char[] str1 = mass[0].toCharArray();
        char[] str2 = mass[1].toCharArray();
        char[] str3 = mass[2].toCharArray();
        char[] str4 = mass[3].toCharArray();
        char[] str5 = mass[4].toCharArray();
        if (str1.length > str2.length) {
            if (str1.length > str3.length) {
                if (str1.length > str4.length) {
                    if (str1.length > str5.length) {
                        System.out.println(Arrays.toString(str1));
                    }
                    else {
                        System.out.println(Arrays.toString(str5));
                    }
                }
                else {
                    if (str4.length > str5.length) {
                        System.out.println(Arrays.toString(str4));
                    }
                    else {
                        System.out.println(Arrays.toString(str5));
                    }
                }
            }
            else {
                if (str3.length > str4.length) {
                    if (str3.length > str5.length) {
                        System.out.println(Arrays.toString(str3));
                    }
                }
                else {
                    if (str4.length > str5.length) {
                        System.out.println(Arrays.toString(str4));
                    }
                    else {
                        System.out.println(Arrays.toString(str5));
                    }
                }
            }
        }
        else{
            if (str2.length > str3.length) {
                if (str2.length > str4.length) {
                    if (str2.length > str5.length) {
                        System.out.println(Arrays.toString(str2));
                    }
                }
            }
            else {
                if (str3.length > str4.length) {
                    if (str3.length > str5.length) {
                        System.out.println(Arrays.toString(str3));
                    }
                }
                else {
                    if (str4.length > str5.length) {
                        System.out.println(Arrays.toString(str4));
                    }
                    else {
                        System.out.println(Arrays.toString(str5));
                    }
                }
            }
        }
    }
}
