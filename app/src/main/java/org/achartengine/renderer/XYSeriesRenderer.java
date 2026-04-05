package org.achartengine.renderer;

import android.graphics.Color;
import android.graphics.Paint;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.achartengine.chart.PointStyle;

/* JADX INFO: loaded from: classes2.dex */
public class XYSeriesRenderer extends SimpleSeriesRenderer {
    private int mAnnotationsColor;
    private Paint.Align mAnnotationsTextAlign;
    private float mAnnotationsTextSize;
    private float mChartValuesSpacing;
    private Paint.Align mChartValuesTextAlign;
    private boolean mDisplayChartValues;
    private boolean mFillPoints = false;
    private List<FillOutsideLine> mFillBelowLine = new ArrayList();
    private PointStyle mPointStyle = PointStyle.POINT;
    private float mPointStrokeWidth = 1.0f;
    private float mLineWidth = 1.0f;
    private int mDisplayChartValuesDistance = 100;
    private float mChartValuesTextSize = 10.0f;

    public static class FillOutsideLine implements Serializable {
        private int mColor = Color.argb(125, 0, 0, 200);
        private int[] mFillRange;
        private final Type mType;

        public enum Type {
            NONE,
            BOUNDS_ALL,
            BOUNDS_BELOW,
            BOUNDS_ABOVE,
            BELOW,
            ABOVE
        }

        public FillOutsideLine(Type type) {
            this.mType = type;
        }

        public int getColor() {
            return this.mColor;
        }

        public int[] getFillRange() {
            return this.mFillRange;
        }

        public Type getType() {
            return this.mType;
        }

        public void setColor(int i2) {
            this.mColor = i2;
        }

        public void setFillRange(int[] iArr) {
            this.mFillRange = iArr;
        }
    }

    public XYSeriesRenderer() {
        Paint.Align align = Paint.Align.CENTER;
        this.mChartValuesTextAlign = align;
        this.mChartValuesSpacing = 5.0f;
        this.mAnnotationsTextSize = 10.0f;
        this.mAnnotationsTextAlign = align;
        this.mAnnotationsColor = DefaultRenderer.TEXT_COLOR;
    }

    public void addFillOutsideLine(FillOutsideLine fillOutsideLine) {
        this.mFillBelowLine.add(fillOutsideLine);
    }

    public int getAnnotationsColor() {
        return this.mAnnotationsColor;
    }

    public Paint.Align getAnnotationsTextAlign() {
        return this.mAnnotationsTextAlign;
    }

    public float getAnnotationsTextSize() {
        return this.mAnnotationsTextSize;
    }

    public float getChartValuesSpacing() {
        return this.mChartValuesSpacing;
    }

    public Paint.Align getChartValuesTextAlign() {
        return this.mChartValuesTextAlign;
    }

    public float getChartValuesTextSize() {
        return this.mChartValuesTextSize;
    }

    public int getDisplayChartValuesDistance() {
        return this.mDisplayChartValuesDistance;
    }

    public FillOutsideLine[] getFillOutsideLine() {
        return (FillOutsideLine[]) this.mFillBelowLine.toArray(new FillOutsideLine[0]);
    }

    public float getLineWidth() {
        return this.mLineWidth;
    }

    public float getPointStrokeWidth() {
        return this.mPointStrokeWidth;
    }

    public PointStyle getPointStyle() {
        return this.mPointStyle;
    }

    public boolean isDisplayChartValues() {
        return this.mDisplayChartValues;
    }

    @Deprecated
    public boolean isFillBelowLine() {
        return this.mFillBelowLine.size() > 0;
    }

    public boolean isFillPoints() {
        return this.mFillPoints;
    }

    public void setAnnotationsColor(int i2) {
        this.mAnnotationsColor = i2;
    }

    public void setAnnotationsTextAlign(Paint.Align align) {
        this.mAnnotationsTextAlign = align;
    }

    public void setAnnotationsTextSize(float f2) {
        this.mAnnotationsTextSize = f2;
    }

    public void setChartValuesSpacing(float f2) {
        this.mChartValuesSpacing = f2;
    }

    public void setChartValuesTextAlign(Paint.Align align) {
        this.mChartValuesTextAlign = align;
    }

    public void setChartValuesTextSize(float f2) {
        this.mChartValuesTextSize = f2;
    }

    public void setDisplayChartValues(boolean z) {
        this.mDisplayChartValues = z;
    }

    public void setDisplayChartValuesDistance(int i2) {
        this.mDisplayChartValuesDistance = i2;
    }

    @Deprecated
    public void setFillBelowLine(boolean z) {
        List<FillOutsideLine> list;
        FillOutsideLine fillOutsideLine;
        this.mFillBelowLine.clear();
        if (z) {
            list = this.mFillBelowLine;
            fillOutsideLine = new FillOutsideLine(FillOutsideLine.Type.BOUNDS_ALL);
        } else {
            list = this.mFillBelowLine;
            fillOutsideLine = new FillOutsideLine(FillOutsideLine.Type.NONE);
        }
        list.add(fillOutsideLine);
    }

    @Deprecated
    public void setFillBelowLineColor(int i2) {
        if (this.mFillBelowLine.size() > 0) {
            this.mFillBelowLine.get(0).setColor(i2);
        }
    }

    public void setFillPoints(boolean z) {
        this.mFillPoints = z;
    }

    public void setLineWidth(float f2) {
        this.mLineWidth = f2;
    }

    public void setPointStrokeWidth(float f2) {
        this.mPointStrokeWidth = f2;
    }

    public void setPointStyle(PointStyle pointStyle) {
        this.mPointStyle = pointStyle;
    }
}
