package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class TVArchiveActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TVArchiveActivity f26860b;

    public TVArchiveActivity_ViewBinding(TVArchiveActivity tVArchiveActivity, View view) {
        this.f26860b = tVArchiveActivity;
        tVArchiveActivity.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        tVArchiveActivity.slidingTabs = (TabLayout) c.c(view, R.id.sliding_tabs, "field 'slidingTabs'", TabLayout.class);
        tVArchiveActivity.viewpager = (ViewPager) c.c(view, R.id.viewpager, "field 'viewpager'", ViewPager.class);
        tVArchiveActivity.tvHeaderTitle = (ImageView) c.c(view, R.id.tv_header_title, "field 'tvHeaderTitle'", ImageView.class);
        tVArchiveActivity.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        tVArchiveActivity.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        TVArchiveActivity tVArchiveActivity = this.f26860b;
        if (tVArchiveActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26860b = null;
        tVArchiveActivity.pbLoader = null;
        tVArchiveActivity.slidingTabs = null;
        tVArchiveActivity.viewpager = null;
        tVArchiveActivity.tvHeaderTitle = null;
        tVArchiveActivity.toolbar = null;
        tVArchiveActivity.appbarToolbar = null;
    }
}
