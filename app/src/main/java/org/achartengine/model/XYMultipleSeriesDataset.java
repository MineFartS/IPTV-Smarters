package org.achartengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class XYMultipleSeriesDataset implements Serializable {
    private List<XYSeries> mSeries = new ArrayList();

    public synchronized void addAllSeries(List<XYSeries> list) {
        this.mSeries.addAll(list);
    }

    public synchronized void addSeries(int i2, XYSeries xYSeries) {
        this.mSeries.add(i2, xYSeries);
    }

    public synchronized void addSeries(XYSeries xYSeries) {
        this.mSeries.add(xYSeries);
    }

    public synchronized void clear() {
        this.mSeries.clear();
    }

    public synchronized XYSeries[] getSeries() {
        return (XYSeries[]) this.mSeries.toArray(new XYSeries[0]);
    }

    public synchronized XYSeries getSeriesAt(int i2) {
        return this.mSeries.get(i2);
    }

    public synchronized int getSeriesCount() {
        return this.mSeries.size();
    }

    public synchronized void removeSeries(int i2) {
        this.mSeries.remove(i2);
    }

    public synchronized void removeSeries(XYSeries xYSeries) {
        this.mSeries.remove(xYSeries);
    }
}
