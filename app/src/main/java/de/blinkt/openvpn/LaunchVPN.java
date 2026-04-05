package de.blinkt.openvpn;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.net.VpnService;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.h.a.h.n.e;
import c.h.a.l.a.d;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.vpn.activities.ProfileActivity;
import com.skyfishjy.library.RippleBackground;
import d.a.a.d.i;
import d.a.a.d.j;
import d.a.a.d.u;
import d.a.a.d.v;
import d.a.a.d.y;
import d.a.a.d.z;
import de.blinkt.openvpn.core.OpenVPNService;
import de.blinkt.openvpn.core.OpenVPNStatusService;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import mbanje.kurt.fabbutton.FabButton;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class LaunchVPN extends a.b.k.c implements z.e, z.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c.h.a.k.d.a.a f30225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d.a.a.a f30226e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f30229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f30230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f30231j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f30232k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f30233l;

    @BindView
    public LinearLayout llConnecting;

    @BindView
    public LinearLayout llTapToConnect;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f30234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f30235n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f30236o;
    public int p;
    public d.a.a.d.i q;
    public c.h.a.l.a.d r;

    @BindView
    public RippleBackground ripplePulseLayoutConnected;
    public Context s;
    public FabButton t;

    @BindView
    public TextView tv_touch_status;
    public c.h.a.h.h u;
    public c.h.a.l.c.a v;
    public c.h.a.l.e.a w;
    public PopupWindow y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30227f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30228g = false;
    public FileInputStream x = null;
    public ServiceConnection z = new j();
    public ServiceConnection A = new k();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LaunchVPN.this.y.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LaunchVPN.this.y.dismiss();
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c.h.a.l.e.a f30240c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String[] f30241d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String[] f30242e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ EditText f30243f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ EditText f30244g;

        public c(String str, c.h.a.l.e.a aVar, String[] strArr, String[] strArr2, EditText editText, EditText editText2) {
            this.f30239b = str;
            this.f30240c = aVar;
            this.f30241d = strArr;
            this.f30242e = strArr2;
            this.f30243f = editText;
            this.f30244g = editText2;
        }

        public final boolean a() {
            Context context;
            String string;
            if (this.f30239b.equals("AUTH_FAILED")) {
                this.f30241d[0] = String.valueOf(this.f30243f.getText());
                this.f30242e[0] = String.valueOf(this.f30244g.getText());
                String[] strArr = this.f30241d;
                if (strArr[0] != null && strArr[0].equals(BuildConfig.FLAVOR)) {
                    context = LaunchVPN.this.s;
                    string = LaunchVPN.this.s.getResources().getString(R.string.enter_username_error);
                    Toast.makeText(context, string, 1).show();
                    return false;
                }
                String[] strArr2 = this.f30242e;
                if (strArr2[0] == null || !strArr2[0].equals(BuildConfig.FLAVOR)) {
                    String[] strArr3 = this.f30241d;
                    return (strArr3[0] == null || this.f30242e[0] == null || strArr3[0].equals(BuildConfig.FLAVOR) || this.f30242e[0].equals(BuildConfig.FLAVOR)) ? false : true;
                }
            } else {
                this.f30242e[0] = String.valueOf(this.f30244g.getText());
                String[] strArr4 = this.f30242e;
                if (strArr4[0] == null || !strArr4[0].equals(BuildConfig.FLAVOR)) {
                    String[] strArr5 = this.f30242e;
                    return (strArr5[0] == null || strArr5[0].equals(BuildConfig.FLAVOR)) ? false : true;
                }
            }
            context = LaunchVPN.this.s;
            string = LaunchVPN.this.s.getResources().getString(R.string.enter_password_error);
            Toast.makeText(context, string, 1).show();
            return false;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.l.e.a aVar;
            String str;
            if (a()) {
                if (this.f30239b.equals("AUTH_FAILED")) {
                    this.f30240c.t(this.f30241d[0]);
                    aVar = this.f30240c;
                    str = this.f30242e[0];
                } else {
                    this.f30240c.t(BuildConfig.FLAVOR);
                    aVar = this.f30240c;
                    str = this.f30242e[0];
                }
                aVar.s(str);
                LaunchVPN.this.v.v(this.f30240c);
                LaunchVPN.this.y.dismiss();
                LaunchVPN.this.w = this.f30240c;
                LaunchVPN.this.W0();
            }
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            LaunchVPN.this.finish();
        }
    }

    public class e implements DialogInterface.OnCancelListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            LaunchVPN.this.finish();
        }
    }

    public class f implements DialogInterface.OnDismissListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            LaunchVPN.this.finish();
        }
    }

    public class g implements d.a {
        public g() {
        }

        @Override // c.h.a.l.a.d.a
        public void a() {
            LaunchVPN.this.e1();
        }

        @Override // c.h.a.l.a.d.a
        public void b(String str) {
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30250b;

        public h(String str) {
            this.f30250b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f30250b.equalsIgnoreCase(LaunchVPN.this.getString(R.string.state_connected))) {
                LaunchVPN.this.d1();
                LaunchVPN launchVPN = LaunchVPN.this;
                launchVPN.T0(true, launchVPN.getResources().getString(R.string.state_connected));
                LaunchVPN.this.ripplePulseLayoutConnected.setVisibility(0);
            } else {
                if (!this.f30250b.equals("USERPAUSE")) {
                    String str = "AUTH_FAILED";
                    if (!this.f30250b.equals("AUTH_FAILED")) {
                        str = "AUTH_FAILED_PRIVATE_KEY";
                        if (!this.f30250b.equals("AUTH_FAILED_PRIVATE_KEY")) {
                            if (this.f30250b.equalsIgnoreCase("Not running") || this.f30250b.equalsIgnoreCase(LaunchVPN.this.getString(R.string.state_exiting)) || this.f30250b.equalsIgnoreCase("NOPROCESS")) {
                                LaunchVPN.this.g1();
                                LaunchVPN.this.u.c();
                                LaunchVPN.this.T0(false, BuildConfig.FLAVOR);
                                return;
                            }
                            if (this.f30250b.equalsIgnoreCase("WAIT") || this.f30250b.equalsIgnoreCase("AUTH") || this.f30250b.equalsIgnoreCase("GET_CONFIG") || this.f30250b.equalsIgnoreCase("NONETWORK") || this.f30250b.equalsIgnoreCase("VPN_GENERATE_CONFIG") || this.f30250b.equalsIgnoreCase("RECONNECTING") || this.f30250b.equalsIgnoreCase("RESOLVE") || this.f30250b.equalsIgnoreCase("AUTH_PENDING") || this.f30250b.equalsIgnoreCase("TCP_CONNECT")) {
                                LaunchVPN.this.g1();
                                LaunchVPN launchVPN2 = LaunchVPN.this;
                                launchVPN2.T0(true, launchVPN2.getResources().getString(R.string.state_connecting));
                                if (LaunchVPN.this.u.a()) {
                                    return;
                                }
                            } else {
                                LaunchVPN.this.g1();
                                LaunchVPN launchVPN3 = LaunchVPN.this;
                                launchVPN3.T0(true, launchVPN3.getResources().getString(R.string.state_connecting));
                                if (LaunchVPN.this.u.a()) {
                                    return;
                                }
                            }
                            LaunchVPN.this.u.b();
                            return;
                        }
                    }
                    LaunchVPN.this.g1();
                    LaunchVPN.this.u.c();
                    LaunchVPN.this.T0(false, BuildConfig.FLAVOR);
                    LaunchVPN.this.Z0(str);
                    return;
                }
                LaunchVPN.this.g1();
                LaunchVPN launchVPN4 = LaunchVPN.this;
                launchVPN4.T0(true, launchVPN4.getResources().getString(R.string.vpn_paused));
                if (!LaunchVPN.this.u.a()) {
                    return;
                }
            }
            LaunchVPN.this.u.c();
        }
    }

    public class i implements ServiceConnection {
        public i() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.a.a.d.i iVarJ = i.a.J(iBinder);
            if (iVarJ != null) {
                try {
                    iVarJ.e(false);
                } catch (RemoteException e2) {
                    z.r(e2);
                }
            }
            LaunchVPN.this.unbindService(this);
            if (!LaunchVPN.this.u.a()) {
                LaunchVPN.this.u.b();
            }
            LaunchVPN.this.Y0();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public class j implements ServiceConnection {
        public j() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            LaunchVPN.this.q = i.a.J(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            LaunchVPN.this.q = null;
        }
    }

    public class k implements ServiceConnection {
        public k() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.a.a.d.j jVarJ = j.a.J(iBinder);
            try {
                if (LaunchVPN.this.f30229h != null) {
                    jVarJ.W(LaunchVPN.this.f30226e.F(), 3, LaunchVPN.this.f30229h);
                }
                if (LaunchVPN.this.f30230i != null) {
                    jVarJ.W(LaunchVPN.this.f30226e.F(), 2, LaunchVPN.this.f30230i);
                }
                LaunchVPN.this.onActivityResult(70, -1, null);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
            LaunchVPN.this.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public class l implements View.OnClickListener {
        public l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LaunchVPN.this.y.dismiss();
            z.J("USER_VPN_PASSWORD_CANCELLED", BuildConfig.FLAVOR, R.string.state_user_vpn_password_cancelled, d.a.a.d.f.LEVEL_NOTCONNECTED);
            LaunchVPN.this.finish();
        }
    }

    public class m implements View.OnClickListener {
        public m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LaunchVPN.this.y.dismiss();
            z.J("USER_VPN_PASSWORD_CANCELLED", BuildConfig.FLAVOR, R.string.state_user_vpn_password_cancelled, d.a.a.d.f.LEVEL_NOTCONNECTED);
            LaunchVPN.this.finish();
        }
    }

    public class n implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c.h.a.l.e.a f30257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String[] f30258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EditText f30259d;

        public n(c.h.a.l.e.a aVar, String[] strArr, EditText editText) {
            this.f30257b = aVar;
            this.f30258c = strArr;
            this.f30259d = editText;
        }

        public final boolean a() {
            this.f30258c[0] = String.valueOf(this.f30259d.getText());
            String[] strArr = this.f30258c;
            if (strArr[0] == null || !strArr[0].equals(BuildConfig.FLAVOR)) {
                String[] strArr2 = this.f30258c;
                return (strArr2[0] == null || strArr2[0].equals(BuildConfig.FLAVOR)) ? false : true;
            }
            Toast.makeText(LaunchVPN.this.s, LaunchVPN.this.s.getResources().getString(R.string.enter_password_error), 1).show();
            return false;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a()) {
                this.f30257b.t(BuildConfig.FLAVOR);
                this.f30257b.s(this.f30258c[0]);
                LaunchVPN.this.v.v(this.f30257b);
                LaunchVPN.this.y.dismiss();
                LaunchVPN.this.f30230i = this.f30258c[0];
                Intent intent = new Intent(LaunchVPN.this, (Class<?>) OpenVPNStatusService.class);
                LaunchVPN launchVPN = LaunchVPN.this;
                launchVPN.bindService(intent, launchVPN.A, 1);
            }
        }
    }

    public class o implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30261b;

        public o(String str) {
            this.f30261b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (LaunchVPN.this.y != null && LaunchVPN.this.y.isShowing()) {
                LaunchVPN.this.y.dismiss();
            }
            LaunchVPN launchVPN = LaunchVPN.this;
            launchVPN.R0(launchVPN.w, this.f30261b);
        }
    }

    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (LaunchVPN.this.y == null || !LaunchVPN.this.y.isShowing()) {
                return;
            }
            LaunchVPN.this.y.dismiss();
        }
    }

    public class q implements PopupWindow.OnDismissListener {
        public q() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
        }
    }

    @Override // d.a.a.d.z.e
    public void I2(String str) {
    }

    @Override // d.a.a.d.z.e
    public void J(String str, String str2, int i2, d.a.a.d.f fVar, Intent intent) {
        runOnUiThread(new h(str));
    }

    public final void P0(int i2) {
        try {
            View viewInflate = ((LayoutInflater) this.s.getSystemService("layout_inflater")).inflate(R.layout.layout_authenticate_vpn, (RelativeLayout) ((Activity) this.s).findViewById(R.id.rl_authenticate_vpn));
            PopupWindow popupWindow = new PopupWindow(this.s);
            this.y = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.y.setWidth(-1);
            this.y.setHeight(-1);
            this.y.setFocusable(true);
            this.y.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(R.id.bt_save_and_connect);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            if (button != null) {
                button.setOnFocusChangeListener(new e.j(button, (Activity) this.s));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new e.j(button2, (Activity) this.s));
            }
            ((TextView) viewInflate.findViewById(R.id.tv_movie_id)).setText("Need Private Key Password");
            EditText editText = (EditText) viewInflate.findViewById(R.id.tv_vpn_username);
            editText.setVisibility(8);
            EditText editText2 = (EditText) viewInflate.findViewById(R.id.tv_vpn_password);
            TextView textView = (TextView) viewInflate.findViewById(R.id.et_description);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_cancel);
            textView.setText(this.s.getResources().getString(R.string.vpn_profile_desc) + " " + this.f30226e.f30070f);
            if (this.s.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText.setGravity(21);
                editText2.setGravity(21);
            }
            String[] strArr = {BuildConfig.FLAVOR};
            if (button2 != null) {
                button2.setOnClickListener(new l());
            }
            if (imageView != null) {
                imageView.setOnClickListener(new m());
            }
            if (button != null) {
                button.setOnClickListener(new n(this.w, strArr, editText2));
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void Q0() {
        Intent intent = new Intent(this, (Class<?>) OpenVPNService.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, new i(), 1);
    }

    public final void R0(c.h.a.l.e.a aVar, String str) {
        new c.h.a.l.e.a();
        try {
            View viewInflate = ((LayoutInflater) this.s.getSystemService("layout_inflater")).inflate(R.layout.layout_authenticate_vpn, (RelativeLayout) ((Activity) this.s).findViewById(R.id.rl_authenticate_vpn));
            PopupWindow popupWindow = new PopupWindow(this.s);
            this.y = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.y.setWidth(-1);
            this.y.setHeight(-1);
            this.y.setFocusable(true);
            this.y.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(R.id.bt_save_and_connect);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            if (button != null) {
                button.setOnFocusChangeListener(new e.j(button, (Activity) this.s));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new e.j(button2, (Activity) this.s));
            }
            EditText editText = (EditText) viewInflate.findViewById(R.id.tv_vpn_username);
            EditText editText2 = (EditText) viewInflate.findViewById(R.id.tv_vpn_password);
            TextView textView = (TextView) viewInflate.findViewById(R.id.et_description);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_cancel);
            if (str.equals("AUTH_FAILED")) {
                editText.setVisibility(0);
            } else if (str.equals("AUTH_FAILED_PRIVATE_KEY")) {
                editText.setVisibility(8);
            }
            editText.setText(aVar.h());
            editText2.setText(aVar.g());
            textView.setText(this.s.getResources().getString(R.string.vpn_profile_desc) + " " + aVar.e());
            if (this.s.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText.setGravity(21);
                editText2.setGravity(21);
            }
            String[] strArr = {BuildConfig.FLAVOR};
            String[] strArr2 = {BuildConfig.FLAVOR};
            if (button2 != null) {
                button2.setOnClickListener(new a());
            }
            if (imageView != null) {
                imageView.setOnClickListener(new b());
            }
            if (button != null) {
                button.setOnClickListener(new c(str, aVar, strArr, strArr2, editText, editText2));
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public final void S0(String str) {
        try {
            if (new ProcessBuilder("su", "-c", str).start().waitFor() == 0) {
                this.f30228g = true;
            }
        } catch (IOException | InterruptedException e2) {
            z.s("SU command", e2);
        }
    }

    public void T0(boolean z, String str) {
        if (!z) {
            this.llConnecting.setVisibility(8);
            this.llTapToConnect.setVisibility(0);
        } else {
            this.llConnecting.setVisibility(0);
            this.llTapToConnect.setVisibility(8);
            this.tv_touch_status.setText(str);
        }
    }

    public final void U0() {
        if (!z.k()) {
            this.llConnecting.setVisibility(0);
            this.llTapToConnect.setVisibility(8);
            if (!this.u.a()) {
                this.u.b();
            }
            Y0();
            return;
        }
        v.s(this.s);
        d.a.a.d.i iVar = this.q;
        if (iVar != null) {
            try {
                iVar.e(false);
            } catch (RemoteException e2) {
                z.r(e2);
            }
        }
    }

    public void V0() {
        int iB = this.f30226e.b(this);
        if (iB != R.string.no_error_found) {
            a1(iB);
            return;
        }
        Intent intentPrepare = VpnService.prepare(this);
        SharedPreferences sharedPreferencesA = u.a(this);
        boolean z = sharedPreferencesA.getBoolean("useCM9Fix", false);
        if (sharedPreferencesA.getBoolean("loadTunModule", false)) {
            S0("insmod /system/lib/modules/tun.ko");
        }
        if (z && !this.f30228g) {
            S0("chown system /dev/tun");
        }
        if (intentPrepare == null) {
            onActivityResult(70, -1, null);
            return;
        }
        z.J("USER_VPN_PERMISSION", BuildConfig.FLAVOR, R.string.state_user_vpn_permission, d.a.a.d.f.LEVEL_WAITING_FOR_USER_INPUT);
        try {
            startActivityForResult(intentPrepare, 70);
        } catch (ActivityNotFoundException unused) {
            z.n(R.string.no_vpn_support_image);
        }
    }

    public void W0() {
        c.h.a.l.e.a aVar;
        if (!z.k()) {
            if (!this.u.a()) {
                this.u.b();
            }
            Y0();
            return;
        }
        d.a.a.a aVarI = v.i();
        if (aVarI == null || aVarI.f30070f == null || (aVar = this.w) == null || aVar.e() == null || aVarI.f30070f.equals(this.w.e())) {
            return;
        }
        v.s(this.s);
        Q0();
    }

    @TargetApi(17)
    public final void X0(AlertDialog.Builder builder) {
        builder.setOnDismissListener(new f());
    }

    public final void Y0() {
        c.h.a.l.e.a aVar = this.w;
        if (aVar != null) {
            this.f30236o = aVar.h();
            this.f30235n = this.w.g();
            this.f30233l = this.w.e();
            this.f30234m = this.w.d();
            this.p = this.w.c();
            this.x = null;
            try {
                this.x = new FileInputStream(this.f30234m);
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
            }
            if (this.x != null) {
                FileInputStream fileInputStream = this.x;
                String str = this.f30233l;
                c.h.a.l.a.d dVar = new c.h.a.l.a.d(this, fileInputStream, str, this.f30234m, str, new g());
                this.r = dVar;
                dVar.execute(new Void[0]);
                return;
            }
            Toast.makeText(this.s, this.f30233l + " profile not found.", 0).show();
            g1();
            this.u.c();
            T0(false, BuildConfig.FLAVOR);
        }
    }

    public final void Z0(String str) {
        String str2;
        try {
            View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.usernam_password_worng_alert, (RelativeLayout) findViewById(R.id.rl_password_verification));
            PopupWindow popupWindow = new PopupWindow(this);
            this.y = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.y.setWidth(-1);
            this.y.setHeight(-1);
            this.y.setFocusable(true);
            this.y.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(R.id.btn_ok);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_need_permission);
            if (!str.equals("AUTH_FAILED")) {
                str2 = str.equals("AUTH_FAILED_PRIVATE_KEY") ? "Authenticate failed ! Invalid private key password" : "Authenticate failed ! Invalid Username or password";
                Button button2 = (Button) viewInflate.findViewById(R.id.btn_edit_profile);
                button.setOnFocusChangeListener(new e.j(button, this));
                button2.setOnFocusChangeListener(new e.j(button2, this));
                button2.setOnClickListener(new o(str));
                button.setOnClickListener(new p());
                this.y.setOnDismissListener(new q());
            }
            textView.setText(str2);
            Button button22 = (Button) viewInflate.findViewById(R.id.btn_edit_profile);
            button.setOnFocusChangeListener(new e.j(button, this));
            button22.setOnFocusChangeListener(new e.j(button22, this));
            button22.setOnClickListener(new o(str));
            button.setOnClickListener(new p());
            this.y.setOnDismissListener(new q());
        } catch (Exception unused) {
        }
    }

    public void a1(int i2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.config_error_found);
        builder.setMessage(i2);
        builder.setPositiveButton(android.R.string.ok, new d());
        builder.setOnCancelListener(new e());
        if (Build.VERSION.SDK_INT >= 22) {
            X0(builder);
        }
        builder.show();
    }

    public final void b1() {
        this.u.c();
        g1();
        T0(false, BuildConfig.FLAVOR);
    }

    @Override // d.a.a.d.z.b
    public void c1(long j2, long j3, long j4, long j5) {
    }

    public final void d1() {
        this.ripplePulseLayoutConnected.e();
    }

    public void e1() {
        try {
            f1(v.g(this).j(this.f30233l));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void f1(d.a.a.a aVar) {
        c.h.a.h.n.a.Q = this.f30236o;
        c.h.a.h.n.a.P = this.f30235n;
        c.h.a.h.n.a.N = this.p;
        String str = this.f30233l;
        if (str != null && str.contains(".ovpn")) {
            this.f30233l = this.f30233l.replaceAll(".ovpn", BuildConfig.FLAVOR);
        }
        c.h.a.h.n.a.O = this.f30233l;
        c.h.a.h.n.a.R = this.f30234m;
        c.h.a.h.n.a.N = this.p;
        if (u.a(this).getBoolean("clearlogconnect", true)) {
            z.d();
        }
        d.a.a.a aVarC = v.c(this, aVar.E().toString());
        if (aVarC == null) {
            z.n(R.string.shortcut_profile_notfound);
            return;
        }
        this.f30226e = aVarC;
        this.f30231j = this.f30236o;
        this.f30232k = this.f30235n;
        V0();
    }

    public final void g1() {
        this.ripplePulseLayoutConnected.f();
        this.ripplePulseLayoutConnected.clearAnimation();
    }

    public final void init() {
        this.s = this;
        FabButton fabButton = (FabButton) findViewById(R.id.determinate);
        this.t = fabButton;
        this.u = new c.h.a.h.h(fabButton, this);
        this.v = new c.h.a.l.c.a(this.s);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        Intent intent2;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 70) {
            if (i3 != -1) {
                if (i3 == 0) {
                    z.J("USER_VPN_PERMISSION_CANCELLED", BuildConfig.FLAVOR, R.string.state_user_vpn_permission_cancelled, d.a.a.d.f.LEVEL_NOTCONNECTED);
                    if (Build.VERSION.SDK_INT >= 24) {
                        z.n(R.string.nought_alwayson_warning);
                    }
                    b1();
                    return;
                }
                return;
            }
            d.a.a.a aVar = this.f30226e;
            if (aVar != null) {
                int iL = aVar.L(this.f30230i, this.f30229h);
                if (iL == 0) {
                    z.J("USER_VPN_PASSWORD", BuildConfig.FLAVOR, R.string.state_user_vpn_password, d.a.a.d.f.LEVEL_WAITING_FOR_USER_INPUT);
                    d.a.a.a aVar2 = this.f30226e;
                    aVar2.D = this.f30231j;
                    String str = this.f30232k;
                    aVar2.C = str;
                    this.f30229h = str;
                    u.a(this);
                    v.u(this, this.f30226e);
                    y.f(this.f30226e, getBaseContext());
                    return;
                }
                if (iL == R.string.private_key_password) {
                    z.J("USER_VPN_PASSWORD", BuildConfig.FLAVOR, R.string.state_user_vpn_password, d.a.a.d.f.LEVEL_WAITING_FOR_USER_INPUT);
                    if (this.f30232k.equals(BuildConfig.FLAVOR)) {
                        this.f30226e.D = BuildConfig.FLAVOR;
                        P0(iL);
                        return;
                    } else {
                        this.f30226e.D = BuildConfig.FLAVOR;
                        this.f30230i = this.f30232k;
                        intent2 = new Intent(this, (Class<?>) OpenVPNStatusService.class);
                    }
                } else {
                    z.J("USER_VPN_PASSWORD", BuildConfig.FLAVOR, R.string.state_user_vpn_password, d.a.a.d.f.LEVEL_WAITING_FOR_USER_INPUT);
                    d.a.a.a aVar3 = this.f30226e;
                    aVar3.D = this.f30231j;
                    String str2 = this.f30232k;
                    aVar3.C = str2;
                    this.f30229h = str2;
                    intent2 = new Intent(this, (Class<?>) OpenVPNStatusService.class);
                }
                bindService(intent2, this.A, 1);
            }
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.s = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.s);
        f30225d = aVar;
        setContentView(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_vpn_conntected_tv : R.layout.activity_vpn_conntected);
        ButterKnife.a(this);
        init();
        Intent intent = getIntent();
        if (this.w == null) {
            c.h.a.l.e.a aVar2 = (c.h.a.l.e.a) intent.getSerializableExtra("vpnProfile");
            this.w = aVar2;
            if (aVar2 == null) {
                this.w = c.h.a.i.o.a().b();
            }
            c.h.a.i.o.a().c(this.w);
        }
        W0();
        try {
            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        ServiceConnection serviceConnection = this.z;
        if (serviceConnection != null) {
            unbindService(serviceConnection);
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        z.c(this);
        z.a(this);
        Intent intent = new Intent(this, (Class<?>) OpenVPNService.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, this.z, 1);
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStop() {
        z.E(this);
        z.C(this);
        super.onStop();
    }

    @OnClick
    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.determinate /* 2131427832 */:
            case R.id.fabbutton_circle /* 2131427980 */:
            case R.id.fabbutton_ring /* 2131427981 */:
                U0();
                break;
            case R.id.iv_add_more /* 2131428100 */:
            case R.id.ll_manage_profile /* 2131428403 */:
            case R.id.tv_add_user /* 2131429286 */:
                startActivity(new Intent(this, (Class<?>) ProfileActivity.class));
                break;
        }
    }
}
