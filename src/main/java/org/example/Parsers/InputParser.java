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

            int firstParam = Integer.parseInt(splitting[0]);
            int secondParam = Integer.parseInt(splitting[1]);
            var thirdParam = CompassDirection.valueOf(splitting[2].toUpperCase(Locale.ROOT));

            return new Position(firstParam, secondParam, thirdParam);
        } catch (IllegalArgumentException exc) {
            throw new IllegalArgumentException();
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
