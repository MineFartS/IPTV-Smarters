package c.f.a.b.c3;

import android.net.Uri;
import c.f.a.b.c3.e0;
import c.f.a.b.i3.i0;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f0<T extends e0<T>> implements i0.a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0.a<? extends T> f6706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<i0> f6707c;

    public f0(i0.a<? extends T> aVar, List<i0> list) {
        this.f6706b = aVar;
        this.f6707c = list;
    }

    @Override // c.f.a.b.i3.i0.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(Uri uri, InputStream inputStream) {
        T tA = this.f6706b.a(uri, inputStream);
        List<i0> list = this.f6707c;
        return (list == null || list.isEmpty()) ? tA : (T) tA.a(this.f6707c);
    }
}
