package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bda extends bkx<bda, bcx> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bda f20919a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private blc<bcz> f20921f = bkx.ap();

    static {
        bda bdaVar = new bda();
        f20919a = bdaVar;
        bkx.at(bda.class, bdaVar);
    }

    private bda() {
    }

    public static bda e(byte[] bArr, bkm bkmVar) {
        return (bda) bkx.an(f20919a, bArr, bkmVar);
    }

    public final int a() {
        return this.f20921f.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20919a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"e", "f", bcz.class});
        }
        if (i3 == 3) {
            return new bda();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bcx(bArr, (char[]) (0 == true ? 1 : 0));
        }
        if (i3 != 5) {
            return null;
        }
        return f20919a;
    }

    public final int c() {
        return this.f20920e;
    }

    public final List<bcz> f() {
        return this.f20921f;
    }
}
