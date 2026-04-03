package src.com.maplestory;

public class MagicShieldTest {
    public static void main(String[] args) {
        System.out.printf("%n== MagicShield Test ==%n");
        MagicShield shield1 = new MagicShield();
        MagicShield shield2 = new MagicShield(3.0,7.0,"Ice");
        MagicShield shield3 = new MagicShield(4.0,17.5,"Dark");
        MagicShield shield4 = new MagicShield(0,0,null);
        MagicShield shield5 = new MagicShield(-1.0,-5,null);

 
        System.out.println(shield1);
        System.out.println(shield2);
        System.out.println(shield3);

        System.out.printf("== Setter test ==%n");

        try {
            shield1.setRadius(1.0);
            System.out.println("Shield1 radius set to: " + shield1.getRadius());
        } catch (IllegalArgumentException e){
            System.out.println("Shield1: " + e.getMessage());
        } 

        try {
            shield2.setThickness(-5.0);
            System.out.println("Shield2 thickness set to: " + shield2.getThickness());
        } catch (IllegalArgumentException e){

            System.out.println("Shield2: " + e.getMessage());
        } 

        try {
            shield3.setElementType("");
            System.out.println("Shield3 element type set to: " + shield3.getElementType());
        } catch (IllegalArgumentException e){
            System.out.println("Shield3: " + e.getMessage());
        }

        try {
            shield1.setThickness(3.0);
            System.out.println("Shield1 thickness set to: " + shield1.getThickness());
        } catch (IllegalArgumentException e){
            System.out.println("Shield1: " + e.getMessage());
        }

        try {
            shield3.setThickness(-2.0);
            System.out.println("Shield3 thickness set to: " + shield3.getThickness());
        } catch (IllegalArgumentException e){
            System.out.println("Shield3: " + e.getMessage());
        }


        System.out.printf("%n== Static Method Test ==%n");
        System.out.printf("Abritary shield properties:%n" + "Defense Power: " + MagicShield.calculateDefensePower(5.0,10.0,"Light") + "%nValid Size: " + MagicShield.isValidSize(5.0) + "%nMana Cost: " + MagicShield.calculateManaCost(5.0,10.0) +"%n%n");
        System.out.println("Total number of shields created: " + MagicShield.getShieldCount());
        System.out.println();

        System.out.println("== Exception Test ==");

        try {
        System.out.println(shield4);
        System.out.println("Shield 4 validity:" + MagicShield.isValidSize(shield4.getRadius()));
         System.out.println();} 
         catch (IllegalArgumentException e) {
            System.out.println("Shield4: " + e.getMessage());

        try {
            System.out.println(shield5);
            System.out.println("Shield 5 validity:" + MagicShield.isValidSize(shield4.getRadius()));
        } catch (IllegalArgumentException e1) {
            System.out.println("Shield5: " + e1.getMessage());
        }

    }
    System.out.println();
}}
