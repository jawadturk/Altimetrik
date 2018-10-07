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

import android.content.Intent;
import android.databinding.Observable;
import android.test.mock.MockContext;

import com.example.altimetrik.data.data.MockView;
import com.example.altimetrik.model.ProposalsItem;
import com.example.altimetrik.viewmodel.ItemProposalViewModel;


import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class) public class ItemProposalViewModelTest {

    private static final String PROPOSAL_TITLE_TEST = "Donation";
    private static final String PROPOSAL_SHORT_DESCRIPTION_TEST= "Need new chairs";
    private static final String PROPOSAL_TEACHER_NAME_TEST= "Jenny";
    private static final String PROPOSAL_THUMBNAIL_IMAGE_TEST= "https://storage.donorschoose.net/dc_prod/images/user/small/u4722310_sm.jpg?timestamp=1505729565296";
    private static final String PROPOSAL_STATE_TEST= "MI";
    private static final String PROPOSAL_CITY_TEST= "Southfield";
    private static final String PROPOSAL_SCHOOL_NAME_TEST= "Elementary";

    @Mock private MockContext mockContext;

    @Test public void shouldGetProposalTitle() throws Exception {
        ProposalsItem proposalsItem = new ProposalsItem();
        proposalsItem.setTitle(PROPOSAL_TITLE_TEST);
        ItemProposalViewModel itemProposalViewModel = new ItemProposalViewModel(proposalsItem, mockContext);
        assertEquals(proposalsItem.getTitle(), itemProposalViewModel.getTitle());
    }

    @Test public void shouldGetProposalShortDescription() throws Exception {
        ProposalsItem proposalsItem = new ProposalsItem();
        proposalsItem.setShortDescription(PROPOSAL_SHORT_DESCRIPTION_TEST);
        ItemProposalViewModel itemProposalViewModel = new ItemProposalViewModel(proposalsItem, mockContext);
        assertEquals(proposalsItem.getShortDescription(), itemProposalViewModel.getShortDescription());
    }
    @Test public void shouldGetTeacherName() throws Exception {
        ProposalsItem proposalsItem = new ProposalsItem();
        proposalsItem.setTeacherName(PROPOSAL_TEACHER_NAME_TEST);
        ItemProposalViewModel itemProposalViewModel = new ItemProposalViewModel(proposalsItem, mockContext);
        assertEquals(proposalsItem.getTeacherName(), itemProposalViewModel.getTeacherName());
    }
    @Ignore public void shouldGetThumbnailImage() throws Exception {
        ProposalsItem proposalsItem = new ProposalsItem();
        proposalsItem.setTeacherName(PROPOSAL_THUMBNAIL_IMAGE_TEST);
        ItemProposalViewModel itemProposalViewModel = new ItemProposalViewModel(proposalsItem, mockContext);
        assertEquals(proposalsItem.getImageURL(), itemProposalViewModel.getThumbnailImage());
    }

    @Test public void shouldGetSchoolLocation() throws Exception {
        ProposalsItem proposalsItem = new ProposalsItem();
        proposalsItem.setState(PROPOSAL_STATE_TEST);
        proposalsItem.setCity(PROPOSAL_CITY_TEST);
        proposalsItem.setSchoolName(PROPOSAL_SCHOOL_NAME_TEST);
        ItemProposalViewModel itemProposalViewModel = new ItemProposalViewModel(proposalsItem, mockContext);
        assertEquals(proposalsItem.getSchoolName() + " ." + proposalsItem.getCity() + " ," + proposalsItem.getState(), itemProposalViewModel.getSchoolDetails());
    }

    @Test public void shouldStartProposaleDetailActivityOnItemClick() throws Exception {
        ProposalsItem proposalsItem = new ProposalsItem();
        ItemProposalViewModel itemProposalViewModel = new ItemProposalViewModel(proposalsItem, mockContext);
        itemProposalViewModel.onItemClick(new MockView(mockContext));
        verify(mockContext).startActivity(any(Intent.class));
    }

    @Test public void shouldNotifyPropertyChangeWhenSetPeople() throws Exception {
        ProposalsItem proposalsItem = new ProposalsItem();
        ItemProposalViewModel itemProposalViewModel = new ItemProposalViewModel(proposalsItem, mockContext);
        Observable.OnPropertyChangedCallback mockCallback = mock(Observable.OnPropertyChangedCallback.class);
        itemProposalViewModel.addOnPropertyChangedCallback(mockCallback);
        itemProposalViewModel.setProposalsItem(proposalsItem);
        verify(mockCallback).onPropertyChanged(any(Observable.class), anyInt());
    }
}
