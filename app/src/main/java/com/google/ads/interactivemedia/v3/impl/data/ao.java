package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes.dex */
public final class ao extends bn {
    private Float volume;

    @Override // com.google.ads.interactivemedia.v3.impl.data.bn
    public bo build() {
        Float f2 = this.volume;
        if (f2 == null) {
            throw new IllegalStateException("Missing required properties:".concat(" volume"));
        }
        return new ap(f2.floatValue());
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bn
    public bn volume(float f2) {
        this.volume = Float.valueOf(f2);
        return this;
    }
}
