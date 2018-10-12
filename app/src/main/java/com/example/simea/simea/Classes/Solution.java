package com.example.simea.simea.Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class Solution {
    private String id;
    private String title;
    private String Description;
    private ArrayList<String> steps;

    //region get set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public ArrayList<String> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<String> steps) {
        this.steps = steps;
    }
    //endregion


    public Solution(String id, String title, String description, ArrayList<String> steps) {
        this.id = id;
        this.title = title;
        Description = description;
        this.steps = steps;
    }

    public Solution(String id, String title, String description) {
        this.id = id;
        this.title = title;
        Description = description;
    }
}
