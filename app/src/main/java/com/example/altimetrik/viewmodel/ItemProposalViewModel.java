
package com.example.altimetrik.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.altimetrik.model.ProposalsItem;
import com.example.altimetrik.view.ProposalDetailActivity;


public class ItemProposalViewModel extends BaseObservable {

    private ProposalsItem proposalsItem;
    private Context context;

    public ItemProposalViewModel(ProposalsItem proposalsItem, Context context) {
        this.proposalsItem = proposalsItem;
        this.context = context;
    }

    public String getTitle() {
        return proposalsItem.getTitle();
    }

    public String getShortDescription() {
        return proposalsItem.getShortDescription();
    }

    public String getTeacherName() {
        return proposalsItem.getTeacherName();
    }

    public String getSchoolDetails() {
        return proposalsItem.getSchoolName() + " ." + proposalsItem.getCity() + " ," + proposalsItem.getState();
    }

    public String getThumbnailImage() {
        return proposalsItem.getImageURL();
    }

    @BindingAdapter("imageUrl")
    public static void setImageUrl(ImageView imageView, String url) {
        Glide.with(imageView.getContext()).load(url).into(imageView);
    }

    public void onItemClick(View view) {
        context.startActivity(ProposalDetailActivity.launchDetail(view.getContext(), proposalsItem));
    }

    public void setProposalsItem(ProposalsItem proposalsItem) {
        this.proposalsItem = proposalsItem;
        notifyChange();
    }
}
