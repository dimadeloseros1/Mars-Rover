package org.example.Actions;

import org.example.Enums.InstructionsVals;
import org.example.Parsers.InputParser;

public class GameManager {

    public PlateauSize plateauSize() {
        PlateauSize plateau;
        do {
            try {
                var roverInput = ConsoleIO.plateauInput("Please enter the plateau size: ");
                plateau = InputParser.plateauSizeParser(roverInput);
                System.out.println("Plateau size accepted: " + plateau);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        return plateau;
    }

    public Position vehicle(PlateauSize plateau) {
        Position roverPosition;
        do {
            try {
                var roverLandingInput = ConsoleIO.plateauInput("Please enter the rover's landing position: ");
                roverPosition = InputParser.positionParser(roverLandingInput);

                if (roverPosition.getX() <= plateau.getX() && roverPosition.getY() <= plateau.getY()) {
                    System.out.println("Rover landed at: " + roverPosition.getX() + " " + roverPosition.getY() + " " + roverPosition.getFacing());
                    break;
                } else {
                    System.out.println("Rover position out of bounds. Please enter a valid position.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        return roverPosition;
    }

    public void roverInstr(Position roverCurrPosition, PlateauSize plateau) {
        Rover rover = new Rover(roverCurrPosition.getFacing(), roverCurrPosition);

        String instructions;
        do  {
            try {
                instructions = ConsoleIO.roverInstructionInput("Please enter the movement instructions: ");
                var instructionList = InputParser.instructionParser(instructions);

                for (InstructionsVals instruction : instructionList) {
                    switch (instruction) {
                        case L -> rover.turnLeft();
                        case R -> rover.turnRight();
                        case M -> rover.move();
                    }
                }

                Position position = rover.getPosition();
                if (position.getX() <= plateau.getX() && position.getY() <= plateau.getY()) {
                    System.out.println("Rover has moved to: " + position.getX() + " " + position.getY() + " " + position.getFacing());
                } else {
                    System.out.println("Rover moved out of bounds.");
                }

                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}


