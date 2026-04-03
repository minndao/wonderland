
package Lab_09.L9Q4.src;

import java.util.Random;

 class DiceGame {
    private int score;
    private Random rd;
    private String name;

    DiceGame(String name) {
        this.name = name;
        this.score = 0;
        this.rd = new Random();
    }

    public int roll() {
        return rd.nextInt(6) + 1;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
