package com.huynhtinh.android.nekofee.controler.activity;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.support.v4.app.Fragment;

import com.huynhtinh.android.nekofee.controler.fragment.ListCafeFragment;

/**
 * Created by TINH HUYNH on 5/24/2017.
 */

public class ListCafeActivity extends SingleFragmentActivity {

    private static final String EXTRA_CURRENT_LOCATION = "currentLocationExtra";
    private static final String EXTRA_RADIUS = "radiusExtra";

//    private static Location sCurrentLocation;
//    private static int sRadius;

//    public static Location getCurrentLocation() {
//        return sCurrentLocation;
//    }

    public static Intent newIntent(Context packageContext, Location currentLocation, int radius){
        Intent intent = new Intent(packageContext, ListCafeActivity.class);
        intent.putExtra(EXTRA_CURRENT_LOCATION, currentLocation);
        intent.putExtra(EXTRA_RADIUS, radius);
//        sCurrentLocation = currentLocation;
//        sRadius = radius;
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        Location location = getIntent().getParcelableExtra(EXTRA_CURRENT_LOCATION);
        int radius = getIntent().getIntExtra(EXTRA_RADIUS, 0);
        return ListCafeFragment.newInstance(location, radius);
    }
}
