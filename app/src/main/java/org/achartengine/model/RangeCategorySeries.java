package org.achartengine.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RangeCategorySeries extends CategorySeries {
    private List<Double> mMaxValues;

    public RangeCategorySeries(String str) {
        super(str);
        this.mMaxValues = new ArrayList();
    }

    public synchronized void add(double d2, double d3) {
        super.add(d2);
        this.mMaxValues.add(Double.valueOf(d3));
    }

    public synchronized void add(String str, double d2, double d3) {
        super.add(str, d2);
        this.mMaxValues.add(Double.valueOf(d3));
    }

    @Override // org.achartengine.model.CategorySeries
    public synchronized void clear() {
        super.clear();
        this.mMaxValues.clear();
    }

    public double getMaximumValue(int i2) {
        return this.mMaxValues.get(i2).doubleValue();
    }

    public double getMinimumValue(int i2) {
        return getValue(i2);
    }

    @Override // org.achartengine.model.CategorySeries
    public synchronized void remove(int i2) {
        super.remove(i2);
        this.mMaxValues.remove(i2);
    }

    @Override // org.achartengine.model.CategorySeries
    public XYSeries toXYSeries() {
        XYSeries xYSeries = new XYSeries(getTitle());
        int itemCount = getItemCount();
        int i2 = 0;
        while (i2 < itemCount) {
            int i3 = i2 + 1;
            xYSeries.add(i3, getMinimumValue(i2));
            double d2 = i2;
            Double.isNaN(d2);
            xYSeries.add(d2 + 1.000001d, getMaximumValue(i2));
            i2 = i3;
        }
        return xYSeries;
    }
}
