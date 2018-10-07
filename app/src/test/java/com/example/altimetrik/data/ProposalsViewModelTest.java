/**
 * Copyright 2016 Erik Jhordan Rey.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.altimetrik.data;

import android.test.mock.MockContext;
import android.view.View;

import com.example.altimetrik.data.data.FakeRandomUserGeneratorAPI;
import com.example.altimetrik.model.ProposalsItem;
import com.example.altimetrik.viewmodel.MainViewModel;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.List;

import io.reactivex.Observable;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.Silent.class) public class ProposalsViewModelTest {

    @Mock private DataService dataService;
    @Mock private MockContext mockContext;

    private MainViewModel mainViewModel;

    @Before public void setUpMainViewModelTest() {
        mainViewModel = new MainViewModel(mockContext);
    }

    @Test public void simulateGivenTheUserCallListFromApi() throws Exception {
        List<ProposalsItem> proposalsItemList = FakeRandomUserGeneratorAPI.getProposalsList();
        doReturn(Observable.just(proposalsItemList)).when(dataService).fetchResult(new HashMap<String, String>());
    }

    @Test public void ensureTheViewsAreInitializedCorrectly() throws Exception {
        mainViewModel.initializeViews();

        assertEquals(View.GONE, mainViewModel.proposalsRecycler.get());
        assertEquals(View.VISIBLE, mainViewModel.proposalsProgress.get());
    }
}
