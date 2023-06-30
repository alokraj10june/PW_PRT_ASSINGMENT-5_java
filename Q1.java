package Assingment_5_PRT;

import java.util.Arrays;

public class Q1 {
    static int[][] construct2darray(int[] nums,int m,int n){
        int[][] res=new int[m][n];
        if(nums.length!=m*n)return new int[0][0];
        int idx=0;
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                res[i][j]=nums[idx++];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int m=2;
        int n=2;
        System.out.printf(Arrays.toString(construct2darray(nums,m,n)));
    }
}
