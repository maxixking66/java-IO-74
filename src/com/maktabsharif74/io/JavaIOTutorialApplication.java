package com.maktabsharif74.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaIOTutorialApplication {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        writeObject();

        readObject();
    }

    private static void readObject() throws IOException, ClassNotFoundException {
        File file = new File("userFile.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User user = (User) objectInputStream.readObject();
        System.out.println("after reading from file:" + user);
        objectInputStream.close();
        fileInputStream.close();
    }

    private static void writeObject() throws IOException {
        File file = new File("userFile.txt");
        FileOutputStream outputStream = new FileOutputStream(file);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        User user = new User("MAT", "123456");
        System.out.println(user);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();
        outputStream.close();
    }

    private static void writeOnFileWithDifferentTypes() throws IOException {
        File file = new File("char-text.txt");
        System.out.println("char-text.txt length: " + file.length());
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(1234567890);
        fileWriter.write(1234567890);
        fileWriter.write(1234567890);
        fileWriter.write(1234567890);
        fileWriter.close();
        System.out.println("char-text.txt length: " + file.length());


        File noCharFile = new File("non-char");
        System.out.println("noCharFile length: " + noCharFile.length());

        FileOutputStream fileOutputStream = new FileOutputStream(noCharFile);
        fileOutputStream.write(1234567890);
        fileOutputStream.write(1234567890);
        fileOutputStream.write(1234567890);
        fileOutputStream.write(1234567890);
        fileOutputStream.close();
        System.out.println("noCharFile length: " + noCharFile.length());
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
