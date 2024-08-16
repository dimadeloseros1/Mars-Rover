package org.example.Actions;

import org.example.Enums.CompassDirection;
import org.example.Enums.InstructionsVals;

public class ConsoleIO {

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
