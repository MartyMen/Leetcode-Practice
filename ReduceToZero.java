class Solution {
    public int numberOfSteps(int num) 
    {
        int count = 0;
        while (num > 0)
        {
            if(num % 2 != 0)
            {
                num--;
                count++;
                System.out.println(count);
            }
            else if(num % 2 == 0)
            {
                num = num / 2;
                count++;
                System.out.print(count);
            }
        }
        return count;
    } 
}
