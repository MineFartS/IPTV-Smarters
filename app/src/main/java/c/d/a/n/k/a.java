package c.d.a.n.k;

import java.io.OutputStream;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class a<T> implements c.d.a.n.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a<?> f5706a = new a<>();

    public static <T> c.d.a.n.b<T> b() {
        return f5706a;
    }

    @Override // c.d.a.n.b
    public boolean a(T t, OutputStream outputStream) {
        return false;
    }

    @Override // c.d.a.n.b
    public String getId() {
        return BuildConfig.FLAVOR;
    }
}
