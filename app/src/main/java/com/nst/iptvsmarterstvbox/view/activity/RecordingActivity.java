package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.b;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.h.a.h.f;
import c.h.a.h.n.e;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.adapter.RecordingAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class RecordingActivity extends a.b.k.c implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c.h.a.k.d.a.a f26157d;

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btBrowse;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f26158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f26159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecordingAdapter f26160g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView.p f26162i;

    @BindView
    public ImageView iv_back_button;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SharedPreferences.Editor f26163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SharedPreferences f26164k;

    @BindView
    public ImageView logo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f26167n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a.b.k.b f26168o;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public RecyclerView recyclerView;

    @BindView
    public LinearLayout rlRecordingDirChange;

    @BindView
    public TextView textViewRecordingDir;

    @BindView
    public TextView time;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tv_no_record_found_dontaskmeagain;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<File> f26161h = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Boolean f26165l = Boolean.FALSE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Thread f26166m = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(RecordingActivity.this.f26158e);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecordingActivity.this.onBackPressed();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", RecordingActivity.this.getPackageName(), null));
                RecordingActivity.this.startActivityForResult(intent, 101);
                Toast.makeText(RecordingActivity.this.f26158e, RecordingActivity.this.f26158e.getResources().getString(R.string.grant_the_permission), 1).show();
            } catch (Exception unused) {
            }
            RecordingActivity.this.f26168o.dismiss();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecordingActivity.this.f26168o.dismiss();
            RecordingActivity.this.onBackPressed();
        }
    }

    public class e implements f.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f26173a;

        public e(String[] strArr) {
            this.f26173a = strArr;
        }

        @Override // c.h.a.h.f.j
        public void a(String str) {
            this.f26173a[0] = str;
            RecordingActivity recordingActivity = RecordingActivity.this;
            recordingActivity.f26163j = recordingActivity.f26164k.edit();
            RecordingActivity.this.f26163j.putString("recordingDir", str);
            RecordingActivity.this.f26163j.apply();
            RecordingActivity.this.textViewRecordingDir.setText(RecordingActivity.this.f26158e.getResources().getString(R.string.your_current_directory_path) + str);
            RecordingActivity.this.H0();
            Toast.makeText(RecordingActivity.this.f26158e, RecordingActivity.this.f26158e.getResources().getString(R.string.choose_directory) + str, 1).show();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(RecordingActivity.this.f26158e);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = RecordingActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = RecordingActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    RecordingActivity.this.E0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class h implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26177b;

        public h(View view) {
            this.f26177b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26177b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26177b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26177b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            int i2;
            View view2;
            View view3;
            int i3;
            try {
                if (z) {
                    b(1.0f);
                    c(1.0f);
                    View view4 = this.f26177b;
                    i2 = R.drawable.back_btn_effect;
                    if (view4 == null || view4.getTag() == null || !this.f26177b.getTag().equals("3")) {
                        View view5 = this.f26177b;
                        if (view5 == null || view5.getTag() == null || !this.f26177b.getTag().equals("1")) {
                            View view6 = this.f26177b;
                            if (view6 == null || view6.getTag() == null || !this.f26177b.getTag().equals("2")) {
                                view3 = this.f26177b;
                                if (view3 == null) {
                                    return;
                                } else {
                                    i3 = R.drawable.shape_checkbox_focused;
                                }
                            } else {
                                view3 = this.f26177b;
                                i3 = R.drawable.logout_btn_effect;
                            }
                            view3.setBackgroundResource(i3);
                            return;
                        }
                        view = this.f26177b;
                    } else {
                        b(1.0f);
                        c(1.0f);
                    }
                } else {
                    if (z) {
                        return;
                    }
                    b(1.0f);
                    c(1.0f);
                    a(z);
                    View view7 = this.f26177b;
                    i2 = R.drawable.black_button_dark;
                    if (view7 == null || view7.getTag() == null || !this.f26177b.getTag().equals("3")) {
                        View view8 = this.f26177b;
                        if ((view8 == null || view8.getTag() == null || !this.f26177b.getTag().equals("1")) && ((view2 = this.f26177b) == null || view2.getTag() == null || !this.f26177b.getTag().equals("2"))) {
                            view3 = this.f26177b;
                            if (view3 != null) {
                                i3 = R.color.transparent;
                                view3.setBackgroundResource(i3);
                                return;
                            }
                            return;
                        }
                        view = this.f26177b;
                    } else {
                        b(1.0f);
                        c(1.0f);
                    }
                }
                view.setBackgroundResource(i2);
            } catch (Exception unused) {
            }
        }
    }

    public final void D0() {
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

    public void E0() {
        runOnUiThread(new f());
    }

    public final void F0() {
        Button button = this.btBrowse;
        if (button != null) {
            button.setOnFocusChangeListener(new h(button));
            this.btBrowse.requestFocus();
            this.btBrowse.requestFocusFromTouch();
            this.btBrowse.setBackgroundResource(R.drawable.back_btn_effect);
        }
        TextView textView = this.tv_no_record_found_dontaskmeagain;
        if (textView != null) {
            textView.setOnFocusChangeListener(new h(textView));
        }
    }

    @SuppressLint({"InlinedApi"})
    public void G0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public void H0() {
        if (this.f26158e != null) {
            this.tv_no_record_found_dontaskmeagain.setVisibility(8);
            this.tvNoRecordFound.setVisibility(8);
            this.rlRecordingDirChange.setVisibility(0);
            this.f26164k = this.f26158e.getSharedPreferences("recordingDir", 0);
            this.textViewRecordingDir.setText(getResources().getString(R.string.your_current_recording_path) + this.f26164k.getString("recordingDir", String.valueOf(Build.VERSION.SDK_INT >= 19 ? new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "IPTVSmarters") : new File(Environment.getExternalStorageDirectory() + "/Documents", "IPTVSmarters"))));
            File[] fileArrB = c.h.a.h.n.e.B(this.f26158e);
            if (fileArrB == null || fileArrB.length <= 0) {
                this.f26161h.clear();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f26158e);
                this.f26162i = linearLayoutManager;
                this.recyclerView.setLayoutManager(linearLayoutManager);
                this.f26160g = new RecordingAdapter(this, this.f26161h);
                this.recyclerView.setItemAnimator(new a.y.e.c());
                this.recyclerView.setAdapter(this.f26160g);
                this.tvNoRecordFound.setVisibility(0);
                this.tvNoRecordFound.setText(getResources().getString(R.string.no_recording_found));
                return;
            }
            this.f26161h.clear();
            for (File file : fileArrB) {
                if (file.toString().endsWith(".ts")) {
                    this.f26161h.addAll(Arrays.asList(file));
                }
            }
            if (this.f26161h.size() > 0) {
                this.rlRecordingDirChange.setVisibility(0);
                this.tvNoRecordFound.setVisibility(8);
                this.tv_no_record_found_dontaskmeagain.setFocusable(false);
            } else {
                this.tvNoRecordFound.setVisibility(0);
                this.tvNoRecordFound.setText(getResources().getString(R.string.no_recording_found));
                this.tvNoRecordFound.setClickable(false);
                this.rlRecordingDirChange.setVisibility(0);
            }
            this.f26162i = new LinearLayoutManager(this.f26158e);
            Collections.reverse(this.f26161h);
            this.recyclerView.setLayoutManager(this.f26162i);
            this.f26160g = new RecordingAdapter(this, this.f26161h);
            this.recyclerView.setItemAnimator(new a.y.e.c());
            this.recyclerView.setAdapter(this.f26160g);
        }
    }

    @OnClick
    public void HandleDontAsk() {
        Toast.makeText(this, this.f26158e.getResources().getString(R.string.grant_the_permission), 1).show();
        this.f26165l = Boolean.TRUE;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", getPackageName(), null));
            startActivityForResult(intent, 101);
        } catch (Exception unused) {
        }
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

    public void J0(File file, RecordingActivity recordingActivity) {
        if (recordingActivity == null || this.f26160g == null || this.f26161h == null || this.tvNoRecordFound == null) {
            return;
        }
        new c.h.a.h.n.e().g0(recordingActivity, file, this.f26160g, this.f26161h, this.tvNoRecordFound);
    }

    @OnClick
    public void NoRecordingfound() {
        try {
            I0();
            I0();
        } catch (Exception unused) {
        }
    }

    public void b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 101) {
            try {
                I0();
            } catch (Exception unused) {
            }
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
        this.f26158e = this;
        G0();
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f26158e);
        f26157d = aVar;
        String strA = aVar.A();
        this.f26167n = strA;
        setContentView(strA.equals(c.h.a.h.n.a.s0) ? R.layout.activity_recording_tv : R.layout.activity_recording);
        ButterKnife.a(this);
        D0();
        F0();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(R.drawable.black_background));
        }
        getWindow().setFlags(1024, 1024);
        I0();
        H0();
        this.logo.setOnClickListener(new a());
        this.iv_back_button.setOnClickListener(new b());
        Thread thread = this.f26166m;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new g());
            this.f26166m = thread2;
            thread2.start();
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f26166m;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f26166m.interrupt();
        } catch (Exception unused) {
        }
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
                button.setOnFocusChangeListener(new e.j((View) button, this));
                button2.setOnFocusChangeListener(new e.j((View) button2, this));
                button.requestFocus();
                button.setOnClickListener(new c());
                button2.setOnClickListener(new d());
                aVar.setView(viewInflate);
                this.f26168o = aVar.create();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f26168o.getWindow();
                window.getClass();
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.f26168o.show();
                this.f26168o.getWindow().setAttributes(layoutParams);
                this.f26168o.setCancelable(false);
                this.f26168o.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        G0();
        super.onResume();
        Thread thread = this.f26166m;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new g());
            this.f26166m = thread2;
            thread2.start();
        }
        c.h.a.h.n.e.g(this.f26158e);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26159f = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f26159f.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f26158e != null) {
            b();
        }
    }

    @OnClick
    public void onViewClicked() {
        c.h.a.h.f fVar = new c.h.a.h.f(this.f26158e, new e(new String[]{BuildConfig.FLAVOR}));
        if (Build.VERSION.SDK_INT >= 30) {
            fVar.D(BuildConfig.FLAVOR);
        } else {
            fVar.C(BuildConfig.FLAVOR);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        G0();
    }
}
