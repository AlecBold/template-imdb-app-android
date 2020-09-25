package com.example.imdbapplication.pojo.casts;

import com.example.imdbapplication.pojo.IMDbObject;
import com.google.gson.annotations.SerializedName;

public class DirectorCast extends IMDbObject {
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
