package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public enum ab implements bkz {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19039f;

    ab(int i2) {
        this.f19039f = i2;
    }

    public static ab b(int i2) {
        if (i2 == 0) {
            return ENUM_FALSE;
        }
        if (i2 == 1) {
            return ENUM_TRUE;
        }
        if (i2 == 2) {
            return ENUM_FAILURE;
        }
        if (i2 != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static bla c() {
        return m.f22381d;
    }

    public final int a() {
        return this.f19039f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + ab.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f19039f + " name=" + name() + '>';
    }
}
