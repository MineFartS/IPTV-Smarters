package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class ali<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final akt f20036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final alc f20037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final alg<T> f20038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<alh<T>> f20039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f20040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f20041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20042g;

    public ali(Looper looper, akt aktVar, alg<T> algVar) {
        this(new CopyOnWriteArraySet(), looper, aktVar, algVar);
    }

    private ali(CopyOnWriteArraySet<alh<T>> copyOnWriteArraySet, Looper looper, akt aktVar, alg<T> algVar) {
        this.f20036a = aktVar;
        this.f20039d = copyOnWriteArraySet;
        this.f20038c = algVar;
        this.f20040e = new ArrayDeque<>();
        this.f20041f = new ArrayDeque<>();
        this.f20037b = aktVar.b(looper, new Handler.Callback() { // from class: com.google.ads.interactivemedia.v3.internal.ald
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                ali.h(this.f20028a, message);
                return true;
            }
        });
    }

    public static /* synthetic */ void h(ali aliVar, Message message) {
        int i2 = message.what;
        if (i2 != 0) {
            if (i2 == 1) {
                aliVar.g(message.arg1, (alf) message.obj);
                aliVar.e();
                return;
            }
            return;
        }
        Iterator<alh<T>> it = aliVar.f20039d.iterator();
        while (it.hasNext()) {
            it.next().b(aliVar.f20038c);
            if (aliVar.f20037b.d()) {
                return;
            }
        }
    }

    public final ali<T> a(Looper looper, alg<T> algVar) {
        return new ali<>(this.f20039d, looper, this.f20036a, algVar);
    }

    public final void b(T t) {
        if (this.f20042g) {
            return;
        }
        ajr.b(t);
        this.f20039d.add(new alh<>(t));
    }

    public final void c() {
        if (this.f20041f.isEmpty()) {
            return;
        }
        if (!this.f20037b.d()) {
            this.f20037b.a(0).a();
        }
        boolean zIsEmpty = this.f20040e.isEmpty();
        this.f20040e.addAll(this.f20041f);
        this.f20041f.clear();
        if (!zIsEmpty) {
            return;
        }
        while (!this.f20040e.isEmpty()) {
            this.f20040e.peekFirst().run();
            this.f20040e.removeFirst();
        }
    }

    public final void d(final int i2, final alf<T> alfVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f20039d);
        this.f20041f.add(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.ale
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i3 = i2;
                alf alfVar2 = alfVar;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    ((alh) it.next()).a(i3, alfVar2);
                }
            }
        });
    }

    public final void e() {
        Iterator<alh<T>> it = this.f20039d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f20038c);
        }
        this.f20039d.clear();
        this.f20042g = true;
    }

    public final void f(T t) {
        for (alh<T> alhVar : this.f20039d) {
            if (alhVar.f20032a.equals(t)) {
                alhVar.c(this.f20038c);
                this.f20039d.remove(alhVar);
            }
        }
    }

    public final void g(int i2, alf<T> alfVar) {
        d(i2, alfVar);
        c();
    }

    public final void i(alf<T> alfVar) {
        this.f20037b.c(1, 1036, 0, alfVar).a();
    }
}
