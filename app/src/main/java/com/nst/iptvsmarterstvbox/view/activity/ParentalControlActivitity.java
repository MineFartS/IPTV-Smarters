package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.b;
import a.l.d.y;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.fragment.ParentalControlCategoriesFragment;
import com.nst.iptvsmarterstvbox.view.fragment.ParentalControlM3UFragment;
import com.nst.iptvsmarterstvbox.view.fragment.ParentalControlRadioCategoriesFragment;
import com.nst.iptvsmarterstvbox.view.fragment.ParentalControlSeriesCatFragment;
import com.nst.iptvsmarterstvbox.view.fragment.ParentalControlSettingFragment;
import com.nst.iptvsmarterstvbox.view.fragment.ParentalControlVODCatFragment;
import com.nst.iptvsmarterstvbox.view.fragment.ParentalCotrolFragment;
import java.util.Calendar;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class ParentalControlActivitity extends a.b.k.c implements View.OnClickListener, ParentalCotrolFragment.b, ParentalControlSettingFragment.a, ParentalControlCategoriesFragment.f, ParentalControlVODCatFragment.f, ParentalControlSeriesCatFragment.f, ParentalControlM3UFragment.f, ParentalControlRadioCategoriesFragment.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f26010d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f26011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.h.a.i.q.f f26012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.h.a.i.q.b f26013g = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.h.a.i.q.b f26014h = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f26015i = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26016j = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Thread f26017k = null;

    @BindView
    public ImageView logo;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    @BindView
    public ImageView tvHeaderTitle;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(ParentalControlActivitity.this.f26010d);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(ParentalControlActivitity.this.f26010d);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = ParentalControlActivitity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = ParentalControlActivitity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(ParentalControlActivitity.this.f26010d);
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(ParentalControlActivitity.this.f26010d);
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    ParentalControlActivitity.this.A0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public void A0() {
        runOnUiThread(new b());
    }

    public final void B0() {
        this.f26010d = this;
        this.f26012f = new c.h.a.i.q.f(this.f26010d);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26011e = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f26011e.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        } else if (this.f26010d != null) {
            ParentalCotrolFragment parentalCotrolFragment = new ParentalCotrolFragment();
            y yVarM = getSupportFragmentManager().m();
            yVarM.t(android.R.anim.fade_in, android.R.anim.fade_out);
            yVarM.s(R.id.frame, parentalCotrolFragment, "PARENTAL_CONTROL_SETTINGS");
            yVarM.k();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
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
        super.onCreate(bundle);
        setContentView(R.layout.activity_parental_control_activitity);
        ButterKnife.a(this);
        z0();
        v0((Toolbar) findViewById(R.id.toolbar));
        B0();
        Thread thread = this.f26017k;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new i());
            this.f26017k = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new a());
        ImageView imageView = this.tvHeaderTitle;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
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
        if (itemId == R.id.action_logout && (context = this.f26010d) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new d()).g(getResources().getString(R.string.no), new c()).n();
        }
        if (itemId == R.id.menu_load_channels_vod) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f26010d.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f26010d.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f26010d.getResources().getString(R.string.yes), new e());
            aVar.g(this.f26010d.getResources().getString(R.string.no), new f());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.f26010d.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.f26010d.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.f26010d.getResources().getString(R.string.yes), new g());
            aVar2.g(this.f26010d.getResources().getString(R.string.no), new h());
            aVar2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f26017k;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f26017k.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f26017k;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new i());
            this.f26017k = thread2;
            thread2.start();
        }
        c.h.a.h.n.e.g(this.f26010d);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26011e = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f26011e.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        }
    }

    public final void z0() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        if (Build.VERSION.SDK_INT >= 21) {
            window.setStatusBarColor(a.i.i.b.d(this, R.color.colorPrimaryDark));
        }
    }
}
