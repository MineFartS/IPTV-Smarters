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
import c.h.a.i.q.m;
import c.h.a.k.b.l;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.adapter.LiveAllDataRightSideAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class LiveAllDataSingleActivity extends a.b.k.c implements View.OnClickListener {
    public ArrayList<c.h.a.i.c> A;
    public SharedPreferences D;
    public SharedPreferences.Editor E;
    public Menu F;
    public MenuItem G;
    public SearchView H;

    @BindView
    public AppBarLayout appbarToolbar;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f25735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Animation f25736e;

    @BindView
    public EditText et_search_left_side;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Animation f25737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Animation f25738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Animation f25739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Animation f25740i;

    @BindView
    public ImageView iv_back_button_1;

    @BindView
    public ImageView iv_back_button_2;

    @BindView
    public ImageView iv_close_sidebar;

    @BindView
    public ImageView iv_hamburger_sidebar;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GridLayoutManager f25741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayoutManager f25742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LiveAllDataRightSideAdapter f25743l;

    @BindView
    public LinearLayout ll_loader;

    @BindView
    public LinearLayout ll_no_cat_found;

    @BindView
    public LinearLayout ll_series_data;

    @BindView
    public ImageView logo;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f25744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<c.h.a.i.e> f25745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<c.h.a.i.e> f25746o;
    public c.h.a.i.q.f p;
    public ArrayList<c.h.a.i.q.i> q;
    public ArrayList<c.h.a.i.e> r;

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

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tv_main_cat_name;

    @BindView
    public TextView tv_no_record_found;
    public c.h.a.i.q.a v;
    public ArrayList<c.h.a.i.f> w;
    public ArrayList<c.h.a.i.f> x;
    public ArrayList<c.h.a.i.f> y;
    public ArrayList<c.h.a.i.b> z;
    public int t = -1;
    public ArrayList<String> u = new ArrayList<>();
    public ArrayList<c.h.a.i.f> B = new ArrayList<>();
    public ArrayList<c.h.a.i.f> C = new ArrayList<>();
    public String I = "0";
    public String J = "0";
    public int K = -1;
    public String L = BuildConfig.FLAVOR;
    public String M = "0";
    public String N = "false";

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
            if (LiveAllDataSingleActivity.this.f25744m != null) {
                LiveAllDataSingleActivity.this.f25744m.getFilter().filter(charSequence.toString());
            }
        }
    }

    public class b extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f25748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f25749c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f25750d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f25751e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f25752f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f25753g;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                LiveAllDataSingleActivity.this.l1();
            }
        }

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity$b$b, reason: collision with other inner class name */
        public class ViewOnFocusChangeListenerC0275b implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f25756b;

            public ViewOnFocusChangeListenerC0275b(View view) {
                this.f25756b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f25756b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f25756b.getTag().equals("1")) {
                        View view3 = this.f25756b;
                        if (view3 == null || view3.getTag() == null || !this.f25756b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = b.this.f25753g;
                    }
                    linearLayout = b.this.f25752f;
                } else {
                    View view4 = this.f25756b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f25756b.getTag().equals("1")) {
                        View view5 = this.f25756b;
                        if (view5 == null || view5.getTag() == null || !this.f25756b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = b.this.f25753g;
                    }
                    linearLayout = b.this.f25752f;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        public b(Activity activity) {
            super(activity);
            this.f25748b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.btn_no) {
                dismiss();
            } else if (id == R.id.btn_yes) {
                try {
                    LiveAllDataSingleActivity.this.p.A0();
                    LiveAllDataSingleActivity.this.r1();
                    new Handler().postDelayed(new a(), 100L);
                } catch (Exception unused) {
                }
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(new c.h.a.k.d.a.a(LiveAllDataSingleActivity.this.f25735d).A().equals(c.h.a.h.n.a.s0) ? R.layout.custom_alert_layout_tv : R.layout.custom_alert_layout);
            this.f25749c = (TextView) findViewById(R.id.btn_yes);
            this.f25750d = (TextView) findViewById(R.id.btn_no);
            this.f25752f = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
            this.f25753g = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
            TextView textView = (TextView) findViewById(R.id.txt_dia);
            this.f25751e = textView;
            textView.setText(LiveAllDataSingleActivity.this.getResources().getString(R.string.you_want_to_remove_all_channels_from_recently_watched));
            this.f25749c.setOnClickListener(this);
            this.f25750d.setOnClickListener(this);
            TextView textView2 = this.f25749c;
            textView2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0275b(textView2));
            TextView textView3 = this.f25750d;
            textView3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0275b(textView3));
        }
    }

    public class c implements SearchView.l {
        public c() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            if (LiveAllDataSingleActivity.this.f25743l == null) {
                return false;
            }
            LiveAllDataSingleActivity.this.f25743l.getFilter().filter(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class d extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f25759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f25760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f25761d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f25762e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f25763f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RadioGroup f25764g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f25765h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f25767b;

            public a(View view) {
                this.f25767b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f25767b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f25767b.getTag().equals("1")) {
                        View view3 = this.f25767b;
                        if (view3 == null || view3.getTag() == null || !this.f25767b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = d.this.f25763f;
                    }
                    linearLayout = d.this.f25762e;
                } else {
                    View view4 = this.f25767b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f25767b.getTag().equals("1")) {
                        View view5 = this.f25767b;
                        if (view5 == null || view5.getTag() == null || !this.f25767b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = d.this.f25763f;
                    }
                    linearLayout = d.this.f25762e;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Activity activity, Activity activity2) {
            super(activity);
            this.f25765h = activity2;
            this.f25759b = activity;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: Exception -> 0x0125, PHI: r0
  0x0047: PHI (r0v24 java.lang.String) = 
  (r0v17 java.lang.String)
  (r0v18 java.lang.String)
  (r0v19 java.lang.String)
  (r0v20 java.lang.String)
  (r0v21 java.lang.String)
  (r0v25 java.lang.String)
 binds: [B:41:0x010b, B:37:0x00fb, B:31:0x00d0, B:25:0x00a6, B:19:0x007c, B:12:0x0045] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {Exception -> 0x0125, blocks: (B:7:0x0010, B:10:0x0039, B:13:0x0047, B:43:0x010f, B:14:0x004e, B:15:0x0055, B:17:0x0070, B:21:0x007f, B:23:0x009a, B:27:0x00a9, B:29:0x00c4, B:33:0x00d4, B:35:0x00ef, B:39:0x00ff), top: B:49:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[Catch: Exception -> 0x0125, PHI: r0
  0x004e: PHI (r0v22 java.lang.String) = 
  (r0v17 java.lang.String)
  (r0v18 java.lang.String)
  (r0v19 java.lang.String)
  (r0v20 java.lang.String)
  (r0v21 java.lang.String)
  (r0v25 java.lang.String)
 binds: [B:41:0x010b, B:37:0x00fb, B:31:0x00d0, B:25:0x00a6, B:19:0x007c, B:12:0x0045] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0125, blocks: (B:7:0x0010, B:10:0x0039, B:13:0x0047, B:43:0x010f, B:14:0x004e, B:15:0x0055, B:17:0x0070, B:21:0x007f, B:23:0x009a, B:27:0x00a9, B:29:0x00c4, B:33:0x00d4, B:35:0x00ef, B:39:0x00ff), top: B:49:0x0010 }] */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onClick(android.view.View r5) {
            /*
                Method dump skipped, instruction units count: 297
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity.d.onClick(android.view.View):void");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00f6  */
        @Override // android.app.Dialog
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onCreate(android.os.Bundle r11) {
            /*
                Method dump skipped, instruction units count: 386
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity.d.onCreate(android.os.Bundle):void");
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(LiveAllDataSingleActivity.this.f25735d);
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

    @SuppressLint({"StaticFieldLeak"})
    public class g extends AsyncTask<String, Void, String> {
        public g() {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
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
                r1 = r8[r0]     // Catch: java.lang.Exception -> L57
                r2 = -1
                int r3 = r1.hashCode()     // Catch: java.lang.Exception -> L57
                r4 = -74801864(0xfffffffffb8a9d38, float:-1.4394515E36)
                r5 = 2
                r6 = 1
                if (r3 == r4) goto L2d
                r4 = -74797390(0xfffffffffb8aaeb2, float:-1.4401604E36)
                if (r3 == r4) goto L24
                r0 = 1768729440(0x696cab60, float:1.7882237E25)
                if (r3 == r0) goto L1a
                goto L37
            L1a:
                java.lang.String r0 = "get_recently_watched"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L57
                if (r0 == 0) goto L37
                r0 = 2
                goto L38
            L24:
                java.lang.String r3 = "get_fav"
                boolean r1 = r1.equals(r3)     // Catch: java.lang.Exception -> L57
                if (r1 == 0) goto L37
                goto L38
            L2d:
                java.lang.String r0 = "get_all"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L57
                if (r0 == 0) goto L37
                r0 = 1
                goto L38
            L37:
                r0 = -1
            L38:
                if (r0 == 0) goto L50
                if (r0 == r6) goto L47
                if (r0 == r5) goto L40
                r8 = 0
                return r8
            L40:
                com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity r8 = com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity.this     // Catch: java.lang.Exception -> L57
                java.lang.String r8 = r8.R0()     // Catch: java.lang.Exception -> L57
                return r8
            L47:
                com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity r0 = com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity.this     // Catch: java.lang.Exception -> L57
                r8 = r8[r6]     // Catch: java.lang.Exception -> L57
                java.lang.String r8 = r0.Q0(r8)     // Catch: java.lang.Exception -> L57
                return r8
            L50:
                com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity r8 = com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity.this     // Catch: java.lang.Exception -> L57
                java.lang.String r8 = r8.S0()     // Catch: java.lang.Exception -> L57
                return r8
            L57:
                java.lang.String r8 = "error"
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity.g.doInBackground(java.lang.String[]):java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            LiveAllDataSingleActivity.this.a1();
            str.hashCode();
            switch (str) {
                case "get_all":
                    LiveAllDataSingleActivity.this.y0();
                    break;
                case "get_fav":
                    LiveAllDataSingleActivity.this.O0();
                    break;
                case "get_recent_watch":
                    LiveAllDataSingleActivity.this.z0();
                    break;
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            LiveAllDataSingleActivity.this.y1();
            LiveAllDataSingleActivity.this.X0();
            LiveAllDataSingleActivity.this.Z0();
        }
    }

    public class h implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f25772b;

        public h(View view) {
            this.f25772b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25772b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25772b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25772b, "scaleY", f2);
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
                View view2 = this.f25772b;
                if (view2 == null || view2.getTag() == null || !this.f25772b.getTag().equals("1")) {
                    View view3 = this.f25772b;
                    if (view3 == null || view3.getTag() == null || !this.f25772b.getTag().equals("2")) {
                        View view4 = this.f25772b;
                        if (view4 == null || view4.getTag() == null || !this.f25772b.getTag().equals("3")) {
                            b(1.15f);
                            c(1.15f);
                            return;
                        }
                    } else {
                        resources = LiveAllDataSingleActivity.this.getResources();
                        i2 = R.color.hp_cyan_dark;
                    }
                }
                drawable = LiveAllDataSingleActivity.this.getResources().getDrawable(R.drawable.icon_shadow_cyan_focused);
                view.setBackground(drawable);
            }
            if (z) {
                return;
            }
            View view5 = this.f25772b;
            if (view5 == null || view5.getTag() == null || !this.f25772b.getTag().equals("1")) {
                View view6 = this.f25772b;
                if (view6 == null || view6.getTag() == null || !this.f25772b.getTag().equals("2")) {
                    View view7 = this.f25772b;
                    if (view7 == null || view7.getTag() == null || !this.f25772b.getTag().equals("3")) {
                        b(1.0f);
                        c(1.0f);
                        a(z);
                        return;
                    }
                } else {
                    resources = LiveAllDataSingleActivity.this.getResources();
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
    public class i extends AsyncTask<String, Void, Boolean> {
        public i() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return LiveAllDataSingleActivity.this.h1();
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            LiveAllDataSingleActivity.this.u1();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public static void W0(Activity activity) {
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

    public final void A1(Activity activity) {
        new d((LiveAllDataSingleActivity) activity, activity).show();
    }

    public final void B1() {
        this.f25736e = AnimationUtils.loadAnimation(this.f25735d, R.anim.cat_left_in);
        this.f25737f = AnimationUtils.loadAnimation(this.f25735d, R.anim.cat_left_out);
        this.f25738g = AnimationUtils.loadAnimation(this.f25735d, R.anim.fade_out_new);
        this.f25739h = AnimationUtils.loadAnimation(this.f25735d, R.anim.fade_in_new_2);
        this.f25740i = AnimationUtils.loadAnimation(this.f25735d, R.anim.bounce);
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
        LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = this.f25743l;
        if (liveAllDataRightSideAdapter != null) {
            return liveAllDataRightSideAdapter.A0();
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
            ArrayList<c.h.a.i.f> arrayList = this.B;
            if (arrayList == null || arrayList.size() <= 0) {
                p.b().j(null);
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = new LiveAllDataRightSideAdapter(this.f25735d, "live", this.L, this.M);
                this.f25743l = liveAllDataRightSideAdapter;
                this.recycler_view.setAdapter(liveAllDataRightSideAdapter);
                x1(getResources().getString(R.string.no_fav_channel_found));
                return;
            }
            p.b().j(this.B);
            LiveAllDataRightSideAdapter liveAllDataRightSideAdapter2 = new LiveAllDataRightSideAdapter(this.f25735d, "live", this.L, this.M);
            this.f25743l = liveAllDataRightSideAdapter2;
            this.recycler_view.setAdapter(liveAllDataRightSideAdapter2);
            RelativeLayout relativeLayout = this.rl_left;
            this.f25741j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.recycler_view.setLayoutManager(this.f25741j);
            w1();
        } catch (Exception unused) {
        }
    }

    public final void P0() {
        ImageView imageView = this.iv_close_sidebar;
        imageView.setOnFocusChangeListener(new h(imageView));
        RelativeLayout relativeLayout = this.rl_search_cat;
        relativeLayout.setOnFocusChangeListener(new h(relativeLayout));
        ImageView imageView2 = this.iv_hamburger_sidebar;
        imageView2.setOnFocusChangeListener(new h(imageView2));
    }

    public String Q0(String str) {
        c.h.a.i.q.f fVar;
        String str2;
        try {
            this.w = new ArrayList<>();
            this.f25745n = new ArrayList<>();
            this.x = new ArrayList<>();
            if (this.N.equals("true")) {
                fVar = this.p;
                str2 = "radio_streams";
            } else {
                fVar = this.p;
                str2 = "live";
            }
            this.y = fVar.W0(str, str2);
            return "get_all";
        } catch (Exception unused) {
            return "get_all";
        }
    }

    public String R0() {
        try {
            this.w = new ArrayList<>();
            this.f25745n = new ArrayList<>();
            this.x = new ArrayList<>();
            this.y = this.p.g1();
            return "get_recent_watch";
        } catch (Exception unused) {
            return "get_recent_watch";
        }
    }

    public String S0() {
        c.h.a.i.q.a aVar;
        Context context;
        try {
            String str = "live";
            if (m.f(this.f25735d).equals("m3u")) {
                new ArrayList();
                this.B.clear();
                ArrayList<c.h.a.i.c> arrayListB1 = this.p.B1("live");
                if (this.u != null) {
                    this.u = T0();
                }
                ArrayList<String> arrayList = this.u;
                if (arrayList != null && arrayList.size() > 0 && arrayListB1 != null && arrayListB1.size() > 0) {
                    arrayListB1 = V0(arrayListB1, this.u);
                }
                for (c.h.a.i.c cVar : arrayListB1) {
                    ArrayList<c.h.a.i.f> arrayListF1 = this.p.F1(cVar.a(), cVar.c());
                    if (arrayListF1 != null && arrayListF1.size() > 0) {
                        this.B.add(arrayListF1.get(0));
                    }
                }
                return "get_fav";
            }
            new ArrayList();
            this.B.clear();
            if (this.N.equals("true")) {
                aVar = this.v;
                str = "radio_streams";
                context = this.f25735d;
            } else {
                aVar = this.v;
                context = this.f25735d;
            }
            ArrayList<c.h.a.i.b> arrayListP = aVar.p(str, m.z(context));
            if (this.u != null) {
                this.u = T0();
            }
            ArrayList<String> arrayList2 = this.u;
            if (arrayList2 != null && arrayList2.size() > 0 && arrayListP != null && arrayListP.size() > 0) {
                arrayListP = U0(arrayListP, this.u);
            }
            for (c.h.a.i.b bVar : arrayListP) {
                c.h.a.i.f fVarD1 = this.p.D1(bVar.a(), String.valueOf(bVar.e()));
                if (fVarD1 != null) {
                    this.B.add(fVarD1);
                }
            }
            return "get_fav";
        } catch (Exception unused) {
            return "get_fav";
        }
    }

    public final ArrayList<String> T0() {
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.p.d1(m.z(this.f25735d));
        this.q = arrayListD1;
        if (arrayListD1 != null) {
            for (c.h.a.i.q.i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.u.add(iVar.b());
                }
            }
        }
        return this.u;
    }

    public final ArrayList<c.h.a.i.b> U0(ArrayList<c.h.a.i.b> arrayList, ArrayList<String> arrayList2) {
        this.z = new ArrayList<>();
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
                this.z.add(bVar);
            }
        }
        return this.z;
    }

    public final ArrayList<c.h.a.i.c> V0(ArrayList<c.h.a.i.c> arrayList, ArrayList<String> arrayList2) {
        this.A = new ArrayList<>();
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
                        this.A.add(cVar);
                    }
                }
            }
            return this.A;
        } catch (Exception unused) {
            return null;
        }
    }

    public void X0() {
        LinearLayout linearLayout = this.ll_series_data;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        this.ll_series_data.setVisibility(8);
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
            W0(this);
            this.rl_right.startAnimation(this.f25739h);
            this.rl_right.setVisibility(0);
            this.rl_left.startAnimation(this.f25737f);
            this.rl_left.setVisibility(8);
            this.iv_hamburger_sidebar.startAnimation(this.f25740i);
            this.iv_hamburger_sidebar.setVisibility(0);
            this.iv_back_button_2.setVisibility(0);
            this.iv_hamburger_sidebar.requestFocus();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f25735d, 7);
            this.f25741j = gridLayoutManager;
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

    public final void e1() {
        this.f25745n = new ArrayList<>();
        this.f25746o = new ArrayList<>();
        this.p = new c.h.a.i.q.f(this.f25735d);
        this.q = new ArrayList<>();
        this.s = new ArrayList<>();
        this.r = new ArrayList<>();
        this.f25742k = new LinearLayoutManager(this.f25735d);
        this.v = new c.h.a.i.q.a(this.f25735d);
        c.h.a.h.n.e.o(this.f25735d);
        this.y = new ArrayList<>();
        SharedPreferences sharedPreferences = getSharedPreferences("showhidemoviename", 0);
        this.D = sharedPreferences;
        this.E = sharedPreferences.edit();
        String stringExtra = getIntent().getStringExtra("RADIO");
        this.N = stringExtra;
        if (stringExtra == null) {
            this.N = "false";
        }
        this.p.G0();
        P0();
        B1();
        n1();
        o1();
        i1();
        c.h.a.h.n.e.J(this.f25735d);
    }

    public final boolean f1() {
        EditText editText = this.et_search_left_side;
        return editText != null && editText.getText().toString().length() > 0;
    }

    public boolean g1() {
        EditText editText = this.et_search_left_side;
        if (editText != null) {
            return editText.isFocused();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009a A[Catch: Exception -> 0x013d, NullPointerException -> 0x0140, TryCatch #2 {NullPointerException -> 0x0140, Exception -> 0x013d, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000a, B:8:0x000d, B:11:0x0031, B:12:0x0039, B:17:0x0062, B:19:0x009a, B:22:0x00a6, B:23:0x00bd, B:35:0x0115, B:24:0x00c5, B:27:0x00cf, B:30:0x00dd, B:31:0x00f3, B:34:0x00ff, B:13:0x0040, B:15:0x0048, B:16:0x0059, B:36:0x013a), top: B:42:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5 A[Catch: Exception -> 0x013d, NullPointerException -> 0x0140, TRY_LEAVE, TryCatch #2 {NullPointerException -> 0x0140, Exception -> 0x013d, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000a, B:8:0x000d, B:11:0x0031, B:12:0x0039, B:17:0x0062, B:19:0x009a, B:22:0x00a6, B:23:0x00bd, B:35:0x0115, B:24:0x00c5, B:27:0x00cf, B:30:0x00dd, B:31:0x00f3, B:34:0x00ff, B:13:0x0040, B:15:0x0048, B:16:0x0059, B:36:0x013a), top: B:42:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean h1() {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity.h1():java.lang.Boolean");
    }

    public void i1() {
        new i().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public void j1(String str, String str2) {
        AsyncTask<String, Void, String> asyncTaskExecuteOnExecutor;
        ArrayList<c.h.a.i.f> arrayListD;
        this.I = str;
        this.J = str2;
        t1(str2);
        s1(str);
        try {
            SearchView searchView = this.H;
            if (searchView != null && this.G != null) {
                searchView.d0(BuildConfig.FLAVOR, false);
                this.G.collapseActionView();
            }
        } catch (Exception unused) {
        }
        try {
            if (this.F != null) {
                if (this.I.equals("-5") || this.I.equals("-4") || this.I.equals("-6")) {
                    this.F.getItem(1).getSubMenu().findItem(R.id.menu_sort).setVisible(false);
                } else {
                    this.F.getItem(1).getSubMenu().findItem(R.id.menu_sort).setVisible(true);
                }
                if (!this.I.equals("-6") || (arrayListD = p.b().d()) == null || arrayListD.size() <= 0) {
                    MenuItem menuItemFindItem = this.F.getItem(1).getSubMenu().findItem(R.id.nav_delete_all);
                    menuItemFindItem.setVisible(false);
                } else {
                    this.F.getItem(1).getSubMenu().findItem(R.id.nav_delete_all).setVisible(true);
                }
            }
        } catch (Exception unused2) {
        }
        str.hashCode();
        switch (str) {
            case "-1":
                asyncTaskExecuteOnExecutor = new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
                break;
            case "-4":
                asyncTaskExecuteOnExecutor = new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_watch");
                break;
            case "-5":
                asyncTaskExecuteOnExecutor = new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_added", str);
                break;
            case "-6":
                asyncTaskExecuteOnExecutor = new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recently_watched", str);
                break;
            default:
                asyncTaskExecuteOnExecutor = new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_all", str);
                break;
        }
        c.h.a.h.n.e.f17065g = asyncTaskExecuteOnExecutor;
    }

    public void k1() {
        LinearLayout linearLayout = this.ll_no_cat_found;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    public void l1() {
        l lVar = this.f25744m;
        if (lVar != null) {
            lVar.w();
        }
    }

    public void m1() {
        LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = this.f25743l;
        if (liveAllDataRightSideAdapter != null) {
            liveAllDataRightSideAdapter.w();
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
        if (f1()) {
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
                this.K = -1;
                z1();
                break;
            case R.id.logo /* 2131428520 */:
                c.h.a.h.n.e.b(this.f25735d);
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
        this.f25735d = this;
        setContentView(R.layout.activity_series_all_data_single);
        ButterKnife.a(this);
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            v0(toolbar);
        }
        e1();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        ArrayList<c.h.a.i.f> arrayListD;
        super.onCreateOptionsMenu(menu);
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            toolbar.x(R.menu.menu_series_all_data_single_page);
            SharedPreferences sharedPreferences = this.D;
            if (sharedPreferences != null) {
                if (sharedPreferences.getInt("livestream", 1) == 1) {
                    menu.getItem(1).getSubMenu().findItem(R.id.layout_view_show_channel_name).setVisible(false);
                    menu.getItem(1).getSubMenu().findItem(R.id.layout_view_hide_channel_name).setVisible(true);
                } else {
                    menu.getItem(1).getSubMenu().findItem(R.id.layout_view_show_channel_name).setVisible(true);
                    menu.getItem(1).getSubMenu().findItem(R.id.layout_view_hide_channel_name).setVisible(false);
                }
            }
            this.F = menu;
            TextView textView = this.tv_main_cat_name;
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (this.I.equals("-5") || this.I.equals("-4") || this.I.equals("-6")) {
                this.F.getItem(1).getSubMenu().findItem(R.id.menu_sort).setVisible(false);
            } else {
                this.F.getItem(1).getSubMenu().findItem(R.id.menu_sort).setVisible(true);
            }
            if (!this.I.equals("-6") || (arrayListD = p.b().d()) == null || arrayListD.size() <= 0) {
                this.F.getItem(1).getSubMenu().findItem(R.id.nav_delete_all).setVisible(false);
            } else {
                this.F.getItem(1).getSubMenu().findItem(R.id.nav_delete_all).setVisible(true);
            }
            boolean zEquals = m.f(this.f25735d).equals("m3u");
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
        AsyncTask asyncTask = c.h.a.h.n.e.f17065g;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        c.h.a.h.n.e.f17065g.cancel(true);
    }

    @Override // a.b.k.c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        LiveAllDataRightSideAdapter liveAllDataRightSideAdapter;
        if (i2 != 21) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (this.rl_left.getVisibility() != 8 || (liveAllDataRightSideAdapter = this.f25743l) == null) {
            return false;
        }
        int iB0 = liveAllDataRightSideAdapter.B0();
        this.K = iB0;
        if (iB0 % 7 != 0) {
            return false;
        }
        z1();
        return false;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        this.G = menuItem;
        this.toolbar.e();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_search) {
            try {
                SearchView searchView = (SearchView) menuItem.getActionView();
                this.H = searchView;
                if (searchView != null) {
                    searchView.setQueryHint(getResources().getString(R.string.search_channel));
                    this.H.setIconifiedByDefault(false);
                    ImageView imageView = (ImageView) this.H.findViewById(R.id.search_close_btn);
                    ((ImageView) this.H.findViewById(R.id.search_go_btn)).setImageResource(R.drawable.menu_close_selector);
                    imageView.setImageResource(R.drawable.menu_close_selector);
                    imageView.setPadding(15, 15, 15, 15);
                    imageView.setBackground(null);
                    this.H.setOnQueryTextListener(new c());
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        if (itemId == R.id.menu_sort) {
            A1(this);
        }
        if (itemId == R.id.layout_view_show_channel_name) {
            SharedPreferences.Editor editor = this.E;
            if (editor != null) {
                editor.putInt("livestream", 1);
                this.E.commit();
            }
            Menu menu = this.F;
            if (menu != null) {
                menu.getItem(1).getSubMenu().findItem(R.id.layout_view_show_channel_name).setVisible(false);
                this.F.getItem(1).getSubMenu().findItem(R.id.layout_view_hide_channel_name).setVisible(true);
            }
            m1();
        }
        if (itemId == R.id.layout_view_hide_channel_name) {
            SharedPreferences.Editor editor2 = this.E;
            if (editor2 != null) {
                editor2.putInt("livestream", 0);
                this.E.commit();
            }
            Menu menu2 = this.F;
            if (menu2 != null) {
                menu2.getItem(1).getSubMenu().findItem(R.id.layout_view_show_channel_name).setVisible(true);
                this.F.getItem(1).getSubMenu().findItem(R.id.layout_view_hide_channel_name).setVisible(false);
            }
            m1();
        }
        if (itemId == R.id.menu_load_channels_vod1) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f25735d.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f25735d.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f25735d.getResources().getString(R.string.yes), new e());
            aVar.g(this.f25735d.getResources().getString(R.string.no), new f());
            aVar.n();
        }
        if (itemId == R.id.nav_delete_all && p.b().d() != null && p.b().d().size() > 0) {
            v1();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        d1();
        super.onResume();
        l1();
        if (this.I.equals("-4")) {
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
        LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = this.f25743l;
        if (liveAllDataRightSideAdapter != null) {
            liveAllDataRightSideAdapter.G0();
        }
    }

    public void q1() {
        c.h.a.h.n.e.f17065g = new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_watch", "-4");
    }

    public void r1() {
        c.h.a.h.n.e.f17065g = new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recently_watched", "-6");
    }

    public final void s1(String str) {
        this.M = str;
        l lVar = this.f25744m;
        if (lVar != null) {
            lVar.q0(str);
        }
    }

    public void t1(String str) {
        this.L = str;
        TextView textView = this.tv_main_cat_name;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void u1() {
        ArrayList<c.h.a.i.e> arrayList = this.r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList<c.h.a.i.e> arrayList2 = this.s;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ArrayList<c.h.a.i.e> arrayList3 = new ArrayList<>();
        this.s = arrayList3;
        arrayList3.addAll(this.r);
        ArrayList<c.h.a.i.e> arrayList4 = this.r;
        String str = "0";
        if (arrayList4 == null || arrayList4.size() < 4) {
            j1("0", this.f25735d.getResources().getString(R.string.all));
        } else {
            String strB = this.r.get(3).b();
            j1(strB, this.r.get(3).c());
            str = strB;
        }
        ArrayList<c.h.a.i.e> arrayList5 = this.s;
        if (arrayList5 != null && arrayList5.size() > 0) {
            p.b().i(this.s);
        }
        l lVar = new l(this.f25735d, this.N, str);
        this.f25744m = lVar;
        this.recycler_view_left_sidebar.setAdapter(lVar);
        this.recycler_view_left_sidebar.setLayoutManager(this.f25742k);
    }

    public final void v1() {
        try {
            new b(this).show();
        } catch (Exception unused) {
        }
    }

    public void w1() {
        LinearLayout linearLayout = this.ll_series_data;
        if (linearLayout == null || linearLayout.getVisibility() != 8) {
            return;
        }
        this.ll_series_data.setVisibility(0);
    }

    public void x1(String str) {
        TextView textView = this.tv_no_record_found;
        if (textView != null) {
            textView.setText(str);
            this.tv_no_record_found.setVisibility(0);
        }
    }

    public void y0() {
        try {
            ArrayList<c.h.a.i.f> arrayList = this.y;
            if (arrayList == null || arrayList.size() <= 0) {
                p.b().j(null);
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = new LiveAllDataRightSideAdapter(this.f25735d, "live", this.L, this.M);
                this.f25743l = liveAllDataRightSideAdapter;
                this.recycler_view.setAdapter(liveAllDataRightSideAdapter);
                x1(getResources().getString(R.string.no_channel_found));
                return;
            }
            p.b().j(this.y);
            LiveAllDataRightSideAdapter liveAllDataRightSideAdapter2 = new LiveAllDataRightSideAdapter(this.f25735d, "live", this.L, this.M);
            this.f25743l = liveAllDataRightSideAdapter2;
            this.recycler_view.setAdapter(liveAllDataRightSideAdapter2);
            RelativeLayout relativeLayout = this.rl_left;
            this.f25741j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.recycler_view.setLayoutManager(this.f25741j);
            w1();
        } catch (Exception unused) {
        }
    }

    public final void y1() {
        LinearLayout linearLayout = this.ll_loader;
        if (linearLayout == null || linearLayout.getVisibility() != 8) {
            return;
        }
        this.ll_loader.setVisibility(0);
    }

    public final void z0() {
        try {
            ArrayList<c.h.a.i.f> arrayList = this.y;
            if (arrayList == null || arrayList.size() <= 0) {
                p.b().j(null);
                Menu menu = this.F;
                if (menu != null) {
                    menu.getItem(1).getSubMenu().findItem(R.id.nav_delete_all).setVisible(false);
                }
                LiveAllDataRightSideAdapter liveAllDataRightSideAdapter = new LiveAllDataRightSideAdapter(this.f25735d, "live", this.L, this.M);
                this.f25743l = liveAllDataRightSideAdapter;
                this.recycler_view.setAdapter(liveAllDataRightSideAdapter);
                x1(getResources().getString(R.string.no_channel_found));
                return;
            }
            p.b().j(this.y);
            Menu menu2 = this.F;
            if (menu2 != null) {
                menu2.getItem(1).getSubMenu().findItem(R.id.nav_delete_all).setVisible(true);
            }
            LiveAllDataRightSideAdapter liveAllDataRightSideAdapter2 = new LiveAllDataRightSideAdapter(this.f25735d, "live", this.L, this.M);
            this.f25743l = liveAllDataRightSideAdapter2;
            this.recycler_view.setAdapter(liveAllDataRightSideAdapter2);
            RelativeLayout relativeLayout = this.rl_left;
            this.f25741j = (relativeLayout == null || relativeLayout.getVisibility() != 8) ? new GridLayoutManager(this, 5) : new GridLayoutManager(this, 7);
            this.recycler_view.setLayoutManager(this.f25741j);
            w1();
        } catch (Exception unused) {
        }
    }

    public final void z1() {
        if (this.rl_left.getVisibility() == 8) {
            this.iv_hamburger_sidebar.setVisibility(8);
            this.iv_back_button_2.setVisibility(8);
            this.iv_close_sidebar.startAnimation(this.f25740i);
            this.iv_close_sidebar.setVisibility(0);
            this.iv_close_sidebar.requestFocus();
            this.rl_left.startAnimation(this.f25736e);
            this.rl_left.setVisibility(0);
            this.rl_right.startAnimation(this.f25738g);
            this.rl_right.setVisibility(0);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f25735d, 5);
            this.f25741j = gridLayoutManager;
            this.recycler_view.setLayoutManager(gridLayoutManager);
            if (this.f25743l != null) {
                this.recycler_view.n1(this.K);
                this.K = -1;
            }
        }
    }
}
