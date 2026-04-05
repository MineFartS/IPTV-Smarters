package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import org.achartengine.model.CategorySeries;
import org.achartengine.model.Point;
import org.achartengine.model.SeriesSelection;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class PieChart extends RoundChart {
    private PieMapper mPieMapper;

    public PieChart(CategorySeries categorySeries, DefaultRenderer defaultRenderer) {
        super(categorySeries, defaultRenderer);
        this.mPieMapper = new PieMapper();
    }

    @Override // org.achartengine.chart.AbstractChart
    public void draw(Canvas canvas, int i2, int i3, int i4, int i5, Paint paint) {
        int i6;
        float f2;
        float f3;
        int i7;
        float f4;
        float f5;
        int i8;
        PieChart pieChart = this;
        Paint paint2 = paint;
        paint2.setAntiAlias(pieChart.mRenderer.isAntialiasing());
        paint2.setStyle(Paint.Style.FILL);
        paint2.setTextSize(pieChart.mRenderer.getLabelsTextSize());
        int legendSize = pieChart.getLegendSize(pieChart.mRenderer, i5 / 5, 0.0f);
        int i9 = i2 + i4;
        int itemCount = pieChart.mDataset.getItemCount();
        String[] strArr = new String[itemCount];
        double value = 0.0d;
        for (int i10 = 0; i10 < itemCount; i10++) {
            value += pieChart.mDataset.getValue(i10);
            strArr[i10] = pieChart.mDataset.getCategory(i10);
        }
        int iDrawLegend = pieChart.mRenderer.isFitLegend() ? drawLegend(canvas, pieChart.mRenderer, strArr, i2, i9, i3, i4, i5, legendSize, paint, true) : legendSize;
        int i11 = (i3 + i5) - iDrawLegend;
        drawBackground(pieChart.mRenderer, canvas, i2, i3, i4, i5, paint, false, 0);
        float startAngle = pieChart.mRenderer.getStartAngle();
        double dMin = Math.min(Math.abs(i9 - i2), Math.abs(i11 - i3));
        Double.isNaN(dMin);
        double scale = pieChart.mRenderer.getScale();
        Double.isNaN(scale);
        int i12 = (int) (dMin * 0.35d * scale);
        if (pieChart.mCenterX == Integer.MAX_VALUE) {
            pieChart.mCenterX = (i2 + i9) / 2;
        }
        if (pieChart.mCenterY == Integer.MAX_VALUE) {
            pieChart.mCenterY = (i11 + i3) / 2;
        }
        pieChart.mPieMapper.setDimensions(i12, pieChart.mCenterX, pieChart.mCenterY);
        boolean z = !pieChart.mPieMapper.areAllSegmentPresent(itemCount);
        if (z) {
            pieChart.mPieMapper.clearPieSegments();
        }
        float f6 = i12;
        float f7 = f6 * 0.9f;
        float f8 = f6 * 1.1f;
        int i13 = pieChart.mCenterX;
        int i14 = pieChart.mCenterY;
        RectF rectF = new RectF(i13 - i12, i14 - i12, i13 + i12, i14 + i12);
        ArrayList arrayList = new ArrayList();
        float f9 = startAngle;
        int i15 = 0;
        while (i15 < itemCount) {
            SimpleSeriesRenderer seriesRendererAt = pieChart.mRenderer.getSeriesRendererAt(i15);
            if (seriesRendererAt.isGradientEnabled()) {
                paint2.setShader(new RadialGradient(pieChart.mCenterX, pieChart.mCenterY, f8, seriesRendererAt.getGradientStartColor(), seriesRendererAt.getGradientStopColor(), Shader.TileMode.MIRROR));
            } else {
                paint2.setColor(seriesRendererAt.getColor());
            }
            float value2 = (float) pieChart.mDataset.getValue(i15);
            double d2 = value2;
            Double.isNaN(d2);
            float f10 = (float) ((d2 / value) * 360.0d);
            if (seriesRendererAt.isHighlighted()) {
                double radians = Math.toRadians(90.0f - ((f10 / 2.0f) + f9));
                double d3 = i12;
                Double.isNaN(d3);
                double d4 = d3 * 0.1d;
                i6 = i15;
                float fSin = (float) (d4 * Math.sin(radians));
                float fCos = (float) (d4 * Math.cos(radians));
                rectF.offset(fSin, fCos);
                f2 = f9;
                f3 = value2;
                canvas.drawArc(rectF, f9, f10, true, paint);
                rectF.offset(-fSin, -fCos);
            } else {
                i6 = i15;
                f2 = f9;
                f3 = value2;
                canvas.drawArc(rectF, f9, f10, true, paint);
            }
            paint2.setColor(seriesRendererAt.getColor());
            paint2.setShader(null);
            String category = pieChart.mDataset.getCategory(i6);
            DefaultRenderer defaultRenderer = pieChart.mRenderer;
            String[] strArr2 = strArr;
            int i16 = itemCount;
            int i17 = i6;
            float f11 = f3;
            RectF rectF2 = rectF;
            int i18 = i12;
            drawLabel(canvas, category, defaultRenderer, arrayList, pieChart.mCenterX, pieChart.mCenterY, f7, f8, f2, f10, i2, i9, defaultRenderer.getLabelsColor(), paint, true, false);
            if (this.mRenderer.isDisplayValues()) {
                String label = getLabel(this.mRenderer.getSeriesRendererAt(i17).getChartValuesFormat(), this.mDataset.getValue(i17));
                DefaultRenderer defaultRenderer2 = this.mRenderer;
                i7 = i17;
                drawLabel(canvas, label, defaultRenderer2, arrayList, this.mCenterX, this.mCenterY, f7 / 2.0f, f8 / 2.0f, f2, f10, i2, i9, defaultRenderer2.getLabelsColor(), paint, false, true);
            } else {
                i7 = i17;
            }
            if (z) {
                f4 = f2;
                f5 = f10;
                i8 = i7;
                this.mPieMapper.addPieSegment(i8, f11, f4, f5);
            } else {
                f4 = f2;
                f5 = f10;
                i8 = i7;
            }
            f9 = f4 + f5;
            i15 = i8 + 1;
            pieChart = this;
            rectF = rectF2;
            strArr = strArr2;
            itemCount = i16;
            i12 = i18;
            paint2 = paint;
        }
        arrayList.clear();
        drawLegend(canvas, pieChart.mRenderer, strArr, i2, i9, i3, i4, i5, iDrawLegend, paint, false);
        drawTitle(canvas, i2, i3, i4, paint);
    }

    @Override // org.achartengine.chart.AbstractChart
    public SeriesSelection getSeriesAndPointForScreenCoordinate(Point point) {
        return this.mPieMapper.getSeriesAndPointForScreenCoordinate(point);
    }
}
