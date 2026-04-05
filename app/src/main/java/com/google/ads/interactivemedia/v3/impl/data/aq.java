package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class aq {
    public abstract ar build();

    public abstract aq height(int i2);

    public abstract aq left(int i2);

    public aq locationOnScreenOfView(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return left(iArr[0]).top(iArr[1]).height(view.getHeight()).width(view.getWidth());
    }

    public abstract aq top(int i2);

    public abstract aq width(int i2);
}
