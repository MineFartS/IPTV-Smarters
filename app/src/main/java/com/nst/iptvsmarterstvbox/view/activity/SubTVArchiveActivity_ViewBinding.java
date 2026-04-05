package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class SubTVArchiveActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SubTVArchiveActivity f26783b;

    public SubTVArchiveActivity_ViewBinding(SubTVArchiveActivity subTVArchiveActivity, View view) {
        this.f26783b = subTVArchiveActivity;
        subTVArchiveActivity.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        subTVArchiveActivity.slidingTabs = (TabLayout) c.c(view, R.id.sliding_tabs, "field 'slidingTabs'", TabLayout.class);
        subTVArchiveActivity.viewpager = (ViewPager) c.c(view, R.id.viewpager, "field 'viewpager'", ViewPager.class);
        subTVArchiveActivity.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        subTVArchiveActivity.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        subTVArchiveActivity.tvNoRecordFound = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tvNoRecordFound'", TextView.class);
        subTVArchiveActivity.rlTvArchiveTitle = (RelativeLayout) c.c(view, R.id.rl_tv_archive_title, "field 'rlTvArchiveTitle'", RelativeLayout.class);
        subTVArchiveActivity.tvEpgRequired = (TextView) c.c(view, R.id.tv_egp_required, "field 'tvEpgRequired'", TextView.class);
        subTVArchiveActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        subTVArchiveActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        subTVArchiveActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        subTVArchiveActivity.iv_back_button = (ImageView) c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        SubTVArchiveActivity subTVArchiveActivity = this.f26783b;
        if (subTVArchiveActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26783b = null;
        subTVArchiveActivity.toolbar = null;
        subTVArchiveActivity.slidingTabs = null;
        subTVArchiveActivity.viewpager = null;
        subTVArchiveActivity.pbLoader = null;
        subTVArchiveActivity.appbarToolbar = null;
        subTVArchiveActivity.tvNoRecordFound = null;
        subTVArchiveActivity.rlTvArchiveTitle = null;
        subTVArchiveActivity.tvEpgRequired = null;
        subTVArchiveActivity.date = null;
        subTVArchiveActivity.time = null;
        subTVArchiveActivity.logo = null;
        subTVArchiveActivity.iv_back_button = null;
    }
}
