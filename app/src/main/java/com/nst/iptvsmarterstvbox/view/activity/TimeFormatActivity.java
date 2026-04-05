package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.b;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import java.util.Calendar;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class TimeFormatActivity extends a.b.k.c implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btSaveChanges;

    @BindView
    public Button btnBackPlayerselection;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f26861d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f26862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences.Editor f26863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.h.a.i.q.f f26864g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.k.d.a.a f26869l;

    @BindView
    public ImageView logo;

    @BindView
    public RadioButton rb12hr;

    @BindView
    public RadioButton rb24hr;

    @BindView
    public RadioGroup rgRadio;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.h.a.i.q.b f26865h = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.i.q.b f26866i = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26867j = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f26868k = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Thread f26870m = null;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(TimeFormatActivity.this.f26861d);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = TimeFormatActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = TimeFormatActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(TimeFormatActivity.this.f26861d);
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
            c.h.a.h.n.e.O(TimeFormatActivity.this.f26861d);
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(TimeFormatActivity.this.f26861d);
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
                    TimeFormatActivity.this.A0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26880b;

        public j(View view) {
            this.f26880b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26880b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26880b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            View view2;
            View view3;
            int i2;
            if (!z) {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                a(f2);
                b(f2);
                View view4 = this.f26880b;
                if ((view4 == null || view4.getTag() == null || !this.f26880b.getTag().equals("1")) && ((view2 = this.f26880b) == null || view2.getTag() == null || !this.f26880b.getTag().equals("2"))) {
                    return;
                }
                this.f26880b.setBackgroundResource(R.drawable.black_button_dark);
                return;
            }
            f2 = z ? 1.05f : 1.0f;
            View view5 = this.f26880b;
            if (view5 == null || view5.getTag() == null || !this.f26880b.getTag().equals("1")) {
                View view6 = this.f26880b;
                if (view6 == null || view6.getTag() == null || !this.f26880b.getTag().equals("2")) {
                    View view7 = this.f26880b;
                    if (view7 == null || view7.getTag() == null) {
                        return;
                    }
                    this.f26880b.setBackground(TimeFormatActivity.this.getResources().getDrawable(R.drawable.selector_tracks_layout));
                    return;
                }
                a(f2);
                b(f2);
                view3 = this.f26880b;
                i2 = R.drawable.logout_btn_effect;
            } else {
                a(f2);
                b(f2);
                view3 = this.f26880b;
                i2 = R.drawable.back_btn_effect;
            }
            view3.setBackgroundResource(i2);
        }
    }

    public void A0() {
        runOnUiThread(new a());
        this.logo.setOnClickListener(new b());
    }

    public final void B0() {
        Button button = this.btSaveChanges;
        if (button != null) {
            button.setOnFocusChangeListener(new j(button));
            this.btSaveChanges.requestFocus();
            this.btSaveChanges.requestFocusFromTouch();
        }
        Button button2 = this.btnBackPlayerselection;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new j(button2));
        }
        RadioButton radioButton = this.rb24hr;
        if (radioButton != null) {
            radioButton.setOnFocusChangeListener(new j(radioButton));
        }
        RadioButton radioButton2 = this.rb12hr;
        if (radioButton2 != null) {
            radioButton2.setOnFocusChangeListener(new j(radioButton2));
        }
    }

    public final void C0() {
        RadioButton radioButton;
        this.f26861d = this;
        this.f26864g = new c.h.a.i.q.f(this.f26861d);
        SharedPreferences sharedPreferences = getSharedPreferences("timeFormat", 0);
        this.f26862e = sharedPreferences;
        if (sharedPreferences.getString("timeFormat", c.h.a.h.n.a.m0).equals("hh:mm a")) {
            this.rb12hr.setChecked(true);
            radioButton = this.rb12hr;
        } else {
            this.rb24hr.setChecked(true);
            radioButton = this.rb24hr;
        }
        radioButton.requestFocus();
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
        this.f26861d = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f26861d);
        this.f26869l = aVar;
        setContentView(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_time_format_tv : R.layout.activity_time_format);
        ButterKnife.a(this);
        B0();
        z0();
        v0((Toolbar) findViewById(R.id.toolbar));
        getWindow().setFlags(1024, 1024);
        C0();
        Thread thread = this.f26870m;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new i());
            this.f26870m = thread2;
            thread2.start();
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
        if (itemId == R.id.action_logout && (context = this.f26861d) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new d()).g(getResources().getString(R.string.no), new c()).n();
        }
        if (itemId == R.id.menu_load_channels_vod) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f26861d.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f26861d.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f26861d.getResources().getString(R.string.yes), new e());
            aVar.g(this.f26861d.getResources().getString(R.string.no), new f());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.f26861d.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.f26861d.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.f26861d.getResources().getString(R.string.yes), new g());
            aVar2.g(this.f26861d.getResources().getString(R.string.no), new h());
            aVar2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f26870m;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f26870m.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f26870m;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new i());
            this.f26870m = thread2;
            thread2.start();
        }
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26862e = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f26862e.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        }
    }

    @OnClick
    public void onViewClicked(View view) {
        SharedPreferences.Editor editor;
        String str;
        int id = view.getId();
        if (id == R.id.bt_save_changes) {
            RadioButton radioButton = (RadioButton) findViewById(this.rgRadio.getCheckedRadioButtonId());
            SharedPreferences sharedPreferences = getSharedPreferences("timeFormat", 0);
            this.f26862e = sharedPreferences;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            this.f26863f = editorEdit;
            if (editorEdit == null) {
                Toast.makeText(this, getResources().getString(R.string.player_setting_error), 0).show();
                return;
            }
            if (radioButton.getTag().equals(c.h.a.h.n.a.n0)) {
                editor = this.f26863f;
                str = "hh:mm a";
            } else {
                editor = this.f26863f;
                str = "HH:mm";
            }
            editor.putString("timeFormat", str);
            this.f26863f.apply();
            Toast.makeText(this, getResources().getString(R.string.player_setting_save), 0).show();
            Thread thread = this.f26870m;
            if (thread == null || !thread.isAlive()) {
                Thread thread2 = new Thread(new i());
                this.f26870m = thread2;
                thread2.start();
            }
        } else if (id != R.id.btn_back_playerselection) {
            return;
        }
        finish();
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
