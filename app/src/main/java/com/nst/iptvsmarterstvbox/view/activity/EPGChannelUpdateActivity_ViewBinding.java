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
public class EPGChannelUpdateActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EPGChannelUpdateActivity f25467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f25468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f25469d;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EPGChannelUpdateActivity f25470d;

        public a(EPGChannelUpdateActivity ePGChannelUpdateActivity) {
            this.f25470d = ePGChannelUpdateActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25470d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EPGChannelUpdateActivity f25472d;

        public b(EPGChannelUpdateActivity ePGChannelUpdateActivity) {
            this.f25472d = ePGChannelUpdateActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f25472d.onViewClicked(view);
        }
    }

    public EPGChannelUpdateActivity_ViewBinding(EPGChannelUpdateActivity ePGChannelUpdateActivity, View view) {
        this.f25467b = ePGChannelUpdateActivity;
        ePGChannelUpdateActivity.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        ePGChannelUpdateActivity.appbarToolbar = (AppBarLayout) c.c(view, R.id.appbar_toolbar, "field 'appbarToolbar'", AppBarLayout.class);
        View viewB = c.b(view, R.id.bt_save_changes, "field 'btSaveChanges' and method 'onViewClicked'");
        ePGChannelUpdateActivity.btSaveChanges = (Button) c.a(viewB, R.id.bt_save_changes, "field 'btSaveChanges'", Button.class);
        this.f25468c = viewB;
        viewB.setOnClickListener(new a(ePGChannelUpdateActivity));
        View viewB2 = c.b(view, R.id.btn_back_playerselection, "field 'btnBackPlayerselection' and method 'onViewClicked'");
        ePGChannelUpdateActivity.btnBackPlayerselection = (Button) c.a(viewB2, R.id.btn_back_playerselection, "field 'btnBackPlayerselection'", Button.class);
        this.f25469d = viewB2;
        viewB2.setOnClickListener(new b(ePGChannelUpdateActivity));
        ePGChannelUpdateActivity.rgRadio = (RadioGroup) c.c(view, R.id.rg_radio, "field 'rgRadio'", RadioGroup.class);
        ePGChannelUpdateActivity.rbwithepg = (RadioButton) c.c(view, R.id.rb_withepg, "field 'rbwithepg'", RadioButton.class);
        ePGChannelUpdateActivity.rballchannels = (RadioButton) c.c(view, R.id.rb_allchannels, "field 'rballchannels'", RadioButton.class);
        ePGChannelUpdateActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        ePGChannelUpdateActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        ePGChannelUpdateActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        EPGChannelUpdateActivity ePGChannelUpdateActivity = this.f25467b;
        if (ePGChannelUpdateActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25467b = null;
        ePGChannelUpdateActivity.toolbar = null;
        ePGChannelUpdateActivity.appbarToolbar = null;
        ePGChannelUpdateActivity.btSaveChanges = null;
        ePGChannelUpdateActivity.btnBackPlayerselection = null;
        ePGChannelUpdateActivity.rgRadio = null;
        ePGChannelUpdateActivity.rbwithepg = null;
        ePGChannelUpdateActivity.rballchannels = null;
        ePGChannelUpdateActivity.date = null;
        ePGChannelUpdateActivity.time = null;
        ePGChannelUpdateActivity.logo = null;
        this.f25468c.setOnClickListener(null);
        this.f25468c = null;
        this.f25469d.setOnClickListener(null);
        this.f25469d = null;
    }
}
