package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.achartengine.model.Point;
import org.achartengine.model.SeriesSelection;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.BasicStroke;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;
import org.achartengine.util.MathHelper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class XYChart extends AbstractChart {
    private Point mCenter;
    public XYMultipleSeriesDataset mDataset;
    public transient Paint mGridPaint;
    public XYMultipleSeriesRenderer mRenderer;
    private float mScale;
    private Rect mScreenR;
    private float mTranslate;
    private final Map<Integer, double[]> mCalcRange = new HashMap();
    private Map<Integer, List<ClickableArea>> clickableAreas = new HashMap();

    public XYChart() {
    }

    public XYChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        this.mDataset = xYMultipleSeriesDataset;
        this.mRenderer = xYMultipleSeriesRenderer;
    }

    private int getLabelLinePos(Paint.Align align) {
        return align == Paint.Align.LEFT ? -4 : 4;
    }

    private List<Double> getValidLabels(List<Double> list) {
        ArrayList arrayList = new ArrayList(list);
        for (Double d2 : list) {
            if (d2.isNaN()) {
                arrayList.remove(d2);
            }
        }
        return arrayList;
    }

    private void setStroke(Paint.Cap cap, Paint.Join join, float f2, Paint.Style style, PathEffect pathEffect, Paint paint) {
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(f2);
        paint.setPathEffect(pathEffect);
        paint.setStyle(style);
    }

    private void transform(Canvas canvas, float f2, boolean z) {
        if (z) {
            float f3 = this.mScale;
            canvas.scale(1.0f / f3, f3);
            float f4 = this.mTranslate;
            canvas.translate(f4, -f4);
            canvas.rotate(-f2, this.mCenter.getX(), this.mCenter.getY());
            return;
        }
        canvas.rotate(f2, this.mCenter.getX(), this.mCenter.getY());
        float f5 = this.mTranslate;
        canvas.translate(-f5, f5);
        float f6 = this.mScale;
        canvas.scale(f6, 1.0f / f6);
    }

    public abstract ClickableArea[] clickableAreasForPoints(List<Float> list, List<Double> list2, float f2, int i2, int i3);

    /* JADX WARN: Removed duplicated region for block: B:186:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0b3b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0b62  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0bb0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0c18  */
    /* JADX WARN: Removed duplicated region for block: B:311:? A[RETURN, SYNTHETIC] */
    @Override // org.achartengine.chart.AbstractChart
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r55, int r56, int r57, int r58, int r59, android.graphics.Paint r60) {
        /*
            Method dump skipped, instruction units count: 3104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.achartengine.chart.XYChart.draw(android.graphics.Canvas, int, int, int, int, android.graphics.Paint):void");
    }

    public void drawChartValuesText(Canvas canvas, XYSeries xYSeries, XYSeriesRenderer xYSeriesRenderer, Paint paint, List<Float> list, int i2, int i3) {
        int i4;
        Float f2;
        if (list.size() <= 2) {
            for (int i5 = 0; i5 < list.size(); i5 += 2) {
                drawText(canvas, getLabel(xYSeriesRenderer.getChartValuesFormat(), xYSeries.getY((i5 / 2) + i3)), list.get(i5).floatValue(), list.get(i5 + 1).floatValue() - xYSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
            }
            return;
        }
        float fFloatValue = list.get(0).floatValue();
        float fFloatValue2 = list.get(1).floatValue();
        for (int i6 = 0; i6 < list.size(); i6 += 2) {
            if (i6 == 2) {
                i4 = 3;
                if (Math.abs(list.get(2).floatValue() - list.get(0).floatValue()) > xYSeriesRenderer.getDisplayChartValuesDistance() || Math.abs(list.get(3).floatValue() - list.get(1).floatValue()) > xYSeriesRenderer.getDisplayChartValuesDistance()) {
                    drawText(canvas, getLabel(xYSeriesRenderer.getChartValuesFormat(), xYSeries.getY(i3)), list.get(0).floatValue(), list.get(1).floatValue() - xYSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
                    drawText(canvas, getLabel(xYSeriesRenderer.getChartValuesFormat(), xYSeries.getY(i3 + 1)), list.get(2).floatValue(), list.get(3).floatValue() - xYSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
                    f2 = list.get(2);
                    fFloatValue = f2.floatValue();
                    fFloatValue2 = list.get(i4).floatValue();
                }
            } else if (i6 > 2 && (Math.abs(list.get(i6).floatValue() - fFloatValue) > xYSeriesRenderer.getDisplayChartValuesDistance() || Math.abs(list.get(i6 + 1).floatValue() - fFloatValue2) > xYSeriesRenderer.getDisplayChartValuesDistance())) {
                i4 = i6 + 1;
                drawText(canvas, getLabel(xYSeriesRenderer.getChartValuesFormat(), xYSeries.getY((i6 / 2) + i3)), list.get(i6).floatValue(), list.get(i4).floatValue() - xYSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
                f2 = list.get(i6);
                fFloatValue = f2.floatValue();
                fFloatValue2 = list.get(i4).floatValue();
            }
        }
    }

    public void drawPoints(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f2, int i2, int i3) {
        ScatterChart pointsChart;
        if (!isRenderPoints(xYSeriesRenderer) || (pointsChart = getPointsChart()) == null) {
            return;
        }
        pointsChart.drawSeries(canvas, paint, list, xYSeriesRenderer, f2, i2, i3);
    }

    public abstract void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f2, int i2, int i3);

    public void drawSeries(XYSeries xYSeries, Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f2, int i2, XYMultipleSeriesRenderer.Orientation orientation, int i3) {
        BasicStroke stroke = xYSeriesRenderer.getStroke();
        Paint.Cap strokeCap = paint.getStrokeCap();
        Paint.Join strokeJoin = paint.getStrokeJoin();
        float strokeMiter = paint.getStrokeMiter();
        PathEffect pathEffect = paint.getPathEffect();
        Paint.Style style = paint.getStyle();
        if (stroke != null) {
            setStroke(stroke.getCap(), stroke.getJoin(), stroke.getMiter(), Paint.Style.FILL_AND_STROKE, stroke.getIntervals() != null ? new DashPathEffect(stroke.getIntervals(), stroke.getPhase()) : null, paint);
        }
        drawSeries(canvas, paint, list, xYSeriesRenderer, f2, i2, i3);
        drawPoints(canvas, paint, list, xYSeriesRenderer, f2, i2, i3);
        paint.setTextSize(xYSeriesRenderer.getChartValuesTextSize());
        paint.setTextAlign(orientation == XYMultipleSeriesRenderer.Orientation.HORIZONTAL ? Paint.Align.CENTER : Paint.Align.LEFT);
        if (xYSeriesRenderer.isDisplayChartValues()) {
            paint.setTextAlign(xYSeriesRenderer.getChartValuesTextAlign());
            drawChartValuesText(canvas, xYSeries, xYSeriesRenderer, paint, list, i2, i3);
        }
        if (stroke != null) {
            setStroke(strokeCap, strokeJoin, strokeMiter, style, pathEffect, paint);
        }
    }

    public void drawText(Canvas canvas, String str, float f2, float f3, Paint paint, float f4) {
        float f5 = (-this.mRenderer.getOrientation().getAngle()) + f4;
        if (f5 != 0.0f) {
            canvas.rotate(f5, f2, f3);
        }
        drawString(canvas, str, f2, f3, paint);
        if (f5 != 0.0f) {
            canvas.rotate(-f5, f2, f3);
        }
    }

    public void drawXLabels(List<Double> list, Double[] dArr, Canvas canvas, Paint paint, int i2, int i3, int i4, double d2, double d3, double d4) {
        float f2;
        int size = list.size();
        boolean zIsShowXLabels = this.mRenderer.isShowXLabels();
        boolean zIsShowGridY = this.mRenderer.isShowGridY();
        if (zIsShowGridY) {
            this.mGridPaint.setStyle(Paint.Style.STROKE);
            this.mGridPaint.setStrokeWidth(this.mRenderer.getGridLineWidth());
        }
        boolean zIsShowTickMarks = this.mRenderer.isShowTickMarks();
        for (int i5 = 0; i5 < size; i5++) {
            double dDoubleValue = list.get(i5).doubleValue();
            double d5 = i2;
            Double.isNaN(d5);
            float f3 = (float) (d5 + ((dDoubleValue - d3) * d2));
            if (zIsShowXLabels) {
                paint.setColor(this.mRenderer.getXLabelsColor());
                if (zIsShowTickMarks) {
                    float f4 = i4;
                    canvas.drawLine(f3, f4, f3, f4 + (this.mRenderer.getLabelsTextSize() / 3.0f), paint);
                }
                f2 = f3;
                drawText(canvas, getLabel(this.mRenderer.getXLabelFormat(), dDoubleValue), f3, i4 + ((this.mRenderer.getLabelsTextSize() * 4.0f) / 3.0f) + this.mRenderer.getXLabelsPadding(), paint, this.mRenderer.getXLabelsAngle());
            } else {
                f2 = f3;
            }
            if (zIsShowGridY) {
                this.mGridPaint.setColor(this.mRenderer.getGridColor(0));
                canvas.drawLine(f2, i4, f2, i3, this.mGridPaint);
            }
        }
        drawXTextLabels(dArr, canvas, paint, zIsShowXLabels, i2, i3, i4, d2, d3, d4);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void drawXTextLabels(java.lang.Double[] r20, android.graphics.Canvas r21, android.graphics.Paint r22, boolean r23, int r24, int r25, int r26, double r27, double r29, double r31) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r22
            r10 = r26
            org.achartengine.renderer.XYMultipleSeriesRenderer r0 = r7.mRenderer
            boolean r11 = r0.isShowCustomTextGridX()
            org.achartengine.renderer.XYMultipleSeriesRenderer r0 = r7.mRenderer
            boolean r12 = r0.isShowTickMarks()
            if (r23 == 0) goto Lc1
            org.achartengine.renderer.XYMultipleSeriesRenderer r0 = r7.mRenderer
            int r0 = r0.getXLabelsColor()
            r9.setColor(r0)
            int r13 = r8.length
            r14 = 0
            r15 = 0
        L22:
            if (r15 >= r13) goto Lc1
            r6 = r8[r15]
            double r0 = r6.doubleValue()
            int r2 = (r29 > r0 ? 1 : (r29 == r0 ? 0 : -1))
            if (r2 > 0) goto Lbb
            double r0 = r6.doubleValue()
            int r2 = (r0 > r31 ? 1 : (r0 == r31 ? 0 : -1))
            if (r2 > 0) goto Lbb
            r5 = r24
            double r0 = (double) r5
            double r2 = r6.doubleValue()
            double r2 = r2 - r29
            double r2 = r2 * r27
            java.lang.Double.isNaN(r0)
            double r0 = r0 + r2
            float r4 = (float) r0
            org.achartengine.renderer.XYMultipleSeriesRenderer r0 = r7.mRenderer
            int r0 = r0.getXLabelsColor()
            r9.setColor(r0)
            r16 = 1077936128(0x40400000, float:3.0)
            if (r12 == 0) goto L6c
            float r2 = (float) r10
            org.achartengine.renderer.XYMultipleSeriesRenderer r0 = r7.mRenderer
            float r0 = r0.getLabelsTextSize()
            float r0 = r0 / r16
            float r17 = r2 + r0
            r0 = r21
            r1 = r4
            r3 = r4
            r18 = r4
            r4 = r17
            r5 = r22
            r0.drawLine(r1, r2, r3, r4, r5)
            goto L6e
        L6c:
            r18 = r4
        L6e:
            org.achartengine.renderer.XYMultipleSeriesRenderer r0 = r7.mRenderer
            java.lang.String r2 = r0.getXTextLabel(r6)
            float r6 = (float) r10
            org.achartengine.renderer.XYMultipleSeriesRenderer r0 = r7.mRenderer
            float r0 = r0.getLabelsTextSize()
            r1 = 1082130432(0x40800000, float:4.0)
            float r0 = r0 * r1
            float r0 = r0 / r16
            float r0 = r0 + r6
            org.achartengine.renderer.XYMultipleSeriesRenderer r1 = r7.mRenderer
            float r1 = r1.getXLabelsPadding()
            float r4 = r0 + r1
            org.achartengine.renderer.XYMultipleSeriesRenderer r0 = r7.mRenderer
            float r16 = r0.getXLabelsAngle()
            r0 = r19
            r1 = r21
            r3 = r18
            r5 = r22
            r17 = r6
            r6 = r16
            r0.drawText(r1, r2, r3, r4, r5, r6)
            if (r11 == 0) goto Lbb
            org.achartengine.renderer.XYMultipleSeriesRenderer r0 = r7.mRenderer
            int r0 = r0.getGridColor(r14)
            r9.setColor(r0)
            r6 = r25
            float r4 = (float) r6
            r0 = r21
            r1 = r18
            r2 = r17
            r3 = r18
            r5 = r22
            r0.drawLine(r1, r2, r3, r4, r5)
            goto Lbd
        Lbb:
            r6 = r25
        Lbd:
            int r15 = r15 + 1
            goto L22
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.achartengine.chart.XYChart.drawXTextLabels(java.lang.Double[], android.graphics.Canvas, android.graphics.Paint, boolean, int, int, int, double, double, double):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ef A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void drawYLabels(java.util.Map<java.lang.Integer, java.util.List<java.lang.Double>> r28, android.graphics.Canvas r29, android.graphics.Paint r30, int r31, int r32, int r33, int r34, double[] r35, double[] r36) {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.achartengine.chart.XYChart.drawYLabels(java.util.Map, android.graphics.Canvas, android.graphics.Paint, int, int, int, int, double[], double[]):void");
    }

    public double[] getCalcRange(int i2) {
        return this.mCalcRange.get(Integer.valueOf(i2));
    }

    public abstract String getChartType();

    public XYMultipleSeriesDataset getDataset() {
        return this.mDataset;
    }

    public double getDefaultMinimum() {
        return Double.MAX_VALUE;
    }

    public ScatterChart getPointsChart() {
        return null;
    }

    public XYMultipleSeriesRenderer getRenderer() {
        return this.mRenderer;
    }

    public Rect getScreenR() {
        return this.mScreenR;
    }

    @Override // org.achartengine.chart.AbstractChart
    public SeriesSelection getSeriesAndPointForScreenCoordinate(Point point) {
        RectF rect;
        Map<Integer, List<ClickableArea>> map = this.clickableAreas;
        if (map != null) {
            for (int size = map.size() - 1; size >= 0; size--) {
                if (this.clickableAreas.get(Integer.valueOf(size)) != null) {
                    int i2 = 0;
                    for (ClickableArea clickableArea : this.clickableAreas.get(Integer.valueOf(size))) {
                        if (clickableArea != null && (rect = clickableArea.getRect()) != null && rect.contains(point.getX(), point.getY())) {
                            return new SeriesSelection(size, i2, clickableArea.getX(), clickableArea.getY());
                        }
                        i2++;
                    }
                }
            }
        }
        return super.getSeriesAndPointForScreenCoordinate(point);
    }

    public List<Double> getXLabels(double d2, double d3, int i2) {
        return MathHelper.getLabels(d2, d3, i2);
    }

    public Map<Integer, List<Double>> getYLabels(double[] dArr, double[] dArr2, int i2) {
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < i2; i3++) {
            map.put(Integer.valueOf(i3), getValidLabels(MathHelper.getLabels(dArr[i3], dArr2[i3], this.mRenderer.getYLabels())));
        }
        return map;
    }

    public boolean isRenderNullValues() {
        return false;
    }

    public boolean isRenderPoints(SimpleSeriesRenderer simpleSeriesRenderer) {
        return false;
    }

    public void setCalcRange(double[] dArr, int i2) {
        this.mCalcRange.put(Integer.valueOf(i2), dArr);
    }

    public void setDatasetRenderer(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        this.mDataset = xYMultipleSeriesDataset;
        this.mRenderer = xYMultipleSeriesRenderer;
    }

    public void setScreenR(Rect rect) {
        this.mScreenR = rect;
    }

    public double[] toRealPoint(float f2, float f3) {
        return toRealPoint(f2, f3, 0);
    }

    public double[] toRealPoint(float f2, float f3, int i2) {
        double[] calcRange;
        double xAxisMin = this.mRenderer.getXAxisMin(i2);
        double xAxisMax = this.mRenderer.getXAxisMax(i2);
        double yAxisMin = this.mRenderer.getYAxisMin(i2);
        double yAxisMax = this.mRenderer.getYAxisMax(i2);
        if ((!this.mRenderer.isMinXSet(i2) || !this.mRenderer.isMaxXSet(i2) || !this.mRenderer.isMinYSet(i2) || !this.mRenderer.isMaxYSet(i2)) && (calcRange = getCalcRange(i2)) != null) {
            xAxisMin = calcRange[0];
            xAxisMax = calcRange[1];
            yAxisMin = calcRange[2];
            yAxisMax = calcRange[3];
        }
        Rect rect = this.mScreenR;
        if (rect == null) {
            return new double[]{f2, f3};
        }
        double d2 = f2 - rect.left;
        Double.isNaN(d2);
        double d3 = d2 * (xAxisMax - xAxisMin);
        double dWidth = rect.width();
        Double.isNaN(dWidth);
        Rect rect2 = this.mScreenR;
        double dHeight = (rect2.top + rect2.height()) - f3;
        Double.isNaN(dHeight);
        double dHeight2 = this.mScreenR.height();
        Double.isNaN(dHeight2);
        return new double[]{(d3 / dWidth) + xAxisMin, ((dHeight * (yAxisMax - yAxisMin)) / dHeight2) + yAxisMin};
    }

    public double[] toScreenPoint(double[] dArr) {
        return toScreenPoint(dArr, 0);
    }

    public double[] toScreenPoint(double[] dArr, int i2) {
        double xAxisMin = this.mRenderer.getXAxisMin(i2);
        double xAxisMax = this.mRenderer.getXAxisMax(i2);
        double yAxisMin = this.mRenderer.getYAxisMin(i2);
        double yAxisMax = this.mRenderer.getYAxisMax(i2);
        if (!this.mRenderer.isMinXSet(i2) || !this.mRenderer.isMaxXSet(i2) || !this.mRenderer.isMinYSet(i2) || !this.mRenderer.isMaxYSet(i2)) {
            double[] calcRange = getCalcRange(i2);
            xAxisMin = calcRange[0];
            xAxisMax = calcRange[1];
            yAxisMin = calcRange[2];
            yAxisMax = calcRange[3];
        }
        Rect rect = this.mScreenR;
        if (rect == null) {
            return dArr;
        }
        double d2 = dArr[0] - xAxisMin;
        double dWidth = rect.width();
        Double.isNaN(dWidth);
        double d3 = (d2 * dWidth) / (xAxisMax - xAxisMin);
        Rect rect2 = this.mScreenR;
        double d4 = rect2.left;
        Double.isNaN(d4);
        double d5 = yAxisMax - dArr[1];
        double dHeight = rect2.height();
        Double.isNaN(dHeight);
        double d6 = (d5 * dHeight) / (yAxisMax - yAxisMin);
        double d7 = this.mScreenR.top;
        Double.isNaN(d7);
        return new double[]{d3 + d4, d6 + d7};
    }
}
