package com.company;

public class Main {

    public static void main(String[] args) {
        String fileParh = "D:\\Роман\\Ресурсы";
        String dirResult = "D:\\Роман\\Результаты\\";
        Manager manager = new Manager(dirResult);
        manager.processData(fileParh);
    }
}
