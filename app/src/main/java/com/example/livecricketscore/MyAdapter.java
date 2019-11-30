package com.example.livecricketscore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.net.ContentHandler;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private List<Model> modelList;
    private Context context;

    public MyAdapter(List<Model> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model model = modelList.get(position);
        holder.team1Tv.setText(model.getTeam1());
        holder.team2Tv.setText(model.getTeam2());
        holder.matchTypeTv.setText(model.getMatchType());
        holder.matchStatusTv.setText(model.getMatchStatus());
        holder.dateTv.setText(model.getDate());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView team1Tv, team2Tv, matchTypeTv, matchStatusTv, dateTv;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            team1Tv = itemView.findViewById(R.id.team1Tv);
            team2Tv = itemView.findViewById(R.id.team2Tv);
            matchTypeTv = itemView.findViewById(R.id.matchTypeTv);
            matchStatusTv = itemView.findViewById(R.id.matchStatusTv);
            dateTv = itemView.findViewById(R.id.dateTv);
            cardView = itemView.findViewById(R.id.cardView);



        }
    }
}
