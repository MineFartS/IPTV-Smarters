package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class atr<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f20546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20548c;

    public atr() {
    }

    public atr(byte[] bArr) {
        this();
        auv.q(4, "initialCapacity");
        this.f20546a = new Object[4];
        this.f20547b = 0;
    }

    public static int a(int i2, int i3) {
        if (i3 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i4 = i2 + (i2 >> 1) + 1;
        if (i4 < i3) {
            int iHighestOneBit = Integer.highestOneBit(i3 - 1);
            i4 = iHighestOneBit + iHighestOneBit;
        }
        if (i4 < 0) {
            return Integer.MAX_VALUE;
        }
        return i4;
    }

    private final void c(int i2) {
        Object[] objArr = this.f20546a;
        int length = objArr.length;
        if (length < i2) {
            this.f20546a = Arrays.copyOf(objArr, a(length, i2));
        } else if (!this.f20548c) {
            return;
        } else {
            this.f20546a = (Object[]) objArr.clone();
        }
        this.f20548c = false;
    }

    public final void b(Object obj) {
        ars.g(obj);
        c(this.f20547b + 1);
        Object[] objArr = this.f20546a;
        int i2 = this.f20547b;
        this.f20547b = i2 + 1;
        objArr[i2] = obj;
    }
}
