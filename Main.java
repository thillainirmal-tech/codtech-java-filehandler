package com.codtech;
import java.io.*;
import java.util.Scanner;

public class Main {

    // Method to write text to a file
    public static void writeToFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    // Method to read content from a file
    public static void readFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("File content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    // Method to modify content in a file by appending new text
    public static void modifyFile(String filename, String contentToAppend) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(contentToAppend);
            System.out.println("Content appended to the file successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while modifying the file: " + e.getMessage());
        }
    }

    // Main method to demonstrate file operations
    public static void main(String[] args) {
        String filename = "sample.txt"; // Specify the file name
        
        // Write content to the file
        String contentToWrite = "Apple is red color\n";
        writeToFile(filename, contentToWrite);

        // Read and display the content of the file
        readFromFile(filename);

        // Modify the file by appending additional content
        String contentToAppend = "and it is one healthy food";
        modifyFile(filename, contentToAppend);

        // Read and display the modified content of the file
        readFromFile(filename);
    }
}

