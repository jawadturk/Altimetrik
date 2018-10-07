package com.example.altimetrik.viewmodel;

import android.content.Context;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.altimetrik.AltimetrikApplication;
import com.example.altimetrik.R;
import com.example.altimetrik.data.DataService;
import com.example.altimetrik.model.ProposalsItem;
import com.example.altimetrik.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public class MainViewModel extends Observable {
    private final String TAG = MainViewModel.class.getSimpleName();
    public ObservableInt proposalsProgress;
    public ObservableInt proposalsRecycler;
    public ObservableField<String> mainSearchField;
    private List<ProposalsItem> proposalsItemList;
    private Context context;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public MainViewModel(@NonNull Context context) {

        this.context = context;
        this.proposalsItemList = new ArrayList<>();
        proposalsProgress = new ObservableInt(View.GONE);
        proposalsRecycler = new ObservableInt(View.VISIBLE);
        mainSearchField = new ObservableField<>("");

    }


    public void onLoadData() {
        initializeViews();
        Map queryParametersMap = new HashMap();
        queryParametersMap.put("APIKey", "DONORSCHOOSE");
        fetchData(queryParametersMap);
    }

    //It is "public" to show an example of test
    public void initializeViews() {
        proposalsRecycler.set(View.GONE);
        proposalsProgress.set(View.VISIBLE);
    }


    public void fetchData(Map queryParametersMap) {
        AltimetrikApplication altimetrikApplication = AltimetrikApplication.create(context);
        DataService dataService = altimetrikApplication.getDataService();

        Disposable disposable = dataService.fetchResult(queryParametersMap)
                .subscribeOn(altimetrikApplication.subscribeScheduler())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Result>() {
                    @Override
                    public void accept(Result result) throws Exception {
                        changeProposalsDataSet(result.getProposals());
                        proposalsProgress.set(View.GONE);
                        proposalsRecycler.set(View.VISIBLE);

                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.d(TAG, throwable.getMessage());
                        Toast.makeText(context, R.string.error_loading, Toast.LENGTH_SHORT).show();
                        proposalsProgress.set(View.GONE);
                        proposalsRecycler.set(View.GONE);
                    }
                });

        compositeDisposable.add(disposable);
    }

    private void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    public void reset() {
        unSubscribeFromObservable();
        compositeDisposable = null;
        context = null;
    }

    private void changeProposalsDataSet(List<ProposalsItem> porposalList) {
        Log.d("Array Size", Integer.toString(porposalList.size()));
        proposalsItemList.clear();
        proposalsItemList.addAll(porposalList);
        setChanged();
        notifyObservers();
    }

    public List<ProposalsItem> getProposalsItemList() {
        return proposalsItemList;
    }

    public void onClickSearch(View view) {
        initializeViews();

        Map queryParametersMap = new HashMap();
        queryParametersMap.put("APIKey", "DONORSCHOOSE");
        queryParametersMap.put("keywords", mainSearchField.get());
        fetchData(queryParametersMap);
    }


}
