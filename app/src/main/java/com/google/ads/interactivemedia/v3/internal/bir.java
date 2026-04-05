package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bir implements bfw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f21180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f21181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bfv f21182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f21183d;

    public bir(Class cls, Class cls2, bfv bfvVar) {
        this.f21180a = cls;
        this.f21181b = cls2;
        this.f21182c = bfvVar;
    }

    public bir(Class cls, Class cls2, bfv bfvVar, int i2) {
        this.f21183d = i2;
        this.f21181b = cls;
        this.f21180a = cls2;
        this.f21182c = bfvVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfw
    public final bfv a(bfg bfgVar, bjh bjhVar) {
        if (this.f21183d != 0) {
            Class clsC = bjhVar.c();
            if (clsC == this.f21181b || clsC == this.f21180a) {
                return this.f21182c;
            }
            return null;
        }
        Class clsC2 = bjhVar.c();
        if (clsC2 == this.f21180a || clsC2 == this.f21181b) {
            return this.f21182c;
        }
        return null;
    }

    public final String toString() {
        String name;
        String name2;
        String strValueOf;
        StringBuilder sb;
        if (this.f21183d != 0) {
            name = this.f21180a.getName();
            name2 = this.f21181b.getName();
            strValueOf = String.valueOf(this.f21182c);
            int length = name.length();
            sb = new StringBuilder(length + 24 + name2.length() + strValueOf.length());
        } else {
            name = this.f21180a.getName();
            name2 = this.f21181b.getName();
            strValueOf = String.valueOf(this.f21182c);
            int length2 = name.length();
            sb = new StringBuilder(length2 + 24 + name2.length() + strValueOf.length());
        }
        sb.append("Factory[type=");
        sb.append(name);
        sb.append("+");
        sb.append(name2);
        sb.append(",adapter=");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }
}
