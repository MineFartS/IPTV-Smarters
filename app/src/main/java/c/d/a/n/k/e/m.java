package c.d.a.n.k.e;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class m implements c.d.a.n.e<c.d.a.n.j.g, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.d.a.n.e<InputStream, Bitmap> f5743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.d.a.n.e<ParcelFileDescriptor, Bitmap> f5744b;

    public m(c.d.a.n.e<InputStream, Bitmap> eVar, c.d.a.n.e<ParcelFileDescriptor, Bitmap> eVar2) {
        this.f5743a = eVar;
        this.f5744b = eVar2;
    }

    @Override // c.d.a.n.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.d.a.n.i.l<Bitmap> a(c.d.a.n.j.g gVar, int i2, int i3) {
        c.d.a.n.i.l<Bitmap> lVarA;
        ParcelFileDescriptor parcelFileDescriptorA;
        InputStream inputStreamB = gVar.b();
        if (inputStreamB != null) {
            try {
                lVarA = this.f5743a.a(inputStreamB, i2, i3);
            } catch (IOException e2) {
                if (Log.isLoggable("ImageVideoDecoder", 2)) {
                    Log.v("ImageVideoDecoder", "Failed to load image from stream, trying FileDescriptor", e2);
                }
                lVarA = null;
            }
        } else {
            lVarA = null;
        }
        return (lVarA != null || (parcelFileDescriptorA = gVar.a()) == null) ? lVarA : this.f5744b.a(parcelFileDescriptorA, i2, i3);
    }

    @Override // c.d.a.n.e
    public String getId() {
        return "ImageVideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }
}
