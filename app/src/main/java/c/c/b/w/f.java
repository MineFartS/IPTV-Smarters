package c.c.b.w;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c.c.b.g> f5291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InputStream f5293d;

    public f(int i2, List<c.c.b.g> list) {
        this(i2, list, -1, null);
    }

    public f(int i2, List<c.c.b.g> list, int i3, InputStream inputStream) {
        this.f5290a = i2;
        this.f5291b = list;
        this.f5292c = i3;
        this.f5293d = inputStream;
    }

    public final InputStream a() {
        return this.f5293d;
    }

    public final int b() {
        return this.f5292c;
    }

    public final List<c.c.b.g> c() {
        return Collections.unmodifiableList(this.f5291b);
    }

    public final int d() {
        return this.f5290a;
    }
}
