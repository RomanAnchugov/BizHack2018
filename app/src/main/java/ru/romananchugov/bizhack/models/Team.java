package ru.romananchugov.bizhack.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by romananchugov on 12.05.2018.
 */

public class Team {
    @SerializedName("TeamName")
    public String teamName;

    @SerializedName("Logo")
    public String logoName;

    @Override
    public String toString() {
        return teamName;
    }
}
