package com.aklob.todoapp.statistics;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;

import com.aklob.todoapp.R;

public class StatisticsActivity extends AppCompatActivity {
    public static final String STATS_VIEWMODEL_TAG = "ADD_EDIT_VIEWMODEL_TAG";

    private DrawerLayout mDrawerLayout;

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case android.R.id.home:
//                // Open the navigation drawer when the home icon is selected from the toolbar.
//                mDrawerLayout.openDrawer(GravityCompat.START);
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.statistics_act);

//        setupToolbar();
//
//        setupNavigationDrawer();
//
//        StatisticsFragment statisticsFragment = findOrCreateViewFragment();
//
//        StatisticsViewModel statisticsViewModel = findOrCreateViewModel();
//
//        // Link View and ViewModel
//        statisticsFragment.setViewModel(statisticsViewModel);
    }

}
