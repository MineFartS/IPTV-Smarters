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
public class VodActivityNewFlowSubCategories_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VodActivityNewFlowSubCategories f27142b;

    public VodActivityNewFlowSubCategories_ViewBinding(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories, View view) {
        this.f27142b = vodActivityNewFlowSubCategories;
        vodActivityNewFlowSubCategories.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        vodActivityNewFlowSubCategories.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        vodActivityNewFlowSubCategories.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        vodActivityNewFlowSubCategories.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        vodActivityNewFlowSubCategories.tvNoStream = (TextView) c.c(view, R.id.tv_noStream, "field 'tvNoStream'", TextView.class);
        vodActivityNewFlowSubCategories.tvNoRecordFound = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tvNoRecordFound'", TextView.class);
        vodActivityNewFlowSubCategories.tvViewProvider = (TextView) c.c(view, R.id.tv_view_provider, "field 'tvViewProvider'", TextView.class);
        vodActivityNewFlowSubCategories.vodCategoryName = (TextView) c.c(view, R.id.tv_settings, "field 'vodCategoryName'", TextView.class);
        vodActivityNewFlowSubCategories.rl_sub_cat = (RelativeLayout) c.c(view, R.id.rl_sub_cat, "field 'rl_sub_cat'", RelativeLayout.class);
        vodActivityNewFlowSubCategories.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        vodActivityNewFlowSubCategories.iv_back_button = (ImageView) c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories = this.f27142b;
        if (vodActivityNewFlowSubCategories == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f27142b = null;
        vodActivityNewFlowSubCategories.toolbar = null;
        vodActivityNewFlowSubCategories.appbarToolbar = null;
        vodActivityNewFlowSubCategories.pbLoader = null;
        vodActivityNewFlowSubCategories.myRecyclerView = null;
        vodActivityNewFlowSubCategories.tvNoStream = null;
        vodActivityNewFlowSubCategories.tvNoRecordFound = null;
        vodActivityNewFlowSubCategories.tvViewProvider = null;
        vodActivityNewFlowSubCategories.vodCategoryName = null;
        vodActivityNewFlowSubCategories.rl_sub_cat = null;
        vodActivityNewFlowSubCategories.logo = null;
        vodActivityNewFlowSubCategories.iv_back_button = null;
    }
}
