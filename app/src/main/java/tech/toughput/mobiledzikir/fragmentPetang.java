package tech.toughput.mobiledzikir;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentPetang extends Fragment {

    ImageButton more2;
    LinearLayout tambahan2;


    public fragmentPetang() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_fragment_petang, container, false);
//        tambahan2 = view.findViewById(R.id.tambahan2);
//        tambahan2.setVisibility(View.INVISIBLE);
//
//        more2 = view.findViewById(R.id.more1);
//        more2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                tambahan2.setVisibility(View.VISIBLE);
//            }
//        });
        return inflater.inflate(R.layout.fragment_fragment_petang, container, false);
    }

}
