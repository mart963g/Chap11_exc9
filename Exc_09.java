package Exc_9;

import java.util.HashSet;
import java.util.Set;

public class Exc_09
{
    public static void main(String[] args)
    {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 2; i++)
        {
            set.add((int) (Math.random() * 10) + 1);
        }
        System.out.println(set);
        System.out.println(hasOdd(set));
    }

    public static boolean hasOdd(Set<Integer> set)
    {
        boolean res = false;
        if(set.isEmpty())
        {
            return res;
        }
        for (int i: set)
        {
            if(i%2==1)
                res = true;
        }
        return res;
    }

}
