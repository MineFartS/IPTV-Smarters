package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class SeriesAllDataSingleActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SeriesAllDataSingleActivity f26452b;

    public SeriesAllDataSingleActivity_ViewBinding(SeriesAllDataSingleActivity seriesAllDataSingleActivity, View view) {
        this.f26452b = seriesAllDataSingleActivity;
        seriesAllDataSingleActivity.rl_left = (RelativeLayout) c.c(view, R.id.rl_left, "field 'rl_left'", RelativeLayout.class);
        seriesAllDataSingleActivity.rl_right = (RelativeLayout) c.c(view, R.id.rl_right, "field 'rl_right'", RelativeLayout.class);
        seriesAllDataSingleActivity.iv_hamburger_sidebar = (ImageView) c.c(view, R.id.iv_hamburger_sidebar, "field 'iv_hamburger_sidebar'", ImageView.class);
        seriesAllDataSingleActivity.rl_search_cat = (RelativeLayout) c.c(view, R.id.rl_search_cat, "field 'rl_search_cat'", RelativeLayout.class);
        seriesAllDataSingleActivity.iv_close_sidebar = (ImageView) c.c(view, R.id.iv_close_sidebar, "field 'iv_close_sidebar'", ImageView.class);
        seriesAllDataSingleActivity.recycler_view_left_sidebar = (RecyclerView) c.c(view, R.id.recycler_view_left_sidebar, "field 'recycler_view_left_sidebar'", RecyclerView.class);
        seriesAllDataSingleActivity.recycler_view = (RecyclerView) c.c(view, R.id.recycler_view, "field 'recycler_view'", RecyclerView.class);
        seriesAllDataSingleActivity.ll_series_data = (LinearLayout) c.c(view, R.id.ll_series_data, "field 'll_series_data'", LinearLayout.class);
        seriesAllDataSingleActivity.ll_loader = (LinearLayout) c.c(view, R.id.ll_loader, "field 'll_loader'", LinearLayout.class);
        seriesAllDataSingleActivity.tv_no_record_found = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tv_no_record_found'", TextView.class);
        seriesAllDataSingleActivity.tv_main_cat_name = (TextView) c.c(view, R.id.tv_main_cat_name, "field 'tv_main_cat_name'", TextView.class);
        seriesAllDataSingleActivity.et_search_left_side = (EditText) c.c(view, R.id.et_search_left_side, "field 'et_search_left_side'", EditText.class);
        seriesAllDataSingleActivity.ll_no_cat_found = (LinearLayout) c.c(view, R.id.ll_no_cat_found, "field 'll_no_cat_found'", LinearLayout.class);
        seriesAllDataSingleActivity.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        seriesAllDataSingleActivity.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        seriesAllDataSingleActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        seriesAllDataSingleActivity.iv_back_button_1 = (ImageView) c.c(view, R.id.iv_back_button_1, "field 'iv_back_button_1'", ImageView.class);
        seriesAllDataSingleActivity.iv_back_button_2 = (ImageView) c.c(view, R.id.iv_back_button_2, "field 'iv_back_button_2'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        SeriesAllDataSingleActivity seriesAllDataSingleActivity = this.f26452b;
        if (seriesAllDataSingleActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26452b = null;
        seriesAllDataSingleActivity.rl_left = null;
        seriesAllDataSingleActivity.rl_right = null;
        seriesAllDataSingleActivity.iv_hamburger_sidebar = null;
        seriesAllDataSingleActivity.rl_search_cat = null;
        seriesAllDataSingleActivity.iv_close_sidebar = null;
        seriesAllDataSingleActivity.recycler_view_left_sidebar = null;
        seriesAllDataSingleActivity.recycler_view = null;
        seriesAllDataSingleActivity.ll_series_data = null;
        seriesAllDataSingleActivity.ll_loader = null;
        seriesAllDataSingleActivity.tv_no_record_found = null;
        seriesAllDataSingleActivity.tv_main_cat_name = null;
        seriesAllDataSingleActivity.et_search_left_side = null;
        seriesAllDataSingleActivity.ll_no_cat_found = null;
        seriesAllDataSingleActivity.toolbar = null;
        seriesAllDataSingleActivity.appbarToolbar = null;
        seriesAllDataSingleActivity.logo = null;
        seriesAllDataSingleActivity.iv_back_button_1 = null;
        seriesAllDataSingleActivity.iv_back_button_2 = null;
    }
}
