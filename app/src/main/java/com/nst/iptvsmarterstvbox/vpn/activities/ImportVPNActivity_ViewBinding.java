package com.nst.iptvsmarterstvbox.vpn.activities;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class ImportVPNActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImportVPNActivity f29926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f29927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f29928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f29929e;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ImportVPNActivity f29930d;

        public a(ImportVPNActivity importVPNActivity) {
            this.f29930d = importVPNActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f29930d.onclick(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ImportVPNActivity f29932d;

        public b(ImportVPNActivity importVPNActivity) {
            this.f29932d = importVPNActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f29932d.onclick(view);
        }
    }

    public class c extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ImportVPNActivity f29934d;

        public c(ImportVPNActivity importVPNActivity) {
            this.f29934d = importVPNActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f29934d.onclick(view);
        }
    }

    public ImportVPNActivity_ViewBinding(ImportVPNActivity importVPNActivity, View view) {
        this.f29926b = importVPNActivity;
        importVPNActivity.et_certificate = (EditText) b.c.c.c(view, R.id.et_certificate, "field 'et_certificate'", EditText.class);
        View viewB = b.c.c.b(view, R.id.btn_import, "field 'btn_import' and method 'onclick'");
        importVPNActivity.btn_import = (Button) b.c.c.a(viewB, R.id.btn_import, "field 'btn_import'", Button.class);
        this.f29927c = viewB;
        viewB.setOnClickListener(new a(importVPNActivity));
        View viewB2 = b.c.c.b(view, R.id.btn_back, "field 'btn_back' and method 'onclick'");
        importVPNActivity.btn_back = (Button) b.c.c.a(viewB2, R.id.btn_back, "field 'btn_back'", Button.class);
        this.f29928d = viewB2;
        viewB2.setOnClickListener(new b(importVPNActivity));
        importVPNActivity.date = (TextView) b.c.c.c(view, R.id.date, "field 'date'", TextView.class);
        importVPNActivity.time = (TextView) b.c.c.c(view, R.id.time, "field 'time'", TextView.class);
        importVPNActivity.rb_file = (RadioButton) b.c.c.c(view, R.id.rb_file, "field 'rb_file'", RadioButton.class);
        importVPNActivity.rb_url = (RadioButton) b.c.c.c(view, R.id.rb_url, "field 'rb_url'", RadioButton.class);
        importVPNActivity.rl_browse = (LinearLayout) b.c.c.c(view, R.id.rl_browse, "field 'rl_browse'", LinearLayout.class);
        View viewB3 = b.c.c.b(view, R.id.bt_browse, "field 'bt_browse' and method 'onclick'");
        importVPNActivity.bt_browse = (Button) b.c.c.a(viewB3, R.id.bt_browse, "field 'bt_browse'", Button.class);
        this.f29929e = viewB3;
        viewB3.setOnClickListener(new c(importVPNActivity));
        importVPNActivity.ll_url = (LinearLayout) b.c.c.c(view, R.id.ll_url, "field 'll_url'", LinearLayout.class);
        importVPNActivity.tv_browse_error = (TextView) b.c.c.c(view, R.id.tv_browse_error, "field 'tv_browse_error'", TextView.class);
        importVPNActivity.tv_file_path = (TextView) b.c.c.c(view, R.id.tv_file_path, "field 'tv_file_path'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ImportVPNActivity importVPNActivity = this.f29926b;
        if (importVPNActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f29926b = null;
        importVPNActivity.et_certificate = null;
        importVPNActivity.btn_import = null;
        importVPNActivity.btn_back = null;
        importVPNActivity.date = null;
        importVPNActivity.time = null;
        importVPNActivity.rb_file = null;
        importVPNActivity.rb_url = null;
        importVPNActivity.rl_browse = null;
        importVPNActivity.bt_browse = null;
        importVPNActivity.ll_url = null;
        importVPNActivity.tv_browse_error = null;
        importVPNActivity.tv_file_path = null;
        this.f29927c.setOnClickListener(null);
        this.f29927c = null;
        this.f29928d.setOnClickListener(null);
        this.f29928d = null;
        this.f29929e.setOnClickListener(null);
        this.f29929e = null;
    }
}
