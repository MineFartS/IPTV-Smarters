package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bmi implements blw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final blz f21408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f21410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21411d;

    public bmi(blz blzVar, String str, Object[] objArr) {
        this.f21408a = blzVar;
        this.f21409b = str;
        this.f21410c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f21411d = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 13;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 55296) {
                this.f21411d = i2 | (cCharAt2 << i3);
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i4 = i5;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blw
    public final blz a() {
        return this.f21408a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blw
    public final boolean b() {
        return (this.f21411d & 2) == 2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blw
    public final int c() {
        return (this.f21411d & 1) == 1 ? 1 : 2;
    }

    public final String d() {
        return this.f21409b;
    }

    public final Object[] e() {
        return this.f21410c;
    }
}
