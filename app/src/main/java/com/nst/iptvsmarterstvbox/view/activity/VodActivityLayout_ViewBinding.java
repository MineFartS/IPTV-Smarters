package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class VodActivityLayout_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VodActivityLayout f27047b;

    public VodActivityLayout_ViewBinding(VodActivityLayout vodActivityLayout, View view) {
        this.f27047b = vodActivityLayout;
        vodActivityLayout.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        vodActivityLayout.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        vodActivityLayout.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        vodActivityLayout.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        vodActivityLayout.tvNoStream = (TextView) c.c(view, R.id.tv_noStream, "field 'tvNoStream'", TextView.class);
        vodActivityLayout.tvNoRecordFound = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tvNoRecordFound'", TextView.class);
        vodActivityLayout.tvViewProvider = (TextView) c.c(view, R.id.tv_view_provider, "field 'tvViewProvider'", TextView.class);
        vodActivityLayout.vodCategoryName = (TextView) c.c(view, R.id.tv_settings, "field 'vodCategoryName'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        VodActivityLayout vodActivityLayout = this.f27047b;
        if (vodActivityLayout == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f27047b = null;
        vodActivityLayout.toolbar = null;
        vodActivityLayout.appbarToolbar = null;
        vodActivityLayout.pbLoader = null;
        vodActivityLayout.myRecyclerView = null;
        vodActivityLayout.tvNoStream = null;
        vodActivityLayout.tvNoRecordFound = null;
        vodActivityLayout.tvViewProvider = null;
        vodActivityLayout.vodCategoryName = null;
    }
}
