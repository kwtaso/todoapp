package com.aklob.todoapp.tasks;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class TasksActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    public static final String TASKS_VIEWMODEL_TAG = "TASKS_VIEWMODEL_TAG";

//    private TasksViewModel mViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tasks_act);

        setupToolbar();

//        setupNavigationDrawer();

//        TasksFragment tasksFragment = findOrCreateViewFragment();
//
//        mViewModel = findOrCreateViewModel();
//        mViewModel.setNavigator(this);
//
//        // Link View and ViewModel
//        tasksFragment.setViewModel(mViewModel);

    }
    private void setupToolbar() {
        android.support.v7.widget.Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_launcher_background);
        ab.setDisplayHomeAsUpEnabled(true);
    }
//    private void setupNavigationDrawer() {
//        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
//        mDrawerLayout.setStatusBarBackground(R.color.colorPrimaryDark);
//        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//        if (navigationView != null) {
//            setupDrawerContent(navigationView);
//        }
//    }
}
