package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class blp implements blx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final blp f21365b = new blp(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f21366a;

    public blp() {
    }

    private blp(int i2) {
        this.f21366a = i2;
    }

    public static blp c() {
        return f21365b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blx
    public final blw a(Class cls) {
        if (this.f21366a == 0) {
            throw new IllegalStateException("This should never be called.");
        }
        if (!bkx.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (blw) bkx.al(cls.asSubclass(bkx.class)).av(3);
        } catch (Exception e2) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blx
    public final boolean b(Class cls) {
        if (this.f21366a != 0) {
            return bkx.class.isAssignableFrom(cls);
        }
        return false;
    }
}
