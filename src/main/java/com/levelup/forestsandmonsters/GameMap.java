package com.levelup.forestsandmonsters;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController.DIRECTION;
public class GameMap {
    public  int MAX_ROWS = 10 ;
    public int MAX_COLS = 10;
    public int[][] map;

    public void init() {
        createPositions();
    }

    public void createPositions() {
        if (map == null && map.length == 0) {
            map = new int[MAX_ROWS][MAX_COLS];
        }
    }

    public Point calculatePositions(Point currentPosition, DIRECTION directionToMove) {
        Point tempPosition = currentPosition;
        switch(directionToMove) {
            case NORTH : tempPosition.y++;
                            break;
            case SOUTH : tempPosition.y--;
                         break;
            case EAST : tempPosition.x++;
                          break;
            case WEST : tempPosition.x--;
                         break;
        }
        if(isValidPosition(tempPosition)) {
            return tempPosition;
        }
        return currentPosition;
    }
    public boolean isValidPosition(Point position) {
        if (position != null && position.x > 0 && position.x <=MAX_ROWS && position.y > 0 && position.y <=MAX_ROWS) {
            return true;
        }
        return false;
    }
}