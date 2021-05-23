package com.javarush.games.minigames.mini12;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class FillGame extends Game {
    private final List<Cell> cells = new ArrayList<>();

    @Override
    public void initialize() {
        setScreenSize(10, 10);
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        setCellColor(x, y, Color.ORANGE);
        Cell tmp = new Cell(x, y);
        boolean check = false;
        for (Cell i : cells) {
            if (i.hashCode() == tmp.hashCode()) {
                check = true;
            }
        }

        if (!check) {
            cells.add(tmp);
        }
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        setCellColor(x, y, Color.WHITE);
        Cell tmp = new Cell(x, y);

        cells.removeIf(i -> i.hashCode() == tmp.hashCode());
    }
}
