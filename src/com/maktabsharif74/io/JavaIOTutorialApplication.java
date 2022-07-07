package com.maktabsharif74.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaIOTutorialApplication {

    public static void main(String[] args) throws IOException {
        writeOnFile();

    }

    private static void writeOnFile() throws IOException {
        File file = new File("test-char.txt");
        System.out.println("file.length: " + file.length());

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("majid");
        fileWriter.write("asghari zade");
        fileWriter.close();
        System.out.println("file.length: " + file.length());
    }
}
