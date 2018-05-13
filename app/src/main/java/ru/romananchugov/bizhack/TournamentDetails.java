package ru.romananchugov.bizhack;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by romananchugov on 13.05.2018.
 */

@SuppressLint("ValidFragment")
public class TournamentDetails extends Fragment{

    private MainActivity activity;

    public TournamentDetails(MainActivity activity){
        this.activity = activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tournament_details, container, false);
        return v;
    }
}
