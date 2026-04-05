package minefarts.iptvsmarters.view.fragment;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b.c.b;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.exoplayer2.ui.PlayerView;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG;
import minefarts.iptvsmarters.view.utility.epg.EPG;

/* JADX INFO: loaded from: classes2.dex */
public class NewEPGFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NewEPGFragment f28929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f28930c;

    public class a extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ NewEPGFragment f28931d;

        public a(NewEPGFragment newEPGFragment) {
            this.f28931d = newEPGFragment;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f28931d.onViewClicked();
        }
    }

    public NewEPGFragment_ViewBinding(NewEPGFragment newEPGFragment, View view) {
        this.f28929b = newEPGFragment;
        newEPGFragment.pbLoader = (ProgressBar) c.c(view, R.id.pb_loader, "field 'pbLoader'", ProgressBar.class);
        newEPGFragment.tvNoRecordFound = (TextView) c.c(view, R.id.tv_no_record_found, "field 'tvNoRecordFound'", TextView.class);
        newEPGFragment.tvViewProvider = (TextView) c.c(view, R.id.tv_view_provider, "field 'tvViewProvider'", TextView.class);
        newEPGFragment.epgFragment = (RelativeLayout) c.c(view, R.id.rl_newepg_fragment, "field 'epgFragment'", RelativeLayout.class);
        newEPGFragment.epgView = (LinearLayout) c.c(view, R.id.ll_epg_view, "field 'epgView'", LinearLayout.class);
        newEPGFragment.currentEventTime = (TextView) c.c(view, R.id.current_event_time, "field 'currentEventTime'", TextView.class);
        newEPGFragment.currentEvent = (TextView) c.c(view, R.id.current_event, "field 'currentEvent'", TextView.class);
        newEPGFragment.player_view = (PlayerView) c.c(view, R.id.player_view, "field 'player_view'", PlayerView.class);
        newEPGFragment.currentEventDescription = (TextView) c.c(view, R.id.current_event_description, "field 'currentEventDescription'", TextView.class);
        newEPGFragment.epg = (EPG) c.c(view, R.id.epg, "field 'epg'", EPG.class);
        newEPGFragment.tvNoStream = (TextView) c.c(view, R.id.tv_noStream, "field 'tvNoStream'", TextView.class);
        newEPGFragment.app_video_loading = (ProgressBar) c.c(view, R.id.app_video_loading, "field 'app_video_loading'", ProgressBar.class);
        newEPGFragment.app_video_status = (LinearLayout) c.c(view, R.id.app_video_status, "field 'app_video_status'", LinearLayout.class);
        newEPGFragment.app_video_status_text = (TextView) c.c(view, R.id.app_video_status_text, "field 'app_video_status_text'", TextView.class);
        newEPGFragment.tv_cat_title = (TextView) c.c(view, R.id.tv_cat_title, "field 'tv_cat_title'", TextView.class);
        newEPGFragment.mVideoView = (NSTIJKPlayerSmallEPG) c.c(view, R.id.video_view, "field 'mVideoView'", NSTIJKPlayerSmallEPG.class);
        View viewB = c.b(view, R.id.app_video_box, "field 'app_video_box' and method 'onViewClicked'");
        newEPGFragment.app_video_box = (LinearLayout) c.a(viewB, R.id.app_video_box, "field 'app_video_box'", LinearLayout.class);
        this.f28930c = viewB;
        viewB.setOnClickListener(new a(newEPGFragment));
        newEPGFragment.rl_add_channel_to_fav = (RelativeLayout) c.c(view, R.id.rl_add_channel_to_fav, "field 'rl_add_channel_to_fav'", RelativeLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        NewEPGFragment newEPGFragment = this.f28929b;
        if (newEPGFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f28929b = null;
        newEPGFragment.pbLoader = null;
        newEPGFragment.tvNoRecordFound = null;
        newEPGFragment.tvViewProvider = null;
        newEPGFragment.epgFragment = null;
        newEPGFragment.epgView = null;
        newEPGFragment.currentEventTime = null;
        newEPGFragment.currentEvent = null;
        newEPGFragment.player_view = null;
        newEPGFragment.currentEventDescription = null;
        newEPGFragment.epg = null;
        newEPGFragment.tvNoStream = null;
        newEPGFragment.app_video_loading = null;
        newEPGFragment.app_video_status = null;
        newEPGFragment.app_video_status_text = null;
        newEPGFragment.tv_cat_title = null;
        newEPGFragment.mVideoView = null;
        newEPGFragment.app_video_box = null;
        newEPGFragment.rl_add_channel_to_fav = null;
        this.f28930c.setOnClickListener(null);
        this.f28930c = null;
    }
}
