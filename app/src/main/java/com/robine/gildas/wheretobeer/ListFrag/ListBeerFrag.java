package com.robine.gildas.wheretobeer.ListFrag;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.robine.gildas.wheretobeer.Beer;
import com.robine.gildas.wheretobeer.R;

import java.io.Serializable;
import java.util.ArrayList;


public class ListBeerFrag extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "list";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private ArrayList<Beer> beers;
    private RecyclerView recyclerView;
    private ListBeerAdapter listBeerAdapter;
    private ImageView cellarImg;

    public ListBeerFrag() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    /*public static ListBeerFrag newInstance(String param1, String param2) {
        ListBeerFrag fragment = new ListBeerFrag();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }*/

    /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            Serializable s = getArguments().getSerializable(ARG_PARAM1);
            beers = (ArrayList<Beer>) s ;
        }
    }*/



    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment


        /*View rootView = inflater.inflate(R.layout.fragment_frag_obj1, container, false);




        recyclerView = rootView.findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManagerManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManagerManager);
        listBeerAdapter = new ListBeerAdapter(beers) ;
        listBeerAdapter.notifyDataSetChanged();
        recyclerView.setAdapter(listBeerAdapter);




        return  rootView;*/


        return inflater.inflate(R.layout.fragment_frag_obj1, container, false);
    }
}
