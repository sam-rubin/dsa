package knapsack;

public class Solution {
  public int solveKnapsack(int[] profits, int[] weights, int capacity) {
    int profit = solveKnapsack(profits,weights,capacity,0);
    System.out.println(profit);
    return profit;
  }

   public int solveKnapsack(int[] profits, int[] weights, int capacity,int index) {

      if(capacity < 0 || index == profits.length)
          return 0;

     int profitWithInclusion =0;
     if(  capacity >= weights[index]){
        profitWithInclusion = profits[index] + solveKnapsack(profits,weights,capacity - weights[index],index +1);

     }
     int profitWithOutInclusion = solveKnapsack(profits,weights,capacity,index +1);
    
    return Math.max(profitWithInclusion,profitWithOutInclusion);
  }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solveKnapsack(new int[] { 4, 5, 3, 7 }, new int[] { 2, 3, 1, 4 },5);
    }
}