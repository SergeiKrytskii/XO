package edu.kpi.hexlet.XO.model;

public class Game {

    private final Player player1;

    private final Player player2;

    private final Field field;

    private final String name;

    public Game(final GameBuilder gb) {
        this.field = gb.getField();
        this.player1 = gb.getPlayer1();
        this.player2 = gb.getPlayer2();
        this.name = gb.getName();
    }

    public Field getField() {
        return field;
    }

    public String getName() {
        return name;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

}
