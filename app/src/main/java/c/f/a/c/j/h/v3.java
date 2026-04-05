package c.f.a.c.j.h;

import android.content.Context;
import android.net.Uri;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class v3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f13577b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13576a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13578c = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13579d = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13580e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13581f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f13582g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f13583h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final c4<Context, Boolean> f13584i = null;

    public v3(Uri uri) {
        this.f13577b = uri;
    }

    public final x3<Long> a(String str, long j2) {
        return new r3(this, str, Long.valueOf(j2), true);
    }

    public final x3<Boolean> b(String str, boolean z) {
        return new s3(this, str, Boolean.valueOf(z), true);
    }

    public final x3<Double> c(String str, double d2) {
        return new t3(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final x3<String> d(String str, String str2) {
        return new u3(this, str, str2, true);
    }
}
