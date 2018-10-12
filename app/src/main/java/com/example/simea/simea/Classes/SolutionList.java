package com.example.simea.simea.Classes;

import java.util.ArrayList;

public class SolutionList extends ArrayList<Solution> {

    public void GenerateRandom(int number)
    {
        for(int i = 0;i<number;i++)
        {
            this.add(new Solution(String.valueOf(i),"this is a title","this is a description"));
        }
    }

}
