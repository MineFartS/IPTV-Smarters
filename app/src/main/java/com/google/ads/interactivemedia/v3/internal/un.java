package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class un implements rp {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f23218d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ un f23217c = new un(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ un f23216a = new un();

    private /* synthetic */ un() {
    }

    private /* synthetic */ un(int i2) {
        this.f23218d = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rp
    public final rj[] a() {
        if (this.f23218d != 0) {
            int i2 = ul.f23199a;
            return new rj[]{new ul(null)};
        }
        int i3 = uq.f23225a;
        return new rj[]{new uq()};
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rp
    public final /* synthetic */ rj[] b(Uri uri, Map map) {
        return this.f23218d != 0 ? ro.a(this) : ro.a(this);
    }
}
