package c.f.a.c.k.b;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class l8 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f14063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ la f14066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u8 f14067f;

    public l8(u8 u8Var, AtomicReference atomicReference, String str, String str2, String str3, la laVar) {
        this.f14067f = u8Var;
        this.f14063b = atomicReference;
        this.f14064c = str2;
        this.f14065d = str3;
        this.f14066e = laVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        p3 p3Var;
        AtomicReference atomicReference2;
        List<b> listJ0;
        synchronized (this.f14063b) {
            try {
                try {
                    p3Var = this.f14067f.f14364d;
                } catch (RemoteException e2) {
                    this.f14067f.f14413a.c().o().d("(legacy) Failed to get conditional properties; remote exception", null, this.f14064c, e2);
                    this.f14063b.set(Collections.emptyList());
                    atomicReference = this.f14063b;
                }
                if (p3Var == null) {
                    this.f14067f.f14413a.c().o().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f14064c, this.f14065d);
                    this.f14063b.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    c.f.a.c.f.q.o.i(this.f14066e);
                    atomicReference2 = this.f14063b;
                    listJ0 = p3Var.r(this.f14064c, this.f14065d, this.f14066e);
                } else {
                    atomicReference2 = this.f14063b;
                    listJ0 = p3Var.J0(null, this.f14064c, this.f14065d);
                }
                atomicReference2.set(listJ0);
                this.f14067f.D();
                atomicReference = this.f14063b;
                atomicReference.notify();
            } finally {
                this.f14063b.notify();
            }
        }
    }
}
