package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class AutomationActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AutomationActivity f25374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f25375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f25376d;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AutomationActivity f25377d;

        public a(AutomationActivity automationActivity) {
            this.f25377d = automationActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25377d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AutomationActivity f25379d;

        public b(AutomationActivity automationActivity) {
            this.f25379d = automationActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25379d.onViewClicked(view);
        }
    }

    public AutomationActivity_ViewBinding(AutomationActivity automationActivity, View view) {
        this.f25374b = automationActivity;
        automationActivity.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        automationActivity.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        View viewB = c.b(view, R.id.bt_save_changes, "field 'btSaveChanges' and method 'onViewClicked'");
        automationActivity.btSaveChanges = (Button) c.a(viewB, R.id.bt_save_changes, "field 'btSaveChanges'", Button.class);
        this.f25375c = viewB;
        viewB.setOnClickListener(new a(automationActivity));
        View viewB2 = c.b(view, R.id.btn_back_playerselection, "field 'btnBackPlayerselection' and method 'onViewClicked'");
        automationActivity.btnBackPlayerselection = (Button) c.a(viewB2, R.id.btn_back_playerselection, "field 'btnBackPlayerselection'", Button.class);
        this.f25376d = viewB2;
        viewB2.setOnClickListener(new b(automationActivity));
        automationActivity.cbAutomationLiveVod = (CheckBox) c.c(view, R.id.cb_automation_live_vod, "field 'cbAutomationLiveVod'", CheckBox.class);
        automationActivity.cbAutomationEPG = (CheckBox) c.c(view, R.id.cb_automation_epg, "field 'cbAutomationEPG'", CheckBox.class);
        automationActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        automationActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        automationActivity.tv_auto_update_days = (TextView) c.c(view, R.id.tv_auto_update_days, "field 'tv_auto_update_days'", TextView.class);
        automationActivity.fl_auto_update_days = (FrameLayout) c.c(view, R.id.fl_auto_update_days, "field 'fl_auto_update_days'", FrameLayout.class);
        automationActivity.tv_auto_update_epg_days = (TextView) c.c(view, R.id.tv_auto_update_epg_days, "field 'tv_auto_update_epg_days'", TextView.class);
        automationActivity.fl_auto_update_epg_days = (FrameLayout) c.c(view, R.id.fl_auto_update_epg_days, "field 'fl_auto_update_epg_days'", FrameLayout.class);
        automationActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        AutomationActivity automationActivity = this.f25374b;
        if (automationActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25374b = null;
        automationActivity.toolbar = null;
        automationActivity.appbarToolbar = null;
        automationActivity.btSaveChanges = null;
        automationActivity.btnBackPlayerselection = null;
        automationActivity.cbAutomationLiveVod = null;
        automationActivity.cbAutomationEPG = null;
        automationActivity.date = null;
        automationActivity.time = null;
        automationActivity.tv_auto_update_days = null;
        automationActivity.fl_auto_update_days = null;
        automationActivity.tv_auto_update_epg_days = null;
        automationActivity.fl_auto_update_epg_days = null;
        automationActivity.logo = null;
        this.f25375c.setOnClickListener(null);
        this.f25375c = null;
        this.f25376d.setOnClickListener(null);
        this.f25376d = null;
    }
}
