package c.f.a.b.e3;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicLong f6894a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.i3.s f6896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f6897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, List<String>> f6898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6901h;

    public a0(long j2, c.f.a.b.i3.s sVar, long j3) {
        this(j2, sVar, sVar.f9061a, Collections.emptyMap(), j3, 0L, 0L);
    }

    public a0(long j2, c.f.a.b.i3.s sVar, Uri uri, Map<String, List<String>> map, long j3, long j4, long j5) {
        this.f6895b = j2;
        this.f6896c = sVar;
        this.f6897d = uri;
        this.f6898e = map;
        this.f6899f = j3;
        this.f6900g = j4;
        this.f6901h = j5;
    }

    public static long a() {
        return f6894a.getAndIncrement();
    }
}
