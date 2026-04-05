package minefarts.iptvsmarters.vpn.activities;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class VPNLoginActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VPNLoginActivity f29978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f29979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f29980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f29981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f29982f;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ VPNLoginActivity f29983d;

        public a(VPNLoginActivity vPNLoginActivity) {
            this.f29983d = vPNLoginActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f29983d.onclick(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ VPNLoginActivity f29985d;

        public b(VPNLoginActivity vPNLoginActivity) {
            this.f29985d = vPNLoginActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f29985d.onclick(view);
        }
    }

    public class c extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ VPNLoginActivity f29987d;

        public c(VPNLoginActivity vPNLoginActivity) {
            this.f29987d = vPNLoginActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f29987d.onclick(view);
        }
    }

    public class d extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ VPNLoginActivity f29989d;

        public d(VPNLoginActivity vPNLoginActivity) {
            this.f29989d = vPNLoginActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f29989d.onclick(view);
        }
    }

    public VPNLoginActivity_ViewBinding(VPNLoginActivity vPNLoginActivity, View view) {
        this.f29978b = vPNLoginActivity;
        vPNLoginActivity.et_password = (EditText) b.c.c.c(view, R.id.et_password, "field 'et_password'", EditText.class);
        vPNLoginActivity.et_username = (EditText) b.c.c.c(view, R.id.et_username, "field 'et_username'", EditText.class);
        View viewB = b.c.c.b(view, R.id.btn_connect, "field 'btn_connect' and method 'onclick'");
        vPNLoginActivity.btn_connect = (Button) b.c.c.a(viewB, R.id.btn_connect, "field 'btn_connect'", Button.class);
        this.f29979c = viewB;
        viewB.setOnClickListener(new a(vPNLoginActivity));
        View viewB2 = b.c.c.b(view, R.id.btn_back, "field 'btn_back' and method 'onclick'");
        vPNLoginActivity.btn_back = (Button) b.c.c.a(viewB2, R.id.btn_back, "field 'btn_back'", Button.class);
        this.f29980d = viewB2;
        viewB2.setOnClickListener(new b(vPNLoginActivity));
        View viewB3 = b.c.c.b(view, R.id.btn_save, "field 'btn_save' and method 'onclick'");
        vPNLoginActivity.btn_save = (Button) b.c.c.a(viewB3, R.id.btn_save, "field 'btn_save'", Button.class);
        this.f29981e = viewB3;
        viewB3.setOnClickListener(new c(vPNLoginActivity));
        vPNLoginActivity.iv_spinner_down = (ImageView) b.c.c.c(view, R.id.iv_spinner_down, "field 'iv_spinner_down'", ImageView.class);
        vPNLoginActivity.username_p = (LinearLayout) b.c.c.c(view, R.id.username_p, "field 'username_p'", LinearLayout.class);
        vPNLoginActivity.password_p = (LinearLayout) b.c.c.c(view, R.id.password_p, "field 'password_p'", LinearLayout.class);
        vPNLoginActivity.spinner_server = (Spinner) b.c.c.c(view, R.id.spinner_server, "field 'spinner_server'", Spinner.class);
        View viewB4 = b.c.c.b(view, R.id.ll_import_certificate, "method 'onclick'");
        this.f29982f = viewB4;
        viewB4.setOnClickListener(new d(vPNLoginActivity));
    }

    @Override // butterknife.Unbinder
    public void a() {
        VPNLoginActivity vPNLoginActivity = this.f29978b;
        if (vPNLoginActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f29978b = null;
        vPNLoginActivity.et_password = null;
        vPNLoginActivity.et_username = null;
        vPNLoginActivity.btn_connect = null;
        vPNLoginActivity.btn_back = null;
        vPNLoginActivity.btn_save = null;
        vPNLoginActivity.iv_spinner_down = null;
        vPNLoginActivity.username_p = null;
        vPNLoginActivity.password_p = null;
        vPNLoginActivity.spinner_server = null;
        this.f29979c.setOnClickListener(null);
        this.f29979c = null;
        this.f29980d.setOnClickListener(null);
        this.f29980d = null;
        this.f29981e.setOnClickListener(null);
        this.f29981e = null;
        this.f29982f.setOnClickListener(null);
        this.f29982f = null;
    }
}
