package tech.toughput.mobiledzikir;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ASUS-X454Y on 19/04/2019.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    String[] title = new String[]{
      "Dzikir Pagi" , "Dzikir Petang"
    };

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new fragmentPagi();
                break;
            case 1:
                fragment = new fragmentPetang();
                break;
            default:
                fragment = null;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        return title[position];
    }

}
