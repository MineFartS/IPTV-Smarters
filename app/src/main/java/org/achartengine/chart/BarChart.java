package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import java.util.List;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class BarChart extends XYChart {
    private static final int SHAPE_WIDTH = 12;
    public static final String TYPE = "Bar";
    private List<Float> mPreviousSeriesPoints;
    public Type mType;

    public enum Type {
        DEFAULT,
        STACKED,
        HEAPED
    }

    public BarChart() {
        this.mType = Type.DEFAULT;
    }

    public BarChart(Type type) {
        this.mType = Type.DEFAULT;
        this.mType = type;
    }

    public BarChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, Type type) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.mType = Type.DEFAULT;
        this.mType = type;
    }

    @Override // org.achartengine.chart.XYChart
    public ClickableArea[] clickableAreasForPoints(List<Float> list, List<Double> list2, float f2, int i2, int i3) {
        int seriesCount = this.mDataset.getSeriesCount();
        int size = list.size();
        ClickableArea[] clickableAreaArr = new ClickableArea[size / 2];
        float halfDiffX = getHalfDiffX(list, size, seriesCount);
        for (int i4 = 0; i4 < size; i4 += 2) {
            float fFloatValue = list.get(i4).floatValue();
            int i5 = i4 + 1;
            float fFloatValue2 = list.get(i5).floatValue();
            Type type = this.mType;
            if (type == Type.STACKED || type == Type.HEAPED) {
                clickableAreaArr[i4 / 2] = new ClickableArea(new RectF(fFloatValue - halfDiffX, Math.min(fFloatValue2, f2), fFloatValue + halfDiffX, Math.max(fFloatValue2, f2)), list2.get(i4).doubleValue(), list2.get(i5).doubleValue());
            } else {
                float f3 = (fFloatValue - (seriesCount * halfDiffX)) + (i2 * 2 * halfDiffX);
                clickableAreaArr[i4 / 2] = new ClickableArea(new RectF(f3, Math.min(fFloatValue2, f2), (2.0f * halfDiffX) + f3, Math.max(fFloatValue2, f2)), list2.get(i4).doubleValue(), list2.get(i5).doubleValue());
            }
        }
        return clickableAreaArr;
    }

    public void drawBar(Canvas canvas, float f2, float f3, float f4, float f5, float f6, int i2, int i3, Paint paint) {
        float f7;
        float f8;
        int scaleNumber = this.mDataset.getSeriesAt(i3).getScaleNumber();
        Type type = this.mType;
        if (type == Type.STACKED || type == Type.HEAPED) {
            f7 = f2 - f6;
            f8 = f4 + f6;
        } else {
            f7 = (f2 - (i2 * f6)) + (i3 * 2 * f6);
            f8 = f7 + (2.0f * f6);
        }
        drawBar(canvas, f7, f5, f8, f3, scaleNumber, i3, paint);
    }

    public void drawBar(Canvas canvas, float f2, float f3, float f4, float f5, int i2, int i3, Paint paint) {
        float f6;
        float f7;
        float f8;
        float f9;
        int gradientPartialColor;
        if (f2 > f4) {
            f7 = f2;
            f6 = f4;
        } else {
            f6 = f2;
            f7 = f4;
        }
        if (f3 > f5) {
            f9 = f3;
            f8 = f5;
        } else {
            f8 = f3;
            f9 = f5;
        }
        SimpleSeriesRenderer seriesRendererAt = this.mRenderer.getSeriesRendererAt(i3);
        if (!seriesRendererAt.isGradientEnabled()) {
            if (Math.abs(f8 - f9) < 1.0f) {
                f9 = f8 < f9 ? f8 + 1.0f : f8 - 1.0f;
            }
            canvas.drawRect(Math.round(f6), Math.round(f8), Math.round(f7), Math.round(f9), paint);
            return;
        }
        float f10 = (float) toScreenPoint(new double[]{0.0d, seriesRendererAt.getGradientStopValue()}, i2)[1];
        float f11 = (float) toScreenPoint(new double[]{0.0d, seriesRendererAt.getGradientStartValue()}, i2)[1];
        float fMax = Math.max(f10, Math.min(f8, f9));
        float fMin = Math.min(f11, Math.max(f8, f9));
        int gradientStopColor = seriesRendererAt.getGradientStopColor();
        int gradientStartColor = seriesRendererAt.getGradientStartColor();
        if (f8 < f10) {
            paint.setColor(gradientStopColor);
            canvas.drawRect(Math.round(f6), Math.round(f8), Math.round(f7), Math.round(fMax), paint);
            gradientPartialColor = gradientStopColor;
        } else {
            gradientPartialColor = getGradientPartialColor(gradientStopColor, gradientStartColor, (f11 - fMax) / (f11 - f10));
        }
        if (f9 > f11) {
            paint.setColor(gradientStartColor);
            canvas.drawRect(Math.round(f6), Math.round(fMin), Math.round(f7), Math.round(f9), paint);
        } else {
            gradientStartColor = getGradientPartialColor(gradientStartColor, gradientStopColor, (fMin - f10) / (f11 - f10));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{gradientStartColor, gradientPartialColor});
        gradientDrawable.setBounds(Math.round(f6), Math.round(fMax), Math.round(f7), Math.round(fMin));
        gradientDrawable.draw(canvas);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawChartValuesText(Canvas canvas, XYSeries xYSeries, XYSeriesRenderer xYSeriesRenderer, Paint paint, List<Float> list, int i2, int i3) {
        String label;
        float fFloatValue;
        float chartValuesSpacing;
        int seriesCount = this.mDataset.getSeriesCount();
        int size = list.size();
        float halfDiffX = getHalfDiffX(list, size, seriesCount);
        for (int i4 = 0; i4 < size; i4 += 2) {
            double y = xYSeries.getY(i3 + (i4 / 2));
            if (!isNullValue(y)) {
                float fFloatValue2 = list.get(i4).floatValue();
                if (this.mType == Type.DEFAULT) {
                    fFloatValue2 += ((i2 * 2) * halfDiffX) - ((seriesCount - 1.5f) * halfDiffX);
                }
                float f2 = fFloatValue2;
                if (y >= 0.0d) {
                    label = getLabel(xYSeriesRenderer.getChartValuesFormat(), y);
                    fFloatValue = list.get(i4 + 1).floatValue();
                    chartValuesSpacing = xYSeriesRenderer.getChartValuesSpacing();
                } else {
                    label = getLabel(xYSeriesRenderer.getChartValuesFormat(), y);
                    fFloatValue = list.get(i4 + 1).floatValue() + xYSeriesRenderer.getChartValuesTextSize() + xYSeriesRenderer.getChartValuesSpacing();
                    chartValuesSpacing = 3.0f;
                }
                drawText(canvas, label, f2, fFloatValue - chartValuesSpacing, paint, 0.0f);
            }
        }
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f2, float f3, int i2, Paint paint) {
        canvas.drawRect(f2, f3 - 6.0f, f2 + 12.0f, f3 + 6.0f, paint);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f2, int i2, int i3) {
        int i4;
        BarChart barChart;
        Canvas canvas2;
        float f3;
        float fFloatValue;
        float f4;
        int i5;
        int i6;
        int seriesCount = this.mDataset.getSeriesCount();
        int size = list.size();
        paint.setColor(xYSeriesRenderer.getColor());
        paint.setStyle(Paint.Style.FILL);
        float halfDiffX = getHalfDiffX(list, size, seriesCount);
        int i7 = 0;
        while (i7 < size) {
            float fFloatValue2 = list.get(i7).floatValue();
            int i8 = i7 + 1;
            float fFloatValue3 = list.get(i8).floatValue();
            if (this.mType != Type.HEAPED || i2 <= 0) {
                i4 = i7;
                barChart = this;
                canvas2 = canvas;
                f3 = fFloatValue2;
                fFloatValue = f2;
                f4 = halfDiffX;
                i5 = seriesCount;
                i6 = i2;
            } else {
                fFloatValue = this.mPreviousSeriesPoints.get(i8).floatValue();
                fFloatValue3 += fFloatValue - f2;
                list.set(i8, Float.valueOf(fFloatValue3));
                barChart = this;
                canvas2 = canvas;
                f3 = fFloatValue2;
                f4 = halfDiffX;
                i5 = seriesCount;
                i6 = i2;
                i4 = i7;
            }
            barChart.drawBar(canvas2, f3, fFloatValue, fFloatValue2, fFloatValue3, f4, i5, i6, paint);
            i7 = i4 + 2;
        }
        paint.setColor(xYSeriesRenderer.getColor());
        this.mPreviousSeriesPoints = list;
    }

    @Override // org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    public float getCoeficient() {
        return 1.0f;
    }

    @Override // org.achartengine.chart.XYChart
    public double getDefaultMinimum() {
        return 0.0d;
    }

    public int getGradientPartialColor(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i2) * f2) + (Color.alpha(i3) * f3)), Math.round((Color.red(i2) * f2) + (Color.red(i3) * f3)), Math.round((Color.green(i2) * f2) + (Color.green(i3) * f3)), Math.round((f2 * Color.blue(i2)) + (f3 * Color.blue(i3))));
    }

    public float getHalfDiffX(List<Float> list, int i2, int i3) {
        float barWidth = this.mRenderer.getBarWidth();
        if (barWidth > 0.0f) {
            return barWidth / 2.0f;
        }
        float fFloatValue = (list.get(i2 - 2).floatValue() - list.get(0).floatValue()) / (i2 > 2 ? i2 - 2 : i2);
        if (fFloatValue == 0.0f) {
            fFloatValue = 10.0f;
        }
        Type type = this.mType;
        if (type != Type.STACKED && type != Type.HEAPED) {
            fFloatValue /= i3;
        }
        double d2 = fFloatValue;
        double coeficient = getCoeficient();
        double barSpacing = this.mRenderer.getBarSpacing() + 1.0d;
        Double.isNaN(coeficient);
        Double.isNaN(d2);
        return (float) (d2 / (coeficient * barSpacing));
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i2) {
        return 12;
    }

    @Override // org.achartengine.chart.XYChart
    public boolean isRenderNullValues() {
        return true;
    }
}
