package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bit implements bfw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f21186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bfv f21187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f21188c;

    public bit(Class cls, bfv bfvVar) {
        this.f21186a = cls;
        this.f21187b = bfvVar;
    }

    public bit(Class cls, bfv bfvVar, int i2) {
        this.f21188c = i2;
        this.f21186a = cls;
        this.f21187b = bfvVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfw
    public final bfv a(bfg bfgVar, bjh bjhVar) {
        if (this.f21188c != 0) {
            if (bjhVar.c() == this.f21186a) {
                return this.f21187b;
            }
            return null;
        }
        Class<?> clsC = bjhVar.c();
        if (this.f21186a.isAssignableFrom(clsC)) {
            return new bis(this, clsC);
        }
        return null;
    }

    public final String toString() {
        String name;
        String strValueOf;
        StringBuilder sb;
        String str;
        if (this.f21188c != 0) {
            name = this.f21186a.getName();
            strValueOf = String.valueOf(this.f21187b);
            sb = new StringBuilder(name.length() + 23 + strValueOf.length());
            str = "Factory[type=";
        } else {
            name = this.f21186a.getName();
            strValueOf = String.valueOf(this.f21187b);
            sb = new StringBuilder(name.length() + 32 + strValueOf.length());
            str = "Factory[typeHierarchy=";
        }
        sb.append(str);
        sb.append(name);
        sb.append(",adapter=");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }
}
