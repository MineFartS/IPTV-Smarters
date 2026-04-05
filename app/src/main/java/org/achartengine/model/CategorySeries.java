package org.achartengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class CategorySeries implements Serializable {
    private String mTitle;
    private List<String> mCategories = new ArrayList();
    private List<Double> mValues = new ArrayList();

    public CategorySeries(String str) {
        this.mTitle = str;
    }

    public synchronized void add(double d2) {
        add(this.mCategories.size() + BuildConfig.FLAVOR, d2);
    }

    public synchronized void add(String str, double d2) {
        this.mCategories.add(str);
        this.mValues.add(Double.valueOf(d2));
    }

    public synchronized void clear() {
        this.mCategories.clear();
        this.mValues.clear();
    }

    public synchronized String getCategory(int i2) {
        return this.mCategories.get(i2);
    }

    public synchronized int getItemCount() {
        return this.mCategories.size();
    }

    public String getTitle() {
        return this.mTitle;
    }

    public synchronized double getValue(int i2) {
        return this.mValues.get(i2).doubleValue();
    }

    public synchronized void remove(int i2) {
        this.mCategories.remove(i2);
        this.mValues.remove(i2);
    }

    public synchronized void set(int i2, String str, double d2) {
        this.mCategories.set(i2, str);
        this.mValues.set(i2, Double.valueOf(d2));
    }

    public XYSeries toXYSeries() {
        XYSeries xYSeries = new XYSeries(this.mTitle);
        Iterator<Double> it = this.mValues.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2++;
            xYSeries.add(i2, it.next().doubleValue());
        }
        return xYSeries;
    }
}
