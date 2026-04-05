package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import com.google.ads.interactivemedia.v3.internal.zy;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zz<T extends zy<T>> implements akl<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final akl<? extends T> f23897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<aab> f23898b;

    public zz(akl<? extends T> aklVar, List<aab> list) {
        this.f23897a = aklVar;
        this.f23898b = list;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akl
    public final /* bridge */ /* synthetic */ Object a(Uri uri, InputStream inputStream) {
        T tA = this.f23897a.a(uri, inputStream);
        List<aab> list = this.f23898b;
        return (list == null || list.isEmpty()) ? tA : (zy) tA.a(this.f23898b);
    }
}
