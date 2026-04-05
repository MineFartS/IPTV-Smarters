package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class ScreenTypeSettingsActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScreenTypeSettingsActivity f26241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f26242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f26243d;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ScreenTypeSettingsActivity f26244d;

        public a(ScreenTypeSettingsActivity screenTypeSettingsActivity) {
            this.f26244d = screenTypeSettingsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26244d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ScreenTypeSettingsActivity f26246d;

        public b(ScreenTypeSettingsActivity screenTypeSettingsActivity) {
            this.f26246d = screenTypeSettingsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26246d.onViewClicked(view);
        }
    }

    public ScreenTypeSettingsActivity_ViewBinding(ScreenTypeSettingsActivity screenTypeSettingsActivity, View view) {
        this.f26241b = screenTypeSettingsActivity;
        screenTypeSettingsActivity.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        screenTypeSettingsActivity.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        View viewB = c.b(view, R.id.bt_save_changes, "field 'btSaveChanges' and method 'onViewClicked'");
        screenTypeSettingsActivity.btSaveChanges = (Button) c.a(viewB, R.id.bt_save_changes, "field 'btSaveChanges'", Button.class);
        this.f26242c = viewB;
        viewB.setOnClickListener(new a(screenTypeSettingsActivity));
        View viewB2 = c.b(view, R.id.btn_back_playerselection, "field 'btnBackPlayerselection' and method 'onViewClicked'");
        screenTypeSettingsActivity.btnBackPlayerselection = (Button) c.a(viewB2, R.id.btn_back_playerselection, "field 'btnBackPlayerselection'", Button.class);
        this.f26243d = viewB2;
        viewB2.setOnClickListener(new b(screenTypeSettingsActivity));
        screenTypeSettingsActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        screenTypeSettingsActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        screenTypeSettingsActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        screenTypeSettingsActivity.rg_mobile_tv = (RadioGroup) c.c(view, R.id.rg_mobile_tv, "field 'rg_mobile_tv'", RadioGroup.class);
        screenTypeSettingsActivity.rb_mobile = (RadioButton) c.c(view, R.id.rb_mobile, "field 'rb_mobile'", RadioButton.class);
        screenTypeSettingsActivity.rb_tv = (RadioButton) c.c(view, R.id.rb_tv, "field 'rb_tv'", RadioButton.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ScreenTypeSettingsActivity screenTypeSettingsActivity = this.f26241b;
        if (screenTypeSettingsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26241b = null;
        screenTypeSettingsActivity.toolbar = null;
        screenTypeSettingsActivity.appbarToolbar = null;
        screenTypeSettingsActivity.btSaveChanges = null;
        screenTypeSettingsActivity.btnBackPlayerselection = null;
        screenTypeSettingsActivity.date = null;
        screenTypeSettingsActivity.time = null;
        screenTypeSettingsActivity.logo = null;
        screenTypeSettingsActivity.rg_mobile_tv = null;
        screenTypeSettingsActivity.rb_mobile = null;
        screenTypeSettingsActivity.rb_tv = null;
        this.f26242c.setOnClickListener(null);
        this.f26242c = null;
        this.f26243d.setOnClickListener(null);
        this.f26243d = null;
    }
}
