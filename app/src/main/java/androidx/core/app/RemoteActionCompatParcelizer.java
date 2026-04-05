package androidx.core.app;

import a.d0.b;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f4349a = (IconCompat) bVar.v(remoteActionCompat.f4349a, 1);
        remoteActionCompat.f4350b = bVar.l(remoteActionCompat.f4350b, 2);
        remoteActionCompat.f4351c = bVar.l(remoteActionCompat.f4351c, 3);
        remoteActionCompat.f4352d = (PendingIntent) bVar.r(remoteActionCompat.f4352d, 4);
        remoteActionCompat.f4353e = bVar.h(remoteActionCompat.f4353e, 5);
        remoteActionCompat.f4354f = bVar.h(remoteActionCompat.f4354f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.x(false, false);
        bVar.M(remoteActionCompat.f4349a, 1);
        bVar.D(remoteActionCompat.f4350b, 2);
        bVar.D(remoteActionCompat.f4351c, 3);
        bVar.H(remoteActionCompat.f4352d, 4);
        bVar.z(remoteActionCompat.f4353e, 5);
        bVar.z(remoteActionCompat.f4354f, 6);
    }
}
