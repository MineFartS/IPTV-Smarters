package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class TimeChart extends LineChart {
    public static final long DAY = 86400000;
    public static final String TYPE = "Time";
    private String mDateFormat;
    private Double mStartPoint;

    public TimeChart() {
    }

    public TimeChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
    }

    private DateFormat getDateFormat(double d2, double d3) {
        if (this.mDateFormat != null) {
            try {
                return new SimpleDateFormat(this.mDateFormat);
            } catch (Exception unused) {
            }
        }
        double d4 = d3 - d2;
        return (d4 <= 8.64E7d || d4 >= 4.32E8d) ? d4 < 8.64E7d ? SimpleDateFormat.getTimeInstance(2) : SimpleDateFormat.getDateInstance(2) : SimpleDateFormat.getDateTimeInstance(3, 3);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawXLabels(List<Double> list, Double[] dArr, Canvas canvas, Paint paint, int i2, int i3, int i4, double d2, double d3, double d4) {
        int i5;
        int size = list.size();
        if (size > 0) {
            boolean zIsShowXLabels = this.mRenderer.isShowXLabels();
            boolean zIsShowGridY = this.mRenderer.isShowGridY();
            if (zIsShowGridY) {
                this.mGridPaint.setStyle(Paint.Style.STROKE);
                this.mGridPaint.setStrokeWidth(this.mRenderer.getGridLineWidth());
            }
            boolean zIsShowTickMarks = this.mRenderer.isShowTickMarks();
            DateFormat dateFormat = getDateFormat(list.get(0).doubleValue(), list.get(size - 1).doubleValue());
            int i6 = 0;
            while (i6 < size) {
                long jRound = Math.round(list.get(i6).doubleValue());
                double d5 = i2;
                double d6 = jRound;
                Double.isNaN(d6);
                Double.isNaN(d5);
                float f2 = (float) (d5 + ((d6 - d3) * d2));
                if (zIsShowXLabels) {
                    paint.setColor(this.mRenderer.getXLabelsColor());
                    if (zIsShowTickMarks) {
                        float f3 = i4;
                        canvas.drawLine(f2, f3, f2, f3 + (this.mRenderer.getLabelsTextSize() / 3.0f), paint);
                    }
                    i5 = i6;
                    drawText(canvas, dateFormat.format(new Date(jRound)), f2, i4 + ((this.mRenderer.getLabelsTextSize() * 4.0f) / 3.0f) + this.mRenderer.getXLabelsPadding(), paint, this.mRenderer.getXLabelsAngle());
                } else {
                    i5 = i6;
                }
                if (zIsShowGridY) {
                    this.mGridPaint.setColor(this.mRenderer.getGridColor(0));
                    canvas.drawLine(f2, i4, f2, i3, this.mGridPaint);
                }
                i6 = i5 + 1;
            }
        }
        drawXTextLabels(dArr, canvas, paint, true, i2, i3, i4, d2, d3, d4);
    }

    @Override // org.achartengine.chart.LineChart, org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    public String getDateFormat() {
        return this.mDateFormat;
    }

    @Override // org.achartengine.chart.XYChart
    public List<Double> getXLabels(double d2, double d3, int i2) {
        int i3 = i2;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        if (this.mRenderer.isXRoundedLabels()) {
            double d4 = 8.64E7d;
            if (this.mStartPoint == null) {
                double timezoneOffset = new Date(Math.round(d2)).getTimezoneOffset() * 60 * 1000;
                Double.isNaN(timezoneOffset);
                this.mStartPoint = Double.valueOf((d2 - (d2 % 8.64E7d)) + 8.64E7d + timezoneOffset);
            }
            if (i3 > 25) {
                i3 = 25;
            }
            double d5 = i3;
            Double.isNaN(d5);
            double d6 = (d3 - d2) / d5;
            if (d6 <= 0.0d) {
                return arrayList;
            }
            if (d6 <= 8.64E7d) {
                while (true) {
                    double d7 = d4 / 2.0d;
                    if (d6 >= d7) {
                        break;
                    }
                    d4 = d7;
                }
            } else {
                while (d6 > d4) {
                    d4 *= 2.0d;
                }
            }
            double dDoubleValue = this.mStartPoint.doubleValue() - (Math.floor((this.mStartPoint.doubleValue() - d2) / d4) * d4);
            while (dDoubleValue < d3) {
                int i5 = i4 + 1;
                if (i4 > i3) {
                    break;
                }
                arrayList.add(Double.valueOf(dDoubleValue));
                dDoubleValue += d4;
                i4 = i5;
            }
            return arrayList;
        }
        if (this.mDataset.getSeriesCount() <= 0) {
            return super.getXLabels(d2, d3, i2);
        }
        XYSeries seriesAt = this.mDataset.getSeriesAt(0);
        int itemCount = seriesAt.getItemCount();
        int i6 = -1;
        int i7 = 0;
        for (int i8 = 0; i8 < itemCount; i8++) {
            double x = seriesAt.getX(i8);
            if (d2 <= x && x <= d3) {
                i7++;
                if (i6 < 0) {
                    i6 = i8;
                }
            }
        }
        if (i7 < i3) {
            for (int i9 = i6; i9 < i6 + i7; i9++) {
                arrayList.add(Double.valueOf(seriesAt.getX(i9)));
            }
        } else {
            float f2 = i7 / i3;
            int i10 = 0;
            while (i4 < itemCount && i10 < i3) {
                double x2 = seriesAt.getX(Math.round(i4 * f2));
                if (d2 <= x2 && x2 <= d3) {
                    arrayList.add(Double.valueOf(x2));
                    i10++;
                }
                i4++;
            }
        }
        return arrayList;
    }

    public void setDateFormat(String str) {
        this.mDateFormat = str;
    }
}
