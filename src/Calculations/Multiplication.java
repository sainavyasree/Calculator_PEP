package Calculations;

import java.util.*;
public class Multiplication {
        int result;
        public int disp(ArrayList<Integer> l)
        {
         result=1;   
        for(int i=0;i<l.size();i++)
        {
        result=result*l.get(i);
        }
        return result;
    }
    }
