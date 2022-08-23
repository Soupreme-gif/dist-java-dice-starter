package edu.wctc.dice;


import java.util.Scanner;


public class ConsoleInput implements IConsoleInput {
    private Scanner scanner = new Scanner(System.in);



    @Override
    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
