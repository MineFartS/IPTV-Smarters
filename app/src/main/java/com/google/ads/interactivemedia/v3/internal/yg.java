package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class yg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23794c;

    public yg(String str, boolean z, boolean z2) {
        this.f23792a = str;
        this.f23793b = z;
        this.f23794c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == yg.class) {
            yg ygVar = (yg) obj;
            if (TextUtils.equals(this.f23792a, ygVar.f23792a) && this.f23793b == ygVar.f23793b && this.f23794c == ygVar.f23794c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f23792a.hashCode() + 31) * 31) + (true != this.f23793b ? 1237 : 1231)) * 31) + (true == this.f23794c ? 1231 : 1237);
    }
}
