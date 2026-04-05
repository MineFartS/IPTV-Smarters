package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class TVArchiveActivityLayout_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TVArchiveActivityLayout f26824b;

    public TVArchiveActivityLayout_ViewBinding(TVArchiveActivityLayout tVArchiveActivityLayout, View view) {
        this.f26824b = tVArchiveActivityLayout;
        tVArchiveActivityLayout.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        tVArchiveActivityLayout.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        tVArchiveActivityLayout.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        tVArchiveActivityLayout.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        tVArchiveActivityLayout.tvNoStream = (TextView) c.c(view, R.id.tv_noStream, "field 'tvNoStream'", TextView.class);
        tVArchiveActivityLayout.tvNoRecordFound = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tvNoRecordFound'", TextView.class);
        tVArchiveActivityLayout.tvViewProvider = (TextView) c.c(view, R.id.tv_view_provider, "field 'tvViewProvider'", TextView.class);
        tVArchiveActivityLayout.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        tVArchiveActivityLayout.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        tVArchiveActivityLayout.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        tVArchiveActivityLayout.iv_back_button = (ImageView) c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        TVArchiveActivityLayout tVArchiveActivityLayout = this.f26824b;
        if (tVArchiveActivityLayout == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26824b = null;
        tVArchiveActivityLayout.toolbar = null;
        tVArchiveActivityLayout.appbarToolbar = null;
        tVArchiveActivityLayout.pbLoader = null;
        tVArchiveActivityLayout.myRecyclerView = null;
        tVArchiveActivityLayout.tvNoStream = null;
        tVArchiveActivityLayout.tvNoRecordFound = null;
        tVArchiveActivityLayout.tvViewProvider = null;
        tVArchiveActivityLayout.date = null;
        tVArchiveActivityLayout.time = null;
        tVArchiveActivityLayout.logo = null;
        tVArchiveActivityLayout.iv_back_button = null;
    }
}
