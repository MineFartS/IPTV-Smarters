package org.achartengine.tools;

import org.achartengine.chart.AbstractChart;
import org.achartengine.chart.RoundChart;
import org.achartengine.chart.XYChart;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class FitZoom extends AbstractTool {
    public FitZoom(AbstractChart abstractChart) {
        super(abstractChart);
    }

    public void apply() {
        AbstractChart abstractChart = this.mChart;
        if (!(abstractChart instanceof XYChart)) {
            DefaultRenderer renderer = ((RoundChart) abstractChart).getRenderer();
            renderer.setScale(renderer.getOriginalScale());
            return;
        }
        if (((XYChart) abstractChart).getDataset() == null) {
            return;
        }
        int scalesCount = this.mRenderer.getScalesCount();
        if (this.mRenderer.isInitialRangeSet()) {
            for (int i2 = 0; i2 < scalesCount; i2++) {
                if (this.mRenderer.isInitialRangeSet(i2)) {
                    XYMultipleSeriesRenderer xYMultipleSeriesRenderer = this.mRenderer;
                    xYMultipleSeriesRenderer.setRange(xYMultipleSeriesRenderer.getInitialRange(i2), i2);
                }
            }
            return;
        }
        XYSeries[] series = ((XYChart) this.mChart).getDataset().getSeries();
        int length = series.length;
        if (length > 0) {
            for (int i3 = 0; i3 < scalesCount; i3++) {
                double[] dArr = {Double.MAX_VALUE, -1.7976931348623157E308d, Double.MAX_VALUE, -1.7976931348623157E308d};
                for (int i4 = 0; i4 < length; i4++) {
                    if (i3 == series[i4].getScaleNumber()) {
                        dArr[0] = Math.min(dArr[0], series[i4].getMinX());
                        dArr[1] = Math.max(dArr[1], series[i4].getMaxX());
                        dArr[2] = Math.min(dArr[2], series[i4].getMinY());
                        dArr[3] = Math.max(dArr[3], series[i4].getMaxY());
                    }
                }
                double dAbs = Math.abs(dArr[1] - dArr[0]) / 40.0d;
                double dAbs2 = Math.abs(dArr[3] - dArr[2]) / 40.0d;
                this.mRenderer.setRange(new double[]{dArr[0] - dAbs, dArr[1] + dAbs, dArr[2] - dAbs2, dArr[3] + dAbs2}, i3);
            }
        }
    }
}
