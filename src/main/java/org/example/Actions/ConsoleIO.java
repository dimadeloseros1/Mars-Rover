package org.example.Actions;

import org.example.Enums.CompassDirection;
import org.example.Enums.InstructionsVals;
import org.example.Parsers.InputParser;

import java.util.Scanner;

public class ConsoleIO {


    public static String roverInstructionInput(String str) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            try {
                System.out.print(str);
                input = scanner.nextLine();
                if (input.matches("[LRMlrm]+")) {
                    break;
                } else {
                    System.err.println("Please input correct letters");
                }
            } catch (IllegalArgumentException ex) {
                throw new IllegalStateException();
            }
        } while (true);
        scanner.close();
        return input;
    }

    public static String plateauInput(String str) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            try {
                System.out.print(str);
                input = scanner.nextLine();
                if (!input.isEmpty()) {
                    break;
                } else {
                    System.out.println("Make sure that the input is not empty");
                }
            } catch (IllegalArgumentException exc) {
                throw new IllegalStateException();
            }
        } while (true);
        return input;
    }


    public static CompassDirection compassDirection(String input) {
        return switch (input) {
            case "N" -> CompassDirection.N;
            case "S" -> CompassDirection.S;
            case "E" -> CompassDirection.E;
            case "W" -> CompassDirection.W;
            default -> throw new IllegalStateException("Unexpected value: " + input);
        };
    }

    public static InstructionsVals instructionsVals(String input) {
        return switch (input) {
            case "L" -> InstructionsVals.L;
            case "R" -> InstructionsVals.R;
            case "M" -> InstructionsVals.M;
            default -> throw new IllegalStateException("Unexpected value: " + input);
        };
    }

}
