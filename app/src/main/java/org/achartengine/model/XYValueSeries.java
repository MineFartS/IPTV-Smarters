package org.achartengine.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class XYValueSeries extends XYSeries {
    private double mMaxValue;
    private double mMinValue;
    private List<Double> mValue;

    public XYValueSeries(String str) {
        super(str);
        this.mValue = new ArrayList();
        this.mMinValue = Double.MAX_VALUE;
        this.mMaxValue = -1.7976931348623157E308d;
    }

    private void initRange() {
        this.mMinValue = Double.MAX_VALUE;
        this.mMaxValue = -1.7976931348623157E308d;
        int itemCount = getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            updateRange(getValue(i2));
        }
    }

    private void updateRange(double d2) {
        this.mMinValue = Math.min(this.mMinValue, d2);
        this.mMaxValue = Math.max(this.mMaxValue, d2);
    }

    @Override // org.achartengine.model.XYSeries
    public synchronized void add(double d2, double d3) {
        add(d2, d3, 0.0d);
    }

    public synchronized void add(double d2, double d3, double d4) {
        super.add(d2, d3);
        this.mValue.add(Double.valueOf(d4));
        updateRange(d4);
    }

    @Override // org.achartengine.model.XYSeries
    public synchronized void clear() {
        super.clear();
        this.mValue.clear();
        initRange();
    }

    public double getMaxValue() {
        return this.mMaxValue;
    }

    public double getMinValue() {
        return this.mMinValue;
    }

    public synchronized double getValue(int i2) {
        return this.mValue.get(i2).doubleValue();
    }

    @Override // org.achartengine.model.XYSeries
    public synchronized void remove(int i2) {
        super.remove(i2);
        double dDoubleValue = this.mValue.remove(i2).doubleValue();
        if (dDoubleValue == this.mMinValue || dDoubleValue == this.mMaxValue) {
            initRange();
        }
    }
}
