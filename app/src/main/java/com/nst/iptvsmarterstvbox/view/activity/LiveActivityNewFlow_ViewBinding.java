package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class LiveActivityNewFlow_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LiveActivityNewFlow f25734b;

    public LiveActivityNewFlow_ViewBinding(LiveActivityNewFlow liveActivityNewFlow, View view) {
        this.f25734b = liveActivityNewFlow;
        liveActivityNewFlow.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        liveActivityNewFlow.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        liveActivityNewFlow.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        liveActivityNewFlow.pbPagingLoader = (ProgressBar) c.c(view, R.id.pb_paging_loader, "field 'pbPagingLoader'", ProgressBar.class);
        liveActivityNewFlow.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        liveActivityNewFlow.emptyView = (TextView) c.c(view, R.id.empty_view, "field 'emptyView'", TextView.class);
        liveActivityNewFlow.frameLayout = (FrameLayout) c.c(view, R.id.fl_frame, "field 'frameLayout'", FrameLayout.class);
        liveActivityNewFlow.ivBTUP = (ImageView) c.c(view, R.id.iv_bt_up, "field 'ivBTUP'", ImageView.class);
        liveActivityNewFlow.tvNoStream = (TextView) c.c(view, R.id.tv_noStream, "field 'tvNoStream'", TextView.class);
        liveActivityNewFlow.tvNoRecordFound = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tvNoRecordFound'", TextView.class);
        liveActivityNewFlow.rl_no_arrangement_found = (RelativeLayout) c.c(view, R.id.rl_no_arrangement_found, "field 'rl_no_arrangement_found'", RelativeLayout.class);
        liveActivityNewFlow.bt_explore_all = (Button) c.c(view, R.id.bt_explore_all, "field 'bt_explore_all'", Button.class);
        liveActivityNewFlow.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        LiveActivityNewFlow liveActivityNewFlow = this.f25734b;
        if (liveActivityNewFlow == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25734b = null;
        liveActivityNewFlow.pbLoader = null;
        liveActivityNewFlow.toolbar = null;
        liveActivityNewFlow.appbarToolbar = null;
        liveActivityNewFlow.pbPagingLoader = null;
        liveActivityNewFlow.myRecyclerView = null;
        liveActivityNewFlow.emptyView = null;
        liveActivityNewFlow.frameLayout = null;
        liveActivityNewFlow.ivBTUP = null;
        liveActivityNewFlow.tvNoStream = null;
        liveActivityNewFlow.tvNoRecordFound = null;
        liveActivityNewFlow.rl_no_arrangement_found = null;
        liveActivityNewFlow.bt_explore_all = null;
        liveActivityNewFlow.logo = null;
    }
}
