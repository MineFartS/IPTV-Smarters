package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class ase extends ash implements NavigableSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ asm f20460b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ase(asm asmVar, NavigableMap navigableMap) {
        super(asmVar, navigableMap);
        this.f20460b = asmVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ash
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final NavigableMap b() {
        return (NavigableMap) super.b();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return b().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new ase(this.f20460b, b().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return b().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new ase(this.f20460b, b().headMap(obj, z));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ash, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return b().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return b().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return auv.f(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return auv.f(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new ase(this.f20460b, b().subMap(obj, z, obj2, z2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ash, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new ase(this.f20460b, b().tailMap(obj, z));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ash, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
