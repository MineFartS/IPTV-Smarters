package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class bln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bln f21360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final bln f21361b;

    static {
        byte[] bArr = null;
        f21360a = new bll(bArr);
        f21361b = new blm(bArr);
    }

    public static bln e() {
        return f21360a;
    }

    public static bln f() {
        return f21361b;
    }

    public abstract <L> List<L> b(Object obj, long j2);

    public abstract void c(Object obj, long j2);

    public abstract <L> void d(Object obj, Object obj2, long j2);
}
