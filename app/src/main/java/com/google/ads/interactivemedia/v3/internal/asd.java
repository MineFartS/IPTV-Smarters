package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public final class asd extends asg implements NavigableMap {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ asm f20459c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asd(asm asmVar, NavigableMap navigableMap) {
        super(asmVar, navigableMap);
        this.f20459c = asmVar;
    }

    public final Map.Entry c(Iterator<Map.Entry> it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry next = it.next();
        Collection collectionA = this.f20459c.a();
        collectionA.addAll((Collection) next.getValue());
        it.remove();
        return auv.d(next.getKey(), this.f20459c.b(collectionA));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = h().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return a(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return h().ceilingKey(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asg
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final NavigableMap h() {
        return (NavigableMap) super.h();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return ((asd) descendingMap()).j();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new asd(this.f20459c, h().descendingMap());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asg
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NavigableSet i() {
        return new ase(this.f20459c, h());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asg, com.google.ads.interactivemedia.v3.internal.arz, com.google.ads.interactivemedia.v3.internal.auu, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NavigableSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = h().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return a(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = h().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return a(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return h().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new asd(this.f20459c, h().headMap(obj, z));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asg, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = h().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return a(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return h().higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = h().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return a(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = h().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return a(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return h().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return j();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return c(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return c(descendingMap().entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new asd(this.f20459c, h().subMap(obj, z, obj2, z2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asg, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new asd(this.f20459c, h().tailMap(obj, z));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asg, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
