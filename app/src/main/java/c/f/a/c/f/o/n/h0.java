package c.f.a.c.f.o.n;

import android.os.Looper;
import c.f.a.c.f.o.a;
import c.f.a.c.f.o.a.d;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes2.dex */
public final class h0<O extends a.d> extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotOnlyInitialized
    public final c.f.a.c.f.o.e<O> f12418b;

    public h0(c.f.a.c.f.o.e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f12418b = eVar;
    }

    @Override // c.f.a.c.f.o.f
    public final Looper a() {
        return this.f12418b.getLooper();
    }
}
