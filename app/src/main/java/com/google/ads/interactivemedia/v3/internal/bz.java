package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class bz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f21531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f21532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<by> f21533c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private by f21534d = null;

    public bz() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f21531a = linkedBlockingQueue;
        this.f21532b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void c() {
        by byVarPoll = this.f21533c.poll();
        this.f21534d = byVarPoll;
        if (byVarPoll != null) {
            byVarPoll.executeOnExecutor(this.f21532b, new Object[0]);
        }
    }

    public final void a(by byVar) {
        byVar.b(this);
        this.f21533c.add(byVar);
        if (this.f21534d == null) {
            c();
        }
    }

    public final void b() {
        this.f21534d = null;
        c();
    }
}
