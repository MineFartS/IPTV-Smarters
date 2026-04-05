package d.a.a.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import de.blinkt.openvpn.core.OpenVPNService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static s f30183a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f30186d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30184b = "org.torproject.android.intent.extra.SOCKS_PROXY_HOST";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30185c = "org.torproject.android.intent.extra.SOCKS_PROXY_PORT";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set<b> f30187e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BroadcastReceiver f30188f = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (TextUtils.equals(intent.getAction(), "org.torproject.android.intent.action.STATUS")) {
                Iterator it = s.this.f30187e.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).d(intent);
                }
                String stringExtra = intent.getStringExtra("org.torproject.android.intent.extra.STATUS");
                if (!TextUtils.equals(stringExtra, "ON")) {
                    if (TextUtils.equals(stringExtra, "STARTS_DISABLED")) {
                        Iterator it2 = s.this.f30187e.iterator();
                        while (it2.hasNext()) {
                            ((b) it2.next()).c(intent);
                        }
                        return;
                    }
                    return;
                }
                int intExtra = intent.getIntExtra(s.this.f30185c, 9050);
                String stringExtra2 = intent.getStringExtra(s.this.f30184b);
                if (TextUtils.isEmpty(stringExtra2)) {
                    stringExtra2 = "127.0.0.1";
                }
                Iterator it3 = s.this.f30187e.iterator();
                while (it3.hasNext()) {
                    ((b) it3.next()).a(intent, stringExtra2, intExtra);
                }
            }
        }
    }

    public interface b {
        void a(Intent intent, String str, int i2);

        void b();

        void c(Intent intent);

        void d(Intent intent);
    }

    public static boolean c(Context context) {
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(e(context), 0);
        return listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0;
    }

    public static s d(OpenVPNService openVPNService) {
        if (f30183a == null) {
            f30183a = new s();
        }
        return f30183a;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent("org.torproject.android.intent.action.START");
        intent.setPackage("org.torproject.android");
        intent.putExtra("org.torproject.android.intent.extra.PACKAGE_NAME", context.getPackageName());
        return intent;
    }

    public synchronized s b(Context context, b bVar) {
        if (this.f30187e.size() == 0) {
            context.getApplicationContext().registerReceiver(this.f30188f, new IntentFilter("org.torproject.android.intent.action.STATUS"));
            this.f30186d = context.getApplicationContext();
        }
        if (!c(context)) {
            bVar.b();
        }
        this.f30187e.add(bVar);
        return this;
    }

    public synchronized void f(b bVar) {
        this.f30187e.remove(bVar);
        if (this.f30187e.size() == 0) {
            this.f30186d.unregisterReceiver(this.f30188f);
        }
    }

    public void g() {
        Context context = this.f30186d;
        context.sendBroadcast(e(context));
    }
}
