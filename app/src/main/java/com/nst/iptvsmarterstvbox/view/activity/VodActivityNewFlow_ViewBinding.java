package minefarts.iptvsmarters.view.activity;

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
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class VodActivityNewFlow_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VodActivityNewFlow f27143b;

    public VodActivityNewFlow_ViewBinding(VodActivityNewFlow vodActivityNewFlow, View view) {
        this.f27143b = vodActivityNewFlow;
        vodActivityNewFlow.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        vodActivityNewFlow.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        vodActivityNewFlow.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        vodActivityNewFlow.activityLogin = (LinearLayout) c.c(view, R.id.main_layout, "field 'activityLogin'", LinearLayout.class);
        vodActivityNewFlow.pbPagingLoader = (ProgressBar) c.c(view, R.id.pb_paging_loader, "field 'pbPagingLoader'", ProgressBar.class);
        vodActivityNewFlow.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        vodActivityNewFlow.tvNoRecordFound = (TextView) c.c(view, R.id.empty_view, "field 'tvNoRecordFound'", TextView.class);
        vodActivityNewFlow.frameLayout = (FrameLayout) c.c(view, R.id.fl_frame, "field 'frameLayout'", FrameLayout.class);
        vodActivityNewFlow.home = (TextView) c.c(view, R.id.home, "field 'home'", TextView.class);
        vodActivityNewFlow.rl_vod_layout = (RelativeLayout) c.c(view, R.id.rl_vod_layout, "field 'rl_vod_layout'", RelativeLayout.class);
        vodActivityNewFlow.rl_no_arrangement_found = (RelativeLayout) c.c(view, R.id.rl_no_arrangement_found, "field 'rl_no_arrangement_found'", RelativeLayout.class);
        vodActivityNewFlow.bt_explore_all = (Button) c.c(view, R.id.bt_explore_all, "field 'bt_explore_all'", Button.class);
        vodActivityNewFlow.iv_back_button = (ImageView) c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
        vodActivityNewFlow.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        VodActivityNewFlow vodActivityNewFlow = this.f27143b;
        if (vodActivityNewFlow == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f27143b = null;
        vodActivityNewFlow.pbLoader = null;
        vodActivityNewFlow.toolbar = null;
        vodActivityNewFlow.appbarToolbar = null;
        vodActivityNewFlow.activityLogin = null;
        vodActivityNewFlow.pbPagingLoader = null;
        vodActivityNewFlow.myRecyclerView = null;
        vodActivityNewFlow.tvNoRecordFound = null;
        vodActivityNewFlow.frameLayout = null;
        vodActivityNewFlow.home = null;
        vodActivityNewFlow.rl_vod_layout = null;
        vodActivityNewFlow.rl_no_arrangement_found = null;
        vodActivityNewFlow.bt_explore_all = null;
        vodActivityNewFlow.iv_back_button = null;
        vodActivityNewFlow.logo = null;
    }
}
