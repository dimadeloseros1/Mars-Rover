package org.example.Actions;

import org.example.Enums.CompassDirection;

public class Rover {

    private CompassDirection direction;
    private Position position;

    public Rover(CompassDirection direction, Position position) {
        this.direction = direction;
        this.position = position;
    }

    public void move() {
        int xCord = position.getX();
        int yCord = position.getY();

        switch (direction) {
            case N -> xCord++;
            case S -> yCord--;
            case E -> xCord++;
            case W -> yCord--;
        }

        position = new Position(xCord, yCord, direction);
    }

    public void turnLeft() {
        switch (direction) {
            case N -> direction = CompassDirection.W;
            case W -> direction = CompassDirection.S;
            case S -> direction = CompassDirection.E;
            case E -> direction = CompassDirection.N;
        }
    }

    public void turnRight() {
        switch (direction) {
            case N -> direction = CompassDirection.E;
            case E -> direction = CompassDirection.S;
            case S -> direction = CompassDirection.W;
            case W -> direction = CompassDirection.N;
        }
    }

    public Position getPosition() {
        return position;
    }

    public CompassDirection getDirection() {
        return direction;
    }
}
