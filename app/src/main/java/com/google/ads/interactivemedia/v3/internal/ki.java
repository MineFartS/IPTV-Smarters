package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ki {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f22163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f22164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f22165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<aab> f22166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f22167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private kp f22168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f22169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f22170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f22171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f22172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f22173l;

    public ki() {
        this.f22165d = Long.MIN_VALUE;
        Collections.emptyList();
        Collections.emptyMap();
        this.f22166e = Collections.emptyList();
        this.f22167f = Collections.emptyList();
        this.f22169h = -9223372036854775807L;
        this.f22170i = -9223372036854775807L;
        this.f22171j = -9223372036854775807L;
        this.f22172k = -3.4028235E38f;
        this.f22173l = -3.4028235E38f;
    }

    public /* synthetic */ ki(kn knVar) {
        this();
        this.f22165d = Long.MIN_VALUE;
        this.f22162a = knVar.f22192a;
        this.f22168g = knVar.f22195d;
        kl klVar = knVar.f22194c;
        this.f22169h = klVar.f22179a;
        this.f22170i = klVar.f22180b;
        this.f22171j = klVar.f22181c;
        this.f22172k = klVar.f22182d;
        this.f22173l = klVar.f22183e;
        km kmVar = knVar.f22193b;
        if (kmVar != null) {
            this.f22164c = kmVar.f22185b;
            this.f22163b = kmVar.f22184a;
            this.f22166e = kmVar.f22188e;
            this.f22167f = kmVar.f22190g;
        }
    }

    public final kn a() {
        ajr.f(true);
        Uri uri = this.f22163b;
        km kmVar = uri != null ? new km(uri, this.f22164c, null, null, this.f22166e, this.f22167f) : null;
        String str = this.f22162a;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        String str2 = str;
        kj kjVar = new kj(Long.MIN_VALUE);
        kl klVar = new kl(this.f22169h, this.f22170i, this.f22171j, this.f22172k, this.f22173l);
        kp kpVar = this.f22168g;
        if (kpVar == null) {
            kpVar = kp.f22205a;
        }
        return new kn(str2, kjVar, kmVar, klVar, kpVar);
    }

    public final void b(long j2) {
        this.f22169h = j2;
    }

    public final void c(String str) {
        this.f22162a = str;
    }

    public final void d(String str) {
        this.f22164c = str;
    }

    public final void e(List<aab> list) {
        this.f22166e = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
    }

    public final void f(Uri uri) {
        this.f22163b = uri;
    }
}
