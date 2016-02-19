package edu.kpi.hexlet.XO.controller;

import edu.kpi.hexlet.XO.model.Field;
import edu.kpi.hexlet.XO.model.Figure;
import edu.kpi.hexlet.XO.model.Point;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) {
        field.setFigure(point, figure);
    }
}
