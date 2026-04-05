package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aoq<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f20314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20315c = 1;

    public aoq(String str, T t, int i2) {
        this.f20313a = str;
        this.f20314b = t;
    }

    public static aoq<Boolean> a(String str, boolean z) {
        return new aoq<>(str, Boolean.valueOf(z), 1);
    }

    public final T b() {
        aot aotVarA = aou.a();
        if (aotVarA != null) {
            return (T) aotVarA.a(this.f20313a, ((Boolean) this.f20314b).booleanValue());
        }
        throw new IllegalStateException("Flag is not initialized.");
    }
}
