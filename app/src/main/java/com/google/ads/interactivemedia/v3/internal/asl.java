package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public class asl extends asj implements List {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ asm f20473f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asl(asm asmVar, Object obj, List list, asj asjVar) {
        super(asmVar, obj, list, asjVar);
        this.f20473f = asmVar;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        b();
        boolean zIsEmpty = this.f20468b.isEmpty();
        d().add(i2, obj);
        asm.q(this.f20473f);
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = d().addAll(i2, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        asm.s(this.f20473f, this.f20468b.size() - size);
        if (size != 0) {
            return zAddAll;
        }
        a();
        return true;
    }

    public final List d() {
        return (List) this.f20468b;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        b();
        return d().get(i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return d().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return d().lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new ask(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        b();
        return new ask(this, i2);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        b();
        Object objRemove = d().remove(i2);
        asm.r(this.f20473f);
        c();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        b();
        return d().set(i2, obj);
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        b();
        asm asmVar = this.f20473f;
        Object obj = this.f20467a;
        List listSubList = d().subList(i2, i3);
        asj asjVar = this.f20469c;
        if (asjVar == null) {
            asjVar = this;
        }
        return asmVar.g(obj, listSubList, asjVar);
    }
}
