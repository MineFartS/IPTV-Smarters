package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class SeriesActivityNewFlowM3U_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SeriesActivityNewFlowM3U f26340b;

    public SeriesActivityNewFlowM3U_ViewBinding(SeriesActivityNewFlowM3U seriesActivityNewFlowM3U, View view) {
        this.f26340b = seriesActivityNewFlowM3U;
        seriesActivityNewFlowM3U.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        seriesActivityNewFlowM3U.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        seriesActivityNewFlowM3U.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        seriesActivityNewFlowM3U.activityLogin = (LinearLayout) c.c(view, R.id.main_layout, "field 'activityLogin'", LinearLayout.class);
        seriesActivityNewFlowM3U.pbPagingLoader = (ProgressBar) c.c(view, R.id.pb_paging_loader, "field 'pbPagingLoader'", ProgressBar.class);
        seriesActivityNewFlowM3U.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        seriesActivityNewFlowM3U.tvNoRecordFound = (TextView) c.c(view, R.id.empty_view, "field 'tvNoRecordFound'", TextView.class);
        seriesActivityNewFlowM3U.frameLayout = (FrameLayout) c.c(view, R.id.fl_frame, "field 'frameLayout'", FrameLayout.class);
        seriesActivityNewFlowM3U.home = (TextView) c.c(view, R.id.home, "field 'home'", TextView.class);
        seriesActivityNewFlowM3U.rl_vod_layout = (RelativeLayout) c.c(view, R.id.rl_vod_layout, "field 'rl_vod_layout'", RelativeLayout.class);
        seriesActivityNewFlowM3U.tvSettings = (TextView) c.c(view, R.id.tv_settings, "field 'tvSettings'", TextView.class);
        seriesActivityNewFlowM3U.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        seriesActivityNewFlowM3U.iv_back_button = (ImageView) c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
        seriesActivityNewFlowM3U.rl_no_arrangement_found = (RelativeLayout) c.c(view, R.id.rl_no_arrangement_found, "field 'rl_no_arrangement_found'", RelativeLayout.class);
        seriesActivityNewFlowM3U.bt_explore_all = (Button) c.c(view, R.id.bt_explore_all, "field 'bt_explore_all'", Button.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        SeriesActivityNewFlowM3U seriesActivityNewFlowM3U = this.f26340b;
        if (seriesActivityNewFlowM3U == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26340b = null;
        seriesActivityNewFlowM3U.pbLoader = null;
        seriesActivityNewFlowM3U.toolbar = null;
        seriesActivityNewFlowM3U.appbarToolbar = null;
        seriesActivityNewFlowM3U.activityLogin = null;
        seriesActivityNewFlowM3U.pbPagingLoader = null;
        seriesActivityNewFlowM3U.myRecyclerView = null;
        seriesActivityNewFlowM3U.tvNoRecordFound = null;
        seriesActivityNewFlowM3U.frameLayout = null;
        seriesActivityNewFlowM3U.home = null;
        seriesActivityNewFlowM3U.rl_vod_layout = null;
        seriesActivityNewFlowM3U.tvSettings = null;
        seriesActivityNewFlowM3U.logo = null;
        seriesActivityNewFlowM3U.iv_back_button = null;
        seriesActivityNewFlowM3U.rl_no_arrangement_found = null;
        seriesActivityNewFlowM3U.bt_explore_all = null;
    }
}
