package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameControllerSpy extends GameController {


    public Point getCurrentPosition() {
        return super.currentPosition;
    }

}
