package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.List;
import org.achartengine.chart.BarChart;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class RangeBarChart extends BarChart {
    public static final String TYPE = "RangeBar";

    public RangeBarChart() {
    }

    public RangeBarChart(BarChart.Type type) {
        super(type);
    }

    public RangeBarChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, BarChart.Type type) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer, type);
    }

    @Override // org.achartengine.chart.BarChart, org.achartengine.chart.XYChart
    public void drawChartValuesText(Canvas canvas, XYSeries xYSeries, XYSeriesRenderer xYSeriesRenderer, Paint paint, List<Float> list, int i2, int i3) {
        int i4;
        int i5;
        int seriesCount = this.mDataset.getSeriesCount();
        float halfDiffX = getHalfDiffX(list, list.size(), seriesCount);
        for (int i6 = i3 > 0 ? 2 : 0; i6 < list.size(); i6 += 4) {
            int i7 = i3 + (i6 / 2);
            float fFloatValue = list.get(i6).floatValue();
            if (this.mType == BarChart.Type.DEFAULT) {
                fFloatValue += ((i2 * 2) * halfDiffX) - ((seriesCount - 1.5f) * halfDiffX);
            }
            float f2 = fFloatValue;
            int i8 = i7 + 1;
            if (!isNullValue(xYSeries.getY(i8)) && list.size() > (i5 = i6 + 3)) {
                drawText(canvas, getLabel(xYSeriesRenderer.getChartValuesFormat(), xYSeries.getY(i8)), f2, list.get(i5).floatValue() - xYSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
            }
            if (!isNullValue(xYSeries.getY(i7)) && list.size() > (i4 = i6 + 1)) {
                drawText(canvas, getLabel(xYSeriesRenderer.getChartValuesFormat(), xYSeries.getY(i7)), f2, ((list.get(i4).floatValue() + xYSeriesRenderer.getChartValuesTextSize()) + xYSeriesRenderer.getChartValuesSpacing()) - 3.0f, paint, 0.0f);
            }
        }
    }

    @Override // org.achartengine.chart.BarChart, org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f2, int i2, int i3) {
        int i4;
        int seriesCount = this.mDataset.getSeriesCount();
        int size = list.size();
        paint.setColor(xYSeriesRenderer.getColor());
        paint.setStyle(Paint.Style.FILL);
        float halfDiffX = getHalfDiffX(list, size, seriesCount);
        int i5 = i3 > 0 ? 2 : 0;
        while (i5 < size) {
            int i6 = i5 + 3;
            if (list.size() > i6) {
                i4 = i5;
                drawBar(canvas, list.get(i5).floatValue(), list.get(i5 + 1).floatValue(), list.get(i5 + 2).floatValue(), list.get(i6).floatValue(), halfDiffX, seriesCount, i2, paint);
            } else {
                i4 = i5;
            }
            i5 = i4 + 4;
        }
        paint.setColor(xYSeriesRenderer.getColor());
    }

    @Override // org.achartengine.chart.BarChart, org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    @Override // org.achartengine.chart.BarChart
    public float getCoeficient() {
        return 0.5f;
    }
}
