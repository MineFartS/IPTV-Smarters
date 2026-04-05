package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f23076a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f23079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23082g;

    public final void a(tk tkVar) {
        if (this.f23078c > 0) {
            tkVar.V.d(this.f23079d, this.f23080e, this.f23081f, this.f23082g, tkVar.f23069i);
            this.f23078c = 0;
        }
    }

    public final void b() {
        this.f23077b = false;
        this.f23078c = 0;
    }

    public final void c(tk tkVar, long j2, int i2, int i3, int i4) {
        if (this.f23077b) {
            int i5 = this.f23078c;
            int i6 = i5 + 1;
            this.f23078c = i6;
            if (i5 == 0) {
                this.f23079d = j2;
                this.f23080e = i2;
                this.f23081f = 0;
            }
            this.f23081f += i3;
            this.f23082g = i4;
            if (i6 >= 16) {
                a(tkVar);
            }
        }
    }

    public final void d(rk rkVar) {
        if (this.f23077b) {
            return;
        }
        rkVar.g(this.f23076a, 0, 10);
        rkVar.i();
        byte[] bArr = this.f23076a;
        int i2 = nr.f22553a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f23077b = true;
        }
    }
}
