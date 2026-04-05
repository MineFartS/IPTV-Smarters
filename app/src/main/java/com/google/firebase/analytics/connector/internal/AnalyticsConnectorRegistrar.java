package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import c.f.c.c;
import c.f.c.j.a.a;
import c.f.c.k.d;
import c.f.c.k.i;
import c.f.c.k.q;
import c.f.c.v.h;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class AnalyticsConnectorRegistrar implements i {
    public static final /* synthetic */ int zza = 0;

    @Override // c.f.c.k.i
    @RecentlyNonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<d<?>> getComponents() {
        return Arrays.asList(d.a(a.class).b(q.i(c.class)).b(q.i(Context.class)).b(q.i(c.f.c.o.d.class)).f(c.f.c.j.a.c.a.f16048a).e().d(), h.a("fire-analytics", "18.0.1"));
    }
}
