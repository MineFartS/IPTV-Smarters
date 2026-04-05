package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class SearchActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SearchActivity f26281b;

    public SearchActivity_ViewBinding(SearchActivity searchActivity, View view) {
        this.f26281b = searchActivity;
        searchActivity.liveRecyclerView = (RecyclerView) c.c(view, R.id.live_recycler_view, "field 'liveRecyclerView'", RecyclerView.class);
        searchActivity.movieRecyclerView = (RecyclerView) c.c(view, R.id.movie_recycler_view, "field 'movieRecyclerView'", RecyclerView.class);
        searchActivity.seriesRecyclerView = (RecyclerView) c.c(view, R.id.series_recycler_view, "field 'seriesRecyclerView'", RecyclerView.class);
        searchActivity.llProgramBox = (LinearLayout) c.c(view, R.id.ll_program_box, "field 'llProgramBox'", LinearLayout.class);
        searchActivity.channelRecyclerView = (RecyclerView) c.c(view, R.id.channel_recycler_view, "field 'channelRecyclerView'", RecyclerView.class);
        searchActivity.programRecyclerView = (RecyclerView) c.c(view, R.id.program_recycler_view, "field 'programRecyclerView'", RecyclerView.class);
        searchActivity.tabs_layout = (LinearLayout) c.c(view, R.id.tabs_layout, "field 'tabs_layout'", LinearLayout.class);
        searchActivity.live_channels_tab = (TextView) c.c(view, R.id.live_channels_tab, "field 'live_channels_tab'", TextView.class);
        searchActivity.movies_tab = (TextView) c.c(view, R.id.movies_tab, "field 'movies_tab'", TextView.class);
        searchActivity.series_tab = (TextView) c.c(view, R.id.series_tab, "field 'series_tab'", TextView.class);
        searchActivity.program_tab = (TextView) c.c(view, R.id.program_tab, "field 'program_tab'", TextView.class);
        searchActivity.tv_program_name_right_side = (TextView) c.c(view, R.id.tv_program_name_right_side, "field 'tv_program_name_right_side'", TextView.class);
        searchActivity.tv_program_start_date_right = (TextView) c.c(view, R.id.tv_program_start_date_right, "field 'tv_program_start_date_right'", TextView.class);
        searchActivity.tv_program_stop_date_right = (TextView) c.c(view, R.id.tv_program_stop_date_right, "field 'tv_program_stop_date_right'", TextView.class);
        searchActivity.tv_description = (TextView) c.c(view, R.id.tv_description, "field 'tv_description'", TextView.class);
        searchActivity.tv_no_record_found = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tv_no_record_found'", TextView.class);
        searchActivity.ll_pb_recent_watch = (LinearLayout) c.c(view, R.id.ll_pb_recent_watch, "field 'll_pb_recent_watch'", LinearLayout.class);
        searchActivity.pb_recent_watch = (ProgressBar) c.c(view, R.id.pb_recent_watch, "field 'pb_recent_watch'", ProgressBar.class);
        searchActivity.iv_back_button = (ImageView) c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        SearchActivity searchActivity = this.f26281b;
        if (searchActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26281b = null;
        searchActivity.liveRecyclerView = null;
        searchActivity.movieRecyclerView = null;
        searchActivity.seriesRecyclerView = null;
        searchActivity.llProgramBox = null;
        searchActivity.channelRecyclerView = null;
        searchActivity.programRecyclerView = null;
        searchActivity.tabs_layout = null;
        searchActivity.live_channels_tab = null;
        searchActivity.movies_tab = null;
        searchActivity.series_tab = null;
        searchActivity.program_tab = null;
        searchActivity.tv_program_name_right_side = null;
        searchActivity.tv_program_start_date_right = null;
        searchActivity.tv_program_stop_date_right = null;
        searchActivity.tv_description = null;
        searchActivity.tv_no_record_found = null;
        searchActivity.ll_pb_recent_watch = null;
        searchActivity.pb_recent_watch = null;
        searchActivity.iv_back_button = null;
    }
}
