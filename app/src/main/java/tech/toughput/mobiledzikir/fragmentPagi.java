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
public class fragmentPagi extends Fragment {

    LinearLayout tambahan1;
    ImageButton more1;


    public fragmentPagi() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_fragment_pagi, container, false);
//        tambahan1 = view.findViewById(R.id.tambahan1);
//        tambahan1.setVisibility(View.INVISIBLE);
//
//        more1 = view.findViewById(R.id.more1);
//        more1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                tambahan1.setVisibility(View.VISIBLE);
//            }
//        });
        return inflater.inflate(R.layout.fragment_fragment_pagi, container, false);

    }

}
