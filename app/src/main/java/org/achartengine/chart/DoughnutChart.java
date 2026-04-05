package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.achartengine.model.MultipleCategorySeries;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class DoughnutChart extends RoundChart {
    private MultipleCategorySeries mDataset;
    private int mStep;

    public DoughnutChart(MultipleCategorySeries multipleCategorySeries, DefaultRenderer defaultRenderer) {
        super(null, defaultRenderer);
        this.mDataset = multipleCategorySeries;
    }

    @Override // org.achartengine.chart.AbstractChart
    public void draw(Canvas canvas, int i2, int i3, int i4, int i5, Paint paint) {
        Paint paint2;
        DoughnutChart doughnutChart = this;
        Paint paint3 = paint;
        paint3.setAntiAlias(doughnutChart.mRenderer.isAntialiasing());
        paint3.setStyle(Paint.Style.FILL);
        paint3.setTextSize(doughnutChart.mRenderer.getLabelsTextSize());
        int legendSize = doughnutChart.getLegendSize(doughnutChart.mRenderer, i5 / 5, 0.0f);
        int i6 = i2 + i4;
        int categoriesCount = doughnutChart.mDataset.getCategoriesCount();
        String[] strArr = new String[categoriesCount];
        for (int i7 = 0; i7 < categoriesCount; i7++) {
            strArr[i7] = doughnutChart.mDataset.getCategory(i7);
        }
        int iDrawLegend = doughnutChart.mRenderer.isFitLegend() ? drawLegend(canvas, doughnutChart.mRenderer, strArr, i2, i6, i3, i4, i5, legendSize, paint, true) : legendSize;
        int i8 = (i3 + i5) - iDrawLegend;
        drawBackground(doughnutChart.mRenderer, canvas, i2, i3, i4, i5, paint, false, 0);
        doughnutChart.mStep = 7;
        int iMin = Math.min(Math.abs(i6 - i2), Math.abs(i8 - i3));
        double scale = doughnutChart.mRenderer.getScale();
        Double.isNaN(scale);
        double d2 = categoriesCount;
        Double.isNaN(d2);
        double d3 = 0.2d / d2;
        double d4 = iMin;
        Double.isNaN(d4);
        int i9 = (int) (scale * 0.35d * d4);
        if (doughnutChart.mCenterX == Integer.MAX_VALUE) {
            doughnutChart.mCenterX = (i2 + i6) / 2;
        }
        if (doughnutChart.mCenterY == Integer.MAX_VALUE) {
            doughnutChart.mCenterY = (i8 + i3) / 2;
        }
        float f2 = i9;
        float f3 = f2 * 1.1f;
        ArrayList arrayList = new ArrayList();
        int i10 = i9;
        float f4 = 0.9f * f2;
        int i11 = 0;
        while (i11 < categoriesCount) {
            int itemCount = doughnutChart.mDataset.getItemCount(i11);
            String[] strArr2 = new String[itemCount];
            double d5 = 0.0d;
            for (int i12 = 0; i12 < itemCount; i12++) {
                d5 += doughnutChart.mDataset.getValues(i11)[i12];
                strArr2[i12] = doughnutChart.mDataset.getTitles(i11)[i12];
            }
            float startAngle = doughnutChart.mRenderer.getStartAngle();
            int i13 = doughnutChart.mCenterX;
            int i14 = doughnutChart.mCenterY;
            RectF rectF = new RectF(i13 - i10, i14 - i10, i13 + i10, i14 + i10);
            float f5 = startAngle;
            int i15 = 0;
            while (i15 < itemCount) {
                paint3.setColor(doughnutChart.mRenderer.getSeriesRendererAt(i15).getColor());
                double d6 = (float) doughnutChart.mDataset.getValues(i11)[i15];
                Double.isNaN(d6);
                float f6 = (float) ((d6 / d5) * 360.0d);
                int i16 = i15;
                canvas.drawArc(rectF, f5, f6, true, paint);
                String str = doughnutChart.mDataset.getTitles(i11)[i16];
                DefaultRenderer defaultRenderer = doughnutChart.mRenderer;
                drawLabel(canvas, str, defaultRenderer, arrayList, doughnutChart.mCenterX, doughnutChart.mCenterY, f4, f3, f5, f6, i2, i6, defaultRenderer.getLabelsColor(), paint, true, false);
                f5 += f6;
                i15 = i16 + 1;
                doughnutChart = this;
                paint3 = paint;
                rectF = rectF;
                itemCount = itemCount;
                i11 = i11;
                strArr = strArr;
                categoriesCount = categoriesCount;
                d4 = d4;
                i10 = i10;
            }
            int i17 = i11;
            double d7 = d4;
            String[] strArr3 = strArr;
            int i18 = categoriesCount;
            double d8 = i10;
            Double.isNaN(d7);
            double d9 = d7 * d3;
            Double.isNaN(d8);
            int i19 = (int) (d8 - d9);
            double d10 = f4;
            Double.isNaN(d10);
            f4 = (float) (d10 - (d9 - 2.0d));
            if (this.mRenderer.getBackgroundColor() != 0) {
                paint2 = paint;
                paint2.setColor(this.mRenderer.getBackgroundColor());
            } else {
                paint2 = paint;
                paint2.setColor(-1);
            }
            paint2.setStyle(Paint.Style.FILL);
            int i20 = this.mCenterX;
            int i21 = this.mCenterY;
            canvas.drawArc(new RectF(i20 - i19, i21 - i19, i20 + i19, i21 + i19), 0.0f, 360.0f, true, paint);
            i10 = i19 - 1;
            i11 = i17 + 1;
            doughnutChart = this;
            paint3 = paint2;
            strArr = strArr3;
            categoriesCount = i18;
            d4 = d7;
        }
        arrayList.clear();
        drawLegend(canvas, doughnutChart.mRenderer, strArr, i2, i6, i3, i4, i5, iDrawLegend, paint, false);
        drawTitle(canvas, i2, i3, i4, paint);
    }

    @Override // org.achartengine.chart.RoundChart, org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f2, float f3, int i2, Paint paint) {
        int i3 = this.mStep - 1;
        this.mStep = i3;
        canvas.drawCircle((f2 + 10.0f) - i3, f3, i3, paint);
    }

    @Override // org.achartengine.chart.RoundChart, org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i2) {
        return 10;
    }
}
