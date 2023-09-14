

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class solution {
    public int[] sum(int[] numbs, int target) {
        Map<Integer,Integer>complements=new HashMap<>();
        for (int i = 0; i < numbs.length;i++)
        {
                 Integer complementIndex=complements.get(numbs[i]);
                 if(complementIndex!= null){
                     return new int[]{i,complementIndex};
                 }
                 complements.put(target - numbs[i],i);
        }
        return numbs;
    }
}
public class Using_Hashmap {
    public static void main(String[] args) {
        int[] s = new int[]{1, 2, 3, 4};
        int o = 6;
        solution a;
        a = new solution();
        System.out.println(Arrays.toString(a.sum(s, o)));

    }
}