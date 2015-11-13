//Nick Tulp
//CSE 2 Hw 10
//11/13/2015

//This program takes in user input to generate a game board of the inputted size.
//It also takes in a number of mines to randomly be placed.
//After the mines are placed, traverses through array and gives each cell a number that
// represents the number of adjacent cells containing a mine.

import java.util.Scanner;

public class minesweeper{
    static String[][] board = null;//Global board variable
    static int n = 0;//Global length var
            
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the board you would like to play on: ");
        n = scan.nextInt();
        try{//Try catch in event of negative length inputted
            board = new String[n][n];
        }catch(Exception e){
            System.out.println("Invalid input.");
            System.exit(-1);
        }
        //Initialize array to " " instead of null
        for(int x = 0; x < n; x++){
            for(int y = 0; y < n; y++){
                board[x][y] = " ";
            }
        }
        
        System.out.println("Enter the number of mines to be placed on the board: ");
        int mines = scan.nextInt();//Read in # of mines
        
        int nextMineX = 0;
        int nextMineY = 0;
        String m = "M";
        
        for(int i = 0; i < mines; i++){
            
            nextMineX =(int)(Math.random()*n);//Random variables for location to put mine
            nextMineY =(int)(Math.random()*n);
            
            if(board[nextMineX][nextMineY] != m){//Check if location has a mine already
                board[nextMineX][nextMineY] = "M";//If not, add M
            }
            else if(board[nextMineX][nextMineY] == m){//If mine already there, decrement and retry
                i--;
            }
        }
        
        for(int x = 0; x < n; x++){
            for(int y = 0; y < n; y++){
                //If a mine is at current loc, then update all adjacet cells.
                if(board[x][y] == "M"){
                    updateAdj(x, y);
                }
            }
        }
        print(board);
    }
    
    public static void add(int x, int y){
        if(board[x][y] != "M"){
            if(board[x][y] == " "){
                board[x][y] = "1";
            }
            else if(board[x][y] == "1"){
                board[x][y] = "2";
            }
            else if(board[x][y] == "2"){
                board[x][y] = "3";
            }
            else if(board[x][y] == "3"){
                board[x][y] = "4";
            }
        }
    }
    
    public static void updateAdj(int x, int y){
        if(x > 0 && x < (n - 1)){
            
            if(y > 0 && y < n -1){
                add(x, y-1);
                add(x, y+1);
                add(x+1, y-1);
                add(x+1, y);
                add(x+1, y+1);
                add(x-1, y-1);
                add(x-1, y);
                add(x-1, y+1);
            }
            else if(y == 0){
                add(x, y+1);
                add(x+1, y);
                add(x+1, y+1);
                add(x-1, y);
                add(x-1, y+1);
            }
            else if(y == (n - 1)){
                add(x, y-1);
                add(x+1, y-1);
                add(x+1, y);
                add(x-1, y-1);
                add(x-1, y);
            }
        }
        else if(x == 0 && (n - 1) > 0){
                        
            if(y > 0 && y < n -1){
                add(x, y-1);
                add(x, y+1);
                add(x+1, y-1);
                add(x+1, y);
                add(x+1, y+1);
            }
            else if(y == 0){
                add(x, y+1);
                add(x+1, y);
                add(x+1, y+1);
            }
            else if(y == (n - 1)){
                add(x, y-1);
                add(x+1, y-1);
                add(x+1, y);
            }
        }
        else if(x == (n - 1)){
                        
            if(y > 0 && y < n -1){
                add(x, y-1);
                add(x, y+1);
                add(x-1, y-1);
                add(x-1, y);
                add(x-1, y+1);
            }
            else if(y == 0){
                add(x, y+1);
                add(x-1, y);
                add(x-1, y+1);
            }
            else if(y == (n - 1)){
                add(x, y-1);
                add(x-1, y-1);
                add(x-1, y);
            }
        }
    }
    
    public static void print(String[][] board){
        
        System.out.println("-----------Start------------");
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        System.out.println("---------------------");
        for(int i = 0; i < n; i++){
            System.out.print("| ");
            for(int j = 0; j < n; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("-----------End------------");
    }
    
}