package c.d.a;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import c.d.a.n.k.e.q;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class a<ModelType, TranscodeType> extends e<ModelType, c.d.a.n.j.g, Bitmap, TranscodeType> {
    public final c.d.a.n.i.n.c E;
    public c.d.a.n.k.e.f F;
    public c.d.a.n.a G;
    public c.d.a.n.e<InputStream, Bitmap> H;
    public c.d.a.n.e<ParcelFileDescriptor, Bitmap> I;

    public a(c.d.a.q.f<ModelType, c.d.a.n.j.g, Bitmap, TranscodeType> fVar, Class<TranscodeType> cls, e<ModelType, ?, ?, ?> eVar) {
        super(fVar, cls, eVar);
        this.F = c.d.a.n.k.e.f.f5717c;
        c.d.a.n.i.n.c cVarL = eVar.f5324d.l();
        this.E = cVarL;
        c.d.a.n.a aVarM = eVar.f5324d.m();
        this.G = aVarM;
        this.H = new q(cVarL, aVarM);
        this.I = new c.d.a.n.k.e.h(cVarL, this.G);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.d.a.e
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public a<ModelType, TranscodeType> h(c.d.a.n.e<c.d.a.n.j.g, Bitmap> eVar) {
        super.h(eVar);
        return this;
    }

    @Override // c.d.a.e
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public a<ModelType, TranscodeType> j(c.d.a.n.i.b bVar) {
        super.j(bVar);
        return this;
    }

    public a<ModelType, TranscodeType> C() {
        return H(this.f5324d.k());
    }

    @Override // c.d.a.e
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public a<ModelType, TranscodeType> p(int i2, int i3) {
        super.p(i2, i3);
        return this;
    }

    @Override // c.d.a.e
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public a<ModelType, TranscodeType> q(c.d.a.n.c cVar) {
        super.q(cVar);
        return this;
    }

    @Override // c.d.a.e
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public a<ModelType, TranscodeType> r(boolean z) {
        super.r(z);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.d.a.e
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public a<ModelType, TranscodeType> w(c.d.a.n.g<Bitmap>... gVarArr) {
        super.w(gVarArr);
        return this;
    }

    public a<ModelType, TranscodeType> H(c.d.a.n.k.e.d... dVarArr) {
        super.w(dVarArr);
        return this;
    }

    @Override // c.d.a.e
    public void b() {
        y();
    }

    @Override // c.d.a.e
    public void c() {
        C();
    }

    public a<ModelType, TranscodeType> y() {
        return H(this.f5324d.j());
    }

    @Override // c.d.a.e
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public a<ModelType, TranscodeType> g() {
        return (a) super.g();
    }
}
