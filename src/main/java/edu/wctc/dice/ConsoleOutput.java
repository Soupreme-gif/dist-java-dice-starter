package edu.wctc.dice;


public class ConsoleOutput implements IConsoleOutput {

    @Override
    public void output(String text) {
        System.out.println(text);
    }
}
