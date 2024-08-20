package org.example;

import org.example.Actions.*;
import org.example.Enums.CompassDirection;
import org.example.Enums.InstructionsVals;
import org.example.Parsers.InputParser;
import org.example.Workflow.App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        App app = new App();
        app.run();

//        ArrayList<String> hardcodedData = new ArrayList<>();
//        hardcodedData.add("5 5");
//        hardcodedData.add("1 2 N");
//        hardcodedData.add("LMLMLMLMM");
//        hardcodedData.add("3 3 E");
//        hardcodedData.add("MRMRMRMRMM");
//
//        System.out.println(hardcodedData);

//        var input = ConsoleIO.roverInstructionInput("Please choose if you want to go (*l*eft) or (*r*ight) )");
//
//        var vals = InputParser.instructionParser(input);
//
//        var rotating = manager.rotate(CompassDirection.N, vals);
//
//        System.out.println(rotating);

//        var test = InputParser.instructionParser("lmr");
//        System.out.println(test);


//        var position = InputParser.positionParser("24w");
//        System.out.println(position);
//
//        var plateuParser = InputParser.plateauSizeParser("2");
//        System.out.println(plateuParser);
    }

}