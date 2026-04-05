package org.achartengine.model;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class TimeSeries extends XYSeries {
    public TimeSeries(String str) {
        super(str);
    }

    public synchronized void add(Date date, double d2) {
        super.add(date.getTime(), d2);
    }

    @Override // org.achartengine.model.XYSeries
    public double getPadding(double d2) {
        return 1.0d;
    }
}
