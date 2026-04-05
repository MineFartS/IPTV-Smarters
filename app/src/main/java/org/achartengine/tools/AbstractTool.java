package org.achartengine.tools;

import org.achartengine.chart.AbstractChart;
import org.achartengine.chart.XYChart;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractTool {
    public AbstractChart mChart;
    public XYMultipleSeriesRenderer mRenderer;

    public AbstractTool(AbstractChart abstractChart) {
        this.mChart = abstractChart;
        if (abstractChart instanceof XYChart) {
            this.mRenderer = ((XYChart) abstractChart).getRenderer();
        }
    }

    public void checkRange(double[] dArr, int i2) {
        double[] calcRange;
        AbstractChart abstractChart = this.mChart;
        if (!(abstractChart instanceof XYChart) || (calcRange = ((XYChart) abstractChart).getCalcRange(i2)) == null) {
            return;
        }
        if (!this.mRenderer.isMinXSet(i2)) {
            dArr[0] = calcRange[0];
            this.mRenderer.setXAxisMin(dArr[0], i2);
        }
        if (!this.mRenderer.isMaxXSet(i2)) {
            dArr[1] = calcRange[1];
            this.mRenderer.setXAxisMax(dArr[1], i2);
        }
        if (!this.mRenderer.isMinYSet(i2)) {
            dArr[2] = calcRange[2];
            this.mRenderer.setYAxisMin(dArr[2], i2);
        }
        if (this.mRenderer.isMaxYSet(i2)) {
            return;
        }
        dArr[3] = calcRange[3];
        this.mRenderer.setYAxisMax(dArr[3], i2);
    }

    public double[] getRange(int i2) {
        return new double[]{this.mRenderer.getXAxisMin(i2), this.mRenderer.getXAxisMax(i2), this.mRenderer.getYAxisMin(i2), this.mRenderer.getYAxisMax(i2)};
    }

    public void setXRange(double d2, double d3, int i2) {
        this.mRenderer.setXAxisMin(d2, i2);
        this.mRenderer.setXAxisMax(d3, i2);
    }

    public void setYRange(double d2, double d3, int i2) {
        this.mRenderer.setYAxisMin(d2, i2);
        this.mRenderer.setYAxisMax(d3, i2);
    }
}
