package org.achartengine.tools;

/* JADX INFO: loaded from: classes2.dex */
public class ZoomEvent {
    private boolean mZoomIn;
    private float mZoomRate;

    public ZoomEvent(boolean z, float f2) {
        this.mZoomIn = z;
        this.mZoomRate = f2;
    }

    public float getZoomRate() {
        return this.mZoomRate;
    }

    public boolean isZoomIn() {
        return this.mZoomIn;
    }
}
