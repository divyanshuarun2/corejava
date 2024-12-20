package longestSubarrayWithgivensum;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int arr[]= new int[]{1,4,6,0,0,0,0,2,2,0,0,0,0,0};
        int key=4;
        int length =0;
       // brute force O(n*n*n)
        longestSubarray(arr,key);

        // better approach(n*n)
        betterapprach(arr,key);

        //opapproch(O(NlogN)
        optimalApproach(arr,key);

        // best approach 2 pointer approach
        twopointerApproach(arr,key);

    }

    private static void twopointerApproach(int[] arr, int key) {

        int i =0,j=0;
        int sum = 0;
        int maxLength =0;
        while(i<arr.length && j<arr.length){
            sum+=arr[i];
            while(sum>key && i<j){
                sum = sum - arr[i];
                i++;
            }
            if(sum==key){
                maxLength= Math.max(maxLength,j-i+1);
            }
           j++;

        }
        System.out.println(maxLength);
    }
    // better 2 o(n*logn)
    private static void optimalApproach(int[] arr, int key) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans=0;
        int sumSofar=0;
        for (int i = 0; i < arr.length; i++) {
            sumSofar+=arr[i]; //5
            Integer prevIndx=map.get(sumSofar-key);
            if(prevIndx!=null){
                ans=Math.max(ans,i-prevIndx);
            }
            if(map.get(sumSofar)==null) {
                map.put(sumSofar, i);
            }

        }
        System.out.println(ans);

    }

    // better approach
    private static void betterapprach(int[] arr, int key) {
        int ans =0;
        for (int i = 0; i < arr.length; i++) {

            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if(sum==key){
                    ans=Math.max(ans,j-i+1);
                }
            }

        }
        System.out.println(ans);
    }

    // brute force
    public static void longestSubarray(int arr[],int key){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int k=i;
                int sum=0;
                while(k<=j){
                   // System.out.print(arr[k]+" ");
                    sum+=arr[k];
                    if(sum==key){
                        ans=Math.max(ans,k-i+1);
                    }
                    k++;
                }


            }

        }
        System.out.println(ans);
    }
}
