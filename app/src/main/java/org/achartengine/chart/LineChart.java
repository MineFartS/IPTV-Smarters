package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class LineChart extends XYChart {
    private static final int SHAPE_WIDTH = 30;
    public static final String TYPE = "Line";
    private ScatterChart pointsChart;

    /* JADX INFO: renamed from: org.achartengine.chart.LineChart$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$achartengine$renderer$XYSeriesRenderer$FillOutsideLine$Type;

        static {
            int[] iArr = new int[XYSeriesRenderer.FillOutsideLine.Type.values().length];
            $SwitchMap$org$achartengine$renderer$XYSeriesRenderer$FillOutsideLine$Type = iArr;
            try {
                iArr[XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$achartengine$renderer$XYSeriesRenderer$FillOutsideLine$Type[XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_BELOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$achartengine$renderer$XYSeriesRenderer$FillOutsideLine$Type[XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_ABOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$achartengine$renderer$XYSeriesRenderer$FillOutsideLine$Type[XYSeriesRenderer.FillOutsideLine.Type.BELOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$achartengine$renderer$XYSeriesRenderer$FillOutsideLine$Type[XYSeriesRenderer.FillOutsideLine.Type.ABOVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public LineChart() {
    }

    public LineChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.pointsChart = new ScatterChart(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
    }

    @Override // org.achartengine.chart.XYChart
    public ClickableArea[] clickableAreasForPoints(List<Float> list, List<Double> list2, float f2, int i2, int i3) {
        int size = list.size();
        ClickableArea[] clickableAreaArr = new ClickableArea[size / 2];
        for (int i4 = 0; i4 < size; i4 += 2) {
            float selectableBuffer = this.mRenderer.getSelectableBuffer();
            int i5 = i4 + 1;
            clickableAreaArr[i4 / 2] = new ClickableArea(new RectF(list.get(i4).floatValue() - selectableBuffer, list.get(i5).floatValue() - selectableBuffer, list.get(i4).floatValue() + selectableBuffer, list.get(i5).floatValue() + selectableBuffer), list2.get(i4).doubleValue(), list2.get(i5).doubleValue());
        }
        return clickableAreaArr;
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f2, float f3, int i2, Paint paint) {
        float strokeWidth = paint.getStrokeWidth();
        paint.setStrokeWidth(((XYSeriesRenderer) simpleSeriesRenderer).getLineWidth());
        canvas.drawLine(f2, f3, f2 + 30.0f, f3, paint);
        paint.setStrokeWidth(strokeWidth);
        if (isRenderPoints(simpleSeriesRenderer)) {
            this.pointsChart.drawLegendShape(canvas, simpleSeriesRenderer, f2 + 5.0f, f3, i2, paint);
        }
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f2, int i2, int i3) {
        XYSeriesRenderer.FillOutsideLine[] fillOutsideLineArr;
        float height;
        boolean z;
        XYSeriesRenderer.FillOutsideLine[] fillOutsideLineArr2;
        boolean z2;
        float strokeWidth = paint.getStrokeWidth();
        paint.setStrokeWidth(xYSeriesRenderer.getLineWidth());
        XYSeriesRenderer.FillOutsideLine[] fillOutsideLine = xYSeriesRenderer.getFillOutsideLine();
        int length = fillOutsideLine.length;
        char c2 = 0;
        int i4 = 0;
        while (i4 < length) {
            XYSeriesRenderer.FillOutsideLine fillOutsideLine2 = fillOutsideLine[i4];
            if (fillOutsideLine2.getType() != XYSeriesRenderer.FillOutsideLine.Type.NONE) {
                paint.setColor(fillOutsideLine2.getColor());
                List<Float> arrayList = new ArrayList<>();
                int[] fillRange = fillOutsideLine2.getFillRange();
                if (fillRange == null) {
                    arrayList.addAll(list);
                } else if (list.size() > fillRange[c2] * 2 && list.size() > fillRange[1] * 2) {
                    arrayList.addAll(list.subList(fillRange[c2] * 2, fillRange[1] * 2));
                }
                int i5 = AnonymousClass1.$SwitchMap$org$achartengine$renderer$XYSeriesRenderer$FillOutsideLine$Type[fillOutsideLine2.getType().ordinal()];
                if (i5 == 1 || i5 == 2 || i5 == 3) {
                    height = f2;
                } else if (i5 == 4) {
                    height = canvas.getHeight();
                } else {
                    if (i5 != 5) {
                        throw new RuntimeException("You have added a new type of filling but have not implemented.");
                    }
                    height = 0.0f;
                }
                XYSeriesRenderer.FillOutsideLine.Type type = fillOutsideLine2.getType();
                XYSeriesRenderer.FillOutsideLine.Type type2 = XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_ABOVE;
                if (type == type2 || fillOutsideLine2.getType() == XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_BELOW) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    if ((size <= 0 || fillOutsideLine2.getType() != type2 || arrayList.get(1).floatValue() >= height) && (fillOutsideLine2.getType() != XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_BELOW || arrayList.get(1).floatValue() <= height)) {
                        z = false;
                    } else {
                        arrayList2.add(arrayList.get(0));
                        arrayList2.add(arrayList.get(1));
                        z = true;
                    }
                    int i6 = 3;
                    while (i6 < size) {
                        float fFloatValue = arrayList.get(i6 - 2).floatValue();
                        float fFloatValue2 = arrayList.get(i6).floatValue();
                        if ((fFloatValue >= height || fFloatValue2 <= height) && (fFloatValue <= height || fFloatValue2 >= height)) {
                            fillOutsideLineArr2 = fillOutsideLine;
                            if (z || ((fillOutsideLine2.getType() == XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_ABOVE && fFloatValue2 < height) || (fillOutsideLine2.getType() == XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_BELOW && fFloatValue2 > height))) {
                                arrayList2.add(arrayList.get(i6 - 1));
                                arrayList2.add(Float.valueOf(fFloatValue2));
                            }
                        } else {
                            float fFloatValue3 = arrayList.get(i6 - 3).floatValue();
                            fillOutsideLineArr2 = fillOutsideLine;
                            float fFloatValue4 = arrayList.get(i6 - 1).floatValue();
                            arrayList2.add(Float.valueOf(fFloatValue3 + (((fFloatValue4 - fFloatValue3) * (height - fFloatValue)) / (fFloatValue2 - fFloatValue))));
                            arrayList2.add(Float.valueOf(height));
                            if ((fillOutsideLine2.getType() != XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_ABOVE || fFloatValue2 <= height) && (fillOutsideLine2.getType() != XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_BELOW || fFloatValue2 >= height)) {
                                arrayList2.add(Float.valueOf(fFloatValue4));
                                arrayList2.add(Float.valueOf(fFloatValue2));
                                z2 = true;
                            } else {
                                i6 += 2;
                                z2 = false;
                            }
                            z = z2;
                        }
                        i6 += 2;
                        fillOutsideLine = fillOutsideLineArr2;
                    }
                    fillOutsideLineArr = fillOutsideLine;
                    arrayList.clear();
                    arrayList.addAll(arrayList2);
                } else {
                    fillOutsideLineArr = fillOutsideLine;
                }
                int size2 = arrayList.size();
                if (size2 > 0) {
                    arrayList.set(0, Float.valueOf(arrayList.get(0).floatValue() + 1.0f));
                    arrayList.add(arrayList.get(size2 - 2));
                    arrayList.add(Float.valueOf(height));
                    arrayList.add(arrayList.get(0));
                    arrayList.add(arrayList.get(size2 + 1));
                    for (int i7 = 0; i7 < size2 + 4; i7 += 2) {
                        int i8 = i7 + 1;
                        if (arrayList.get(i8).floatValue() < 0.0f) {
                            arrayList.set(i8, Float.valueOf(0.0f));
                        }
                    }
                    paint.setStyle(Paint.Style.FILL);
                    drawPath(canvas, arrayList, paint, true);
                }
            } else {
                fillOutsideLineArr = fillOutsideLine;
            }
            i4++;
            fillOutsideLine = fillOutsideLineArr;
            c2 = 0;
        }
        paint.setColor(xYSeriesRenderer.getColor());
        paint.setStyle(Paint.Style.STROKE);
        drawPath(canvas, list, paint, false);
        paint.setStrokeWidth(strokeWidth);
    }

    @Override // org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i2) {
        return 30;
    }

    @Override // org.achartengine.chart.XYChart
    public ScatterChart getPointsChart() {
        return this.pointsChart;
    }

    @Override // org.achartengine.chart.XYChart
    public boolean isRenderPoints(SimpleSeriesRenderer simpleSeriesRenderer) {
        return ((XYSeriesRenderer) simpleSeriesRenderer).getPointStyle() != PointStyle.POINT;
    }

    @Override // org.achartengine.chart.XYChart
    public void setDatasetRenderer(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super.setDatasetRenderer(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.pointsChart = new ScatterChart(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
    }
}
