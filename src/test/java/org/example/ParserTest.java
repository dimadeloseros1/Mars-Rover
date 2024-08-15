package org.example;

import org.example.Parsers.InputParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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
        var plateauParser = InputParser.plateauSizeParser("421");

        assertEquals(plateauParser, "456");
    }
}
