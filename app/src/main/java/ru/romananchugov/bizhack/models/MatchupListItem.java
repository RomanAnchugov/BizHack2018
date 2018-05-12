package ru.romananchugov.bizhack.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by romananchugov on 12.05.2018.
 */

public class MatchupListItem {
    @SerializedName("Starttime")
    public String date;
    @SerializedName("Status")
    public String status;
    @SerializedName("Location")
    public String location;
    @SerializedName("Team_Away")
    public String teamAwayName;
    @SerializedName("Team_Away_Score")
    public String teamAwayScore;
    @SerializedName("Team_Home")
    public String teamHomeName;
    @SerializedName("Team_Home_Score")
    public String teamHomeScore;


    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public String getLocation() {
        return location;
    }

    public String getTeamAwayName() {
        return teamAwayName;
    }

    public String getTeamAwayScore() {
        return teamAwayScore;
    }

    public String getTeamHomeName() {
        return teamHomeName;
    }

    public String getTeamHomeScore() {
        return teamHomeScore;
    }
}
