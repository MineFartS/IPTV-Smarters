package org.achartengine.renderer;

import java.io.Serializable;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleSeriesRenderer implements Serializable {
    private NumberFormat mChartValuesFormat;
    private int mGradientStartColor;
    private double mGradientStartValue;
    private int mGradientStopColor;
    private double mGradientStopValue;
    private boolean mHighlighted;
    private BasicStroke mStroke;
    private int mColor = -16776961;
    private boolean mGradientEnabled = false;
    private boolean mShowLegendItem = true;
    private boolean mDisplayBoundingPoints = true;

    public NumberFormat getChartValuesFormat() {
        return this.mChartValuesFormat;
    }

    public int getColor() {
        return this.mColor;
    }

    public int getGradientStartColor() {
        return this.mGradientStartColor;
    }

    public double getGradientStartValue() {
        return this.mGradientStartValue;
    }

    public int getGradientStopColor() {
        return this.mGradientStopColor;
    }

    public double getGradientStopValue() {
        return this.mGradientStopValue;
    }

    public BasicStroke getStroke() {
        return this.mStroke;
    }

    public boolean isDisplayBoundingPoints() {
        return this.mDisplayBoundingPoints;
    }

    public boolean isGradientEnabled() {
        return this.mGradientEnabled;
    }

    public boolean isHighlighted() {
        return this.mHighlighted;
    }

    public boolean isShowLegendItem() {
        return this.mShowLegendItem;
    }

    public void setChartValuesFormat(NumberFormat numberFormat) {
        this.mChartValuesFormat = numberFormat;
    }

    public void setColor(int i2) {
        this.mColor = i2;
    }

    public void setDisplayBoundingPoints(boolean z) {
        this.mDisplayBoundingPoints = z;
    }

    public void setGradientEnabled(boolean z) {
        this.mGradientEnabled = z;
    }

    public void setGradientStart(double d2, int i2) {
        this.mGradientStartValue = d2;
        this.mGradientStartColor = i2;
    }

    public void setGradientStop(double d2, int i2) {
        this.mGradientStopValue = d2;
        this.mGradientStopColor = i2;
    }

    public void setHighlighted(boolean z) {
        this.mHighlighted = z;
    }

    public void setShowLegendItem(boolean z) {
        this.mShowLegendItem = z;
    }

    public void setStroke(BasicStroke basicStroke) {
        this.mStroke = basicStroke;
    }
}
