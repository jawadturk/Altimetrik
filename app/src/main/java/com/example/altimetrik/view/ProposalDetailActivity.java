

package com.example.altimetrik.view;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.example.altimetrik.R;
import com.example.altimetrik.databinding.ProposalDetailActivityBinding;
import com.example.altimetrik.model.ProposalsItem;
import com.example.altimetrik.viewmodel.ProposalDetailViewModel;

public class ProposalDetailActivity extends AppCompatActivity {

    private static final String EXTRA_PROPOSAL = "EXTRA_PROPOSAL";
    private ProposalDetailActivityBinding proposalDetailActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        proposalDetailActivityBinding =
                DataBindingUtil.setContentView(this, R.layout.proposal_detail_activity);
        getExtrasFromIntent();
    }

    public static Intent launchDetail(Context context, ProposalsItem proposalsItem) {
        Intent intent = new Intent(context, ProposalDetailActivity.class);
        intent.putExtra(EXTRA_PROPOSAL, proposalsItem);
        return intent;
    }

    private void getExtrasFromIntent() {
        ProposalsItem proposalsItem = (ProposalsItem) getIntent().getParcelableExtra(EXTRA_PROPOSAL);
        ProposalDetailViewModel proposalDetailViewModel = new ProposalDetailViewModel(proposalsItem);
        proposalDetailActivityBinding.setProposalDetailViewModel(proposalDetailViewModel);

    }
}
