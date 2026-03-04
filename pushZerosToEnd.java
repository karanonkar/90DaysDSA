class pushZerosToEnd {
    void pushZerosToEnd(int[] arr) {

        int n = arr.length;
        int j = 0;   // position for next non-zero element

        for(int i = 0; i < n; i++) {

            // agar element zero nahi hai
            if(arr[i] != 0) {

                // swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;   // next position move
            }
        }
    }
}