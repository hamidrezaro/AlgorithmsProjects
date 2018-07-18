package com.UF;

public class TestBench {

    public static void main(String[] args){
        QuickUnionUF _uf = new QuickUnionUF(10);

        _uf.union_enhanced(0,2);
        _uf.union_enhanced(4,6);
        _uf.union_enhanced(3,4);
        _uf.union_enhanced(2,3);
        _uf.union_enhanced(1,5);
        _uf.union_enhanced(9,6);
        _uf.union_enhanced(7,5);

        System.out.println("are 2 and 3 connected? " + (_uf.connected(2,3)?"yes":"no"));


        for(int i = 0; i < _uf.getSize(); i++){
            System.out.println(_uf.getParent(i));
        }
    }
}
