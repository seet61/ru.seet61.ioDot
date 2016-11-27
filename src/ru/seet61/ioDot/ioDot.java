package ru.seet61.ioDot;

import java.io.Console;
import java.io.IOException;

/**
 * Задача:
 * Напишите программу, которая считывает символы пока не встретится точка. Также предусмотрите вывод количества пробелов.
 *
 * Считываться будуть строки из System.console и анализироваться по символьно.
 *
 * Created by dmitry.arefyev on 27.11.2016.
 */
public class ioDot {
    public static void main(String[] args) throws IOException{
        Console c = System.console();
        if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }
    }
}
