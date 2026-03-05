class Solution {
    int missingNum(int arr[]) {

        long n = arr.length + 1;   // total numbers including missing

        long sum1 = n * (n + 1) / 2;   // expected sum
        long sumarr = 0;

        for(int i = 0; i < arr.length; i++){
            sumarr += arr[i];
        }

        return (int)(sum1 - sumarr);   // convert back to int
    }
}