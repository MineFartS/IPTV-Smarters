package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
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
public class PlayerSettingsActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PlayerSettingsActivity f26137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f26138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f26139d;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ PlayerSettingsActivity f26140d;

        public a(PlayerSettingsActivity playerSettingsActivity) {
            this.f26140d = playerSettingsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26140d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ PlayerSettingsActivity f26142d;

        public b(PlayerSettingsActivity playerSettingsActivity) {
            this.f26142d = playerSettingsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26142d.onViewClicked(view);
        }
    }

    public PlayerSettingsActivity_ViewBinding(PlayerSettingsActivity playerSettingsActivity, View view) {
        this.f26137b = playerSettingsActivity;
        playerSettingsActivity.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        playerSettingsActivity.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        View viewB = c.b(view, R.id.bt_save_changes, "field 'btSaveChanges' and method 'onViewClicked'");
        playerSettingsActivity.btSaveChanges = (Button) c.a(viewB, R.id.bt_save_changes, "field 'btSaveChanges'", Button.class);
        this.f26138c = viewB;
        viewB.setOnClickListener(new a(playerSettingsActivity));
        playerSettingsActivity.rgRadio = (RadioGroup) c.c(view, R.id.rg_radio, "field 'rgRadio'", RadioGroup.class);
        playerSettingsActivity.rbHardwareDecoder = (RadioButton) c.c(view, R.id.rb_hardware_decoder, "field 'rbHardwareDecoder'", RadioButton.class);
        playerSettingsActivity.rbNative = (RadioButton) c.c(view, R.id.rb_native, "field 'rbNative'", RadioButton.class);
        playerSettingsActivity.rbSoftwareDecoder = (RadioButton) c.c(view, R.id.rb_software_decoder, "field 'rbSoftwareDecoder'", RadioButton.class);
        View viewB2 = c.b(view, R.id.btn_back_playerselection, "field 'btnBackPlayerselection' and method 'onViewClicked'");
        playerSettingsActivity.btnBackPlayerselection = (Button) c.a(viewB2, R.id.btn_back_playerselection, "field 'btnBackPlayerselection'", Button.class);
        this.f26139d = viewB2;
        viewB2.setOnClickListener(new b(playerSettingsActivity));
        playerSettingsActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        playerSettingsActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        playerSettingsActivity.cbOpenSLES = (CheckBox) c.c(view, R.id.cb_opensl_es, "field 'cbOpenSLES'", CheckBox.class);
        playerSettingsActivity.cbOpenGL = (CheckBox) c.c(view, R.id.cb_opengl, "field 'cbOpenGL'", CheckBox.class);
        playerSettingsActivity.cbInfBuf = (CheckBox) c.c(view, R.id.cb_infbuf, "field 'cbInfBuf'", CheckBox.class);
        playerSettingsActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
        playerSettingsActivity.tv_buffer_size_limit = (TextView) c.c(view, R.id.tv_buffer_size_limit, "field 'tv_buffer_size_limit'", TextView.class);
        playerSettingsActivity.fl_buffer_size_limit = (FrameLayout) c.c(view, R.id.fl_buffer_size_limit, "field 'fl_buffer_size_limit'", FrameLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        PlayerSettingsActivity playerSettingsActivity = this.f26137b;
        if (playerSettingsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26137b = null;
        playerSettingsActivity.toolbar = null;
        playerSettingsActivity.appbarToolbar = null;
        playerSettingsActivity.btSaveChanges = null;
        playerSettingsActivity.rgRadio = null;
        playerSettingsActivity.rbHardwareDecoder = null;
        playerSettingsActivity.rbNative = null;
        playerSettingsActivity.rbSoftwareDecoder = null;
        playerSettingsActivity.btnBackPlayerselection = null;
        playerSettingsActivity.date = null;
        playerSettingsActivity.time = null;
        playerSettingsActivity.cbOpenSLES = null;
        playerSettingsActivity.cbOpenGL = null;
        playerSettingsActivity.cbInfBuf = null;
        playerSettingsActivity.logo = null;
        playerSettingsActivity.tv_buffer_size_limit = null;
        playerSettingsActivity.fl_buffer_size_limit = null;
        this.f26138c.setOnClickListener(null);
        this.f26138c = null;
        this.f26139d.setOnClickListener(null);
        this.f26139d = null;
    }
}
