package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import c.f.c.q.x;
import c.f.c.u.c;
import c.f.c.u.g;
import c.f.c.u.h;
import c.f.c.u.s;
import c.f.c.u.t;
import c.f.c.u.u;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessagingService extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Queue<String> f24678g = new ArrayDeque(10);

    @Override // c.f.c.u.g
    public Intent c(Intent intent) {
        return x.b().c();
    }

    @Override // c.f.c.u.g
    public void d(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            m(intent);
            return;
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(action)) {
            if (s.B(intent)) {
                s.t(intent);
            }
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            r(intent.getStringExtra("token"));
        } else {
            String strValueOf = String.valueOf(intent.getAction());
            Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Unknown intent action: ".concat(strValueOf) : new String("Unknown intent action: "));
        }
    }

    @Override // c.f.c.u.g
    public boolean e(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        n(intent);
        return true;
    }

    public final boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = f24678g;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        String strValueOf = String.valueOf(str);
        Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Received duplicate message: ".concat(strValueOf) : new String("Received duplicate message: "));
        return true;
    }

    public final void k(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (t.t(extras)) {
            t tVar = new t(extras);
            ExecutorService executorServiceD = h.d();
            try {
                if (new c(this, tVar, executorServiceD).a()) {
                    return;
                }
                if (s.B(intent)) {
                    s.u(intent);
                }
            } finally {
                executorServiceD.shutdown();
            }
        }
        p(new u(extras));
    }

    public final String l(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    public final void m(Intent intent) {
        if (j(intent.getStringExtra("google.message_id"))) {
            return;
        }
        t(intent);
    }

    public final void n(Intent intent) {
        if (s.B(intent)) {
            s.v(intent);
        }
    }

    public void o() {
    }

    public void p(u uVar) {
    }

    public void q(String str) {
    }

    public void r(String str) {
    }

    public void s(String str, Exception exc) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "message_type"
            java.lang.String r0 = r7.getStringExtra(r0)
            java.lang.String r1 = "gcm"
            if (r0 != 0) goto Lb
            r0 = r1
        Lb:
            int r2 = r0.hashCode()
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r2) {
                case -2062414158: goto L32;
                case 102161: goto L2a;
                case 814694033: goto L20;
                case 814800675: goto L16;
                default: goto L15;
            }
        L15:
            goto L3c
        L16:
            java.lang.String r1 = "send_event"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3c
            r1 = 2
            goto L3d
        L20:
            java.lang.String r1 = "send_error"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3c
            r1 = 3
            goto L3d
        L2a:
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3c
            r1 = 0
            goto L3d
        L32:
            java.lang.String r1 = "deleted_messages"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3c
            r1 = 1
            goto L3d
        L3c:
            r1 = -1
        L3d:
            if (r1 == 0) goto L7f
            if (r1 == r5) goto L7b
            if (r1 == r4) goto L71
            if (r1 == r3) goto L5e
            java.lang.String r7 = "Received message with unknown type: "
            int r1 = r0.length()
            if (r1 == 0) goto L52
            java.lang.String r7 = r7.concat(r0)
            goto L58
        L52:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7)
            r7 = r0
        L58:
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.w(r0, r7)
            return
        L5e:
            java.lang.String r0 = r6.l(r7)
            c.f.c.u.w r1 = new c.f.c.u.w
            java.lang.String r2 = "error"
            java.lang.String r7 = r7.getStringExtra(r2)
            r1.<init>(r7)
            r6.s(r0, r1)
            return
        L71:
            java.lang.String r0 = "google.message_id"
            java.lang.String r7 = r7.getStringExtra(r0)
            r6.q(r7)
            return
        L7b:
            r6.o()
            return
        L7f:
            c.f.c.u.s.w(r7)
            r6.k(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.t(android.content.Intent):void");
    }
}
