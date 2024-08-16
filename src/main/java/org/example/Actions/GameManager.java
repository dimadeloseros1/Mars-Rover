package org.example.Actions;

import org.example.Enums.CompassDirection;
import org.example.Enums.InstructionsVals;

import java.util.List;

public class GameManager {

    public CompassDirection rotate(CompassDirection direction, List<InstructionsVals> instructions) {
        var compassDirection = direction;

        for (InstructionsVals instr : instructions) {
            switch (compassDirection) {
                case N:
                    if (instr == InstructionsVals.R) {
                        direction = CompassDirection.E;
                        System.out.println("You are currently on EAST");
                    } else if (instr == InstructionsVals.L) {
                        direction = CompassDirection.W;
                        System.out.println("You are currently on WEST");
                    }
                    break;

                case S:
                    if (instr == InstructionsVals.R) {
                        direction = CompassDirection.W;
                        System.out.println("You are currently on WEST");
                    } else if (instr == InstructionsVals.L) {
                        direction = CompassDirection.E;
                        System.out.println("You are currently on EAST");
                    }
                    break;

                case E:
                    if (instr == InstructionsVals.R) {
                        direction = CompassDirection.S;
                    } else if (instr == InstructionsVals.L) {
                        direction = CompassDirection.N;
                    }
                    break;

                case W:
                    if (instr == InstructionsVals.R) {
                        direction = CompassDirection.N;
                    } else if (instr == InstructionsVals.L) {
                        direction = CompassDirection.S;
                    }
                    break;
            }
        }
        return direction;
    }
}
