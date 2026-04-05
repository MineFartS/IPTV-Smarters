package org.achartengine.chart;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public class ClickableArea {
    private RectF rect;
    private double x;
    private double y;

    public ClickableArea(RectF rectF, double d2, double d3) {
        this.rect = rectF;
        this.x = d2;
        this.y = d3;
    }

    public RectF getRect() {
        return this.rect;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
}
