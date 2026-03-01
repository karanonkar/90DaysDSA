class Solution {

    // Function to reverse the array in-place
    public void reverseArray(int arr[]) {

        // Left pointer starts from beginning
        int left = 0;

        // Right pointer starts from last index
        int right = arr.length - 1;

        // Loop runs until left pointer crosses right pointer
        while(left < right) {

            // Swap elements at left and right
            int temp = arr[left];      // store left value
            arr[left] = arr[right];    // move right value to left
            arr[right] = temp;         // move stored value to right

            // Move left pointer forward
            left++;

            // Move right pointer backward
            right--;
        }
    }
}