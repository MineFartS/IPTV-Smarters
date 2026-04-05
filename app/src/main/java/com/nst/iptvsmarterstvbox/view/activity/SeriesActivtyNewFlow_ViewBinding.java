package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
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
public class SeriesActivtyNewFlow_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SeriesActivtyNewFlow f26410b;

    public SeriesActivtyNewFlow_ViewBinding(SeriesActivtyNewFlow seriesActivtyNewFlow, View view) {
        this.f26410b = seriesActivtyNewFlow;
        seriesActivtyNewFlow.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        seriesActivtyNewFlow.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        seriesActivtyNewFlow.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        seriesActivtyNewFlow.activityLogin = (LinearLayout) c.c(view, R.id.main_layout, "field 'activityLogin'", LinearLayout.class);
        seriesActivtyNewFlow.pbPagingLoader = (ProgressBar) c.c(view, R.id.pb_paging_loader, "field 'pbPagingLoader'", ProgressBar.class);
        seriesActivtyNewFlow.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        seriesActivtyNewFlow.tvNoRecordFound = (TextView) c.c(view, R.id.empty_view, "field 'tvNoRecordFound'", TextView.class);
        seriesActivtyNewFlow.frameLayout = (FrameLayout) c.c(view, R.id.fl_frame, "field 'frameLayout'", FrameLayout.class);
        seriesActivtyNewFlow.home = (TextView) c.c(view, R.id.home, "field 'home'", TextView.class);
        seriesActivtyNewFlow.rl_vod_layout = (RelativeLayout) c.c(view, R.id.rl_vod_layout, "field 'rl_vod_layout'", RelativeLayout.class);
        seriesActivtyNewFlow.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        SeriesActivtyNewFlow seriesActivtyNewFlow = this.f26410b;
        if (seriesActivtyNewFlow == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26410b = null;
        seriesActivtyNewFlow.pbLoader = null;
        seriesActivtyNewFlow.toolbar = null;
        seriesActivtyNewFlow.appbarToolbar = null;
        seriesActivtyNewFlow.activityLogin = null;
        seriesActivtyNewFlow.pbPagingLoader = null;
        seriesActivtyNewFlow.myRecyclerView = null;
        seriesActivtyNewFlow.tvNoRecordFound = null;
        seriesActivtyNewFlow.frameLayout = null;
        seriesActivtyNewFlow.home = null;
        seriesActivtyNewFlow.rl_vod_layout = null;
        seriesActivtyNewFlow.logo = null;
    }
}
