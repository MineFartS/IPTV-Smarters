package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class NewEPGActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NewEPGActivity f25972b;

    public NewEPGActivity_ViewBinding(NewEPGActivity newEPGActivity, View view) {
        this.f25972b = newEPGActivity;
        newEPGActivity.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        newEPGActivity.slidingTabs = (TabLayout) c.c(view, R.id.sliding_tabs, "field 'slidingTabs'", TabLayout.class);
        newEPGActivity.viewpager = (ViewPager) c.c(view, R.id.viewpager, "field 'viewpager'", ViewPager.class);
        newEPGActivity.tvHeaderTitle = (TextView) c.c(view, R.id.tv_header_title, "field 'tvHeaderTitle'", TextView.class);
        newEPGActivity.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        newEPGActivity.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        newEPGActivity.tv_cat_title = (TextView) c.c(view, R.id.tv_cat_title, "field 'tv_cat_title'", TextView.class);
        newEPGActivity.ll_header = (LinearLayout) c.c(view, R.id.ll_header, "field 'll_header'", LinearLayout.class);
        newEPGActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        newEPGActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        newEPGActivity.iv_back_button = (ImageView) c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
        newEPGActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        NewEPGActivity newEPGActivity = this.f25972b;
        if (newEPGActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25972b = null;
        newEPGActivity.pbLoader = null;
        newEPGActivity.slidingTabs = null;
        newEPGActivity.viewpager = null;
        newEPGActivity.tvHeaderTitle = null;
        newEPGActivity.toolbar = null;
        newEPGActivity.appbarToolbar = null;
        newEPGActivity.tv_cat_title = null;
        newEPGActivity.ll_header = null;
        newEPGActivity.date = null;
        newEPGActivity.time = null;
        newEPGActivity.iv_back_button = null;
        newEPGActivity.logo = null;
    }
}
