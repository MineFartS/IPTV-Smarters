package c.f.a.c.k.b;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class n8 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f14154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ la f14157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f14158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u8 f14159g;

    public n8(u8 u8Var, AtomicReference atomicReference, String str, String str2, String str3, la laVar, boolean z) {
        this.f14159g = u8Var;
        this.f14154b = atomicReference;
        this.f14155c = str2;
        this.f14156d = str3;
        this.f14157e = laVar;
        this.f14158f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        p3 p3Var;
        AtomicReference atomicReference2;
        List<aa> listG2;
        synchronized (this.f14154b) {
            try {
                try {
                    p3Var = this.f14159g.f14364d;
                } catch (RemoteException e2) {
                    this.f14159g.f14413a.c().o().d("(legacy) Failed to get user properties; remote exception", null, this.f14155c, e2);
                    this.f14154b.set(Collections.emptyList());
                    atomicReference = this.f14154b;
                }
                if (p3Var == null) {
                    this.f14159g.f14413a.c().o().d("(legacy) Failed to get user properties; not connected to service", null, this.f14155c, this.f14156d);
                    this.f14154b.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    c.f.a.c.f.q.o.i(this.f14157e);
                    atomicReference2 = this.f14154b;
                    listG2 = p3Var.G0(this.f14155c, this.f14156d, this.f14158f, this.f14157e);
                } else {
                    atomicReference2 = this.f14154b;
                    listG2 = p3Var.G2(null, this.f14155c, this.f14156d, this.f14158f);
                }
                atomicReference2.set(listG2);
                this.f14159g.D();
                atomicReference = this.f14154b;
                atomicReference.notify();
            } finally {
                this.f14154b.notify();
            }
        }
    }
}
