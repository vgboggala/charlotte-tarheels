package com.levelup.forestsandmonsters;

import java.awt.Point;
public class GameMap {
    public  int MAX_ROWS = 10 ;
    public int MAX_COLS = 10;
    
    public boolean isValidPosition(Point position) {
        if (position != null && position.x > 0 && position.x <=MAX_ROWS && position.y > 0 && position.y <=MAX_ROWS) {
            return true;
        }
        return false;
    }
}