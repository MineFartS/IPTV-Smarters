package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ate f20510a = new atc();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ate f20511b = new atd(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ate f20512c = new atd(1);

    public static ate j() {
        return f20510a;
    }

    public abstract int a();

    public abstract ate b(int i2, int i3);

    public abstract <T> ate c(T t, T t2, Comparator<T> comparator);

    public abstract ate d(boolean z, boolean z2);

    public abstract ate e(boolean z, boolean z2);
}
