package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class blj extends bjr<String> implements RandomAccess, blk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final blj f21357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Object> f21358b;

    static {
        blj bljVar = new blj(10);
        f21357a = bljVar;
        bljVar.b();
    }

    public blj() {
        this(10);
    }

    public blj(int i2) {
        this((ArrayList<Object>) new ArrayList(i2));
    }

    private blj(ArrayList<Object> arrayList) {
        this.f21358b = arrayList;
    }

    private static String j(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof bkd ? ((bkd) obj).s() : bld.f((byte[]) obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        a();
        this.f21358b.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection<? extends String> collection) {
        a();
        if (collection instanceof blk) {
            collection = ((blk) collection).h();
        }
        boolean zAddAll = this.f21358b.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f21358b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blc
    public final /* bridge */ /* synthetic */ blc d(int i2) {
        if (i2 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2);
        arrayList.addAll(this.f21358b);
        return new blj((ArrayList<Object>) arrayList);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blk
    public final blk e() {
        return c() ? new bnc(this) : this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blk
    public final Object f(int i2) {
        return this.f21358b.get(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String get(int i2) {
        Object obj = this.f21358b.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof bkd) {
            bkd bkdVar = (bkd) obj;
            String strS = bkdVar.s();
            if (bkdVar.h()) {
                this.f21358b.set(i2, strS);
            }
            return strS;
        }
        byte[] bArr = (byte[]) obj;
        String strF = bld.f(bArr);
        if (bld.h(bArr)) {
            this.f21358b.set(i2, strF);
        }
        return strF;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blk
    public final List<?> h() {
        return Collections.unmodifiableList(this.f21358b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blk
    public final void i(bkd bkdVar) {
        a();
        this.f21358b.add(bkdVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        a();
        Object objRemove = this.f21358b.remove(i2);
        ((AbstractList) this).modCount++;
        return j(objRemove);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        a();
        return j(this.f21358b.set(i2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21358b.size();
    }
}
