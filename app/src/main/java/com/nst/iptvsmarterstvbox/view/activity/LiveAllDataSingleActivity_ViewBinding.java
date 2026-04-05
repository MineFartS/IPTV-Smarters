package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class LiveAllDataSingleActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LiveAllDataSingleActivity f25775b;

    public LiveAllDataSingleActivity_ViewBinding(LiveAllDataSingleActivity liveAllDataSingleActivity, View view) {
        this.f25775b = liveAllDataSingleActivity;
        liveAllDataSingleActivity.rl_left = (RelativeLayout) c.c(view, R.id.rl_left, "field 'rl_left'", RelativeLayout.class);
        liveAllDataSingleActivity.rl_right = (RelativeLayout) c.c(view, R.id.rl_right, "field 'rl_right'", RelativeLayout.class);
        liveAllDataSingleActivity.iv_hamburger_sidebar = (ImageView) c.c(view, R.id.iv_hamburger_sidebar, "field 'iv_hamburger_sidebar'", ImageView.class);
        liveAllDataSingleActivity.rl_search_cat = (RelativeLayout) c.c(view, R.id.rl_search_cat, "field 'rl_search_cat'", RelativeLayout.class);
        liveAllDataSingleActivity.iv_close_sidebar = (ImageView) c.c(view, R.id.iv_close_sidebar, "field 'iv_close_sidebar'", ImageView.class);
        liveAllDataSingleActivity.recycler_view_left_sidebar = (RecyclerView) c.c(view, R.id.recycler_view_left_sidebar, "field 'recycler_view_left_sidebar'", RecyclerView.class);
        liveAllDataSingleActivity.recycler_view = (RecyclerView) c.c(view, R.id.recycler_view, "field 'recycler_view'", RecyclerView.class);
        liveAllDataSingleActivity.ll_series_data = (LinearLayout) c.c(view, R.id.ll_series_data, "field 'll_series_data'", LinearLayout.class);
        liveAllDataSingleActivity.ll_loader = (LinearLayout) c.c(view, R.id.ll_loader, "field 'll_loader'", LinearLayout.class);
        liveAllDataSingleActivity.tv_no_record_found = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tv_no_record_found'", TextView.class);
        liveAllDataSingleActivity.tv_main_cat_name = (TextView) c.c(view, R.id.tv_main_cat_name, "field 'tv_main_cat_name'", TextView.class);
        liveAllDataSingleActivity.et_search_left_side = (EditText) c.c(view, R.id.et_search_left_side, "field 'et_search_left_side'", EditText.class);
        liveAllDataSingleActivity.ll_no_cat_found = (LinearLayout) c.c(view, R.id.ll_no_cat_found, "field 'll_no_cat_found'", LinearLayout.class);
        liveAllDataSingleActivity.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        liveAllDataSingleActivity.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        liveAllDataSingleActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        liveAllDataSingleActivity.iv_back_button_1 = (ImageView) c.c(view, R.id.iv_back_button_1, "field 'iv_back_button_1'", ImageView.class);
        liveAllDataSingleActivity.iv_back_button_2 = (ImageView) c.c(view, R.id.iv_back_button_2, "field 'iv_back_button_2'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        LiveAllDataSingleActivity liveAllDataSingleActivity = this.f25775b;
        if (liveAllDataSingleActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25775b = null;
        liveAllDataSingleActivity.rl_left = null;
        liveAllDataSingleActivity.rl_right = null;
        liveAllDataSingleActivity.iv_hamburger_sidebar = null;
        liveAllDataSingleActivity.rl_search_cat = null;
        liveAllDataSingleActivity.iv_close_sidebar = null;
        liveAllDataSingleActivity.recycler_view_left_sidebar = null;
        liveAllDataSingleActivity.recycler_view = null;
        liveAllDataSingleActivity.ll_series_data = null;
        liveAllDataSingleActivity.ll_loader = null;
        liveAllDataSingleActivity.tv_no_record_found = null;
        liveAllDataSingleActivity.tv_main_cat_name = null;
        liveAllDataSingleActivity.et_search_left_side = null;
        liveAllDataSingleActivity.ll_no_cat_found = null;
        liveAllDataSingleActivity.toolbar = null;
        liveAllDataSingleActivity.appbarToolbar = null;
        liveAllDataSingleActivity.logo = null;
        liveAllDataSingleActivity.iv_back_button_1 = null;
        liveAllDataSingleActivity.iv_back_button_2 = null;
    }
}
