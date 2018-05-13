package ru.romananchugov.bizhack;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by romananchugov on 13.05.2018.
 */
@SuppressLint("ValidFragment")
public class StarterFragment extends Fragment {

    private ImageButton footballBtn;
    private MainActivity activity;

    public StarterFragment(MainActivity activity){
        this.activity = activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.starter_fragment, container, false);
        footballBtn = v.findViewById(R.id.football_sport_button);
        footballBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.addFragment(new TournamentDetails(activity));
            }
        });
        return v;
    }
}
