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
        String[] plateauLocation = input.split(" ");

        if (plateauLocation.length != 2) {
            throw new IllegalArgumentException();
        }

//        try {
            int xCord = Integer.parseInt(plateauLocation[0]);
            int yCord = Integer.parseInt(plateauLocation[1]);

//            if (xCord <= 0 || yCord <= 0 || xCord > 10 || yCord > 10) {
//                throw new ArrayIndexOutOfBoundsException("Please input plateau size greater than 0 and less than 10");
//            } else {
//            }

//        } catch (ArrayIndexOutOfBoundsException exc) {
//            throw new IllegalArgumentException("Invalid input");
//        }
                return new PlateauSize(xCord, yCord);

    }

    public static Position positionParser(String input) {
        String[] roverPosition = input.split(" ");

        int firstParam = Integer.parseInt(roverPosition[0]);
        int secondParam = Integer.parseInt(roverPosition[1]);
        var thirdParam = CompassDirection.valueOf(roverPosition[2].toUpperCase(Locale.ROOT));

        return new Position(firstParam, secondParam, thirdParam);
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
