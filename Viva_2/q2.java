import java.util.Scanner;

public class q2 {
    public static boolean isBalanced(String s){
        int ct = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '('){
                ct ++;
            } else if (c == ')'){
                ct --;

                if (ct < 0){
                    return false;
                
            }
           

    
                }}
            return ct == 0;
        }

        public static void main(String[] args) {
            System.out.println("Enter expression: ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            sc.close();
            if (isBalanced(s)){
                System.out.println("Balanced");
            } else {
                System.out.println("Not Balanced");
            }
        }
    }

