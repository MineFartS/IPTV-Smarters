package com.google.ads.interactivemedia.v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class ato implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ atp f20525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20527c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20529e;

    public ato(atp atpVar) {
        this.f20525a = atpVar;
        this.f20526b = ((atq) atpVar.f20530b).f20539i;
        atq<K, V> atqVar = atpVar.f20530b;
        this.f20528d = atqVar.f20534d;
        this.f20529e = atqVar.f20533c;
    }

    private final void a() {
        if (this.f20525a.f20530b.f20534d != this.f20528d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f20526b != -2 && this.f20529e > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = this.f20525a.a(this.f20526b);
        this.f20527c = this.f20526b;
        this.f20526b = ((atq) this.f20525a.f20530b).f20542l[this.f20526b];
        this.f20529e--;
        return objA;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.Iterator
    public final void remove() {
        a();
        auv.p(this.f20527c != -1);
        atq<K, V> atqVar = this.f20525a.f20530b;
        int i2 = this.f20527c;
        atqVar.j(i2, auv.u(atqVar.f20531a[i2]));
        int i3 = this.f20526b;
        atq<K, V> atqVar2 = this.f20525a.f20530b;
        if (i3 == atqVar2.f20533c) {
            this.f20526b = this.f20527c;
        }
        this.f20527c = -1;
        this.f20528d = atqVar2.f20534d;
    }
}
