/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab_task_03_pan;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author cse
 */
public class Lab_task_03_pan {

    public static void main(String[] args) {

        String fileOne, fileTwo, fileThree, line, content = "";
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Name of First File: ");
        fileOne = scan.nextLine();
        System.out.print("Enter the Name of Second File: ");
        fileTwo = scan.nextLine();
        System.out.print("Enter the Name of Third File: ");
        fileThree = scan.nextLine();
        try {
            FileReader frOne = new FileReader(fileOne);
            BufferedReader brOne = new BufferedReader(frOne);
            FileReader frTwo = new FileReader(fileTwo);
            BufferedReader brTwo = new BufferedReader(frTwo);

            for (line = brOne.readLine(); line != null; line = brOne.readLine())
                content = content + line + "\n";
            brOne.close();

            for (line = brTwo.readLine(); line != null; line = brTwo.readLine())
                content = content + line + "\n";
            brTwo.close();

            try {
                FileWriter fw = new FileWriter(fileThree, true);
                fw.write(content);
                fw.close();
                System.out.println("\nSuccessfully merged the content of two files into the third file");
            } catch (IOException ioe) {
                System.out.println("\nSomething went wrong!");
                System.out.println("Exception: " + ioe);
            }
        } catch (IOException ioe) {
            System.out.println("\nSomething went wrong!");
            System.out.print("Exception: " + ioe);
        }
    }
}
