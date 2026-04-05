package c.f.a.c.d.u.u;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.cast.framework.media.MediaNotificationService;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaNotificationService f12113a;

    public t0(MediaNotificationService mediaNotificationService) {
        this.f12113a = mediaNotificationService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        PendingIntent pendingIntentS;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("targetActivity");
        Intent intent2 = new Intent();
        intent2.setComponent(componentName);
        if (this.f12113a.r.o()) {
            intent2.setFlags(603979776);
            pendingIntentS = PendingIntent.getActivity(context, 1, intent2, 134217728);
        } else {
            a.i.h.p pVarF = a.i.h.p.f(this.f12113a);
            pVarF.e(componentName);
            pVarF.a(intent2);
            pendingIntentS = pVarF.s(1, 134217728);
        }
        try {
            pendingIntentS.send(context, 1, new Intent().setFlags(268435456));
        } catch (PendingIntent.CanceledException e2) {
            MediaNotificationService.f24166b.b(e2, "Sending PendingIntent failed", new Object[0]);
        }
    }
}
