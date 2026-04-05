package com.amplifyframework.predictions.models;

/* JADX INFO: loaded from: classes.dex */
public final class AgeRange {
    private final int high;
    private final int low;

    public AgeRange(int i2, int i3) {
        if (i3 < i2) {
            throw new IllegalArgumentException("Low cannot be higher than High.");
        }
        this.low = i2;
        this.high = i3;
    }

    public boolean contains(int i2) {
        return i2 >= this.low && i2 <= this.high;
    }

    public int getHigh() {
        return this.high;
    }

    public int getLow() {
        return this.low;
    }
}
