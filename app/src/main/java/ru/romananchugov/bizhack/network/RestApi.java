package ru.romananchugov.bizhack.network;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.romananchugov.bizhack.models.MatchupListItem;

/**
 * Created by romananchugov on 12.05.2018.
 */

public interface RestApi {

    @GET("/api/matchup/list")
    Call<ArrayList<MatchupListItem>> getMathList(@Query("date") String date);


}
