package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;
import org.achartengine.model.Point;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class CubicLineChart extends LineChart {
    public static final String TYPE = "Cubic";
    private float mFirstMultiplier;
    private PathMeasure mPathMeasure;
    private float mSecondMultiplier;

    public CubicLineChart() {
        this.mFirstMultiplier = 0.33f;
        this.mSecondMultiplier = 1.0f - 0.33f;
    }

    public CubicLineChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, float f2) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.mFirstMultiplier = f2;
        this.mSecondMultiplier = 1.0f - f2;
    }

    private void calc(List<Float> list, Point point, int i2, int i3, float f2) {
        float fFloatValue = list.get(i2).floatValue();
        float fFloatValue2 = list.get(i2 + 1).floatValue();
        float fFloatValue3 = list.get(i3).floatValue();
        float fFloatValue4 = list.get(i3 + 1).floatValue() - fFloatValue2;
        point.setX(fFloatValue + ((fFloatValue3 - fFloatValue) * f2));
        point.setY(fFloatValue2 + (fFloatValue4 * f2));
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawPath(Canvas canvas, List<Float> list, Paint paint, boolean z) {
        Path path = new Path();
        path.moveTo(list.get(0).floatValue(), list.get(1).floatValue());
        int size = list.size();
        if (z) {
            size -= 4;
        }
        int i2 = size;
        Point point = new Point();
        Point point2 = new Point();
        Point point3 = new Point();
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 2;
            int i5 = i4 < i2 ? i4 : i3;
            int i6 = i3 + 4;
            int i7 = i6 < i2 ? i6 : i5;
            calc(list, point, i3, i5, this.mSecondMultiplier);
            point2.setX(list.get(i5).floatValue());
            point2.setY(list.get(i5 + 1).floatValue());
            calc(list, point3, i5, i7, this.mFirstMultiplier);
            path.cubicTo(point.getX(), point.getY(), point2.getX(), point2.getY(), point3.getX(), point3.getY());
            point2 = point2;
            i2 = i2;
            i3 = i4;
        }
        int i8 = i2;
        this.mPathMeasure = new PathMeasure(path, false);
        if (z) {
            for (int i9 = i8; i9 < i8 + 4; i9 += 2) {
                path.lineTo(list.get(i9).floatValue(), list.get(i9 + 1).floatValue());
            }
            path.lineTo(list.get(0).floatValue(), list.get(1).floatValue());
        }
        canvas.drawPath(path, paint);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawPoints(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f2, int i2, int i3) {
        ScatterChart pointsChart;
        if (!isRenderPoints(xYSeriesRenderer) || (pointsChart = getPointsChart()) == null) {
            return;
        }
        int length = (int) this.mPathMeasure.getLength();
        int size = list.size();
        float[] fArr = new float[2];
        for (int i4 = 0; i4 < length; i4++) {
            this.mPathMeasure.getPosTan(i4, fArr, null);
            double d2 = Double.MAX_VALUE;
            boolean z = true;
            for (int i5 = 0; i5 < size && z; i5 += 2) {
                double dAbs = Math.abs(list.get(i5).floatValue() - fArr[0]);
                if (dAbs < 1.0d) {
                    list.set(i5 + 1, Float.valueOf(fArr[1]));
                    d2 = dAbs;
                }
                z = d2 > dAbs;
            }
        }
        pointsChart.drawSeries(canvas, paint, list, xYSeriesRenderer, f2, i2, i3);
    }

    @Override // org.achartengine.chart.LineChart, org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }
}
