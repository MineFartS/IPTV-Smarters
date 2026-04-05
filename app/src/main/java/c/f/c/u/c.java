package c.f.c.u;

import a.i.h.j;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import c.f.c.u.a;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f16349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f16350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f16351c;

    public c(Context context, t tVar, Executor executor) {
        this.f16349a = executor;
        this.f16350b = context;
        this.f16351c = tVar;
    }

    public boolean a() {
        if (this.f16351c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        q qVarD = d();
        a.C0198a c0198aD = a.d(this.f16350b, this.f16351c);
        e(c0198aD.f16336a, qVarD);
        c(c0198aD);
        return true;
    }

    public final boolean b() {
        if (((KeyguardManager) this.f16350b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!c.f.a.c.f.t.l.g()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f16350b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == iMyPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void c(a.C0198a c0198a) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f16350b.getSystemService(TransferService.INTENT_KEY_NOTIFICATION)).notify(c0198a.f16337b, c0198a.f16338c, c0198a.f16336a.c());
    }

    public final q d() {
        q qVarL = q.l(this.f16351c.p("gcm.n.image"));
        if (qVarL != null) {
            qVarL.n(this.f16349a);
        }
        return qVarL;
    }

    public final void e(j.e eVar, q qVar) {
        if (qVar == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) c.f.a.c.o.l.b(qVar.m(), 5L, TimeUnit.SECONDS);
            eVar.s(bitmap);
            eVar.C(new j.b().n(bitmap).m(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            qVar.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            String strValueOf = String.valueOf(e2.getCause());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 26);
            sb.append("Failed to download image: ");
            sb.append(strValueOf);
            Log.w("FirebaseMessaging", sb.toString());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            qVar.close();
        }
    }
}
