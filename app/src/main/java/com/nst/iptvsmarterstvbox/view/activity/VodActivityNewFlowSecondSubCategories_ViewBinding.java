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
public class VodActivityNewFlowSecondSubCategories_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VodActivityNewFlowSecondSubCategories f27103b;

    public VodActivityNewFlowSecondSubCategories_ViewBinding(VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories, View view) {
        this.f27103b = vodActivityNewFlowSecondSubCategories;
        vodActivityNewFlowSecondSubCategories.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        vodActivityNewFlowSecondSubCategories.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        vodActivityNewFlowSecondSubCategories.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        vodActivityNewFlowSecondSubCategories.myRecyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'myRecyclerView'", RecyclerView.class);
        vodActivityNewFlowSecondSubCategories.tvNoStream = (TextView) c.c(view, R.id.tv_noStream, "field 'tvNoStream'", TextView.class);
        vodActivityNewFlowSecondSubCategories.tvNoRecordFound = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tvNoRecordFound'", TextView.class);
        vodActivityNewFlowSecondSubCategories.tvViewProvider = (TextView) c.c(view, R.id.tv_view_provider, "field 'tvViewProvider'", TextView.class);
        vodActivityNewFlowSecondSubCategories.vodCategoryName = (TextView) c.c(view, R.id.tv_settings, "field 'vodCategoryName'", TextView.class);
        vodActivityNewFlowSecondSubCategories.rl_sub_cat = (RelativeLayout) c.c(view, R.id.rl_sub_cat, "field 'rl_sub_cat'", RelativeLayout.class);
        vodActivityNewFlowSecondSubCategories.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories = this.f27103b;
        if (vodActivityNewFlowSecondSubCategories == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f27103b = null;
        vodActivityNewFlowSecondSubCategories.toolbar = null;
        vodActivityNewFlowSecondSubCategories.appbarToolbar = null;
        vodActivityNewFlowSecondSubCategories.pbLoader = null;
        vodActivityNewFlowSecondSubCategories.myRecyclerView = null;
        vodActivityNewFlowSecondSubCategories.tvNoStream = null;
        vodActivityNewFlowSecondSubCategories.tvNoRecordFound = null;
        vodActivityNewFlowSecondSubCategories.tvViewProvider = null;
        vodActivityNewFlowSecondSubCategories.vodCategoryName = null;
        vodActivityNewFlowSecondSubCategories.rl_sub_cat = null;
        vodActivityNewFlowSecondSubCategories.logo = null;
    }
}
