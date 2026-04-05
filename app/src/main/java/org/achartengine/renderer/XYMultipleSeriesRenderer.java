package org.achartengine.renderer;

import android.graphics.Color;
import android.graphics.Paint;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class XYMultipleSeriesRenderer extends DefaultRenderer {
    private Map<Integer, double[]> initialRange;
    private float mAxisTitleTextSize;
    private double mBarSpacing;
    private float mBarWidth;
    private int[] mGridColors;
    private int mMarginsColor;
    private double[] mMaxX;
    private double[] mMaxY;
    private double[] mMinX;
    private double[] mMinY;
    private Orientation mOrientation;
    private double[] mPanLimits;
    private boolean mPanXEnabled;
    private boolean mPanYEnabled;
    private float mPointSize;
    private NumberFormat mXLabelFormat;
    private int mXLabels;
    private float mXLabelsAngle;
    private int mXLabelsColor;
    private float mXLabelsPadding;
    private boolean mXRoundedLabels;
    private Map<Double, String> mXTextLabels;
    private String mXTitle;
    private NumberFormat[] mYLabelFormat;
    private int mYLabels;
    private float mYLabelsAngle;
    private int[] mYLabelsColor;
    private float mYLabelsPadding;
    private float mYLabelsVerticalPadding;
    private Map<Integer, Map<Double, String>> mYTextLabels;
    private String[] mYTitle;
    private double mZoomInLimitX;
    private double mZoomInLimitY;
    private double[] mZoomLimits;
    private boolean mZoomXEnabled;
    private boolean mZoomYEnabled;
    private int scalesCount;
    private Paint.Align xLabelsAlign;
    private Paint.Align[] yAxisAlign;
    private Paint.Align[] yLabelsAlign;

    public enum Orientation {
        HORIZONTAL(0),
        VERTICAL(90);

        private int mAngle;

        Orientation(int i2) {
            this.mAngle = 0;
            this.mAngle = i2;
        }

        public int getAngle() {
            return this.mAngle;
        }
    }

    public XYMultipleSeriesRenderer() {
        this(1);
    }

    public XYMultipleSeriesRenderer(int i2) {
        this.mXTitle = BuildConfig.FLAVOR;
        this.mAxisTitleTextSize = 12.0f;
        this.mXLabels = 5;
        this.mYLabels = 5;
        this.mOrientation = Orientation.HORIZONTAL;
        this.mXTextLabels = new HashMap();
        this.mYTextLabels = new LinkedHashMap();
        this.mPanXEnabled = true;
        this.mPanYEnabled = true;
        this.mZoomXEnabled = true;
        this.mZoomYEnabled = true;
        this.mBarSpacing = 0.0d;
        this.mMarginsColor = 0;
        this.initialRange = new LinkedHashMap();
        this.mPointSize = 3.0f;
        this.xLabelsAlign = Paint.Align.CENTER;
        this.mXLabelsPadding = 0.0f;
        this.mYLabelsPadding = 0.0f;
        this.mYLabelsVerticalPadding = 2.0f;
        this.mXLabelsColor = DefaultRenderer.TEXT_COLOR;
        this.mYLabelsColor = new int[]{DefaultRenderer.TEXT_COLOR};
        this.mXRoundedLabels = true;
        this.mBarWidth = -1.0f;
        this.mZoomInLimitX = 0.0d;
        this.mZoomInLimitY = 0.0d;
        this.scalesCount = i2;
        initAxesRange(i2);
    }

    public void addTextLabel(double d2, String str) {
        addXTextLabel(d2, str);
    }

    public synchronized void addXTextLabel(double d2, String str) {
        this.mXTextLabels.put(Double.valueOf(d2), str);
    }

    public void addYTextLabel(double d2, String str) {
        addYTextLabel(d2, str, 0);
    }

    public synchronized void addYTextLabel(double d2, String str, int i2) {
        this.mYTextLabels.get(Integer.valueOf(i2)).put(Double.valueOf(d2), str);
    }

    public void clearTextLabels() {
        clearXTextLabels();
    }

    public synchronized void clearXTextLabels() {
        this.mXTextLabels.clear();
    }

    public void clearYTextLabels() {
        clearYTextLabels(0);
    }

    public synchronized void clearYTextLabels(int i2) {
        this.mYTextLabels.get(Integer.valueOf(i2)).clear();
    }

    public float getAxisTitleTextSize() {
        return this.mAxisTitleTextSize;
    }

    public double getBarSpacing() {
        return this.mBarSpacing;
    }

    public float getBarWidth() {
        return this.mBarWidth;
    }

    public double getBarsSpacing() {
        return getBarSpacing();
    }

    public int getGridColor(int i2) {
        return this.mGridColors[i2];
    }

    public double[] getInitialRange() {
        return getInitialRange(0);
    }

    public double[] getInitialRange(int i2) {
        return this.initialRange.get(Integer.valueOf(i2));
    }

    public NumberFormat getLabelFormat() {
        return getXLabelFormat();
    }

    public int getMarginsColor() {
        return this.mMarginsColor;
    }

    public Orientation getOrientation() {
        return this.mOrientation;
    }

    public double[] getPanLimits() {
        return this.mPanLimits;
    }

    public float getPointSize() {
        return this.mPointSize;
    }

    public int getScalesCount() {
        return this.scalesCount;
    }

    public double getXAxisMax() {
        return getXAxisMax(0);
    }

    public double getXAxisMax(int i2) {
        return this.mMaxX[i2];
    }

    public double getXAxisMin() {
        return getXAxisMin(0);
    }

    public double getXAxisMin(int i2) {
        return this.mMinX[i2];
    }

    public NumberFormat getXLabelFormat() {
        return this.mXLabelFormat;
    }

    public int getXLabels() {
        return this.mXLabels;
    }

    public Paint.Align getXLabelsAlign() {
        return this.xLabelsAlign;
    }

    public float getXLabelsAngle() {
        return this.mXLabelsAngle;
    }

    public int getXLabelsColor() {
        return this.mXLabelsColor;
    }

    public float getXLabelsPadding() {
        return this.mXLabelsPadding;
    }

    public synchronized String getXTextLabel(Double d2) {
        return this.mXTextLabels.get(d2);
    }

    public synchronized Double[] getXTextLabelLocations() {
        return (Double[]) this.mXTextLabels.keySet().toArray(new Double[0]);
    }

    public String getXTitle() {
        return this.mXTitle;
    }

    public Paint.Align getYAxisAlign(int i2) {
        return this.yAxisAlign[i2];
    }

    public double getYAxisMax() {
        return getYAxisMax(0);
    }

    public double getYAxisMax(int i2) {
        return this.mMaxY[i2];
    }

    public double getYAxisMin() {
        return getYAxisMin(0);
    }

    public double getYAxisMin(int i2) {
        return this.mMinY[i2];
    }

    public NumberFormat getYLabelFormat(int i2) {
        return this.mYLabelFormat[i2];
    }

    public int getYLabels() {
        return this.mYLabels;
    }

    public Paint.Align getYLabelsAlign(int i2) {
        return this.yLabelsAlign[i2];
    }

    public float getYLabelsAngle() {
        return this.mYLabelsAngle;
    }

    public int getYLabelsColor(int i2) {
        return this.mYLabelsColor[i2];
    }

    public float getYLabelsPadding() {
        return this.mYLabelsPadding;
    }

    public float getYLabelsVerticalPadding() {
        return this.mYLabelsVerticalPadding;
    }

    public String getYTextLabel(Double d2) {
        return getYTextLabel(d2, 0);
    }

    public synchronized String getYTextLabel(Double d2, int i2) {
        return this.mYTextLabels.get(Integer.valueOf(i2)).get(d2);
    }

    public Double[] getYTextLabelLocations() {
        return getYTextLabelLocations(0);
    }

    public synchronized Double[] getYTextLabelLocations(int i2) {
        return (Double[]) this.mYTextLabels.get(Integer.valueOf(i2)).keySet().toArray(new Double[0]);
    }

    public String getYTitle() {
        return getYTitle(0);
    }

    public String getYTitle(int i2) {
        return this.mYTitle[i2];
    }

    public double getZoomInLimitX() {
        return this.mZoomInLimitX;
    }

    public double getZoomInLimitY() {
        return this.mZoomInLimitY;
    }

    public double[] getZoomLimits() {
        return this.mZoomLimits;
    }

    public void initAxesRange(int i2) {
        this.mYTitle = new String[i2];
        this.yLabelsAlign = new Paint.Align[i2];
        this.yAxisAlign = new Paint.Align[i2];
        this.mYLabelsColor = new int[i2];
        this.mYLabelFormat = new NumberFormat[i2];
        this.mMinX = new double[i2];
        this.mMaxX = new double[i2];
        this.mMinY = new double[i2];
        this.mMaxY = new double[i2];
        this.mGridColors = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.mYLabelsColor[i3] = -3355444;
            this.mYLabelFormat[i3] = NumberFormat.getNumberInstance();
            this.mGridColors[i3] = Color.argb(75, 200, 200, 200);
            initAxesRangeForScale(i3);
        }
    }

    public void initAxesRangeForScale(int i2) {
        double[] dArr = this.mMinX;
        dArr[i2] = Double.MAX_VALUE;
        double[] dArr2 = this.mMaxX;
        dArr2[i2] = -1.7976931348623157E308d;
        double[] dArr3 = this.mMinY;
        dArr3[i2] = Double.MAX_VALUE;
        double[] dArr4 = this.mMaxY;
        dArr4[i2] = -1.7976931348623157E308d;
        this.initialRange.put(Integer.valueOf(i2), new double[]{dArr[i2], dArr2[i2], dArr3[i2], dArr4[i2]});
        this.mYTitle[i2] = BuildConfig.FLAVOR;
        this.mYTextLabels.put(Integer.valueOf(i2), new HashMap());
        this.yLabelsAlign[i2] = Paint.Align.CENTER;
        this.yAxisAlign[i2] = Paint.Align.LEFT;
    }

    public boolean isInitialRangeSet() {
        return isInitialRangeSet(0);
    }

    public boolean isInitialRangeSet(int i2) {
        return this.initialRange.get(Integer.valueOf(i2)) != null;
    }

    public boolean isMaxXSet() {
        return isMaxXSet(0);
    }

    public boolean isMaxXSet(int i2) {
        return this.mMaxX[i2] != -1.7976931348623157E308d;
    }

    public boolean isMaxYSet() {
        return isMaxYSet(0);
    }

    public boolean isMaxYSet(int i2) {
        return this.mMaxY[i2] != -1.7976931348623157E308d;
    }

    public boolean isMinXSet() {
        return isMinXSet(0);
    }

    public boolean isMinXSet(int i2) {
        return this.mMinX[i2] != Double.MAX_VALUE;
    }

    public boolean isMinYSet() {
        return isMinYSet(0);
    }

    public boolean isMinYSet(int i2) {
        return this.mMinY[i2] != Double.MAX_VALUE;
    }

    @Override // org.achartengine.renderer.DefaultRenderer
    public boolean isPanEnabled() {
        return isPanXEnabled() || isPanYEnabled();
    }

    public boolean isPanXEnabled() {
        return this.mPanXEnabled;
    }

    public boolean isPanYEnabled() {
        return this.mPanYEnabled;
    }

    public boolean isXRoundedLabels() {
        return this.mXRoundedLabels;
    }

    @Override // org.achartengine.renderer.DefaultRenderer
    public boolean isZoomEnabled() {
        return isZoomXEnabled() || isZoomYEnabled();
    }

    public boolean isZoomXEnabled() {
        return this.mZoomXEnabled;
    }

    public boolean isZoomYEnabled() {
        return this.mZoomYEnabled;
    }

    public synchronized void removeXTextLabel(double d2) {
        this.mXTextLabels.remove(Double.valueOf(d2));
    }

    public void removeYTextLabel(double d2) {
        removeYTextLabel(d2, 0);
    }

    public synchronized void removeYTextLabel(double d2, int i2) {
        this.mYTextLabels.get(Integer.valueOf(i2)).remove(Double.valueOf(d2));
    }

    public void setAxisTitleTextSize(float f2) {
        this.mAxisTitleTextSize = f2;
    }

    public void setBarSpacing(double d2) {
        this.mBarSpacing = d2;
    }

    public void setBarWidth(float f2) {
        this.mBarWidth = f2;
    }

    public void setGridColor(int i2) {
        setGridColor(i2, 0);
    }

    public void setGridColor(int i2, int i3) {
        this.mGridColors[i3] = i2;
    }

    public void setInitialRange(double[] dArr) {
        setInitialRange(dArr, 0);
    }

    public void setInitialRange(double[] dArr, int i2) {
        this.initialRange.put(Integer.valueOf(i2), dArr);
    }

    public void setLabelFormat(NumberFormat numberFormat) {
        setXLabelFormat(numberFormat);
    }

    public void setMarginsColor(int i2) {
        this.mMarginsColor = i2;
    }

    public void setOrientation(Orientation orientation) {
        this.mOrientation = orientation;
    }

    @Override // org.achartengine.renderer.DefaultRenderer
    public void setPanEnabled(boolean z) {
        setPanEnabled(z, z);
    }

    public void setPanEnabled(boolean z, boolean z2) {
        this.mPanXEnabled = z;
        this.mPanYEnabled = z2;
    }

    public void setPanLimits(double[] dArr) {
        this.mPanLimits = dArr;
    }

    public void setPointSize(float f2) {
        this.mPointSize = f2;
    }

    public void setRange(double[] dArr) {
        setRange(dArr, 0);
    }

    public void setRange(double[] dArr, int i2) {
        setXAxisMin(dArr[0], i2);
        setXAxisMax(dArr[1], i2);
        setYAxisMin(dArr[2], i2);
        setYAxisMax(dArr[3], i2);
    }

    public void setXAxisMax(double d2) {
        setXAxisMax(d2, 0);
    }

    public void setXAxisMax(double d2, int i2) {
        if (!isMaxXSet(i2)) {
            this.initialRange.get(Integer.valueOf(i2))[1] = d2;
        }
        this.mMaxX[i2] = d2;
    }

    public void setXAxisMin(double d2) {
        setXAxisMin(d2, 0);
    }

    public void setXAxisMin(double d2, int i2) {
        if (!isMinXSet(i2)) {
            this.initialRange.get(Integer.valueOf(i2))[0] = d2;
        }
        this.mMinX[i2] = d2;
    }

    public void setXLabelFormat(NumberFormat numberFormat) {
        this.mXLabelFormat = numberFormat;
    }

    public void setXLabels(int i2) {
        this.mXLabels = i2;
    }

    public void setXLabelsAlign(Paint.Align align) {
        this.xLabelsAlign = align;
    }

    public void setXLabelsAngle(float f2) {
        this.mXLabelsAngle = f2;
    }

    public void setXLabelsColor(int i2) {
        this.mXLabelsColor = i2;
    }

    public void setXLabelsPadding(float f2) {
        this.mXLabelsPadding = f2;
    }

    public void setXRoundedLabels(boolean z) {
        this.mXRoundedLabels = z;
    }

    public void setXTitle(String str) {
        this.mXTitle = str;
    }

    public void setYAxisAlign(Paint.Align align, int i2) {
        this.yAxisAlign[i2] = align;
    }

    public void setYAxisMax(double d2) {
        setYAxisMax(d2, 0);
    }

    public void setYAxisMax(double d2, int i2) {
        if (!isMaxYSet(i2)) {
            this.initialRange.get(Integer.valueOf(i2))[3] = d2;
        }
        this.mMaxY[i2] = d2;
    }

    public void setYAxisMin(double d2) {
        setYAxisMin(d2, 0);
    }

    public void setYAxisMin(double d2, int i2) {
        if (!isMinYSet(i2)) {
            this.initialRange.get(Integer.valueOf(i2))[2] = d2;
        }
        this.mMinY[i2] = d2;
    }

    public void setYLabelFormat(NumberFormat numberFormat, int i2) {
        this.mYLabelFormat[i2] = numberFormat;
    }

    public void setYLabels(int i2) {
        this.mYLabels = i2;
    }

    public void setYLabelsAlign(Paint.Align align) {
        setYLabelsAlign(align, 0);
    }

    public void setYLabelsAlign(Paint.Align align, int i2) {
        this.yLabelsAlign[i2] = align;
    }

    public void setYLabelsAngle(float f2) {
        this.mYLabelsAngle = f2;
    }

    public void setYLabelsColor(int i2, int i3) {
        this.mYLabelsColor[i2] = i3;
    }

    public void setYLabelsPadding(float f2) {
        this.mYLabelsPadding = f2;
    }

    public void setYLabelsVerticalPadding(float f2) {
        this.mYLabelsVerticalPadding = f2;
    }

    public void setYTitle(String str) {
        setYTitle(str, 0);
    }

    public void setYTitle(String str, int i2) {
        this.mYTitle[i2] = str;
    }

    public void setZoomEnabled(boolean z, boolean z2) {
        this.mZoomXEnabled = z;
        this.mZoomYEnabled = z2;
    }

    public void setZoomInLimitX(double d2) {
        this.mZoomInLimitX = d2;
    }

    public void setZoomInLimitY(double d2) {
        this.mZoomInLimitY = d2;
    }

    public void setZoomLimits(double[] dArr) {
        this.mZoomLimits = dArr;
    }
}
