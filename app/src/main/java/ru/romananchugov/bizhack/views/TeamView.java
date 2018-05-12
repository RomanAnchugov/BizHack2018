package ru.romananchugov.bizhack.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import ru.romananchugov.bizhack.R;

/**
 * Created by romananchugov on 12.05.2018.
 */

public class TeamView extends LinearLayout {

    private ImageView teamImageView;
    private TextView teamTextView;

    public TeamView(Context context) {
        super(context);
        initViews();
    }

    public TeamView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initViews();
    }

    public TeamView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initViews();
    }

    private void initViews(){
        LayoutInflater.from(getContext()).inflate(R.layout.team_view, this);
        teamImageView = findViewById(R.id.team_image);
        teamTextView = findViewById(R.id.team_name_tv);
    }

    public void setTeamImageDrawable(Drawable drawable){
        teamImageView.setImageDrawable(drawable);
    }
    public void setTeamTextView(String teamName){
        teamTextView.setText(teamName);
    }




}
