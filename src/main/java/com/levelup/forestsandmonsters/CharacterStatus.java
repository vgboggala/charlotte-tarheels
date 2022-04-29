package com.levelup.forestsandmonsters;
import java.awt.Point;

public class CharacterStatus {
    Point currentPosition;

    public CharacterStatus(){
        currentPosition = new Point(0,0);
    }

    public void setStatus(Point position) {
        this.currentPosition = position;
    }

    public Point getStatus() {
        return this.currentPosition;
    }
}
