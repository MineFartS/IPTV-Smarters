package c.d.a.n.k;

import c.d.a.n.f;
import c.d.a.n.i.l;
import java.io.OutputStream;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class b<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b<?> f5707a = new b<>();

    public static <T> b<T> c() {
        return (b<T>) f5707a;
    }

    @Override // c.d.a.n.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(l<T> lVar, OutputStream outputStream) {
        return false;
    }

    @Override // c.d.a.n.b
    public String getId() {
        return BuildConfig.FLAVOR;
    }
}
