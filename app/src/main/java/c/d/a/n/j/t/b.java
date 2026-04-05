package c.d.a.n.j.t;

import android.content.Context;
import c.d.a.n.j.l;
import c.d.a.n.j.m;
import java.io.InputStream;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5705a;

    public static class a implements m<byte[], InputStream> {
        @Override // c.d.a.n.j.m
        public void a() {
        }

        @Override // c.d.a.n.j.m
        public l<byte[], InputStream> b(Context context, c.d.a.n.j.c cVar) {
            return new b();
        }
    }

    public b() {
        this(BuildConfig.FLAVOR);
    }

    @Deprecated
    public b(String str) {
        this.f5705a = str;
    }

    @Override // c.d.a.n.j.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.d.a.n.h.c<InputStream> a(byte[] bArr, int i2, int i3) {
        return new c.d.a.n.h.b(bArr, this.f5705a);
    }
}
