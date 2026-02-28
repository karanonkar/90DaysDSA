class Solution {
    public boolean isSorted(int[] arr) {
      
        for(int i=0; i<arr.length-1;i++){ //Agar i last index tak chala gaya To arr[i+1] out of bounds ho jayega
            if(arr[i]>arr[i+1]){ //Agar current element next se bada hai To array sorted nahi hai.
                return false;
            }
        }
        return true;
    }
}