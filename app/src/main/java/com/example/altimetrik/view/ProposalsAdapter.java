
package com.example.altimetrik.view;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import com.example.altimetrik.R;
import com.example.altimetrik.databinding.ItemProposalBinding;
import com.example.altimetrik.model.ProposalsItem;
import com.example.altimetrik.viewmodel.ItemProposalViewModel;

import java.util.Collections;
import java.util.List;

public class ProposalsAdapter extends RecyclerView.Adapter<ProposalsAdapter.ProposalAdapterViewHolder> {

  private List<ProposalsItem> proposalsItemList;
  public ProposalsAdapter() {
    this.proposalsItemList = Collections.emptyList();
  }

  @Override public ProposalAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    ItemProposalBinding itemProposalBinding =
        DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_proposal,
            parent, false);
    return new ProposalAdapterViewHolder(itemProposalBinding);
  }

  @Override public void onBindViewHolder(ProposalAdapterViewHolder holder, int position) {
    holder.bindProposal(proposalsItemList.get(position));
  }

  @Override public int getItemCount() {
    return proposalsItemList.size();
  }

  public void setProposalsList(List<ProposalsItem> proposalsItemList) {
    this.proposalsItemList = proposalsItemList;
    notifyDataSetChanged();
  }

  public static class ProposalAdapterViewHolder extends RecyclerView.ViewHolder {
    ItemProposalBinding mItemProposalBinding;

    public ProposalAdapterViewHolder(ItemProposalBinding itemProposalBinding) {
      super(itemProposalBinding.rootView);
      this.mItemProposalBinding = itemProposalBinding;
    }

    void bindProposal(ProposalsItem proposalsItem) {
      if (mItemProposalBinding.getItemProposalViewModel() == null) {
        mItemProposalBinding.setItemProposalViewModel(
            new ItemProposalViewModel(proposalsItem, itemView.getContext()));
      } else {
        mItemProposalBinding.getItemProposalViewModel().setProposalsItem(proposalsItem);
      }
    }
  }
}
