package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.achartengine.model.CategorySeries;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RoundChart extends AbstractChart {
    public static final int NO_VALUE = Integer.MAX_VALUE;
    public static final int SHAPE_WIDTH = 10;
    public int mCenterX = Integer.MAX_VALUE;
    public int mCenterY = Integer.MAX_VALUE;
    public CategorySeries mDataset;
    public DefaultRenderer mRenderer;

    public RoundChart(CategorySeries categorySeries, DefaultRenderer defaultRenderer) {
        this.mDataset = categorySeries;
        this.mRenderer = defaultRenderer;
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f2, float f3, int i2, Paint paint) {
        canvas.drawRect(f2, f3 - 5.0f, f2 + 10.0f, f3 + 5.0f, paint);
    }

    public void drawTitle(Canvas canvas, int i2, int i3, int i4, Paint paint) {
        if (this.mRenderer.isShowLabels()) {
            paint.setColor(this.mRenderer.getLabelsColor());
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTextSize(this.mRenderer.getChartTitleTextSize());
            drawString(canvas, this.mRenderer.getChartTitle(), i2 + (i4 / 2), i3 + this.mRenderer.getChartTitleTextSize(), paint);
        }
    }

    public int getCenterX() {
        return this.mCenterX;
    }

    public int getCenterY() {
        return this.mCenterY;
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i2) {
        return 10;
    }

    public DefaultRenderer getRenderer() {
        return this.mRenderer;
    }

    public void setCenterX(int i2) {
        this.mCenterX = i2;
    }

    public void setCenterY(int i2) {
        this.mCenterY = i2;
    }
}
