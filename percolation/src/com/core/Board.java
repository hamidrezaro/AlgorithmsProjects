package com.core;

import com.UF.*;

public class Board {

    private int N;
    private boolean[][] open;
    private QuickUnionUF qn;
    private int openSlots;

    Board(int N){
        this.N = N;
        open = new boolean[N+1][N+1];
        qn = new QuickUnionUF(N*N + 3);
        for(int i = 1; i<=N; i++){
            qn.union(i,N*N + 1);
        }
        for (int i = N*N - N + 1; i<=(N*N); i++){
            qn.union(i,N*N + 2);
        }
        openSlots = 0;
    }

    private boolean isOpen(int row, int column) {
        return (row >= 1 && row <= N) && (column >= 1 && column <= N) && open[row][column];
    }

    public void makeOpen(int row, int column){
        if(isOpen(row, column))
            return;
        if ((row >= 1 && row <= N) && (column >= 1 && column <= N)){

            open[row][column] = true;

            int index = rowColumnToN(row, column);
            int leftIndex = index + 1;
            int rightIndex = index - 1;
            int upIndex = index - N;
            int downIndex = index + N;

            if(row != 1 && isOpen(row-1, column)){
                qn.union(index, upIndex);
                openSlots++;
            }
            if(row != N && isOpen(row+1, column)){
                qn.union(index, downIndex);
                openSlots++;
            }
            if (column == 1 && isOpen(row, column+1)){
                qn.union(index, rightIndex);
                openSlots++;
            }
            if (column == N && isOpen(row, column - 1)){
                qn.union(index, leftIndex);
                openSlots++;
            }
            if (column >1 && column<N){
                if(isOpen(row, column+1)){
                    qn.union(index, rightIndex);
                    openSlots++;
                }

                if(isOpen(row, column - 1)){
                    qn.union(index, leftIndex);
                    openSlots++;
                }

            }
        }
    }

    public boolean percolates(){
        return qn.connected((int)Math.pow(N,2) + 1, (int)Math.pow(N,2) + 2);
    }

    public void displayBoard(){
        for (int i = 1; i<=this.N; i++){
            for (int j = 1; j<=this.N; j++){
                System.out.print(open[i][j]?"O":"-");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    private int rowColumnToN(int row, int column){

        // row : [1,N] and column : [1,N]
        return (row-1)*N + column;
    }

    public int getOpenSlots(){return openSlots;}

}
