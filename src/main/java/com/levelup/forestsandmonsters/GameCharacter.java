package com.levelup.forestsandmonsters;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameCharacter {
    String name;
    GameMap gameMap;
    Point currentPosition;
    CharacterStatus status;
    List<String> logMoves = new ArrayList<String>();

    public CharacterStatus getStatus() {
        return this.status;
    }

    public Point getPosition() {
        return this.currentPosition;
    }

    public void setPosition(Point newPosition) {
        this.currentPosition = newPosition;
    }

    public void logMoves(Point currPosition, Point newPosition) {
        String move = "Current Position = ("+(int)currentPosition.getX()+","+(int)currentPosition.getY()+")"
        + " and New Position = ("+(int)newPosition.getX()+","+(int)newPosition.getY()+")";
        logMoves.add(move);
    }

    public void init(String name, Point startPosition, GameMap map) {
        this.currentPosition = startPosition;
        this.name = name;
        this.gameMap = map;
    }

    public void move(DIRECTION directionToMove) {
        this.currentPosition = gameMap.calculatePositions(currentPosition, directionToMove);
        
    }

}
