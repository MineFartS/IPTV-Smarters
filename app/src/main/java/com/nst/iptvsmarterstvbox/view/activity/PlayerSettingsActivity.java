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
import android.widget.CheckBox;
import android.widget.FrameLayout;
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
public class PlayerSettingsActivity extends a.b.k.c implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btSaveChanges;

    @BindView
    public Button btnBackPlayerselection;

    @BindView
    public CheckBox cbInfBuf;

    @BindView
    public CheckBox cbOpenGL;

    @BindView
    public CheckBox cbOpenSLES;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f26112d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f26113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f26114f;

    @BindView
    public FrameLayout fl_buffer_size_limit;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f26115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SharedPreferences.Editor f26116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.i.q.f f26117i;

    @BindView
    public ImageView logo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SharedPreferences f26122n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SharedPreferences.Editor f26123o;
    public SharedPreferences p;
    public SharedPreferences.Editor q;
    public SharedPreferences r;

    @BindView
    public RadioButton rbHardwareDecoder;

    @BindView
    public RadioButton rbNative;

    @BindView
    public RadioButton rbSoftwareDecoder;

    @BindView
    public RadioGroup rgRadio;
    public SharedPreferences.Editor s;
    public a.b.k.b t;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tv_buffer_size_limit;
    public c.h.a.k.d.a.a u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.b f26118j = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.b f26119k = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f26120l = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f26121m = BuildConfig.FLAVOR;
    public Thread v = null;

    public class a implements DialogInterface.OnDismissListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(PlayerSettingsActivity.this.f26112d);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(PlayerSettingsActivity.this.f26112d);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = PlayerSettingsActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = PlayerSettingsActivity.this.date;
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
            dialogInterface.dismiss();
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(PlayerSettingsActivity.this.f26112d);
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(PlayerSettingsActivity.this.f26112d);
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        @SuppressLint({"SetTextI18n"})
        public void onClick(DialogInterface dialogInterface, int i2) {
            TextView textView;
            String str;
            switch (i2) {
                case 0:
                    PlayerSettingsActivity.this.B0(1);
                    textView = PlayerSettingsActivity.this.tv_buffer_size_limit;
                    str = "1";
                    break;
                case 1:
                    PlayerSettingsActivity.this.B0(2);
                    textView = PlayerSettingsActivity.this.tv_buffer_size_limit;
                    str = "2";
                    break;
                case 2:
                    PlayerSettingsActivity.this.B0(3);
                    textView = PlayerSettingsActivity.this.tv_buffer_size_limit;
                    str = "3";
                    break;
                case 3:
                    PlayerSettingsActivity.this.B0(4);
                    textView = PlayerSettingsActivity.this.tv_buffer_size_limit;
                    str = "4";
                    break;
                case 4:
                    PlayerSettingsActivity.this.B0(5);
                    textView = PlayerSettingsActivity.this.tv_buffer_size_limit;
                    str = "5";
                    break;
                case 5:
                    PlayerSettingsActivity.this.B0(10);
                    textView = PlayerSettingsActivity.this.tv_buffer_size_limit;
                    str = "10";
                    break;
                case 6:
                    PlayerSettingsActivity.this.B0(20);
                    textView = PlayerSettingsActivity.this.tv_buffer_size_limit;
                    str = "20";
                    break;
                case 7:
                    PlayerSettingsActivity.this.B0(30);
                    textView = PlayerSettingsActivity.this.tv_buffer_size_limit;
                    str = "30";
                    break;
                case 8:
                    PlayerSettingsActivity.this.B0(40);
                    textView = PlayerSettingsActivity.this.tv_buffer_size_limit;
                    str = "40";
                    break;
                case 9:
                    PlayerSettingsActivity.this.B0(50);
                    textView = PlayerSettingsActivity.this.tv_buffer_size_limit;
                    str = "50";
                    break;
                case 10:
                    PlayerSettingsActivity.this.B0(100);
                    textView = PlayerSettingsActivity.this.tv_buffer_size_limit;
                    str = "100";
                    break;
                default:
                    return;
            }
            textView.setText(str);
            dialogInterface.cancel();
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    PlayerSettingsActivity.this.D0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class l implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26135b;

        public l(View view) {
            this.f26135b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26135b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26135b, "scaleY", f2);
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
                View view4 = this.f26135b;
                if ((view4 == null || view4.getTag() == null || !this.f26135b.getTag().equals("1")) && ((view2 = this.f26135b) == null || view2.getTag() == null || !this.f26135b.getTag().equals("2"))) {
                    return;
                }
                this.f26135b.setBackgroundResource(R.drawable.black_button_dark);
                return;
            }
            f2 = z ? 1.05f : 1.0f;
            View view5 = this.f26135b;
            if (view5 == null || view5.getTag() == null || !this.f26135b.getTag().equals("1")) {
                View view6 = this.f26135b;
                if (view6 == null || view6.getTag() == null || !this.f26135b.getTag().equals("2")) {
                    View view7 = this.f26135b;
                    if (view7 == null || view7.getTag() == null) {
                        return;
                    }
                    this.f26135b.setBackground(PlayerSettingsActivity.this.getResources().getDrawable(R.drawable.selector_tracks_layout));
                    return;
                }
                a(f2);
                b(f2);
                view3 = this.f26135b;
                i2 = R.drawable.logout_btn_effect;
            } else {
                a(f2);
                b(f2);
                view3 = this.f26135b;
                i2 = R.drawable.back_btn_effect;
            }
            view3.setBackgroundResource(i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0() {
        /*
            r16 = this;
            r0 = r16
            r1 = 11
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
            java.lang.String r2 = "1"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "2"
            r4 = 1
            r1[r4] = r2
            java.lang.String r2 = "3"
            r5 = 2
            r1[r5] = r2
            java.lang.String r2 = "4"
            r6 = 3
            r1[r6] = r2
            java.lang.String r2 = "5"
            r7 = 4
            r1[r7] = r2
            java.lang.String r2 = "10"
            r8 = 5
            r1[r8] = r2
            java.lang.String r2 = "20"
            r9 = 6
            r1[r9] = r2
            java.lang.String r2 = "30"
            r10 = 7
            r1[r10] = r2
            java.lang.String r2 = "40"
            r11 = 8
            r1[r11] = r2
            java.lang.String r2 = "50"
            r12 = 9
            r1[r12] = r2
            java.lang.String r2 = "100"
            r13 = 10
            r1[r13] = r2
            a.b.k.b$a r2 = new a.b.k.b$a
            r2.<init>(r0)
            android.content.res.Resources r14 = r16.getResources()
            r15 = 2132017371(0x7f1400db, float:1.9673019E38)
            java.lang.String r14 = r14.getString(r15)
            r2.setTitle(r14)
            android.content.SharedPreferences r14 = r0.f26114f
            int r15 = c.h.a.h.n.a.e0
            java.lang.String r3 = "pref.using_buffer_size"
            int r3 = r14.getInt(r3, r15)
            if (r3 != r4) goto L61
        L5f:
            r3 = 0
            goto L95
        L61:
            if (r3 != r5) goto L65
            r3 = 1
            goto L95
        L65:
            if (r3 != r6) goto L69
            r3 = 2
            goto L95
        L69:
            if (r3 != r7) goto L6d
            r3 = 3
            goto L95
        L6d:
            if (r3 != r8) goto L71
            r3 = 4
            goto L95
        L71:
            if (r3 != r13) goto L75
            r3 = 5
            goto L95
        L75:
            r4 = 20
            if (r3 != r4) goto L7b
            r3 = 6
            goto L95
        L7b:
            r4 = 30
            if (r3 != r4) goto L81
            r3 = 7
            goto L95
        L81:
            r4 = 40
            if (r3 != r4) goto L88
            r3 = 8
            goto L95
        L88:
            r4 = 50
            if (r3 != r4) goto L8f
            r3 = 9
            goto L95
        L8f:
            r4 = 100
            if (r3 != r4) goto L5f
            r3 = 10
        L95:
            com.nst.iptvsmarterstvbox.view.activity.PlayerSettingsActivity$j r4 = new com.nst.iptvsmarterstvbox.view.activity.PlayerSettingsActivity$j
            r4.<init>()
            r2.l(r1, r3, r4)
            a.b.k.b r1 = r2.create()
            r0.t = r1
            com.nst.iptvsmarterstvbox.view.activity.PlayerSettingsActivity$a r2 = new com.nst.iptvsmarterstvbox.view.activity.PlayerSettingsActivity$a
            r2.<init>()
            r1.setOnDismissListener(r2)
            a.b.k.b r1 = r0.t
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.PlayerSettingsActivity.A0():void");
    }

    public final void B0(int i2) {
        SharedPreferences.Editor editor = this.f26115g;
        if (editor != null) {
            editor.putInt("pref.using_buffer_size", i2);
            this.f26115g.apply();
        }
    }

    public final void C0() {
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

    public void D0() {
        runOnUiThread(new c());
    }

    public final void E0() {
        Button button = this.btSaveChanges;
        if (button != null) {
            button.setOnFocusChangeListener(new l(button));
        }
        Button button2 = this.btnBackPlayerselection;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new l(button2));
        }
        RadioButton radioButton = this.rbNative;
        if (radioButton != null) {
            radioButton.setOnFocusChangeListener(new l(radioButton));
        }
        RadioButton radioButton2 = this.rbHardwareDecoder;
        if (radioButton2 != null) {
            radioButton2.setOnFocusChangeListener(new l(radioButton2));
        }
        RadioButton radioButton3 = this.rbSoftwareDecoder;
        if (radioButton3 != null) {
            radioButton3.setOnFocusChangeListener(new l(radioButton3));
        }
        CheckBox checkBox = this.cbOpenSLES;
        if (checkBox != null) {
            checkBox.setOnFocusChangeListener(new l(checkBox));
        }
        CheckBox checkBox2 = this.cbOpenGL;
        if (checkBox2 != null) {
            checkBox2.setOnFocusChangeListener(new l(checkBox2));
        }
        CheckBox checkBox3 = this.cbInfBuf;
        if (checkBox3 != null) {
            checkBox3.setOnFocusChangeListener(new l(checkBox3));
        }
        FrameLayout frameLayout = this.fl_buffer_size_limit;
        if (frameLayout != null) {
            frameLayout.setOnFocusChangeListener(new l(frameLayout));
        }
    }

    public final void F0() {
        RadioButton radioButton;
        this.f26112d = this;
        this.f26117i = new c.h.a.i.q.f(this.f26112d);
        this.f26122n = getSharedPreferences("pref.using_opensl_es", 0);
        this.p = getSharedPreferences("pref.using_opengl", 0);
        this.r = getSharedPreferences("pref.using_infbuf", 0);
        this.f26113e = getSharedPreferences("pref.using_media_codec", 0);
        SharedPreferences sharedPreferences = getSharedPreferences("pref.using_buffer_size", 0);
        this.f26114f = sharedPreferences;
        this.f26115g = sharedPreferences.edit();
        String string = this.f26122n.getString("pref.using_opensl_es", BuildConfig.FLAVOR);
        String string2 = this.p.getString("pref.using_opengl", BuildConfig.FLAVOR);
        String string3 = this.f26113e.getString("pref.using_media_codec", c.h.a.h.n.a.d0);
        String string4 = this.r.getString("pref.using_infbuf", "unchecked");
        int i2 = this.f26114f.getInt("pref.using_buffer_size", c.h.a.h.n.a.e0);
        if (string3.equals(getResources().getString(R.string.native_decoder)) || string3.equals("Native")) {
            this.rbNative.setChecked(true);
            radioButton = this.rbNative;
        } else if (string3.equals(getResources().getString(R.string.hardware_decoder)) || string3.equals("Hardware Decoder") || !(string3.equals(getResources().getString(R.string.software_decoder)) || string3.equals("Software Decoder"))) {
            this.rbHardwareDecoder.setChecked(true);
            radioButton = this.rbHardwareDecoder;
        } else {
            this.rbSoftwareDecoder.setChecked(true);
            radioButton = this.rbSoftwareDecoder;
        }
        radioButton.requestFocus();
        if (string.equals("checked")) {
            this.cbOpenSLES.setChecked(true);
        }
        if (string2.equals("checked")) {
            this.cbOpenGL.setChecked(true);
        }
        if (string4.equals("checked")) {
            this.cbInfBuf.setChecked(true);
        }
        TextView textView = this.tv_buffer_size_limit;
        if (textView != null) {
            textView.setText(String.valueOf(i2));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.fl_buffer_size_limit) {
            A0();
        } else {
            if (id != R.id.tv_header_title) {
                return;
            }
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f26112d = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f26112d);
        this.u = aVar;
        setContentView(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_player_settings_tv : R.layout.activity_player_settings);
        ButterKnife.a(this);
        E0();
        C0();
        v0((Toolbar) findViewById(R.id.toolbar));
        getWindow().setFlags(1024, 1024);
        F0();
        Thread thread = this.v;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new k());
            this.v = thread2;
            thread2.start();
        }
        this.logo.setOnClickListener(new b());
        this.fl_buffer_size_limit.setOnClickListener(this);
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
        if (itemId == R.id.action_logout && (context = this.f26112d) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new e()).g(getResources().getString(R.string.no), new d()).n();
        }
        if (itemId == R.id.menu_load_channels_vod) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f26112d.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f26112d.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f26112d.getResources().getString(R.string.yes), new f());
            aVar.g(this.f26112d.getResources().getString(R.string.no), new g());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.f26112d.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.f26112d.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.f26112d.getResources().getString(R.string.yes), new h());
            aVar2.g(this.f26112d.getResources().getString(R.string.no), new i());
            aVar2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.v;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.v.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.v;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new k());
            this.v = thread2;
            thread2.start();
        }
        c.h.a.h.n.e.g(this.f26112d);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26113e = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f26113e.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    @OnClick
    public void onViewClicked(View view) {
        SharedPreferences.Editor editor;
        String str;
        int id = view.getId();
        if (id == R.id.bt_save_changes) {
            this.f26122n = getSharedPreferences("pref.using_opensl_es", 0);
            this.p = getSharedPreferences("pref.using_opengl", 0);
            this.r = getSharedPreferences("pref.using_infbuf", 0);
            this.f26123o = this.f26122n.edit();
            this.q = this.p.edit();
            this.s = this.r.edit();
            if (this.cbOpenSLES.isChecked()) {
                SharedPreferences.Editor editor2 = this.f26123o;
                if (editor2 != null) {
                    editor2.putString("pref.using_opensl_es", "checked");
                }
            } else {
                SharedPreferences.Editor editor3 = this.f26123o;
                if (editor3 != null) {
                    editor3.putString("pref.using_opensl_es", BuildConfig.FLAVOR);
                }
            }
            if (this.cbOpenGL.isChecked()) {
                SharedPreferences.Editor editor4 = this.q;
                if (editor4 != null) {
                    editor4.putString("pref.using_opengl", "checked");
                }
            } else {
                SharedPreferences.Editor editor5 = this.q;
                if (editor5 != null) {
                    editor5.putString("pref.using_opengl", BuildConfig.FLAVOR);
                }
            }
            if (this.cbInfBuf.isChecked()) {
                SharedPreferences.Editor editor6 = this.s;
                if (editor6 != null) {
                    editor6.putString("pref.using_infbuf", "checked");
                }
            } else {
                SharedPreferences.Editor editor7 = this.s;
                if (editor7 != null) {
                    editor7.putString("pref.using_infbuf", "unchecked");
                }
            }
            this.f26123o.apply();
            this.q.apply();
            this.s.apply();
            int checkedRadioButtonId = this.rgRadio.getCheckedRadioButtonId();
            this.f26113e = getSharedPreferences("pref.using_media_codec", 0);
            RadioButton radioButton = (RadioButton) findViewById(checkedRadioButtonId);
            String strValueOf = radioButton.getTag() != null ? String.valueOf(radioButton.getTag()) : "4";
            SharedPreferences.Editor editorEdit = this.f26113e.edit();
            this.f26116h = editorEdit;
            if (editorEdit == null) {
                Toast.makeText(this, getResources().getString(R.string.player_setting_error), 0).show();
                return;
            }
            if (strValueOf.equals("3")) {
                editor = this.f26116h;
                str = "Native";
            } else if (strValueOf.equals("4")) {
                editor = this.f26116h;
                str = "Hardware Decoder";
            } else {
                if (strValueOf.equals("5")) {
                    editor = this.f26116h;
                    str = "Software Decoder";
                }
                this.f26116h.apply();
                Toast.makeText(this, getResources().getString(R.string.player_setting_save), 0).show();
            }
            editor.putString("pref.using_media_codec", str);
            this.f26116h.apply();
            Toast.makeText(this, getResources().getString(R.string.player_setting_save), 0).show();
        } else if (id != R.id.btn_back_playerselection) {
            return;
        }
        finish();
    }
}
