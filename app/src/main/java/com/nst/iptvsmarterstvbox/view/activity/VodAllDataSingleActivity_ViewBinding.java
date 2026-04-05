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
public class VodAllDataSingleActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VodAllDataSingleActivity f27185b;

    public VodAllDataSingleActivity_ViewBinding(VodAllDataSingleActivity vodAllDataSingleActivity, View view) {
        this.f27185b = vodAllDataSingleActivity;
        vodAllDataSingleActivity.rl_left = (RelativeLayout) c.c(view, R.id.rl_left, "field 'rl_left'", RelativeLayout.class);
        vodAllDataSingleActivity.rl_right = (RelativeLayout) c.c(view, R.id.rl_right, "field 'rl_right'", RelativeLayout.class);
        vodAllDataSingleActivity.iv_hamburger_sidebar = (ImageView) c.c(view, R.id.iv_hamburger_sidebar, "field 'iv_hamburger_sidebar'", ImageView.class);
        vodAllDataSingleActivity.rl_search_cat = (RelativeLayout) c.c(view, R.id.rl_search_cat, "field 'rl_search_cat'", RelativeLayout.class);
        vodAllDataSingleActivity.iv_close_sidebar = (ImageView) c.c(view, R.id.iv_close_sidebar, "field 'iv_close_sidebar'", ImageView.class);
        vodAllDataSingleActivity.recycler_view_left_sidebar = (RecyclerView) c.c(view, R.id.recycler_view_left_sidebar, "field 'recycler_view_left_sidebar'", RecyclerView.class);
        vodAllDataSingleActivity.recycler_view = (RecyclerView) c.c(view, R.id.recycler_view, "field 'recycler_view'", RecyclerView.class);
        vodAllDataSingleActivity.ll_series_data = (LinearLayout) c.c(view, R.id.ll_series_data, "field 'll_series_data'", LinearLayout.class);
        vodAllDataSingleActivity.ll_loader = (LinearLayout) c.c(view, R.id.ll_loader, "field 'll_loader'", LinearLayout.class);
        vodAllDataSingleActivity.tv_no_record_found = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tv_no_record_found'", TextView.class);
        vodAllDataSingleActivity.tv_main_cat_name = (TextView) c.c(view, R.id.tv_main_cat_name, "field 'tv_main_cat_name'", TextView.class);
        vodAllDataSingleActivity.et_search_left_side = (EditText) c.c(view, R.id.et_search_left_side, "field 'et_search_left_side'", EditText.class);
        vodAllDataSingleActivity.ll_no_cat_found = (LinearLayout) c.c(view, R.id.ll_no_cat_found, "field 'll_no_cat_found'", LinearLayout.class);
        vodAllDataSingleActivity.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        vodAllDataSingleActivity.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        vodAllDataSingleActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        vodAllDataSingleActivity.iv_back_button_1 = (ImageView) c.c(view, R.id.iv_back_button_1, "field 'iv_back_button_1'", ImageView.class);
        vodAllDataSingleActivity.iv_back_button_2 = (ImageView) c.c(view, R.id.iv_back_button_2, "field 'iv_back_button_2'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        VodAllDataSingleActivity vodAllDataSingleActivity = this.f27185b;
        if (vodAllDataSingleActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f27185b = null;
        vodAllDataSingleActivity.rl_left = null;
        vodAllDataSingleActivity.rl_right = null;
        vodAllDataSingleActivity.iv_hamburger_sidebar = null;
        vodAllDataSingleActivity.rl_search_cat = null;
        vodAllDataSingleActivity.iv_close_sidebar = null;
        vodAllDataSingleActivity.recycler_view_left_sidebar = null;
        vodAllDataSingleActivity.recycler_view = null;
        vodAllDataSingleActivity.ll_series_data = null;
        vodAllDataSingleActivity.ll_loader = null;
        vodAllDataSingleActivity.tv_no_record_found = null;
        vodAllDataSingleActivity.tv_main_cat_name = null;
        vodAllDataSingleActivity.et_search_left_side = null;
        vodAllDataSingleActivity.ll_no_cat_found = null;
        vodAllDataSingleActivity.toolbar = null;
        vodAllDataSingleActivity.appbarToolbar = null;
        vodAllDataSingleActivity.logo = null;
        vodAllDataSingleActivity.iv_back_button_1 = null;
        vodAllDataSingleActivity.iv_back_button_2 = null;
    }
}
