package com.example.altimetrik.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.altimetrik.R;
import com.example.altimetrik.databinding.MainActivityBinding;
import com.example.altimetrik.viewmodel.MainViewModel;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity implements Observer {
    private MainViewModel mainViewModel;
    private MainActivityBinding mainActivityBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        initDataBinding();
        setupListProposalView(mainActivityBinding.listProposals);
        setupObserver(mainViewModel);
        mainViewModel.onLoadData();
    }

    private void initDataBinding() {
        mainActivityBinding = DataBindingUtil.setContentView(this, R.layout.main_activity);
        mainViewModel = new MainViewModel(this);
        mainActivityBinding.setMainViewModel(mainViewModel);
    }

    private void setupListProposalView(RecyclerView proposalsRecyclerView) {
        ProposalsAdapter adapter = new ProposalsAdapter();
        proposalsRecyclerView.setAdapter(adapter);
        proposalsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void setupObserver(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainViewModel.reset();
    }


    @Override
    public void update(Observable observable, Object data) {
        if (observable instanceof MainViewModel) {
            ProposalsAdapter proposalsAdapter = (ProposalsAdapter) mainActivityBinding.listProposals.getAdapter();
            MainViewModel proposalsViewModel = (MainViewModel) observable;
            proposalsAdapter.setProposalsList(proposalsViewModel.getProposalsItemList());
        }
    }
}
