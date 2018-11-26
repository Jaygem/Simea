package com.example.simea.simea.Classes;

import java.util.ArrayList;

public class TaskList extends ArrayList<Task>{
    public void GenerateRandom(int number)
    {
        for(int i = 0;i<number;i++)
        {
            this.add(new Task(i,"This is a task",false));
        }
    }
}
