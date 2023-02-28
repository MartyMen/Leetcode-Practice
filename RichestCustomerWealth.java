class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        int value = 0;
        for(int[] arr: accounts) 
        {
            int x = 0;
            for(int n: arr) 
            {
                x += n;
            }
        value = Math.max(value,x);
        }return value;
    }
}
