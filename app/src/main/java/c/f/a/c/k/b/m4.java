package c.f.a.c.k.b;

import android.content.SharedPreferences;
import android.util.Pair;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o4 f14110e;

    public /* synthetic */ m4(o4 o4Var, String str, long j2, i4 i4Var) {
        this.f14110e = o4Var;
        c.f.a.c.f.q.o.e("health_monitor");
        c.f.a.c.f.q.o.a(j2 > 0);
        this.f14106a = "health_monitor:start";
        this.f14107b = "health_monitor:count";
        this.f14108c = "health_monitor:value";
        this.f14109d = j2;
    }

    public final void a(String str, long j2) {
        this.f14110e.g();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        long j3 = this.f14110e.p().getLong(this.f14107b, 0L);
        if (j3 <= 0) {
            SharedPreferences.Editor editorEdit = this.f14110e.p().edit();
            editorEdit.putString(this.f14108c, str);
            editorEdit.putLong(this.f14107b, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = this.f14110e.f14413a.G().h0().nextLong();
        long j4 = j3 + 1;
        long j5 = Long.MAX_VALUE / j4;
        SharedPreferences.Editor editorEdit2 = this.f14110e.p().edit();
        if ((jNextLong & Long.MAX_VALUE) < j5) {
            editorEdit2.putString(this.f14108c, str);
        }
        editorEdit2.putLong(this.f14107b, j4);
        editorEdit2.apply();
    }

    public final Pair<String, Long> b() {
        long jAbs;
        this.f14110e.g();
        this.f14110e.g();
        long jD = d();
        if (jD == 0) {
            c();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jD - this.f14110e.f14413a.a().a());
        }
        long j2 = this.f14109d;
        if (jAbs < j2) {
            return null;
        }
        if (jAbs > j2 + j2) {
            c();
            return null;
        }
        String string = this.f14110e.p().getString(this.f14108c, null);
        long j3 = this.f14110e.p().getLong(this.f14107b, 0L);
        c();
        return (string == null || j3 <= 0) ? o4.f14173c : new Pair<>(string, Long.valueOf(j3));
    }

    public final void c() {
        this.f14110e.g();
        long jA = this.f14110e.f14413a.a().a();
        SharedPreferences.Editor editorEdit = this.f14110e.p().edit();
        editorEdit.remove(this.f14107b);
        editorEdit.remove(this.f14108c);
        editorEdit.putLong(this.f14106a, jA);
        editorEdit.apply();
    }

    public final long d() {
        return this.f14110e.p().getLong(this.f14106a, 0L);
    }
}
