package c.f.a.c.j.c;

import android.app.Service;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f12853a = new c.f.a.c.d.v.b("CastDynamiteModule");

    public static c.f.a.c.d.u.u.k.g a(Context context, AsyncTask<Uri, Long, Bitmap> asyncTask, c.f.a.c.d.u.u.k.k kVar, int i2, int i3, boolean z, long j2, int i4, int i5, int i6) {
        try {
            return f(context.getApplicationContext()).F2(c.f.a.c.g.b.K2(asyncTask), kVar, i2, i3, z, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, 5, 333, Constants.MAXIMUM_UPLOAD_PARTS);
        } catch (RemoteException | c.f.a.c.d.u.z e2) {
            f12853a.b(e2, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", j.class.getSimpleName());
            return null;
        }
    }

    public static c.f.a.c.d.u.j0 b(Context context, c.f.a.c.d.u.c cVar, l lVar, Map<String, IBinder> map) {
        try {
            return f(context).k0(c.f.a.c.g.b.K2(context.getApplicationContext()), cVar, lVar, map);
        } catch (RemoteException e2) {
            f12853a.b(e2, "Unable to call %s on %s.", "newCastContextImpl", j.class.getSimpleName());
            return null;
        }
    }

    public static c.f.a.c.d.u.m0 c(Context context, c.f.a.c.d.u.c cVar, c.f.a.c.g.a aVar, c.f.a.c.d.u.h0 h0Var) {
        try {
            return f(context).D0(cVar, aVar, h0Var);
        } catch (RemoteException | c.f.a.c.d.u.z e2) {
            f12853a.b(e2, "Unable to call %s on %s.", "newCastSessionImpl", j.class.getSimpleName());
            return null;
        }
    }

    public static c.f.a.c.d.u.p0 d(Service service, c.f.a.c.g.a aVar, c.f.a.c.g.a aVar2) {
        try {
            return f(service.getApplicationContext()).s1(c.f.a.c.g.b.K2(service), aVar, aVar2);
        } catch (RemoteException | c.f.a.c.d.u.z e2) {
            f12853a.b(e2, "Unable to call %s on %s.", "newReconnectionServiceImpl", j.class.getSimpleName());
            return null;
        }
    }

    public static c.f.a.c.d.u.s0 e(Context context, String str, String str2, c.f.a.c.d.u.w wVar) {
        try {
            return f(context).j0(str, str2, wVar);
        } catch (RemoteException | c.f.a.c.d.u.z e2) {
            f12853a.b(e2, "Unable to call %s on %s.", "newSessionImpl", j.class.getSimpleName());
            return null;
        }
    }

    public static j f(Context context) throws c.f.a.c.d.u.z {
        try {
            IBinder iBinderD = DynamiteModule.e(context, DynamiteModule.f24259a, "com.google.android.gms.cast.framework.dynamite").d("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (iBinderD == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderD.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new i(iBinderD);
        } catch (DynamiteModule.a e2) {
            throw new c.f.a.c.d.u.z(e2);
        }
    }
}
