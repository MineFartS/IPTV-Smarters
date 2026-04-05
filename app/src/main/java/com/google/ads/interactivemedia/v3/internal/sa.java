package com.google.ads.interactivemedia.v3.internal;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd f22930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sd f22931b;

    public sa(sd sdVar, sd sdVar2) {
        this.f22930a = sdVar;
        this.f22931b = sdVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sa.class == obj.getClass()) {
            sa saVar = (sa) obj;
            if (this.f22930a.equals(saVar.f22930a) && this.f22931b.equals(saVar.f22931b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f22930a.hashCode() * 31) + this.f22931b.hashCode();
    }

    public final String toString() {
        String string;
        String strValueOf = String.valueOf(this.f22930a);
        if (this.f22930a.equals(this.f22931b)) {
            string = BuildConfig.FLAVOR;
        } else {
            String strValueOf2 = String.valueOf(this.f22931b);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + 2);
            sb.append(", ");
            sb.append(strValueOf2);
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 2 + String.valueOf(string).length());
        sb2.append("[");
        sb2.append(strValueOf);
        sb2.append(string);
        sb2.append("]");
        return sb2.toString();
    }
}
