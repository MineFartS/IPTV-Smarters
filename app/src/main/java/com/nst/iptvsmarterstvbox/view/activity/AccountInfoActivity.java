package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.b;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.h.n.e;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import java.util.Calendar;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class AccountInfoActivity extends a.b.k.c implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c.h.a.k.d.a.a f25270d;

    @BindView
    public Button Logout;

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btnBackAccountInfo;

    @BindView
    public Button btn_buy_now;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f25271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressDialog f25272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences f25273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.h.a.i.q.f f25274h;

    @BindView
    public ImageView iv_back_button;

    @BindView
    public ImageView logo;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvActiveConn;

    @BindView
    public TextView tvCreatedAt;

    @BindView
    public TextView tvExpiryDate;

    @BindView
    public TextView tvIsTrial;

    @BindView
    public TextView tvMaxConnections;

    @BindView
    public TextView tvStatus;

    @BindView
    public TextView tvUsername;

    @BindView
    public TextView tv_username_label;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f25275i = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f25276j = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Thread f25277k = null;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(AccountInfoActivity.this.f25271e);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(AccountInfoActivity.this.f25271e);
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountInfoActivity.this.onBackPressed();
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountInfoActivity.this.onBackPressed();
        }
    }

    public class h implements View.OnClickListener {

        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                c.h.a.h.n.e.O(AccountInfoActivity.this.f25271e);
            }
        }

        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new b.a(AccountInfoActivity.this, R.style.AlertDialogCustom).setTitle(AccountInfoActivity.this.getResources().getString(R.string.logout_title)).f(AccountInfoActivity.this.getResources().getString(R.string.logout_message)).j(AccountInfoActivity.this.getResources().getString(R.string.yes), new b()).g(AccountInfoActivity.this.getResources().getString(R.string.no), new a()).n();
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AccountInfoActivity.this.y0();
        }
    }

    public class j implements o.d<c.h.a.e.e.d> {
        public j() {
        }

        @Override // o.d
        public void a(o.b<c.h.a.e.e.d> bVar, Throwable th) {
            c.h.a.h.n.e.I();
            Toast.makeText(AccountInfoActivity.this.f25271e, "error", 0).show();
        }

        @Override // o.d
        public void b(o.b<c.h.a.e.e.d> bVar, o.l<c.h.a.e.e.d> lVar) {
            Toast toastMakeText;
            c.h.a.h.n.e.I();
            if (!lVar.d()) {
                toastMakeText = Toast.makeText(AccountInfoActivity.this.f25271e, BuildConfig.FLAVOR, 0);
            } else {
                if (lVar.a() != null && lVar.a().c().equalsIgnoreCase("success")) {
                    lVar.a().a();
                    throw null;
                }
                toastMakeText = Toast.makeText(AccountInfoActivity.this.f25271e, BuildConfig.FLAVOR + lVar.a().b(), 0);
            }
            toastMakeText.show();
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(AccountInfoActivity.this.f25271e);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = AccountInfoActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = AccountInfoActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class l implements DialogInterface.OnClickListener {
        public l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class m implements DialogInterface.OnClickListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(AccountInfoActivity.this.f25271e);
        }
    }

    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    AccountInfoActivity.this.C0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class o implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f25294b;

        public o(View view) {
            this.f25294b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25294b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25294b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            View view2;
            int i2;
            if (!z) {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                a(f2);
                b(f2);
                if (this.f25294b.getTag().equals("1") || this.f25294b.getTag().equals("2")) {
                    this.f25294b.setBackgroundResource(R.drawable.black_button_dark);
                    return;
                }
                return;
            }
            f2 = z ? 1.05f : 1.0f;
            a(f2);
            b(f2);
            Log.e("id is", BuildConfig.FLAVOR + this.f25294b.getTag());
            if (this.f25294b.getTag().equals("1")) {
                view2 = this.f25294b;
                i2 = R.drawable.back_btn_effect;
            } else {
                if (!this.f25294b.getTag().equals("2")) {
                    return;
                }
                view2 = this.f25294b;
                i2 = R.drawable.logout_btn_effect;
            }
            view2.setBackgroundResource(i2);
        }
    }

    public final void B0() {
        Window window = getWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            window.clearFlags(67108864);
        }
        if (i2 >= 21) {
            window.addFlags(Integer.MIN_VALUE);
        }
        if (i2 >= 21) {
            window.setStatusBarColor(a.i.i.b.d(this, R.color.colorPrimaryDark));
        }
    }

    public void C0() {
        runOnUiThread(new k());
    }

    public final void D0() {
        Button button = this.btnBackAccountInfo;
        if (button != null) {
            button.setOnFocusChangeListener(new o(button));
            this.btnBackAccountInfo.requestFocus();
            this.btnBackAccountInfo.requestFocusFromTouch();
        }
        Button button2 = this.Logout;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new o(button2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E0() {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.AccountInfoActivity.E0():void");
    }

    public void b() {
        ProgressDialog progressDialog = this.f25272f;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.tv_header_title) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f25271e = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f25271e);
        f25270d = aVar;
        setContentView(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_account_info_tv : R.layout.activity_account_info);
        ButterKnife.a(this);
        B0();
        D0();
        v0((Toolbar) findViewById(R.id.toolbar));
        getWindow().setFlags(1024, 1024);
        E0();
        Thread thread = this.f25277k;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new n());
            this.f25277k = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new e());
        this.btnBackAccountInfo.setOnClickListener(new f());
        this.iv_back_button.setOnClickListener(new g());
        this.Logout.setOnClickListener(new h());
        Button button = this.btn_buy_now;
        button.setOnFocusChangeListener(new e.j(button, this));
        this.btn_buy_now.setOnClickListener(new i());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.x(R.menu.menu_text_icon);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i2 = 0; i2 < this.toolbar.getChildCount(); i2++) {
            if (this.toolbar.getChildAt(i2) instanceof ActionMenuView) {
                ((Toolbar.e) this.toolbar.getChildAt(i2).getLayoutParams()).f135a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout && (context = this.f25271e) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new m()).g(getResources().getString(R.string.no), new l()).n();
        }
        if (itemId == R.id.menu_load_channels_vod) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f25271e.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f25271e.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f25271e.getResources().getString(R.string.yes), new a());
            aVar.g(this.f25271e.getResources().getString(R.string.no), new b());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.f25271e.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.f25271e.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.f25271e.getResources().getString(R.string.yes), new c());
            aVar2.g(this.f25271e.getResources().getString(R.string.no), new d());
            aVar2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f25277k;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f25277k.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f25277k;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new n());
            this.f25277k = thread2;
            thread2.start();
        }
        c.h.a.h.n.e.g(this.f25271e);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f25273g = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f25273g.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        } else if (this.f25271e != null) {
            b();
        }
    }

    public final void y0() {
        c.h.a.h.n.e.i0(this);
        ((c.h.a.e.d.a) c.h.a.e.d.b.a().d(c.h.a.e.d.a.class)).j("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "validateCustomLogin", "yes", c.h.a.i.q.m.A(this.f25271e), c.h.a.i.q.m.B(this.f25271e)).x(new j());
    }
}
