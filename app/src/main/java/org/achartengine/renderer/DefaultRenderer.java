package org.achartengine.renderer;

import android.graphics.Typeface;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultRenderer implements Serializable {
    public static final int BACKGROUND_COLOR = -16777216;
    public static final int NO_COLOR = 0;
    private static final Typeface REGULAR_TEXT_FONT = Typeface.create(Typeface.SERIF, 0);
    public static final int TEXT_COLOR = -3355444;
    private boolean mApplyBackgroundColor;
    private int mBackgroundColor;
    private boolean mDisplayValues;
    private float mGridLineWidth;
    private boolean mInScroll;
    private Typeface mTextTypeface;
    private String mChartTitle = BuildConfig.FLAVOR;
    private float mChartTitleTextSize = 15.0f;
    private String mTextTypefaceName = REGULAR_TEXT_FONT.toString();
    private int mTextTypefaceStyle = 0;
    private boolean mShowAxes = true;
    private int mYAxisColor = TEXT_COLOR;
    private int mXAxisColor = TEXT_COLOR;
    private boolean mShowXLabels = true;
    private boolean mShowYLabels = true;
    private boolean mShowTickMarks = true;
    private int mLabelsColor = TEXT_COLOR;
    private float mLabelsTextSize = 10.0f;
    private boolean mShowLegend = true;
    private float mLegendTextSize = 12.0f;
    private boolean mFitLegend = false;
    private boolean mShowGridX = false;
    private boolean mShowGridY = false;
    private boolean mShowCustomTextGridX = false;
    private boolean mShowCustomTextGridY = false;
    private List<SimpleSeriesRenderer> mRenderers = new ArrayList();
    private boolean mAntialiasing = true;
    private int mLegendHeight = 0;
    private int[] mMargins = {20, 30, 10, 20};
    private float mScale = 1.0f;
    private boolean mPanEnabled = true;
    private boolean mZoomEnabled = true;
    private boolean mZoomButtonsVisible = false;
    private float mZoomRate = 1.5f;
    private boolean mExternalZoomEnabled = false;
    private float mOriginalScale = 1.0f;
    private boolean mClickEnabled = false;
    private int selectableBuffer = 15;
    private float mStartAngle = 0.0f;

    public void addSeriesRenderer(int i2, SimpleSeriesRenderer simpleSeriesRenderer) {
        this.mRenderers.add(i2, simpleSeriesRenderer);
    }

    public void addSeriesRenderer(SimpleSeriesRenderer simpleSeriesRenderer) {
        this.mRenderers.add(simpleSeriesRenderer);
    }

    public int getAxesColor() {
        int i2 = this.mXAxisColor;
        return i2 != -3355444 ? i2 : this.mYAxisColor;
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public String getChartTitle() {
        return this.mChartTitle;
    }

    public float getChartTitleTextSize() {
        return this.mChartTitleTextSize;
    }

    public float getGridLineWidth() {
        return this.mGridLineWidth;
    }

    public int getLabelsColor() {
        return this.mLabelsColor;
    }

    public float getLabelsTextSize() {
        return this.mLabelsTextSize;
    }

    public int getLegendHeight() {
        return this.mLegendHeight;
    }

    public float getLegendTextSize() {
        return this.mLegendTextSize;
    }

    public int[] getMargins() {
        return this.mMargins;
    }

    public float getOriginalScale() {
        return this.mOriginalScale;
    }

    public float getScale() {
        return this.mScale;
    }

    public int getSelectableBuffer() {
        return this.selectableBuffer;
    }

    public SimpleSeriesRenderer getSeriesRendererAt(int i2) {
        return this.mRenderers.get(i2);
    }

    public int getSeriesRendererCount() {
        return this.mRenderers.size();
    }

    public SimpleSeriesRenderer[] getSeriesRenderers() {
        return (SimpleSeriesRenderer[]) this.mRenderers.toArray(new SimpleSeriesRenderer[0]);
    }

    public float getStartAngle() {
        return this.mStartAngle;
    }

    public Typeface getTextTypeface() {
        return this.mTextTypeface;
    }

    public String getTextTypefaceName() {
        return this.mTextTypefaceName;
    }

    public int getTextTypefaceStyle() {
        return this.mTextTypefaceStyle;
    }

    public int getXAxisColor() {
        return this.mXAxisColor;
    }

    public int getYAxisColor() {
        return this.mYAxisColor;
    }

    public float getZoomRate() {
        return this.mZoomRate;
    }

    public boolean isAntialiasing() {
        return this.mAntialiasing;
    }

    public boolean isApplyBackgroundColor() {
        return this.mApplyBackgroundColor;
    }

    public boolean isClickEnabled() {
        return this.mClickEnabled;
    }

    public boolean isDisplayValues() {
        return this.mDisplayValues;
    }

    public boolean isExternalZoomEnabled() {
        return this.mExternalZoomEnabled;
    }

    public boolean isFitLegend() {
        return this.mFitLegend;
    }

    public boolean isInScroll() {
        return this.mInScroll;
    }

    public boolean isPanEnabled() {
        return this.mPanEnabled;
    }

    public boolean isShowAxes() {
        return this.mShowAxes;
    }

    public boolean isShowCustomTextGridX() {
        return this.mShowCustomTextGridX;
    }

    public boolean isShowCustomTextGridY() {
        return this.mShowCustomTextGridY;
    }

    public boolean isShowGridX() {
        return this.mShowGridX;
    }

    public boolean isShowGridY() {
        return this.mShowGridY;
    }

    public boolean isShowLabels() {
        return this.mShowXLabels || this.mShowYLabels;
    }

    public boolean isShowLegend() {
        return this.mShowLegend;
    }

    public boolean isShowTickMarks() {
        return this.mShowTickMarks;
    }

    public boolean isShowXLabels() {
        return this.mShowXLabels;
    }

    public boolean isShowYLabels() {
        return this.mShowYLabels;
    }

    public boolean isZoomButtonsVisible() {
        return this.mZoomButtonsVisible;
    }

    public boolean isZoomEnabled() {
        return this.mZoomEnabled;
    }

    public void removeAllRenderers() {
        this.mRenderers.clear();
    }

    public void removeSeriesRenderer(SimpleSeriesRenderer simpleSeriesRenderer) {
        this.mRenderers.remove(simpleSeriesRenderer);
    }

    public void setAntialiasing(boolean z) {
        this.mAntialiasing = z;
    }

    public void setApplyBackgroundColor(boolean z) {
        this.mApplyBackgroundColor = z;
    }

    public void setAxesColor(int i2) {
        setXAxisColor(i2);
        setYAxisColor(i2);
    }

    public void setBackgroundColor(int i2) {
        this.mBackgroundColor = i2;
    }

    public void setChartTitle(String str) {
        this.mChartTitle = str;
    }

    public void setChartTitleTextSize(float f2) {
        this.mChartTitleTextSize = f2;
    }

    public void setClickEnabled(boolean z) {
        this.mClickEnabled = z;
    }

    public void setDisplayValues(boolean z) {
        this.mDisplayValues = z;
    }

    public void setExternalZoomEnabled(boolean z) {
        this.mExternalZoomEnabled = z;
    }

    public void setFitLegend(boolean z) {
        this.mFitLegend = z;
    }

    public void setGridLineWidth(float f2) {
        this.mGridLineWidth = f2;
    }

    public void setInScroll(boolean z) {
        this.mInScroll = z;
    }

    public void setLabelsColor(int i2) {
        this.mLabelsColor = i2;
    }

    public void setLabelsTextSize(float f2) {
        this.mLabelsTextSize = f2;
    }

    public void setLegendHeight(int i2) {
        this.mLegendHeight = i2;
    }

    public void setLegendTextSize(float f2) {
        this.mLegendTextSize = f2;
    }

    public void setMargins(int[] iArr) {
        this.mMargins = iArr;
    }

    public void setPanEnabled(boolean z) {
        this.mPanEnabled = z;
    }

    public void setScale(float f2) {
        this.mScale = f2;
    }

    public void setSelectableBuffer(int i2) {
        this.selectableBuffer = i2;
    }

    public void setShowAxes(boolean z) {
        this.mShowAxes = z;
    }

    public void setShowCustomTextGrid(boolean z) {
        setShowCustomTextGridX(z);
        setShowCustomTextGridY(z);
    }

    public void setShowCustomTextGridX(boolean z) {
        this.mShowCustomTextGridX = z;
    }

    public void setShowCustomTextGridY(boolean z) {
        this.mShowCustomTextGridY = z;
    }

    public void setShowGrid(boolean z) {
        setShowGridX(z);
        setShowGridY(z);
    }

    public void setShowGridX(boolean z) {
        this.mShowGridX = z;
    }

    public void setShowGridY(boolean z) {
        this.mShowGridY = z;
    }

    public void setShowLabels(boolean z) {
        this.mShowXLabels = z;
        this.mShowYLabels = z;
    }

    public void setShowLabels(boolean z, boolean z2) {
        this.mShowXLabels = z;
        this.mShowYLabels = z2;
    }

    public void setShowLegend(boolean z) {
        this.mShowLegend = z;
    }

    public void setShowTickMarks(boolean z) {
        this.mShowTickMarks = z;
    }

    public void setStartAngle(float f2) {
        while (f2 < 0.0f) {
            f2 += 360.0f;
        }
        this.mStartAngle = f2;
    }

    public void setTextTypeface(Typeface typeface) {
        this.mTextTypeface = typeface;
    }

    public void setTextTypeface(String str, int i2) {
        this.mTextTypefaceName = str;
        this.mTextTypefaceStyle = i2;
    }

    public void setXAxisColor(int i2) {
        this.mXAxisColor = i2;
    }

    public void setYAxisColor(int i2) {
        this.mYAxisColor = i2;
    }

    public void setZoomButtonsVisible(boolean z) {
        this.mZoomButtonsVisible = z;
    }

    public void setZoomEnabled(boolean z) {
        this.mZoomEnabled = z;
    }

    public void setZoomRate(float f2) {
        this.mZoomRate = f2;
    }
}
