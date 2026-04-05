package c.d.a.n.j;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class h implements c.d.a.n.b<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.d.a.n.b<InputStream> f5679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.d.a.n.b<ParcelFileDescriptor> f5680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5681c;

    public h(c.d.a.n.b<InputStream> bVar, c.d.a.n.b<ParcelFileDescriptor> bVar2) {
        this.f5679a = bVar;
        this.f5680b = bVar2;
    }

    @Override // c.d.a.n.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(g gVar, OutputStream outputStream) {
        c.d.a.n.b bVar;
        Closeable closeableA;
        if (gVar.b() != null) {
            bVar = this.f5679a;
            closeableA = gVar.b();
        } else {
            bVar = this.f5680b;
            closeableA = gVar.a();
        }
        return bVar.a(closeableA, outputStream);
    }

    @Override // c.d.a.n.b
    public String getId() {
        if (this.f5681c == null) {
            this.f5681c = this.f5679a.getId() + this.f5680b.getId();
        }
        return this.f5681c;
    }
}
