// You are given a sorted array arr[] containing positive integers. Your task is to remove all duplicate elements from this array such that each element appears only once. Return an array containing these distinct elements in the same order as they appeared.
// Examples :

// Input: arr[] = {1, 2, 2, 3, 4, 4, 5}
// Output: {1, 2, 3, 4, 5}

// with arraylist

import java.util.*;

class Solution {

    // Function returns an ArrayList containing unique elements
    public ArrayList<Integer> removeDuplicates(int[] arr) {

        // Step 1: Result list banate hain jisme unique elements store karenge
        ArrayList<Integer> result = new ArrayList<>();

        // Step 2: Edge case handle karte hain
        // Agar array empty ho toh directly empty list return kar do
        if(arr.length == 0) {
            return result;
        }

        // Step 3: Sorted array hai,
        // Isliye first element hamesha unique hota hai
        result.add(arr[0]);

        // Step 4: Loop 1 se start karte hain (kyuki 0 already add kar diya)
        for(int i = 1; i < arr.length; i++) {

            // Step 5: Current element ko previous element se compare karo
            // Agar different hai matlab new unique element mila
            if(arr[i] != arr[i - 1]) {

                // Unique element ko result list me add karo
                result.add(arr[i]);
            }

            // Agar equal hai → duplicate hai → ignore kar denge
        }

        // Step 6: Final unique elements wali list return karo
        return result;
    }
}


// without arraylist(only array)

class Solution {

    // Function returns count of unique elements
    public int removeDuplicates(int[] arr) {

        // Agar array empty hai
        if (arr.length == 0)
            return 0;

        // slow pointer → last unique element ka index
        int slow = 0;

        // fast pointer → pura array traverse karega
        for (int fast = 1; fast < arr.length; fast++) {

            // Agar current element different hai
            if (arr[fast] != arr[slow]) {

                // slow ko next position pe move karo
                slow++;

                // new unique element ko slow position pe copy karo
                arr[slow] = arr[fast];
            }

            // Agar equal hai → duplicate → ignore
        }

        // Unique elements ka total count
        return slow + 1;
    }
}