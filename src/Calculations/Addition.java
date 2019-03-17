package Calculations;

import java.util.*;

public class Addition {
    int sum;
    public int disp(ArrayList<Integer> l)
    {
    sum=0;
    for(int i=0;i<l.size();i++)
    {
    sum=sum+l.get(i);
    }
    return sum;
}
}
