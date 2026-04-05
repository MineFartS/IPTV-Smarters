package org.achartengine.model;

/* JADX INFO: loaded from: classes2.dex */
public class SeriesSelection {
    private int mPointIndex;
    private int mSeriesIndex;
    private double mValue;
    private double mXValue;

    public SeriesSelection(int i2, int i3, double d2, double d3) {
        this.mSeriesIndex = i2;
        this.mPointIndex = i3;
        this.mXValue = d2;
        this.mValue = d3;
    }

    public int getPointIndex() {
        return this.mPointIndex;
    }

    public int getSeriesIndex() {
        return this.mSeriesIndex;
    }

    public double getValue() {
        return this.mValue;
    }

    public double getXValue() {
        return this.mXValue;
    }
}
