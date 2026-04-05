package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class ViewDetailsCastActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewDetailsCastActivity f26979b;

    public ViewDetailsCastActivity_ViewBinding(ViewDetailsCastActivity viewDetailsCastActivity, View view) {
        this.f26979b = viewDetailsCastActivity;
        viewDetailsCastActivity.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        viewDetailsCastActivity.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        viewDetailsCastActivity.rlAccountInfo = (RelativeLayout) c.c(view, R.id.rl_account_info, "field 'rlAccountInfo'", RelativeLayout.class);
        viewDetailsCastActivity.ivMovieImage = (ImageView) c.c(view, R.id.iv_movie_image, "field 'ivMovieImage'", ImageView.class);
        viewDetailsCastActivity.tvDODInfo = (TextView) c.c(view, R.id.tv_dod_info, "field 'tvDODInfo'", TextView.class);
        viewDetailsCastActivity.tvdetailprogressbar = (ProgressBar) c.c(view, R.id.tv_detail_ProgressBar, "field 'tvdetailprogressbar'", ProgressBar.class);
        viewDetailsCastActivity.llPersonInfoBox = (LinearLayout) c.c(view, R.id.ll_person_info_box, "field 'llPersonInfoBox'", LinearLayout.class);
        viewDetailsCastActivity.scrollView = (ScrollView) c.c(view, R.id.scrollView, "field 'scrollView'", ScrollView.class);
        viewDetailsCastActivity.llDobBox = (LinearLayout) c.c(view, R.id.ll_dob_box, "field 'llDobBox'", LinearLayout.class);
        viewDetailsCastActivity.llPobBox = (LinearLayout) c.c(view, R.id.ll_pob_box, "field 'llPobBox'", LinearLayout.class);
        viewDetailsCastActivity.llGenderBox = (LinearLayout) c.c(view, R.id.ll_gender_box, "field 'llGenderBox'", LinearLayout.class);
        viewDetailsCastActivity.llKnownForBox = (LinearLayout) c.c(view, R.id.ll_knownfor_box, "field 'llKnownForBox'", LinearLayout.class);
        viewDetailsCastActivity.llDodBox = (LinearLayout) c.c(view, R.id.ll_dod_box, "field 'llDodBox'", LinearLayout.class);
        viewDetailsCastActivity.llDobBoxInfo = (LinearLayout) c.c(view, R.id.ll_dob_box_info, "field 'llDobBoxInfo'", LinearLayout.class);
        viewDetailsCastActivity.llPobBoxInfo = (LinearLayout) c.c(view, R.id.ll_pob_box_info, "field 'llPobBoxInfo'", LinearLayout.class);
        viewDetailsCastActivity.llGenderBoxInfo = (LinearLayout) c.c(view, R.id.ll_gender_box_info, "field 'llGenderBoxInfo'", LinearLayout.class);
        viewDetailsCastActivity.llKnownForBoxInfo = (LinearLayout) c.c(view, R.id.ll_known_for_box_info, "field 'llKnownForBoxInfo'", LinearLayout.class);
        viewDetailsCastActivity.llDODBoxInfo = (LinearLayout) c.c(view, R.id.ll_dod_box_info, "field 'llDODBoxInfo'", LinearLayout.class);
        viewDetailsCastActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        viewDetailsCastActivity.rlTransparent = (RelativeLayout) c.c(view, R.id.rl_transparent, "field 'rlTransparent'", RelativeLayout.class);
        viewDetailsCastActivity.llDetailProgressBar = (LinearLayout) c.c(view, R.id.ll_detail_ProgressBar, "field 'llDetailProgressBar'", LinearLayout.class);
        viewDetailsCastActivity.llDetailLeftSide = (LinearLayout) c.c(view, R.id.ll_detail_left_side, "field 'llDetailLeftSide'", LinearLayout.class);
        viewDetailsCastActivity.llDetailRightSide = (LinearLayout) c.c(view, R.id.ll_detail_right_side, "field 'llDetailRightSide'", LinearLayout.class);
        viewDetailsCastActivity.rvCast = (RecyclerView) c.c(view, R.id.rv_cast, "field 'rvCast'", RecyclerView.class);
        viewDetailsCastActivity.tvCastName = (TextView) c.c(view, R.id.tv_cast_name, "field 'tvCastName'", TextView.class);
        viewDetailsCastActivity.tvPlaceOfBirth = (TextView) c.c(view, R.id.tv_place_of_birth, "field 'tvPlaceOfBirth'", TextView.class);
        viewDetailsCastActivity.tvGender = (TextView) c.c(view, R.id.tv_gender, "field 'tvGender'", TextView.class);
        viewDetailsCastActivity.tvKnownFor = (TextView) c.c(view, R.id.tv_known_for, "field 'tvKnownFor'", TextView.class);
        viewDetailsCastActivity.tvCastDesc = (TextView) c.c(view, R.id.tv_cast_description, "field 'tvCastDesc'", TextView.class);
        viewDetailsCastActivity.tvDateOfBirth = (TextView) c.c(view, R.id.tv_date_of_birth, "field 'tvDateOfBirth'", TextView.class);
        viewDetailsCastActivity.iv_back_button = (ImageView) c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ViewDetailsCastActivity viewDetailsCastActivity = this.f26979b;
        if (viewDetailsCastActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26979b = null;
        viewDetailsCastActivity.toolbar = null;
        viewDetailsCastActivity.appbarToolbar = null;
        viewDetailsCastActivity.rlAccountInfo = null;
        viewDetailsCastActivity.ivMovieImage = null;
        viewDetailsCastActivity.tvDODInfo = null;
        viewDetailsCastActivity.tvdetailprogressbar = null;
        viewDetailsCastActivity.llPersonInfoBox = null;
        viewDetailsCastActivity.scrollView = null;
        viewDetailsCastActivity.llDobBox = null;
        viewDetailsCastActivity.llPobBox = null;
        viewDetailsCastActivity.llGenderBox = null;
        viewDetailsCastActivity.llKnownForBox = null;
        viewDetailsCastActivity.llDodBox = null;
        viewDetailsCastActivity.llDobBoxInfo = null;
        viewDetailsCastActivity.llPobBoxInfo = null;
        viewDetailsCastActivity.llGenderBoxInfo = null;
        viewDetailsCastActivity.llKnownForBoxInfo = null;
        viewDetailsCastActivity.llDODBoxInfo = null;
        viewDetailsCastActivity.logo = null;
        viewDetailsCastActivity.rlTransparent = null;
        viewDetailsCastActivity.llDetailProgressBar = null;
        viewDetailsCastActivity.llDetailLeftSide = null;
        viewDetailsCastActivity.llDetailRightSide = null;
        viewDetailsCastActivity.rvCast = null;
        viewDetailsCastActivity.tvCastName = null;
        viewDetailsCastActivity.tvPlaceOfBirth = null;
        viewDetailsCastActivity.tvGender = null;
        viewDetailsCastActivity.tvKnownFor = null;
        viewDetailsCastActivity.tvCastDesc = null;
        viewDetailsCastActivity.tvDateOfBirth = null;
        viewDetailsCastActivity.iv_back_button = null;
    }
}
