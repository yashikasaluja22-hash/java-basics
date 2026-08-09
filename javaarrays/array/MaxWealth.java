public class MaxWealth {
    //LeetCode Ques
    //https://leetcode.com/problems/richest-customer-wealth/
    class Solution { //leetcode sol starts from here
        public int maximumWealth(int[][] accounts) {
            int maxwealth = 0;
            for(int person = 0; person < accounts.length; person++){
                int sum = 0;
                for(int j = 0; j < accounts[person].length; j++){
                    sum += accounts[person][j];
                    //here j represents the total no. of bankaccounts of a person
                }
                maxwealth = Math.max(maxwealth, sum);
            }
            return maxwealth;
        }
    }//and ends here the solution
}
