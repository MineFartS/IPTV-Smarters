package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.List;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYValueSeries;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class BubbleChart extends XYChart {
    private static final int MAX_BUBBLE_SIZE = 20;
    private static final int MIN_BUBBLE_SIZE = 2;
    private static final int SHAPE_WIDTH = 10;
    public static final String TYPE = "Bubble";

    public BubbleChart() {
    }

    public BubbleChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
    }

    private void drawCircle(Canvas canvas, Paint paint, float f2, float f3, float f4) {
        canvas.drawCircle(f2, f3, f4, paint);
    }

    @Override // org.achartengine.chart.XYChart
    public ClickableArea[] clickableAreasForPoints(List<Float> list, List<Double> list2, float f2, int i2, int i3) {
        int size = list.size();
        XYValueSeries xYValueSeries = (XYValueSeries) this.mDataset.getSeriesAt(i2);
        double maxValue = 20.0d / xYValueSeries.getMaxValue();
        ClickableArea[] clickableAreaArr = new ClickableArea[size / 2];
        for (int i4 = 0; i4 < size; i4 += 2) {
            int i5 = i4 / 2;
            float value = (float) ((xYValueSeries.getValue(i3 + i5) * maxValue) + 2.0d);
            int i6 = i4 + 1;
            clickableAreaArr[i5] = new ClickableArea(new RectF(list.get(i4).floatValue() - value, list.get(i6).floatValue() - value, list.get(i4).floatValue() + value, list.get(i6).floatValue() + value), list2.get(i4).doubleValue(), list2.get(i6).doubleValue());
        }
        return clickableAreaArr;
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f2, float f3, int i2, Paint paint) {
        paint.setStyle(Paint.Style.FILL);
        drawCircle(canvas, paint, f2 + 10.0f, f3, 3.0f);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f2, int i2, int i3) {
        paint.setColor(xYSeriesRenderer.getColor());
        paint.setStyle(Paint.Style.FILL);
        int size = list.size();
        XYValueSeries xYValueSeries = (XYValueSeries) this.mDataset.getSeriesAt(i2);
        double maxValue = 20.0d / xYValueSeries.getMaxValue();
        for (int i4 = 0; i4 < size; i4 += 2) {
            drawCircle(canvas, paint, list.get(i4).floatValue(), list.get(i4 + 1).floatValue(), (float) ((xYValueSeries.getValue(i3 + (i4 / 2)) * maxValue) + 2.0d));
        }
    }

    @Override // org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i2) {
        return 10;
    }
}
