package Assingment_5_PRT;

public class Q2 {
    static int arrangecoin(int n){
        //we place one coin in starting
        int i=1;         //1,2,3
        //count number of stairs
        int count=0;     //1,2,3
        //n->number of coins
        while(n>=0){    //4,2,-1
            n=n-i;     //4,2,-1
            count++;   //1,2,3
            i++;       //2,3,
        }
        return count-1;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(arrangecoin(n));
    }
}
