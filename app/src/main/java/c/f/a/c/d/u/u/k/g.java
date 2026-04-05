package c.f.a.c.d.u.u.k;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public interface g extends IInterface {

    public static abstract class a extends c.f.a.c.j.c.a implements g {
        public static g c1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new i(iBinder);
        }
    }

    Bitmap m2(Uri uri);
}
