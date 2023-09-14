

import java.util.Arrays;

class Solution{

    public int[] sum(int[] numbs, int target) {
        for (int i = 0; i < numbs.length;i++)
        {
            for(int j=i+1;j< numbs.length;j++)
            {
                if(numbs[i]+numbs[j]==target) {
                    return new int[]{i, j};
                }

            }
        }
        return numbs;
    }
}
public class Leetcode_one {
    public static void main(String[] args) {
        int[] s = new int[]{1, 2, 3, 4};
        int o = 4;
        solution a;
        a = new solution();
        System.out.println(Arrays.toString(a.sum(s, o)));

    }
}