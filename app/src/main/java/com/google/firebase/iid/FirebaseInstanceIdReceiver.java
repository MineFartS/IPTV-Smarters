package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import c.f.a.c.e.a;
import c.f.a.c.e.b;
import c.f.a.c.o.l;
import c.f.c.q.f;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends b {
    public static Intent h(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // c.f.a.c.e.b
    public int b(Context context, a aVar) {
        try {
            return ((Integer) l.a(new f(context).g(aVar.I()))).intValue();
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseInstanceId", "Failed to send message to service.", e2);
            return 500;
        }
    }

    @Override // c.f.a.c.e.b
    public void c(Context context, Bundle bundle) {
        try {
            l.a(new f(context).g(h(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle)));
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseInstanceId", "Failed to send notification dismissed event to service.", e2);
        }
    }

    @Override // c.f.a.c.e.b
    public void d(Context context, Bundle bundle) {
        try {
            l.a(new f(context).g(h(context, "com.google.firebase.messaging.NOTIFICATION_OPEN", bundle)));
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseInstanceId", "Failed to send notification open event to service.", e2);
        }
    }
}
