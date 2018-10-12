package com.example.simea.simea.Classes;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class Mission {



    private int id;
    private String description;
    private String details;

    //region These are the getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    //endregion


    public Mission(int id, String description, String details) {
        this.id = id;
        this.description = description;
        this.details = details;
    }

}
