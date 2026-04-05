package c.f.a.c.k.b;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class j9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k9 f14013a;

    public j9(k9 k9Var) {
        this.f14013a = k9Var;
    }

    public final void a() {
        this.f14013a.g();
        if (this.f14013a.f14413a.A().w(this.f14013a.f14413a.a().a())) {
            this.f14013a.f14413a.A().r.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f14013a.f14413a.c().w().a("Detected application was in foreground");
                c(this.f14013a.f14413a.a().a(), false);
            }
        }
    }

    public final void b(long j2, boolean z) {
        this.f14013a.g();
        this.f14013a.s();
        if (this.f14013a.f14413a.A().w(j2)) {
            this.f14013a.f14413a.A().r.b(true);
        }
        this.f14013a.f14413a.A().u.b(j2);
        if (this.f14013a.f14413a.A().r.a()) {
            c(j2, z);
        }
    }

    public final void c(long j2, boolean z) {
        this.f14013a.g();
        if (this.f14013a.f14413a.k()) {
            this.f14013a.f14413a.A().u.b(j2);
            this.f14013a.f14413a.c().w().b("Session started, time", Long.valueOf(this.f14013a.f14413a.a().b()));
            Long lValueOf = Long.valueOf(j2 / 1000);
            this.f14013a.f14413a.F().p("auto", "_sid", lValueOf, j2);
            this.f14013a.f14413a.A().r.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", lValueOf.longValue());
            if (this.f14013a.f14413a.z().w(null, m3.k0) && z) {
                bundle.putLong("_aib", 1L);
            }
            this.f14013a.f14413a.F().Y("auto", "_s", j2, bundle);
            c.f.a.c.j.h.qa.a();
            if (this.f14013a.f14413a.z().w(null, m3.p0)) {
                String strA = this.f14013a.f14413a.A().z.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strA);
                this.f14013a.f14413a.F().Y("auto", "_ssr", j2, bundle2);
            }
        }
    }
}
