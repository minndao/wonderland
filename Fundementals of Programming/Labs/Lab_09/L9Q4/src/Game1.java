
package Lab_09.L9Q4.src;

 class Game1 extends DiceGame {
    
    Game1(String name) {
        super(name);
    }

    public void play() {
        int d1, d2;

        do{
        
        d1= roll();
        d2 = roll();
        setScore(getScore() + d1 + d2);

        System.out.println(getName() + " rolled a " + d1 + " and a " + d2 +".");
        System.out.println("Current score : " + getScore() );
        System.out.println();

        if (getScore() >= 100) break;

        if (d1 == d2){
            System.out.println("\nDouble! Roll again!");
        }
   
    }while(d1 == d2);

    }

}
