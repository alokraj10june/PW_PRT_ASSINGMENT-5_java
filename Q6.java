package Assingment_5_PRT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q6 {
        static List<Integer> findDuplicates(int[] nums) {
            int n = nums.length;
            int[] cs = new int[n+1];
            ArrayList<Integer> al = new ArrayList<>();
            for(int i = 0; i < n; i++){
                cs[nums[i]] += 1;
            }
            for(int i = 0; i < cs.length; i++){
                if(cs[i] == 2){
                    al.add(i);
                }
            }
            return al;
        }

    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    }

