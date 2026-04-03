
package Lab_09.L9Q4.src;

 class Game2 extends DiceGame {
    Game2(String name) {
        super(name);}

        public void play() {
            
            int d1 = roll();
            int d2;
            int temp = d1;

            System.out.println(getName() + " rolled a " + d1 + ".");

            if (d1 == 6){
                System.out.println("It's a 6! Rolling again!");
                d2 = roll();
                System.out.println(getName() + "'s second roll is a " + d2 + ".");

                if(d2 == 6){
                    System.out.println("6 again! No score for this round.");
                    temp = 0;
                } else { temp =+ d2;}}

                if ((getScore() + temp) > 100) {
                    System.out.println("The total score: " + (getScore() + temp) + " is exceeded 100.");
                } else {
                    setScore(getScore() + temp);
                    System.out.println("Current score: " + getScore());
                }
                System.out.println();



            }
            
        }

       
    

