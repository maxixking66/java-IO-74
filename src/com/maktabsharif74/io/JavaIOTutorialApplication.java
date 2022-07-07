package com.maktabsharif74.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaIOTutorialApplication {

    public static void main(String[] args) throws IOException {

    }

    private static void readAndWriteByte() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("file");
        fileOutputStream.write(123456789);
        fileOutputStream.close();

        List<Byte> byteList = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream("file");
        int byteCode;
        while (-1 != (byteCode = fileInputStream.read())) {
            byteList.add((byte) byteCode);
        }
        fileInputStream.close();
        System.out.println(byteList);
    }

    private static void readFromFileWithScanner() throws FileNotFoundException {
        File file = new File("test-char.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
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
