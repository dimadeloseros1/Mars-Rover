package org.example;

import org.example.Actions.PlateauSize;
import org.example.Actions.Position;
import org.example.Enums.CompassDirection;
import org.example.Enums.InstructionsVals;
import org.example.Parsers.InputParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ParserTest {

    InputParser parser;

    @BeforeEach
    public void parser() {
        parser = new InputParser();
    }


    @Test
    @DisplayName("Testing for incorrect plateau size")
    public void testPlateauSize() {
        var expectedOutput = InputParser.plateauSizeParser("55");
        var expectedInput = new PlateauSize(5,5);

        assertEquals(expectedOutput.getX(), expectedInput.getX());
        assertEquals(expectedOutput.getY(), expectedInput.getY());
    }

    @Test
    @DisplayName("Testing for correct position")
    public void testsCorrectCompassDirection() {

        var input = InputParser.positionParser("23s");
        var expectedOutput = new Position(2,3, CompassDirection.S);

        assertEquals(expectedOutput.getX(), input.getX());
        assertEquals(expectedOutput.getY(), input.getY());
        assertEquals(expectedOutput.getFacing(), input.getFacing());
    }

    @Test
    @DisplayName("This test tests if the input does not equal to what we have in the array list")
    public void testInstructionParserIsIncorrect() {
        var input = InputParser.instructionParser("ll");

        ArrayList<InstructionsVals> expectedOutput = new ArrayList<>();
        expectedOutput.add(InstructionsVals.L);
        expectedOutput.add(InstructionsVals.M);


        assertNotEquals(expectedOutput, input);
    }

    @Test
    @DisplayName("This test tests if the input matches what we currently have in the array list")
    public void testInstructionParserIsCorrect() {
        var input = InputParser.instructionParser("llrm");
        ArrayList<InstructionsVals> expectedOutput = new ArrayList<>();

        expectedOutput.add(InstructionsVals.L);
        expectedOutput.add(InstructionsVals.L);
        expectedOutput.add(InstructionsVals.R);
        expectedOutput.add(InstructionsVals.M);


        assertEquals(expectedOutput, input);
    }
}
