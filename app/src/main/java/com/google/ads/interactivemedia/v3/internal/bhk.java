package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bhk extends bjl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Writer f21132a = new bhj();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final bfq f21133b = new bfq("closed");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<bfl> f21134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f21135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bfl f21136e;

    public bhk() {
        super(f21132a);
        this.f21134c = new ArrayList();
        this.f21136e = bfn.f21046a;
    }

    private final bfl s() {
        return this.f21134c.get(r0.size() - 1);
    }

    private final void t(bfl bflVar) {
        if (this.f21135d != null) {
            if (!(bflVar instanceof bfn) || p()) {
                ((bfo) s()).b(this.f21135d, bflVar);
            }
            this.f21135d = null;
            return;
        }
        if (this.f21134c.isEmpty()) {
            this.f21136e = bflVar;
            return;
        }
        bfl bflVarS = s();
        if (!(bflVarS instanceof bfj)) {
            throw new IllegalStateException();
        }
        ((bfj) bflVarS).a(bflVar);
    }

    public final bfl a() {
        if (this.f21134c.isEmpty()) {
            return this.f21136e;
        }
        String strValueOf = String.valueOf(this.f21134c);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
        sb.append("Expected one JSON element but was ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjl
    public final void b() {
        bfj bfjVar = new bfj();
        t(bfjVar);
        this.f21134c.add(bfjVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjl
    public final void c() {
        bfo bfoVar = new bfo();
        t(bfoVar);
        this.f21134c.add(bfoVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjl, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f21134c.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f21134c.add(f21133b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjl
    public final void d() {
        if (this.f21134c.isEmpty() || this.f21135d != null) {
            throw new IllegalStateException();
        }
        if (!(s() instanceof bfj)) {
            throw new IllegalStateException();
        }
        this.f21134c.remove(r0.size() - 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjl
    public final void e() {
        if (this.f21134c.isEmpty() || this.f21135d != null) {
            throw new IllegalStateException();
        }
        if (!(s() instanceof bfo)) {
            throw new IllegalStateException();
        }
        this.f21134c.remove(r0.size() - 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjl
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f21134c.isEmpty() || this.f21135d != null) {
            throw new IllegalStateException();
        }
        if (!(s() instanceof bfo)) {
            throw new IllegalStateException();
        }
        this.f21135d = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjl, java.io.Flushable
    public final void flush() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjl
    public final void g() {
        t(bfn.f21046a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjl
    public final void h(long j2) {
        t(new bfq(Long.valueOf(j2)));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjl
    public final void i(Boolean bool) throws IOException {
        if (bool == null) {
            g();
        } else {
            t(new bfq(bool));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjl
    public final void j(Number number) throws IOException {
        if (number == null) {
            g();
            return;
        }
        if (!r()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                String strValueOf = String.valueOf(number);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 33);
                sb.append("JSON forbids NaN and infinities: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        t(new bfq(number));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjl
    public final void k(String str) throws IOException {
        if (str == null) {
            g();
        } else {
            t(new bfq(str));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjl
    public final void l(boolean z) {
        t(new bfq(Boolean.valueOf(z)));
    }
}
