package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public class ash extends asc implements SortedSet {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ asm f20463c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ash(asm asmVar, SortedMap sortedMap) {
        super(asmVar, sortedMap);
        this.f20463c = asmVar;
    }

    public SortedMap b() {
        return (SortedMap) this.f20584d;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new ash(this.f20463c, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new ash(this.f20463c, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new ash(this.f20463c, b().tailMap(obj));
    }
}
