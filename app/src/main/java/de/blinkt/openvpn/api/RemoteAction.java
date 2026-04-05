package de.blinkt.openvpn.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.Toast;
import d.a.a.c.b;
import d.a.a.d.i;
import d.a.a.d.v;
import de.blinkt.openvpn.LaunchVPN;
import de.blinkt.openvpn.core.OpenVPNService;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteAction extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f30303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f30304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ServiceConnection f30305d = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            RemoteAction.this.f30304c = i.a.J(iBinder);
            try {
                RemoteAction.this.c();
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public final void c() {
        if (!this.f30304c.h0(getCallingPackage())) {
            finish();
            return;
        }
        Intent intent = getIntent();
        setIntent(null);
        ComponentName component = intent.getComponent();
        if (component.getShortClassName().equals(".api.DisconnectVPN")) {
            this.f30304c.e(false);
        } else if (component.getShortClassName().equals(".api.ConnectVPN")) {
            String stringExtra = intent.getStringExtra("de.blinkt.openvpn.api.profileName");
            d.a.a.a aVarJ = v.g(this).j(stringExtra);
            if (aVarJ == null) {
                Toast.makeText(this, String.format("Vpn profile %s from API call not found", stringExtra), 1).show();
            } else {
                Intent intent2 = new Intent(this, (Class<?>) LaunchVPN.class);
                intent2.putExtra("de.blinkt.openvpn.shortcutProfileUUID", aVarJ.E().toString());
                intent2.setAction("android.intent.action.MAIN");
                startActivity(intent2);
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.f30304c != null) {
            this.f30304c = null;
            getApplicationContext().unbindService(this.f30305d);
        }
        super.finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30303b = new b(this);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Intent intent = new Intent(this, (Class<?>) OpenVPNService.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        getApplicationContext().bindService(intent, this.f30305d, 1);
    }
}
