package com.venky.problem.houseticket;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class HouseGameStarter {

    public static void main(String[] args) {
       IntStream.range(0,9).forEach(value -> {
           System.out.println("***************************************************");
           startGame();
       });
    }

    private static void startGame() {
        int game[][] = new int[3][9];
        int occupancyLimit =15;
       while(occupancyLimit>0)
        {
            int i = getRandomNumber(3);
            int j = getRandomNumber(9);
          //  System.out.println(i);
           // System.out.println(j);

            int data = validateAndReturnNume(i, j, game);

            if(data>0)
            {
                game[i][j]=data;
                occupancyLimit--;
            }
        }
        System.out.println(Arrays.deepToString(game).replace("],","]\n").replace("0","00").replace(",", " || "));
    }

    private static int validateAndReturnNume(int i, int j, int[][] game) {

        // Rule 01 if the value is already filled so it can not be
        if(game[i][j] !=0)
        {
            return  -1;
        }
        int rowCounter =0;
        for (int r =0; r<3;r++)
        {
             if(game[r][j]!=0)
             {
                 rowCounter++;
             }

        }
        //coloum can not cotains more than 2 values
        if(rowCounter >=2)
        {
            return  -1;
        }

        int columCouter =0;
        for (int c =0; c<9;c++)
        {
             if(game[i][c]!=0)
             {
                 columCouter++;
             }
        }

        // Rule rows can  not have more than 5 element
        if (columCouter>=5)
        {
            return  -1;
        }
         int data =0;
        boolean isValueSet=false;
        do {
            data=getRanddomNumberForCol(j);
            isValueSet = isValueExistsCol(game,i,j,data);
        }while (isValueSet);

return data;

    }

    private static boolean isValueExistsCol(int[][] game, int i, int j, int data) {
        boolean status = false;
        for(int k =0; k<3; k++)
        {
             if (game[k][j]==data)
             {
                 status=true;
                 break;
             }
        }
        return status;
    }

    private static int getRanddomNumberForCol(int high) {
        if(high==0)
        {
            high=10;
        }
        else
        {
            high=(high+1)*10;
        }
        int low = high-9;
        Random r = new Random();
        return  r.nextInt(high-low)+low;
    }

    private static int getRandomNumber(int max) {
        return (int ) (Math.random()*max);
    }
}
