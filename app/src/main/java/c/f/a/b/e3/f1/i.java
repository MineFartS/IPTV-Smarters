package c.f.a.b.e3.f1;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<Uri, byte[]> f7268a;

    public class a extends LinkedHashMap<Uri, byte[]> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f7269b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i2, float f2, boolean z, int i3) {
            super(i2, f2, z);
            this.f7269b = i3;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f7269b;
        }
    }

    public i(int i2) {
        this.f7268a = new a(i2 + 1, 1.0f, false, i2);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f7268a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return this.f7268a.put((Uri) c.f.a.b.j3.g.e(uri), (byte[]) c.f.a.b.j3.g.e(bArr));
    }

    public byte[] c(Uri uri) {
        return this.f7268a.remove(c.f.a.b.j3.g.e(uri));
    }
}
