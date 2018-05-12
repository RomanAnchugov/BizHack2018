package ru.romananchugov.bizhack.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import ru.romananchugov.bizhack.MainActivity;
import ru.romananchugov.bizhack.R;
import ru.romananchugov.bizhack.adapters.MatchupListAdapter;
import ru.romananchugov.bizhack.models.MatchupListItem;
import ru.romananchugov.bizhack.network.RestApi;
import ru.romananchugov.bizhack.views.TeamView;

/**
 * Created by romananchugov on 12.05.2018.
 */
@SuppressLint("ValidFragment")
public class MatchupListFragment extends Fragment {
    private static final java.lang.String TAG = MatchupListFragment.class.getSimpleName();

    private MainActivity activity;

    private TeamView awayTeamView;
    private TeamView homeTeamView;
    private TextView nearestMatchDate;

    private RecyclerView recyclerView;
    private MatchupListAdapter adapter;
    private ArrayList<MatchupListItem> items;


    private MatchupListFragment(MainActivity activity){
        this.activity = activity;
    }
    public static MatchupListFragment newInstance(MainActivity activity){
        return new MatchupListFragment(activity);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.matchup_list_fragment, container, false);
        awayTeamView = v.findViewById(R.id.first_team_view);
        awayTeamView.setTeamTextView("Lol1");
        homeTeamView = v.findViewById(R.id.second_team_view);
        homeTeamView.setTeamTextView("Kek2");
        nearestMatchDate = v.findViewById(R.id.nearest_match_date_tv);
        nearestMatchDate.setText(getResources().getString(R.string.time_placeholder, "11:00"));

        recyclerView = v.findViewById(R.id.matchup_recycler_view);
        items = new ArrayList<>();
        adapter = new MatchupListAdapter(activity, items);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));

        Retrofit retrofit = activity.getRetrofit();
        RestApi restApi = retrofit.create(RestApi.class);

        final Call<ArrayList<MatchupListItem>> call = restApi.getMathList("");
        call.enqueue(new Callback<ArrayList<MatchupListItem>>() {
            @Override
            public void onResponse(Call<ArrayList<MatchupListItem>> call, Response<ArrayList<MatchupListItem>> response) {
                Log.i(TAG, "onResponse: " + response.body().size());
                if(response.body() != null){
                    items.addAll(response.body());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<ArrayList<MatchupListItem>> call, Throwable t) {
                Log.i(TAG, "onFailure: " + t.getCause() + " " + call.request().toString());
            }
        });
        
        


        return v;
    }
}
