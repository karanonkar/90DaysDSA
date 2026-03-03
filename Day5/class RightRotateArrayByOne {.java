class RightRotateArrayByOne {
    public void rotate(int[] arr) {

        int n = arr.length;

        // Step 1: Last element store karo
        int temp = arr[n - 1];

        // Step 2: Right shift karo
        for(int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Step 3: First position pe last element daalo
        arr[0] = temp;
    }
}