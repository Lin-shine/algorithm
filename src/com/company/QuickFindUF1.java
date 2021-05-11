package com.company;
import java.util.*;
public class QuickFindUF1 {
    //
    private int[] id;

    //设置数组中的id
    public QuickFindUF1(int N){
        id = new int[N];
        for(int i = 0; i < N; i++){
            id[i] = i;
        }
    }
    //判断是否连通
    public boolean connected(int p,int q){
        return  id[p] == id[q];
    }

    //连接集合
    public void union(int p,int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) id[i] = qid;
        }
    }
}
