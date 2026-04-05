package d.a.a.b;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.nst.iptvsmarterstvbox.R;
import d.a.a.d.i;
import d.a.a.d.v;
import d.a.a.d.z;
import de.blinkt.openvpn.LaunchVPN;
import de.blinkt.openvpn.core.OpenVPNService;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Activity implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f30082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ServiceConnection f30083c = new ServiceConnectionC0298a();

    /* JADX INFO: renamed from: d.a.a.b.a$a, reason: collision with other inner class name */
    public class ServiceConnectionC0298a implements ServiceConnection {
        public ServiceConnectionC0298a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            a.this.f30082b = i.a.J(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            a.this.f30082b = null;
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
            i iVar = this.f30082b;
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
            intent.setAction("android.intent.action.MAIN");
            startActivity(intent);
        }
        finish();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        unbindService(this.f30083c);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Intent intent = new Intent(this, (Class<?>) OpenVPNService.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, this.f30083c, 1);
        b();
    }
}
