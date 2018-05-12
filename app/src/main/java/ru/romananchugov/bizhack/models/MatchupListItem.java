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
    public Team teamAway;
    @SerializedName("Team_Away_Score")
    public String teamAwayScore;
    @SerializedName("Team_Home")
    public Team teamHome;
    @SerializedName("Team_Home_Score")
    public String teamHomeScore;
    @SerializedName("CurrentQuarter")
    public String quater;

    public String getQuater() {
        return quater;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public String getLocation() {
        return location;
    }

    public Team getTeamAway() {
        return teamAway;
    }

    public String getTeamAwayScore() {
        return teamAwayScore;
    }

    public Team getTeamHome() {
        return teamHome;
    }

    public String getTeamHomeScore() {
        return teamHomeScore;
    }
}
