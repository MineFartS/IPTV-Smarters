package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class EPGSettingsActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EPGSettingsActivity f25561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f25562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f25563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f25564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f25565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f25566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f25567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f25568i;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EPGSettingsActivity f25569d;

        public a(EPGSettingsActivity ePGSettingsActivity) {
            this.f25569d = ePGSettingsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25569d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EPGSettingsActivity f25571d;

        public b(EPGSettingsActivity ePGSettingsActivity) {
            this.f25571d = ePGSettingsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25571d.onViewClicked(view);
        }
    }

    public class c extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EPGSettingsActivity f25573d;

        public c(EPGSettingsActivity ePGSettingsActivity) {
            this.f25573d = ePGSettingsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25573d.onViewClicked(view);
        }
    }

    public class d extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EPGSettingsActivity f25575d;

        public d(EPGSettingsActivity ePGSettingsActivity) {
            this.f25575d = ePGSettingsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25575d.onViewClicked(view);
        }
    }

    public class e extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EPGSettingsActivity f25577d;

        public e(EPGSettingsActivity ePGSettingsActivity) {
            this.f25577d = ePGSettingsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25577d.onViewClicked(view);
        }
    }

    public class f extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EPGSettingsActivity f25579d;

        public f(EPGSettingsActivity ePGSettingsActivity) {
            this.f25579d = ePGSettingsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25579d.onViewClicked(view);
        }
    }

    public class g extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EPGSettingsActivity f25581d;

        public g(EPGSettingsActivity ePGSettingsActivity) {
            this.f25581d = ePGSettingsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25581d.onViewClicked(view);
        }
    }

    public EPGSettingsActivity_ViewBinding(EPGSettingsActivity ePGSettingsActivity, View view) {
        this.f25561b = ePGSettingsActivity;
        ePGSettingsActivity.toolbar = (Toolbar) b.c.c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        ePGSettingsActivity.appbarToolbar = (AppBarLayout) b.c.c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        View viewB = b.c.c.b(view, R.id.bt_save_changes_time_shift, "field 'btSaveChangesTimeShift' and method 'onViewClicked'");
        ePGSettingsActivity.btSaveChangesTimeShift = (Button) b.c.c.a(viewB, R.id.bt_save_changes_time_shift, "field 'btSaveChangesTimeShift'", Button.class);
        this.f25562c = viewB;
        viewB.setOnClickListener(new a(ePGSettingsActivity));
        View viewB2 = b.c.c.b(view, R.id.bt_save_changes_timeline, "field 'btSaveChangesTimeline' and method 'onViewClicked'");
        ePGSettingsActivity.btSaveChangesTimeline = (Button) b.c.c.a(viewB2, R.id.bt_save_changes_timeline, "field 'btSaveChangesTimeline'", Button.class);
        this.f25563d = viewB2;
        viewB2.setOnClickListener(new b(ePGSettingsActivity));
        ePGSettingsActivity.rgRadio = (RadioGroup) b.c.c.c(view, R.id.rg_radio, "field 'rgRadio'", RadioGroup.class);
        ePGSettingsActivity.rbwithepg = (RadioButton) b.c.c.c(view, R.id.rb_withepg, "field 'rbwithepg'", RadioButton.class);
        ePGSettingsActivity.rballchannels = (RadioButton) b.c.c.c(view, R.id.rb_allchannels, "field 'rballchannels'", RadioButton.class);
        ePGSettingsActivity.spinnerEPG = (Spinner) b.c.c.c(view, R.id.spinner_epg, "field 'spinnerEPG'", Spinner.class);
        ePGSettingsActivity.date = (TextView) b.c.c.c(view, R.id.date, "field 'date'", TextView.class);
        ePGSettingsActivity.time = (TextView) b.c.c.c(view, R.id.time, "field 'time'", TextView.class);
        ePGSettingsActivity.iv_back_button = (ImageView) b.c.c.c(view, R.id.iv_back_button, "field 'iv_back_button'", ImageView.class);
        View viewB3 = b.c.c.b(view, R.id.bt_epg_sources, "field 'bt_epg_sources' and method 'onViewClicked'");
        ePGSettingsActivity.bt_epg_sources = (Button) b.c.c.a(viewB3, R.id.bt_epg_sources, "field 'bt_epg_sources'", Button.class);
        this.f25564e = viewB3;
        viewB3.setOnClickListener(new c(ePGSettingsActivity));
        View viewB4 = b.c.c.b(view, R.id.bt_epg_timeline, "field 'bt_epg_timeline' and method 'onViewClicked'");
        ePGSettingsActivity.bt_epg_timeline = (Button) b.c.c.a(viewB4, R.id.bt_epg_timeline, "field 'bt_epg_timeline'", Button.class);
        this.f25565f = viewB4;
        viewB4.setOnClickListener(new d(ePGSettingsActivity));
        View viewB5 = b.c.c.b(view, R.id.bt_epg_timeshift, "field 'bt_epg_timeshift' and method 'onViewClicked'");
        ePGSettingsActivity.bt_epg_timeshift = (Button) b.c.c.a(viewB5, R.id.bt_epg_timeshift, "field 'bt_epg_timeshift'", Button.class);
        this.f25566g = viewB5;
        viewB5.setOnClickListener(new e(ePGSettingsActivity));
        ePGSettingsActivity.ll_epg_sources = (LinearLayout) b.c.c.c(view, R.id.ll_epg_sources, "field 'll_epg_sources'", LinearLayout.class);
        ePGSettingsActivity.ll_epg_timeline = (LinearLayout) b.c.c.c(view, R.id.ll_epg_timeline, "field 'll_epg_timeline'", LinearLayout.class);
        ePGSettingsActivity.ll_epg_timeshift = (LinearLayout) b.c.c.c(view, R.id.ll_epg_timeshift, "field 'll_epg_timeshift'", LinearLayout.class);
        ePGSettingsActivity.tv_epg_source_default = (TextView) b.c.c.c(view, R.id.tv_epg_source_default, "field 'tv_epg_source_default'", TextView.class);
        ePGSettingsActivity.tv_epg_timeline_default = (TextView) b.c.c.c(view, R.id.tv_epg_timeline_default, "field 'tv_epg_timeline_default'", TextView.class);
        ePGSettingsActivity.tv_epg_timeshift_default = (TextView) b.c.c.c(view, R.id.tv_epg_timeshift_default, "field 'tv_epg_timeshift_default'", TextView.class);
        ePGSettingsActivity.rv_epg_sources = (RecyclerView) b.c.c.c(view, R.id.rv_epg_sources, "field 'rv_epg_sources'", RecyclerView.class);
        ePGSettingsActivity.tv_no_source_found = (TextView) b.c.c.c(view, R.id.tv_no_source_found, "field 'tv_no_source_found'", TextView.class);
        ePGSettingsActivity.logo = (ImageView) b.c.c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        View viewB6 = b.c.c.b(view, R.id.ll_add_source, "field 'll_add_source' and method 'onViewClicked'");
        ePGSettingsActivity.ll_add_source = (RelativeLayout) b.c.c.a(viewB6, R.id.ll_add_source, "field 'll_add_source'", RelativeLayout.class);
        this.f25567h = viewB6;
        viewB6.setOnClickListener(new f(ePGSettingsActivity));
        View viewB7 = b.c.c.b(view, R.id.ll_refresh_epg, "field 'll_refresh_epg' and method 'onViewClicked'");
        ePGSettingsActivity.ll_refresh_epg = (RelativeLayout) b.c.c.a(viewB7, R.id.ll_refresh_epg, "field 'll_refresh_epg'", RelativeLayout.class);
        this.f25568i = viewB7;
        viewB7.setOnClickListener(new g(ePGSettingsActivity));
        ePGSettingsActivity.tv_epg_found_for = (TextView) b.c.c.c(view, R.id.tv_epg_found_for, "field 'tv_epg_found_for'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        EPGSettingsActivity ePGSettingsActivity = this.f25561b;
        if (ePGSettingsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25561b = null;
        ePGSettingsActivity.toolbar = null;
        ePGSettingsActivity.appbarToolbar = null;
        ePGSettingsActivity.btSaveChangesTimeShift = null;
        ePGSettingsActivity.btSaveChangesTimeline = null;
        ePGSettingsActivity.rgRadio = null;
        ePGSettingsActivity.rbwithepg = null;
        ePGSettingsActivity.rballchannels = null;
        ePGSettingsActivity.spinnerEPG = null;
        ePGSettingsActivity.date = null;
        ePGSettingsActivity.time = null;
        ePGSettingsActivity.iv_back_button = null;
        ePGSettingsActivity.bt_epg_sources = null;
        ePGSettingsActivity.bt_epg_timeline = null;
        ePGSettingsActivity.bt_epg_timeshift = null;
        ePGSettingsActivity.ll_epg_sources = null;
        ePGSettingsActivity.ll_epg_timeline = null;
        ePGSettingsActivity.ll_epg_timeshift = null;
        ePGSettingsActivity.tv_epg_source_default = null;
        ePGSettingsActivity.tv_epg_timeline_default = null;
        ePGSettingsActivity.tv_epg_timeshift_default = null;
        ePGSettingsActivity.rv_epg_sources = null;
        ePGSettingsActivity.tv_no_source_found = null;
        ePGSettingsActivity.logo = null;
        ePGSettingsActivity.ll_add_source = null;
        ePGSettingsActivity.ll_refresh_epg = null;
        ePGSettingsActivity.tv_epg_found_for = null;
        this.f25562c.setOnClickListener(null);
        this.f25562c = null;
        this.f25563d.setOnClickListener(null);
        this.f25563d = null;
        this.f25564e.setOnClickListener(null);
        this.f25564e = null;
        this.f25565f.setOnClickListener(null);
        this.f25565f = null;
        this.f25566g.setOnClickListener(null);
        this.f25566g = null;
        this.f25567h.setOnClickListener(null);
        this.f25567h = null;
        this.f25568i.setOnClickListener(null);
        this.f25568i = null;
    }
}
