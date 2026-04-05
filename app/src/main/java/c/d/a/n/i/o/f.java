package c.d.a.n.i.o;

import android.content.Context;
import c.d.a.n.i.o.d;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    public class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f5642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f5643b;

        public a(Context context, String str) {
            this.f5642a = context;
            this.f5643b = str;
        }

        @Override // c.d.a.n.i.o.d.a
        public File a() {
            File cacheDir = this.f5642a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f5643b != null ? new File(cacheDir, this.f5643b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public f(Context context, String str, int i2) {
        super(new a(context, str), i2);
    }
}
