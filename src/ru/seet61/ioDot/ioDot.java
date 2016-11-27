package ru.seet61.ioDot;

import java.io.Console;
import java.io.IOException;

/**
 * Задача:
 * Напишите программу, которая считывает символы пока не встретится точка. Также предусмотрите вывод количества пробелов.
 *
 * Считываться будуть строки из System.console.
 * Считаются проблемы между словами.
 * Если в троке встречается точка, то это приводит к завершению.
 *
 * Created by dmitry.arefyev on 27.11.2016.
 */
public class ioDot {
    public static void main(String[] args) throws IOException{
        //Подключаемся к консоли.
        Console c = System.console();
        if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }

        String string = null;

        //Читаем с консоли
        while (true) {
            string = c.readLine("Enter text: ");
            System.out.println("Length: " + string.length());
            if (string.length()>0)
                analizeString(string);
        }
    }

    /**
     * Анализируем строку
     * @param string
     */
    private static void analizeString(String string) {
        //Удаляем пробелы в начале и конце строки, при необходимости.
        //string = string.trim();
        //Разделяем по пробелам
        String[] words = string.split(" ");
        System.out.println("Words: " + words.length);
        System.out.println("Spaces: " + (words.length-1));
        if (string.contains(".")) {
            System.out.println("Dot in string");
            System.exit(0);
        }
    }
}
