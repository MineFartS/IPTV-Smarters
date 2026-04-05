package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.model.CategorySeries;
import org.achartengine.renderer.DialRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class DialChart extends RoundChart {
    private static final int NEEDLE_RADIUS = 10;
    private DialRenderer mRenderer;

    public DialChart(CategorySeries categorySeries, DialRenderer dialRenderer) {
        super(categorySeries, dialRenderer);
        this.mRenderer = dialRenderer;
    }

    private void drawNeedle(Canvas canvas, double d2, int i2, int i3, double d3, boolean z, Paint paint) {
        float[] fArr;
        double radians = d2 - Math.toRadians(90.0d);
        int iSin = (int) (Math.sin(radians) * 10.0d);
        int iCos = (int) (Math.cos(radians) * 10.0d);
        int iSin2 = ((int) (Math.sin(d2) * d3)) + i2;
        int iCos2 = ((int) (Math.cos(d2) * d3)) + i3;
        if (z) {
            double d4 = 0.85d * d3;
            int iSin3 = ((int) (d4 * Math.sin(d2))) + i2;
            int iCos3 = ((int) (d4 * Math.cos(d2))) + i3;
            float f2 = iSin2;
            float f3 = iCos2;
            fArr = new float[]{iSin3 - iSin, iCos3 - iCos, f2, f3, iSin3 + iSin, iCos3 + iCos};
            float strokeWidth = paint.getStrokeWidth();
            paint.setStrokeWidth(5.0f);
            canvas.drawLine(i2, i3, f2, f3, paint);
            paint.setStrokeWidth(strokeWidth);
        } else {
            fArr = new float[]{i2 - iSin, i3 - iCos, iSin2, iCos2, i2 + iSin, i3 + iCos};
        }
        drawPath(canvas, fArr, paint, true);
    }

    private void drawTicks(Canvas canvas, double d2, double d3, double d4, double d5, int i2, int i3, double d6, double d7, double d8, Paint paint, boolean z) {
        double d9 = d2;
        while (d9 <= d3) {
            double angleForValue = getAngleForValue(d9, d4, d5, d2, d3);
            double dSin = Math.sin(angleForValue);
            double dCos = Math.cos(angleForValue);
            float f2 = i2;
            int iRound = Math.round(((float) (d7 * dSin)) + f2);
            float f3 = i3;
            int iRound2 = Math.round(((float) (d7 * dCos)) + f3);
            int iRound3 = Math.round(f2 + ((float) (dSin * d6)));
            int iRound4 = Math.round(f3 + ((float) (dCos * d6)));
            float f4 = iRound;
            float f5 = iRound2;
            double d10 = d9;
            canvas.drawLine(f4, f5, iRound3, iRound4, paint);
            if (z) {
                paint.setTextAlign(Paint.Align.LEFT);
                if (iRound <= iRound3) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                }
                String str = d10 + BuildConfig.FLAVOR;
                long j2 = (long) d10;
                if (Math.round(d10) == j2) {
                    str = j2 + BuildConfig.FLAVOR;
                }
                canvas.drawText(str, f4, f5, paint);
            }
            d9 = d10 + d8;
        }
    }

    private double getAngleForValue(double d2, double d3, double d4, double d5, double d6) {
        return Math.toRadians(d3 + (((d2 - d5) * (d4 - d3)) / (d6 - d5)));
    }

    @Override // org.achartengine.chart.AbstractChart
    public void draw(Canvas canvas, int i2, int i3, int i4, int i5, Paint paint) {
        paint.setAntiAlias(this.mRenderer.isAntialiasing());
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(this.mRenderer.getLabelsTextSize());
        int legendSize = getLegendSize(this.mRenderer, i5 / 5, 0.0f);
        int i6 = i2 + i4;
        int itemCount = this.mDataset.getItemCount();
        String[] strArr = new String[itemCount];
        for (int i7 = 0; i7 < itemCount; i7++) {
            strArr[i7] = this.mDataset.getCategory(i7);
        }
        int iDrawLegend = this.mRenderer.isFitLegend() ? drawLegend(canvas, this.mRenderer, strArr, i2, i6, i3, i4, i5, legendSize, paint, true) : legendSize;
        int i8 = (i3 + i5) - iDrawLegend;
        drawBackground(this.mRenderer, canvas, i2, i3, i4, i5, paint, false, 0);
        double dMin = Math.min(Math.abs(i6 - i2), Math.abs(i8 - i3));
        Double.isNaN(dMin);
        double scale = this.mRenderer.getScale();
        Double.isNaN(scale);
        int i9 = (int) (dMin * 0.35d * scale);
        if (this.mCenterX == Integer.MAX_VALUE) {
            this.mCenterX = (i2 + i6) / 2;
        }
        if (this.mCenterY == Integer.MAX_VALUE) {
            this.mCenterY = (i8 + i3) / 2;
        }
        float f2 = i9;
        float f3 = f2 * 0.9f;
        float f4 = f2 * 1.1f;
        double minValue = this.mRenderer.getMinValue();
        double maxValue = this.mRenderer.getMaxValue();
        double angleMin = this.mRenderer.getAngleMin();
        double angleMax = this.mRenderer.getAngleMax();
        if (!this.mRenderer.isMinValueSet() || !this.mRenderer.isMaxValueSet()) {
            int seriesRendererCount = this.mRenderer.getSeriesRendererCount();
            for (int i10 = 0; i10 < seriesRendererCount; i10++) {
                double value = this.mDataset.getValue(i10);
                if (!this.mRenderer.isMinValueSet()) {
                    minValue = Math.min(minValue, value);
                }
                if (!this.mRenderer.isMaxValueSet()) {
                    maxValue = Math.max(maxValue, value);
                }
            }
        }
        if (minValue == maxValue) {
            minValue *= 0.5d;
            maxValue *= 1.5d;
        }
        double d2 = minValue;
        double d3 = maxValue;
        paint.setColor(this.mRenderer.getLabelsColor());
        double minorTicksSpacing = this.mRenderer.getMinorTicksSpacing();
        double majorTicksSpacing = this.mRenderer.getMajorTicksSpacing();
        if (minorTicksSpacing == Double.MAX_VALUE) {
            minorTicksSpacing = (d3 - d2) / 30.0d;
        }
        double d4 = minorTicksSpacing;
        double d5 = majorTicksSpacing == Double.MAX_VALUE ? (d3 - d2) / 10.0d : majorTicksSpacing;
        double d6 = f4;
        drawTicks(canvas, d2, d3, angleMin, angleMax, this.mCenterX, this.mCenterY, d6, i9, d4, paint, false);
        double d7 = f3;
        drawTicks(canvas, d2, d3, angleMin, angleMax, this.mCenterX, this.mCenterY, d6, d7, d5, paint, true);
        int seriesRendererCount2 = this.mRenderer.getSeriesRendererCount();
        for (int i11 = 0; i11 < seriesRendererCount2; i11++) {
            double angleForValue = getAngleForValue(this.mDataset.getValue(i11), angleMin, angleMax, d2, d3);
            paint.setColor(this.mRenderer.getSeriesRendererAt(i11).getColor());
            drawNeedle(canvas, angleForValue, this.mCenterX, this.mCenterY, d7, this.mRenderer.getVisualTypeForIndex(i11) == DialRenderer.Type.ARROW, paint);
        }
        drawLegend(canvas, this.mRenderer, strArr, i2, i6, i3, i4, i5, iDrawLegend, paint, false);
        drawTitle(canvas, i2, i3, i4, paint);
    }
}
