package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class aiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<aix> f19868a = new CopyOnWriteArrayList<>();

    public final void a(Handler handler, aiz aizVar) {
        c(aizVar);
        this.f19868a.add(new aix(handler, aizVar));
    }

    public final void b(final int i2, final long j2, final long j3) {
        for (final aix aixVar : this.f19868a) {
            if (!aixVar.f19867c) {
                aixVar.f19865a.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.aiw
                    @Override // java.lang.Runnable
                    public final void run() {
                        aix aixVar2 = aixVar;
                        aixVar2.f19866b.U(i2, j2, j3);
                    }
                });
            }
        }
    }

    public final void c(aiz aizVar) {
        for (aix aixVar : this.f19868a) {
            if (aixVar.f19866b == aizVar) {
                aixVar.c();
                this.f19868a.remove(aixVar);
            }
        }
    }
}
