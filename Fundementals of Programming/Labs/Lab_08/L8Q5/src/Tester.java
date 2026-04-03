
package Lab_08.L8Q5.src;

 class Tester {
    public static void main(String[] args) {
      Game p1 = new Game("Jordan");
      Game p2 = new Game("Lucious");

      while (true){
        p1.move();
        if(p1.getPoints() >= 100) {
            System.out.println(p1.getName() + " won.");
            System.out.println();
            break;}
        p2.move();
        if(p2.getPoints() >= 100) {
            System.out.println(p2.getName() + " won.");
            System.out.println();
            break;
}


      }
    }
}
