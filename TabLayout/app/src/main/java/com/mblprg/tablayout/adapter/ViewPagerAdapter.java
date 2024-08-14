package com.mblprg.tablayout.adapter;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.mblprg.tablayout.DashboardFragment;
import com.mblprg.tablayout.HomeFragment;
import com.mblprg.tablayout.SettingsFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity){
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return  new DashboardFragment();
            case 2:
                return new SettingsFragment();
            default:
                return new HomeFragment();
        }

    }
    @Override
    public int getItemCount() {
        return 4;
    }
}
