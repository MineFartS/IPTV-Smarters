package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes.dex */
public final class bhv<T> extends bfv<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bfg f21173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bfv<T> f21174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f21175c;

    public bhv(bfg bfgVar, bfv<T> bfvVar, Type type) {
        this.f21173a = bfgVar;
        this.f21174b = bfvVar;
        this.f21175c = type;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final T read(bjj bjjVar) {
        return this.f21174b.read(bjjVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final void write(bjl bjlVar, T t) {
        bfv<T> bfvVarA = this.f21174b;
        Type type = this.f21175c;
        Type type2 = (t == null || !(type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) ? type : t.getClass();
        if (type2 != type) {
            bfvVarA = this.f21173a.a(bjh.b(type2));
            if (bfvVarA instanceof bhn) {
                bfv<T> bfvVar = this.f21174b;
                if (!(bfvVar instanceof bhn)) {
                    bfvVarA = bfvVar;
                }
            }
        }
        bfvVarA.write(bjlVar, t);
    }
}
