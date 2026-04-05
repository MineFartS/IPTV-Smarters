package c.f.a.c.d.u.u.k;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import c.f.a.c.j.c.t;
import c.f.a.c.j.c.v0;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends t implements g {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    @Override // c.f.a.c.d.u.u.k.g
    public final Bitmap m2(Uri uri) {
        Parcel parcelJ = J();
        v0.d(parcelJ, uri);
        Parcel parcelC1 = c1(1, parcelJ);
        Bitmap bitmap = (Bitmap) v0.b(parcelC1, Bitmap.CREATOR);
        parcelC1.recycle();
        return bitmap;
    }
}
