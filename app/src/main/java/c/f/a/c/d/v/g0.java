package c.f.a.c.d.v;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f12150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f12152c;

    public g0(String str, String str2, String str3) {
        a.d(str);
        this.f12151b = str;
        this.f12150a = new b(str2);
        b(null);
    }

    public final String a() {
        return this.f12151b;
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f12150a.i(str);
    }

    public final void c(r rVar) {
        this.f12152c = rVar;
        if (rVar == null) {
            f();
        }
    }

    public final void d(String str, long j2, String str2) {
        this.f12150a.f("Sending text message: %s to: %s", str, null);
        r rVar = this.f12152c;
        if (rVar == null) {
            this.f12150a.c("Attempt to send text message without a sink", new Object[0]);
        } else {
            rVar.b(this.f12151b, str, j2, null);
        }
    }

    public void e(long j2, int i2) {
        throw null;
    }

    public void f() {
        throw null;
    }

    public final long g() {
        r rVar = this.f12152c;
        if (rVar != null) {
            return rVar.a();
        }
        this.f12150a.c("Attempt to generate requestId without a sink", new Object[0]);
        return 0L;
    }

    public void h(String str) {
        throw null;
    }
}
