package c.d.a.n.k.g;

import c.d.a.n.e;
import c.d.a.n.i.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class c<T> implements e<File, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5766a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e<InputStream, T> f5767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f5768c;

    public static class a {
        public InputStream a(File file) {
            return new FileInputStream(file);
        }
    }

    public c(e<InputStream, T> eVar) {
        this(eVar, f5766a);
    }

    public c(e<InputStream, T> eVar, a aVar) {
        this.f5767b = eVar;
        this.f5768c = aVar;
    }

    @Override // c.d.a.n.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l<T> a(File file, int i2, int i3) {
        InputStream inputStreamA = null;
        try {
            inputStreamA = this.f5768c.a(file);
            l<T> lVarA = this.f5767b.a(inputStreamA, i2, i3);
            if (inputStreamA != null) {
                try {
                    inputStreamA.close();
                } catch (IOException unused) {
                }
            }
            return lVarA;
        } catch (Throwable th) {
            if (inputStreamA != null) {
                try {
                    inputStreamA.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    @Override // c.d.a.n.e
    public String getId() {
        return BuildConfig.FLAVOR;
    }
}
