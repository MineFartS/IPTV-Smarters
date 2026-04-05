package c.d.a;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import c.d.a.j;
import c.d.a.n.j.l;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class b<ModelType> extends a<ModelType, Bitmap> {
    public final l<ModelType, InputStream> J;
    public final l<ModelType, ParcelFileDescriptor> K;
    public final g L;
    public final j.d M;

    public b(e<ModelType, ?, ?, ?> eVar, l<ModelType, InputStream> lVar, l<ModelType, ParcelFileDescriptor> lVar2, j.d dVar) {
        super(I(eVar.f5324d, lVar, lVar2, Bitmap.class, null), Bitmap.class, eVar);
        this.J = lVar;
        this.K = lVar2;
        this.L = eVar.f5324d;
        this.M = dVar;
    }

    public static <A, R> c.d.a.q.e<A, c.d.a.n.j.g, Bitmap, R> I(g gVar, l<A, InputStream> lVar, l<A, ParcelFileDescriptor> lVar2, Class<R> cls, c.d.a.n.k.j.c<Bitmap, R> cVar) {
        if (lVar == null && lVar2 == null) {
            return null;
        }
        if (cVar == null) {
            cVar = gVar.f(Bitmap.class, cls);
        }
        return new c.d.a.q.e<>(new c.d.a.n.j.f(lVar, lVar2), cVar, gVar.a(c.d.a.n.j.g.class, Bitmap.class));
    }
}
