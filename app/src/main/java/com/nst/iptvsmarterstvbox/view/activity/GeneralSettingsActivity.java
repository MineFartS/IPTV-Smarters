package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.b;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.h.a.i.q.m;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import java.util.Calendar;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class GeneralSettingsActivity extends a.b.k.c implements View.OnClickListener {

    @BindView
    public CheckBox activesubtitle;

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public CheckBox autoStart;

    @BindView
    public CheckBox auto_clear_cache;

    @BindView
    public CheckBox auto_play_channel_in_live;

    @BindView
    public CheckBox autoplay;

    @BindView
    public Button btSaveChanges;

    @BindView
    public TextView bt_clear_now;

    @BindView
    public Button btnBackPlayerselection;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f25620d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f25621e;

    @BindView
    public EditText etUserAgent;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences.Editor f25622f;

    @BindView
    public FrameLayout fl_auto_play_in;

    @BindView
    public FrameLayout fl_recently_added_limit;

    @BindView
    public FrameLayout fl_recently_watched_limit_live;

    @BindView
    public CheckBox fullEPG;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences f25623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SharedPreferences.Editor f25624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SharedPreferences f25625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SharedPreferences.Editor f25626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.f f25627k;

    @BindView
    public LinearLayout ll_auto_play_next_episode;

    @BindView
    public LinearLayout ll_recently_added_limit;

    @BindView
    public LinearLayout ll_recently_watched_limit_live;

    @BindView
    public ImageView logo;
    public SharedPreferences p;

    @BindView
    public CheckBox picinpic;
    public SharedPreferences q;
    public SharedPreferences.Editor r;
    public SharedPreferences.Editor s;

    @BindView
    public CheckBox show_epg_in_channels_list;

    @BindView
    public Spinner spinnerEPG;
    public SharedPreferences.Editor t;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tv_auto_play_in;

    @BindView
    public TextView tv_recently_added_limit;

    @BindView
    public TextView tv_recently_watched_limit_live;

    @BindView
    public TextView tv_useragent;
    public SharedPreferences u;
    public String v;
    public a.b.k.b w;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.b f25628l = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.b f25629m = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f25630n = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f25631o = BuildConfig.FLAVOR;
    public String x = "mobile";
    public boolean y = false;
    public int z = c.h.a.h.n.a.Z;
    public int A = c.h.a.h.n.a.a0;
    public String B = c.h.a.h.n.a.b0;
    public Thread C = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(GeneralSettingsActivity.this.f25620d);
        }
    }

    public class b extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f25633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f25634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f25635d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f25636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f25637f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f25638g;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f25640b;

            public a(View view) {
                this.f25640b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f25640b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f25640b.getTag().equals("1")) {
                        View view3 = this.f25640b;
                        if (view3 == null || view3.getTag() == null || !this.f25640b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = b.this.f25638g;
                    }
                    linearLayout = b.this.f25637f;
                } else {
                    View view4 = this.f25640b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f25640b.getTag().equals("1")) {
                        View view5 = this.f25640b;
                        if (view5 == null || view5.getTag() == null || !this.f25640b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = b.this.f25638g;
                    }
                    linearLayout = b.this.f25637f;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public b(Activity activity) {
            super(activity);
            this.f25633b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.btn_no) {
                dismiss();
            } else if (id == R.id.btn_yes) {
                try {
                    c.h.a.h.n.e.j(GeneralSettingsActivity.this.f25620d);
                    GeneralSettingsActivity generalSettingsActivity = GeneralSettingsActivity.this;
                    Toast.makeText(generalSettingsActivity, generalSettingsActivity.getResources().getString(R.string.cache_cleared_successfully), 0).show();
                } catch (Exception unused) {
                }
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(new c.h.a.k.d.a.a(GeneralSettingsActivity.this.f25620d).A().equals(c.h.a.h.n.a.s0) ? R.layout.custom_alert_layout_tv : R.layout.custom_alert_layout);
            this.f25634c = (TextView) findViewById(R.id.btn_yes);
            this.f25635d = (TextView) findViewById(R.id.btn_no);
            this.f25637f = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
            this.f25638g = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
            TextView textView = (TextView) findViewById(R.id.txt_dia);
            this.f25636e = textView;
            textView.setText(GeneralSettingsActivity.this.f25620d.getResources().getString(R.string.you_want_to_clear_cache_now));
            this.f25634c.setOnClickListener(this);
            this.f25635d.setOnClickListener(this);
            TextView textView2 = this.f25634c;
            textView2.setOnFocusChangeListener(new a(textView2));
            TextView textView3 = this.f25635d;
            textView3.setOnFocusChangeListener(new a(textView3));
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(GeneralSettingsActivity.this.f25620d);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = GeneralSettingsActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = GeneralSettingsActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            TextView textView;
            String str;
            if (i2 == 0) {
                GeneralSettingsActivity.this.L0(10);
                textView = GeneralSettingsActivity.this.tv_recently_added_limit;
                str = "10";
            } else if (i2 == 1) {
                GeneralSettingsActivity.this.L0(20);
                textView = GeneralSettingsActivity.this.tv_recently_added_limit;
                str = "20";
            } else if (i2 == 2) {
                GeneralSettingsActivity.this.L0(30);
                textView = GeneralSettingsActivity.this.tv_recently_added_limit;
                str = "30";
            } else if (i2 == 3) {
                GeneralSettingsActivity.this.L0(40);
                textView = GeneralSettingsActivity.this.tv_recently_added_limit;
                str = "40";
            } else if (i2 == 4) {
                GeneralSettingsActivity.this.L0(50);
                textView = GeneralSettingsActivity.this.tv_recently_added_limit;
                str = "50";
            } else {
                if (i2 != 5) {
                    return;
                }
                GeneralSettingsActivity.this.L0(100);
                textView = GeneralSettingsActivity.this.tv_recently_added_limit;
                str = "100";
            }
            textView.setText(str);
            dialogInterface.cancel();
        }
    }

    public class e implements DialogInterface.OnDismissListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            TextView textView;
            String str;
            if (i2 == 0) {
                GeneralSettingsActivity.this.N0(5);
                textView = GeneralSettingsActivity.this.tv_recently_watched_limit_live;
                str = "5";
            } else if (i2 == 1) {
                GeneralSettingsActivity.this.N0(10);
                textView = GeneralSettingsActivity.this.tv_recently_watched_limit_live;
                str = "10";
            } else if (i2 == 2) {
                GeneralSettingsActivity.this.N0(20);
                textView = GeneralSettingsActivity.this.tv_recently_watched_limit_live;
                str = "20";
            } else if (i2 == 3) {
                GeneralSettingsActivity.this.N0(30);
                textView = GeneralSettingsActivity.this.tv_recently_watched_limit_live;
                str = "30";
            } else if (i2 == 4) {
                GeneralSettingsActivity.this.N0(40);
                textView = GeneralSettingsActivity.this.tv_recently_watched_limit_live;
                str = "40";
            } else {
                if (i2 != 5) {
                    return;
                }
                GeneralSettingsActivity.this.N0(50);
                textView = GeneralSettingsActivity.this.tv_recently_watched_limit_live;
                str = "50";
            }
            textView.setText(str);
            dialogInterface.cancel();
        }
    }

    public class g implements DialogInterface.OnDismissListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            GeneralSettingsActivity generalSettingsActivity;
            String str;
            if (i2 == 0) {
                generalSettingsActivity = GeneralSettingsActivity.this;
                str = "10s";
            } else if (i2 == 1) {
                generalSettingsActivity = GeneralSettingsActivity.this;
                str = "20s";
            } else if (i2 == 2) {
                generalSettingsActivity = GeneralSettingsActivity.this;
                str = "30s";
            } else if (i2 == 3) {
                generalSettingsActivity = GeneralSettingsActivity.this;
                str = "40s";
            } else if (i2 == 4) {
                generalSettingsActivity = GeneralSettingsActivity.this;
                str = "50s";
            } else {
                if (i2 != 5) {
                    return;
                }
                generalSettingsActivity = GeneralSettingsActivity.this;
                str = "60s";
            }
            generalSettingsActivity.J0(str);
            GeneralSettingsActivity.this.tv_auto_play_in.setText(str);
            dialogInterface.cancel();
        }
    }

    public class i implements DialogInterface.OnDismissListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    GeneralSettingsActivity.this.F0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class k implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f25650b;

        public k(View view) {
            this.f25650b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25650b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25650b, "scaleY", f2);
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
                f2 = z ? 1.05f : 1.0f;
                a(f2);
                b(f2);
                View view4 = this.f25650b;
                if ((view4 == null || view4.getTag() == null || !this.f25650b.getTag().equals("1")) && ((view2 = this.f25650b) == null || view2.getTag() == null || !this.f25650b.getTag().equals("2"))) {
                    return;
                }
                this.f25650b.setBackgroundResource(R.drawable.black_button_dark);
                return;
            }
            f2 = z ? 1.05f : 1.0f;
            View view5 = this.f25650b;
            if (view5 == null || view5.getTag() == null || !this.f25650b.getTag().equals("1")) {
                View view6 = this.f25650b;
                if (view6 == null || view6.getTag() == null || !this.f25650b.getTag().equals("2")) {
                    View view7 = this.f25650b;
                    if (view7 == null || view7.getTag() == null) {
                        return;
                    }
                    this.f25650b.setBackground(GeneralSettingsActivity.this.getResources().getDrawable(R.drawable.selector_tracks_layout));
                    return;
                }
                a(f2);
                b(f2);
                view3 = this.f25650b;
                i2 = R.drawable.logout_btn_effect;
            } else {
                a(f2);
                b(f2);
                view3 = this.f25650b;
                i2 = R.drawable.back_btn_effect;
            }
            view3.setBackgroundResource(i2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void C0() {
        int i2;
        CharSequence[] charSequenceArr = {"10s", "20s", "30s", "40s", "50s", "60s"};
        b.a aVar = new b.a(this);
        aVar.setTitle(getResources().getString(R.string.autoplay_episode));
        String string = this.u.getString("autoplay_seconds", c.h.a.h.n.a.b0);
        this.B = string;
        string.hashCode();
        byte b2 = -1;
        switch (string.hashCode()) {
            case 48692:
                if (string.equals("10s")) {
                    b2 = 0;
                }
                break;
            case 49653:
                if (string.equals("20s")) {
                    b2 = 1;
                }
                break;
            case 50614:
                if (string.equals("30s")) {
                    b2 = 2;
                }
                break;
            case 51575:
                if (string.equals("40s")) {
                    b2 = 3;
                }
                break;
            case 52536:
                if (string.equals("50s")) {
                    b2 = 4;
                }
                break;
            case 53497:
                if (string.equals("60s")) {
                    b2 = 5;
                }
                break;
        }
        switch (b2) {
            case 0:
            default:
                i2 = 0;
                break;
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 5;
                break;
        }
        aVar.l(charSequenceArr, i2, new h());
        a.b.k.b bVarCreate = aVar.create();
        this.w = bVarCreate;
        bVarCreate.setOnDismissListener(new i());
        this.w.show();
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

    public final void E0() {
        new b(this).show();
    }

    public void F0() {
        runOnUiThread(new c());
    }

    public final void G0() {
        Button button = this.btnBackPlayerselection;
        if (button != null) {
            button.setOnFocusChangeListener(new k(button));
        }
        CheckBox checkBox = this.autoStart;
        if (checkBox != null) {
            checkBox.setOnFocusChangeListener(new k(checkBox));
            this.autoStart.requestFocus();
        }
        EditText editText = this.etUserAgent;
        if (editText != null) {
            editText.setOnFocusChangeListener(new k(editText));
        }
        CheckBox checkBox2 = this.fullEPG;
        if (checkBox2 != null) {
            checkBox2.setOnFocusChangeListener(new k(checkBox2));
        }
        Spinner spinner = this.spinnerEPG;
        if (spinner != null) {
            spinner.setOnFocusChangeListener(new k(spinner));
        }
        CheckBox checkBox3 = this.activesubtitle;
        if (checkBox3 != null) {
            checkBox3.setOnFocusChangeListener(new k(checkBox3));
        }
        CheckBox checkBox4 = this.picinpic;
        if (checkBox4 != null) {
            checkBox4.setOnFocusChangeListener(new k(checkBox4));
        }
        CheckBox checkBox5 = this.autoplay;
        if (checkBox5 != null) {
            checkBox5.setOnFocusChangeListener(new k(checkBox5));
        }
        FrameLayout frameLayout = this.fl_auto_play_in;
        if (frameLayout != null) {
            frameLayout.setOnFocusChangeListener(new k(frameLayout));
        }
        FrameLayout frameLayout2 = this.fl_recently_added_limit;
        if (frameLayout2 != null) {
            frameLayout2.setOnFocusChangeListener(new k(frameLayout2));
        }
        FrameLayout frameLayout3 = this.fl_recently_watched_limit_live;
        if (frameLayout3 != null) {
            frameLayout3.setOnFocusChangeListener(new k(frameLayout3));
        }
        TextView textView = this.bt_clear_now;
        if (textView != null) {
            textView.setOnFocusChangeListener(new k(textView));
        }
        CheckBox checkBox6 = this.auto_clear_cache;
        if (checkBox6 != null) {
            checkBox6.setOnFocusChangeListener(new k(checkBox6));
        }
        CheckBox checkBox7 = this.show_epg_in_channels_list;
        if (checkBox7 != null) {
            checkBox7.setOnFocusChangeListener(new k(checkBox7));
        }
        CheckBox checkBox8 = this.auto_play_channel_in_live;
        if (checkBox8 != null) {
            checkBox8.setOnFocusChangeListener(new k(checkBox8));
        }
        Button button2 = this.btSaveChanges;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new k(button2));
        }
    }

    public final void H0() {
        this.f25620d = this;
        this.f25627k = new c.h.a.i.q.f(this.f25620d);
        this.f25621e = getSharedPreferences("automation_channels", 0);
        this.f25623g = getSharedPreferences("automation_epg", 0);
        this.f25625i = getSharedPreferences("user_agent", 0);
        String string = this.f25621e.getString("auto_start_on_bootup", BuildConfig.FLAVOR);
        String string2 = this.f25625i.getString("user_agent", "IPTVSmartersPlayer");
        if (string.equals("checked")) {
            this.autoStart.setChecked(true);
        }
        EditText editText = this.etUserAgent;
        if (editText != null) {
            editText.setText(string2);
        }
        this.p = getSharedPreferences("loginPrefs", 0);
        this.q = getSharedPreferences("selected_language", 0);
        this.p = getSharedPreferences("loginPrefs", 0);
        String string3 = this.q.getString("selected_language", BuildConfig.FLAVOR);
        this.v = string3;
        if (string3.equals("English")) {
            string3 = "en";
        } else if (string3.equals("Polish")) {
            string3 = "pl";
        } else if (string3.equals("Portuguese")) {
            string3 = "pt";
        } else if (string3.equals("Turkish")) {
            string3 = "tr";
        } else if (string3.equals("Croatian")) {
            string3 = "hr";
        } else if (string3.equals("Spanish")) {
            string3 = "es";
        } else if (string3.equals("Arabic")) {
            string3 = "ar";
        } else if (string3.equals("French")) {
            string3 = "fr";
        } else if (string3.equals("German")) {
            string3 = "de";
        } else if (string3.equals("Italian")) {
            string3 = "it";
        } else if (string3.equals("Romanian")) {
            string3 = "ro";
        } else if (string3.equals("Hungary")) {
            string3 = "hu";
        } else if (string3.equals("Albanian")) {
            string3 = "sq";
        } else if (string3.equals("Korean")) {
            string3 = "ko";
        } else if (string3.equals("Hebrew")) {
            string3 = "he";
        } else if (string3.equals("Ukrainian")) {
            string3 = "uk";
        } else if (string3.equals("Malay")) {
            string3 = "ms";
        } else if (string3.equals("Dutch")) {
            string3 = "nl";
        } else if (string3.equals("Indonesian")) {
            string3 = "in";
        } else if (string3.equals("Swedish")) {
            string3 = "sv";
        }
        try {
            this.spinnerEPG.setSelection(c.h.a.h.n.e.u(string3));
        } catch (Exception unused) {
        }
    }

    public void I0() {
        AppOpsManager appOpsManager;
        this.f25620d = this;
        Application application = getApplication();
        this.f25620d = application;
        String strA = new c.h.a.k.d.a.a(application).A();
        setContentView(strA.equals(c.h.a.h.n.a.s0) ? R.layout.activity_general_settings_tv : R.layout.activity_general_settings);
        ButterKnife.a(this);
        G0();
        D0();
        v0((Toolbar) findViewById(R.id.toolbar));
        getWindow().setFlags(1024, 1024);
        if (strA.equals(c.h.a.h.n.a.s0)) {
            this.x = "tv";
        } else {
            this.x = "mobile";
        }
        if (m.f(this.f25620d).equals("m3u")) {
            this.ll_auto_play_next_episode.setVisibility(8);
            this.ll_recently_added_limit.setVisibility(8);
        } else {
            this.ll_auto_play_next_episode.setVisibility(0);
            this.ll_recently_added_limit.setVisibility(0);
        }
        SharedPreferences sharedPreferences = this.f25620d.getSharedPreferences("auto_start", 0);
        this.u = sharedPreferences;
        this.t = sharedPreferences.edit();
        boolean z = this.u.getBoolean("auto_start", true);
        boolean z2 = this.u.getBoolean("full_epg", true);
        boolean z3 = this.u.getBoolean("subtitle_active", true);
        boolean z4 = this.u.getBoolean("autoplay", true);
        this.B = this.u.getString("autoplay_seconds", c.h.a.h.n.a.b0);
        boolean z5 = this.u.getBoolean("picinpic", c.h.a.h.n.a.c0);
        this.z = this.u.getInt("recently_added_limit", c.h.a.h.n.a.Z);
        this.A = this.u.getInt("recently_watched_limit_live", c.h.a.h.n.a.a0);
        boolean z6 = this.u.getBoolean("auto_clear_cache", c.h.a.h.n.a.h0);
        boolean z7 = this.u.getBoolean("show_epg_in_channels_list", c.h.a.h.n.a.i0);
        boolean z8 = this.u.getBoolean("auto_play_channel_in_live", c.h.a.h.n.a.j0);
        if (!this.x.equals("mobile")) {
            this.picinpic.setVisibility(8);
        } else if (Build.VERSION.SDK_INT >= 26) {
            try {
                if (getPackageManager().hasSystemFeature("android.software.picture_in_picture") && (appOpsManager = (AppOpsManager) this.f25620d.getSystemService("appops")) != null && appOpsManager.checkOpNoThrow("android:picture_in_picture", Process.myUid(), this.f25620d.getPackageName()) == 0) {
                    this.y = true;
                }
            } catch (Exception unused) {
            }
        }
        if (this.y) {
            this.picinpic.setTextColor(this.f25620d.getResources().getColor(R.color.white));
            this.picinpic.setEnabled(true);
            if (Build.VERSION.SDK_INT >= 21) {
                this.picinpic.setButtonTintList(ColorStateList.valueOf(this.f25620d.getResources().getColor(R.color.White)));
            }
            CheckBox checkBox = this.picinpic;
            if (z5) {
                checkBox.setChecked(true);
            } else {
                checkBox.setChecked(false);
            }
        } else {
            this.picinpic.setTextColor(this.f25620d.getResources().getColor(R.color.Grey_600));
            this.picinpic.setEnabled(false);
            this.picinpic.setChecked(false);
            if (Build.VERSION.SDK_INT >= 21) {
                this.picinpic.setButtonTintList(ColorStateList.valueOf(this.f25620d.getResources().getColor(R.color.Grey_600)));
            }
        }
        TextView textView = this.tv_auto_play_in;
        if (textView != null) {
            textView.setText(this.B);
        }
        CheckBox checkBox2 = this.activesubtitle;
        if (z3) {
            checkBox2.setChecked(true);
        } else {
            checkBox2.setChecked(false);
        }
        if (z) {
            this.autoStart.setChecked(true);
        } else {
            this.autoStart.setChecked(false);
        }
        CheckBox checkBox3 = this.fullEPG;
        if (z2) {
            checkBox3.setChecked(true);
        } else {
            checkBox3.setChecked(false);
        }
        CheckBox checkBox4 = this.autoplay;
        if (z4) {
            checkBox4.setChecked(true);
        } else {
            checkBox4.setChecked(false);
        }
        CheckBox checkBox5 = this.auto_clear_cache;
        if (z6) {
            checkBox5.setChecked(true);
        } else {
            checkBox5.setChecked(false);
        }
        CheckBox checkBox6 = this.show_epg_in_channels_list;
        if (z7) {
            checkBox6.setChecked(true);
        } else {
            checkBox6.setChecked(false);
        }
        CheckBox checkBox7 = this.auto_play_channel_in_live;
        if (z8) {
            checkBox7.setChecked(true);
        } else {
            checkBox7.setChecked(false);
        }
        TextView textView2 = this.tv_recently_added_limit;
        if (textView2 != null) {
            textView2.setText(String.valueOf(this.z));
        }
        TextView textView3 = this.tv_recently_watched_limit_live;
        if (textView3 != null) {
            textView3.setText(String.valueOf(this.A));
        }
        H0();
        Thread thread = this.C;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new j());
            this.C = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new a());
        this.fl_auto_play_in.setOnClickListener(this);
        this.fl_recently_added_limit.setOnClickListener(this);
        this.fl_recently_watched_limit_live.setOnClickListener(this);
        this.bt_clear_now.setOnClickListener(this);
    }

    public final void J0(String str) {
        SharedPreferences.Editor editor = this.t;
        if (editor != null) {
            editor.putString("autoplay_seconds", str);
            this.t.apply();
        }
    }

    public final void K0() {
        int i2 = 0;
        CharSequence[] charSequenceArr = {"10", "20", "30", "40", "50", "100"};
        b.a aVar = new b.a(this);
        aVar.setTitle(getResources().getString(R.string.recently_added_limit));
        int i3 = this.u.getInt("recently_added_limit", c.h.a.h.n.a.Z);
        this.z = i3;
        if (i3 != 10) {
            if (i3 == 20) {
                i2 = 1;
            } else if (i3 == 30) {
                i2 = 2;
            } else if (i3 == 40) {
                i2 = 3;
            } else if (i3 == 50) {
                i2 = 4;
            } else if (i3 == 100) {
                i2 = 5;
            }
        }
        aVar.l(charSequenceArr, i2, new d());
        a.b.k.b bVarCreate = aVar.create();
        this.w = bVarCreate;
        bVarCreate.setOnDismissListener(new e());
        this.w.show();
    }

    public final void L0(int i2) {
        SharedPreferences.Editor editor = this.t;
        if (editor != null) {
            editor.putInt("recently_added_limit", i2);
            this.t.apply();
        }
    }

    public final void M0() {
        int i2 = 0;
        CharSequence[] charSequenceArr = {"5", "10", "20", "30", "40", "50"};
        b.a aVar = new b.a(this);
        aVar.setTitle(getResources().getString(R.string.recently_watched_limit_live));
        int i3 = this.u.getInt("recently_watched_limit_live", c.h.a.h.n.a.a0);
        this.A = i3;
        if (i3 != 5) {
            if (i3 == 10) {
                i2 = 1;
            } else if (i3 == 20) {
                i2 = 2;
            } else if (i3 == 30) {
                i2 = 3;
            } else if (i3 == 40) {
                i2 = 4;
            } else if (i3 == 50) {
                i2 = 5;
            }
        }
        aVar.l(charSequenceArr, i2, new f());
        a.b.k.b bVarCreate = aVar.create();
        this.w = bVarCreate;
        bVarCreate.setOnDismissListener(new g());
        this.w.show();
    }

    public final void N0(int i2) {
        SharedPreferences.Editor editor = this.t;
        if (editor != null) {
            editor.putInt("recently_watched_limit_live", i2);
            this.t.apply();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_clear_now /* 2131427603 */:
                E0();
                break;
            case R.id.fl_auto_play_in /* 2131428003 */:
                C0();
                break;
            case R.id.fl_recently_added_limit /* 2131428009 */:
                K0();
                break;
            case R.id.fl_recently_watched_limit_live /* 2131428010 */:
                M0();
                break;
            case R.id.tv_header_title /* 2131429402 */:
                startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
                overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
                break;
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        I0();
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.C;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.C.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.C;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new j());
            this.C = thread2;
            thread2.start();
        }
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        c.h.a.h.n.e.g(this.f25620d);
    }

    @OnClick
    @SuppressLint({"ApplySharedPref", "CommitPrefEdits"})
    public void onViewClicked(View view) {
        String strValueOf;
        Resources resources;
        int i2;
        int id = view.getId();
        if (id != R.id.bt_save_changes) {
            if (id != R.id.btn_back_playerselection) {
                return;
            }
            onBackPressed();
            return;
        }
        this.f25621e = getSharedPreferences("automation_channels", 0);
        this.f25623g = getSharedPreferences("auto_start_on_bootup", 0);
        this.f25622f = this.f25621e.edit();
        this.f25626j = this.f25625i.edit();
        this.f25624h = this.f25623g.edit();
        if (this.autoStart.isChecked()) {
            SharedPreferences.Editor editor = this.t;
            if (editor != null) {
                editor.putBoolean("auto_start", true);
            }
        } else {
            SharedPreferences.Editor editor2 = this.t;
            if (editor2 != null) {
                editor2.putBoolean("auto_start", false);
            }
        }
        if (this.fullEPG.isChecked()) {
            SharedPreferences.Editor editor3 = this.t;
            if (editor3 != null) {
                editor3.putBoolean("full_epg", true);
            }
        } else {
            SharedPreferences.Editor editor4 = this.t;
            if (editor4 != null) {
                editor4.putBoolean("full_epg", false);
            }
        }
        if (this.activesubtitle.isChecked()) {
            SharedPreferences.Editor editor5 = this.t;
            if (editor5 != null) {
                editor5.putBoolean("subtitle_active", true);
            }
        } else {
            SharedPreferences.Editor editor6 = this.t;
            if (editor6 != null) {
                editor6.putBoolean("subtitle_active", false);
            }
        }
        if (this.autoplay.isChecked()) {
            SharedPreferences.Editor editor7 = this.t;
            if (editor7 != null) {
                editor7.putBoolean("autoplay", true);
            }
        } else {
            SharedPreferences.Editor editor8 = this.t;
            if (editor8 != null) {
                editor8.putBoolean("autoplay", false);
            }
        }
        if (this.picinpic.isChecked()) {
            SharedPreferences.Editor editor9 = this.t;
            if (editor9 != null) {
                editor9.putBoolean("picinpic", true);
            }
        } else {
            SharedPreferences.Editor editor10 = this.t;
            if (editor10 != null) {
                editor10.putBoolean("picinpic", false);
            }
        }
        if (this.auto_clear_cache.isChecked()) {
            SharedPreferences.Editor editor11 = this.t;
            if (editor11 != null) {
                editor11.putBoolean("auto_clear_cache", true);
            }
        } else {
            SharedPreferences.Editor editor12 = this.t;
            if (editor12 != null) {
                editor12.putBoolean("auto_clear_cache", false);
            }
        }
        if (this.show_epg_in_channels_list.isChecked()) {
            SharedPreferences.Editor editor13 = this.t;
            if (editor13 != null) {
                editor13.putBoolean("show_epg_in_channels_list", true);
            }
        } else {
            SharedPreferences.Editor editor14 = this.t;
            if (editor14 != null) {
                editor14.putBoolean("show_epg_in_channels_list", false);
            }
        }
        if (this.auto_play_channel_in_live.isChecked()) {
            SharedPreferences.Editor editor15 = this.t;
            if (editor15 != null) {
                editor15.putBoolean("auto_play_channel_in_live", true);
            }
        } else {
            SharedPreferences.Editor editor16 = this.t;
            if (editor16 != null) {
                editor16.putBoolean("auto_play_channel_in_live", false);
            }
        }
        if (this.etUserAgent.getText().toString().equals(BuildConfig.FLAVOR)) {
            SharedPreferences.Editor editor17 = this.f25626j;
            if (editor17 != null) {
                editor17.putString("user_agent", "IPTVSmartersPlayer");
            }
        } else {
            SharedPreferences.Editor editor18 = this.f25626j;
            if (editor18 != null) {
                editor18.putString("user_agent", this.etUserAgent.getText().toString());
            }
        }
        this.r = this.p.edit();
        SharedPreferences.Editor editorEdit = this.q.edit();
        this.s = editorEdit;
        if (editorEdit != null) {
            this.spinnerEPG.getSelectedItemPosition();
            strValueOf = String.valueOf(this.spinnerEPG.getSelectedItem());
            this.s.putString("selected_language", String.valueOf(this.spinnerEPG.getSelectedItem()));
            m.Z(String.valueOf(this.spinnerEPG.getSelectedItem()), this.f25620d);
            this.s.commit();
            c.h.a.h.n.e.f0(this.f25620d, strValueOf);
        } else {
            strValueOf = BuildConfig.FLAVOR;
        }
        this.t.apply();
        this.f25622f.apply();
        this.f25624h.apply();
        this.f25626j.apply();
        if (this.etUserAgent.getText().toString().equals(BuildConfig.FLAVOR)) {
            this.etUserAgent.setText("IPTVSmartersPlayer");
            resources = getResources();
            i2 = R.string.please_enter_useragent_name;
        } else if (this.v.equalsIgnoreCase(strValueOf)) {
            resources = getResources();
            i2 = R.string.player_setting_save;
        } else {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            resources = getResources();
            i2 = R.string.refreshing_application;
        }
        Toast.makeText(this, resources.getString(i2), 0).show();
    }
}
