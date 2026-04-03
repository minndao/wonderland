
package Lab_08.L8Q1.src;

import java.util.Arrays;
import java.util.Random;

class Number {
    Random random = new Random();
    int size;
    int range;
    int [] array;
    

    public Number(){
    this.size = 10;
    this.range = 101;
    this.array = new int [size];
    for (int i = 0; i < size; i++){
        array [i] = random.nextInt(range);
    }
    System.out.println(Arrays.toString(array));
}

    public Number(int size, int range){
        this.size = size;
        this.range = range + 1;
        this.array = new int [size];
        for (int i = 0; i < size; i++){
            array [i] = random.nextInt(this.range);
        }
            System.out.println(Arrays.toString(array));
}

    public void displayEven(){
        System.out.print("Even number: ");
        for (int number: array){
            if (number % 2 == 0){
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public void displayPrime(){
        System.out.print("Prime number: ");
        for (int number : array){
            if (number < 2) continue;
            boolean isPrime = true;
            for (int i = 2; i * i <= number; i++){
                if (number % i == 0){
                    isPrime = false;
                    break;
                }}

                if (isPrime)
                    System.out.print(number + " ");
            } System.out.println();

            }

        public void displayMax(){
            System.out.print("Maximum number: ");
            int temp = 0;
            for(int number : array){
                if (number > temp)
                    temp = number;
                else{continue;}
            }System.out.print(temp + " ");
            System.out.println();
        }

        public void displayMin(){
             System.out.print("Minimum number: ");
            int temp = this.range;
            for(int number : array){
                if (number < temp)
                    temp = number;
                else{continue;}
            }System.out.print(temp + " ");
            System.out.println();
        }

        public void displayMean(){
             System.out.print("Average number: ");
                double sum = 0;
                double count = 0;
            for(int number : array){
               sum = number + sum;
               count++;
            }
            double mean = sum/count;
            System.out.print(mean);
            System.out.println();
        }

        public void displaySquareNumber(){
            System.out.print("Square number: ");
            for (int number: array){
                double sqrt = Math.sqrt(number);
                if(number != (int)sqrt * (int)sqrt)
                    continue;
                else{System.out.print(number + " ");}
            }
        }


        }
    

    
    

