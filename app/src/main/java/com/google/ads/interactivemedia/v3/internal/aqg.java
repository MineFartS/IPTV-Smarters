package com.google.ads.interactivemedia.v3.internal;

import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class aqg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aqv f20371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aqh f20372b;

    public aqg(aqh aqhVar, aqv aqvVar) {
        this.f20372b = aqhVar;
        this.f20371a = aqvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            aqv<List<aqv<?>>> aqvVarA = ((arf) this.f20372b.f20374b).a();
            Executor executor = arb.f20406b;
            aqvVarA.j(executor, this.f20372b);
            aqvVarA.i(executor, this.f20372b);
            aqvVarA.g(executor, this.f20372b);
        } catch (aqu e2) {
            if (e2.getCause() instanceof Exception) {
                this.f20372b.f20375c.k((Exception) e2.getCause());
            } else {
                this.f20372b.f20375c.k(e2);
            }
        } catch (Exception e3) {
            this.f20372b.f20375c.k(e3);
        }
    }
}
