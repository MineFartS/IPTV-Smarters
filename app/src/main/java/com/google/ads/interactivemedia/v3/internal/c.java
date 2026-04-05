package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public enum c implements bkz {
    UNKNOWN(0),
    ENABLED(1),
    DISABLED(2);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21539e;

    c(int i2) {
        this.f21539e = i2;
    }

    public static c a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return ENABLED;
        }
        if (i2 != 2) {
            return null;
        }
        return DISABLED;
    }

    public static bla b() {
        return h.f21886b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f21539e + " name=" + name() + '>';
    }
}
