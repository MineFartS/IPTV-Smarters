package c.d.a.n.k.e;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public class h implements c.d.a.n.e<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f5724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.d.a.n.i.n.c f5725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.d.a.n.a f5726c;

    public h(c.d.a.n.i.n.c cVar, c.d.a.n.a aVar) {
        this(new s(), cVar, aVar);
    }

    public h(s sVar, c.d.a.n.i.n.c cVar, c.d.a.n.a aVar) {
        this.f5724a = sVar;
        this.f5725b = cVar;
        this.f5726c = aVar;
    }

    @Override // c.d.a.n.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.d.a.n.i.l<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3) {
        return c.c(this.f5724a.a(parcelFileDescriptor, this.f5725b, i2, i3, this.f5726c), this.f5725b);
    }

    @Override // c.d.a.n.e
    public String getId() {
        return "FileDescriptorBitmapDecoder.com.bumptech.glide.load.data.bitmap";
    }
}
