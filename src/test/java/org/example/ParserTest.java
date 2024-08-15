package org.example;

import org.example.Actions.PlateauSize;
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


//    @Test
//    @DisplayName("Testing for incorrect plateau size")
//    public void testPlateauSize() {
//        var plateauParser = InputParser.plateauSizeParser("11");
//        var size = new PlateauSize(1,1);
//
//        assertEquals(size, plateauParser);
//    }

    @Test
    @DisplayName("This test tests if the input does not equal to what we have in the array list")
    public void testInstructionParserIsIncorrect() {
        var plateauParser = InputParser.instructionParser("ll");

        ArrayList<InstructionsVals> valsList = new ArrayList<>();
        valsList.add(InstructionsVals.L);
        valsList.add(InstructionsVals.M);


        assertNotEquals(valsList, plateauParser);
    }

    @Test
    @DisplayName("This test tests if the input matches what we currently have in the array list")
    public void testInstructionParserIsCorrect() {
        var plateauParser = InputParser.instructionParser("llrm");

        ArrayList<InstructionsVals> valsList = new ArrayList<>();
        valsList.add(InstructionsVals.L);
        valsList.add(InstructionsVals.L);
        valsList.add(InstructionsVals.R);
        valsList.add(InstructionsVals.M);


        assertEquals(valsList, plateauParser);
    }
}
