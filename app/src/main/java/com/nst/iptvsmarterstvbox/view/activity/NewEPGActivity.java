package com.nst.iptvsmarterstvbox.view.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.i.e;
import c.h.a.k.b.o;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.nst.iptvsmarterstvbox.R;
import java.util.ArrayList;
import java.util.Calendar;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public class NewEPGActivity extends a.b.k.c implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f25959d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f25960e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<e> f25962g;

    @BindView
    public ImageView iv_back_button;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.k.d.a.a f25966k;

    @BindView
    public LinearLayout ll_header;

    @BindView
    public ImageView logo;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public TabLayout slidingTabs;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvHeaderTitle;

    @BindView
    public TextView tv_cat_title;

    @BindView
    public ViewPager viewpager;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<String> f25961f = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f25963h = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f25964i = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25965j = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Thread f25967l = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(NewEPGActivity.this.f25959d);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewEPGActivity.this.onBackPressed();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(NewEPGActivity.this.f25959d);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = NewEPGActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = NewEPGActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    NewEPGActivity.this.A0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public void A0() {
        runOnUiThread(new c());
    }

    @SuppressLint({"InlinedApi"})
    public void B0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public final void C0() {
        ViewPager viewPager;
        if (this.f25959d != null) {
            this.f25962g = new ArrayList<>();
            e eVar = new e();
            eVar.g(this.f25963h);
            eVar.h(this.f25964i);
            this.f25962g.add(eVar);
            ArrayList<e> arrayList = this.f25962g;
            if (arrayList == null || (viewPager = this.viewpager) == null || this.slidingTabs == null) {
                return;
            }
            viewPager.setAdapter(new o(arrayList, getSupportFragmentManager(), this));
        }
    }

    public final void D0() {
        startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
    }

    public void b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r5.f25965j == false) goto L7;
     */
    @Override // a.b.k.c, a.i.h.g, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            int r1 = r6.getKeyCode()
            r2 = 2131099915(0x7f06010b, float:1.7812197E38)
            r3 = 1
            switch(r1) {
                case 20: goto L10;
                case 21: goto L37;
                case 22: goto L3c;
                default: goto Lf;
            }
        Lf:
            goto L41
        L10:
            boolean r1 = r5.f25965j
            if (r1 != 0) goto L27
        L14:
            android.widget.LinearLayout r6 = r5.ll_header
            r6.requestFocus()
            android.widget.LinearLayout r6 = r5.ll_header
            android.content.Context r0 = r5.f25959d
            android.graphics.drawable.Drawable r0 = a.i.i.b.f(r0, r2)
            r6.setBackground(r0)
            r5.f25965j = r3
            return r3
        L27:
            if (r0 != 0) goto L37
            android.widget.LinearLayout r0 = r5.ll_header
            android.content.Context r1 = r5.f25959d
            r4 = 2131231932(0x7f0804bc, float:1.8079959E38)
            android.graphics.drawable.Drawable r1 = a.i.i.b.f(r1, r4)
            r0.setBackground(r1)
        L37:
            boolean r0 = r5.f25965j
            if (r0 != 0) goto L3c
            goto L14
        L3c:
            boolean r0 = r5.f25965j
            if (r0 != 0) goto L41
            goto L14
        L41:
            boolean r6 = super.dispatchKeyEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.NewEPGActivity.dispatchKeyEvent(android.view.KeyEvent):boolean");
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
        D0();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        B0();
        setContentView(R.layout.activity_new_epg);
        ButterKnife.a(this);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        z0();
        v0((Toolbar) findViewById(R.id.toolbar));
        Intent intent = getIntent();
        if (intent != null) {
            this.f25963h = intent.getStringExtra("category_id");
            String stringExtra = intent.getStringExtra("category_name");
            this.f25964i = stringExtra;
            TextView textView = this.tv_cat_title;
            if (textView != null) {
                textView.setText(stringExtra);
            }
        }
        this.f25959d = this;
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this);
        this.f25966k = aVar;
        try {
            if (aVar.x() != 3) {
                IjkMediaPlayer.loadLibrariesOnce(null);
                IjkMediaPlayer.native_profileBegin("libijkplayer.so");
            }
        } catch (Exception | UnsatisfiedLinkError unused) {
        }
        Thread thread = this.f25967l;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new d());
            this.f25967l = thread2;
            thread2.start();
        }
        C0();
        this.tvHeaderTitle.setOnClickListener(this);
        this.tvHeaderTitle.sendAccessibilityEvent(8);
        this.logo.setOnClickListener(new a());
        this.iv_back_button.setOnClickListener(new b());
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f25967l;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f25967l.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        B0();
        super.onResume();
        Thread thread = this.f25967l;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new d());
            this.f25967l = thread2;
            thread2.start();
        }
        c.h.a.h.n.e.g(this.f25959d);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f25960e = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f25960e.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f25959d != null) {
            b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        B0();
    }

    public final void z0() {
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
}
