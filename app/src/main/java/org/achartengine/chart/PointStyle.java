package org.achartengine.chart;

/* JADX INFO: loaded from: classes2.dex */
public enum PointStyle {
    X("x"),
    CIRCLE("circle"),
    TRIANGLE("triangle"),
    SQUARE("square"),
    DIAMOND("diamond"),
    POINT("point");

    private String mName;

    PointStyle(String str) {
        this.mName = str;
    }

    public static int getIndexForName(String str) {
        PointStyle[] pointStyleArrValues = values();
        int length = pointStyleArrValues.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length && i2 < 0; i3++) {
            if (pointStyleArrValues[i3].mName.equals(str)) {
                i2 = i3;
            }
        }
        return Math.max(0, i2);
    }

    public static PointStyle getPointStyleForName(String str) {
        PointStyle[] pointStyleArrValues = values();
        int length = pointStyleArrValues.length;
        PointStyle pointStyle = null;
        for (int i2 = 0; i2 < length && pointStyle == null; i2++) {
            if (pointStyleArrValues[i2].mName.equals(str)) {
                pointStyle = pointStyleArrValues[i2];
            }
        }
        return pointStyle;
    }

    public String getName() {
        return this.mName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return getName();
    }
}
