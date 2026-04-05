package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class bho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Field f21147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f21148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bfv f21149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bfg f21150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bjh f21151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f21152i;

    public bho(String str, boolean z, boolean z2) {
        this.f21144a = str;
        this.f21145b = z;
        this.f21146c = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bho(String str, boolean z, boolean z2, Field field, boolean z3, bfv bfvVar, bfg bfgVar, bjh bjhVar, boolean z4) {
        this(str, z, z2);
        this.f21147d = field;
        this.f21148e = z3;
        this.f21149f = bfvVar;
        this.f21150g = bfgVar;
        this.f21151h = bjhVar;
        this.f21152i = z4;
    }

    public final void a(bjj bjjVar, Object obj) throws IllegalAccessException {
        Object obj2 = this.f21149f.read(bjjVar);
        if (obj2 == null && this.f21152i) {
            return;
        }
        this.f21147d.set(obj, obj2);
    }

    public final void b(bjl bjlVar, Object obj) throws IllegalAccessException {
        (this.f21148e ? this.f21149f : new bhv(this.f21150g, this.f21149f, this.f21151h.d())).write(bjlVar, this.f21147d.get(obj));
    }

    public final boolean c(Object obj) {
        return this.f21145b && this.f21147d.get(obj) != obj;
    }
}
