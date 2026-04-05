package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.h.n.e;
import c.h.a.i.q.f;
import c.h.a.i.q.g;
import c.h.a.i.q.m;
import com.amazonaws.services.s3.internal.Constants;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.activity.LoginActivity;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k.x;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import o.l;
import o.m;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class FreeTrailActivity extends a.b.k.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static InputFilter f24711d = new d();
    public ProgressDialog B;
    public String C;
    public SharedPreferences D;
    public SharedPreferences.Editor E;
    public SharedPreferences F;
    public SharedPreferences G;
    public SharedPreferences H;
    public SharedPreferences.Editor I;
    public Boolean J;
    public SharedPreferences K;
    public SharedPreferences.Editor L;
    public f M;
    public SharedPreferences.Editor N;
    public SharedPreferences O;
    public c.h.a.i.q.a P;
    public g Q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EditText f24712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f24713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EditText f24714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EditText f24715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f24716i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f24717j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f24722o;
    public String p;

    @BindView
    public RelativeLayout rl_already_register;

    @BindView
    public RelativeLayout rl_bt_submit;

    @BindView
    public RelativeLayout rl_confirmpassword;

    @BindView
    public RelativeLayout rl_email;

    @BindView
    public RelativeLayout rl_password;

    @BindView
    public RelativeLayout rl_username;
    public int x;
    public Context y;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f24718k = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f24719l = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f24720m = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f24721n = BuildConfig.FLAVOR;
    public String q = BuildConfig.FLAVOR;
    public String r = BuildConfig.FLAVOR;
    public String s = BuildConfig.FLAVOR;
    public String t = BuildConfig.FLAVOR;
    public long u = -1;
    public String v = BuildConfig.FLAVOR;
    public String w = Build.MODEL;
    public String z = BuildConfig.FLAVOR;
    public long A = -1;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FreeTrailActivity.this.startActivity(new Intent(FreeTrailActivity.this, (Class<?>) LoginActivity.class));
            FreeTrailActivity.this.finish();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public final void a() {
            Context context;
            Resources resources;
            int i2;
            FreeTrailActivity freeTrailActivity = FreeTrailActivity.this;
            freeTrailActivity.f24718k = freeTrailActivity.f24714g.getText().toString().trim();
            FreeTrailActivity freeTrailActivity2 = FreeTrailActivity.this;
            freeTrailActivity2.f24719l = freeTrailActivity2.f24712e.getText().toString().trim();
            FreeTrailActivity freeTrailActivity3 = FreeTrailActivity.this;
            freeTrailActivity3.f24720m = freeTrailActivity3.f24713f.getText().toString().trim();
            FreeTrailActivity freeTrailActivity4 = FreeTrailActivity.this;
            freeTrailActivity4.f24721n = freeTrailActivity4.f24715h.getText().toString().trim();
            if (FreeTrailActivity.this.f24718k.isEmpty()) {
                FreeTrailActivity freeTrailActivity5 = FreeTrailActivity.this;
                context = freeTrailActivity5.y;
                resources = freeTrailActivity5.getResources();
                i2 = R.string.please_enter_email;
            } else {
                FreeTrailActivity freeTrailActivity6 = FreeTrailActivity.this;
                if (!freeTrailActivity6.O0(freeTrailActivity6.f24718k)) {
                    FreeTrailActivity freeTrailActivity7 = FreeTrailActivity.this;
                    context = freeTrailActivity7.y;
                    resources = freeTrailActivity7.getResources();
                    i2 = R.string.wrong_format;
                } else if (FreeTrailActivity.this.f24719l.isEmpty()) {
                    FreeTrailActivity freeTrailActivity8 = FreeTrailActivity.this;
                    context = freeTrailActivity8.y;
                    resources = freeTrailActivity8.getResources();
                    i2 = R.string.please_enter_username;
                } else if (FreeTrailActivity.this.f24720m.isEmpty()) {
                    FreeTrailActivity freeTrailActivity9 = FreeTrailActivity.this;
                    context = freeTrailActivity9.y;
                    resources = freeTrailActivity9.getResources();
                    i2 = R.string.please_enter_password;
                } else if (FreeTrailActivity.this.f24721n.equalsIgnoreCase(BuildConfig.FLAVOR)) {
                    FreeTrailActivity freeTrailActivity10 = FreeTrailActivity.this;
                    context = freeTrailActivity10.y;
                    resources = freeTrailActivity10.getResources();
                    i2 = R.string.please_enter_confirm_password;
                } else {
                    if (FreeTrailActivity.this.f24720m.equals(FreeTrailActivity.this.f24721n)) {
                        m.g0(BuildConfig.FLAVOR, FreeTrailActivity.this.y);
                        m.h0(BuildConfig.FLAVOR, FreeTrailActivity.this.y);
                        FreeTrailActivity.this.a();
                        FreeTrailActivity.this.z0();
                        return;
                    }
                    FreeTrailActivity freeTrailActivity11 = FreeTrailActivity.this;
                    context = freeTrailActivity11.y;
                    resources = freeTrailActivity11.getResources();
                    i2 = R.string.password_does_not_matched;
                }
            }
            Toast.makeText(context, resources.getString(i2), 0).show();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a();
        }
    }

    public class c implements o.d<c.h.a.i.d> {
        public c() {
        }

        @Override // o.d
        public void a(o.b<c.h.a.i.d> bVar, Throwable th) {
            FreeTrailActivity freeTrailActivity = FreeTrailActivity.this;
            freeTrailActivity.I(freeTrailActivity.getResources().getString(R.string.could_not_connect));
        }

        @Override // o.d
        public void b(o.b<c.h.a.i.d> bVar, l<c.h.a.i.d> lVar) {
            FreeTrailActivity freeTrailActivity;
            String strA;
            if (lVar == null || !lVar.d() || lVar.a() == null) {
                freeTrailActivity = FreeTrailActivity.this;
                strA = "No Response from server";
            } else {
                if (lVar.a().b() != null && lVar.a().b().equalsIgnoreCase("success")) {
                    c.h.a.e.b.a.e(BuildConfig.FLAVOR, FreeTrailActivity.this.y);
                    if (c.h.a.h.n.a.f17044h.booleanValue()) {
                        c.h.a.h.n.a.f17044h = Boolean.FALSE;
                    }
                    m.g0(FreeTrailActivity.this.f24719l, FreeTrailActivity.this.y);
                    m.h0(FreeTrailActivity.this.f24720m, FreeTrailActivity.this.y);
                    Intent intent = new Intent(FreeTrailActivity.this, (Class<?>) LoginActivity.class);
                    intent.setAction("login_perform");
                    FreeTrailActivity.this.startActivity(intent);
                    FreeTrailActivity.this.finish();
                    return;
                }
                freeTrailActivity = FreeTrailActivity.this;
                strA = lVar.a().a();
            }
            freeTrailActivity.I(strA);
        }
    }

    public static class d implements InputFilter {
        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
            while (i2 < i3) {
                if (Character.getType(charSequence.charAt(i2)) == 19) {
                    return BuildConfig.FLAVOR;
                }
                i2++;
            }
            return null;
        }
    }

    public static String K0(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (char c2 : charArray) {
            if (z && Character.isLetter(c2)) {
                sb.append(Character.toUpperCase(c2));
                z = false;
            } else {
                if (Character.isWhitespace(c2)) {
                    z = true;
                }
                sb.append(c2);
            }
        }
        return sb.toString();
    }

    public static String L0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return K0(str2);
        }
        return K0(str) + " " + str2;
    }

    public static String M0() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return BuildConfig.FLAVOR;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b2 : hardwareAddress) {
                        sb.append(String.format("%02X:", Byte.valueOf(b2)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
            return BuildConfig.FLAVOR;
        } catch (Exception unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public void A0() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.x = iNextInt;
        c.h.a.f.b.f16735b = String.valueOf(iNextInt);
    }

    public void I(String str) {
        ProgressDialog progressDialog = this.B;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (str.equals(BuildConfig.FLAVOR)) {
            e.l0(this.y, "Your Account is invalid or expired !");
        } else {
            e.l0(this.y, str);
        }
    }

    public void J0() {
        try {
            this.p = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public String N0() {
        return ((WifiManager) getApplicationContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
    }

    public boolean O0(String str) {
        return Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", 2).matcher(str).matches();
    }

    public void a() {
        ProgressDialog progressDialog = this.B;
        if (progressDialog != null) {
            progressDialog.show();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (c.h.a.h.n.a.f17045i.booleanValue()) {
            c.h.a.h.n.a.f17044h = Boolean.TRUE;
        }
        finish();
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    @SuppressLint({"ResourceType"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c.h.a.f.g.f16758b = new c.h.a.f.g(this);
        setContentView(R.layout.activity_free_trail);
        ButterKnife.a(this);
        J0();
        y0();
        L0();
        A0();
        String strM0 = M0();
        this.C = strM0;
        if (strM0.equalsIgnoreCase(BuildConfig.FLAVOR)) {
            this.C = N0();
        }
        this.y = this;
        this.M = new f(this.y);
        this.Q = new g(this.y);
        this.P = new c.h.a.i.q.a(this.y);
        this.f24714g = new EditText(this);
        this.f24714g.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f24714g.setPaddingRelative(35, 0, 35, 0);
        this.f24714g.setHint(getResources().getString(R.string.email));
        this.f24714g.setHintTextColor(getResources().getColor(R.color.white));
        this.f24714g.setHintTextColor(-1);
        this.f24714g.setTextSize(22.0f);
        this.f24714g.setId(101);
        this.f24714g.setBackground(getResources().getDrawable(R.drawable.selector_login_fields));
        this.f24714g.setFocusable(true);
        this.f24714g.setTypeface(Typeface.SANS_SERIF);
        this.f24714g.setInputType(32);
        this.rl_email.addView(this.f24714g);
        this.f24712e = new EditText(this);
        this.f24712e.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f24712e.setPaddingRelative(35, 0, 35, 0);
        this.f24712e.setHint(getResources().getString(R.string.username));
        this.f24712e.setHintTextColor(getResources().getColor(R.color.white));
        this.f24712e.setHintTextColor(-1);
        this.f24712e.setTextSize(22.0f);
        this.f24712e.setId(101);
        this.f24712e.setBackground(getResources().getDrawable(R.drawable.selector_login_fields));
        this.f24712e.setFocusable(true);
        this.f24712e.setTypeface(Typeface.SANS_SERIF);
        this.f24712e.setInputType(1);
        this.rl_username.addView(this.f24712e);
        this.f24713f = new EditText(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.f24713f.setPaddingRelative(35, 0, 35, 0);
        this.f24713f.setLayoutParams(layoutParams);
        this.f24713f.setHint(getResources().getString(R.string.enter_password));
        this.f24713f.setHintTextColor(getResources().getColor(R.color.white));
        this.f24713f.setHintTextColor(-1);
        this.f24713f.setTextSize(22.0f);
        this.f24713f.setId(101);
        this.f24713f.setBackground(getResources().getDrawable(R.drawable.selector_login_fields));
        this.f24713f.setFocusable(true);
        this.f24713f.setTypeface(Typeface.SANS_SERIF);
        this.f24713f.setInputType(129);
        this.rl_password.addView(this.f24713f);
        this.f24715h = new EditText(this);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        this.f24715h.setPaddingRelative(35, 0, 35, 0);
        this.f24715h.setLayoutParams(layoutParams2);
        this.f24715h.setHint(getResources().getString(R.string.confirm_password));
        this.f24715h.setHintTextColor(getResources().getColor(R.color.white));
        this.f24715h.setHintTextColor(-1);
        this.f24715h.setTextSize(22.0f);
        this.f24715h.setId(101);
        this.f24715h.setBackground(getResources().getDrawable(R.drawable.selector_login_fields));
        this.f24715h.setFocusable(true);
        this.f24715h.setTypeface(Typeface.SANS_SERIF);
        this.f24715h.setInputType(129);
        this.rl_confirmpassword.addView(this.f24715h);
        this.f24716i = new Button(this);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        this.f24716i.setPaddingRelative(35, 0, 35, 0);
        this.f24716i.setLayoutParams(layoutParams3);
        this.f24716i.setText(getResources().getString(R.string.sign_up));
        this.f24716i.setTextColor(DefaultRenderer.BACKGROUND_COLOR);
        this.f24716i.setTextSize(22.0f);
        this.f24716i.setId(105);
        this.f24716i.setBackground(getResources().getDrawable(R.drawable.selector_button));
        this.f24716i.setFocusable(true);
        this.f24716i.setGravity(17);
        this.f24716i.setTypeface(Typeface.SANS_SERIF);
        this.rl_bt_submit.addView(this.f24716i);
        this.f24717j = new TextView(this);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -1);
        this.f24717j.setPaddingRelative(35, 0, 35, 0);
        this.f24717j.setLayoutParams(layoutParams4);
        this.f24717j.setTextColor(-1);
        if (new c.h.a.k.d.a.a(this.y).A().equals(c.h.a.h.n.a.s0)) {
            this.f24717j.setTextSize(22.0f);
        } else {
            this.f24717j.setTextSize(15.0f);
        }
        this.f24717j.setText(getResources().getString(R.string.already_registered_login));
        this.f24717j.setId(105);
        this.f24717j.setGravity(16);
        this.f24717j.setBackground(getResources().getDrawable(R.drawable.selector_checkbox));
        this.f24717j.setFocusable(true);
        this.rl_already_register.addView(this.f24717j);
        if (this.y != null) {
            ProgressDialog progressDialog = new ProgressDialog(this.y);
            this.B = progressDialog;
            progressDialog.setMessage("Please wait while we are creating free trial for you");
            this.B.setCanceledOnTouchOutside(false);
            this.B.setCancelable(false);
            this.B.setProgressStyle(0);
        }
        this.D = getSharedPreferences("sharedPreference", 0);
        this.F = getSharedPreferences("sharedprefremberme", 0);
        this.G = getSharedPreferences("loginPrefs", 0);
        this.H = getSharedPreferences("selected_language", 0);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefsserverurl", 0);
        this.K = sharedPreferences;
        this.L = sharedPreferences.edit();
        SharedPreferences sharedPreferences2 = getSharedPreferences("upgradeDatePref", 0);
        this.O = sharedPreferences2;
        this.N = sharedPreferences2.edit();
        this.I = this.F.edit();
        this.E = this.D.edit();
        this.J = Boolean.valueOf(this.F.getBoolean("savelogin", false));
        this.f24717j.setOnClickListener(new a());
        c.h.a.k.h.b.a(this.f24713f);
        this.f24712e.setFilters(new InputFilter[]{f24711d});
        this.f24716i.setOnClickListener(new b());
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        e.g(this.y);
    }

    public void y0() {
        this.f24722o = Build.VERSION.RELEASE + " " + Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
    }

    public void z0() {
        x.b bVar = new x.b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ((c.h.a.e.d.a) new m.b().b("https://cms.alldrama.tv/").f(bVar.c(300L, timeUnit).g(300L, timeUnit).e(300L, timeUnit).d(false).a()).a(o.p.a.a.d()).d().d(c.h.a.e.d.a.class)).i("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "freetrail", "yes", this.f24718k, this.f24719l, this.f24720m, this.C, "com.nst.iptvsmarterstvbox").x(new c());
    }
}
