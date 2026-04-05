package c.d.a.n.k.e;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class b implements c.d.a.n.f<Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap.CompressFormat f5710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5711b;

    public b() {
        this(null, 90);
    }

    public b(Bitmap.CompressFormat compressFormat, int i2) {
        this.f5710a = compressFormat;
        this.f5711b = i2;
    }

    @Override // c.d.a.n.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(c.d.a.n.i.l<Bitmap> lVar, OutputStream outputStream) {
        Bitmap bitmap = lVar.get();
        long jB = c.d.a.t.d.b();
        Bitmap.CompressFormat compressFormatC = c(bitmap);
        bitmap.compress(compressFormatC, this.f5711b, outputStream);
        if (!Log.isLoggable("BitmapEncoder", 2)) {
            return true;
        }
        Log.v("BitmapEncoder", "Compressed with type: " + compressFormatC + " of size " + c.d.a.t.h.e(bitmap) + " in " + c.d.a.t.d.a(jB));
        return true;
    }

    public final Bitmap.CompressFormat c(Bitmap bitmap) {
        Bitmap.CompressFormat compressFormat = this.f5710a;
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // c.d.a.n.b
    public String getId() {
        return "BitmapEncoder.com.bumptech.glide.load.resource.bitmap";
    }
}
