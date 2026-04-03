
package Lab_08.L8Q3.src;

import java.util.Scanner;

 class WeightCalculator{
    int age;
    double height;

    public WeightCalculator(){
        this.age = 18;
        this.height = 175;
    }

    public WeightCalculator(int age, double height){
        this.age = age;
        this.height = height;
    }

    public int getAge(){
        return age;
    }

    public double getheight(){
        return height;
    }

    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        System.out.print("Please enter your height: ");
        double height = input.nextDouble();
        System.out.println();

        this.age = age;
        this.height = height;

        input.close();
        
    }

    public double recommendWeightCalculator(){
        double rw = (this.height - 100 + this.age/10) * 0.9;
        return rw;
    }

    public void displayInfo(){
        double rw = recommendWeightCalculator();
        System.out.println("Age: " + age +"\nHeight: " + height + "\nRecommend weight: " + rw);
        System.out.println();
    }
}
