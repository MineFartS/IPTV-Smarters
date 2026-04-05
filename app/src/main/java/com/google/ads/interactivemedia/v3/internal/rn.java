package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rn implements rp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ rn f22898a = new rn();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22899c;

    private /* synthetic */ rn() {
    }

    public rn(int i2) {
        this.f22899c = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rp
    public final rj[] a() {
        if (this.f22899c != 0) {
            return new rj[]{new vu(), new sl(), new xc(), new uq(), new tm()};
        }
        int i2 = ro.f22900a;
        return new rj[0];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rp
    public final /* synthetic */ rj[] b(Uri uri, Map map) {
        return this.f22899c != 0 ? ro.a(this) : ro.a(this);
    }
}
