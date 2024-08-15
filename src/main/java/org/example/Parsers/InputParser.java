package org.example.Parsers;

import org.example.Actions.PlateauSize;
import org.example.Actions.Position;
import org.example.Enums.CompassDirection;

public class InputParser {


    public static PlateauSize plateauSizeParser(String input) {
        String[] plateauLocation = input.split(" ");

        if (plateauLocation.length > 2) {
            throw new IllegalArgumentException();
        }

        int xCord = Integer.parseInt(plateauLocation[0]);
        int yCord = Integer.parseInt(plateauLocation[1]);

        if (xCord > 0 && yCord > 0 && xCord <= 10 && yCord <= 10) {
            return new PlateauSize(xCord, yCord);
        } else {
            throw new ArrayIndexOutOfBoundsException("Please input plateau size greater than 0 and less than 6");
        }
    }

    public static Position positionParser(String input) {
        String[] roverPosition = input.split(" ");

        if (roverPosition.length > 3) {
            throw new IllegalArgumentException();
        }

        int firstParam = Integer.parseInt(roverPosition[0]);
        int secondParam = Integer.parseInt(roverPosition[1]);
        CompassDirection thirdParam = Enum.valueOf(CompassDirection.class);
    }


}
