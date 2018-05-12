package ru.romananchugov.bizhack.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ru.romananchugov.bizhack.MainActivity;
import ru.romananchugov.bizhack.R;
import ru.romananchugov.bizhack.models.MatchupListItem;
import ru.romananchugov.bizhack.views.TeamView;

/**
 * Created by romananchugov on 12.05.2018.
 */

public class MatchupListAdapter extends RecyclerView.Adapter<MatchupListAdapter.ViewHolder> {

    private static final java.lang.String TAG = MatchupListAdapter.class.getSimpleName();
    private List<MatchupListItem> items;
    private LinearLayout itemContainer;
    private MainActivity activity;


    public MatchupListAdapter(MainActivity activity, ArrayList<MatchupListItem> items){
        this.items = items;
        this.activity = activity;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        itemContainer = (LinearLayout) LayoutInflater.from(activity)
                .inflate(R.layout.matchup_list_item, parent, false);
        return new ViewHolder(itemContainer);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private LinearLayout item;
        private TeamView homeTeam;
        private TeamView awayTeam;
        private TextView statusTextView;
        private TextView dateTextView;
        private TextView scoreTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            item = (LinearLayout) itemView;
            homeTeam = item.findViewById(R.id.item_home_team);
            awayTeam = item.findViewById(R.id.item_away_team);
            statusTextView = item.findViewById(R.id.item_status);
            dateTextView = item.findViewById(R.id.item_date);
            scoreTextView = item.findViewById(R.id.item_score);
        }

        public void bindText(MatchupListItem item){
            homeTeam.setTeamTextView(item.getTeamHomeName());
            awayTeam.setTeamTextView(item.getTeamAwayName());

            dateTextView.setText(item.getDate());
            scoreTextView.setText(
                    activity.getResources().getString(R.string.score, item.getTeamHomeScore(), item.getTeamAwayScore()));

            if(item.getStatus().equals("1")) {
                statusTextView.setText("Finished");
                statusTextView.setBackgroundColor(activity.getResources().getColor(android.R.color.darker_gray));
            }else if(item.getStatus().equals("-1")){
                statusTextView.setText("Not started");
                statusTextView.setBackgroundColor(activity.getResources().getColor(android.R.color.holo_blue_light));
            }
        }
    }
}
