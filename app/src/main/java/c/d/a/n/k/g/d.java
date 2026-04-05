package c.d.a.n.k.g;

import c.d.a.n.e;
import c.d.a.n.f;
import c.d.a.n.i.l;
import c.d.a.n.j.o;
import java.io.File;
import java.io.InputStream;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class d implements c.d.a.q.b<InputStream, File> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f5769b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e<File, File> f5770c = new c.d.a.n.k.g.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.d.a.n.b<InputStream> f5771d = new o();

    public static class b implements e<InputStream, File> {
        public b() {
        }

        @Override // c.d.a.n.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l<File> a(InputStream inputStream, int i2, int i3) {
            throw new Error("You cannot decode a File from an InputStream by default, try either #diskCacheStratey(DiskCacheStrategy.SOURCE) to avoid this call or #decoder(ResourceDecoder) to replace this Decoder");
        }

        @Override // c.d.a.n.e
        public String getId() {
            return BuildConfig.FLAVOR;
        }
    }

    @Override // c.d.a.q.b
    public c.d.a.n.b<InputStream> a() {
        return this.f5771d;
    }

    @Override // c.d.a.q.b
    public f<File> c() {
        return c.d.a.n.k.b.c();
    }

    @Override // c.d.a.q.b
    public e<InputStream, File> e() {
        return f5769b;
    }

    @Override // c.d.a.q.b
    public e<File, File> f() {
        return this.f5770c;
    }
}
