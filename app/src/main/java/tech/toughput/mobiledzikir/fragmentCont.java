package tech.toughput.mobiledzikir;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class fragmentCont extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_cont);


        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        viewPager.setAdapter(new FragmentAdapter(getSupportFragmentManager()));

        tabLayout.setTabTextColors(getResources().getColor(R.color.colorPrimaryDark),getResources().getColor(R.color.wrntabfragment));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

    }
}
