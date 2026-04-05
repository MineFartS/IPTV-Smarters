package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public enum bcs implements bkz {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f20886h;

    bcs(int i2) {
        this.f20886h = i2;
    }

    public static bcs b(int i2) {
        if (i2 == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i2 == 1) {
            return SYMMETRIC;
        }
        if (i2 == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i2 == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i2 != 4) {
            return null;
        }
        return REMOTE;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f20886h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(bcs.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(a());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
