package c.f.a.c.d.v;

import android.content.Context;
import android.os.Bundle;
import c.f.a.c.f.o.a;
import c.f.a.c.f.o.e;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends c.f.a.c.f.o.e<a.d.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.g<d0> f12212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.AbstractC0156a<d0, a.d.c> f12213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c.f.a.c.f.o.a<a.d.c> f12214c;

    static {
        a.g<d0> gVar = new a.g<>();
        f12212a = gVar;
        b0 b0Var = new b0();
        f12213b = b0Var;
        f12214c = new c.f.a.c.f.o.a<>("CastApi.API", b0Var, gVar);
    }

    public x(Context context) {
        super(context, f12214c, (a.d) null, e.a.f12357a);
    }

    public final c.f.a.c.o.i<Bundle> b(final String[] strArr) {
        return doRead(c.f.a.c.f.o.n.r.a().b(new c.f.a.c.f.o.n.p(this, strArr) { // from class: c.f.a.c.d.v.a0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final x f12122a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String[] f12123b;

            {
                this.f12122a = this;
                this.f12123b = strArr;
            }

            @Override // c.f.a.c.f.o.n.p
            public final void accept(Object obj, Object obj2) {
                x xVar = this.f12122a;
                String[] strArr2 = this.f12123b;
                ((l) ((d0) obj).getService()).s0(new c0(xVar, (c.f.a.c.o.j) obj2), strArr2);
            }
        }).d(c.f.a.c.d.b0.f11570d).c(false).a());
    }

    public final c.f.a.c.o.i<Bundle> c(final String[] strArr) {
        return doRead(c.f.a.c.f.o.n.r.a().b(new c.f.a.c.f.o.n.p(this, strArr) { // from class: c.f.a.c.d.v.z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final x f12216a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String[] f12217b;

            {
                this.f12216a = this;
                this.f12217b = strArr;
            }

            @Override // c.f.a.c.f.o.n.p
            public final void accept(Object obj, Object obj2) {
                x xVar = this.f12216a;
                String[] strArr2 = this.f12217b;
                ((l) ((d0) obj).getService()).c0(new e0(xVar, (c.f.a.c.o.j) obj2), strArr2);
            }
        }).d(c.f.a.c.d.b0.f11573g).c(false).a());
    }
}
