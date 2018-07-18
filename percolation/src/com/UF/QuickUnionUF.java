package com.UF;

public class QuickUnionUF extends UnionFind {

    private int[] parents;

    private int[] rootSizes;

    public QuickUnionUF(int N){
        super(N);
        parents = new int[this.N];
        this.parents = this.ids;
        this.rootSizes = new int[N];

        for(int i = 0; i<N; i++){
            rootSizes[i] = 1;
        }
    }

    @Override
    public Boolean connected(int p, int q) {
        return (this.getRoot(p) == this.getRoot(q));
    }

    @Override
    public void union(int p, int q) {
        parents[getRoot(p)] = getRoot(q);
    }

    public void union_enhanced(int p, int q){
        int i = this.getRoot(p);
        int j = this.getRoot(q);
        if (i == j)
            return;

        if (rootSizes[i] <= rootSizes[j]){
            parents[i] = j;
            rootSizes[j] += rootSizes[i];
        } else {
            parents[j] = i;
            rootSizes[i] += rootSizes[j];
        }

    }

    private int getRoot(int id){

        int rootID = id;

        while(parents[rootID] != rootID){
            rootID = parents[rootID];
        }

        return rootID;
    }

    private int getRootPathCompression(int id){
        int rootID = id;

        while(parents[rootID] != rootID){
            parents[rootID] = parents[parents[rootID]];
            rootID = parents[rootID];
        }

        return rootID;
    }

    public int getParent(int id){return parents[id];}
}
