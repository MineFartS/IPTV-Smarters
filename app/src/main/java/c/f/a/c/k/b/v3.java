package c.f.a.c.k.b;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class v3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y3 f14387g;

    public v3(y3 y3Var, int i2, String str, Object obj, Object obj2, Object obj3) {
        this.f14387g = y3Var;
        this.f14382b = i2;
        this.f14383c = str;
        this.f14384d = obj;
        this.f14385e = obj2;
        this.f14386f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y3 y3Var;
        char c2;
        o4 o4VarA = this.f14387g.f14413a.A();
        if (!o4VarA.j()) {
            Log.println(6, this.f14387g.z(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f14387g.f14465c == 0) {
            if (this.f14387g.f14413a.z().q()) {
                y3Var = this.f14387g;
                y3Var.f14413a.e();
                c2 = 'C';
            } else {
                y3Var = this.f14387g;
                y3Var.f14413a.e();
                c2 = 'c';
            }
            y3Var.f14465c = c2;
        }
        if (this.f14387g.f14466d < 0) {
            y3 y3Var2 = this.f14387g;
            y3Var2.f14413a.z().p();
            y3.F(y3Var2, 37000L);
        }
        char cCharAt = "01VDIWEA?".charAt(this.f14382b);
        char c3 = this.f14387g.f14465c;
        long j2 = this.f14387g.f14466d;
        String strA = y3.A(true, this.f14383c, this.f14384d, this.f14385e, this.f14386f);
        StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 24);
        sb.append("2");
        sb.append(cCharAt);
        sb.append(c3);
        sb.append(j2);
        sb.append(":");
        sb.append(strA);
        String string = sb.toString();
        if (string.length() > 1024) {
            string = this.f14383c.substring(0, 1024);
        }
        m4 m4Var = o4VarA.f14175e;
        if (m4Var != null) {
            m4Var.a(string, 1L);
        }
    }
}
