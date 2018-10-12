package com.example.simea.simea.Classes;

import java.util.ArrayList;

public class Missions extends ArrayList<Mission> {

    public void GenerateRandom(int number)
    {
        for(int i = 0;i<number;i++)
        {
            this.add(new Mission(i,"this is a description","this is a detail"));
        }
    }
}
