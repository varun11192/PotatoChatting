package com.varunsen.potatofarm.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.varunsen.potatofarm.Fragments.CallsFragment;
import com.varunsen.potatofarm.Fragments.ChatsFragment;
import com.varunsen.potatofarm.Fragments.StatusFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {
    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0 : return new ChatsFragment();
            case 1 : return new CallsFragment();
            case 2 : return new StatusFragment();
            default: return new ChatsFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String title = null;
        if (position == 0){
             title = "Potatoes";
        }if (position == 1){
             title = "Peek";
        }if (position == 2){
             title = "Calls";
        }

        return title;
    }
}
