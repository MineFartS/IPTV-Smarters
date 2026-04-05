package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class GeneralSettingsActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GeneralSettingsActivity f25652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f25653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f25654d;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ GeneralSettingsActivity f25655d;

        public a(GeneralSettingsActivity generalSettingsActivity) {
            this.f25655d = generalSettingsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25655d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ GeneralSettingsActivity f25657d;

        public b(GeneralSettingsActivity generalSettingsActivity) {
            this.f25657d = generalSettingsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25657d.onViewClicked(view);
        }
    }

    public GeneralSettingsActivity_ViewBinding(GeneralSettingsActivity generalSettingsActivity, View view) {
        this.f25652b = generalSettingsActivity;
        generalSettingsActivity.autoStart = (CheckBox) c.c(view, R.id.auto_start, "field 'autoStart'", CheckBox.class);
        generalSettingsActivity.fullEPG = (CheckBox) c.c(view, R.id.epg_full, "field 'fullEPG'", CheckBox.class);
        generalSettingsActivity.activesubtitle = (CheckBox) c.c(view, R.id.subtitles_default, "field 'activesubtitle'", CheckBox.class);
        generalSettingsActivity.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        generalSettingsActivity.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        View viewB = c.b(view, R.id.bt_save_changes, "field 'btSaveChanges' and method 'onViewClicked'");
        generalSettingsActivity.btSaveChanges = (Button) c.a(viewB, R.id.bt_save_changes, "field 'btSaveChanges'", Button.class);
        this.f25653c = viewB;
        viewB.setOnClickListener(new a(generalSettingsActivity));
        View viewB2 = c.b(view, R.id.btn_back_playerselection, "field 'btnBackPlayerselection' and method 'onViewClicked'");
        generalSettingsActivity.btnBackPlayerselection = (Button) c.a(viewB2, R.id.btn_back_playerselection, "field 'btnBackPlayerselection'", Button.class);
        this.f25654d = viewB2;
        viewB2.setOnClickListener(new b(generalSettingsActivity));
        generalSettingsActivity.tv_useragent = (TextView) c.c(view, R.id.tv_useragent, "field 'tv_useragent'", TextView.class);
        generalSettingsActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        generalSettingsActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        generalSettingsActivity.spinnerEPG = (Spinner) c.c(view, R.id.language_select, "field 'spinnerEPG'", Spinner.class);
        generalSettingsActivity.etUserAgent = (EditText) c.c(view, R.id.et_user_agent, "field 'etUserAgent'", EditText.class);
        generalSettingsActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        generalSettingsActivity.autoplay = (CheckBox) c.c(view, R.id.autoplay, "field 'autoplay'", CheckBox.class);
        generalSettingsActivity.tv_auto_play_in = (TextView) c.c(view, R.id.tv_auto_play_in, "field 'tv_auto_play_in'", TextView.class);
        generalSettingsActivity.fl_auto_play_in = (FrameLayout) c.c(view, R.id.fl_auto_play_in, "field 'fl_auto_play_in'", FrameLayout.class);
        generalSettingsActivity.fl_recently_added_limit = (FrameLayout) c.c(view, R.id.fl_recently_added_limit, "field 'fl_recently_added_limit'", FrameLayout.class);
        generalSettingsActivity.fl_recently_watched_limit_live = (FrameLayout) c.c(view, R.id.fl_recently_watched_limit_live, "field 'fl_recently_watched_limit_live'", FrameLayout.class);
        generalSettingsActivity.picinpic = (CheckBox) c.c(view, R.id.picinpic, "field 'picinpic'", CheckBox.class);
        generalSettingsActivity.auto_clear_cache = (CheckBox) c.c(view, R.id.auto_clear_cache, "field 'auto_clear_cache'", CheckBox.class);
        generalSettingsActivity.show_epg_in_channels_list = (CheckBox) c.c(view, R.id.show_epg_in_channels_list, "field 'show_epg_in_channels_list'", CheckBox.class);
        generalSettingsActivity.tv_recently_added_limit = (TextView) c.c(view, R.id.tv_recently_added_limit, "field 'tv_recently_added_limit'", TextView.class);
        generalSettingsActivity.tv_recently_watched_limit_live = (TextView) c.c(view, R.id.tv_recently_watched_limit_live, "field 'tv_recently_watched_limit_live'", TextView.class);
        generalSettingsActivity.bt_clear_now = (TextView) c.c(view, R.id.bt_clear_now, "field 'bt_clear_now'", TextView.class);
        generalSettingsActivity.auto_play_channel_in_live = (CheckBox) c.c(view, R.id.auto_play_channel_in_live, "field 'auto_play_channel_in_live'", CheckBox.class);
        generalSettingsActivity.ll_auto_play_next_episode = (LinearLayout) c.c(view, R.id.ll_auto_play_next_episode, "field 'll_auto_play_next_episode'", LinearLayout.class);
        generalSettingsActivity.ll_recently_added_limit = (LinearLayout) c.c(view, R.id.ll_recently_added_limit, "field 'll_recently_added_limit'", LinearLayout.class);
        generalSettingsActivity.ll_recently_watched_limit_live = (LinearLayout) c.c(view, R.id.ll_recently_watched_limit_live, "field 'll_recently_watched_limit_live'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        GeneralSettingsActivity generalSettingsActivity = this.f25652b;
        if (generalSettingsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25652b = null;
        generalSettingsActivity.autoStart = null;
        generalSettingsActivity.fullEPG = null;
        generalSettingsActivity.activesubtitle = null;
        generalSettingsActivity.toolbar = null;
        generalSettingsActivity.appbarToolbar = null;
        generalSettingsActivity.btSaveChanges = null;
        generalSettingsActivity.btnBackPlayerselection = null;
        generalSettingsActivity.tv_useragent = null;
        generalSettingsActivity.date = null;
        generalSettingsActivity.time = null;
        generalSettingsActivity.spinnerEPG = null;
        generalSettingsActivity.etUserAgent = null;
        generalSettingsActivity.logo = null;
        generalSettingsActivity.autoplay = null;
        generalSettingsActivity.tv_auto_play_in = null;
        generalSettingsActivity.fl_auto_play_in = null;
        generalSettingsActivity.fl_recently_added_limit = null;
        generalSettingsActivity.fl_recently_watched_limit_live = null;
        generalSettingsActivity.picinpic = null;
        generalSettingsActivity.auto_clear_cache = null;
        generalSettingsActivity.show_epg_in_channels_list = null;
        generalSettingsActivity.tv_recently_added_limit = null;
        generalSettingsActivity.tv_recently_watched_limit_live = null;
        generalSettingsActivity.bt_clear_now = null;
        generalSettingsActivity.auto_play_channel_in_live = null;
        generalSettingsActivity.ll_auto_play_next_episode = null;
        generalSettingsActivity.ll_recently_added_limit = null;
        generalSettingsActivity.ll_recently_watched_limit_live = null;
        this.f25653c.setOnClickListener(null);
        this.f25653c = null;
        this.f25654d.setOnClickListener(null);
        this.f25654d = null;
    }
}
