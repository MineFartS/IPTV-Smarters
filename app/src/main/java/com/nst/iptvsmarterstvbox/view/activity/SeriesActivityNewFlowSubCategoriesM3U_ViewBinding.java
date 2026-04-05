package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
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
public class SeriesActivityNewFlowSubCategoriesM3U_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SeriesActivityNewFlowSubCategoriesM3U f26380b;

    public SeriesActivityNewFlowSubCategoriesM3U_ViewBinding(SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U, View view) {
        this.f26380b = seriesActivityNewFlowSubCategoriesM3U;
        seriesActivityNewFlowSubCategoriesM3U.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        seriesActivityNewFlowSubCategoriesM3U.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        seriesActivityNewFlowSubCategoriesM3U.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        seriesActivityNewFlowSubCategoriesM3U.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        seriesActivityNewFlowSubCategoriesM3U.tvNoStream = (TextView) c.c(view, R.id.tv_noStream, "field 'tvNoStream'", TextView.class);
        seriesActivityNewFlowSubCategoriesM3U.tvNoRecordFound = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tvNoRecordFound'", TextView.class);
        seriesActivityNewFlowSubCategoriesM3U.tvViewProvider = (TextView) c.c(view, R.id.tv_view_provider, "field 'tvViewProvider'", TextView.class);
        seriesActivityNewFlowSubCategoriesM3U.vodCategoryName = (TextView) c.c(view, R.id.tv_settings, "field 'vodCategoryName'", TextView.class);
        seriesActivityNewFlowSubCategoriesM3U.rl_sub_cat = (RelativeLayout) c.c(view, R.id.rl_sub_cat, "field 'rl_sub_cat'", RelativeLayout.class);
        seriesActivityNewFlowSubCategoriesM3U.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U = this.f26380b;
        if (seriesActivityNewFlowSubCategoriesM3U == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26380b = null;
        seriesActivityNewFlowSubCategoriesM3U.toolbar = null;
        seriesActivityNewFlowSubCategoriesM3U.appbarToolbar = null;
        seriesActivityNewFlowSubCategoriesM3U.pbLoader = null;
        seriesActivityNewFlowSubCategoriesM3U.myRecyclerView = null;
        seriesActivityNewFlowSubCategoriesM3U.tvNoStream = null;
        seriesActivityNewFlowSubCategoriesM3U.tvNoRecordFound = null;
        seriesActivityNewFlowSubCategoriesM3U.tvViewProvider = null;
        seriesActivityNewFlowSubCategoriesM3U.vodCategoryName = null;
        seriesActivityNewFlowSubCategoriesM3U.rl_sub_cat = null;
        seriesActivityNewFlowSubCategoriesM3U.logo = null;
    }
}
