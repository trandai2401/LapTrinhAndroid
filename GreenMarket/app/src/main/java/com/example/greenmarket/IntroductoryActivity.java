package com.example.greenmarket;

import static java.util.Objects.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Objects;

public class IntroductoryActivity extends AppCompatActivity {
    ImageView logo,splashImage;
    TextView appName;
    LottieAnimationView lottieAnimationView;

    private static final  int NUM_PAGEs = 3;
    private ViewPager viewPager;
     ScreenSlidePagerAdapter pagerAdapter;
     Animation anim;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);

        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.app_name);
        splashImage = findViewById(R.id.img);
        lottieAnimationView = findViewById(R.id.lotte);

        viewPager = findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        anim = AnimationUtils.loadAnimation(this,R.anim.o_b_anim);
        viewPager.startAnimation(anim);


        splashImage.animate().translationY(-1600).setDuration(1500).setStartDelay(4000);
        logo.animate().translationY(1400).setDuration(1500).setStartDelay(4000);
        appName.animate().translationY(1400).setDuration(1500).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1400).setDuration(1500).setStartDelay(4000);
    }
    private  class  ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {


        public ScreenSlidePagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    OnBoardingFragment1 tab1 = new OnBoardingFragment1();
                    return tab1;
                case 1:
                    OnBoardingFragment2 tab2 = new OnBoardingFragment2();
                    return tab2;
                case 2:
                    OnBoardingFragment3 tab3 = new OnBoardingFragment3();
                    return tab3;
            }

            return null;
        }

        @Override
        public int getCount() {
            return NUM_PAGEs;
        }
    }
}