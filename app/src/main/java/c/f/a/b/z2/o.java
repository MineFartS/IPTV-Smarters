package c.f.a.b.z2;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f11492a = new o() { // from class: c.f.a.b.z2.a
        @Override // c.f.a.b.z2.o
        public final j[] a() {
            return n.b();
        }

        @Override // c.f.a.b.z2.o
        public /* synthetic */ j[] b(Uri uri, Map map) {
            return n.a(this, uri, map);
        }
    };

    j[] a();

    j[] b(Uri uri, Map<String, List<String>> map);
}
