package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.model.Point;
import org.achartengine.model.SeriesSelection;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractChart implements Serializable {
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054 A[PHI: r6
  0x0054: PHI (r6v4 float) = (r6v1 float), (r6v5 float) binds: [B:33:0x0073, B:24:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 float) = (r3v0 float), (r3v5 float) binds: [B:14:0x0036, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[PHI: r1 r3 r4
  0x001e: PHI (r1v6 float) = (r1v4 float), (r1v13 float) binds: [B:17:0x003c, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x001e: PHI (r3v1 float) = (r3v0 float), (r3v5 float) binds: [B:17:0x003c, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x001e: PHI (r4v2 float) = (r4v1 float), (r4v4 float) binds: [B:17:0x003c, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static float[] calculateDrawPoints(float r6, float r7, float r8, float r9, int r10, int r11) {
        /*
            float r10 = (float) r10
            r0 = 0
            int r1 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r1 <= 0) goto L26
            float r1 = r9 - r7
            float r2 = r8 - r6
            float r1 = r1 / r2
            float r2 = r10 - r7
            float r3 = r1 * r6
            float r2 = r2 + r3
            float r2 = r2 / r1
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L19
        L15:
            float r1 = r7 - r3
            r2 = 0
            goto L43
        L19:
            float r4 = (float) r11
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 <= 0) goto L24
        L1e:
            float r1 = r1 * r4
            float r1 = r1 + r7
            float r1 = r1 - r3
            r2 = r4
            goto L43
        L24:
            r1 = r10
            goto L43
        L26:
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 >= 0) goto L41
            float r1 = r9 - r7
            float r2 = r8 - r6
            float r1 = r1 / r2
            float r2 = -r7
            float r3 = r1 * r6
            float r2 = r2 + r3
            float r2 = r2 / r1
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L39
            goto L15
        L39:
            float r4 = (float) r11
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 <= 0) goto L3f
            goto L1e
        L3f:
            r1 = 0
            goto L43
        L41:
            r2 = r6
            r1 = r7
        L43:
            int r3 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r3 <= 0) goto L65
            float r9 = r9 - r7
            float r8 = r8 - r6
            float r9 = r9 / r8
            float r8 = r10 - r7
            float r6 = r6 * r9
            float r8 = r8 + r6
            float r8 = r8 / r9
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 >= 0) goto L58
        L54:
            float r7 = r7 - r6
            r9 = r7
            r8 = 0
            goto L82
        L58:
            float r11 = (float) r11
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r0 <= 0) goto L63
            float r9 = r9 * r11
            float r9 = r9 + r7
            float r9 = r9 - r6
            r8 = r11
            goto L82
        L63:
            r9 = r10
            goto L82
        L65:
            int r10 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r10 >= 0) goto L82
            float r9 = r9 - r7
            float r8 = r8 - r6
            float r9 = r9 / r8
            float r8 = -r7
            float r6 = r6 * r9
            float r8 = r8 + r6
            float r8 = r8 / r9
            int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r10 >= 0) goto L76
            goto L54
        L76:
            float r10 = (float) r11
            int r11 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r11 <= 0) goto L81
            float r9 = r9 * r10
            float r9 = r9 + r7
            float r9 = r9 - r6
            r8 = r10
            goto L82
        L81:
            r9 = 0
        L82:
            r6 = 4
            float[] r6 = new float[r6]
            r7 = 0
            r6[r7] = r2
            r7 = 1
            r6[r7] = r1
            r7 = 2
            r6[r7] = r8
            r7 = 3
            r6[r7] = r9
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.achartengine.chart.AbstractChart.calculateDrawPoints(float, float, float, float, int, int):float[]");
    }

    private String getFitText(String str, float f2, Paint paint) {
        int length = str.length();
        String str2 = str;
        int i2 = 0;
        while (paint.measureText(str2) > f2 && i2 < length) {
            i2++;
            str2 = str.substring(0, length - i2) + "...";
        }
        return i2 == length ? "..." : str2;
    }

    public abstract void draw(Canvas canvas, int i2, int i3, int i4, int i5, Paint paint);

    public void drawBackground(DefaultRenderer defaultRenderer, Canvas canvas, int i2, int i3, int i4, int i5, Paint paint, boolean z, int i6) {
        if (defaultRenderer.isApplyBackgroundColor() || z) {
            if (z) {
                paint.setColor(i6);
            } else {
                paint.setColor(defaultRenderer.getBackgroundColor());
            }
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(i2, i3, i2 + i4, i3 + i5, paint);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void drawLabel(android.graphics.Canvas r18, java.lang.String r19, org.achartengine.renderer.DefaultRenderer r20, java.util.List<android.graphics.RectF> r21, int r22, int r23, float r24, float r25, float r26, float r27, int r28, int r29, int r30, android.graphics.Paint r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.achartengine.chart.AbstractChart.drawLabel(android.graphics.Canvas, java.lang.String, org.achartengine.renderer.DefaultRenderer, java.util.List, int, int, float, float, float, float, int, int, int, android.graphics.Paint, boolean, boolean):void");
    }

    public int drawLegend(Canvas canvas, DefaultRenderer defaultRenderer, String[] strArr, int i2, int i3, int i4, int i5, int i6, int i7, Paint paint, boolean z) {
        int i8;
        int i9;
        float legendTextSize;
        float f2;
        String str;
        String[] strArr2 = strArr;
        float f3 = 32.0f;
        if (defaultRenderer.isShowLegend()) {
            float f4 = i2;
            float legendTextSize2 = ((i4 + i6) - i7) + 32.0f;
            paint.setTextAlign(Paint.Align.LEFT);
            paint.setTextSize(defaultRenderer.getLegendTextSize());
            int iMin = Math.min(strArr2.length, defaultRenderer.getSeriesRendererCount());
            float f5 = f4;
            int i10 = 0;
            while (i10 < iMin) {
                SimpleSeriesRenderer seriesRendererAt = defaultRenderer.getSeriesRendererAt(i10);
                float legendShapeWidth = getLegendShapeWidth(i10);
                if (seriesRendererAt.isShowLegendItem()) {
                    String str2 = strArr2[i10];
                    paint.setColor(strArr2.length == defaultRenderer.getSeriesRendererCount() ? seriesRendererAt.getColor() : DefaultRenderer.TEXT_COLOR);
                    int length = str2.length();
                    float[] fArr = new float[length];
                    paint.getTextWidths(str2, fArr);
                    float f6 = 0.0f;
                    i9 = iMin;
                    for (int i11 = 0; i11 < length; i11++) {
                        f6 += fArr[i11];
                    }
                    float f7 = legendShapeWidth + 10.0f + f6;
                    float f8 = f5 + f7;
                    if (i10 <= 0 || !getExceed(f8, defaultRenderer, i3, i5)) {
                        legendTextSize = f3;
                        f2 = f5;
                    } else {
                        legendTextSize2 += defaultRenderer.getLegendTextSize();
                        f8 = f4 + f7;
                        legendTextSize = f3 + defaultRenderer.getLegendTextSize();
                        f2 = f4;
                    }
                    float f9 = f8;
                    float f10 = legendTextSize2;
                    if (getExceed(f9, defaultRenderer, i3, i5)) {
                        float f11 = ((i3 - f2) - legendShapeWidth) - 10.0f;
                        if (isVertical(defaultRenderer)) {
                            f11 = ((i5 - f2) - legendShapeWidth) - 10.0f;
                        }
                        str = str2.substring(0, paint.breakText(str2, true, f11, fArr)) + "...";
                    } else {
                        str = str2;
                    }
                    if (z) {
                        i8 = i10;
                    } else {
                        i8 = i10;
                        drawLegendShape(canvas, seriesRendererAt, f2, f10, i10, paint);
                        drawString(canvas, str, f2 + legendShapeWidth + 5.0f, f10 + 5.0f, paint);
                    }
                    f5 = f2 + f7;
                    legendTextSize2 = f10;
                    f3 = legendTextSize;
                } else {
                    i8 = i10;
                    i9 = iMin;
                }
                i10 = i8 + 1;
                strArr2 = strArr;
                iMin = i9;
            }
        }
        return Math.round(f3 + defaultRenderer.getLegendTextSize());
    }

    public abstract void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f2, float f3, int i2, Paint paint);

    public void drawPath(Canvas canvas, List<Float> list, Paint paint, boolean z) {
        Path path = new Path();
        int height = canvas.getHeight();
        int width = canvas.getWidth();
        if (list.size() < 4) {
            return;
        }
        float[] fArrCalculateDrawPoints = calculateDrawPoints(list.get(0).floatValue(), list.get(1).floatValue(), list.get(2).floatValue(), list.get(3).floatValue(), height, width);
        path.moveTo(fArrCalculateDrawPoints[0], fArrCalculateDrawPoints[1]);
        path.lineTo(fArrCalculateDrawPoints[2], fArrCalculateDrawPoints[3]);
        int size = list.size();
        for (int i2 = 4; i2 < size; i2 += 2) {
            int i3 = i2 - 1;
            if (list.get(i3).floatValue() >= 0.0f || list.get(i2 + 1).floatValue() >= 0.0f) {
                float f2 = height;
                if (list.get(i3).floatValue() <= f2 || list.get(i2 + 1).floatValue() <= f2) {
                    float[] fArrCalculateDrawPoints2 = calculateDrawPoints(list.get(i2 - 2).floatValue(), list.get(i3).floatValue(), list.get(i2).floatValue(), list.get(i2 + 1).floatValue(), height, width);
                    if (!z) {
                        path.moveTo(fArrCalculateDrawPoints2[0], fArrCalculateDrawPoints2[1]);
                    }
                    path.lineTo(fArrCalculateDrawPoints2[2], fArrCalculateDrawPoints2[3]);
                }
            }
        }
        if (z) {
            path.lineTo(list.get(0).floatValue(), list.get(1).floatValue());
        }
        canvas.drawPath(path, paint);
    }

    public void drawPath(Canvas canvas, float[] fArr, Paint paint, boolean z) {
        Path path = new Path();
        int height = canvas.getHeight();
        int width = canvas.getWidth();
        if (fArr.length < 4) {
            return;
        }
        float[] fArrCalculateDrawPoints = calculateDrawPoints(fArr[0], fArr[1], fArr[2], fArr[3], height, width);
        path.moveTo(fArrCalculateDrawPoints[0], fArrCalculateDrawPoints[1]);
        path.lineTo(fArrCalculateDrawPoints[2], fArrCalculateDrawPoints[3]);
        int length = fArr.length;
        for (int i2 = 4; i2 < length; i2 += 2) {
            int i3 = i2 - 1;
            if (fArr[i3] >= 0.0f || fArr[i2 + 1] >= 0.0f) {
                float f2 = height;
                if (fArr[i3] <= f2 || fArr[i2 + 1] <= f2) {
                    float[] fArrCalculateDrawPoints2 = calculateDrawPoints(fArr[i2 - 2], fArr[i3], fArr[i2], fArr[i2 + 1], height, width);
                    if (!z) {
                        path.moveTo(fArrCalculateDrawPoints2[0], fArrCalculateDrawPoints2[1]);
                    }
                    path.lineTo(fArrCalculateDrawPoints2[2], fArrCalculateDrawPoints2[3]);
                }
            }
        }
        if (z) {
            path.lineTo(fArr[0], fArr[1]);
        }
        canvas.drawPath(path, paint);
    }

    public void drawString(Canvas canvas, String str, float f2, float f3, Paint paint) {
        if (str != null) {
            String[] strArrSplit = str.split("\n");
            Rect rect = new Rect();
            int iHeight = 0;
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                canvas.drawText(strArrSplit[i2], f2, iHeight + f3, paint);
                paint.getTextBounds(strArrSplit[i2], 0, strArrSplit[i2].length(), rect);
                iHeight = iHeight + rect.height() + 5;
            }
        }
    }

    public boolean getExceed(float f2, DefaultRenderer defaultRenderer, int i2, int i3) {
        boolean z = f2 > ((float) i2);
        if (isVertical(defaultRenderer)) {
            return f2 > ((float) i3);
        }
        return z;
    }

    public String getLabel(NumberFormat numberFormat, double d2) {
        StringBuilder sb;
        if (numberFormat != null) {
            return numberFormat.format(d2);
        }
        if (d2 == Math.round(d2)) {
            sb = new StringBuilder();
            sb.append(Math.round(d2));
        } else {
            sb = new StringBuilder();
            sb.append(d2);
        }
        sb.append(BuildConfig.FLAVOR);
        return sb.toString();
    }

    public abstract int getLegendShapeWidth(int i2);

    public int getLegendSize(DefaultRenderer defaultRenderer, int i2, float f2) {
        int legendHeight = defaultRenderer.getLegendHeight();
        if (!defaultRenderer.isShowLegend() || legendHeight != 0) {
            i2 = legendHeight;
        }
        return (defaultRenderer.isShowLegend() || !defaultRenderer.isShowXLabels()) ? i2 : (int) (((defaultRenderer.getLabelsTextSize() * 4.0f) / 3.0f) + f2);
    }

    public SeriesSelection getSeriesAndPointForScreenCoordinate(Point point) {
        return null;
    }

    public boolean isNullValue(double d2) {
        return Double.isNaN(d2) || Double.isInfinite(d2) || d2 == Double.MAX_VALUE;
    }

    public boolean isVertical(DefaultRenderer defaultRenderer) {
        return (defaultRenderer instanceof XYMultipleSeriesRenderer) && ((XYMultipleSeriesRenderer) defaultRenderer).getOrientation() == XYMultipleSeriesRenderer.Orientation.VERTICAL;
    }
}
