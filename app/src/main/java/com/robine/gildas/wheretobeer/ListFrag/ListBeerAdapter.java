package com.robine.gildas.wheretobeer.ListFrag;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.robine.gildas.wheretobeer.Beer;
import com.robine.gildas.wheretobeer.R;

import java.util.ArrayList;

public class ListBeerAdapter extends RecyclerView.Adapter<ListBeerViewHolder> {

    private ArrayList<Beer> beers;

    public ListBeerAdapter (ArrayList<Beer> beers){this.beers = beers; };



    @NonNull
    @Override
    public ListBeerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.listicon,parent,false);

        return new ListBeerViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull ListBeerViewHolder holder, int position) {
        Beer beerToDisplay = this.beers.get(position);
        holder.txtName.setText(beerToDisplay.getName());
    }

    @Override
    public int getItemCount() {
        return this.beers.size();
    }
}
