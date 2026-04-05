package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.c;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.h.a.i.i;
import c.h.a.i.q.g;
import c.h.a.i.q.m;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.adapter.MultiUserAdapter;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class MultiUserActivity extends c {

    @BindView
    public ImageView addmore;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f25878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f25879e;

    @BindView
    public TextView emptyView;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f25880f;

    @BindView
    public FrameLayout frameLayout;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences f25881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f25882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MultiUserAdapter f25883i;

    @BindView
    public ImageView ivBTUP;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GridLayoutManager f25884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Intent f25885k;

    @BindView
    public LinearLayout ll_add_new_user;

    @BindView
    public LinearLayout ll_add_user;

    @BindView
    public LinearLayout ll_termsandservices;

    @BindView
    public RecyclerView myRecyclerView;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.h.a.k.d.a.a f25888n;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    @BindView
    public TextView tv_link2;

    @BindView
    public TextView tv_list_options;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f25886l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f25887m = "false";

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://www.iptvsmarters.com/terms-and-conditions/"));
                MultiUserActivity.this.startActivity(intent);
            } catch (Exception unused) {
                Toast.makeText(MultiUserActivity.this.getApplicationContext(), "Your Device Not Supported !!", 1).show();
            }
        }
    }

    public class b implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f25890b;

        public b(View view) {
            this.f25890b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25890b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25890b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25890b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            if (!z) {
                if (z || !this.f25890b.getTag().equals("7")) {
                    return;
                }
                f2 = z ? 2.0f : 1.0f;
                b(f2);
                c(f2);
                a(z);
                return;
            }
            Log.e("id is", BuildConfig.FLAVOR + this.f25890b.getTag());
            if (this.f25890b.getTag().equals("7")) {
                f2 = z ? 2.0f : 1.0f;
                b(f2);
                c(f2);
            }
        }
    }

    public void A0() {
        ArrayList<i> arrayListP = this.f25880f.p();
        i iVar = (!m.f(this.f25878d).equals("m3u") || arrayListP.size() <= 0) ? null : arrayListP.get(0);
        ArrayList<i> arrayListO = this.f25880f.o();
        if (m.f(this.f25878d).equals("api") && arrayListO.size() > 0) {
            iVar = arrayListO.get(0);
        }
        i iVar2 = iVar;
        arrayListP.addAll(arrayListO);
        if (arrayListP.size() > 0) {
            this.tv_list_options.setVisibility(8);
            this.f25883i = new MultiUserAdapter(this, arrayListP, this.f25878d, this.ll_add_new_user, this.tv_list_options, this.f25887m, iVar2, this.ll_add_user);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
            this.f25884j = gridLayoutManager;
            this.myRecyclerView.setLayoutManager(gridLayoutManager);
            this.myRecyclerView.setItemAnimator(new a.y.e.c());
            this.myRecyclerView.setAdapter(this.f25883i);
        } else {
            this.ll_add_new_user.setVisibility(0);
            this.ll_add_user.setNextFocusDownId(R.id.ll_add_new_user);
        }
        c.h.a.h.n.a.L = Boolean.FALSE;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f25878d = this;
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f25878d);
        this.f25888n = aVar;
        setContentView(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_multi_user_tv : R.layout.activity_multi_user);
        ButterKnife.a(this);
        if (c.h.a.h.n.a.M.booleanValue()) {
            this.ll_termsandservices.setVisibility(0);
        } else {
            this.ll_termsandservices.setVisibility(8);
        }
        Intent intent = getIntent();
        this.f25885k = intent;
        String stringExtra = intent.getStringExtra("from_login");
        this.f25887m = stringExtra;
        if (stringExtra == null) {
            this.f25887m = "false";
        }
        this.f25887m.equals("true");
        getWindow().setFlags(1024, 1024);
        y0();
        this.tv_link2.setOnClickListener(new a());
        getSharedPreferences("Accept_clicked", 0).getString("Accept_clicked", BuildConfig.FLAVOR);
        SharedPreferences sharedPreferences = getSharedPreferences("sharedprefremberme", 0);
        this.f25881g = sharedPreferences;
        this.f25882h = Boolean.valueOf(sharedPreferences.getBoolean("savelogin", false));
        ImageView imageView = this.addmore;
        imageView.setOnFocusChangeListener(new b(imageView));
        this.f25880f = new g(this.f25878d);
        z0();
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @OnClick
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.ll_add_new_user || id == R.id.ll_add_user) {
            startActivity(c.h.a.h.n.a.f17041e.booleanValue() ? new Intent(this, (Class<?>) RoutingActivity.class) : new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
            c.h.a.h.n.a.K = Boolean.TRUE;
            finish();
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

    public void z0() {
        Handler handler = new Handler();
        this.f25879e = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        A0();
        ProgressBar progressBar2 = this.pbLoader;
        if (progressBar2 != null) {
            progressBar2.setVisibility(8);
        }
    }
}
