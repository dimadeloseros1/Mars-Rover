package org.example.Actions;

import org.example.Enums.CompassDirection;
import org.example.Enums.InstructionsVals;

import java.util.Scanner;

public class ConsoleIO {


    public static String instructionScanner(String str) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            try {
                System.out.print(str);
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("l") || input.equalsIgnoreCase("r")) {
                    break;
                } else {
                    System.out.println("Please make sure to input either (l) or (r)");
                }
            } catch (IllegalArgumentException ex) {
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
