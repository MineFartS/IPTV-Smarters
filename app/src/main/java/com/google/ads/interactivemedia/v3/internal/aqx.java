package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class aqx<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20395a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue<aqw<TResult>> f20396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20397c;

    public final void a(aqw<TResult> aqwVar) {
        synchronized (this.f20395a) {
            if (this.f20396b == null) {
                this.f20396b = new ArrayDeque();
            }
            this.f20396b.add(aqwVar);
        }
    }

    public final void b(aqv<TResult> aqvVar) {
        aqw<TResult> aqwVarPoll;
        synchronized (this.f20395a) {
            if (this.f20396b != null && !this.f20397c) {
                this.f20397c = true;
                while (true) {
                    synchronized (this.f20395a) {
                        aqwVarPoll = this.f20396b.poll();
                        if (aqwVarPoll == null) {
                            this.f20397c = false;
                            return;
                        }
                    }
                    aqwVarPoll.d(aqvVar);
                }
            }
        }
    }
}
