package c.f.a.c.e;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import c.f.a.c.e.e;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f12245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static PendingIntent f12246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Executor f12247c = d0.f12255a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f12249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f12250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f12251g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Messenger f12253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f12254j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("responseCallbacks")
    public final a.f.i<String, c.f.a.c.o.j<Bundle>> f12248d = new a.f.i<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Messenger f12252h = new Messenger(new c0(this, Looper.getMainLooper()));

    public d(Context context) {
        this.f12249e = context;
        this.f12250f = new v(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f12251g = scheduledThreadPoolExecutor;
    }

    public static final /* synthetic */ Bundle b(c.f.a.c.o.i iVar) throws IOException {
        if (iVar.o()) {
            return (Bundle) iVar.k();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(iVar.j());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(strValueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", iVar.j());
    }

    public static final /* synthetic */ c.f.a.c.o.i c(Bundle bundle) {
        return l(bundle) ? c.f.a.c.o.l.e(null) : c.f.a.c.o.l.e(bundle);
    }

    public static synchronized String e() {
        int i2;
        i2 = f12245a;
        f12245a = i2 + 1;
        return Integer.toString(i2);
    }

    public static synchronized void f(Context context, Intent intent) {
        if (f12246b == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            f12246b = PendingIntent.getBroadcast(context, 0, intent2, 0);
        }
        intent.putExtra("app", f12246b);
    }

    public static final /* synthetic */ void i(c.f.a.c.o.j jVar) {
        if (jVar.d(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }

    public static boolean l(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public c.f.a.c.o.i<Bundle> a(final Bundle bundle) {
        if (this.f12250f.c() >= 12000000) {
            return i.c(this.f12249e).f(1, bundle).h(f12247c, x.f12292a);
        }
        return !(this.f12250f.a() != 0) ? c.f.a.c.o.l.d(new IOException("MISSING_INSTANCEID_SERVICE")) : m(bundle).i(f12247c, new c.f.a.c.o.a(this, bundle) { // from class: c.f.a.c.e.z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f12294a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Bundle f12295b;

            {
                this.f12294a = this;
                this.f12295b = bundle;
            }

            @Override // c.f.a.c.o.a
            public final Object a(c.f.a.c.o.i iVar) {
                return this.f12294a.d(this.f12295b, iVar);
            }
        });
    }

    public final /* synthetic */ c.f.a.c.o.i d(Bundle bundle, c.f.a.c.o.i iVar) {
        return (iVar.o() && l((Bundle) iVar.k())) ? m(bundle).p(f12247c, a0.f12238a) : iVar;
    }

    public final void g(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new e.a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof e) {
                        this.f12254j = (e) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f12253i = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String strValueOf = String.valueOf(action);
                        Log.d("Rpc", strValueOf.length() != 0 ? "Unexpected response action: ".concat(strValueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        j(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String strValueOf2 = String.valueOf(intent2.getExtras());
                    StringBuilder sb = new StringBuilder(strValueOf2.length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(strValueOf2);
                    Log.w("Rpc", sb.toString());
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (this.f12248d) {
                        for (int i2 = 0; i2 < this.f12248d.size(); i2++) {
                            j(this.f12248d.j(i2), intent2.getExtras());
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !"ID".equals(strArrSplit[1])) {
                    Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                j(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    public final void j(String str, Bundle bundle) {
        synchronized (this.f12248d) {
            c.f.a.c.o.j<Bundle> jVarRemove = this.f12248d.remove(str);
            if (jVarRemove != null) {
                jVarRemove.c(bundle);
            } else {
                String strValueOf = String.valueOf(str);
                Log.w("Rpc", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
            }
        }
    }

    public final /* synthetic */ void k(String str, ScheduledFuture scheduledFuture, c.f.a.c.o.i iVar) {
        synchronized (this.f12248d) {
            this.f12248d.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c.f.a.c.o.i<android.os.Bundle> m(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.e.d.m(android.os.Bundle):c.f.a.c.o.i");
    }
}
