package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class TVArchiveActivityNewFlow_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TVArchiveActivityNewFlow f26859b;

    public TVArchiveActivityNewFlow_ViewBinding(TVArchiveActivityNewFlow tVArchiveActivityNewFlow, View view) {
        this.f26859b = tVArchiveActivityNewFlow;
        tVArchiveActivityNewFlow.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        tVArchiveActivityNewFlow.viewpager = (ViewPager) c.c(view, R.id.viewpager, "field 'viewpager'", ViewPager.class);
        tVArchiveActivityNewFlow.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        tVArchiveActivityNewFlow.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        tVArchiveActivityNewFlow.pbPagingLoader = (ProgressBar) c.c(view, R.id.pb_paging_loader, "field 'pbPagingLoader'", ProgressBar.class);
        tVArchiveActivityNewFlow.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        tVArchiveActivityNewFlow.emptyView = (TextView) c.c(view, R.id.empty_view, "field 'emptyView'", TextView.class);
        tVArchiveActivityNewFlow.frameLayout = (FrameLayout) c.c(view, R.id.fl_frame, "field 'frameLayout'", FrameLayout.class);
        tVArchiveActivityNewFlow.ivBTUP = (ImageView) c.c(view, R.id.iv_bt_up, "field 'ivBTUP'", ImageView.class);
        tVArchiveActivityNewFlow.tvNoStream = (TextView) c.c(view, R.id.tv_noStream, "field 'tvNoStream'", TextView.class);
        tVArchiveActivityNewFlow.tvNoRecordFound = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tvNoRecordFound'", TextView.class);
        tVArchiveActivityNewFlow.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        tVArchiveActivityNewFlow.iv_back_button = (ImageView) c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        TVArchiveActivityNewFlow tVArchiveActivityNewFlow = this.f26859b;
        if (tVArchiveActivityNewFlow == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26859b = null;
        tVArchiveActivityNewFlow.pbLoader = null;
        tVArchiveActivityNewFlow.viewpager = null;
        tVArchiveActivityNewFlow.toolbar = null;
        tVArchiveActivityNewFlow.appbarToolbar = null;
        tVArchiveActivityNewFlow.pbPagingLoader = null;
        tVArchiveActivityNewFlow.myRecyclerView = null;
        tVArchiveActivityNewFlow.emptyView = null;
        tVArchiveActivityNewFlow.frameLayout = null;
        tVArchiveActivityNewFlow.ivBTUP = null;
        tVArchiveActivityNewFlow.tvNoStream = null;
        tVArchiveActivityNewFlow.tvNoRecordFound = null;
        tVArchiveActivityNewFlow.logo = null;
        tVArchiveActivityNewFlow.iv_back_button = null;
    }
}
