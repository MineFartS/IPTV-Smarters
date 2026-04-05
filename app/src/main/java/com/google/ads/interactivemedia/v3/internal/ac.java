package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public enum ac implements bkz {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19131f;

    ac(int i2) {
        this.f19131f = i2;
    }

    public static ac a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_PROTO;
        }
        if (i2 == 1) {
            return AFMA_SIGNALS;
        }
        if (i2 == 2) {
            return UNITY_SIGNALS;
        }
        if (i2 != 3) {
            return null;
        }
        return PARTNER_SIGNALS;
    }

    public static bla b() {
        return m.f22382e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + ac.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f19131f + " name=" + name() + '>';
    }
}
