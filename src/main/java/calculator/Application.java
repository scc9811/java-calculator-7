package calculator;

import calculator.controller.StringAdderController;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        new StringAdderController().run();
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        String s = scanner.nextLine();
        System.out.println("s = " + s);
        if(s == null) {
            System.out.println("isNUll");
        }
        if(s.equals("")) {
            System.out.println("isEmpty");
        }
        if(s.isEmpty()) {
            System.out.println("!!!!");
        }
        if(s.isBlank()) {
            System.out.println("~~");
        }
        for(int i=0; i<s.length(); i++) {
            System.out.println("c = " + s.charAt(i));
        }

    }
}
