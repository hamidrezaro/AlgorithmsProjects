package com.UF;

public class QuickFindUF extends UnionFind {

    QuickFindUF(int N){
        super(N);
    }

    @Override
    public Boolean connected(int p, int q) {
        return (this.ids[p] == this.ids[q]);
    }

    @Override
    public void union(int p, int q) {

        if(this.connected(p,q))
            return;

        int pid = this.ids[p];
        int qid = this.ids[q];
        for(int i = 0; i < this.N; i++){
            if(this.ids[i] == pid){
                this.ids[i] = qid;
            }
        }
    }
}
