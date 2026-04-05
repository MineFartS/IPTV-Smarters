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
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import java.util.Calendar;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class AutomationActivity extends a.b.k.c implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btSaveChanges;

    @BindView
    public Button btnBackPlayerselection;

    @BindView
    public CheckBox cbAutomationEPG;

    @BindView
    public CheckBox cbAutomationLiveVod;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f25353d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f25354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences.Editor f25355f;

    @BindView
    public FrameLayout fl_auto_update_days;

    @BindView
    public FrameLayout fl_auto_update_epg_days;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences f25356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SharedPreferences.Editor f25357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.i.q.f f25358i;

    @BindView
    public ImageView logo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a.b.k.b f25363n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c.h.a.k.d.a.a f25364o;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tv_auto_update_days;

    @BindView
    public TextView tv_auto_update_epg_days;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.b f25359j = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.b f25360k = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f25361l = c.h.a.h.n.a.l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25362m = c.h.a.h.n.a.p0;
    public Thread p = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(AutomationActivity.this.f25353d);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(AutomationActivity.this.f25353d);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = AutomationActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = AutomationActivity.this.date;
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
            TextView textView;
            String str;
            switch (i2) {
                case 0:
                    AutomationActivity.this.G0(1);
                    textView = AutomationActivity.this.tv_auto_update_epg_days;
                    str = "1";
                    break;
                case 1:
                    AutomationActivity.this.G0(2);
                    textView = AutomationActivity.this.tv_auto_update_epg_days;
                    str = "2";
                    break;
                case 2:
                    AutomationActivity.this.G0(3);
                    textView = AutomationActivity.this.tv_auto_update_epg_days;
                    str = "3";
                    break;
                case 3:
                    AutomationActivity.this.G0(4);
                    textView = AutomationActivity.this.tv_auto_update_epg_days;
                    str = "4";
                    break;
                case 4:
                    AutomationActivity.this.G0(5);
                    textView = AutomationActivity.this.tv_auto_update_epg_days;
                    str = "5";
                    break;
                case 5:
                    AutomationActivity.this.G0(6);
                    textView = AutomationActivity.this.tv_auto_update_epg_days;
                    str = "6";
                    break;
                case 6:
                    AutomationActivity.this.G0(7);
                    textView = AutomationActivity.this.tv_auto_update_epg_days;
                    str = "7";
                    break;
                default:
                    return;
            }
            textView.setText(str);
            dialogInterface.cancel();
        }
    }

    public class d implements DialogInterface.OnDismissListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            TextView textView;
            String str;
            switch (i2) {
                case 0:
                    AutomationActivity.this.E0(1);
                    textView = AutomationActivity.this.tv_auto_update_days;
                    str = "1";
                    break;
                case 1:
                    AutomationActivity.this.E0(2);
                    textView = AutomationActivity.this.tv_auto_update_days;
                    str = "2";
                    break;
                case 2:
                    AutomationActivity.this.E0(3);
                    textView = AutomationActivity.this.tv_auto_update_days;
                    str = "3";
                    break;
                case 3:
                    AutomationActivity.this.E0(4);
                    textView = AutomationActivity.this.tv_auto_update_days;
                    str = "4";
                    break;
                case 4:
                    AutomationActivity.this.E0(5);
                    textView = AutomationActivity.this.tv_auto_update_days;
                    str = "5";
                    break;
                case 5:
                    AutomationActivity.this.E0(6);
                    textView = AutomationActivity.this.tv_auto_update_days;
                    str = "6";
                    break;
                case 6:
                    AutomationActivity.this.E0(7);
                    textView = AutomationActivity.this.tv_auto_update_days;
                    str = "7";
                    break;
                default:
                    return;
            }
            textView.setText(str);
            dialogInterface.cancel();
        }
    }

    public class f implements DialogInterface.OnDismissListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    AutomationActivity.this.F0();
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
        public final View f25372b;

        public h(View view) {
            this.f25372b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25372b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25372b, "scaleY", f2);
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
                View view4 = this.f25372b;
                if ((view4 == null || view4.getTag() == null || !this.f25372b.getTag().equals("1")) && ((view2 = this.f25372b) == null || view2.getTag() == null || !this.f25372b.getTag().equals("2"))) {
                    return;
                }
                this.f25372b.setBackgroundResource(R.drawable.black_button_dark);
                return;
            }
            f2 = z ? 1.05f : 1.0f;
            View view5 = this.f25372b;
            if (view5 == null || view5.getTag() == null || !this.f25372b.getTag().equals("1")) {
                View view6 = this.f25372b;
                if (view6 == null || view6.getTag() == null || !this.f25372b.getTag().equals("2")) {
                    View view7 = this.f25372b;
                    if (view7 == null || view7.getTag() == null) {
                        return;
                    }
                    this.f25372b.setBackground(AutomationActivity.this.getResources().getDrawable(R.drawable.selector_tracks_layout));
                    return;
                }
                a(f2);
                b(f2);
                view3 = this.f25372b;
                i2 = R.drawable.logout_btn_effect;
            } else {
                a(f2);
                b(f2);
                view3 = this.f25372b;
                i2 = R.drawable.back_btn_effect;
            }
            view3.setBackgroundResource(i2);
        }
    }

    public final void B0() {
        int i2 = 0;
        CharSequence[] charSequenceArr = {"1", "2", "3", "4", "5", "6", "7"};
        b.a aVar = new b.a(this);
        aVar.setTitle(getResources().getString(R.string.autoupdate_days));
        int i3 = this.f25354e.getInt("automation_channels_days", c.h.a.h.n.a.l0);
        this.f25361l = i3;
        switch (i3) {
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
                i2 = 3;
                break;
            case 5:
                i2 = 4;
                break;
            case 6:
                i2 = 5;
                break;
            case 7:
                i2 = 6;
                break;
        }
        aVar.l(charSequenceArr, i2, new e());
        a.b.k.b bVarCreate = aVar.create();
        this.f25363n = bVarCreate;
        bVarCreate.setOnDismissListener(new f());
        this.f25363n.show();
    }

    public final void C0() {
        int i2 = 0;
        CharSequence[] charSequenceArr = {"1", "2", "3", "4", "5", "6", "7"};
        b.a aVar = new b.a(this);
        aVar.setTitle(getResources().getString(R.string.autoupdate_days));
        int i3 = this.f25356g.getInt("automation_epg_days", c.h.a.h.n.a.p0);
        this.f25362m = i3;
        switch (i3) {
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
                i2 = 3;
                break;
            case 5:
                i2 = 4;
                break;
            case 6:
                i2 = 5;
                break;
            case 7:
                i2 = 6;
                break;
        }
        aVar.l(charSequenceArr, i2, new c());
        a.b.k.b bVarCreate = aVar.create();
        this.f25363n = bVarCreate;
        bVarCreate.setOnDismissListener(new d());
        this.f25363n.show();
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

    public final void E0(int i2) {
        SharedPreferences.Editor editor = this.f25355f;
        if (editor != null) {
            editor.putInt("automation_channels_days", i2);
            this.f25355f.apply();
        }
    }

    public void F0() {
        runOnUiThread(new b());
    }

    public final void G0(int i2) {
        SharedPreferences.Editor editor = this.f25357h;
        if (editor != null) {
            editor.putInt("automation_epg_days", i2);
            this.f25357h.apply();
        }
    }

    public final void H0() {
        Button button = this.btSaveChanges;
        if (button != null) {
            button.setOnFocusChangeListener(new h(button));
        }
        Button button2 = this.btnBackPlayerselection;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new h(button2));
        }
        CheckBox checkBox = this.cbAutomationLiveVod;
        if (checkBox != null) {
            checkBox.setOnFocusChangeListener(new h(checkBox));
        }
        CheckBox checkBox2 = this.cbAutomationEPG;
        if (checkBox2 != null) {
            checkBox2.setOnFocusChangeListener(new h(checkBox2));
        }
        FrameLayout frameLayout = this.fl_auto_update_days;
        if (frameLayout != null) {
            frameLayout.setOnFocusChangeListener(new h(frameLayout));
        }
        FrameLayout frameLayout2 = this.fl_auto_update_epg_days;
        if (frameLayout2 != null) {
            frameLayout2.setOnFocusChangeListener(new h(frameLayout2));
        }
    }

    public final void I0() {
        this.f25353d = this;
        this.f25358i = new c.h.a.i.q.f(this.f25353d);
        this.f25354e = getSharedPreferences("automation_channels", 0);
        this.f25356g = getSharedPreferences("automation_epg", 0);
        String string = this.f25354e.getString("automation_channels", BuildConfig.FLAVOR);
        this.f25361l = this.f25354e.getInt("automation_channels_days", c.h.a.h.n.a.l0);
        String string2 = this.f25356g.getString("automation_epg", BuildConfig.FLAVOR);
        this.f25362m = this.f25356g.getInt("automation_epg_days", c.h.a.h.n.a.p0);
        this.f25355f = this.f25354e.edit();
        this.f25357h = this.f25356g.edit();
        this.fl_auto_update_days.setOnClickListener(this);
        this.fl_auto_update_epg_days.setOnClickListener(this);
        TextView textView = this.tv_auto_update_days;
        if (textView != null) {
            textView.setText(String.valueOf(this.f25361l));
        }
        TextView textView2 = this.tv_auto_update_epg_days;
        if (textView2 != null) {
            textView2.setText(String.valueOf(this.f25362m));
        }
        if (string.equalsIgnoreCase("checked")) {
            this.cbAutomationLiveVod.setChecked(true);
        } else if (string.equalsIgnoreCase("unchecked")) {
            this.cbAutomationLiveVod.setChecked(false);
        } else {
            this.f25355f.putString("automation_channels", "checked");
            this.f25355f.apply();
            this.cbAutomationLiveVod.setChecked(true);
        }
        if (!string2.equalsIgnoreCase("checked")) {
            if (string2.equalsIgnoreCase("unchecked")) {
                this.cbAutomationEPG.setChecked(false);
                return;
            } else {
                this.f25357h.putString("automation_epg", "checked");
                this.f25357h.apply();
            }
        }
        this.cbAutomationEPG.setChecked(true);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fl_auto_update_days /* 2131428004 */:
                B0();
                break;
            case R.id.fl_auto_update_epg_days /* 2131428005 */:
                C0();
                break;
            case R.id.tv_header_title /* 2131429402 */:
                startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                break;
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f25353d = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f25353d);
        this.f25364o = aVar;
        setContentView(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_automation_tv : R.layout.activity_automation);
        ButterKnife.a(this);
        H0();
        D0();
        v0((Toolbar) findViewById(R.id.toolbar));
        getWindow().setFlags(1024, 1024);
        this.logo.setOnClickListener(new a());
        I0();
        Thread thread = this.p;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new g());
            this.p = thread2;
            thread2.start();
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.p;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.p.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.p;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new g());
            this.p = thread2;
            thread2.start();
        }
        c.h.a.h.n.e.g(this.f25353d);
    }

    @OnClick
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.bt_save_changes) {
            this.f25354e = getSharedPreferences("automation_channels", 0);
            this.f25356g = getSharedPreferences("automation_epg", 0);
            this.f25355f = this.f25354e.edit();
            this.f25357h = this.f25356g.edit();
            if (this.cbAutomationLiveVod.isChecked()) {
                SharedPreferences.Editor editor = this.f25355f;
                if (editor != null) {
                    editor.putString("automation_channels", "checked");
                }
            } else {
                SharedPreferences.Editor editor2 = this.f25355f;
                if (editor2 != null) {
                    editor2.putString("automation_channels", "unchecked");
                }
            }
            if (this.cbAutomationEPG.isChecked()) {
                SharedPreferences.Editor editor3 = this.f25357h;
                if (editor3 != null) {
                    editor3.putString("automation_epg", "checked");
                }
            } else {
                SharedPreferences.Editor editor4 = this.f25357h;
                if (editor4 != null) {
                    editor4.putString("automation_epg", "unchecked");
                }
            }
            this.f25355f.apply();
            this.f25357h.apply();
            Toast.makeText(this, getResources().getString(R.string.player_setting_save), 0).show();
        } else if (id != R.id.btn_back_playerselection) {
            return;
        }
        finish();
    }
}
