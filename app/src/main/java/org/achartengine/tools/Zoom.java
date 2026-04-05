package org.achartengine.tools;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.achartengine.chart.AbstractChart;
import org.achartengine.chart.RoundChart;
import org.achartengine.chart.XYChart;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class Zoom extends AbstractTool {
    public static final int ZOOM_AXIS_X = 1;
    public static final int ZOOM_AXIS_XY = 0;
    public static final int ZOOM_AXIS_Y = 2;
    private boolean limitsReachedX;
    private boolean limitsReachedY;
    private boolean mZoomIn;
    private List<ZoomListener> mZoomListeners;
    private float mZoomRate;

    public Zoom(AbstractChart abstractChart, boolean z, float f2) {
        super(abstractChart);
        this.mZoomListeners = new ArrayList();
        this.limitsReachedX = false;
        this.limitsReachedY = false;
        this.mZoomIn = z;
        setZoomRate(f2);
    }

    private synchronized void notifyZoomListeners(ZoomEvent zoomEvent) {
        Iterator<ZoomListener> it = this.mZoomListeners.iterator();
        while (it.hasNext()) {
            it.next().zoomApplied(zoomEvent);
        }
    }

    public synchronized void addZoomListener(ZoomListener zoomListener) {
        this.mZoomListeners.add(zoomListener);
    }

    public void apply(int i2) {
        int i3;
        double d2;
        double zoomInLimitX;
        double zoomInLimitY;
        AbstractChart abstractChart = this.mChart;
        if (abstractChart instanceof XYChart) {
            int scalesCount = this.mRenderer.getScalesCount();
            char c2 = 0;
            int i4 = 0;
            while (i4 < scalesCount) {
                double[] range = getRange(i4);
                checkRange(range, i4);
                double[] zoomLimits = this.mRenderer.getZoomLimits();
                double d3 = (range[c2] + range[1]) / 2.0d;
                double d4 = (range[2] + range[3]) / 2.0d;
                double d5 = range[1] - range[c2];
                double d6 = range[3] - range[2];
                double d7 = d5 / 2.0d;
                double d8 = d3 - d7;
                double d9 = d3 + d7;
                double d10 = d6 / 2.0d;
                double d11 = d4 - d10;
                double d12 = d4 + d10;
                if (i4 == 0) {
                    this.limitsReachedX = zoomLimits != null && (d8 <= zoomLimits[c2] || d9 >= zoomLimits[1]);
                    this.limitsReachedY = zoomLimits != null && (d11 <= zoomLimits[2] || d12 >= zoomLimits[3]);
                }
                if (this.mZoomIn) {
                    if (this.mRenderer.isZoomXEnabled() && ((i2 == 1 || i2 == 0) && (!this.limitsReachedX || this.mZoomRate >= 1.0f))) {
                        double d13 = this.mZoomRate;
                        Double.isNaN(d13);
                        d5 /= d13;
                    }
                    if (this.mRenderer.isZoomYEnabled() && ((i2 == 2 || i2 == 0) && (!this.limitsReachedY || this.mZoomRate >= 1.0f))) {
                        double d14 = this.mZoomRate;
                        Double.isNaN(d14);
                        d6 /= d14;
                    }
                } else {
                    if (this.mRenderer.isZoomXEnabled() && !this.limitsReachedX && (i2 == 1 || i2 == 0)) {
                        double d15 = this.mZoomRate;
                        Double.isNaN(d15);
                        d5 *= d15;
                    }
                    if (this.mRenderer.isZoomYEnabled() && !this.limitsReachedY && (i2 == 2 || i2 == 0)) {
                        double d16 = this.mZoomRate;
                        Double.isNaN(d16);
                        d6 *= d16;
                    }
                }
                double d17 = d5;
                double d18 = d6;
                if (zoomLimits != null) {
                    d2 = d4;
                    i3 = i4;
                    zoomInLimitX = Math.min(this.mRenderer.getZoomInLimitX(), zoomLimits[1] - zoomLimits[c2]);
                    zoomInLimitY = Math.min(this.mRenderer.getZoomInLimitY(), zoomLimits[3] - zoomLimits[2]);
                } else {
                    i3 = i4;
                    d2 = d4;
                    zoomInLimitX = this.mRenderer.getZoomInLimitX();
                    zoomInLimitY = this.mRenderer.getZoomInLimitY();
                }
                double dMax = Math.max(d17, zoomInLimitX);
                double dMax2 = Math.max(d18, zoomInLimitY);
                if (this.mRenderer.isZoomXEnabled() && (i2 == 1 || i2 == 0)) {
                    double d19 = dMax / 2.0d;
                    setXRange(d3 - d19, d19 + d3, i3);
                }
                if (this.mRenderer.isZoomYEnabled() && (i2 == 2 || i2 == 0)) {
                    double d20 = dMax2 / 2.0d;
                    setYRange(d2 - d20, d2 + d20, i3);
                }
                i4 = i3 + 1;
                c2 = 0;
            }
        } else {
            DefaultRenderer renderer = ((RoundChart) abstractChart).getRenderer();
            renderer.setScale(this.mZoomIn ? renderer.getScale() * this.mZoomRate : renderer.getScale() / this.mZoomRate);
        }
        notifyZoomListeners(new ZoomEvent(this.mZoomIn, this.mZoomRate));
    }

    public synchronized void notifyZoomResetListeners() {
        Iterator<ZoomListener> it = this.mZoomListeners.iterator();
        while (it.hasNext()) {
            it.next().zoomReset();
        }
    }

    public synchronized void removeZoomListener(ZoomListener zoomListener) {
        this.mZoomListeners.remove(zoomListener);
    }

    public void setZoomRate(float f2) {
        this.mZoomRate = f2;
    }
}
