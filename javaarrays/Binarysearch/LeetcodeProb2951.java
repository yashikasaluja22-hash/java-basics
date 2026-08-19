package Binarysearch;
import java.util.ArrayList;
import java.util.List;

//this is an easy leetcode ques no need for binary search here
public class LeetcodeProb2951 {
public static void main(String[] args) {
  //check the problem on leetcode, and here u just scan the array
  //remeber the statment give by ques:
  //A peak is defined as an element that is strictly greater than its neighboring elements.//read it twice
}
        public static List<Integer> findPeaks(int[] mountain) {

            List<Integer> ans = new ArrayList<>();

            for (int i = 1; i < mountain.length - 1; i++) {

                if (mountain[i] > mountain[i - 1] &&
                        mountain[i] > mountain[i + 1]) {

                    ans.add(i);
                }
            }
            return ans;
        }
}
