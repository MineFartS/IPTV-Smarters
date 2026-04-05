package c.f.a.c.j.c;

import a.t.l.g;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.t.l.g f12984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<a.t.l.f, Set<g.a>> f12985c = new HashMap();

    public o(a.t.l.g gVar) {
        this.f12984b = gVar;
    }

    @Override // c.f.a.c.j.c.l
    public final void D2() {
        a.t.l.g gVar = this.f12984b;
        gVar.l(gVar.e());
    }

    /* JADX INFO: renamed from: I2, reason: merged with bridge method [inline-methods] */
    public final void L2(a.t.l.f fVar) {
        Iterator<g.a> it = this.f12985c.get(fVar).iterator();
        while (it.hasNext()) {
            this.f12984b.k(it.next());
        }
    }

    public final void K2(a.t.l.f fVar, int i2) {
        Iterator<g.a> it = this.f12985c.get(fVar).iterator();
        while (it.hasNext()) {
            this.f12984b.b(fVar, it.next(), i2);
        }
    }

    @Override // c.f.a.c.j.c.l
    public final void L(Bundle bundle, final int i2) {
        final a.t.l.f fVarD = a.t.l.f.d(bundle);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            K2(fVarD, i2);
        } else {
            new w0(Looper.getMainLooper()).post(new Runnable(this, fVarD, i2) { // from class: c.f.a.c.j.c.r

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final o f13050b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final a.t.l.f f13051c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f13052d;

                {
                    this.f13050b = this;
                    this.f13051c = fVarD;
                    this.f13052d = i2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f13050b.M2(this.f13051c, this.f13052d);
                }
            });
        }
    }

    @Override // c.f.a.c.j.c.l
    public final String L1() {
        return this.f12984b.i().h();
    }

    public final /* synthetic */ void M2(a.t.l.f fVar, int i2) {
        synchronized (this.f12985c) {
            K2(fVar, i2);
        }
    }

    @Override // c.f.a.c.j.c.l
    public final Bundle U(String str) {
        for (g.C0076g c0076g : this.f12984b.h()) {
            if (c0076g.h().equals(str)) {
                return c0076g.f();
            }
        }
        return null;
    }

    @Override // c.f.a.c.j.c.l
    public final void U1(String str) {
        for (g.C0076g c0076g : this.f12984b.h()) {
            if (c0076g.h().equals(str)) {
                this.f12984b.l(c0076g);
                return;
            }
        }
    }

    @Override // c.f.a.c.j.c.l
    public final void Y(Bundle bundle) {
        final a.t.l.f fVarD = a.t.l.f.d(bundle);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            L2(fVarD);
        } else {
            new w0(Looper.getMainLooper()).post(new Runnable(this, fVarD) { // from class: c.f.a.c.j.c.q

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final o f13031b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final a.t.l.f f13032c;

                {
                    this.f13031b = this;
                    this.f13032c = fVarD;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f13031b.L2(this.f13032c);
                }
            });
        }
    }

    @Override // c.f.a.c.j.c.l
    public final int c() {
        return 12451009;
    }

    public final void c1(MediaSessionCompat mediaSessionCompat) {
        this.f12984b.m(mediaSessionCompat);
    }

    @Override // c.f.a.c.j.c.l
    public final boolean j(Bundle bundle, int i2) {
        return this.f12984b.j(a.t.l.f.d(bundle), i2);
    }

    @Override // c.f.a.c.j.c.l
    public final boolean p1() {
        return this.f12984b.i().h().equals(this.f12984b.e().h());
    }

    @Override // c.f.a.c.j.c.l
    public final void r2(Bundle bundle, n nVar) {
        a.t.l.f fVarD = a.t.l.f.d(bundle);
        if (!this.f12985c.containsKey(fVarD)) {
            this.f12985c.put(fVarD, new HashSet());
        }
        this.f12985c.get(fVarD).add(new p(nVar));
    }

    @Override // c.f.a.c.j.c.l
    public final void z0() {
        Iterator<Set<g.a>> it = this.f12985c.values().iterator();
        while (it.hasNext()) {
            Iterator<g.a> it2 = it.next().iterator();
            while (it2.hasNext()) {
                this.f12984b.k(it2.next());
            }
        }
        this.f12985c.clear();
    }
}
