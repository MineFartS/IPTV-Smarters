package org.achartengine.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class IndexXYMap<K, V> extends TreeMap<K, V> {
    private final List<K> indexList = new ArrayList();
    private double maxXDifference = 0.0d;

    private void updateMaxXDifference() {
        if (this.indexList.size() < 2) {
            this.maxXDifference = 0.0d;
            return;
        }
        double dDoubleValue = ((Double) this.indexList.get(r0.size() - 1)).doubleValue();
        List<K> list = this.indexList;
        if (Math.abs(dDoubleValue - ((Double) list.get(list.size() - 2)).doubleValue()) > this.maxXDifference) {
            double dDoubleValue2 = ((Double) this.indexList.get(r0.size() - 1)).doubleValue();
            List<K> list2 = this.indexList;
            this.maxXDifference = Math.abs(dDoubleValue2 - ((Double) list2.get(list2.size() - 2)).doubleValue());
        }
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        updateMaxXDifference();
        super.clear();
        this.indexList.clear();
    }

    public XYEntry<K, V> getByIndex(int i2) {
        K k2 = this.indexList.get(i2);
        return new XYEntry<>(k2, get(k2));
    }

    public int getIndexForKey(K k2) {
        return Collections.binarySearch(this.indexList, k2, null);
    }

    public double getMaxXDifference() {
        return this.maxXDifference;
    }

    public K getXByIndex(int i2) {
        return this.indexList.get(i2);
    }

    public V getYByIndex(int i2) {
        return get(this.indexList.get(i2));
    }

    public V put(int i2, K k2, V v) {
        this.indexList.add(i2, k2);
        updateMaxXDifference();
        return (V) super.put(k2, v);
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        this.indexList.add(k2);
        updateMaxXDifference();
        return (V) super.put(k2, v);
    }

    public XYEntry<K, V> removeByIndex(int i2) {
        K kRemove = this.indexList.remove(i2);
        return new XYEntry<>(kRemove, remove(kRemove));
    }
}
