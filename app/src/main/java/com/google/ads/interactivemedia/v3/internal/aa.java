package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public enum aa implements bkz {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3),
    DG(4),
    DG_XTEA(5);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f18953h;

    aa(int i2) {
        this.f18953h = i2;
    }

    public static aa b(int i2) {
        if (i2 == 0) {
            return UNKNOWN_ENCRYPTION_METHOD;
        }
        if (i2 == 1) {
            return BITSLICER;
        }
        if (i2 == 2) {
            return TINK_HYBRID;
        }
        if (i2 == 3) {
            return UNENCRYPTED;
        }
        if (i2 == 4) {
            return DG;
        }
        if (i2 != 5) {
            return null;
        }
        return DG_XTEA;
    }

    public static bla c() {
        return m.f22380c;
    }

    public final int a() {
        return this.f18953h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + aa.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f18953h + " name=" + name() + '>';
    }
}
