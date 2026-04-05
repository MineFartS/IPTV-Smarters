package com.nst.iptvsmarterstvbox.vpn.activities;

import a.b.k.b;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.h.a.h.n.e;
import c.h.a.k.f.l;
import com.amazonaws.services.s3.internal.Constants;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.callback.VPNServersCallback;
import com.nst.iptvsmarterstvbox.model.pojo.VPNServerPojo;
import com.nst.iptvsmarterstvbox.vpn.adapters.VpnProfileAdapter;
import d.a.a.d.f;
import d.a.a.d.i;
import d.a.a.d.u;
import d.a.a.d.v;
import d.a.a.d.y;
import d.a.a.d.z;
import de.blinkt.openvpn.core.OpenVPNStatusService;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class ProfileActivity extends a.b.k.c implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c.h.a.k.d.a.a f29936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a.b.k.b f29937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d.a.a.a f29938f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f29941i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f29942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f29943k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList<c.h.a.l.e.a> f29944l;

    @BindView
    public LinearLayout ll_add_new_profile;

    @BindView
    public LinearLayout ll_add_profile;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<c.h.a.l.e.a> f29945m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<c.h.a.l.e.b> f29946n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c.h.a.l.c.a f29947o;
    public Context p;

    @BindView
    public ProgressBar progressBar;

    @BindView
    public RecyclerView recyclerView;

    @BindView
    public RelativeLayout rl_bottom_message;
    public i s;
    public c.h.a.j.i t;

    @BindView
    public TextView tv_no_server_found;
    public int u;
    public String w;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29939g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f29940h = false;
    public String q = BuildConfig.FLAVOR;
    public String r = BuildConfig.FLAVOR;
    public ArrayList<c.h.a.l.e.a> v = null;
    public ServiceConnection x = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ProfileActivity.this.s = i.a.J(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ProfileActivity.this.s = null;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", ProfileActivity.this.getPackageName(), null));
                ProfileActivity.this.startActivityForResult(intent, 101);
                Toast.makeText(ProfileActivity.this.p, ProfileActivity.this.p.getResources().getString(R.string.grant_the_permission), 1).show();
            } catch (Exception unused) {
            }
            ProfileActivity.this.f29937e.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ProfileActivity.this.f29937e.dismiss();
            ProfileActivity.this.onBackPressed();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class d extends AsyncTask<Boolean, Void, Boolean> {
        public d() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Boolean... boolArr) {
            return ProfileActivity.this.H0();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (!bool.booleanValue()) {
                ProfileActivity.this.z0(false);
            } else {
                ProfileActivity.this.z0(true);
                ProfileActivity.this.K0();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            if (c.h.a.h.n.a.M.booleanValue()) {
                ProfileActivity.this.progressBar.setVisibility(0);
                ProfileActivity.this.ll_add_new_profile.setVisibility(8);
            }
        }
    }

    public void F0(File file) {
        try {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    F0(file2);
                }
            }
            file.delete();
        } catch (Exception unused) {
        }
    }

    public final void G0() {
        try {
            TextView textView = this.tv_no_server_found;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } catch (Exception unused) {
        }
    }

    public final Boolean H0() {
        try {
            this.f29944l = this.f29947o.q();
        } catch (Exception unused) {
        }
        ArrayList<c.h.a.l.e.a> arrayList = this.f29944l;
        return (arrayList == null || arrayList.size() <= 0) ? Boolean.FALSE : Boolean.TRUE;
    }

    public void I0() {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    return;
                }
                a.i.h.a.q(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 101);
            }
        } catch (Exception unused) {
        }
    }

    public void J0() {
        startActivity(new Intent(this, (Class<?>) ImportVPNActivity.class));
        finish();
    }

    public void K0() {
        this.recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        this.recyclerView.setAdapter(new VpnProfileAdapter(this.p, this.f29944l, this));
    }

    public final void L0(String str, String str2, String str3, File file, String str4, String str5, String str6) {
        c.h.a.l.e.a aVar = new c.h.a.l.e.a();
        if (str3.contains("auth-user-pass")) {
            aVar.k("1");
        } else {
            aVar.k("0");
        }
        aVar.o("0");
        aVar.t(str4);
        aVar.s(str5);
        aVar.q(str2);
        aVar.l(str);
        aVar.r("0");
        aVar.p(String.valueOf(file));
        aVar.m(str6);
        this.v.add(aVar);
    }

    public final void M0() {
        try {
            ProgressBar progressBar = this.progressBar;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = this.tv_no_server_found;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } catch (Exception unused) {
        }
    }

    public void N0() {
        new d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Boolean[0]);
    }

    @Override // c.h.a.k.f.b
    public void a() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    @Override // c.h.a.k.f.b
    public void c(String str) {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        Toast.makeText(this, str, 0).show();
    }

    @Override // c.h.a.k.f.l
    public void f(VPNServersCallback vPNServersCallback) {
        String strB;
        String strA;
        if (vPNServersCallback != null && vPNServersCallback.c() != null && vPNServersCallback.c().equals(Boolean.TRUE) && vPNServersCallback.a() != null) {
            if (vPNServersCallback.a().equalsIgnoreCase(e.P("Ka11484fbeedb2561981887ea65a38ac4*NB!@#12ZKWd-12345-" + c.h.a.f.b.f16735b + "-")) && vPNServersCallback.b() != null && vPNServersCallback.b().size() > 0) {
                G0();
                List<VPNServerPojo> listB = vPNServersCallback.b();
                for (int i2 = 0; i2 < listB.size(); i2++) {
                    try {
                        if (!listB.get(i2).d().equals(BuildConfig.FLAVOR)) {
                            String str = listB.get(i2).d() + ".ovpn";
                            File file = new File(this.p.getFilesDir(), str);
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            fileOutputStream.write(listB.get(i2).c().getBytes());
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            if (listB.get(i2).a() != null) {
                                strB = listB.get(i2).a().b();
                                strA = listB.get(i2).a().a();
                            } else {
                                strB = BuildConfig.FLAVOR;
                                strA = strB;
                            }
                            if (!this.f29947o.l(str, listB.get(i2).d(), String.valueOf(file))) {
                                L0(str, listB.get(i2).d(), listB.get(i2).c(), file, strB, strA, listB.get(i2).b());
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                ArrayList<c.h.a.l.e.a> arrayList = this.v;
                if (arrayList != null && arrayList.size() > 0) {
                    this.f29947o.d(this.v);
                }
                N0();
                return;
            }
        }
        M0();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 != 70) {
            if (i2 == 101) {
                try {
                    I0();
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        if (i3 == -1) {
            if (this.f29938f.L(this.f29942j, this.f29941i) != 0) {
                z.J("USER_VPN_PASSWORD", BuildConfig.FLAVOR, R.string.state_user_vpn_password, f.LEVEL_WAITING_FOR_USER_INPUT);
                d.a.a.a aVar = this.f29938f;
                aVar.D = this.q;
                String str = this.r;
                aVar.C = str;
                this.f29941i = str;
                bindService(new Intent(this, (Class<?>) OpenVPNStatusService.class), this.x, 1);
                return;
            }
            boolean z = u.a(this).getBoolean("showlogwindow", true);
            if (!this.f29939g && z) {
                v.u(this, this.f29938f);
            }
            y.f(this.f29938f, getBaseContext());
        } else {
            if (i3 != 0) {
                return;
            }
            z.J("USER_VPN_PERMISSION_CANCELLED", BuildConfig.FLAVOR, R.string.state_user_vpn_permission_cancelled, f.LEVEL_NOTCONNECTED);
            if (Build.VERSION.SDK_INT >= 24) {
                z.n(R.string.nought_alwayson_warning);
            }
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.p = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.p);
        f29936d = aVar;
        String strA = aVar.A();
        this.w = strA;
        setContentView(strA.equals(c.h.a.h.n.a.s0) ? R.layout.activity_profile_tv : R.layout.activity_profile);
        ButterKnife.a(this);
        this.t = new c.h.a.j.i(this.p, this);
        this.f29947o = new c.h.a.l.c.a(this.p);
        this.f29944l = new ArrayList<>();
        this.f29946n = new ArrayList<>();
        this.f29945m = new ArrayList<>();
        this.v = new ArrayList<>();
        try {
            I0();
        } catch (Exception unused) {
        }
        if (c.h.a.h.n.a.M.booleanValue()) {
            this.ll_add_new_profile.setVisibility(0);
            this.ll_add_profile.setVisibility(0);
        } else {
            F0(new File(String.valueOf(getFilesDir())));
            this.f29947o.n();
            this.ll_add_new_profile.setVisibility(8);
            this.ll_add_profile.setVisibility(8);
            y0();
            this.t.c(e.P("5bcad13a-1d8c-40af-9ba4-1e6f6bd0970a*NB!@#12ZKWd-" + c.h.a.f.b.f16735b));
        }
        this.f29943k = getIntent().getStringExtra("typeid");
        d.a.a.c.b bVar = new d.a.a.c.b(this.p);
        bVar.d();
        bVar.a("com.nst.iptvsmarterstvbox");
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity, a.i.h.a.c
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 != 101) {
            return;
        }
        try {
            if (iArr.length > 0 && iArr[0] == 0 && iArr[1] == 0) {
                I0();
            } else if (Build.VERSION.SDK_INT < 23 || shouldShowRequestPermissionRationale(strArr[0])) {
                onBackPressed();
            } else {
                b.a aVar = new b.a(this, R.style.AlertDialogCustom);
                View viewInflate = LayoutInflater.from(this).inflate(R.layout.permission_alertbox, (ViewGroup) null);
                Button button = (Button) viewInflate.findViewById(R.id.btn_grant);
                Button button2 = (Button) viewInflate.findViewById(R.id.btn_cancel);
                button.setOnFocusChangeListener(new e.j(button, this));
                button2.setOnFocusChangeListener(new e.j(button2, this));
                button.requestFocus();
                button.setOnClickListener(new b());
                button2.setOnClickListener(new c());
                aVar.setView(viewInflate);
                this.f29937e = aVar.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f29937e.getWindow();
                window.getClass();
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f29937e.show();
                this.f29937e.getWindow().setAttributes(layoutParams);
                this.f29937e.setCancelable(false);
                this.f29937e.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        if (c.h.a.h.n.a.M.booleanValue()) {
            N0();
        }
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @OnClick
    public void onclick(View view) {
        int id = view.getId();
        if (id == R.id.ll_add_new_profile || id == R.id.ll_add_profile) {
            J0();
        }
    }

    public void y0() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.u = iNextInt;
        c.h.a.f.b.f16735b = String.valueOf(iNextInt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r4 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z0(boolean r4) {
        /*
            r3 = this;
            android.widget.ProgressBar r0 = r3.progressBar
            r1 = 8
            r0.setVisibility(r1)
            java.lang.Boolean r0 = c.h.a.h.n.a.M
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L23
            if (r4 == 0) goto L18
            android.widget.LinearLayout r4 = r3.ll_add_new_profile
            r4.setVisibility(r1)
            goto L25
        L18:
            android.widget.LinearLayout r4 = r3.ll_add_new_profile
            r4.setVisibility(r2)
            android.widget.LinearLayout r4 = r3.ll_add_new_profile
            r4.requestFocus()
            goto L30
        L23:
            if (r4 == 0) goto L30
        L25:
            androidx.recyclerview.widget.RecyclerView r4 = r3.recyclerView
            r4.setVisibility(r2)
            android.widget.RelativeLayout r4 = r3.rl_bottom_message
            r4.setVisibility(r2)
            goto L3a
        L30:
            androidx.recyclerview.widget.RecyclerView r4 = r3.recyclerView
            r4.setVisibility(r1)
            android.widget.RelativeLayout r4 = r3.rl_bottom_message
            r4.setVisibility(r1)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.vpn.activities.ProfileActivity.z0(boolean):void");
    }
}
