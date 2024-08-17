package org.example.ParserTests;

import org.example.Actions.PlateauSize;
import org.example.Actions.Position;
import org.example.Enums.CompassDirection;
import org.example.Enums.InstructionsVals;
import org.example.Parsers.InputParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ParserTest {

    InputParser parser;

    @BeforeEach
    public void parser() {
        parser = new InputParser();
    }


    @Test
    @DisplayName("Testing for correct plateau size")
    public void testValidPlateauSize() {
        var expectedOutput = InputParser.plateauSizeParser("5 5");
        var expectedInput = new PlateauSize(5, 5);

        assertEquals(expectedOutput.getX(), expectedInput.getX());
        assertEquals(expectedOutput.getY(), expectedInput.getY());
    }

    @Test
    @DisplayName("Testing for incorrect plateau size")
    public void testInvalidPlateauSize() {
        Executable executable = () -> InputParser.plateauSizeParser("4 5");

        assertThrows(IllegalArgumentException.class, executable, "Expected IllegalArgumentException for out-of-range input.");
    }

    @Test
    @DisplayName("Testing for correct position")
    public void testValidCompassDirection() {

        var input = InputParser.positionParser("2 3 S");
        var expectedOutput = new Position(2, 3, CompassDirection.S);

        assertEquals(expectedOutput.getX(), input.getX());
        assertEquals(expectedOutput.getY(), input.getY());
        assertEquals(expectedOutput.getFacing(), input.getFacing());
    }

    @Test
    @DisplayName("Testing for invalid position")
    public void testsInvalidCompassDirection() {

        var input = InputParser.positionParser("2 3 w");
        var expectedOutput = new Position(4, 2, CompassDirection.S);

        assertNotEquals(expectedOutput.getX(), input.getX());
        assertNotEquals(expectedOutput.getY(), input.getY());
        assertNotEquals(expectedOutput.getFacing(), input.getFacing());
    }

    @Test
    @DisplayName("Testing if the compass is only E, S, W or N")
    public void testsInvalidCompassDirectionInvalidData() {
        Executable executable = () -> InputParser.positionParser("2 6 z");

        assertThrows(IllegalArgumentException.class, executable, "IllegalArgumentException");
    }

    @Test
    @DisplayName("This test tests for invalid instructions")
    public void testInvalidInstructionParserIsIncorrect() {
        var input = InputParser.instructionParser("ll");

        ArrayList<InstructionsVals> expectedOutput = new ArrayList<>();
        expectedOutput.add(InstructionsVals.L);
        expectedOutput.add(InstructionsVals.M);


        assertNotEquals(expectedOutput, input);
    }

    @Test
    @DisplayName("This test tests for valid instructions")
    public void testValidInstructionParserIsCorrect() {
        var input = InputParser.instructionParser("llrm");
        ArrayList<InstructionsVals> expectedOutput = new ArrayList<>();

        expectedOutput.add(InstructionsVals.L);
        expectedOutput.add(InstructionsVals.L);
        expectedOutput.add(InstructionsVals.R);
        expectedOutput.add(InstructionsVals.M);


        assertEquals(expectedOutput, input);
    }
}
