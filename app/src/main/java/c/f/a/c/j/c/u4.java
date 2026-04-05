package c.f.a.c.j.c;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;

/* JADX INFO: loaded from: classes2.dex */
public final class u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f13095a = new c.f.a.c.d.v.b("ApplicationAnalytics");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f13096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k9 f13097c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SharedPreferences f13100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public la f13101g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f13099e = new w0(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f13098d = new Runnable(this) { // from class: c.f.a.c.j.c.t3

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u4 f13085b;

        {
            this.f13085b = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f13085b.p();
        }
    };

    public u4(SharedPreferences sharedPreferences, x0 x0Var, Bundle bundle, String str) {
        this.f13100f = sharedPreferences;
        this.f13096b = x0Var;
        this.f13097c = new k9(bundle, str);
    }

    public static String a() {
        c.f.a.c.d.u.c cVarA = c.f.a.c.d.u.b.d().a();
        if (cVarA == null) {
            return null;
        }
        return cVarA.L();
    }

    public final void c(SharedPreferences sharedPreferences, String str) {
        if (x(str)) {
            f13095a.a("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            return;
        }
        this.f13101g = la.a(sharedPreferences);
        if (x(str)) {
            f13095a.a("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
            la.f12928b = this.f13101g.f12931e + 1;
            return;
        }
        f13095a.a("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
        la laVarC = la.c();
        this.f13101g = laVarC;
        laVarC.f12929c = a();
        this.f13101g.f12933g = str;
    }

    public final void d(c.f.a.c.d.u.r rVar) {
        rVar.a(new v5(this), c.f.a.c.d.u.d.class);
    }

    public final void h() {
        this.f13099e.postDelayed(this.f13098d, 300000L);
    }

    public final void i() {
        this.f13099e.removeCallbacks(this.f13098d);
    }

    public final boolean j() {
        String str;
        if (this.f13101g == null) {
            f13095a.a("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        String strA = a();
        if (strA != null && (str = this.f13101g.f12929c) != null && TextUtils.equals(str, strA)) {
            return true;
        }
        f13095a.a("The analytics session doesn't match the application ID %s", strA);
        return false;
    }

    public final void k() {
        this.f13101g.b(this.f13100f);
    }

    public final void n(c.f.a.c.d.u.d dVar, int i2) {
        v(dVar);
        this.f13096b.b(this.f13097c.g(this.f13101g, i2), v4.APP_SESSION_END);
        i();
        this.f13101g = null;
    }

    public final /* synthetic */ void p() {
        la laVar = this.f13101g;
        if (laVar != null) {
            this.f13096b.b(this.f13097c.a(laVar), v4.APP_SESSION_PING);
        }
        h();
    }

    public final void u(c.f.a.c.d.u.d dVar) {
        f13095a.a("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        la laVarC = la.c();
        this.f13101g = laVarC;
        laVarC.f12929c = a();
        if (dVar == null || dVar.o() == null) {
            return;
        }
        this.f13101g.f12930d = dVar.o().R();
    }

    public final void v(c.f.a.c.d.u.d dVar) {
        if (!j()) {
            f13095a.g("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]);
            u(dVar);
            return;
        }
        CastDevice castDeviceO = dVar != null ? dVar.o() : null;
        if (castDeviceO == null || TextUtils.equals(this.f13101g.f12930d, castDeviceO.R())) {
            return;
        }
        this.f13101g.f12930d = castDeviceO.R();
    }

    public final boolean x(String str) {
        String str2;
        if (!j()) {
            return false;
        }
        if (str != null && (str2 = this.f13101g.f12933g) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        f13095a.a("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
