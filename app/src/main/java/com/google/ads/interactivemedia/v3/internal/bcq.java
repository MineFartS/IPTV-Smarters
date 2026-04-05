package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bcq extends bkx<bcq, bcp> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bcq f20876a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20878f;

    static {
        bcq bcqVar = new bcq();
        f20876a = bcqVar;
        bkx.at(bcq.class, bcqVar);
    }

    private bcq() {
    }

    public static bcp d() {
        return f20876a.ak();
    }

    public static bcq f() {
        return f20876a;
    }

    public final int a() {
        return this.f20878f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20876a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"e", "f"});
        }
        if (i3 == 3) {
            return new bcq();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bcp(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20876a;
    }

    public final bck c() {
        bck bckVarB = bck.b(this.f20877e);
        return bckVarB == null ? bck.UNRECOGNIZED : bckVarB;
    }
}
