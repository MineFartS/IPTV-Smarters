package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class km {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f22184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22185b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<aab> f22188e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f22190g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kk f22186c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kh f22187d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22189f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f22191h = null;

    public /* synthetic */ km(Uri uri, String str, kk kkVar, kh khVar, List list, List list2) {
        this.f22184a = uri;
        this.f22185b = str;
        this.f22188e = list;
        this.f22190g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km)) {
            return false;
        }
        km kmVar = (km) obj;
        return this.f22184a.equals(kmVar.f22184a) && amn.O(this.f22185b, kmVar.f22185b) && amn.O(null, null) && amn.O(null, null) && this.f22188e.equals(kmVar.f22188e) && amn.O(null, null) && this.f22190g.equals(kmVar.f22190g) && amn.O(null, null);
    }

    public final int hashCode() {
        int iHashCode = this.f22184a.hashCode() * 31;
        String str = this.f22185b;
        return (((((iHashCode + (str == null ? 0 : str.hashCode())) * 29791) + this.f22188e.hashCode()) * 961) + this.f22190g.hashCode()) * 31;
    }
}
