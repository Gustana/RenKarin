package co.ambystic.renkarin.main.navigation.nav_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.ambystic.renkarin.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StockCarFragment extends Fragment {


    public StockCarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_stock_car, container, false);
    }

}
