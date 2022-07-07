package com.maktabsharif74.io;

import java.io.*;
import java.util.Scanner;

public class JavaIOTutorialApplication {

    public static void main(String[] args) throws IOException {
        readFromFileWithScanner();

    }

    private static void readFromFileWithScanner() throws FileNotFoundException {
        File file = new File("test-char.txt");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    private static void readFileWithFileReader() throws IOException {
        FileReader fileReader = new FileReader("test-char.txt");
        int ch;
        while (-1 != (ch = fileReader.read())) {
            System.out.println((char) ch);
        }
        /*int ch = 0;
        while (ch != -1) {
            ch = fileReader.read();
            if (ch != -1) {
                System.out.println((char) ch);
            }
        }*/

        fileReader.close();
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
