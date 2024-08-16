package org.example.RoverMovement;

import org.example.Enums.CompassDirection;
import org.example.Enums.InstructionsVals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoverRotation {



    @Test
    @DisplayName("This method will check whether the rover rotation works accordingly")
    public void RoverMovementValidDirection() {
        var rover = new Rover();
        var roverMovement = rover.rotate(CompassDirection.N, InstructionsVals.R);

        assertEquals(CompassDirection.E, roverMovement);
    }

    @Test
    @DisplayName("This method will check for invalid compass direction")
    public void RoverMovementInvalidDirection() {
        var rover = new Rover();
        var roverMovement = rover.rotate(CompassDirection.N, InstructionsVals.R);

        assertNotEquals(CompassDirection.S, roverMovement);
    }

}
