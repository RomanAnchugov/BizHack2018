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
        holder.bindItem(items.get(position));
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

        public void bindItem(MatchupListItem item){
            homeTeam.setTeamTextView(item.getTeamHome().toString());
            awayTeam.setTeamTextView(item.getTeamAway().toString());

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

            if(item.getTeamHome().logoName.equals("1.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a1a));
            }else if(item.getTeamHome().logoName.equals("2.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a2a));
            }else if(item.getTeamHome().logoName.equals("3.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a3a));
            }else if(item.getTeamHome().logoName.equals("4.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a4a));
            }else if(item.getTeamHome().logoName.equals("5.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a5a));
            }else if(item.getTeamHome().logoName.equals("6.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a6a));
            }else if(item.getTeamHome().logoName.equals("7.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a7a));
            }else if(item.getTeamHome().logoName.equals("8.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a8a));
            }else if(item.getTeamHome().logoName.equals("9.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a9a));
            }else if(item.getTeamHome().logoName.equals("10.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a10a));
            }else if(item.getTeamHome().logoName.equals("11.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a11a));
            }else if(item.getTeamHome().logoName.equals("12.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a12a));
            }else if(item.getTeamHome().logoName.equals("13.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a13a));
            }else if(item.getTeamHome().logoName.equals("14.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a2a));
            }else if(item.getTeamHome().logoName.equals("15.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a15a));
            }else if(item.getTeamHome().logoName.equals("16.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a16a));
            }else if(item.getTeamHome().logoName.equals("17.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a17a));
            }else if(item.getTeamHome().logoName.equals("18.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a18a));
            }else if(item.getTeamHome().logoName.equals("19.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a19a));
            }else if(item.getTeamHome().logoName.equals("20.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a2a));
            }else if(item.getTeamHome().logoName.equals("21.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a21a));
            }else if(item.getTeamHome().logoName.equals("22.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a22a));
            }else if(item.getTeamHome().logoName.equals("23.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a23a));
            }else if(item.getTeamHome().logoName.equals("24.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a24a));
            }else if(item.getTeamHome().logoName.equals("25.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a25a));
            }else if(item.getTeamHome().logoName.equals("26.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a26a));
            }else if(item.getTeamHome().logoName.equals("27.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a27a));
            }else if(item.getTeamHome().logoName.equals("28.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a28a));
            }else if(item.getTeamHome().logoName.equals("29.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a29a));
            }else if(item.getTeamHome().logoName.equals("30.jpg")){
                homeTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a30a));
            }


            if(item.getTeamAway().logoName.equals("1.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a1a));
            }else if(item.getTeamAway().logoName.equals("2.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a2a));
            }else if(item.getTeamAway().logoName.equals("3.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a3a));
            }else if(item.getTeamAway().logoName.equals("4.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a4a));
            }else if(item.getTeamAway().logoName.equals("5.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a5a));
            }else if(item.getTeamAway().logoName.equals("6.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a6a));
            }else if(item.getTeamAway().logoName.equals("7.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a7a));
            }else if(item.getTeamAway().logoName.equals("8.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a8a));
            }else if(item.getTeamAway().logoName.equals("9.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a9a));
            }else if(item.getTeamAway().logoName.equals("10.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a10a));
            }else if(item.getTeamAway().logoName.equals("11.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a11a));
            }else if(item.getTeamAway().logoName.equals("12.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a12a));
            }else if(item.getTeamAway().logoName.equals("13.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a13a));
            }else if(item.getTeamAway().logoName.equals("14.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a2a));
            }else if(item.getTeamAway().logoName.equals("15.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a15a));
            }else if(item.getTeamAway().logoName.equals("16.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a16a));
            }else if(item.getTeamAway().logoName.equals("17.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a17a));
            }else if(item.getTeamAway().logoName.equals("18.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a18a));
            }else if(item.getTeamAway().logoName.equals("19.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a19a));
            }else if(item.getTeamAway().logoName.equals("20.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a2a));
            }else if(item.getTeamAway().logoName.equals("21.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a21a));
            }else if(item.getTeamAway().logoName.equals("22.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a22a));
            }else if(item.getTeamAway().logoName.equals("23.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a23a));
            }else if(item.getTeamAway().logoName.equals("24.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a24a));
            }else if(item.getTeamAway().logoName.equals("25.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a25a));
            }else if(item.getTeamAway().logoName.equals("26.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a26a));
            }else if(item.getTeamAway().logoName.equals("27.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a27a));
            }else if(item.getTeamAway().logoName.equals("28.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a28a));
            }else if(item.getTeamAway().logoName.equals("29.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a29a));
            }else if(item.getTeamAway().logoName.equals("30.jpg")){
                awayTeam.setTeamImageDrawable(activity.getResources().getDrawable(R.drawable.a30a));
            }
        }
    }
}
