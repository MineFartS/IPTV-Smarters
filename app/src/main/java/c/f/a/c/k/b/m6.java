package c.f.a.c.k.b;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class m6 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f14115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f14116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f14117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f14118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f14119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f14120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f7 f14121j;

    public m6(f7 f7Var, String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f14121j = f7Var;
        this.f14113b = str;
        this.f14114c = str2;
        this.f14115d = j2;
        this.f14116e = bundle;
        this.f14117f = z;
        this.f14118g = z2;
        this.f14119h = z3;
        this.f14120i = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14121j.Z(this.f14113b, this.f14114c, this.f14115d, this.f14116e, this.f14117f, this.f14118g, this.f14119h, this.f14120i);
    }
}
