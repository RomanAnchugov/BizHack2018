package ru.romananchugov.bizhack;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

/**
 * Created by romananchugov on 13.05.2018.
 */

@SuppressLint("ValidFragment")
public class TournamentDetails extends Fragment{

    private MainActivity activity;
    private BottomNavigationView bottomNavigationMenuView;
    private ScrollView newsScroll;
    private ScrollView timelineScroll;

    public TournamentDetails(MainActivity activity){
        this.activity = activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tournament_details, container, false);
        bottomNavigationMenuView = v.findViewById(R.id.bottom_navigation);
        bottomNavigationMenuView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.join_menu_item:
                        newsScroll.setVisibility(View.GONE);
                        timelineScroll.setVisibility(View.VISIBLE);
                        break;
                    case R.id.news_menu_item:
                        newsScroll.setVisibility(View.VISIBLE);
                        timelineScroll.setVisibility(View.GONE);
                        break;

                }
                return true;
            }
        });

        newsScroll = v.findViewById(R.id.news_scroll);
        timelineScroll = v.findViewById(R.id.timeline_scroll);
        return v;
    }
}
