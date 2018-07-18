package com.UF;

abstract public class UnionFind {

    int[] ids;

    int N;

    UnionFind(int N){
        this.ids = new int[N];
        for (int i = 0; i<N; i++){
            ids[i] = i;
        }
        this.N = N;
    }

    public int getSize(){return this.N;};

    public int getId(int id){return this.ids[id];}

    abstract public Boolean connected(int p, int q);
    abstract public void union(int p, int q);
}
