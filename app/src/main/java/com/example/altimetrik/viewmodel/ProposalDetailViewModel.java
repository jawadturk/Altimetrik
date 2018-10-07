

package com.example.altimetrik.viewmodel;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.altimetrik.model.ProposalsItem;

public class ProposalDetailViewModel {

    private ProposalsItem proposalsItem;

    public ProposalDetailViewModel(ProposalsItem proposalsItem) {
        this.proposalsItem = proposalsItem;
    }

    public String getTitle() {
        return proposalsItem.getTitle();
    }

    public String getShortDescription() {
        return proposalsItem.getShortDescription();
    }

    public String getFulfillmentTrailer() {
        return proposalsItem.getFulfillmentTrailer();
    }

    public String getDonors() {
        return proposalsItem.getNumDonors() + " Donors";
    }

    public String getCostToComplete() {
        return "$" + proposalsItem.getCostToComplete() + " Still Needed";
    }

    public String getTotalPrice() {
        return "$" + proposalsItem.getTotalPrice() + " Goal";
    }

    public String getTeacherName() {
        return proposalsItem.getTeacherName();
    }

    public int getPercentFunded() {
        return Integer.parseInt(proposalsItem.getPercentFunded());
    }

    public String getThumbnailImage() {
        return proposalsItem.getImageURL();
    }


    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        Glide.with(view.getContext()).load(imageUrl).into(view);
    }
}
