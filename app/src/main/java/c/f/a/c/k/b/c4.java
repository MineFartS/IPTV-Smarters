package c.f.a.c.k.b;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class c4 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4 f13774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f13776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f13777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<String, List<String>> f13779g;

    public /* synthetic */ c4(String str, b4 b4Var, int i2, Throwable th, byte[] bArr, Map map, a4 a4Var) {
        c.f.a.c.f.q.o.i(b4Var);
        this.f13774b = b4Var;
        this.f13775c = i2;
        this.f13776d = th;
        this.f13777e = bArr;
        this.f13778f = str;
        this.f13779g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13774b.a(this.f13778f, this.f13775c, this.f13776d, this.f13777e, this.f13779g);
    }
}
