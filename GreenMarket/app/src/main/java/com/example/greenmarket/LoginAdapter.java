package com.example.greenmarket;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;


public class LoginAdapter extends  FragmentPagerAdapter {
    private Context context;
    int totalTabs;

    public LoginAdapter(@NonNull FragmentManager fm, Context context,int totalTabs) {
        super(fm);
        this.totalTabs = totalTabs;
        this.context = context;
    }


    public Fragment getItem(int position){
        switch (position){
            case 0:
                LoginTabFragment loginTabFragment = new LoginTabFragment();
                return loginTabFragment;

            case 1:
                SignupTabFragment signupTabFragment = new SignupTabFragment();
                return signupTabFragment;

        }
        return new Fragment();

     }


    @Override
    public int getCount() {
        return totalTabs;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }
}
