package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class blq implements blx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final blx[] f21367a;

    public blq(blx... blxVarArr) {
        this.f21367a = blxVarArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blx
    public final blw a(Class<?> cls) {
        blx[] blxVarArr = this.f21367a;
        for (int i2 = 0; i2 < 2; i2++) {
            blx blxVar = blxVarArr[i2];
            if (blxVar.b(cls)) {
                return blxVar.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blx
    public final boolean b(Class<?> cls) {
        blx[] blxVarArr = this.f21367a;
        for (int i2 = 0; i2 < 2; i2++) {
            if (blxVarArr[i2].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
