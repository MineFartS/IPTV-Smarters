package minefarts.iptvsmarters.view.activity;

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
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class SeriesActivitNewFlowSubCat_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SeriesActivitNewFlowSubCat f26308b;

    public SeriesActivitNewFlowSubCat_ViewBinding(SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat, View view) {
        this.f26308b = seriesActivitNewFlowSubCat;
        seriesActivitNewFlowSubCat.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        seriesActivitNewFlowSubCat.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        seriesActivitNewFlowSubCat.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        seriesActivitNewFlowSubCat.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        seriesActivitNewFlowSubCat.tvNoStream = (TextView) c.c(view, R.id.tv_noStream, "field 'tvNoStream'", TextView.class);
        seriesActivitNewFlowSubCat.tvNoRecordFound = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tvNoRecordFound'", TextView.class);
        seriesActivitNewFlowSubCat.tvViewProvider = (TextView) c.c(view, R.id.tv_view_provider, "field 'tvViewProvider'", TextView.class);
        seriesActivitNewFlowSubCat.vodCategoryName = (TextView) c.c(view, R.id.tv_settings, "field 'vodCategoryName'", TextView.class);
        seriesActivitNewFlowSubCat.rl_sub_cat = (RelativeLayout) c.c(view, R.id.rl_sub_cat, "field 'rl_sub_cat'", RelativeLayout.class);
        seriesActivitNewFlowSubCat.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat = this.f26308b;
        if (seriesActivitNewFlowSubCat == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26308b = null;
        seriesActivitNewFlowSubCat.toolbar = null;
        seriesActivitNewFlowSubCat.appbarToolbar = null;
        seriesActivitNewFlowSubCat.pbLoader = null;
        seriesActivitNewFlowSubCat.myRecyclerView = null;
        seriesActivitNewFlowSubCat.tvNoStream = null;
        seriesActivitNewFlowSubCat.tvNoRecordFound = null;
        seriesActivitNewFlowSubCat.tvViewProvider = null;
        seriesActivitNewFlowSubCat.vodCategoryName = null;
        seriesActivitNewFlowSubCat.rl_sub_cat = null;
        seriesActivitNewFlowSubCat.logo = null;
    }
}
