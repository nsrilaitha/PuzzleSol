import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;

public class GameWinner
{

    static boolean didWinGame(String[] game,int pLength, int currentPos,int lastPos)
    {

        boolean didWin = false;

        int range = currentPos;

        while(range < game.length-1 && game[range+1].equals("0")){
            range++;
        }
        if(range == game.length-1) return true;

        int lowRange = range;
        while(lowRange>lastPos && game[lowRange-1].equals("0") && (lowRange+pLength) > range+1 ){
            lowRange--;
        }
        currentPos = lowRange;
        for(int i = currentPos;i<=range;i++){
            if((i+pLength)<game.length && game[i+pLength].equals("0")  && pLength!=0){
                didWin = didWinGame(game,pLength,i+pLength,i);
            } 

            if(didWin || (i+pLength)>=game.length || (i+1)>=game.length){
                didWin = true;
                break;
            }
        }

        return didWin;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        for(int i=0;i<numCases;i++){
            int arraySize = sc.nextInt();
            int pLength = sc.nextInt();
            sc.nextLine();
            String[] game = sc.nextLine().split(" ");
            if(didWinGame(game,pLength,0,0)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
            }
        }
    }
}