package org.example.RoverMovement;

import org.example.Actions.GameManager;
import org.example.Actions.Position;
import org.example.Actions.Rover;
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
    public void testRoverTurnLeft() {
        var rover = new Rover(CompassDirection.N, new Position(2, 2, CompassDirection.N));

        rover.turnLeft();
        assertEquals(CompassDirection.W, rover.getFacing(), "Rover is facing WEST after turning left from North");

        rover.turnLeft();
        assertEquals(CompassDirection.S, rover.getFacing(), "Rover should face SOUTH after turning left from West");
    }

    @Test
    @DisplayName("This method will check for invalid compass direction")
    public void testRoverTurnRight() {
        var rover = new Rover(CompassDirection.N, new Position(2, 2, CompassDirection.N));

        rover.turnRight();
        assertEquals(CompassDirection.N, rover.getFacing(), "Rover should face NORTH after turning right from West");

        rover.turnRight();
        assertEquals(CompassDirection.S, rover.getFacing(), "Rover should face South after turning right from East");

    }

}
