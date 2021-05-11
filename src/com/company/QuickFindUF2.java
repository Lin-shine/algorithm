package com.company;

public class QuickFindUF2 {
    //数组与之前的数组不一样，属于树形结构，id[i]值为根节点的值
    private  int [] id;
    //初始化
    public QuickFindUF2(int N){
        id = new int[N];
        for(int i = 0; i < id.length; i++){
            id[i] = i;
        }
    }

    //返回元素根节点
    private int root(int i){
        while (i != id[i]){
            i = id[i];
        }
        return i;
    }

    //两个节点是否连通
    public boolean connected(int p,int q){
        return root(p) == root(q);
    }
    //改变根节点，形成树型结构，使两个元素联通，
    public  void union(int p,int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

}
