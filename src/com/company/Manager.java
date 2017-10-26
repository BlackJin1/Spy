package com.company;

import java.io.*;
import java.util.ArrayList;

/**
 * Класс для обработки данных
 * Created by knyazev.v on 26.10.2017.
 */
public class Manager {
    private String filePath;
    private ArrayList<ArrayLogPass> arrayLogPasses;
    Manager() {
    }

    public Manager(String filePath) {
        this.filePath = filePath;
    }
    void processData(String filePath){
        File file = new File(filePath);
        if (file.isFile()){
            // Обработать файл
            arrayLogPasses = processFile(file);
        }else {
            // Обработать директори
            arrayLogPasses = processDir(file);
        }
    }
    private ArrayList<ArrayLogPass> processFile(File file){
        // Прочитать данные из файла и обработать
        try (FileInputStream stream = new FileInputStream(file)){
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            String strLine;
            while ((strLine = reader.readLine()) != null){
                System.out.println(strLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private ArrayList<ArrayLogPass> processDir(File file){

        return null;
    }
}
