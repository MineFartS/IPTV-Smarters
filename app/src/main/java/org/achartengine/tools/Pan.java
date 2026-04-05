package org.achartengine.tools;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.achartengine.chart.AbstractChart;
import org.achartengine.chart.RoundChart;
import org.achartengine.chart.XYChart;

/* JADX INFO: loaded from: classes2.dex */
public class Pan extends AbstractTool {
    private boolean limitsReachedX;
    private boolean limitsReachedY;
    private List<PanListener> mPanListeners;

    public Pan(AbstractChart abstractChart) {
        super(abstractChart);
        this.mPanListeners = new ArrayList();
        this.limitsReachedX = false;
        this.limitsReachedY = false;
    }

    private double getAxisRatio(double[] dArr) {
        return Math.abs(dArr[1] - dArr[0]) / Math.abs(dArr[3] - dArr[2]);
    }

    private synchronized void notifyPanListeners() {
        Iterator<PanListener> it = this.mPanListeners.iterator();
        while (it.hasNext()) {
            it.next().panApplied();
        }
    }

    public synchronized void addPanListener(PanListener panListener) {
        this.mPanListeners.add(panListener);
    }

    public void apply(float f2, float f3, float f4, float f5) {
        int i2;
        double[] dArr;
        XYChart xYChart;
        int i3;
        boolean z;
        boolean z2;
        AbstractChart abstractChart = this.mChart;
        if (abstractChart instanceof XYChart) {
            int scalesCount = this.mRenderer.getScalesCount();
            double[] panLimits = this.mRenderer.getPanLimits();
            char c2 = 0;
            boolean z3 = panLimits != null && panLimits.length == 4;
            XYChart xYChart2 = (XYChart) this.mChart;
            boolean z4 = true;
            boolean z5 = true;
            int i4 = 0;
            boolean z6 = true;
            boolean z7 = true;
            while (i4 < scalesCount) {
                double[] range = getRange(i4);
                double[] calcRange = xYChart2.getCalcRange(i4);
                if (this.limitsReachedX && this.limitsReachedY) {
                    if (range[c2] == range[1] && calcRange[c2] == calcRange[1]) {
                        return;
                    }
                    if (range[2] == range[3] && calcRange[2] == calcRange[3]) {
                        return;
                    }
                }
                checkRange(range, i4);
                double[] realPoint = xYChart2.toRealPoint(f2, f3, i4);
                double[] realPoint2 = xYChart2.toRealPoint(f4, f5, i4);
                double d2 = realPoint[c2] - realPoint2[c2];
                double d3 = realPoint[1] - realPoint2[1];
                double axisRatio = getAxisRatio(range);
                if (xYChart2.isVertical(this.mRenderer)) {
                    double d4 = (-d3) * axisRatio;
                    d3 = d2 / axisRatio;
                    d2 = d4;
                }
                if (this.mRenderer.isPanXEnabled()) {
                    if (panLimits != null) {
                        if (z4) {
                            z4 = panLimits[0] <= range[0] + d2;
                        }
                        if (z5) {
                            z5 = panLimits[1] >= range[1] + d2;
                        }
                    }
                    z = z4;
                    z2 = z5;
                    if (!z3 || (z && z2)) {
                        double d5 = range[0] + d2;
                        double d6 = range[1] + d2;
                        i3 = scalesCount;
                        i2 = i4;
                        dArr = range;
                        xYChart = xYChart2;
                        setXRange(d5, d6, i2);
                        this.limitsReachedX = false;
                    } else {
                        this.limitsReachedX = true;
                        i2 = i4;
                        dArr = range;
                        xYChart = xYChart2;
                        i3 = scalesCount;
                    }
                } else {
                    i2 = i4;
                    dArr = range;
                    xYChart = xYChart2;
                    i3 = scalesCount;
                    z = z4;
                    z2 = z5;
                }
                if (this.mRenderer.isPanYEnabled()) {
                    if (panLimits != null) {
                        if (z6) {
                            z6 = panLimits[2] <= dArr[2] + d3;
                        }
                        if (z7) {
                            z7 = panLimits[3] >= dArr[3] + d3;
                        }
                    }
                    if (!z3 || (z6 && z7)) {
                        setYRange(dArr[2] + d3, dArr[3] + d3, i2);
                        this.limitsReachedY = false;
                    } else {
                        this.limitsReachedY = true;
                    }
                }
                i4 = i2 + 1;
                xYChart2 = xYChart;
                z4 = z;
                z5 = z2;
                scalesCount = i3;
                c2 = 0;
            }
        } else {
            RoundChart roundChart = (RoundChart) abstractChart;
            roundChart.setCenterX(roundChart.getCenterX() + ((int) (f4 - f2)));
            roundChart.setCenterY(roundChart.getCenterY() + ((int) (f5 - f3)));
        }
        notifyPanListeners();
    }

    public synchronized void removePanListener(PanListener panListener) {
        this.mPanListeners.remove(panListener);
    }
}
