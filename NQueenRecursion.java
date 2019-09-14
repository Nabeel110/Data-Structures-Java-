
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package homeassignment2;



/**
 *
 * @author Dell
 */
class NQueenRecursion
    {

        public int[][] createBoard(int N)
        {
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) 
            {
                for (int j = 0; j < N; j++) 
                {
                    arr[i][j] = 0;
                }
            }
            return arr;
        }
        public  boolean NQueen(int [][] board, int row)
        {
            if (row == board.length - 1)
            {
                for (int i = 0; i < board.length; i++)
                {
                    System.out.print("{");
                    for (int j = 0; j < board.length; j++)
                    {
                        System.out.print( board[i][j] +" ");
                    }
                    System.out.print("}");
                    System.out.println();
                }
                return true;
            }
            else
            {
                for (int col = 0; col < board.length; col++)
                {
                    int rowNew = row + 1;
                    if (isSafe(board, rowNew, col))
                    {
                        board[rowNew][col] = 1;
                        if (NQueen(board,  rowNew))
                        {
                            return true;
                        }
                        board[rowNew] [col] = 0;
                    }
                }
                return false;
            }
        }

        public boolean isSafe(int [][] board, int rowNew, int colNew)
        {
            boolean safeMove = true;
            for (int i = 0; i < board.length; i++)
            {
                if (board[i][colNew] == 1)
                {
                    safeMove = false;
                }
            }
            for (int i = rowNew, j = colNew; i >= 0 && j >= 0; i--, j--)
            {
                if (board[i] [j] == 1)
                {
                    safeMove = false;
                }
            }
            for (int i = rowNew, j = colNew; i >= 0 && j < board.length; i--, j++)
            {
                if (board[i] [j] == 1)
                {
                    safeMove = false;
                }
            }
            return safeMove;
        }
    }