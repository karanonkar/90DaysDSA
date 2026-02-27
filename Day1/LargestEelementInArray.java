class Solution {
    public int getSecondLargest(int[] arr) {
        // int li smallest value (yani -infinity consider kar li dono ki value)
        int Lar= Integer.MIN_VALUE;
        int SecLar= Integer.MIN_VALUE;
        // ab loop chalenge 
        for (int i=0; i<arr.length;i++){
            //Ab har element check karenge.
            if(arr[i]>Lar){
                SecLar=Lar;
                Lar=arr[i];
                //Pehle secondLargest ko shift kiya
                //Phir largest update kiya
            }
            else if(arr[i]> SecLar&& arr[i]!=Lar){
                SecLar=arr[i];
            //Ye ensure karta hai duplicate count na ho
            }
        }
         if(SecLar== Integer.MIN_VALUE){
        return -1;
        //secondLargest update hi nahi hua:
         }
        
        return SecLar;
    }
}