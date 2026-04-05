package c.f.a.c.k.b;

import android.os.Bundle;
import android.os.RemoteException;
import c.f.a.c.j.h.td;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class m8 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ la f14124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ td f14125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u8 f14126f;

    public m8(u8 u8Var, String str, String str2, la laVar, td tdVar) {
        this.f14126f = u8Var;
        this.f14122b = str;
        this.f14123c = str2;
        this.f14124d = laVar;
        this.f14125e = tdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                p3 p3Var = this.f14126f.f14364d;
                if (p3Var == null) {
                    this.f14126f.f14413a.c().o().c("Failed to get conditional properties; not connected to service", this.f14122b, this.f14123c);
                } else {
                    c.f.a.c.f.q.o.i(this.f14124d);
                    arrayList = ea.Y(p3Var.r(this.f14122b, this.f14123c, this.f14124d));
                    this.f14126f.D();
                }
            } catch (RemoteException e2) {
                this.f14126f.f14413a.c().o().d("Failed to get conditional properties; remote exception", this.f14122b, this.f14123c, e2);
            }
        } finally {
            this.f14126f.f14413a.G().X(this.f14125e, arrayList);
        }
    }
}
