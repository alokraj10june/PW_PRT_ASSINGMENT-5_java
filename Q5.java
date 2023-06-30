package Assingment_5_PRT;

public class Q5 {
        static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            int count=0;
            int x=0;
            for(int i=0;i<arr1.length;i++){
                x=0;
                for(int j=0;j<arr2.length;j++){
                    int diff=Math.abs(arr1[i]-arr2[j]);
                    if(diff<=d){
                        j=arr2.length;
                    }
                    else{
                        x++;
                    }
                }
                if(x==arr2.length){
                    count++;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        int[] arr1={4,5,8};
        int[] arr2={10,9,1,8};
        int d=2;
        System.out.println(findTheDistanceValue(arr1,arr2,d));
    }
    }

