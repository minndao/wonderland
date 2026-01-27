import java.util.Random;
public class T6Q1 {
//a
public static int maximum(int a, int b, int c){
    if (a>b && a>c){
    return a;    }
    else if (b>a && b>c){
        return b;
    }
    else{
        return c;
    }
}

//b
public static int squaredetector(int num1){
 if (Math.sqrt(num1)%1==0){
     return 1;
 }
 else{
     return 0;
 }
}

//c
public static int factorial(int num){
    for (int i = 1; i < num ; i++){
        num = num * i;
    }
    return num;
}
public static int function (int n, int k){


    int diff = factorial(n)/(factorial(k)*factorial(n-k));
    return diff;

}

//d 
public static boolean pentagonal(int N){

   if (N<= 0)  {
         return false;
   }

   double n = (1 + Math.sqrt(1 + 24*N)) / (6);
    return n == (int)n && n > 0;}


//e
public static void numberof (String s){
    int lettersCount = 0, digitsCount = 0;
    for (int i = 0 ; i < s.length(); i ++){
        if (Character.isLetter(s.charAt(i))){
            lettersCount++;

        }
        if (Character.isDigit(s.charAt(i))){
            digitsCount++;
        }
    }
    System.out.println("LETTERS " + lettersCount);
    System.out.println("DIGITS " + digitsCount);

}


//f
public static void generator (int [] array){
    Random r = new Random();
    for (int i = 0; i < 10; i ++){
        array[i] = r.nextInt(101);
        System.out.println(array[i] + " ");
    }
  
}
public static void main(String[] args) {
    int[] newarray = new int[10];
    generator(newarray);
    
}

//g
public static void  AreaCircumference (double radius){
    double area = Math.PI * radius * radius;
    double circumference = 2 * Math.PI * radius;
    System.out.println("Area: " + area);
    System.out.println("Circumference: " + circumference);
    
}

//h
public static int rtrnfirstdouble (){
    Random r = new Random();
    boolean[] seen = new boolean[11];

    while (true){
        int num = r.nextInt(11);
        
        if (seen[num]) {
            return num;
        }
        seen[num] = true;
            
        }
    }

    }

