package org.example.Actions;

import org.example.Enums.CompassDirection;
import org.example.Enums.InstructionsVals;

public class GameManager {

    public CompassDirection rotate(CompassDirection direction, InstructionsVals instructions) {
        if (direction == CompassDirection.N && instructions == InstructionsVals.R) {
            return CompassDirection.E;
        } else if (direction == CompassDirection.S && instructions == InstructionsVals.L) {
            return CompassDirection.W;
        } else if (direction == CompassDirection.E && instructions == InstructionsVals.R) {
            return CompassDirection.S;
        } else {
            return CompassDirection.N;
        }
    }
}
