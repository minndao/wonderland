
package Lab_08.L8Q5.src;

import java.util.Random;

 class Game {
    private String name;
    private int points;
    Game(){
        this.name = "Unknown";
        this.points = 0;
    }

    Game(String name){
        this.name = name;
        this.points = 0;
    }

    public int getPoints(){
        return points;
    }

    public String getName(){
        return name;
    }

    public int move(){
        Random rd = new Random();
        int point = rd.nextInt(6) + 1;
        System.out.println(name + " rolled a " + point +".");
        this.points = points + point;
        System.out.println(name + "'s current scores: " +  points);
        System.out.println();
        return points;
    }
}
