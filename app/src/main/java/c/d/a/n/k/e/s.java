package c.d.a.n.k.e;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class s implements c.d.a.n.k.e.a<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5762a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f5763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5764c;

    public static class a {
        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    public s() {
        this(f5762a, -1);
    }

    public s(a aVar, int i2) {
        this.f5763b = aVar;
        this.f5764c = i2;
    }

    public Bitmap a(ParcelFileDescriptor parcelFileDescriptor, c.d.a.n.i.n.c cVar, int i2, int i3, c.d.a.n.a aVar) throws IOException {
        MediaMetadataRetriever mediaMetadataRetrieverA = this.f5763b.a();
        mediaMetadataRetrieverA.setDataSource(parcelFileDescriptor.getFileDescriptor());
        int i4 = this.f5764c;
        Bitmap frameAtTime = i4 >= 0 ? mediaMetadataRetrieverA.getFrameAtTime(i4) : mediaMetadataRetrieverA.getFrameAtTime();
        mediaMetadataRetrieverA.release();
        parcelFileDescriptor.close();
        return frameAtTime;
    }
}
