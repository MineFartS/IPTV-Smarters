package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class SearchActivityLowerSDK_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SearchActivityLowerSDK f26280b;

    public SearchActivityLowerSDK_ViewBinding(SearchActivityLowerSDK searchActivityLowerSDK, View view) {
        this.f26280b = searchActivityLowerSDK;
        searchActivityLowerSDK.liveRecyclerView = (RecyclerView) c.c(view, R.id.live_recycler_view, "field 'liveRecyclerView'", RecyclerView.class);
        searchActivityLowerSDK.movieRecyclerView = (RecyclerView) c.c(view, R.id.movie_recycler_view, "field 'movieRecyclerView'", RecyclerView.class);
        searchActivityLowerSDK.seriesRecyclerView = (RecyclerView) c.c(view, R.id.series_recycler_view, "field 'seriesRecyclerView'", RecyclerView.class);
        searchActivityLowerSDK.llProgramBox = (LinearLayout) c.c(view, R.id.ll_program_box, "field 'llProgramBox'", LinearLayout.class);
        searchActivityLowerSDK.channelRecyclerView = (RecyclerView) c.c(view, R.id.channel_recycler_view, "field 'channelRecyclerView'", RecyclerView.class);
        searchActivityLowerSDK.programRecyclerView = (RecyclerView) c.c(view, R.id.program_recycler_view, "field 'programRecyclerView'", RecyclerView.class);
        searchActivityLowerSDK.tabs_layout = (LinearLayout) c.c(view, R.id.tabs_layout, "field 'tabs_layout'", LinearLayout.class);
        searchActivityLowerSDK.live_channels_tab = (TextView) c.c(view, R.id.live_channels_tab, "field 'live_channels_tab'", TextView.class);
        searchActivityLowerSDK.movies_tab = (TextView) c.c(view, R.id.movies_tab, "field 'movies_tab'", TextView.class);
        searchActivityLowerSDK.series_tab = (TextView) c.c(view, R.id.series_tab, "field 'series_tab'", TextView.class);
        searchActivityLowerSDK.program_tab = (TextView) c.c(view, R.id.program_tab, "field 'program_tab'", TextView.class);
        searchActivityLowerSDK.tv_program_name_right_side = (TextView) c.c(view, R.id.tv_program_name_right_side, "field 'tv_program_name_right_side'", TextView.class);
        searchActivityLowerSDK.tv_program_start_date_right = (TextView) c.c(view, R.id.tv_program_start_date_right, "field 'tv_program_start_date_right'", TextView.class);
        searchActivityLowerSDK.tv_program_stop_date_right = (TextView) c.c(view, R.id.tv_program_stop_date_right, "field 'tv_program_stop_date_right'", TextView.class);
        searchActivityLowerSDK.tv_description = (TextView) c.c(view, R.id.tv_description, "field 'tv_description'", TextView.class);
        searchActivityLowerSDK.tv_no_record_found = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tv_no_record_found'", TextView.class);
        searchActivityLowerSDK.ll_pb_recent_watch = (LinearLayout) c.c(view, R.id.ll_pb_recent_watch, "field 'll_pb_recent_watch'", LinearLayout.class);
        searchActivityLowerSDK.pb_recent_watch = (ProgressBar) c.c(view, R.id.pb_recent_watch, "field 'pb_recent_watch'", ProgressBar.class);
        searchActivityLowerSDK.iv_back_button = (ImageView) c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        SearchActivityLowerSDK searchActivityLowerSDK = this.f26280b;
        if (searchActivityLowerSDK == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26280b = null;
        searchActivityLowerSDK.liveRecyclerView = null;
        searchActivityLowerSDK.movieRecyclerView = null;
        searchActivityLowerSDK.seriesRecyclerView = null;
        searchActivityLowerSDK.llProgramBox = null;
        searchActivityLowerSDK.channelRecyclerView = null;
        searchActivityLowerSDK.programRecyclerView = null;
        searchActivityLowerSDK.tabs_layout = null;
        searchActivityLowerSDK.live_channels_tab = null;
        searchActivityLowerSDK.movies_tab = null;
        searchActivityLowerSDK.series_tab = null;
        searchActivityLowerSDK.program_tab = null;
        searchActivityLowerSDK.tv_program_name_right_side = null;
        searchActivityLowerSDK.tv_program_start_date_right = null;
        searchActivityLowerSDK.tv_program_stop_date_right = null;
        searchActivityLowerSDK.tv_description = null;
        searchActivityLowerSDK.tv_no_record_found = null;
        searchActivityLowerSDK.ll_pb_recent_watch = null;
        searchActivityLowerSDK.pb_recent_watch = null;
        searchActivityLowerSDK.iv_back_button = null;
    }
}
