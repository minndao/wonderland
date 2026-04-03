package src;

import java.util.Scanner;

public class q4 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[][] board = new char[3][3];

   
    for (int i = 0; i < 3; i ++){
         System.out.printf("Enter row %d: ", i + 1);
    
        String row = sc.nextLine();
            if (row.length() != 3){
                System.out.println("Invalid board");
                sc.close();
                return;
            }

            String validChars = "XO.";
            for (char array : row.toCharArray()) {
                // If "XO." does not contain the character array'
                if (validChars.indexOf(array) == -1) {
                    System.out.println("Your board is invalid.");
                    sc.close();
                    return;
                }
            }

        for (int j = 0; j < 3; j ++){
            board[i][j] = row.charAt(j);
        } 
    }sc.close();
    
    if (countMoves(board, 'X')< countMoves(board, 'O') || countMoves(board, 'X') - countMoves(board, 'O') > 1){
        System.out.println("Invalid board");
        return;
    }
    if (checkWinner(board) == '-'){
        System.out.println("No winner");
        
    }else {
    System.out.println(checkWinner(board) + " is the winner");}


}

 public static int countMoves ( char[][] board, char player){
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == player){
                    count++;
                }
            }
        }
        return count;
    }

    public static char checkWinner (char[][] board){
        int rowx =0, rowo =0, colx =0, colo =0;
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
if (board[i][j] == 'X'){
    rowx++;
    if(rowx == 3){
        return 'X';
    }
            }

            if (board[j][i] == 'X'){
                colx++;
                if(colx == 3){
                    return 'X';}}
            
if (board[j][i] == 'O'){
                colo++;
                if(colo == 3){
                    return 'O';}}
if (board[i][j] == 'O'){
                rowo++;
                if(rowo == 3){
                    return 'O';}}




        }       
         rowx = 0;
         colx = 0;
         rowo = 0;
        colo = 0;   

    }

    int diagx1 = 0, diagx2 = 0, diago1 = 0, diago2 = 0;

    for (int i = 0; i < board.length; i ++){

            if (board[i][i] == 'X'){
                diagx1++;
                if (diagx1 == 3)
                    return 'X';
                }

            if (board[i][i] == 'O'){
                diago1++;
                if (diago1 == 3)
                    return 'O';
                 }
            
            if (board[i][2 - i] == 'X'){
                diagx2 ++;
                if (diagx2 == 3)
                    return 'X';
                }
            if (board[i][2 - i] == 'O'){
                diago2++;   
                if (diago2 == 3)
                    return 'O';
                }
          
        }
    return '-';
    }}