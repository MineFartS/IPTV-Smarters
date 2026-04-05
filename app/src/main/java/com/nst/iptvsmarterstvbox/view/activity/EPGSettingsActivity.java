package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.b;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import com.nst.iptvsmarterstvbox.view.adapter.EPGSourcesAdapter;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class EPGSettingsActivity extends a.b.k.c implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btSaveChangesTimeShift;

    @BindView
    public Button btSaveChangesTimeline;

    @BindView
    public Button bt_epg_sources;

    @BindView
    public Button bt_epg_timeline;

    @BindView
    public Button bt_epg_timeshift;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f25474d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f25475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences.Editor f25476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences f25477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SharedPreferences.Editor f25478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.i.q.f f25479i;

    @BindView
    public ImageView iv_back_button;

    @BindView
    public RelativeLayout ll_add_source;

    @BindView
    public LinearLayout ll_epg_sources;

    @BindView
    public LinearLayout ll_epg_timeline;

    @BindView
    public LinearLayout ll_epg_timeshift;

    @BindView
    public RelativeLayout ll_refresh_epg;

    @BindView
    public ImageView logo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public EPGSourcesAdapter f25484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<XMLTVProgrammePojo> f25485o;
    public c.h.a.k.d.a.a p;
    public ProgressDialog q;

    @BindView
    public RadioButton rballchannels;

    @BindView
    public RadioButton rbwithepg;

    @BindView
    public RadioGroup rgRadio;

    @BindView
    public RecyclerView rv_epg_sources;

    @BindView
    public Spinner spinnerEPG;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tv_epg_found_for;

    @BindView
    public TextView tv_epg_source_default;

    @BindView
    public TextView tv_epg_timeline_default;

    @BindView
    public TextView tv_epg_timeshift_default;

    @BindView
    public TextView tv_no_source_found;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.b f25480j = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.b f25481k = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f25482l = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f25483m = BuildConfig.FLAVOR;
    public Thread r = null;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(EPGSettingsActivity.this.f25474d);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = EPGSettingsActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = EPGSettingsActivity.this.date;
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
            c.h.a.h.n.e.b(EPGSettingsActivity.this.f25474d);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EPGSettingsActivity.this.onBackPressed();
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
            c.h.a.h.n.e.O(EPGSettingsActivity.this.f25474d);
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(EPGSettingsActivity.this.f25474d);
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

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    EPGSettingsActivity.this.N0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class k extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f25496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f25497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f25498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public EditText f25499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Context f25500f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c.h.a.i.q.f f25501g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public LinearLayout f25502h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public LinearLayout f25503i;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f25505b;

            public a(View view) {
                this.f25505b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f25505b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f25505b.getTag().equals("1")) {
                        View view3 = this.f25505b;
                        if (view3 == null || view3.getTag() == null || !this.f25505b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = k.this.f25503i;
                    }
                    linearLayout = k.this.f25502h;
                } else {
                    View view4 = this.f25505b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f25505b.getTag().equals("1")) {
                        View view5 = this.f25505b;
                        if (view5 == null || view5.getTag() == null || !this.f25505b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = k.this.f25503i;
                    }
                    linearLayout = k.this.f25502h;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public k(Activity activity, Context context, c.h.a.i.q.f fVar) {
            super(activity);
            this.f25496b = activity;
            this.f25500f = context;
            this.f25501g = fVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context;
            String string;
            int id = view.getId();
            if (id == R.id.btn_close) {
                dismiss();
                return;
            }
            if (id != R.id.btn_save) {
                return;
            }
            try {
                String strTrim = this.f25499e.getText().toString().trim();
                try {
                    URI uri = new URI(this.f25499e.getText().toString().trim());
                    strTrim = uri.getHost() == null ? this.f25499e.getText().toString().trim() : uri.getHost();
                } catch (Exception unused) {
                }
                String strTrim2 = String.valueOf(this.f25499e.getText()).trim();
                if (strTrim == null || strTrim.equals(BuildConfig.FLAVOR) || strTrim.isEmpty()) {
                    context = this.f25500f;
                    string = context.getResources().getString(R.string.enter_source_name);
                } else if (strTrim2 == null || strTrim2.equals(BuildConfig.FLAVOR) || strTrim2.isEmpty()) {
                    context = this.f25500f;
                    string = context.getResources().getString(R.string.enter_source_url);
                } else {
                    if (this.f25501g.V(strTrim2) == 0) {
                        this.f25501g.q(strTrim, "custom", strTrim2, "0");
                        Context context2 = this.f25500f;
                        Toast.makeText(context2, context2.getResources().getString(R.string.player_setting_save), 0).show();
                        EPGSettingsActivity.this.U0();
                        dismiss();
                        return;
                    }
                    context = this.f25500f;
                    string = context.getResources().getString(R.string.source_already_exists);
                }
                Toast.makeText(context, string, 0).show();
            } catch (Exception unused2) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(EPGSettingsActivity.this.p.A().equals(c.h.a.h.n.a.s0) ? R.layout.add_epg_source_layout_tv : R.layout.add_epg_source_layout);
            this.f25497c = (TextView) findViewById(R.id.btn_save);
            this.f25498d = (TextView) findViewById(R.id.btn_close);
            this.f25502h = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
            this.f25503i = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
            this.f25499e = (EditText) findViewById(R.id.et_source_url);
            this.f25497c.setOnClickListener(this);
            this.f25498d.setOnClickListener(this);
            TextView textView = this.f25497c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f25498d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class l extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f25507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f25508c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f25509d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public SwitchCompat f25510e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f25511f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public EditText f25512g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public EditText f25513h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Context f25514i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public c.h.a.i.q.f f25515j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public c.h.a.i.q.c f25516k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f25517l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f25518m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f25519n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f25520o;
        public LinearLayout p;
        public LinearLayout q;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l.this.f25515j.v2("epg", "3", String.valueOf(l.this.f25519n));
                EPGSettingsActivity.this.U0();
                if (EPGSettingsActivity.this.f25484n != null) {
                    EPGSettingsActivity ePGSettingsActivity = EPGSettingsActivity.this;
                    ePGSettingsActivity.T0(ePGSettingsActivity.f25484n, l.this.f25519n);
                }
            }
        }

        public class b implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f25522b;

            public b(View view) {
                this.f25522b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f25522b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f25522b.getTag().equals("1")) {
                        View view3 = this.f25522b;
                        if (view3 == null || view3.getTag() == null || !this.f25522b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = l.this.q;
                    }
                    linearLayout = l.this.p;
                } else {
                    View view4 = this.f25522b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f25522b.getTag().equals("1")) {
                        View view5 = this.f25522b;
                        if (view5 == null || view5.getTag() == null || !this.f25522b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = l.this.q;
                    }
                    linearLayout = l.this.p;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public l(Activity activity, Context context, c.h.a.i.q.f fVar, c.h.a.i.q.c cVar) {
            super(activity);
            this.f25517l = false;
            this.f25507b = activity;
            this.f25514i = context;
            this.f25515j = fVar;
            this.f25516k = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:75:0x01d5 A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:10:0x002c, B:13:0x004f, B:15:0x0055, B:17:0x005b, B:18:0x0068, B:20:0x0073, B:22:0x0079, B:25:0x0081, B:30:0x0090, B:33:0x009d, B:35:0x00a5, B:37:0x00d7, B:39:0x00db, B:42:0x010f, B:44:0x0113, B:46:0x0119, B:48:0x0123, B:49:0x0128, B:51:0x012e, B:53:0x0140, B:55:0x0146, B:57:0x014c, B:58:0x0179, B:60:0x017f, B:66:0x019b, B:68:0x019f, B:69:0x01a1, B:71:0x01a9, B:72:0x01b6, B:74:0x01c1, B:76:0x01da, B:73:0x01be, B:62:0x018b, B:64:0x0191, B:75:0x01d5, B:40:0x00e5, B:41:0x00f4, B:77:0x01de), top: B:82:0x002c }] */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onClick(android.view.View r13) {
            /*
                Method dump skipped, instruction units count: 497
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.l.onClick(android.view.View):void");
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(EPGSettingsActivity.this.p.A().equals(c.h.a.h.n.a.s0) ? R.layout.edit_epg_source_layout_tv : R.layout.edit_epg_source_layout);
            this.f25508c = (TextView) findViewById(R.id.btn_save);
            this.f25509d = (TextView) findViewById(R.id.btn_close);
            this.p = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
            this.q = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
            this.f25511f = (LinearLayout) findViewById(R.id.ll_delete_source);
            this.f25510e = (SwitchCompat) findViewById(R.id.switch_default);
            this.f25512g = (EditText) findViewById(R.id.et_source_name);
            this.f25513h = (EditText) findViewById(R.id.et_source_url);
            this.f25512g.setText(this.f25516k.d());
            this.f25513h.setText(this.f25516k.b());
            this.f25518m = this.f25516k.e();
            this.f25519n = this.f25516k.c();
            this.f25520o = this.f25516k.b().trim();
            this.f25508c.setOnClickListener(this);
            this.f25509d.setOnClickListener(this);
            this.f25511f.setOnClickListener(this);
            if (this.f25516k.a().equals("1")) {
                this.f25510e.setChecked(true);
                this.f25517l = true;
            } else {
                this.f25510e.setChecked(false);
                this.f25517l = false;
            }
            if (this.f25516k.e().equals("panel")) {
                this.f25512g.setEnabled(false);
                if (c.h.a.h.n.a.f17040d.booleanValue()) {
                    this.f25512g.setVisibility(0);
                } else {
                    this.f25512g.setVisibility(8);
                }
                this.f25513h.setEnabled(false);
                this.f25511f.setVisibility(8);
                this.f25513h.setVisibility(8);
                ArrayList<c.h.a.i.q.c> arrayListY1 = this.f25515j.y1();
                if (arrayListY1 == null || arrayListY1.size() <= 1) {
                    this.f25510e.setEnabled(false);
                } else {
                    this.f25510e.setEnabled(true);
                }
            }
            TextView textView = this.f25508c;
            textView.setOnFocusChangeListener(new b(textView));
            TextView textView2 = this.f25509d;
            textView2.setOnFocusChangeListener(new b(textView2));
        }
    }

    public class m extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f25524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f25525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f25526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Activity f25527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f25528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public TextView f25529g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public TextView f25530h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public TextView f25531i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public LinearLayout f25532j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public LinearLayout f25533k;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f25535b;

            public a(View view) {
                this.f25535b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f25535b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f25535b.getTag().equals("1")) {
                        View view3 = this.f25535b;
                        if (view3 == null || view3.getTag() == null || !this.f25535b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = m.this.f25533k;
                    }
                    linearLayout = m.this.f25532j;
                } else {
                    View view4 = this.f25535b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f25535b.getTag().equals("1")) {
                        View view5 = this.f25535b;
                        if (view5 == null || view5.getTag() == null || !this.f25535b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = m.this.f25533k;
                    }
                    linearLayout = m.this.f25532j;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public m(Activity activity, l lVar, int i2, boolean z) {
            super(activity);
            this.f25527e = activity;
            this.f25524b = lVar;
            this.f25525c = i2;
            this.f25526d = z;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.btn_no) {
                dismiss();
                return;
            }
            if (id != R.id.btn_yes) {
                return;
            }
            EPGSettingsActivity.this.f25479i.F0(this.f25525c);
            EPGSettingsActivity.this.f25479i.K0(c.h.a.i.q.m.z(EPGSettingsActivity.this.f25474d), String.valueOf(this.f25525c), c.h.a.i.q.m.f(EPGSettingsActivity.this.f25474d));
            EPGSettingsActivity.this.f25479i.h2(String.valueOf(this.f25525c));
            if (this.f25526d) {
                EPGSettingsActivity.this.f25479i.w2();
            }
            Toast.makeText(EPGSettingsActivity.this.f25474d, EPGSettingsActivity.this.f25474d.getResources().getString(R.string.source_deleted), 0).show();
            EPGSettingsActivity.this.U0();
            dismiss();
            this.f25524b.dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(EPGSettingsActivity.this.p.A().equals(c.h.a.h.n.a.s0) ? R.layout.custom_dashboard_not_downloaded_layout_tv : R.layout.custom_dashboard_not_downloaded_layout);
            this.f25528f = (TextView) findViewById(R.id.btn_yes);
            this.f25529g = (TextView) findViewById(R.id.btn_no);
            this.f25532j = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
            this.f25533k = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
            this.f25531i = (TextView) findViewById(R.id.tv_title);
            this.f25530h = (TextView) findViewById(R.id.txt_dia);
            this.f25531i.setText(EPGSettingsActivity.this.f25474d.getResources().getString(R.string.delete_source));
            this.f25530h.setText(EPGSettingsActivity.this.f25474d.getResources().getString(R.string.want_to_delete_source));
            this.f25528f.setOnClickListener(this);
            this.f25529g.setOnClickListener(this);
            TextView textView = this.f25528f;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f25529g;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class n extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f25537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f25538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f25539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f25540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f25541f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f25542g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public LinearLayout f25543h;

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f25545b;

            public a(String str) {
                this.f25545b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                EPGSettingsActivity.this.f25479i.v2("epg", "3", this.f25545b);
                EPGSettingsActivity.this.U0();
                if (EPGSettingsActivity.this.f25484n != null) {
                    EPGSettingsActivity ePGSettingsActivity = EPGSettingsActivity.this;
                    ePGSettingsActivity.T0(ePGSettingsActivity.f25484n, c.h.a.h.n.e.S(this.f25545b));
                }
            }
        }

        public class b implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f25547b;

            public b(View view) {
                this.f25547b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f25547b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f25547b.getTag().equals("1")) {
                        View view3 = this.f25547b;
                        if (view3 == null || view3.getTag() == null || !this.f25547b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = n.this.f25543h;
                    }
                    linearLayout = n.this.f25542g;
                } else {
                    View view4 = this.f25547b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f25547b.getTag().equals("1")) {
                        View view5 = this.f25547b;
                        if (view5 == null || view5.getTag() == null || !this.f25547b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = n.this.f25543h;
                    }
                    linearLayout = n.this.f25542g;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public n(Activity activity) {
            super(activity);
            this.f25537b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EPGSettingsActivity ePGSettingsActivity;
            int id = view.getId();
            if (id == R.id.btn_no) {
                dismiss();
                return;
            }
            if (id != R.id.btn_yes) {
                return;
            }
            try {
                if (c.h.a.h.n.a.q0) {
                    c.h.a.h.n.a.q0 = false;
                }
                ArrayList<c.h.a.i.q.c> arrayListS0 = EPGSettingsActivity.this.f25479i.S0();
                String strValueOf = (arrayListS0 == null || arrayListS0.size() <= 0) ? "0" : String.valueOf(arrayListS0.get(0).c());
                c.h.a.i.q.e eVarZ1 = EPGSettingsActivity.this.f25479i.Z1("epg", strValueOf);
                if (eVarZ1.d() == null && eVarZ1.e() == null && eVarZ1.f() == null) {
                    c.h.a.i.q.e eVar = new c.h.a.i.q.e();
                    eVar.l("epg");
                    eVar.j("0");
                    eVar.g(BuildConfig.FLAVOR);
                    eVar.k(BuildConfig.FLAVOR);
                    eVar.i(strValueOf);
                    ArrayList<c.h.a.i.q.e> arrayList = new ArrayList<>();
                    arrayList.add(0, eVar);
                    EPGSettingsActivity.this.f25479i.b2(arrayList, c.h.a.i.q.m.f(EPGSettingsActivity.this.f25474d));
                }
                if (EPGSettingsActivity.this.q == null) {
                    EPGSettingsActivity ePGSettingsActivity2 = EPGSettingsActivity.this;
                    ePGSettingsActivity2.q = EPGSettingsActivity.M0(ePGSettingsActivity2.f25474d);
                    ePGSettingsActivity = EPGSettingsActivity.this;
                } else {
                    ePGSettingsActivity = EPGSettingsActivity.this;
                }
                ePGSettingsActivity.q.show();
                new Handler(Looper.getMainLooper()).postDelayed(new a(strValueOf), 1000L);
                dismiss();
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(EPGSettingsActivity.this.p.A().equals(c.h.a.h.n.a.s0) ? R.layout.custom_dashboard_not_downloaded_layout_tv : R.layout.custom_dashboard_not_downloaded_layout);
            this.f25538c = (TextView) findViewById(R.id.btn_yes);
            this.f25539d = (TextView) findViewById(R.id.btn_no);
            this.f25542g = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
            this.f25543h = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
            this.f25541f = (TextView) findViewById(R.id.tv_title);
            this.f25540e = (TextView) findViewById(R.id.txt_dia);
            this.f25541f.setText(EPGSettingsActivity.this.f25474d.getResources().getString(R.string.refresh_epg));
            this.f25540e.setText(EPGSettingsActivity.this.f25474d.getResources().getString(R.string.refresh_epg_now));
            this.f25538c.setOnClickListener(this);
            this.f25539d.setOnClickListener(this);
            TextView textView = this.f25538c;
            textView.setOnFocusChangeListener(new b(textView));
            TextView textView2 = this.f25539d;
            textView2.setOnFocusChangeListener(new b(textView2));
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class o extends AsyncTask<String, Integer, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f25549a = "0";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<c.h.a.i.q.c> f25550b;

        public o(Context context) {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                publishProgress(0);
                ArrayList<c.h.a.i.q.c> arrayListY1 = EPGSettingsActivity.this.f25479i.y1();
                this.f25550b = arrayListY1;
                if (arrayListY1 == null || arrayListY1.size() <= 0) {
                    return Boolean.FALSE;
                }
                ArrayList<c.h.a.i.q.c> arrayListS0 = EPGSettingsActivity.this.f25479i.S0();
                if (arrayListS0 != null && arrayListS0.size() > 0) {
                    this.f25549a = String.valueOf(arrayListS0.get(0).c());
                }
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            try {
                if (bool.booleanValue()) {
                    EPGSettingsActivity.this.tv_epg_source_default.setVisibility(0);
                    EPGSettingsActivity.this.ll_refresh_epg.setVisibility(0);
                    EPGSettingsActivity.this.tv_epg_found_for.setVisibility(0);
                    EPGSettingsActivity.this.tv_no_source_found.setVisibility(8);
                    EPGSettingsActivity.this.rv_epg_sources.setVisibility(0);
                    EPGSettingsActivity.this.rv_epg_sources.setLayoutManager(new LinearLayoutManager(EPGSettingsActivity.this.f25474d, 1, false));
                    EPGSettingsActivity.this.rv_epg_sources.setItemAnimator(new a.y.e.c());
                    EPGSettingsActivity ePGSettingsActivity = EPGSettingsActivity.this;
                    ePGSettingsActivity.f25484n = new EPGSourcesAdapter(ePGSettingsActivity.f25474d, this.f25550b);
                    EPGSettingsActivity ePGSettingsActivity2 = EPGSettingsActivity.this;
                    ePGSettingsActivity2.rv_epg_sources.setAdapter(ePGSettingsActivity2.f25484n);
                    EPGSettingsActivity.this.V0(this.f25549a);
                } else {
                    EPGSettingsActivity.this.tv_epg_source_default.setVisibility(8);
                    EPGSettingsActivity.this.ll_refresh_epg.setVisibility(8);
                    EPGSettingsActivity.this.tv_no_source_found.setVisibility(0);
                    EPGSettingsActivity.this.rv_epg_sources.setVisibility(8);
                    EPGSettingsActivity.this.tv_epg_found_for.setVisibility(8);
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public class p implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f25552b;

        public p(View view) {
            this.f25552b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25552b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25552b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            int i2;
            Button button;
            if (z) {
                f2 = z ? 1.05f : 1.0f;
                Log.e("id is", BuildConfig.FLAVOR + this.f25552b.getTag());
                boolean zEquals = this.f25552b.getTag().equals("1");
                i2 = R.drawable.logout_btn_effect;
                if (!zEquals && !this.f25552b.getTag().equals("2")) {
                    if (this.f25552b.getTag().equals("bt_epg_sources")) {
                        button = EPGSettingsActivity.this.bt_epg_sources;
                    } else if (this.f25552b.getTag().equals("bt_epg_timeline")) {
                        button = EPGSettingsActivity.this.bt_epg_timeline;
                    } else {
                        if (!this.f25552b.getTag().equals("bt_epg_timeshift")) {
                            if (this.f25552b.getTag().equals("rb_withepg") || this.f25552b.getTag().equals("rb_allchannels")) {
                                this.f25552b.setBackground(EPGSettingsActivity.this.getResources().getDrawable(R.drawable.selector_tracks_layout));
                                return;
                            } else {
                                a(1.05f);
                                b(1.05f);
                                return;
                            }
                        }
                        button = EPGSettingsActivity.this.bt_epg_timeshift;
                    }
                    button.performClick();
                    return;
                }
                a(f2);
                b(f2);
            } else {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                a(f2);
                b(f2);
                boolean zEquals2 = this.f25552b.getTag().equals("1");
                i2 = R.drawable.black_button_dark;
                if (!zEquals2 && !this.f25552b.getTag().equals("2")) {
                    return;
                }
            }
            this.f25552b.setBackgroundResource(i2);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class q extends AsyncTask<Void, Boolean, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EPGSourcesAdapter f25554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.h.a.k.h.c f25555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f25556c;

        @SuppressLint({"StaticFieldLeak"})
        public class a extends AsyncTask<String, Integer, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public volatile boolean f25558a = true;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Context f25559b;

            public a(Context context) {
                this.f25559b = null;
                this.f25559b = context;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(String... strArr) {
                publishProgress(0);
                if (EPGSettingsActivity.this.f25479i != null) {
                    EPGSettingsActivity.this.f25479i.r(EPGSettingsActivity.this.f25485o);
                    EPGSettingsActivity.this.f25485o.clear();
                    EPGSettingsActivity.this.f25479i.v2("epg", "1", q.this.f25556c);
                }
                return Boolean.TRUE;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean bool) {
                EPGSettingsActivity ePGSettingsActivity = EPGSettingsActivity.this;
                ePGSettingsActivity.f25475e = ePGSettingsActivity.getSharedPreferences("loginPrefs", 0);
                try {
                    EPGSettingsActivity.this.U0();
                } catch (Exception unused) {
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onProgressUpdate(Integer... numArr) {
            }

            @Override // android.os.AsyncTask
            public void onCancelled() {
                this.f25558a = false;
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
            }
        }

        public q(EPGSourcesAdapter ePGSourcesAdapter, int i2) {
            this.f25556c = "0";
            this.f25554a = ePGSourcesAdapter;
            this.f25556c = String.valueOf(i2);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            if (!this.f25556c.equals("0") && EPGSettingsActivity.this.f25479i != null) {
                EPGSettingsActivity.this.f25479i.h2(this.f25556c);
            }
            Log.e("honey", "epg 1");
            this.f25555b = new c.h.a.k.h.c();
            Log.e("honey", "epg 2");
            this.f25555b.a(EPGSettingsActivity.this.f25474d);
            Log.e("honey", "epg 3");
            EPGSettingsActivity.this.f25485o = this.f25555b.b();
            Log.e("honey", "epg 4");
            if (EPGSettingsActivity.this.f25485o != null && EPGSettingsActivity.this.f25485o.size() > 0) {
                Log.e("honey", "size:" + EPGSettingsActivity.this.f25485o.size());
            } else {
                if (EPGSettingsActivity.this.f25479i.w1(this.f25556c) == 0) {
                    return Boolean.FALSE;
                }
                EPGSettingsActivity.this.f25479i.v2("epg", "1", this.f25556c);
            }
            return Boolean.TRUE;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onPostExecute(java.lang.Boolean r4) {
            /*
                r3 = this;
                boolean r4 = r4.booleanValue()
                java.lang.String r0 = "epg"
                if (r4 == 0) goto L58
                r4 = 0
                c.h.a.h.n.a.q0 = r4
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r1 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this
                java.util.ArrayList r1 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.D0(r1)
                if (r1 == 0) goto L4a
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r1 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this
                java.util.ArrayList r1 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.D0(r1)
                int r1 = r1.size()
                if (r1 <= 0) goto L4a
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity$q$a r1 = new com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity$q$a     // Catch: java.lang.Exception -> L35
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r2 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this     // Catch: java.lang.Exception -> L35
                android.content.Context r2 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.y0(r2)     // Catch: java.lang.Exception -> L35
                r1.<init>(r2)     // Catch: java.lang.Exception -> L35
                java.util.concurrent.Executor r2 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch: java.lang.Exception -> L35
                java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L35
                android.os.AsyncTask r4 = r1.executeOnExecutor(r2, r4)     // Catch: java.lang.Exception -> L35
                c.h.a.h.n.e.f17068j = r4     // Catch: java.lang.Exception -> L35
                goto L68
            L35:
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r4 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this     // Catch: java.lang.Exception -> L48
                c.h.a.i.q.f r4 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.z0(r4)     // Catch: java.lang.Exception -> L48
                java.lang.String r1 = "0"
                java.lang.String r2 = r3.f25556c     // Catch: java.lang.Exception -> L48
                r4.v2(r0, r1, r2)     // Catch: java.lang.Exception -> L48
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r4 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this     // Catch: java.lang.Exception -> L48
            L44:
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.K0(r4)     // Catch: java.lang.Exception -> L48
                goto L68
            L48:
                goto L68
            L4a:
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r0 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this
                java.lang.String r1 = "loginPrefs"
                android.content.SharedPreferences r4 = r0.getSharedPreferences(r1, r4)
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.F0(r0, r4)
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r4 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this     // Catch: java.lang.Exception -> L48
                goto L44
            L58:
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r4 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this     // Catch: java.lang.Exception -> L48
                c.h.a.i.q.f r4 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.z0(r4)     // Catch: java.lang.Exception -> L48
                java.lang.String r1 = "2"
                java.lang.String r2 = r3.f25556c     // Catch: java.lang.Exception -> L48
                r4.v2(r0, r1, r2)     // Catch: java.lang.Exception -> L48
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r4 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this     // Catch: java.lang.Exception -> L48
                goto L44
            L68:
                java.io.File r4 = new java.io.File
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r1 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this
                android.content.Context r1 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.y0(r1)
                java.io.File r1 = r1.getFilesDir()
                r0.append(r1)
                java.lang.String r1 = "/epgZip.xml"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                java.io.File r0 = new java.io.File
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r0.<init>(r4)
                boolean r4 = r0.exists()
                if (r4 == 0) goto L9a
                r0.delete()
            L9a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.q.onPostExecute(java.lang.Boolean):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            EPGSettingsActivity.this.Q0();
        }
    }

    public static ProgressDialog M0(Context context) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        try {
            progressDialog.show();
        } catch (Exception unused) {
        }
        progressDialog.setCancelable(false);
        progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        progressDialog.setContentView(R.layout.progress_dialog);
        return progressDialog;
    }

    public final void L0() {
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

    public void N0() {
        runOnUiThread(new a());
    }

    public void O0(c.h.a.i.q.c cVar) {
        new l(this, this.f25474d, this.f25479i, cVar).show();
    }

    public final void P0() {
        Button button = this.btSaveChangesTimeShift;
        if (button != null) {
            button.setOnFocusChangeListener(new p(button));
        }
        Button button2 = this.btSaveChangesTimeline;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new p(button2));
        }
        Button button3 = this.bt_epg_sources;
        button3.setOnFocusChangeListener(new p(button3));
        Button button4 = this.bt_epg_timeline;
        button4.setOnFocusChangeListener(new p(button4));
        Button button5 = this.bt_epg_timeshift;
        button5.setOnFocusChangeListener(new p(button5));
        RadioButton radioButton = this.rbwithepg;
        if (radioButton != null) {
            radioButton.setOnFocusChangeListener(new p(radioButton));
        }
        RadioButton radioButton2 = this.rballchannels;
        if (radioButton2 != null) {
            radioButton2.setOnFocusChangeListener(new p(radioButton2));
        }
        Spinner spinner = this.spinnerEPG;
        if (spinner != null) {
            spinner.setOnFocusChangeListener(new p(spinner));
        }
    }

    public void Q0() {
        try {
            ProgressDialog progressDialog = this.q;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            Log.e("honey", "hideProgressDialog");
            this.q.dismiss();
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"InlinedApi"})
    public void R0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public final void S0() {
        TextView textView;
        Resources resources;
        int i2;
        this.f25479i = new c.h.a.i.q.f(this.f25474d);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f25475e = sharedPreferences;
        String string = sharedPreferences.getString("selectedEPGShift", c.h.a.h.n.a.k0);
        int iA = c.h.a.h.n.e.A(string);
        if (string.equals(BuildConfig.FLAVOR)) {
            this.tv_epg_timeshift_default.setText("0");
        } else {
            this.tv_epg_timeshift_default.setText(string);
        }
        this.spinnerEPG.setSelection(iA);
        SharedPreferences sharedPreferences2 = getSharedPreferences("epgchannelupdate", 0);
        this.f25477g = sharedPreferences2;
        if (sharedPreferences2.getString("epgchannelupdate", BuildConfig.FLAVOR).equals("all")) {
            this.rballchannels.setChecked(true);
            textView = this.tv_epg_timeline_default;
            resources = this.f25474d.getResources();
            i2 = R.string.all_channels;
        } else {
            this.rbwithepg.setChecked(true);
            textView = this.tv_epg_timeline_default;
            resources = this.f25474d.getResources();
            i2 = R.string.epg_channels;
        }
        textView.setText(resources.getString(i2));
        U0();
        this.logo.setOnClickListener(new b());
        this.iv_back_button.setOnClickListener(new c());
    }

    public final void T0(EPGSourcesAdapter ePGSourcesAdapter, int i2) {
        if (Build.VERSION.SDK_INT >= 11) {
            new q(ePGSourcesAdapter, i2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else {
            new q(ePGSourcesAdapter, i2).execute(new Void[0]);
        }
    }

    public final void U0() {
        if (this.rv_epg_sources != null) {
            new o(this.f25474d).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    public final void V0(String str) {
        try {
            this.tv_epg_found_for.setText(getResources().getString(R.string.epg_found_for_channels, String.valueOf(this.f25479i.S1(str))));
        } catch (Exception unused) {
        }
    }

    public void W0(String str) {
        this.tv_epg_source_default.setText(str);
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
        this.f25474d = this;
        R0();
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f25474d);
        this.p = aVar;
        setContentView(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_epg_settings_tv : R.layout.activity_epg_settings);
        ButterKnife.a(this);
        P0();
        L0();
        v0((Toolbar) findViewById(R.id.toolbar));
        getWindow().setFlags(1024, 1024);
        S0();
        Thread thread = this.r;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new j());
            this.r = thread2;
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
        if (itemId == R.id.action_logout && (context = this.f25474d) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new e()).g(getResources().getString(R.string.no), new d()).n();
        }
        if (itemId == R.id.menu_load_channels_vod) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f25474d.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f25474d.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f25474d.getResources().getString(R.string.yes), new f());
            aVar.g(this.f25474d.getResources().getString(R.string.no), new g());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.f25474d.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.f25474d.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.f25474d.getResources().getString(R.string.yes), new h());
            aVar2.g(this.f25474d.getResources().getString(R.string.no), new i());
            aVar2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.r;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.r.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        R0();
        super.onResume();
        Thread thread = this.r;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new j());
            this.r = thread2;
            thread2.start();
        }
        c.h.a.h.n.e.g(this.f25474d);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f25475e = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f25475e.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        }
    }

    @OnClick
    public void onViewClicked(View view) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        String string;
        Toast toastMakeText;
        TextView textView;
        Resources resources;
        int i2;
        Dialog kVar;
        switch (view.getId()) {
            case R.id.bt_epg_sources /* 2131427605 */:
                this.ll_epg_sources.setVisibility(0);
                this.bt_epg_sources.setBackgroundResource(R.drawable.blue_btn_effect);
                this.bt_epg_timeline.setBackgroundResource(R.drawable.black_button_dark);
                this.bt_epg_timeshift.setBackgroundResource(R.drawable.black_button_dark);
                linearLayout = this.ll_epg_timeline;
                linearLayout.setVisibility(8);
                linearLayout2 = this.ll_epg_timeshift;
                linearLayout2.setVisibility(8);
                break;
            case R.id.bt_epg_timeline /* 2131427606 */:
                this.ll_epg_timeline.setVisibility(0);
                this.bt_epg_timeline.setBackgroundResource(R.drawable.blue_btn_effect);
                this.bt_epg_sources.setBackgroundResource(R.drawable.black_button_dark);
                this.bt_epg_timeshift.setBackgroundResource(R.drawable.black_button_dark);
                linearLayout = this.ll_epg_sources;
                linearLayout.setVisibility(8);
                linearLayout2 = this.ll_epg_timeshift;
                linearLayout2.setVisibility(8);
                break;
            case R.id.bt_epg_timeshift /* 2131427607 */:
                this.ll_epg_timeshift.setVisibility(0);
                this.bt_epg_timeshift.setBackgroundResource(R.drawable.blue_btn_effect);
                this.bt_epg_sources.setBackgroundResource(R.drawable.black_button_dark);
                this.bt_epg_timeline.setBackgroundResource(R.drawable.black_button_dark);
                this.ll_epg_sources.setVisibility(8);
                linearLayout2 = this.ll_epg_timeline;
                linearLayout2.setVisibility(8);
                break;
            case R.id.bt_save_changes_time_shift /* 2131427620 */:
                SharedPreferences.Editor editorEdit = this.f25475e.edit();
                this.f25476f = editorEdit;
                if (editorEdit != null) {
                    this.spinnerEPG.getSelectedItemPosition();
                    this.f25476f.putString("selectedEPGShift", String.valueOf(this.spinnerEPG.getSelectedItem()));
                    this.f25476f.apply();
                    this.tv_epg_timeshift_default.setText(String.valueOf(this.spinnerEPG.getSelectedItem()));
                    string = getResources().getString(R.string.player_setting_save);
                    toastMakeText = Toast.makeText(this, string, 0);
                    toastMakeText.show();
                }
                string = getResources().getString(R.string.player_setting_error);
                toastMakeText = Toast.makeText(this, string, 0);
                toastMakeText.show();
                break;
            case R.id.bt_save_changes_timeline /* 2131427621 */:
                RadioButton radioButton = (RadioButton) findViewById(this.rgRadio.getCheckedRadioButtonId());
                SharedPreferences sharedPreferences = getSharedPreferences("epgchannelupdate", 0);
                this.f25477g = sharedPreferences;
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                this.f25478h = editorEdit2;
                if (editorEdit2 != null) {
                    if (radioButton.getText().toString().equals(getResources().getString(R.string.all_channel))) {
                        this.f25478h.putString("epgchannelupdate", "all");
                        textView = this.tv_epg_timeline_default;
                        resources = getResources();
                        i2 = R.string.all_channels;
                    } else {
                        this.f25478h.putString("epgchannelupdate", "withepg");
                        textView = this.tv_epg_timeline_default;
                        resources = getResources();
                        i2 = R.string.epg_channels;
                    }
                    textView.setText(resources.getString(i2));
                    this.f25478h.apply();
                    string = getResources().getString(R.string.player_setting_save);
                    toastMakeText = Toast.makeText(this, string, 0);
                    toastMakeText.show();
                }
                string = getResources().getString(R.string.player_setting_error);
                toastMakeText = Toast.makeText(this, string, 0);
                toastMakeText.show();
                break;
            case R.id.btn_back_playerselection /* 2131427633 */:
                finish();
                break;
            case R.id.ll_add_source /* 2131428286 */:
                kVar = new k(this, this.f25474d, this.f25479i);
                kVar.show();
                break;
            case R.id.ll_refresh_epg /* 2131428450 */:
                ArrayList<c.h.a.i.q.c> arrayListS0 = this.f25479i.S0();
                if (!((arrayListS0 == null || arrayListS0.size() <= 0) ? "0" : String.valueOf(arrayListS0.get(0).c())).equals("0")) {
                    kVar = new n(this);
                    kVar.show();
                } else {
                    toastMakeText = Toast.makeText(this, getResources().getString(R.string.select_any_epg_source), 1);
                    toastMakeText.show();
                }
                break;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        R0();
    }
}
