package org.achartengine.chart;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class PieSegment implements Serializable {
    private int mDataIndex;
    private float mEndAngle;
    private float mStartAngle;
    private float mValue;

    public PieSegment(int i2, float f2, float f3, float f4) {
        this.mStartAngle = f3;
        this.mEndAngle = f4 + f3;
        this.mDataIndex = i2;
        this.mValue = f2;
    }

    public int getDataIndex() {
        return this.mDataIndex;
    }

    public float getEndAngle() {
        return this.mEndAngle;
    }

    public float getStartAngle() {
        return this.mStartAngle;
    }

    public float getValue() {
        return this.mValue;
    }

    public boolean isInSegment(double d2) {
        float f2 = this.mStartAngle;
        if (d2 >= f2 && d2 <= this.mEndAngle) {
            return true;
        }
        double d3 = d2 % 360.0d;
        double d4 = f2;
        double d5 = this.mEndAngle;
        while (d5 > 360.0d) {
            d4 -= 360.0d;
            d5 -= 360.0d;
        }
        return d3 >= d4 && d3 <= d5;
    }

    public String toString() {
        return "mDataIndex=" + this.mDataIndex + ",mValue=" + this.mValue + ",mStartAngle=" + this.mStartAngle + ",mEndAngle=" + this.mEndAngle;
    }
}
