package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes.dex */
public abstract class bn {
    public abstract bo build();

    public abstract bn volume(float f2);

    public bn volumePercentage(int i2) {
        return volume(i2 / 100.0f);
    }
}
