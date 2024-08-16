package org.example.RoverMovement;

import org.example.Actions.GameManager;
import org.example.Enums.CompassDirection;
import org.example.Enums.InstructionsVals;
import org.example.Parsers.InputParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoverRotation {



    @Test
    @DisplayName("This method will check whether the rover rotation works accordingly")
    public void RoverMovementValidDirection() {
        var rover = new GameManager();
        var movingLeft = InputParser.instructionParser("l");
        var movingRight = InputParser.instructionParser("r");

        var onNorthAndMovingLeft = rover.rotate(CompassDirection.N, movingLeft);
        var onEastAndMovingRight = rover.rotate(CompassDirection.E, movingRight);

        assertEquals(CompassDirection.W, onNorthAndMovingLeft);
        assertEquals(CompassDirection.S, onEastAndMovingRight);
    }

    @Test
    @DisplayName("This method will check for invalid compass direction")
    public void RoverMovementInvalidDirection() {
        var rover = new GameManager();
        var instructionParser = InputParser.instructionParser("l");

        var roverMovement = rover.rotate(CompassDirection.N, instructionParser);

        assertNotEquals(CompassDirection.E, roverMovement);
        assertNotEquals(CompassDirection.N, roverMovement);
        assertNotEquals(CompassDirection.S, roverMovement);
    }

}
