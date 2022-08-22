package edu.wctc.dice;


import java.util.Scanner;


public class ConsoleInput {
    private Scanner scanner = new Scanner(System.in);

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
