package c.f.d.w.n;

import c.f.d.o;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends c.f.d.y.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Writer f16554m = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final o f16555n = new o("closed");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<c.f.d.j> f16556o;
    public String p;
    public c.f.d.j q;

    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public f() {
        super(f16554m);
        this.f16556o = new ArrayList();
        this.q = c.f.d.l.f16461a;
    }

    @Override // c.f.d.y.c
    public c.f.d.y.c A0(double d2) {
        if (s() || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
            J0(new o(Double.valueOf(d2)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d2);
    }

    @Override // c.f.d.y.c
    public c.f.d.y.c B0(long j2) {
        J0(new o(Long.valueOf(j2)));
        return this;
    }

    @Override // c.f.d.y.c
    public c.f.d.y.c C0(Boolean bool) {
        if (bool == null) {
            return v();
        }
        J0(new o(bool));
        return this;
    }

    @Override // c.f.d.y.c
    public c.f.d.y.c D0(Number number) {
        if (number == null) {
            return v();
        }
        if (!s()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        J0(new o(number));
        return this;
    }

    @Override // c.f.d.y.c
    public c.f.d.y.c E0(String str) {
        if (str == null) {
            return v();
        }
        J0(new o(str));
        return this;
    }

    @Override // c.f.d.y.c
    public c.f.d.y.c F0(boolean z) {
        J0(new o(Boolean.valueOf(z)));
        return this;
    }

    public c.f.d.j H0() {
        if (this.f16556o.isEmpty()) {
            return this.q;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f16556o);
    }

    public final c.f.d.j I0() {
        return this.f16556o.get(r0.size() - 1);
    }

    public final void J0(c.f.d.j jVar) {
        if (this.p != null) {
            if (!jVar.t() || q()) {
                ((c.f.d.m) I0()).B(this.p, jVar);
            }
            this.p = null;
            return;
        }
        if (this.f16556o.isEmpty()) {
            this.q = jVar;
            return;
        }
        c.f.d.j jVarI0 = I0();
        if (!(jVarI0 instanceof c.f.d.g)) {
            throw new IllegalStateException();
        }
        ((c.f.d.g) jVarI0).B(jVar);
    }

    @Override // c.f.d.y.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f16556o.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f16556o.add(f16555n);
    }

    @Override // c.f.d.y.c, java.io.Flushable
    public void flush() {
    }

    @Override // c.f.d.y.c
    public c.f.d.y.c l() {
        c.f.d.g gVar = new c.f.d.g();
        J0(gVar);
        this.f16556o.add(gVar);
        return this;
    }

    @Override // c.f.d.y.c
    public c.f.d.y.c m() {
        c.f.d.m mVar = new c.f.d.m();
        J0(mVar);
        this.f16556o.add(mVar);
        return this;
    }

    @Override // c.f.d.y.c
    public c.f.d.y.c o() {
        if (this.f16556o.isEmpty() || this.p != null) {
            throw new IllegalStateException();
        }
        if (!(I0() instanceof c.f.d.g)) {
            throw new IllegalStateException();
        }
        this.f16556o.remove(r0.size() - 1);
        return this;
    }

    @Override // c.f.d.y.c
    public c.f.d.y.c p() {
        if (this.f16556o.isEmpty() || this.p != null) {
            throw new IllegalStateException();
        }
        if (!(I0() instanceof c.f.d.m)) {
            throw new IllegalStateException();
        }
        this.f16556o.remove(r0.size() - 1);
        return this;
    }

    @Override // c.f.d.y.c
    public c.f.d.y.c t(String str) {
        if (this.f16556o.isEmpty() || this.p != null) {
            throw new IllegalStateException();
        }
        if (!(I0() instanceof c.f.d.m)) {
            throw new IllegalStateException();
        }
        this.p = str;
        return this;
    }

    @Override // c.f.d.y.c
    public c.f.d.y.c v() {
        J0(c.f.d.l.f16461a);
        return this;
    }
}
