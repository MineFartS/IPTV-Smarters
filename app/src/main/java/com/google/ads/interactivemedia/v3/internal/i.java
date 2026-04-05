package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public enum i implements bkz {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21943g;

    i(int i2) {
        this.f21943g = i2;
    }

    public static i a(int i2) {
        if (i2 == 0) {
            return ENUM_SIGNAL_SOURCE_UNKNOWN;
        }
        if (i2 == 1) {
            return ENUM_SIGNAL_SOURCE_DISABLE;
        }
        if (i2 == 2) {
            return ENUM_SIGNAL_SOURCE_ADSHIELD;
        }
        if (i2 == 3) {
            return ENUM_SIGNAL_SOURCE_GASS;
        }
        if (i2 != 4) {
            return null;
        }
        return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
    }

    public static bla b() {
        return h.f21885a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + i.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f21943g + " name=" + name() + '>';
    }
}
