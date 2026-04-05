package de.blinkt.openvpn.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.Button;
import android.widget.CompoundButton;
import d.a.a.d.i;
import de.blinkt.openvpn.core.OpenVPNService;

/* JADX INFO: loaded from: classes2.dex */
public class ConfirmDialog extends Activity implements CompoundButton.OnCheckedChangeListener, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f30282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f30283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ServiceConnection f30284e = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ConfirmDialog.this.f30283d = i.a.J(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ConfirmDialog.this.f30283d = null;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        setResult(0);
        finish();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f30282c.setEnabled(z);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        if (i2 == -1) {
            try {
                this.f30283d.O1(this.f30281b);
                setResult(-1);
                finish();
            } catch (RemoteException e2) {
                e2.printStackTrace();
                throw new RuntimeException(e2);
            }
        }
        if (i2 == -2) {
            setResult(0);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        unbindService(this.f30284e);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Intent intent = new Intent(this, (Class<?>) OpenVPNService.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, this.f30284e, 1);
        Intent intent2 = getIntent();
        if (intent2.getStringExtra("android.intent.extra.PACKAGE_NAME") != null) {
            this.f30281b = intent2.getStringExtra("android.intent.extra.PACKAGE_NAME");
            return;
        }
        String callingPackage = getCallingPackage();
        this.f30281b = callingPackage;
        if (callingPackage == null) {
            finish();
        }
    }
}
