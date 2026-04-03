
package FOP_Lab04.src;

import java.util.Scanner;

 class L4Q3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double score = 0;
        double av;
        int i = 0;
        double min = Double.POSITIVE_INFINITY, max = Double.NEGATIVE_INFINITY;
        int sum = 0;
        double x = 0, x2 =0;
        

       while (true){
        System.out.print("Enter a score [negative score to end]: ");
        score = input.nextDouble();
        if (score < 0){break;}
       i++;
      sum += score;
if (score > max){
            max = score;
        }
        if (score < min){
            min = score;
        }

        x = Math.pow(score,2);
        x2 += x;
        }
        av = (double) sum / i;
       double s = Math.sqrt((x2 - ((sum*sum)/i))/ (i - 1) );
        System.out.println("Minimum Score: "+min);
        System.out.println("Maximum Score: "+max);
        System.out.println("Average Score: "+av);
        System.out.printf("Standard Deviation: %.2f", s);

        input.close();
       }}
