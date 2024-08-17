package org.example.Parsers;

import org.example.Actions.PlateauSize;
import org.example.Actions.Position;
import org.example.Enums.CompassDirection;
import org.example.Enums.InstructionsVals;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class InputParser {


    public static PlateauSize plateauSizeParser(String input) {
        String[] splittingStr = input.split(" ");

        if (splittingStr.length > 2) {
            throw new IllegalArgumentException();
        }

        try {

            int xCord = Integer.parseInt(splittingStr[0]);
            int yCord = Integer.parseInt(splittingStr[1]);

            if (xCord == yCord && xCord >= 0 && xCord <= 10) {
                return new PlateauSize(xCord, yCord);
            } else {
                throw new IllegalArgumentException("Coordinates must be between 0 and 10 and be equal");
            }

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number format. Please enter integers.");
        }
    }

    public static Position positionParser(String input) {
        String[] splitting = input.split(" ");
        if (splitting.length != 3) {
            throw new ArrayIndexOutOfBoundsException();
        }

        try {
            int xCord = Integer.parseInt(splitting[0]);
            int yCord = Integer.parseInt(splitting[1]);
            var compassDirection = CompassDirection.valueOf(splitting[2].toUpperCase(Locale.ROOT));

            if (xCord < 0 || yCord < 0 || xCord > 10 || yCord > 10) {
                throw new IllegalArgumentException("Make sure to input equal coordinates and Compass direction to be N,S,E or W");
            }

            if (compassDirection != CompassDirection.W && compassDirection != CompassDirection.N && compassDirection != CompassDirection.S && compassDirection != CompassDirection.E) {
                throw new IllegalArgumentException("Compass direction must be either N,W,E or S");
            }
            return new Position(xCord, yCord, compassDirection);


        } catch (IllegalArgumentException exc) {
            throw new IllegalArgumentException("Invalid input " + exc.getMessage());
        }
    }

    public static List<InstructionsVals> instructionParser(String input) {
        String[] instructionVals = input.split("");
        ArrayList<InstructionsVals> instructionList = new ArrayList<>();

        for (int i = 0; i < instructionVals.length; i++) {
            var instruction = instructionVals[i].toUpperCase(Locale.ROOT);

            switch (instruction) {
                case "L":
                    instructionList.add(InstructionsVals.L);
                    break;
                case "R":
                    instructionList.add(InstructionsVals.R);
                    break;
                case "M":
                    instructionList.add(InstructionsVals.M);
                    break;
            }
        }
        return instructionList;
    }


}
