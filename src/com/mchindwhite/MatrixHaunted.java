package com.mchindwhite;

public class MatrixHaunted {

    public static int solution(int[][] matrix) {
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                //if matrix j at i equals 0
                if(matrix[i][j] == 0) {
                    break;
                } else {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    //Not correct.
    public static void main(String[] args) {


    }


}

//from CodeSignal
//After becoming famous, the CodeBots decided to move into a new building together.
// Each of the rooms has a different cost, and some of them are free,
// but there's a rumour that all the free rooms are haunted!
// Since the CodeBots are quite superstitious, they refuse to stay in any of the free rooms,
// or any of the rooms below any of the free rooms.
//matrix = [[0, 1, 1, 2],
//          [0, 5, 0, 0],
//          [2, 0, 3, 3]]
//the output should be
//solution(matrix) = 9.

//Input:
//matrix:
//[[1],
// [5],
// [0],
// [2]]
//how would you account for a matrix that only has 1 column