package Binarysearch;
// This is leetcode ques --> smallest letter greater tha target
//here we have used ceiling approach
//need to return letter as answer instaed if index no.
public class SmallestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}//as Binary Search takes O(log n) time --> so this is time comlpexity here
//SC = O(1)

/* public char nextGreatestLetter(char[] letters, char target) {
    for (char letter : letters) {
        if (letter > target) {
            return letter;
        }
    }

    // If no letter is greater, wrap around
    return letters[0];
} TC = O(N) & this is brute sol for above problem
*/
