
package Lab_09.L9Q4.src;

 class Tester {
    public static void main(String[] args) {
        Game1 p1 = new Game1("Jordan");
        Game1 p2 = new Game1("Bruce");

        Game2 p3 = new Game2("Jordan");
        Game2 p4 = new Game2("Bruce");

        System.out.println("Game 1 start!");
    while (p1.getScore() < 100 && p2.getScore() < 100){
        p1.play();
        p2.play();
        if (p1.getScore() >= 100) {
            System.out.println(p1.getName() + " won!\n");
            break;
        }
        if (p2.getScore() >= 100) {
            System.out.println(p2.getName() + " won!\n");
            break;
        }
    }
    System.out.println("Game 2 start!");
     while (p3.getScore() < 100 && p4.getScore() < 100){
        p3.play();
        

        if (p3.getScore() == 100) {
            System.out.println(p3.getName() + " won!");
            break;
        }

        p4.play();
        if (p4.getScore() == 100) {
            System.out.println(p4.getName() + " won!");
            break;
        }

        
    }
        }

        
}
