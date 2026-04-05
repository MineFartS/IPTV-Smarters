package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class axd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bcw f20679a;

    private axd(bcw bcwVar) {
        this.f20679a = bcwVar;
    }

    public static axd d(String str, byte[] bArr, int i2) {
        bcv bcvVarA = bcw.a();
        bcvVarA.b(str);
        bcvVarA.c(bkd.o(bArr));
        bdl bdlVar = bdl.UNKNOWN_PREFIX;
        int i3 = i2 - 1;
        bcvVarA.a(i3 != 0 ? i3 != 1 ? bdl.RAW : bdl.LEGACY : bdl.TINK);
        return new axd(bcvVarA.ac());
    }

    public final String a() {
        return this.f20679a.g();
    }

    public final byte[] b() {
        return this.f20679a.f().t();
    }

    public final int c() {
        bdl bdlVarE = this.f20679a.e();
        bdl bdlVar = bdl.UNKNOWN_PREFIX;
        int iOrdinal = bdlVarE.ordinal();
        int i2 = 1;
        if (iOrdinal != 1) {
            i2 = 2;
            if (iOrdinal != 2) {
                i2 = 3;
                if (iOrdinal != 3) {
                    if (iOrdinal == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i2;
    }
}
