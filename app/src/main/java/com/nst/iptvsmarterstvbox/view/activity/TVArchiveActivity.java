package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.c;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.i.e;
import c.h.a.i.q.b;
import c.h.a.i.q.f;
import c.h.a.i.q.i;
import c.h.a.i.q.m;
import c.h.a.k.b.z;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.nst.iptvsmarterstvbox.R;
import java.util.ArrayList;
import java.util.Iterator;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class TVArchiveActivity extends c implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f26784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f26785e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f26787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<i> f26788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<e> f26789i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<e> f26790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<e> f26791k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList<e> f26792l;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public TabLayout slidingTabs;

    @BindView
    public Toolbar toolbar;

    @BindView
    public ImageView tvHeaderTitle;

    @BindView
    public ViewPager viewpager;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<String> f26786f = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f26793m = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f26794n = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f26795o = new b();
    public b p = new b();

    public class a implements ViewPager.j {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i2) {
        }
    }

    public final ArrayList<e> A0(ArrayList<e> arrayList, ArrayList<String> arrayList2) {
        ArrayList<e> arrayList3;
        if (arrayList == null) {
            return null;
        }
        for (e eVar : arrayList) {
            boolean z = false;
            if (arrayList2 != null) {
                Iterator<String> it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (eVar.b().equals(it.next())) {
                        z = true;
                        break;
                    }
                }
                if (!z && (arrayList3 = this.f26789i) != null) {
                    arrayList3.add(eVar);
                }
            }
        }
        return this.f26789i;
    }

    public final void B0() {
        ViewPager viewPager;
        try {
            if (this.f26784d != null) {
                this.f26787g = new f(this.f26784d);
                this.f26788h = new ArrayList<>();
                this.f26789i = new ArrayList<>();
                this.f26790j = new ArrayList<>();
                this.f26791k = new ArrayList<>();
                this.f26792l = new ArrayList<>();
                this.f26792l = this.f26787g.o1();
                ArrayList<e> arrayListO1 = this.f26787g.o1();
                e eVar = new e();
                new e();
                eVar.g("0");
                eVar.h(getResources().getString(R.string.all));
                if (this.f26787g.I1(m.z(this.f26784d)) <= 0 || arrayListO1 == null) {
                    arrayListO1.add(0, eVar);
                } else {
                    ArrayList<String> arrayListZ0 = z0();
                    this.f26786f = arrayListZ0;
                    this.f26790j = A0(arrayListO1, arrayListZ0);
                    this.f26789i.add(0, eVar);
                    arrayListO1 = this.f26790j;
                }
                this.f26791k = arrayListO1;
                ArrayList<e> arrayList = this.f26791k;
                if (arrayList == null || (viewPager = this.viewpager) == null || this.slidingTabs == null) {
                    return;
                }
                viewPager.setAdapter(new z(arrayList, getSupportFragmentManager(), this));
                this.slidingTabs.setupWithViewPager(this.viewpager);
                this.viewpager.setOnPageChangeListener(new a());
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
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
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_tvarchive);
        ButterKnife.a(this);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        y0();
        v0((Toolbar) findViewById(R.id.toolbar));
        getWindow().setFlags(1024, 1024);
        this.f26784d = this;
        B0();
        ImageView imageView = this.tvHeaderTitle;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        c.h.a.h.n.e.g(this.f26784d);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26785e = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f26785e.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f26784d != null) {
            b();
        }
    }

    public final void y0() {
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

    public final ArrayList<String> z0() {
        ArrayList<i> arrayListD1 = this.f26787g.d1(m.z(this.f26784d));
        this.f26788h = arrayListD1;
        if (arrayListD1 != null) {
            for (i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.f26786f.add(iVar.b());
                }
            }
        }
        return this.f26786f;
    }
}
