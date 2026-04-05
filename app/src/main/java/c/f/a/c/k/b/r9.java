package c.f.a.c.k.b;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class r9 implements b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x9 f14285b;

    public r9(x9 x9Var, String str) {
        this.f14285b = x9Var;
        this.f14284a = str;
    }

    @Override // c.f.a.c.k.b.b4
    public final void a(String str, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f14285b.l(i2, th, bArr, this.f14284a);
    }
}
