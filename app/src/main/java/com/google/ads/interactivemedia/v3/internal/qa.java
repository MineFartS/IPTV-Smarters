package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class qa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke f22807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ke f22808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22810e;

    public qa(String str, ke keVar, ke keVar2, int i2, int i3) {
        boolean z = false;
        if (i2 == 0) {
            z = true;
        } else if (i3 == 0) {
            i3 = 0;
            z = true;
        }
        ajr.d(z);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f22806a = str;
        ajr.b(keVar);
        this.f22807b = keVar;
        ajr.b(keVar2);
        this.f22808c = keVar2;
        this.f22809d = i2;
        this.f22810e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qa.class == obj.getClass()) {
            qa qaVar = (qa) obj;
            if (this.f22809d == qaVar.f22809d && this.f22810e == qaVar.f22810e && this.f22806a.equals(qaVar.f22806a) && this.f22807b.equals(qaVar.f22807b) && this.f22808c.equals(qaVar.f22808c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f22809d + 527) * 31) + this.f22810e) * 31) + this.f22806a.hashCode()) * 31) + this.f22807b.hashCode()) * 31) + this.f22808c.hashCode();
    }
}
