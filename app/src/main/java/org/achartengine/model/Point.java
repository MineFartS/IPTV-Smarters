package org.achartengine.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class Point implements Serializable {
    private float mX;
    private float mY;

    public Point() {
    }

    public Point(float f2, float f3) {
        this.mX = f2;
        this.mY = f3;
    }

    public float getX() {
        return this.mX;
    }

    public float getY() {
        return this.mY;
    }

    public void setX(float f2) {
        this.mX = f2;
    }

    public void setY(float f2) {
        this.mY = f2;
    }
}
