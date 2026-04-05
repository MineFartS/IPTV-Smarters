package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public enum n implements bkz {
    DEVICE_IDENTIFIER_NO_ID(0),
    DEVICE_IDENTIFIER_APP_SPECIFIC_ID(1),
    DEVICE_IDENTIFIER_GLOBAL_ID(2),
    DEVICE_IDENTIFIER_ADVERTISER_ID(3),
    DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED(4),
    DEVICE_IDENTIFIER_ANDROID_AD_ID(5),
    DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID(6),
    DEVICE_IDENTIFIER_PER_APP_ID(7),
    DEVICE_IDENTIFIER_PER_APP_ID_V2(8);


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f22489k;

    n(int i2) {
        this.f22489k = i2;
    }

    public static n b(int i2) {
        switch (i2) {
            case 0:
                return DEVICE_IDENTIFIER_NO_ID;
            case 1:
                return DEVICE_IDENTIFIER_APP_SPECIFIC_ID;
            case 2:
                return DEVICE_IDENTIFIER_GLOBAL_ID;
            case 3:
                return DEVICE_IDENTIFIER_ADVERTISER_ID;
            case 4:
                return DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED;
            case 5:
                return DEVICE_IDENTIFIER_ANDROID_AD_ID;
            case 6:
                return DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID;
            case 7:
                return DEVICE_IDENTIFIER_PER_APP_ID;
            case 8:
                return DEVICE_IDENTIFIER_PER_APP_ID_V2;
            default:
                return null;
        }
    }

    public static bla c() {
        return m.f22378a;
    }

    public final int a() {
        return this.f22489k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + n.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f22489k + " name=" + name() + '>';
    }
}
