package c.d.a.n.k.i;

import android.graphics.Bitmap;
import c.d.a.n.i.l;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class d implements c.d.a.n.f<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.d.a.n.f<Bitmap> f5840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.d.a.n.f<c.d.a.n.k.h.b> f5841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f5842c;

    public d(c.d.a.n.f<Bitmap> fVar, c.d.a.n.f<c.d.a.n.k.h.b> fVar2) {
        this.f5840a = fVar;
        this.f5841b = fVar2;
    }

    @Override // c.d.a.n.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(l<a> lVar, OutputStream outputStream) {
        a aVar = lVar.get();
        l<Bitmap> lVarA = aVar.a();
        return lVarA != null ? this.f5840a.a(lVarA, outputStream) : this.f5841b.a(aVar.b(), outputStream);
    }

    @Override // c.d.a.n.b
    public String getId() {
        if (this.f5842c == null) {
            this.f5842c = this.f5840a.getId() + this.f5841b.getId();
        }
        return this.f5842c;
    }
}
