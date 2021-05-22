package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

public class RainbowGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(10, 7);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0) {
                    setCellColor(j, i, Color.RED);
                }
                if (i == 1) {
                    setCellColor(j, i, Color.ORANGE);
                }
                if (i == 2) {
                    setCellColor(j, i, Color.YELLOW);
                }
                if (i == 3) {
                    setCellColor(j, i, Color.GREEN);
                }
                if (i == 4) {
                    setCellColor(j, i, Color.BLUE);
                }
                if (i == 5) {
                    setCellColor(j, i, Color.INDIGO);
                }
                if (i == 6) {
                    setCellColor(j, i, Color.VIOLET);
                }

            }
        }
    }
}
