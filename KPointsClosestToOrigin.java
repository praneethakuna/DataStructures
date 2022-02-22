package com.datastrcutures.trees;

import java.util.Arrays;

public class KpointsClosestToOrigin {
    public static void main(String args[]){
        int points[][]= {{1, 2} , {1, -1}, {3, 4}};
        int k=2;

        int n=points.length;
        int distance []= new int[n];
        for(int i=0;i<n;i++){
            int x=points[i][0];
            int y=points[i][1];
            distance[i]=(x*x)+(y*y);
        }

        Arrays.sort(distance);
        int distk= distance[k-1];
        for(int i=0;i<n;i++){
            int x=points[i][0];
            int y=points[i][1];
            int dist=(x*x)+(y*y);
            if(dist<=distk){
               System.out.println(" "+x+" "+y);
            }
        }
    }
}
