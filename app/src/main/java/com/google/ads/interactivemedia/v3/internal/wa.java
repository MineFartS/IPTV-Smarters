package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wa {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f23445d = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f23448c = new byte[128];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23449e;

    public final void a(byte[] bArr, int i2, int i3) {
        if (this.f23449e) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.f23448c;
            int length = bArr2.length;
            int i5 = this.f23446a + i4;
            if (length < i5) {
                this.f23448c = Arrays.copyOf(bArr2, i5 + i5);
            }
            System.arraycopy(bArr, i2, this.f23448c, this.f23446a, i4);
            this.f23446a += i4;
        }
    }

    public final void b() {
        this.f23449e = false;
        this.f23446a = 0;
        this.f23447b = 0;
    }

    public final boolean c(int i2, int i3) {
        if (this.f23449e) {
            int i4 = this.f23446a - i3;
            this.f23446a = i4;
            if (this.f23447b != 0 || i2 != 181) {
                this.f23449e = false;
                return true;
            }
            this.f23447b = i4;
        } else if (i2 == 179) {
            this.f23449e = true;
        }
        a(f23445d, 0, 3);
        return false;
    }
}
