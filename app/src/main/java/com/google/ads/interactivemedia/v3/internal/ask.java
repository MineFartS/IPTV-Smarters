package com.google.ads.interactivemedia.v3.internal;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class ask extends asi implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ asl f20472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ask(asl aslVar) {
        super(aslVar);
        this.f20472d = aslVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ask(asl aslVar, int i2) {
        super(aslVar, aslVar.d().listIterator(i2));
        this.f20472d = aslVar;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.f20464a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f20472d.isEmpty();
        b().add(obj);
        asm.q(this.f20472d.f20473f);
        if (zIsEmpty) {
            this.f20472d.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }
}
