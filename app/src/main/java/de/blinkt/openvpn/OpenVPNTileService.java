package de.blinkt.openvpn;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import android.widget.Toast;
import minefarts.iptvsmarters.R;
import d.a.a.d.f;
import d.a.a.d.i;
import d.a.a.d.v;
import d.a.a.d.z;
import de.blinkt.openvpn.core.OpenVPNService;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
public class OpenVPNTileService extends TileService implements z.e {

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d.a.a.a f30278b;

        public a(d.a.a.a aVar) {
            this.f30278b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenVPNTileService.this.b(this.f30278b);
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            i iVarJ = i.a.J(iBinder);
            if (iVarJ != null) {
                try {
                    iVarJ.e(false);
                } catch (RemoteException e2) {
                    z.r(e2);
                }
            }
            OpenVPNTileService.this.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    @Override // d.a.a.d.z.e
    public void I2(String str) {
    }

    @Override // d.a.a.d.z.e
    public void J(String str, String str2, int i2, f fVar, Intent intent) {
        try {
            Tile qsTile = getQsTile();
            if (fVar == f.LEVEL_AUTH_FAILED || fVar == f.LEVEL_NOTCONNECTED) {
                d.a.a.a aVarC = c();
                if (aVarC == null) {
                    qsTile.setLabel(getString(R.string.novpn_selected));
                    qsTile.setState(0);
                } else {
                    qsTile.setLabel(getString(R.string.qs_connect, new Object[]{aVarC.y()}));
                    qsTile.setState(1);
                }
            } else {
                d.a.a.a aVarC2 = v.c(getBaseContext(), z.g());
                qsTile.setLabel(getString(R.string.qs_disconnect, new Object[]{aVarC2 == null ? "null?!" : aVarC2.y()}));
                qsTile.setState(2);
            }
            qsTile.updateTile();
        } catch (Exception unused) {
        }
    }

    public final void b(d.a.a.a aVar) {
        if (!z.k()) {
            d(aVar, this);
            return;
        }
        Intent intent = new Intent(this, (Class<?>) OpenVPNService.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, new b(), 1);
    }

    @TargetApi(24)
    public d.a.a.a c() {
        return v.f(this);
    }

    @SuppressLint({"Override"})
    @TargetApi(24)
    public void d(d.a.a.a aVar, Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClass(context, LaunchVPN.class);
        intent.putExtra("de.blinkt.openvpn.shortcutProfileUUID", aVar.F());
        intent.setFlags(268435456);
        intent.putExtra("de.blinkt.openvpn.showNoLogWindow", true);
        context.startActivity(intent);
    }

    @Override // android.service.quicksettings.TileService
    @SuppressLint({"Override"})
    @TargetApi(24)
    public void onClick() {
        super.onClick();
        d.a.a.a aVarC = c();
        if (aVarC == null) {
            Toast.makeText(this, R.string.novpn_selected, 0).show();
        } else if (isLocked()) {
            unlockAndRun(new a(aVarC));
        } else {
            b(aVarC);
        }
    }

    @Override // android.service.quicksettings.TileService
    public void onStartListening() {
        super.onStartListening();
        z.c(this);
    }

    @Override // android.service.quicksettings.TileService
    public void onStopListening() {
        z.E(this);
        super.onStopListening();
    }

    @Override // android.service.quicksettings.TileService
    @TargetApi(24)
    public void onTileAdded() {
    }
}
