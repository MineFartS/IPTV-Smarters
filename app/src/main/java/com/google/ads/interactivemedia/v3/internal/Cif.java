package com.google.ads.interactivemedia.v3.internal;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.ads.interactivemedia.v3.internal.if, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class Cif {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hc f21947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21949c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class<?>[] f21951e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Method f21950d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CountDownLatch f21952f = new CountDownLatch(1);

    public Cif(hc hcVar, String str, String str2, Class<?>... clsArr) {
        this.f21947a = hcVar;
        this.f21948b = str;
        this.f21949c = str2;
        this.f21951e = clsArr;
        hcVar.i().submit(new ie(this));
    }

    public static /* synthetic */ void b(Cif cif) {
        try {
            try {
                Class clsLoadClass = cif.f21947a.g().loadClass(cif.c(cif.f21947a.p(), cif.f21948b));
                if (clsLoadClass != null) {
                    cif.f21950d = clsLoadClass.getMethod(cif.c(cif.f21947a.p(), cif.f21949c), cif.f21951e);
                    Method method = cif.f21950d;
                }
            } catch (gs | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
            }
        } finally {
            cif.f21952f.countDown();
        }
    }

    private final String c(byte[] bArr, String str) {
        return new String(this.f21947a.e().b(bArr, str), "UTF-8");
    }

    public final Method a() {
        if (this.f21950d != null) {
            return this.f21950d;
        }
        try {
            if (this.f21952f.await(2L, TimeUnit.SECONDS)) {
                return this.f21950d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
