package by.uladzimirmakei.taskone.service.reader.impl;

import by.uladzimirmakei.taskone.service.reader.ReaderAction;

import java.util.Scanner;

public class ConsoleReader implements ReaderAction<String> {

    @Override
    public String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
