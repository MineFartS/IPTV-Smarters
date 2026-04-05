package de.blinkt.openvpn;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;
import com.skyfishjy.library.RippleBackground;

/* JADX INFO: loaded from: classes2.dex */
public class LaunchVPN_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LaunchVPN f30265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f30266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f30267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f30268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f30269f;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LaunchVPN f30270d;

        public a(LaunchVPN launchVPN) {
            this.f30270d = launchVPN;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f30270d.onclick(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LaunchVPN f30272d;

        public b(LaunchVPN launchVPN) {
            this.f30272d = launchVPN;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f30272d.onclick(view);
        }
    }

    public class c extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LaunchVPN f30274d;

        public c(LaunchVPN launchVPN) {
            this.f30274d = launchVPN;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f30274d.onclick(view);
        }
    }

    public class d extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LaunchVPN f30276d;

        public d(LaunchVPN launchVPN) {
            this.f30276d = launchVPN;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f30276d.onclick(view);
        }
    }

    public LaunchVPN_ViewBinding(LaunchVPN launchVPN, View view) {
        this.f30265b = launchVPN;
        launchVPN.llTapToConnect = (LinearLayout) b.c.c.c(view, R.id.ll_tab_to_connect, "field 'llTapToConnect'", LinearLayout.class);
        launchVPN.llConnecting = (LinearLayout) b.c.c.c(view, R.id.ll_status_connecting, "field 'llConnecting'", LinearLayout.class);
        launchVPN.tv_touch_status = (TextView) b.c.c.c(view, R.id.tv_touch_status, "field 'tv_touch_status'", TextView.class);
        launchVPN.ripplePulseLayoutConnected = (RippleBackground) b.c.c.c(view, R.id.ripple_effect, "field 'ripplePulseLayoutConnected'", RippleBackground.class);
        View viewB = b.c.c.b(view, R.id.determinate, "method 'onclick'");
        this.f30266c = viewB;
        viewB.setOnClickListener(new a(launchVPN));
        View viewB2 = b.c.c.b(view, R.id.tv_add_user, "method 'onclick'");
        this.f30267d = viewB2;
        viewB2.setOnClickListener(new b(launchVPN));
        View viewB3 = b.c.c.b(view, R.id.ll_manage_profile, "method 'onclick'");
        this.f30268e = viewB3;
        viewB3.setOnClickListener(new c(launchVPN));
        View viewB4 = b.c.c.b(view, R.id.iv_add_more, "method 'onclick'");
        this.f30269f = viewB4;
        viewB4.setOnClickListener(new d(launchVPN));
    }

    @Override // butterknife.Unbinder
    public void a() {
        LaunchVPN launchVPN = this.f30265b;
        if (launchVPN == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f30265b = null;
        launchVPN.llTapToConnect = null;
        launchVPN.llConnecting = null;
        launchVPN.tv_touch_status = null;
        launchVPN.ripplePulseLayoutConnected = null;
        this.f30266c.setOnClickListener(null);
        this.f30266c = null;
        this.f30267d.setOnClickListener(null);
        this.f30267d = null;
        this.f30268e.setOnClickListener(null);
        this.f30268e = null;
        this.f30269f.setOnClickListener(null);
        this.f30269f = null;
    }
}
