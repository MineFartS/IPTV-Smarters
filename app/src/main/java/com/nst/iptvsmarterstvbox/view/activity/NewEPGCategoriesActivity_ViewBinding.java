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
public class NewEPGCategoriesActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NewEPGCategoriesActivity f26007b;

    public NewEPGCategoriesActivity_ViewBinding(NewEPGCategoriesActivity newEPGCategoriesActivity, View view) {
        this.f26007b = newEPGCategoriesActivity;
        newEPGCategoriesActivity.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        newEPGCategoriesActivity.viewpager = (ViewPager) c.c(view, R.id.viewpager, "field 'viewpager'", ViewPager.class);
        newEPGCategoriesActivity.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        newEPGCategoriesActivity.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        newEPGCategoriesActivity.pbPagingLoader = (ProgressBar) c.c(view, R.id.pb_paging_loader, "field 'pbPagingLoader'", ProgressBar.class);
        newEPGCategoriesActivity.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        newEPGCategoriesActivity.emptyView = (TextView) c.c(view, R.id.empty_view, "field 'emptyView'", TextView.class);
        newEPGCategoriesActivity.frameLayout = (FrameLayout) c.c(view, R.id.fl_frame, "field 'frameLayout'", FrameLayout.class);
        newEPGCategoriesActivity.ivBTUP = (ImageView) c.c(view, R.id.iv_bt_up, "field 'ivBTUP'", ImageView.class);
        newEPGCategoriesActivity.tvNoStream = (TextView) c.c(view, R.id.tv_noStream, "field 'tvNoStream'", TextView.class);
        newEPGCategoriesActivity.tvNoRecordFound = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tvNoRecordFound'", TextView.class);
        newEPGCategoriesActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        newEPGCategoriesActivity.iv_back_button = (ImageView) c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        NewEPGCategoriesActivity newEPGCategoriesActivity = this.f26007b;
        if (newEPGCategoriesActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26007b = null;
        newEPGCategoriesActivity.pbLoader = null;
        newEPGCategoriesActivity.viewpager = null;
        newEPGCategoriesActivity.toolbar = null;
        newEPGCategoriesActivity.appbarToolbar = null;
        newEPGCategoriesActivity.pbPagingLoader = null;
        newEPGCategoriesActivity.myRecyclerView = null;
        newEPGCategoriesActivity.emptyView = null;
        newEPGCategoriesActivity.frameLayout = null;
        newEPGCategoriesActivity.ivBTUP = null;
        newEPGCategoriesActivity.tvNoStream = null;
        newEPGCategoriesActivity.tvNoRecordFound = null;
        newEPGCategoriesActivity.logo = null;
        newEPGCategoriesActivity.iv_back_button = null;
    }
}
