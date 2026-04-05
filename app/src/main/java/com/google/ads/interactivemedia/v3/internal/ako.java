package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ako extends ajb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f19993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f19995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AssetFileDescriptor f19996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InputStream f19997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19999g;

    public ako(Context context) {
        super(false);
        this.f19993a = context.getResources();
        this.f19994b = context.getPackageName();
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.google.ads.interactivemedia.v3.internal.ajl r12) throws com.google.ads.interactivemedia.v3.internal.akn {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ako.a(com.google.ads.interactivemedia.v3.internal.ajl):long");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aje
    public final int b(byte[] bArr, int i2, int i3) throws akn {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f19998f;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new akn(e2);
            }
        }
        InputStream inputStream = this.f19997e;
        int i4 = amn.f20135a;
        int i5 = inputStream.read(bArr, i2, i3);
        if (i5 == -1) {
            if (this.f19998f == -1) {
                return -1;
            }
            throw new akn(new EOFException());
        }
        long j3 = this.f19998f;
        if (j3 != -1) {
            this.f19998f = j3 - ((long) i5);
        }
        g(i5);
        return i5;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final Uri c() {
        return this.f19995c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final void f() {
        this.f19995c = null;
        try {
            try {
                InputStream inputStream = this.f19997e;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f19997e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f19996d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new akn(e2);
                    }
                } finally {
                    this.f19996d = null;
                    if (this.f19999g) {
                        this.f19999g = false;
                        h();
                    }
                }
            } catch (Throwable th) {
                this.f19997e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f19996d;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f19996d = null;
                        if (this.f19999g) {
                            this.f19999g = false;
                            h();
                        }
                        throw th;
                    } catch (IOException e3) {
                        throw new akn(e3);
                    }
                } catch (Throwable th2) {
                    this.f19996d = null;
                    if (this.f19999g) {
                        this.f19999g = false;
                        h();
                    }
                    throw th2;
                }
            }
        } catch (IOException e4) {
            throw new akn(e4);
        }
    }
}
