package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.Serializable;
import java.util.List;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class CombinedXYChart extends XYChart {
    private XYCombinedChartDef[] chartDefinitions;
    private XYChart[] mCharts;
    private Class<?>[] xyChartTypes;

    public static class XYCombinedChartDef implements Serializable {
        private int[] seriesIndex;
        private String type;

        public XYCombinedChartDef(String str, int... iArr) {
            this.type = str;
            this.seriesIndex = iArr;
        }

        public boolean containsSeries(int i2) {
            return getChartSeriesIndex(i2) >= 0;
        }

        public int getChartSeriesIndex(int i2) {
            for (int i3 = 0; i3 < getSeriesIndex().length; i3++) {
                if (this.seriesIndex[i3] == i2) {
                    return i3;
                }
            }
            return -1;
        }

        public int[] getSeriesIndex() {
            return this.seriesIndex;
        }

        public String getType() {
            return this.type;
        }
    }

    public CombinedXYChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, XYCombinedChartDef[] xYCombinedChartDefArr) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.xyChartTypes = new Class[]{TimeChart.class, LineChart.class, CubicLineChart.class, BarChart.class, BubbleChart.class, ScatterChart.class, RangeBarChart.class, RangeStackedBarChart.class};
        this.chartDefinitions = xYCombinedChartDefArr;
        int length = xYCombinedChartDefArr.length;
        this.mCharts = new XYChart[length];
        for (int i2 = 0; i2 < length; i2++) {
            try {
                this.mCharts[i2] = getXYChart(xYCombinedChartDefArr[i2].getType());
            } catch (Exception unused) {
            }
            if (this.mCharts[i2] == null) {
                throw new IllegalArgumentException("Unknown chart type " + xYCombinedChartDefArr[i2].getType());
            }
            XYMultipleSeriesDataset xYMultipleSeriesDataset2 = new XYMultipleSeriesDataset();
            XYMultipleSeriesRenderer xYMultipleSeriesRenderer2 = new XYMultipleSeriesRenderer();
            for (int i3 : xYCombinedChartDefArr[i2].getSeriesIndex()) {
                xYMultipleSeriesDataset2.addSeries(xYMultipleSeriesDataset.getSeriesAt(i3));
                xYMultipleSeriesRenderer2.addSeriesRenderer(xYMultipleSeriesRenderer.getSeriesRendererAt(i3));
            }
            xYMultipleSeriesRenderer2.setBarSpacing(xYMultipleSeriesRenderer.getBarSpacing());
            xYMultipleSeriesRenderer2.setPointSize(xYMultipleSeriesRenderer.getPointSize());
            this.mCharts[i2].setDatasetRenderer(xYMultipleSeriesDataset2, xYMultipleSeriesRenderer2);
        }
    }

    public CombinedXYChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, XYCombinedChartDef[] xYCombinedChartDefArr, XYChart[] xYChartArr) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.xyChartTypes = new Class[]{TimeChart.class, LineChart.class, CubicLineChart.class, BarChart.class, BubbleChart.class, ScatterChart.class, RangeBarChart.class, RangeStackedBarChart.class};
        this.chartDefinitions = xYCombinedChartDefArr;
        this.mCharts = xYChartArr;
    }

    private int getChartSeriesIndex(int i2) {
        int i3 = 0;
        while (true) {
            XYCombinedChartDef[] xYCombinedChartDefArr = this.chartDefinitions;
            if (i3 >= xYCombinedChartDefArr.length) {
                throw new IllegalArgumentException("Unknown series with index " + i2);
            }
            if (xYCombinedChartDefArr[i3].containsSeries(i2)) {
                return this.chartDefinitions[i3].getChartSeriesIndex(i2);
            }
            i3++;
        }
    }

    private XYChart getXYChart(int i2) {
        int i3 = 0;
        while (true) {
            XYCombinedChartDef[] xYCombinedChartDefArr = this.chartDefinitions;
            if (i3 >= xYCombinedChartDefArr.length) {
                throw new IllegalArgumentException("Unknown series with index " + i2);
            }
            if (xYCombinedChartDefArr[i3].containsSeries(i2)) {
                return this.mCharts[i3];
            }
            i3++;
        }
    }

    private XYChart getXYChart(String str) {
        int length = this.xyChartTypes.length;
        XYChart xYChart = null;
        for (int i2 = 0; i2 < length && xYChart == null; i2++) {
            XYChart xYChart2 = (XYChart) this.xyChartTypes[i2].newInstance();
            if (str.equals(xYChart2.getChartType())) {
                xYChart = xYChart2;
            }
        }
        return xYChart;
    }

    @Override // org.achartengine.chart.XYChart
    public ClickableArea[] clickableAreasForPoints(List<Float> list, List<Double> list2, float f2, int i2, int i3) {
        return getXYChart(i2).clickableAreasForPoints(list, list2, f2, getChartSeriesIndex(i2), i3);
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f2, float f3, int i2, Paint paint) {
        getXYChart(i2).drawLegendShape(canvas, simpleSeriesRenderer, f2, f3, getChartSeriesIndex(i2), paint);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f2, int i2, int i3) {
        XYChart xYChart = getXYChart(i2);
        xYChart.setScreenR(getScreenR());
        xYChart.setCalcRange(getCalcRange(this.mDataset.getSeriesAt(i2).getScaleNumber()), 0);
        xYChart.drawSeries(canvas, paint, list, xYSeriesRenderer, f2, getChartSeriesIndex(i2), i3);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(XYSeries xYSeries, Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f2, int i2, XYMultipleSeriesRenderer.Orientation orientation, int i3) {
        XYChart xYChart = getXYChart(i2);
        xYChart.setScreenR(getScreenR());
        xYChart.setCalcRange(getCalcRange(this.mDataset.getSeriesAt(i2).getScaleNumber()), 0);
        xYChart.drawSeries(xYSeries, canvas, paint, list, xYSeriesRenderer, f2, getChartSeriesIndex(i2), orientation, i3);
    }

    @Override // org.achartengine.chart.XYChart
    public String getChartType() {
        return "Combined";
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i2) {
        return getXYChart(i2).getLegendShapeWidth(getChartSeriesIndex(i2));
    }
}
