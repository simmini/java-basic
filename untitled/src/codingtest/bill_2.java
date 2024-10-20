package codingtest;

import java.util.Arrays;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        Arrays.sort(wallet);
        Arrays.sort(bill);
        while(!checkSize(wallet,bill)){//
            fold(wallet,bill);
            answer++;//접을때마다 값 증가
        }
    return answer;
    }
    private static void fold(int[]wallet,int[]bill){
        if(bill[0]>bill[1]){
            bill[0]/=2;
        }else{
            bill[1]/=2;
        }
    }

    private static boolean checkSize(int[]wallet,int[]bill){
        Arrays.sort(wallet);
        Arrays.sort(bill);
        return bill[0]>wallet[0]&&bill[1]>wallet[1];

    }
}
public class bill_2 {
    public static void main(String[] args) {
        Solution sol=new Solution();
        int []wallet=new int[]{30,15};
        int[]bill=new int []{26,17};
        int a=sol.solution(wallet,bill);
        System.out.println(a);

    }
}