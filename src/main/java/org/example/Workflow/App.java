package org.example.Workflow;

import org.example.Actions.*;
import org.example.Enums.InstructionsVals;
import org.example.Parsers.InputParser;

public class App {
    public void run() {
        GameManager manager = new GameManager();

        var plateau = manager.plateauSize();
        var position = manager.vehicle(plateau);
        manager.roverInstr(position, plateau);
    }

}


