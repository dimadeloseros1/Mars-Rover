package org.example;

import org.example.Enums.CompassDirection;
import org.example.Parsers.InputParser;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var plateauSize = InputParser.plateauSizeParser("44");
        System.out.println(plateauSize);

//        var test = InputParser.instructionParser("lmr");
//        System.out.println(test);



//        var position = InputParser.positionParser("24w");
//        System.out.println(position);

//        var plateuParser = InputParser.plateauSizeParser("2");
//        System.out.println(plateuParser);
    }

}