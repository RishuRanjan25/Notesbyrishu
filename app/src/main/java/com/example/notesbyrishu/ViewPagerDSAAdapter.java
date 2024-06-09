package com.example.notesbyrishu;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerDSAAdapter extends FragmentPagerAdapter {

    public ViewPagerDSAAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DSAnotesFragment();
        } else if (position==1) {
            return new DSAflochartFragment();
        } else {
            return new DSAquestionFragment();
        }
    }
    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "DSANotes";
        } else if (position==1) {
            return "DSAFlochart";
        }else {
            return "DSAQuestions";
        }
    }
}
