package minefarts.iptvsmarters.vpn;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import minefarts.iptvsmarters.R;
import d.a.a.d.i;
import d.a.a.d.v;
import d.a.a.d.z;
import de.blinkt.openvpn.LaunchVPN;
import de.blinkt.openvpn.core.OpenVPNService;

/* JADX INFO: loaded from: classes2.dex */
public class DisconnectVPN extends Activity implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f29903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f29904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ServiceConnection f29905d = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            DisconnectVPN.this.f29903b = i.a.J(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            DisconnectVPN.this.f29903b = null;
        }
    }

    public final void b() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.title_cancel);
        builder.setMessage(R.string.cancel_connection_query);
        builder.setNegativeButton(android.R.string.cancel, this);
        builder.setPositiveButton(R.string.cancel_connection, this);
        builder.setNeutralButton(R.string.reconnect, this);
        builder.setOnCancelListener(this);
        builder.show();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        if (i2 == -1) {
            v.s(this);
            i iVar = this.f29903b;
            if (iVar != null) {
                try {
                    iVar.e(false);
                } catch (RemoteException e2) {
                    z.r(e2);
                }
            }
        } else if (i2 == -3) {
            Intent intent = new Intent(this, (Class<?>) LaunchVPN.class);
            intent.putExtra("de.blinkt.openvpn.shortcutProfileUUID", z.g());
            intent.putExtra("username", c.h.a.h.n.a.P);
            intent.putExtra("password", c.h.a.h.n.a.Q);
            intent.setAction("android.intent.action.MAIN");
            startActivity(intent);
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.vpn_disconnect_layout);
        this.f29904c = this;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        unbindService(this.f29905d);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Intent intent = new Intent(this, (Class<?>) OpenVPNService.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, this.f29905d, 1);
        b();
    }
}
