package org.achartengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class MultipleCategorySeries implements Serializable {
    private String mTitle;
    private List<String> mCategories = new ArrayList();
    private List<String[]> mTitles = new ArrayList();
    private List<double[]> mValues = new ArrayList();

    public MultipleCategorySeries(String str) {
        this.mTitle = str;
    }

    public void add(String str, String[] strArr, double[] dArr) {
        this.mCategories.add(str);
        this.mTitles.add(strArr);
        this.mValues.add(dArr);
    }

    public void add(String[] strArr, double[] dArr) {
        add(this.mCategories.size() + BuildConfig.FLAVOR, strArr, dArr);
    }

    public void clear() {
        this.mCategories.clear();
        this.mTitles.clear();
        this.mValues.clear();
    }

    public int getCategoriesCount() {
        return this.mCategories.size();
    }

    public String getCategory(int i2) {
        return this.mCategories.get(i2);
    }

    public int getItemCount(int i2) {
        return this.mValues.get(i2).length;
    }

    public String[] getTitles(int i2) {
        return this.mTitles.get(i2);
    }

    public double[] getValues(int i2) {
        return this.mValues.get(i2);
    }

    public void remove(int i2) {
        this.mCategories.remove(i2);
        this.mTitles.remove(i2);
        this.mValues.remove(i2);
    }

    public XYSeries toXYSeries() {
        return new XYSeries(this.mTitle);
    }
}
