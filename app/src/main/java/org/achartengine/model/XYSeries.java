package org.achartengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import org.achartengine.util.IndexXYMap;
import org.achartengine.util.XYEntry;

/* JADX INFO: loaded from: classes2.dex */
public class XYSeries implements Serializable {
    private List<String> mAnnotations;
    private double mMaxX;
    private double mMaxY;
    private double mMinX;
    private double mMinY;
    private final int mScaleNumber;
    private final IndexXYMap<Double, Double> mStringXY;
    private String mTitle;
    private final IndexXYMap<Double, Double> mXY;

    public XYSeries(String str) {
        this(str, 0);
    }

    public XYSeries(String str, int i2) {
        this.mXY = new IndexXYMap<>();
        this.mMinX = Double.MAX_VALUE;
        this.mMaxX = -1.7976931348623157E308d;
        this.mMinY = Double.MAX_VALUE;
        this.mMaxY = -1.7976931348623157E308d;
        this.mAnnotations = new ArrayList();
        this.mStringXY = new IndexXYMap<>();
        this.mTitle = str;
        this.mScaleNumber = i2;
        initRange();
    }

    private void initRange() {
        this.mMinX = Double.MAX_VALUE;
        this.mMaxX = -1.7976931348623157E308d;
        this.mMinY = Double.MAX_VALUE;
        this.mMaxY = -1.7976931348623157E308d;
        int itemCount = getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            updateRange(getX(i2), getY(i2));
        }
    }

    private void updateRange(double d2, double d3) {
        this.mMinX = Math.min(this.mMinX, d2);
        this.mMaxX = Math.max(this.mMaxX, d2);
        this.mMinY = Math.min(this.mMinY, d3);
        this.mMaxY = Math.max(this.mMaxY, d3);
    }

    public synchronized void add(double d2, double d3) {
        while (this.mXY.get(Double.valueOf(d2)) != null) {
            d2 += getPadding(d2);
        }
        this.mXY.put(Double.valueOf(d2), Double.valueOf(d3));
        updateRange(d2, d3);
    }

    public synchronized void add(int i2, double d2, double d3) {
        while (this.mXY.get(Double.valueOf(d2)) != null) {
            d2 += getPadding(d2);
        }
        this.mXY.put(i2, Double.valueOf(d2), Double.valueOf(d3));
        updateRange(d2, d3);
    }

    public void addAnnotation(String str, double d2, double d3) {
        this.mAnnotations.add(str);
        while (this.mStringXY.get(Double.valueOf(d2)) != null) {
            d2 += getPadding(d2);
        }
        this.mStringXY.put(Double.valueOf(d2), Double.valueOf(d3));
    }

    public synchronized void clear() {
        clearAnnotations();
        clearSeriesValues();
    }

    public synchronized void clearAnnotations() {
        this.mAnnotations.clear();
        this.mStringXY.clear();
    }

    public synchronized void clearSeriesValues() {
        this.mXY.clear();
        initRange();
    }

    public String getAnnotationAt(int i2) {
        return this.mAnnotations.get(i2);
    }

    public int getAnnotationCount() {
        return this.mAnnotations.size();
    }

    public double getAnnotationX(int i2) {
        return this.mStringXY.getXByIndex(i2).doubleValue();
    }

    public double getAnnotationY(int i2) {
        return this.mStringXY.getYByIndex(i2).doubleValue();
    }

    public int getIndexForKey(double d2) {
        return this.mXY.getIndexForKey(Double.valueOf(d2));
    }

    public synchronized int getItemCount() {
        return this.mXY.size();
    }

    public double getMaxX() {
        return this.mMaxX;
    }

    public double getMaxY() {
        return this.mMaxY;
    }

    public double getMinX() {
        return this.mMinX;
    }

    public double getMinY() {
        return this.mMinY;
    }

    public double getPadding(double d2) {
        return Math.ulp(d2);
    }

    public synchronized SortedMap<Double, Double> getRange(double d2, double d3, boolean z) {
        if (z) {
            try {
                SortedMap<Double, Double> sortedMapHeadMap = this.mXY.headMap(Double.valueOf(d2));
                if (!sortedMapHeadMap.isEmpty()) {
                    d2 = sortedMapHeadMap.lastKey().doubleValue();
                }
                SortedMap<Double, Double> sortedMapTailMap = this.mXY.tailMap(Double.valueOf(d3));
                if (!sortedMapTailMap.isEmpty()) {
                    Iterator<Double> it = sortedMapTailMap.keySet().iterator();
                    d3 = it.hasNext() ? it.next().doubleValue() : d3 + it.next().doubleValue();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d2 <= d3) {
            return this.mXY.subMap(Double.valueOf(d2), Double.valueOf(d3));
        }
        return new TreeMap();
    }

    public int getScaleNumber() {
        return this.mScaleNumber;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public synchronized double getX(int i2) {
        return this.mXY.getXByIndex(i2).doubleValue();
    }

    public synchronized IndexXYMap<Double, Double> getXYMap() {
        return this.mXY;
    }

    public synchronized double getY(int i2) {
        return this.mXY.getYByIndex(i2).doubleValue();
    }

    public synchronized void remove(int i2) {
        XYEntry<Double, Double> xYEntryRemoveByIndex = this.mXY.removeByIndex(i2);
        double dDoubleValue = xYEntryRemoveByIndex.getKey().doubleValue();
        double dDoubleValue2 = xYEntryRemoveByIndex.getValue().doubleValue();
        if (dDoubleValue == this.mMinX || dDoubleValue == this.mMaxX || dDoubleValue2 == this.mMinY || dDoubleValue2 == this.mMaxY) {
            initRange();
        }
    }

    public void removeAnnotation(int i2) {
        this.mAnnotations.remove(i2);
        this.mStringXY.removeByIndex(i2);
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }
}
