package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File input = new File("Input.txt");

        try (Scanner scan = new Scanner(input)) {
            while (scan.hasNextLine()) {
                String buf = scan.nextLine();
                System.out.println(buf.replaceAll("([A-Za-z])\\1+", "$1"));
            }
        }
        catch (FileNotFoundException exp) {
            System.out.println("No such file found!");
        }
    }
}
