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

        if (input.length() != 2) {
            throw new IllegalArgumentException();
        }

        try {
            int xCord = Integer.parseInt(String.valueOf(input.charAt(0)));
            int yCord = Integer.parseInt(String.valueOf(input.charAt(1)));

            return new PlateauSize(xCord, yCord);
        } catch (NumberFormatException e) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static Position positionParser(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException("Make sure that the input is exactly 3 characters long");
        }

        try {
            int firstParam = Integer.parseInt(String.valueOf(input.charAt(0)));
            int secondParam = Integer.parseInt(String.valueOf(input.charAt(1)));
            var thirdParam = CompassDirection.valueOf(String.valueOf(input.charAt(2)).toUpperCase(Locale.ROOT));

            return new Position(firstParam, secondParam, thirdParam);
        } catch (NumberFormatException e) {
            throw new StringIndexOutOfBoundsException();
        }
    }

    public static List<InstructionsVals> instructionParser(String input) {
        String[] instructionVals = input.split("");
        ArrayList<InstructionsVals> instructionList = new ArrayList<>();

        for (int i = 0; i < instructionVals.length; i++) {
            var instruction = instructionVals[i].toUpperCase();

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
