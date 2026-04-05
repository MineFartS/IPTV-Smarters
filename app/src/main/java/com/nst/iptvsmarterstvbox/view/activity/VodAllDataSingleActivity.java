package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.b;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.i.p;
import c.h.a.i.q.k;
import c.h.a.i.q.m;
import c.h.a.k.b.b0;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.adapter.VodAllDataRightSideAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class VodAllDataSingleActivity extends a.b.k.c implements View.OnClickListener {
    public ArrayList<c.h.a.i.b> A;
    public ArrayList<c.h.a.i.c> B;
    public SharedPreferences E;
    public SharedPreferences.Editor F;
    public Menu G;
    public MenuItem H;
    public SearchView I;

    @BindView
    public AppBarLayout appbarToolbar;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f27144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Animation f27145e;

    @BindView
    public EditText et_search_left_side;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Animation f27146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Animation f27147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Animation f27148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Animation f27149i;

    @BindView
    public ImageView iv_back_button_1;

    @BindView
    public ImageView iv_back_button_2;

    @BindView
    public ImageView iv_close_sidebar;

    @BindView
    public ImageView iv_hamburger_sidebar;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GridLayoutManager f27150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayoutManager f27151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VodAllDataRightSideAdapter f27152l;

    @BindView
    public LinearLayout ll_loader;

    @BindView
    public LinearLayout ll_no_cat_found;

    @BindView
    public LinearLayout ll_series_data;

    @BindView
    public ImageView logo;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b0 f27153m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f27154n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<c.h.a.i.e> f27155o;
    public ArrayList<c.h.a.i.e> p;
    public c.h.a.i.q.f q;
    public ArrayList<c.h.a.i.q.i> r;

    @BindView
    public RecyclerView recycler_view;

    @BindView
    public RecyclerView recycler_view_left_sidebar;

    @BindView
    public RelativeLayout rl_left;

    @BindView
    public RelativeLayout rl_right;

    @BindView
    public RelativeLayout rl_search_cat;
    public ArrayList<c.h.a.i.e> s;
    public ArrayList<c.h.a.i.e> t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tv_main_cat_name;

    @BindView
    public TextView tv_no_record_found;
    public c.h.a.i.q.a w;
    public ArrayList<c.h.a.i.f> x;
    public ArrayList<c.h.a.i.f> y;
    public ArrayList<c.h.a.i.f> z;
    public int u = -1;
    public ArrayList<String> v = new ArrayList<>();
    public ArrayList<c.h.a.i.f> C = new ArrayList<>();
    public ArrayList<c.h.a.i.f> D = new ArrayList<>();
    public String J = "0";
    public String K = "0";
    public int L = -1;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            if (VodAllDataSingleActivity.this.f27153m != null) {
                VodAllDataSingleActivity.this.f27153m.getFilter().filter(charSequence.toString());
            }
        }
    }

    public class b extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f27157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f27158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f27159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f27160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f27161f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f27162g;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                VodAllDataSingleActivity.this.l1();
            }
        }

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity$b$b, reason: collision with other inner class name */
        public class ViewOnFocusChangeListenerC0278b implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f27165b;

            public ViewOnFocusChangeListenerC0278b(View view) {
                this.f27165b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f27165b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f27165b.getTag().equals("1")) {
                        View view3 = this.f27165b;
                        if (view3 == null || view3.getTag() == null || !this.f27165b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = b.this.f27162g;
                    }
                    linearLayout = b.this.f27161f;
                } else {
                    View view4 = this.f27165b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f27165b.getTag().equals("1")) {
                        View view5 = this.f27165b;
                        if (view5 == null || view5.getTag() == null || !this.f27165b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = b.this.f27162g;
                    }
                    linearLayout = b.this.f27161f;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public b(Activity activity) {
            super(activity);
            this.f27157b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.btn_no) {
                dismiss();
            } else if (id == R.id.btn_yes) {
                try {
                    VodAllDataSingleActivity.this.f27154n.U();
                    VodAllDataSingleActivity.this.q1();
                    new Handler().postDelayed(new a(), 100L);
                } catch (Exception unused) {
                }
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(new c.h.a.k.d.a.a(VodAllDataSingleActivity.this.f27144d).A().equals(c.h.a.h.n.a.s0) ? R.layout.custom_alert_layout_tv : R.layout.custom_alert_layout);
            this.f27158c = (TextView) findViewById(R.id.btn_yes);
            this.f27159d = (TextView) findViewById(R.id.btn_no);
            this.f27161f = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
            this.f27162g = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
            TextView textView = (TextView) findViewById(R.id.txt_dia);
            this.f27160e = textView;
            textView.setText(VodAllDataSingleActivity.this.getResources().getString(R.string.you_want_to_remove_all_movies_from_continue_watching));
            this.f27158c.setOnClickListener(this);
            this.f27159d.setOnClickListener(this);
            TextView textView2 = this.f27158c;
            textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0278b(textView2));
            TextView textView3 = this.f27159d;
            textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0278b(textView3));
        }
    }

    public class c implements Comparator<c.h.a.i.f> {
        public c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c.h.a.i.f fVar, c.h.a.i.f fVar2) {
            float f2;
            float f3 = 0.0f;
            try {
                f2 = Float.parseFloat(fVar2.T());
            } catch (Exception unused) {
                f2 = 0.0f;
            }
            try {
                f3 = Float.parseFloat(fVar.T());
            } catch (Exception unused2) {
            }
            return Float.compare(f2, f3);
        }
    }

    public class d extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f27168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f27169c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f27170d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f27171e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f27172f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RadioGroup f27173g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f27174h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f27176b;

            public a(View view) {
                this.f27176b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f27176b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f27176b.getTag().equals("1")) {
                        View view3 = this.f27176b;
                        if (view3 == null || view3.getTag() == null || !this.f27176b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = d.this.f27172f;
                    }
                    linearLayout = d.this.f27171e;
                } else {
                    View view4 = this.f27176b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f27176b.getTag().equals("1")) {
                        View view5 = this.f27176b;
                        if (view5 == null || view5.getTag() == null || !this.f27176b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = d.this.f27172f;
                    }
                    linearLayout = d.this.f27171e;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Activity activity, Activity activity2) {
            super(activity);
            this.f27174h = activity2;
            this.f27168b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.btn_no) {
                dismiss();
            } else if (id == R.id.btn_yes) {
                try {
                    RadioButton radioButton = (RadioButton) findViewById(this.f27173g.getCheckedRadioButtonId());
                    m.j0(radioButton.getText().toString().equals(this.f27174h.getResources().getString(R.string.sort_last_added)) ? "1" : radioButton.getText().toString().equals(this.f27174h.getResources().getString(R.string.sort_atoz)) ? "2" : radioButton.getText().toString().equals(this.f27174h.getResources().getString(R.string.sort_ztoa)) ? "3" : radioButton.getText().toString().equals(this.f27174h.getResources().getString(R.string.sort_top_rated)) ? "6" : "0", this.f27174h);
                    VodAllDataSingleActivity vodAllDataSingleActivity = VodAllDataSingleActivity.this;
                    vodAllDataSingleActivity.j1(vodAllDataSingleActivity.J, VodAllDataSingleActivity.this.K);
                    dismiss();
                } catch (Exception unused) {
                }
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            RadioButton radioButton;
            RadioButton radioButton2;
            RadioButton radioButton3;
            RadioButton radioButton4;
            RadioButton radioButton5;
            super.onCreate(bundle);
            setContentView(new c.h.a.k.d.a.a(this.f27174h).A().equals(c.h.a.h.n.a.s0) ? R.layout.live_sorting_layout_tv : R.layout.live_sorting_layout);
            this.f27169c = (TextView) findViewById(R.id.btn_yes);
            this.f27170d = (TextView) findViewById(R.id.btn_no);
            this.f27170d = (TextView) findViewById(R.id.btn_no);
            this.f27171e = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
            this.f27172f = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
            this.f27173g = (RadioGroup) findViewById(R.id.rg_radio);
            radioButton = (RadioButton) findViewById(R.id.rb_normal);
            radioButton2 = (RadioButton) findViewById(R.id.rb_lastadded);
            radioButton3 = (RadioButton) findViewById(R.id.rb_atoz);
            radioButton4 = (RadioButton) findViewById(R.id.rb_ztoa);
            RadioButton radioButton6 = (RadioButton) findViewById(R.id.rb_channel_asc);
            RadioButton radioButton7 = (RadioButton) findViewById(R.id.rb_channel_desc);
            radioButton5 = (RadioButton) findViewById(R.id.rb_top_rated);
            radioButton6.setVisibility(8);
            radioButton7.setVisibility(8);
            String strE = m.E(this.f27174h);
            strE.hashCode();
            switch (strE) {
                case "1":
                    radioButton2.setChecked(true);
                    break;
                case "2":
                    radioButton3.setChecked(true);
                    break;
                case "3":
                    radioButton4.setChecked(true);
                    break;
                case "6":
                    radioButton5.setChecked(true);
                    break;
                default:
                    radioButton.setChecked(true);
                    break;
            }
            this.f27169c.setOnClickListener(this);
            this.f27170d.setOnClickListener(this);
            TextView textView = this.f27169c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f27170d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class e implements SearchView.l {
        public e() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            if (VodAllDataSingleActivity.this.f27152l == null) {
                return false;
            }
            VodAllDataSingleActivity.this.f27152l.getFilter().filter(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(VodAllDataSingleActivity.this.f27144d);
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

    @SuppressLint({"StaticFieldLeak"})
    public class h extends AsyncTask<String, Void, String> {
        public h() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String doInBackground(java.lang.String... r8) {
            /*
                r7 = this;
                r0 = 0
                r1 = r8[r0]     // Catch: java.lang.Exception -> L61
                r2 = -1
                int r3 = r1.hashCode()     // Catch: java.lang.Exception -> L61
                r4 = 3
                r5 = 2
                r6 = 1
                switch(r3) {
                    case -74801864: goto L2c;
                    case -74797390: goto L23;
                    case 1976766565: goto L19;
                    case 1997009972: goto Lf;
                    default: goto Le;
                }     // Catch: java.lang.Exception -> L61
            Le:
                goto L36
            Lf:
                java.lang.String r0 = "get_recent_watch"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L61
                if (r0 == 0) goto L36
                r0 = 2
                goto L37
            L19:
                java.lang.String r0 = "get_recent_added"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L61
                if (r0 == 0) goto L36
                r0 = 3
                goto L37
            L23:
                java.lang.String r3 = "get_fav"
                boolean r1 = r1.equals(r3)     // Catch: java.lang.Exception -> L61
                if (r1 == 0) goto L36
                goto L37
            L2c:
                java.lang.String r0 = "get_all"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L61
                if (r0 == 0) goto L36
                r0 = 1
                goto L37
            L36:
                r0 = -1
            L37:
                if (r0 == 0) goto L5a
                if (r0 == r6) goto L51
                if (r0 == r5) goto L4a
                if (r0 == r4) goto L41
                r8 = 0
                return r8
            L41:
                com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity r0 = com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity.this     // Catch: java.lang.Exception -> L61
                r8 = r8[r6]     // Catch: java.lang.Exception -> L61
                java.lang.String r8 = r0.U0(r8)     // Catch: java.lang.Exception -> L61
                return r8
            L4a:
                com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity r8 = com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity.this     // Catch: java.lang.Exception -> L61
                java.lang.String r8 = com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity.F0(r8)     // Catch: java.lang.Exception -> L61
                return r8
            L51:
                com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity r0 = com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity.this     // Catch: java.lang.Exception -> L61
                r8 = r8[r6]     // Catch: java.lang.Exception -> L61
                java.lang.String r8 = r0.Q0(r8)     // Catch: java.lang.Exception -> L61
                return r8
            L5a:
                com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity r8 = com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity.this     // Catch: java.lang.Exception -> L61
                java.lang.String r8 = r8.R0()     // Catch: java.lang.Exception -> L61
                return r8
            L61:
                java.lang.String r8 = "error"
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity.h.doInBackground(java.lang.String[]):java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            VodAllDataSingleActivity.this.a1();
            str.hashCode();
            switch (str) {
                case "get_all":
                    VodAllDataSingleActivity.this.y0();
                    break;
                case "get_fav":
                    VodAllDataSingleActivity.this.O0();
                    break;
                case "get_recent_watch":
                    VodAllDataSingleActivity.this.z0();
                    break;
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            VodAllDataSingleActivity.this.w1();
            VodAllDataSingleActivity.this.e1();
            VodAllDataSingleActivity.this.Z0();
        }
    }

    public class i implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f27182b;

        public i(View view) {
            this.f27182b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27182b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27182b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27182b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            Resources resources;
            int i2;
            Drawable drawable;
            if (z) {
                View view2 = this.f27182b;
                if (view2 == null || view2.getTag() == null || !this.f27182b.getTag().equals("1")) {
                    View view3 = this.f27182b;
                    if (view3 == null || view3.getTag() == null || !this.f27182b.getTag().equals("2")) {
                        View view4 = this.f27182b;
                        if (view4 == null || view4.getTag() == null || !this.f27182b.getTag().equals("3")) {
                            b(1.15f);
                            c(1.15f);
                            return;
                        }
                    } else {
                        resources = VodAllDataSingleActivity.this.getResources();
                        i2 = R.color.hp_cyan_dark;
                    }
                }
                drawable = VodAllDataSingleActivity.this.getResources().getDrawable(R.drawable.icon_shadow_cyan_focused);
                view.setBackground(drawable);
            }
            if (z) {
                return;
            }
            View view5 = this.f27182b;
            if (view5 == null || view5.getTag() == null || !this.f27182b.getTag().equals("1")) {
                View view6 = this.f27182b;
                if (view6 == null || view6.getTag() == null || !this.f27182b.getTag().equals("2")) {
                    View view7 = this.f27182b;
                    if (view7 == null || view7.getTag() == null || !this.f27182b.getTag().equals("3")) {
                        b(1.0f);
                        c(1.0f);
                        a(z);
                        return;
                    }
                } else {
                    resources = VodAllDataSingleActivity.this.getResources();
                    i2 = R.color.cat_search_background;
                }
            }
            view.setBackgroundResource(0);
            return;
            drawable = resources.getDrawable(i2);
            view.setBackground(drawable);
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class j extends AsyncTask<String, Void, Boolean> {
        public j() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return VodAllDataSingleActivity.this.B1();
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            VodAllDataSingleActivity.this.t1();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public static void X0(Activity activity) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(activity);
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        } catch (Exception unused) {
        }
    }

    public final void A1() {
        this.f27145e = AnimationUtils.loadAnimation(this.f27144d, R.anim.cat_left_in);
        this.f27146f = AnimationUtils.loadAnimation(this.f27144d, R.anim.cat_left_out);
        this.f27147g = AnimationUtils.loadAnimation(this.f27144d, R.anim.fade_out_new);
        this.f27148h = AnimationUtils.loadAnimation(this.f27144d, R.anim.fade_in_new_2);
        this.f27149i = AnimationUtils.loadAnimation(this.f27144d, R.anim.bounce);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7 A[Catch: Exception -> 0x0120, NullPointerException -> 0x0123, TryCatch #2 {NullPointerException -> 0x0123, Exception -> 0x0120, blocks: (B:3:0x0004, B:5:0x0008, B:7:0x000c, B:8:0x000f, B:10:0x0070, B:13:0x007c, B:14:0x0093, B:19:0x00bd, B:21:0x00d7, B:15:0x009b, B:18:0x00a7, B:22:0x011d), top: B:28:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean B1() {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity.B1():java.lang.Boolean");
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

    public boolean M0() {
        VodAllDataRightSideAdapter vodAllDataRightSideAdapter = this.f27152l;
        if (vodAllDataRightSideAdapter != null) {
            return vodAllDataRightSideAdapter.G0();
        }
        return false;
    }

    public final void N0() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            editText.setText(BuildConfig.FLAVOR);
            this.et_search_left_side.clearFocus();
        }
    }

    public void O0() {
        try {
            ArrayList<c.h.a.i.f> arrayList = this.C;
            if (arrayList == null || arrayList.size() <= 0) {
                p.b().m(null);
                VodAllDataRightSideAdapter vodAllDataRightSideAdapter = new VodAllDataRightSideAdapter(this.f27144d, "vod");
                this.f27152l = vodAllDataRightSideAdapter;
                this.recycler_view.setAdapter(vodAllDataRightSideAdapter);
                v1(getResources().getString(R.string.no_fav_movie_found));
                return;
            }
            p.b().m(this.C);
            VodAllDataRightSideAdapter vodAllDataRightSideAdapter2 = new VodAllDataRightSideAdapter(this.f27144d, "vod");
            this.f27152l = vodAllDataRightSideAdapter2;
            this.recycler_view.setAdapter(vodAllDataRightSideAdapter2);
            RelativeLayout relativeLayout = this.rl_left;
            this.f27150j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.recycler_view.setLayoutManager(this.f27150j);
            z1();
        } catch (Exception unused) {
        }
    }

    public final void P0() {
        ImageView imageView = this.iv_close_sidebar;
        imageView.setOnFocusChangeListener(new i(imageView));
        RelativeLayout relativeLayout = this.rl_search_cat;
        relativeLayout.setOnFocusChangeListener(new i(relativeLayout));
        ImageView imageView2 = this.iv_hamburger_sidebar;
        imageView2.setOnFocusChangeListener(new i(imageView2));
    }

    public String Q0(String str) {
        try {
            this.x = new ArrayList<>();
            this.f27155o = new ArrayList<>();
            this.y = new ArrayList<>();
            this.z = this.q.W0(str, "movie");
            return "get_all";
        } catch (Exception unused) {
            return "get_all";
        }
    }

    public String R0() {
        try {
            if (m.f(this.f27144d).equals("m3u")) {
                new ArrayList();
                this.C.clear();
                ArrayList<c.h.a.i.c> arrayListB1 = this.q.B1("movie");
                if (this.v != null) {
                    this.v = S0();
                }
                ArrayList<String> arrayList = this.v;
                if (arrayList != null && arrayList.size() > 0 && arrayListB1 != null && arrayListB1.size() > 0) {
                    arrayListB1 = W0(arrayListB1, this.v);
                }
                for (c.h.a.i.c cVar : arrayListB1) {
                    ArrayList<c.h.a.i.f> arrayListF1 = this.q.F1(cVar.a(), cVar.c());
                    if (arrayListF1 != null && arrayListF1.size() > 0) {
                        this.C.add(arrayListF1.get(0));
                    }
                }
                return "get_fav";
            }
            new ArrayList();
            this.C.clear();
            ArrayList<c.h.a.i.b> arrayListP = this.w.p("vod", m.z(this.f27144d));
            if (this.v != null) {
                this.v = S0();
            }
            ArrayList<String> arrayList2 = this.v;
            if (arrayList2 != null && arrayList2.size() > 0 && arrayListP != null && arrayListP.size() > 0) {
                arrayListP = V0(arrayListP, this.v);
            }
            for (c.h.a.i.b bVar : arrayListP) {
                c.h.a.i.f fVarD1 = this.q.D1(bVar.a(), String.valueOf(bVar.e()));
                if (fVarD1 != null) {
                    this.C.add(fVarD1);
                }
            }
            if (!m.E(this.f27144d).equalsIgnoreCase("6")) {
                return "get_fav";
            }
            Collections.sort(this.C, new c());
            return "get_fav";
        } catch (Exception unused) {
            return "get_fav";
        }
    }

    public final ArrayList<String> S0() {
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.q.d1(m.z(this.f27144d));
        this.r = arrayListD1;
        if (arrayListD1 != null) {
            for (c.h.a.i.q.i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.v.add(iVar.b());
                }
            }
        }
        return this.v;
    }

    public final String T0() {
        this.v = new ArrayList<>();
        new ArrayList();
        this.D = new ArrayList<>();
        ArrayList<c.h.a.i.f> arrayListS = this.f27154n.s("getalldata", "1");
        if (this.q.I1(m.z(this.f27144d)) <= 0) {
            this.D = arrayListS;
            return "get_recent_watch";
        }
        this.v = S0();
        for (c.h.a.i.f fVar : arrayListS) {
            boolean z = false;
            Iterator<String> it = this.v.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (fVar.g() != null && fVar.g().equals(next)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                this.D.add(fVar);
            }
        }
        return "get_recent_watch";
    }

    public String U0(String str) {
        try {
            this.x = new ArrayList<>();
            this.f27155o = new ArrayList<>();
            this.y = new ArrayList<>();
            this.z = this.q.W0(str, "movie");
            return "get_all";
        } catch (Exception unused) {
            return "get_all";
        }
    }

    public final ArrayList<c.h.a.i.b> V0(ArrayList<c.h.a.i.b> arrayList, ArrayList<String> arrayList2) {
        this.A = new ArrayList<>();
        for (c.h.a.i.b bVar : arrayList) {
            boolean z = false;
            Iterator<String> it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (bVar.a() != null && bVar.a().equals(next)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                this.A.add(bVar);
            }
        }
        return this.A;
    }

    public final ArrayList<c.h.a.i.c> W0(ArrayList<c.h.a.i.c> arrayList, ArrayList<String> arrayList2) {
        this.B = new ArrayList<>();
        if (arrayList == null) {
            return null;
        }
        try {
            for (c.h.a.i.c cVar : arrayList) {
                boolean z = false;
                if (arrayList2 != null) {
                    Iterator<String> it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (cVar.a().equals(it.next())) {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        this.B.add(cVar);
                    }
                }
            }
            return this.B;
        } catch (Exception unused) {
            return null;
        }
    }

    public void Y0() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public void Z0() {
        TextView textView = this.tv_no_record_found;
        if (textView == null || textView.getVisibility() != 0) {
            return;
        }
        this.tv_no_record_found.setVisibility(8);
    }

    public void a1() {
        LinearLayout linearLayout = this.ll_loader;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        this.ll_loader.setVisibility(8);
    }

    public final void b1() {
        if (this.rl_left.getVisibility() == 0) {
            X0(this);
            this.rl_right.startAnimation(this.f27148h);
            this.rl_right.setVisibility(0);
            this.rl_left.startAnimation(this.f27146f);
            this.rl_left.setVisibility(8);
            this.iv_hamburger_sidebar.startAnimation(this.f27149i);
            this.iv_hamburger_sidebar.setVisibility(0);
            if (!new c.h.a.k.d.a.a(this.f27144d).A().equals(c.h.a.h.n.a.s0)) {
                this.iv_back_button_2.setVisibility(0);
            }
            this.iv_hamburger_sidebar.requestFocus();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f27144d, 7);
            this.f27150j = gridLayoutManager;
            this.recycler_view.setLayoutManager(gridLayoutManager);
        }
    }

    @SuppressLint({"InlinedApi"})
    public void d1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public void e1() {
        LinearLayout linearLayout = this.ll_series_data;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        this.ll_series_data.setVisibility(8);
    }

    public final void f1() {
        ImageView imageView;
        this.f27155o = new ArrayList<>();
        this.p = new ArrayList<>();
        this.q = new c.h.a.i.q.f(this.f27144d);
        this.r = new ArrayList<>();
        this.t = new ArrayList<>();
        this.s = new ArrayList<>();
        this.f27154n = new k(this.f27144d);
        this.f27151k = new LinearLayoutManager(this.f27144d);
        this.w = new c.h.a.i.q.a(this.f27144d);
        this.z = new ArrayList<>();
        int i2 = 0;
        SharedPreferences sharedPreferences = getSharedPreferences("showhidemoviename", 0);
        this.E = sharedPreferences;
        this.F = sharedPreferences.edit();
        c.h.a.h.n.e.o(this.f27144d);
        if (new c.h.a.k.d.a.a(this.f27144d).A().equals(c.h.a.h.n.a.s0)) {
            imageView = this.iv_back_button_1;
            i2 = 8;
        } else {
            imageView = this.iv_back_button_1;
        }
        imageView.setVisibility(i2);
        P0();
        A1();
        n1();
        o1();
        i1();
    }

    public final boolean g1() {
        EditText editText = this.et_search_left_side;
        return editText != null && editText.getText().toString().length() > 0;
    }

    public boolean h1() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            return editText.isFocused();
        }
        return false;
    }

    public void i1() {
        new j().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public void j1(String str, String str2) {
        AsyncTask<String, Void, String> asyncTaskExecuteOnExecutor;
        ArrayList<c.h.a.i.f> arrayListA;
        this.J = str;
        this.K = str2;
        s1(str2);
        r1(str);
        try {
            SearchView searchView = this.I;
            if (searchView != null && this.H != null) {
                searchView.d0(BuildConfig.FLAVOR, false);
                this.H.collapseActionView();
            }
        } catch (Exception unused) {
        }
        try {
            if (this.G != null) {
                if (this.J.equals("-5") || this.J.equals("-4")) {
                    this.G.getItem(1).getSubMenu().findItem(R.id.menu_sort).setVisible(false);
                } else {
                    this.G.getItem(1).getSubMenu().findItem(R.id.menu_sort).setVisible(true);
                }
                if (!this.J.equals("-4") || (arrayListA = p.b().a()) == null || arrayListA.size() <= 0) {
                    MenuItem menuItemFindItem = this.G.getItem(1).getSubMenu().findItem(R.id.nav_delete_all);
                    menuItemFindItem.setVisible(false);
                } else {
                    this.G.getItem(1).getSubMenu().findItem(R.id.nav_delete_all).setVisible(true);
                }
            }
        } catch (Exception unused2) {
        }
        str.hashCode();
        switch (str) {
            case "-1":
                asyncTaskExecuteOnExecutor = new h().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
                break;
            case "-4":
                asyncTaskExecuteOnExecutor = new h().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_watch");
                break;
            case "-5":
                asyncTaskExecuteOnExecutor = new h().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_added", str);
                break;
            default:
                asyncTaskExecuteOnExecutor = new h().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_all", str);
                break;
        }
        c.h.a.h.n.e.f17064f = asyncTaskExecuteOnExecutor;
    }

    public void k1() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    public void l1() {
        b0 b0Var = this.f27153m;
        if (b0Var != null) {
            b0Var.w();
        }
    }

    public void m1() {
        VodAllDataRightSideAdapter vodAllDataRightSideAdapter = this.f27152l;
        if (vodAllDataRightSideAdapter != null) {
            vodAllDataRightSideAdapter.w();
        }
    }

    public final void n1() {
        this.iv_close_sidebar.setOnClickListener(this);
        this.iv_hamburger_sidebar.setOnClickListener(this);
        this.logo.setOnClickListener(this);
        this.rl_search_cat.setOnClickListener(this);
        this.iv_back_button_1.setOnClickListener(this);
        this.iv_back_button_2.setOnClickListener(this);
    }

    public final void o1() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            editText.addTextChangedListener(new a());
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (g1()) {
            N0();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back_button_1 /* 2131428112 */:
            case R.id.iv_back_button_2 /* 2131428113 */:
                onBackPressed();
                break;
            case R.id.iv_close_sidebar /* 2131428128 */:
                b1();
                break;
            case R.id.iv_hamburger_sidebar /* 2131428150 */:
                this.L = -1;
                x1();
                break;
            case R.id.logo /* 2131428520 */:
                c.h.a.h.n.e.b(this.f27144d);
                break;
            case R.id.rl_search_cat /* 2131428997 */:
                this.et_search_left_side.requestFocus();
                break;
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d1();
        L0();
        this.f27144d = this;
        setContentView(R.layout.activity_series_all_data_single);
        ButterKnife.a(this);
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            v0(toolbar);
        }
        f1();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            toolbar.x(R.menu.menu_series_all_data_single_page);
            SharedPreferences sharedPreferences = this.E;
            if (sharedPreferences != null) {
                if (sharedPreferences.getInt("vod", 1) == 1) {
                    menu.getItem(1).getSubMenu().findItem(R.id.layout_view_show_movie_name).setVisible(false);
                    menu.getItem(1).getSubMenu().findItem(R.id.layout_view_hide_movie_name).setVisible(true);
                } else {
                    menu.getItem(1).getSubMenu().findItem(R.id.layout_view_show_movie_name).setVisible(true);
                    menu.getItem(1).getSubMenu().findItem(R.id.layout_view_hide_movie_name).setVisible(false);
                }
            }
            this.G = menu;
            TextView textView = this.tv_main_cat_name;
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (this.J.equals("-5") || this.J.equals("-4")) {
                this.G.getItem(1).getSubMenu().findItem(R.id.menu_sort).setVisible(false);
            } else {
                this.G.getItem(1).getSubMenu().findItem(R.id.menu_sort).setVisible(true);
            }
            if (this.J.equals("-4")) {
                this.G.getItem(1).getSubMenu().findItem(R.id.nav_delete_all).setVisible(true);
            }
            boolean zEquals = m.f(this.f27144d).equals("m3u");
            MenuItem menuItemFindItem = menu.getItem(1).getSubMenu().findItem(R.id.menu_load_channels_vod1);
            if (zEquals) {
                menuItemFindItem.setVisible(true);
            } else {
                menuItemFindItem.setVisible(false);
            }
        }
        return true;
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = c.h.a.h.n.e.f17064f;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        c.h.a.h.n.e.f17064f.cancel(true);
    }

    @Override // a.b.k.c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        VodAllDataRightSideAdapter vodAllDataRightSideAdapter;
        if (i2 != 21) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (this.rl_left.getVisibility() != 8 || (vodAllDataRightSideAdapter = this.f27152l) == null) {
            return false;
        }
        int iH0 = vodAllDataRightSideAdapter.H0();
        this.L = iH0;
        if (iH0 % 7 != 0) {
            return false;
        }
        x1();
        return false;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        this.H = menuItem;
        this.toolbar.e();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_search) {
            try {
                SearchView searchView = (SearchView) menuItem.getActionView();
                this.I = searchView;
                if (searchView != null) {
                    searchView.setQueryHint(getResources().getString(R.string.search_vod));
                    this.I.setIconifiedByDefault(false);
                    ImageView imageView = (ImageView) this.I.findViewById(R.id.search_close_btn);
                    ((ImageView) this.I.findViewById(R.id.search_go_btn)).setImageResource(R.drawable.menu_close_selector);
                    imageView.setImageResource(R.drawable.menu_close_selector);
                    imageView.setPadding(15, 15, 15, 15);
                    imageView.setBackground(null);
                    this.I.setOnQueryTextListener(new e());
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        if (itemId == R.id.menu_sort) {
            y1(this);
        }
        if (itemId == R.id.layout_view_show_movie_name) {
            SharedPreferences.Editor editor = this.F;
            if (editor != null) {
                editor.putInt("vod", 1);
                this.F.commit();
            }
            Menu menu = this.G;
            if (menu != null) {
                menu.getItem(1).getSubMenu().findItem(R.id.layout_view_show_movie_name).setVisible(false);
                this.G.getItem(1).getSubMenu().findItem(R.id.layout_view_hide_movie_name).setVisible(true);
            }
            m1();
        }
        if (itemId == R.id.layout_view_hide_movie_name) {
            SharedPreferences.Editor editor2 = this.F;
            if (editor2 != null) {
                editor2.putInt("vod", 0);
                this.F.commit();
            }
            Menu menu2 = this.G;
            if (menu2 != null) {
                menu2.getItem(1).getSubMenu().findItem(R.id.layout_view_show_movie_name).setVisible(true);
                this.G.getItem(1).getSubMenu().findItem(R.id.layout_view_hide_movie_name).setVisible(false);
            }
            m1();
        }
        if (itemId == R.id.nav_delete_all && p.b().a() != null && p.b().a().size() > 0) {
            u1();
        }
        if (itemId == R.id.menu_load_channels_vod1) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f27144d.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f27144d.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f27144d.getResources().getString(R.string.yes), new f());
            aVar.g(this.f27144d.getResources().getString(R.string.no), new g());
            aVar.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        d1();
        super.onResume();
        l1();
        if (this.J.equals("-4")) {
            q1();
        } else {
            m1();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        d1();
    }

    public void p1() {
        VodAllDataRightSideAdapter vodAllDataRightSideAdapter = this.f27152l;
        if (vodAllDataRightSideAdapter != null) {
            vodAllDataRightSideAdapter.M0();
        }
    }

    public void q1() {
        c.h.a.h.n.e.f17064f = new h().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_watch", "-4");
    }

    public final void r1(String str) {
        b0 b0Var = this.f27153m;
        if (b0Var != null) {
            b0Var.o0(str);
        }
    }

    public void s1(String str) {
        TextView textView = this.tv_main_cat_name;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void t1() {
        ArrayList<c.h.a.i.e> arrayList;
        int i2;
        String string;
        ArrayList<c.h.a.i.e> arrayList2 = this.s;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList<c.h.a.i.e> arrayList3 = this.t;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
        ArrayList<c.h.a.i.e> arrayList4 = new ArrayList<>();
        this.t = arrayList4;
        arrayList4.addAll(this.s);
        String strB = "0";
        if (m.f(this.f27144d).equals("m3u")) {
            ArrayList<c.h.a.i.e> arrayList5 = this.s;
            if (arrayList5 != null && arrayList5.size() >= 3) {
                arrayList = this.s;
                i2 = 2;
                strB = arrayList.get(i2).b();
                string = this.s.get(i2).c();
            }
            string = this.f27144d.getResources().getString(R.string.all);
        } else {
            ArrayList<c.h.a.i.e> arrayList6 = this.s;
            if (arrayList6 != null && arrayList6.size() >= 5) {
                arrayList = this.s;
                i2 = 4;
                strB = arrayList.get(i2).b();
                string = this.s.get(i2).c();
            }
            string = this.f27144d.getResources().getString(R.string.all);
        }
        j1(strB, string);
        ArrayList<c.h.a.i.e> arrayList7 = this.t;
        if (arrayList7 != null && arrayList7.size() > 0) {
            p.b().l(this.t);
        }
        b0 b0Var = new b0(this.f27144d, strB);
        this.f27153m = b0Var;
        this.recycler_view_left_sidebar.setAdapter(b0Var);
        this.recycler_view_left_sidebar.setLayoutManager(this.f27151k);
    }

    public final void u1() {
        try {
            new b((VodAllDataSingleActivity) this.f27144d).show();
        } catch (Exception unused) {
        }
    }

    public void v1(String str) {
        TextView textView = this.tv_no_record_found;
        if (textView != null) {
            textView.setText(str);
            this.tv_no_record_found.setVisibility(0);
        }
    }

    public final void w1() {
        LinearLayout linearLayout = this.ll_loader;
        if (linearLayout == null || linearLayout.getVisibility() != 8) {
            return;
        }
        this.ll_loader.setVisibility(0);
    }

    public final void x1() {
        if (this.rl_left.getVisibility() == 8) {
            this.iv_hamburger_sidebar.setVisibility(8);
            if (!new c.h.a.k.d.a.a(this.f27144d).A().equals(c.h.a.h.n.a.s0)) {
                this.iv_back_button_2.setVisibility(8);
            }
            this.iv_close_sidebar.startAnimation(this.f27149i);
            this.iv_close_sidebar.setVisibility(0);
            this.iv_close_sidebar.requestFocus();
            this.rl_left.startAnimation(this.f27145e);
            this.rl_left.setVisibility(0);
            this.rl_right.startAnimation(this.f27147g);
            this.rl_right.setVisibility(0);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f27144d, 5);
            this.f27150j = gridLayoutManager;
            this.recycler_view.setLayoutManager(gridLayoutManager);
            if (this.f27152l != null) {
                this.recycler_view.n1(this.L);
                this.L = -1;
            }
        }
    }

    public void y0() {
        try {
            ArrayList<c.h.a.i.f> arrayList = this.z;
            if (arrayList == null || arrayList.size() <= 0) {
                p.b().m(null);
                VodAllDataRightSideAdapter vodAllDataRightSideAdapter = new VodAllDataRightSideAdapter(this.f27144d, "vod");
                this.f27152l = vodAllDataRightSideAdapter;
                this.recycler_view.setAdapter(vodAllDataRightSideAdapter);
                v1(getResources().getString(R.string.no_movie_found));
                return;
            }
            p.b().m(this.z);
            VodAllDataRightSideAdapter vodAllDataRightSideAdapter2 = new VodAllDataRightSideAdapter(this.f27144d, "vod");
            this.f27152l = vodAllDataRightSideAdapter2;
            this.recycler_view.setAdapter(vodAllDataRightSideAdapter2);
            RelativeLayout relativeLayout = this.rl_left;
            this.f27150j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.recycler_view.setLayoutManager(this.f27150j);
            z1();
        } catch (Exception unused) {
        }
    }

    public final void y1(Activity activity) {
        try {
            new d(this, activity).show();
        } catch (Exception unused) {
        }
    }

    public final void z0() {
        ArrayList<c.h.a.i.f> arrayList = this.D;
        if (arrayList == null || arrayList.size() <= 0) {
            p.b().m(null);
            p.b().h(null);
            Menu menu = this.G;
            if (menu != null) {
                menu.getItem(1).getSubMenu().findItem(R.id.nav_delete_all).setVisible(false);
            }
            VodAllDataRightSideAdapter vodAllDataRightSideAdapter = new VodAllDataRightSideAdapter(this.f27144d, "continue_watching");
            this.f27152l = vodAllDataRightSideAdapter;
            this.recycler_view.setAdapter(vodAllDataRightSideAdapter);
            v1(getResources().getString(R.string.no_movie_watched_yet));
            return;
        }
        p.b().h(this.D);
        if (this.G != null) {
            ArrayList<c.h.a.i.f> arrayList2 = this.D;
            if (arrayList2 == null || arrayList2.size() <= 0) {
                this.G.getItem(1).getSubMenu().findItem(R.id.nav_delete_all).setVisible(false);
            } else {
                this.G.getItem(1).getSubMenu().findItem(R.id.nav_delete_all).setVisible(true);
            }
        }
        p.b().m(this.D);
        VodAllDataRightSideAdapter vodAllDataRightSideAdapter2 = new VodAllDataRightSideAdapter(this.f27144d, "continue_watching");
        this.f27152l = vodAllDataRightSideAdapter2;
        this.recycler_view.setAdapter(vodAllDataRightSideAdapter2);
        RelativeLayout relativeLayout = this.rl_left;
        this.f27150j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
        this.recycler_view.setLayoutManager(this.f27150j);
        z1();
    }

    public void z1() {
        LinearLayout linearLayout = this.ll_series_data;
        if (linearLayout == null || linearLayout.getVisibility() != 8) {
            return;
        }
        this.ll_series_data.setVisibility(0);
    }
}
