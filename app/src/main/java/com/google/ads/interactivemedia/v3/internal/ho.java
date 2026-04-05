package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class ho implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hc f21928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f21929b;

    public ho(hc hcVar, k kVar) {
        this.f21928a = hcVar;
        this.f21929b = kVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws ExecutionException, InterruptedException {
        if (this.f21928a.j() != null) {
            this.f21928a.j().get();
        }
        u uVarC = this.f21928a.c();
        if (uVarC == null) {
            return null;
        }
        try {
            synchronized (this.f21929b) {
                k kVar = this.f21929b;
                byte[] bArrAi = uVarC.ai();
                kVar.aa(bArrAi, bArrAi.length, bkm.a());
            }
            return null;
        } catch (blf | NullPointerException unused) {
            return null;
        }
    }
}
