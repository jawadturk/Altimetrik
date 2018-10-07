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

import android.view.View;


import com.example.altimetrik.data.data.FakeRandomUserGeneratorAPI;
import com.example.altimetrik.model.ProposalsItem;
import com.example.altimetrik.viewmodel.ProposalDetailViewModel;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class) public class ProposalDetailViewModelTest {

    private ProposalDetailViewModel proposalDetailViewModel;
    private ProposalsItem proposalsItem;

    @Before public void setUpDetailViewModelTest() {
        proposalsItem = FakeRandomUserGeneratorAPI.getProposal();
        proposalDetailViewModel = new ProposalDetailViewModel(proposalsItem);
    }

    @Test public void shouldGetTitle() throws Exception {
        assertEquals(proposalsItem.getTitle(), proposalDetailViewModel.getTitle());
    }

    @Test public void shouldGetDonors() throws Exception {
        String donors=proposalsItem.getNumDonors() + " Donors";
        assertEquals(donors, proposalDetailViewModel.getDonors());
    }

    @Test public void shouldGetCell() throws Exception {
        assertEquals(proposalsItem.getImageURL(), proposalDetailViewModel.getThumbnailImage());
    }

    @Test public void shouldGetTeacherName() throws Exception {
        assertEquals(proposalsItem.getTeacherName(), proposalDetailViewModel.getTeacherName());
    }

    @Test public void shouldGetShortDescription() throws Exception {
        assertEquals(proposalsItem.getShortDescription(), proposalDetailViewModel.getShortDescription());
    }

    @Test public void shouldGetTrailer() throws Exception {
        assertEquals(proposalsItem.getFulfillmentTrailer(), proposalDetailViewModel.getFulfillmentTrailer());
    }

    @Test public void shouldGetTotalPrice() throws Exception {
       String totalPrice= "$" + proposalsItem.getTotalPrice() + " Goal";
        assertEquals(totalPrice, proposalDetailViewModel.getTotalPrice());
    }

    @Test public void shouldGetCostToComplete() throws Exception {
        String costTocomplete="$" + proposalsItem.getCostToComplete() + " Still Needed";
        assertEquals(costTocomplete, proposalDetailViewModel.getCostToComplete());
    }
}
