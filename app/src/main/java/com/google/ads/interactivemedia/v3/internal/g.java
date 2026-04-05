package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class g extends bkx<g, e> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f21820a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21822f = 2;

    static {
        g gVar = new g();
        f21820a = gVar;
        bkx.at(g.class, gVar);
    }

    private g() {
    }

    public static g c() {
        return f21820a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f21820a, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"e", "f", i.b()});
        }
        if (i3 == 3) {
            return new g();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new e(bArr, (char[]) (0 == true ? 1 : 0));
        }
        if (i3 != 5) {
            return null;
        }
        return f21820a;
    }

    public final i d() {
        i iVarA = i.a(this.f21822f);
        return iVarA == null ? i.ENUM_SIGNAL_SOURCE_ADSHIELD : iVarA;
    }
}
