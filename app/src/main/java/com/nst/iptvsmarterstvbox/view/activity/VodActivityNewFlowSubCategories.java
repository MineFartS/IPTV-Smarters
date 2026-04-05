package com.nst.iptvsmarterstvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import c.h.a.h.n.e;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.adapter.VodAdapter;
import com.nst.iptvsmarterstvbox.view.adapter.VodAdapterNewFlow;
import com.nst.iptvsmarterstvbox.view.adapter.VodSubCatAdpaterNew;
import java.util.ArrayList;
import java.util.Iterator;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class VodActivityNewFlowSubCategories extends a.b.k.c implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList<c.h.a.i.e> f27104d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ArrayList<c.h.a.i.e> f27105e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static ArrayList<c.h.a.i.e> f27106f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static ProgressBar f27107g;
    public VodSubCatAdpaterNew A;
    public SharedPreferences B;
    public SharedPreferences.Editor C;
    public SharedPreferences D;
    public SharedPreferences.Editor E;
    public RecyclerView.p F;
    public SharedPreferences G;
    public VodAdapter H;
    public c.h.a.i.q.a J;
    public VodAdapterNewFlow K;
    public PopupWindow M;
    public SharedPreferences N;
    public SharedPreferences.Editor O;
    public GridLayoutManager P;
    public Handler Q;
    public MenuItem R;
    public Menu S;
    public c.h.a.i.q.k T;

    @BindView
    public AppBarLayout appbarToolbar;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f27108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SharedPreferences f27109i;

    @BindView
    public ImageView iv_back_button;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<c.h.a.i.q.i> f27111k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f27112l;

    @BindView
    public ImageView logo;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f27113m;

    @BindView
    public RecyclerView myRecyclerView;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f27114n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<c.h.a.i.b> f27115o;
    public ArrayList<c.h.a.i.c> p;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public RelativeLayout rl_sub_cat;
    public c.h.a.i.q.f t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    @BindView
    public TextView tvViewProvider;
    public SearchView v;

    @BindView
    public TextView vodCategoryName;
    public ProgressDialog w;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<String> f27110j = new ArrayList<>();
    public String q = BuildConfig.FLAVOR;
    public String r = BuildConfig.FLAVOR;
    public c.h.a.i.q.b s = new c.h.a.i.q.b();
    public c.h.a.i.q.b u = new c.h.a.i.q.b();
    public String x = BuildConfig.FLAVOR;
    public String y = BuildConfig.FLAVOR;
    public boolean z = false;
    public ArrayList<c.h.a.i.f> I = new ArrayList<>();
    public boolean L = false;
    public boolean U = true;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodActivityNewFlowSubCategories.this.M.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.h.a.i.q.m.f(VodActivityNewFlowSubCategories.this.f27108h).equals("m3u")) {
                VodActivityNewFlowSubCategories.this.t.B0("movie", c.h.a.i.q.m.z(VodActivityNewFlowSubCategories.this.f27108h));
            } else {
                new r(VodActivityNewFlowSubCategories.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
            VodActivityNewFlowSubCategories.this.M.dismiss();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodActivityNewFlowSubCategories.this.M.dismiss();
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f27120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f27121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f27122d;

        public e(RadioGroup radioGroup, View view, Activity activity) {
            this.f27120b = radioGroup;
            this.f27121c = view;
            this.f27122d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activity;
            String str;
            RadioButton radioButton = (RadioButton) this.f27121c.findViewById(this.f27120b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(VodActivityNewFlowSubCategories.this.getResources().getString(R.string.sort_last_added))) {
                activity = this.f27122d;
                str = "1";
            } else if (radioButton.getText().toString().equals(VodActivityNewFlowSubCategories.this.getResources().getString(R.string.sort_atoz))) {
                activity = this.f27122d;
                str = "2";
            } else if (radioButton.getText().toString().equals(VodActivityNewFlowSubCategories.this.getResources().getString(R.string.sort_ztoa))) {
                activity = this.f27122d;
                str = "3";
            } else {
                activity = this.f27122d;
                str = "0";
            }
            c.h.a.i.q.m.j0(str, activity);
            VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories = VodActivityNewFlowSubCategories.this;
            vodActivityNewFlowSubCategories.B = vodActivityNewFlowSubCategories.getSharedPreferences("listgridview", 0);
            VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories2 = VodActivityNewFlowSubCategories.this;
            vodActivityNewFlowSubCategories2.C = vodActivityNewFlowSubCategories2.B.edit();
            int i2 = VodActivityNewFlowSubCategories.this.B.getInt("vod", 0);
            c.h.a.h.n.a.v = i2;
            if (i2 == 1) {
                VodActivityNewFlowSubCategories.this.b1();
            } else {
                VodActivityNewFlowSubCategories.this.a1();
            }
            VodActivityNewFlowSubCategories.this.M.dismiss();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodActivityNewFlowSubCategories.this.M.dismiss();
        }
    }

    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c.h.a.i.q.k f27125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f27126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f27127d;

        public g(c.h.a.i.q.k kVar, int i2, Context context) {
            this.f27125b = kVar;
            this.f27126c = i2;
            this.f27127d = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.i.q.k kVar = this.f27125b;
            if (kVar != null) {
                kVar.p(this.f27126c, "movie");
            }
            Toast.makeText(this.f27127d, VodActivityNewFlowSubCategories.this.getResources().getString(R.string.movie_deleted_successfully), 0).show();
            if (VodActivityNewFlowSubCategories.this.H != null) {
                VodActivityNewFlowSubCategories.this.f1();
                VodActivityNewFlowSubCategories.this.M.dismiss();
            }
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(VodActivityNewFlowSubCategories.this.f27108h);
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodActivityNewFlowSubCategories.this.onBackPressed();
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class k implements DialogInterface.OnClickListener {
        public k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(VodActivityNewFlowSubCategories.this.f27108h);
        }
    }

    public class l implements SearchView.l {
        public l() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            VodActivityNewFlowSubCategories.this.tvNoRecordFound.setVisibility(8);
            if (VodActivityNewFlowSubCategories.this.A == null || (textView = VodActivityNewFlowSubCategories.this.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            VodActivityNewFlowSubCategories.this.A.p0(str, VodActivityNewFlowSubCategories.this.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class m implements SearchView.l {
        public m() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            VodActivityNewFlowSubCategories.this.tvNoRecordFound.setVisibility(8);
            if (VodActivityNewFlowSubCategories.this.H == null || (textView = VodActivityNewFlowSubCategories.this.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            VodActivityNewFlowSubCategories.this.H.t0(str, VodActivityNewFlowSubCategories.this.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class n implements DialogInterface.OnClickListener {
        public n() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(VodActivityNewFlowSubCategories.this.f27108h);
        }
    }

    public class o implements DialogInterface.OnClickListener {
        public o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class p implements DialogInterface.OnClickListener {
        public p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class q extends AsyncTask<String, Void, String> {
        public q() {
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
                r1 = r8[r0]     // Catch: java.lang.Exception -> L5f
                r2 = -1
                int r3 = r1.hashCode()     // Catch: java.lang.Exception -> L5f
                r4 = 3
                r5 = 2
                r6 = 1
                switch(r3) {
                    case -998452030: goto L2d;
                    case -723794989: goto L23;
                    case -74801864: goto L19;
                    case -74797390: goto Lf;
                    default: goto Le;
                }     // Catch: java.lang.Exception -> L5f
            Le:
                goto L36
            Lf:
                java.lang.String r0 = "get_fav"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L5f
                if (r0 == 0) goto L36
                r0 = 1
                goto L37
            L19:
                java.lang.String r0 = "get_all"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L5f
                if (r0 == 0) goto L36
                r0 = 2
                goto L37
            L23:
                java.lang.String r0 = "get_recent_watched"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L5f
                if (r0 == 0) goto L36
                r0 = 3
                goto L37
            L2d:
                java.lang.String r3 = "get_fav_m3u"
                boolean r1 = r1.equals(r3)     // Catch: java.lang.Exception -> L5f
                if (r1 == 0) goto L36
                goto L37
            L36:
                r0 = -1
            L37:
                if (r0 == 0) goto L58
                if (r0 == r6) goto L51
                if (r0 == r5) goto L48
                if (r0 == r4) goto L41
                r8 = 0
                return r8
            L41:
                com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories r8 = com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories.this     // Catch: java.lang.Exception -> L5f
                java.lang.String r8 = r8.V0()     // Catch: java.lang.Exception -> L5f
                return r8
            L48:
                com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories r0 = com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories.this     // Catch: java.lang.Exception -> L5f
                r8 = r8[r6]     // Catch: java.lang.Exception -> L5f
                java.lang.String r8 = r0.Q0(r8)     // Catch: java.lang.Exception -> L5f
                return r8
            L51:
                com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories r8 = com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories.this     // Catch: java.lang.Exception -> L5f
                java.lang.String r8 = r8.S0()     // Catch: java.lang.Exception -> L5f
                return r8
            L58:
                com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories r8 = com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories.this     // Catch: java.lang.Exception -> L5f
                java.lang.String r8 = r8.T0()     // Catch: java.lang.Exception -> L5f
                return r8
            L5f:
                java.lang.String r8 = "error"
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories.q.doInBackground(java.lang.String[]):java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            str.hashCode();
            switch (str) {
                case "get_fav_m3u":
                    VodActivityNewFlowSubCategories.this.P0();
                    break;
                case "get_recent_watched":
                    VodActivityNewFlowSubCategories.this.e1();
                    break;
                case "get_all":
                    VodActivityNewFlowSubCategories.this.y0();
                    break;
                case "get_fav":
                    VodActivityNewFlowSubCategories.this.O0();
                    break;
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class r extends AsyncTask<Void, Void, Boolean> {
        public r() {
        }

        public /* synthetic */ r(VodActivityNewFlowSubCategories vodActivityNewFlowSubCategories, h hVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                return VodActivityNewFlowSubCategories.this.M0();
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            ProgressBar progressBar = VodActivityNewFlowSubCategories.this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            if (bool.booleanValue()) {
                Toast.makeText(VodActivityNewFlowSubCategories.this.f27108h, VodActivityNewFlowSubCategories.this.getResources().getString(R.string.all_movies_deleted_successfully), 0).show();
                VodActivityNewFlowSubCategories.this.a1();
            } else {
                VodActivityNewFlowSubCategories.this.f27114n.clear();
                VodActivityNewFlowSubCategories.this.H.w();
                VodActivityNewFlowSubCategories.this.myRecyclerView.setVisibility(8);
                VodActivityNewFlowSubCategories.this.tvNoRecordFound.setVisibility(0);
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            ProgressBar progressBar = VodActivityNewFlowSubCategories.this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    public class s implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f27140b;

        public s(View view) {
            this.f27140b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27140b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27140b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27140b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            View view2;
            int i2;
            if (!z) {
                if (z) {
                    return;
                }
                a(z);
                if ((this.f27140b.getTag() == null || !this.f27140b.getTag().equals("1")) && (this.f27140b.getTag() == null || !this.f27140b.getTag().equals("2"))) {
                    b(1.0f);
                    c(1.0f);
                    return;
                } else {
                    b(1.0f);
                    c(1.0f);
                    this.f27140b.setBackgroundResource(R.drawable.black_button_dark);
                    return;
                }
            }
            if (this.f27140b.getTag() != null && this.f27140b.getTag().equals("1")) {
                b(1.15f);
                c(1.15f);
                view2 = this.f27140b;
                i2 = R.drawable.back_btn_effect;
            } else {
                if (this.f27140b.getTag() == null || !this.f27140b.getTag().equals("2")) {
                    b(1.15f);
                    return;
                }
                b(1.15f);
                c(1.15f);
                view2 = this.f27140b;
                i2 = R.drawable.logout_btn_effect;
            }
            view2.setBackgroundResource(i2);
        }
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

    public Boolean M0() {
        ArrayList<c.h.a.i.f> arrayList = this.f27114n;
        if (arrayList == null || arrayList.size() <= 0) {
            return Boolean.FALSE;
        }
        for (int i2 = 0; i2 < this.f27114n.size(); i2++) {
            this.T.p(c.h.a.h.n.e.S(this.f27114n.get(i2).Y()), "movie");
        }
        return Boolean.TRUE;
    }

    public void N0(int i2, String str, Context context, c.h.a.i.q.k kVar) {
        try {
            View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.delete_recording_popup, (RelativeLayout) findViewById(R.id.rl_password_verification));
            PopupWindow popupWindow = new PopupWindow(this);
            this.M = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.M.setWidth(-1);
            this.M.setHeight(-1);
            this.M.setFocusable(true);
            this.M.showAtLocation(viewInflate, 17, 0, 0);
            ((TextView) viewInflate.findViewById(R.id.tv_delete_recording)).setText(getResources().getString(R.string.delete_this_recent_movies));
            Button button = (Button) viewInflate.findViewById(R.id.bt_start_recording);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            if (button != null) {
                button.setOnFocusChangeListener(new s(button));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new s(button2));
            }
            button2.setOnClickListener(new f());
            if (button != null) {
                button.setOnClickListener(new g(kVar, i2, context));
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void O0() {
        ArrayList<c.h.a.i.f> arrayList;
        ArrayList<c.h.a.i.f> arrayList2;
        if (this.myRecyclerView != null && (arrayList2 = this.I) != null && arrayList2.size() != 0) {
            this.H = new VodAdapter(this.I, this.f27108h, true);
            c.h.a.i.p.b().m(this.I);
            this.myRecyclerView.setAdapter(this.H);
            c.h.a.h.n.e.m0(this.f27108h, getResources().getString(R.string.use_long_press));
            this.tvNoStream.setVisibility(4);
        }
        if (this.tvNoStream != null && (arrayList = this.I) != null && arrayList.size() == 0) {
            RecyclerView recyclerView = this.myRecyclerView;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.H);
            }
            this.tvNoStream.setText(getResources().getString(R.string.no_fav_vod_found));
            this.tvNoStream.setVisibility(0);
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public void P0() {
        ArrayList<c.h.a.i.f> arrayList;
        ArrayList<c.h.a.i.f> arrayList2;
        if (this.myRecyclerView != null && (arrayList2 = this.I) != null && arrayList2.size() != 0) {
            this.H = new VodAdapter(this.I, this.f27108h, true);
            c.h.a.i.p.b().m(this.I);
            this.myRecyclerView.setAdapter(this.H);
            c.h.a.h.n.e.m0(this.f27108h, getResources().getString(R.string.use_long_press));
            this.tvNoStream.setVisibility(4);
        }
        if (this.tvNoStream != null && (arrayList = this.I) != null && arrayList.size() == 0) {
            RecyclerView recyclerView = this.myRecyclerView;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.H);
            }
            this.tvNoStream.setText(getResources().getString(R.string.no_fav_vod_found));
            this.tvNoStream.setVisibility(0);
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public String Q0(String str) {
        this.f27111k = new ArrayList<>();
        this.f27112l = new ArrayList<>();
        this.f27113m = new ArrayList<>();
        this.f27114n = new ArrayList<>();
        this.f27114n = this.t.W0(str, "movie");
        return "get_all";
    }

    public void R0() {
        RecyclerView recyclerView;
        a.y.e.c cVar;
        try {
            a();
            SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
            this.B = sharedPreferences;
            this.C = sharedPreferences.edit();
            int i2 = this.B.getInt("vod", 0);
            c.h.a.h.n.a.v = i2;
            if (i2 == 1) {
                this.f27108h = this;
                this.t = new c.h.a.i.q.f(this.f27108h);
                RecyclerView recyclerView2 = this.myRecyclerView;
                if (recyclerView2 != null && this.f27108h != null) {
                    recyclerView2.setHasFixedSize(true);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f27108h);
                    this.F = linearLayoutManager;
                    this.myRecyclerView.setLayoutManager(linearLayoutManager);
                    recyclerView = this.myRecyclerView;
                    cVar = new a.y.e.c();
                    recyclerView.setItemAnimator(cVar);
                }
            } else {
                this.f27108h = this;
                this.t = new c.h.a.i.q.f(this.f27108h);
                RecyclerView recyclerView3 = this.myRecyclerView;
                if (recyclerView3 != null && this.f27108h != null) {
                    recyclerView3.setHasFixedSize(true);
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f27108h, 7);
                    this.F = gridLayoutManager;
                    this.myRecyclerView.setLayoutManager(gridLayoutManager);
                    recyclerView = this.myRecyclerView;
                    cVar = new a.y.e.c();
                    recyclerView.setItemAnimator(cVar);
                }
            }
            if (this.f27108h != null) {
                c.h.a.i.q.f fVar = new c.h.a.i.q.f(this.f27108h);
                ArrayList<c.h.a.i.f> arrayListW0 = fVar.W0("0", "movie");
                this.f27111k = new ArrayList<>();
                this.f27112l = new ArrayList<>();
                this.f27113m = new ArrayList<>();
                this.f27114n = new ArrayList<>();
                if (fVar.I1(c.h.a.i.q.m.z(this.f27108h)) <= 0 || arrayListW0 == null) {
                    this.f27114n = arrayListW0;
                } else {
                    ArrayList<String> arrayListU0 = U0();
                    this.f27110j = arrayListU0;
                    if (arrayListU0 != null) {
                        this.f27113m = W0(arrayListW0, arrayListU0);
                    }
                    this.f27114n = this.f27113m;
                }
                b();
                ProgressBar progressBar = this.pbLoader;
                if (progressBar != null) {
                    progressBar.setVisibility(4);
                }
                ArrayList<c.h.a.i.f> arrayList = this.f27114n;
                if (arrayList == null || this.myRecyclerView == null || arrayList.size() == 0) {
                    ProgressDialog progressDialog = this.w;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    TextView textView = this.tvNoStream;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    ProgressBar progressBar2 = this.pbLoader;
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(4);
                    }
                } else {
                    ProgressDialog progressDialog2 = this.w;
                    if (progressDialog2 != null) {
                        progressDialog2.dismiss();
                    }
                    VodAdapter vodAdapter = new VodAdapter(arrayListW0, this.f27108h, true);
                    this.H = vodAdapter;
                    this.myRecyclerView.setAdapter(vodAdapter);
                }
            }
            ProgressDialog progressDialog3 = this.w;
            if (progressDialog3 != null) {
                progressDialog3.dismiss();
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public String S0() {
        new ArrayList();
        this.I.clear();
        c.h.a.i.q.a aVar = new c.h.a.i.q.a(this.f27108h);
        this.J = aVar;
        ArrayList<c.h.a.i.b> arrayListP = aVar.p("vod", c.h.a.i.q.m.z(this.f27108h));
        if (this.f27110j != null) {
            this.f27110j = U0();
        }
        ArrayList<String> arrayList = this.f27110j;
        if (arrayList != null && arrayList.size() > 0 && arrayListP != null && arrayListP.size() > 0) {
            arrayListP = X0(arrayListP, this.f27110j);
        }
        for (c.h.a.i.b bVar : arrayListP) {
            c.h.a.i.f fVarD1 = new c.h.a.i.q.f(this.f27108h).D1(bVar.a(), String.valueOf(bVar.e()));
            if (fVarD1 != null) {
                this.I.add(fVarD1);
            }
        }
        return "get_fav";
    }

    public String T0() {
        new ArrayList();
        this.I.clear();
        ArrayList<c.h.a.i.c> arrayListB1 = this.t.B1("movie");
        if (this.f27110j != null) {
            this.f27110j = U0();
        }
        ArrayList<String> arrayList = this.f27110j;
        if (arrayList != null && arrayList.size() > 0 && arrayListB1 != null && arrayListB1.size() > 0) {
            arrayListB1 = Y0(arrayListB1, this.f27110j);
        }
        for (c.h.a.i.c cVar : arrayListB1) {
            ArrayList<c.h.a.i.f> arrayListF1 = this.t.F1(cVar.a(), cVar.c());
            if (arrayListF1 != null && arrayListF1.size() > 0) {
                this.I.add(arrayListF1.get(0));
            }
        }
        return "get_fav_m3u";
    }

    public final ArrayList<String> U0() {
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.t.d1(c.h.a.i.q.m.z(this.f27108h));
        this.f27111k = arrayListD1;
        if (arrayListD1 != null) {
            for (c.h.a.i.q.i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.f27110j.add(iVar.b());
                }
            }
        }
        return this.f27110j;
    }

    public String V0() {
        this.f27111k = new ArrayList<>();
        this.f27112l = new ArrayList<>();
        this.f27113m = new ArrayList<>();
        this.f27114n = new ArrayList<>();
        ArrayList<c.h.a.i.f> arrayListV0 = c.h.a.i.q.m.f(this.f27108h).equals("m3u") ? this.t.V0("movie", c.h.a.i.q.m.z(this.f27108h), "getalldata") : this.T.q("movie", c.h.a.i.q.m.z(this.f27108h), "getalldata");
        if (this.t.I1(c.h.a.i.q.m.z(this.f27108h)) > 0 && arrayListV0 != null) {
            ArrayList<String> arrayListU0 = U0();
            this.f27110j = arrayListU0;
            if (arrayListU0 != null) {
                this.f27113m = W0(arrayListV0, arrayListU0);
            }
            arrayListV0 = this.f27113m;
        }
        this.f27114n = arrayListV0;
        return "get_recent_watched";
    }

    public final ArrayList<c.h.a.i.f> W0(ArrayList<c.h.a.i.f> arrayList, ArrayList<String> arrayList2) {
        for (c.h.a.i.f fVar : arrayList) {
            boolean z = false;
            Iterator<String> it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (fVar.g().equals(it.next())) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                this.f27112l.add(fVar);
                fVar.g();
            }
        }
        return this.f27112l;
    }

    public final ArrayList<c.h.a.i.b> X0(ArrayList<c.h.a.i.b> arrayList, ArrayList<String> arrayList2) {
        this.f27115o = new ArrayList<>();
        if (arrayList == null) {
            return null;
        }
        for (c.h.a.i.b bVar : arrayList) {
            boolean z = false;
            if (arrayList2 != null) {
                Iterator<String> it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (bVar.a().equals(it.next())) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    this.f27115o.add(bVar);
                }
            }
        }
        return this.f27115o;
    }

    public final ArrayList<c.h.a.i.c> Y0(ArrayList<c.h.a.i.c> arrayList, ArrayList<String> arrayList2) {
        this.p = new ArrayList<>();
        if (arrayList == null) {
            return null;
        }
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
                    this.p.add(cVar);
                }
            }
        }
        return this.p;
    }

    public void Z0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public void a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    public final void a1() {
        this.f27108h = this;
        this.t = new c.h.a.i.q.f(this.f27108h);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f27108h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f27108h, 7);
        this.F = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        this.G = this.f27108h.getSharedPreferences("loginPrefs", 0);
        h1();
    }

    public void b() {
    }

    public final void b1() {
        this.f27108h = this;
        this.t = new c.h.a.i.q.f(this.f27108h);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f27108h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f27108h);
        this.F = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        this.G = this.f27108h.getSharedPreferences("loginPrefs", 0);
        h1();
    }

    public final void d1(ArrayList<c.h.a.i.e> arrayList) {
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f27108h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        this.P = new c.h.a.k.d.a.a(this.f27108h).A().equals(c.h.a.h.n.a.s0) ? new GridLayoutManager(this, 2) : new GridLayoutManager(this, 2);
        this.myRecyclerView.setLayoutManager(this.P);
        this.myRecyclerView.setHasFixedSize(true);
        b();
        VodSubCatAdpaterNew vodSubCatAdpaterNew = new VodSubCatAdpaterNew(arrayList, this.f27108h, this.t);
        this.A = vodSubCatAdpaterNew;
        this.myRecyclerView.setAdapter(vodSubCatAdpaterNew);
    }

    @Override // a.b.k.c, a.i.h.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 82 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    public void e1() {
        ProgressDialog progressDialog = this.w;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        ArrayList<c.h.a.i.f> arrayList = this.f27114n;
        if (arrayList == null || this.myRecyclerView == null || arrayList.size() == 0) {
            TextView textView = this.tvNoStream;
            if (textView != null) {
                textView.setVisibility(0);
                this.myRecyclerView.setVisibility(8);
            }
        } else {
            this.U = false;
            this.H = new VodAdapter(this.f27114n, this.f27108h, false, this);
            c.h.a.i.p.b().m(this.f27114n);
            this.myRecyclerView.setAdapter(this.H);
            c.h.a.h.n.e.m0(this.f27108h, getResources().getString(R.string.use_long_press));
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public final void f1() {
        SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
        this.B = sharedPreferences;
        this.C = sharedPreferences.edit();
        int i2 = this.B.getInt("vod", 0);
        c.h.a.h.n.a.v = i2;
        if (i2 == 1) {
            b1();
        } else {
            a1();
        }
    }

    public final void g1(ArrayList<c.h.a.i.e> arrayList) {
        d1(arrayList);
    }

    public final void h1() {
        try {
            if (this.f27108h != null) {
                String str = this.x;
                byte b2 = -1;
                int iHashCode = str.hashCode();
                if (iHashCode != 1444) {
                    if (iHashCode == 1447 && str.equals("-4")) {
                        b2 = 1;
                    }
                } else if (str.equals("-1")) {
                    b2 = 0;
                }
                if (b2 != 0) {
                    if (b2 != 1) {
                        new q().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_all", this.x);
                    } else {
                        new q().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_watched", this.x);
                    }
                } else if (c.h.a.i.q.m.f(this.f27108h).equals("m3u")) {
                    new q().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav_m3u");
                } else {
                    new q().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
                }
            }
            ProgressDialog progressDialog = this.w;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public final void i1() {
        try {
            View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.delete_recording_popup, (RelativeLayout) findViewById(R.id.rl_password_verification));
            PopupWindow popupWindow = new PopupWindow(this);
            this.M = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.M.setWidth(-1);
            this.M.setHeight(-1);
            this.M.setFocusable(true);
            this.M.showAtLocation(viewInflate, 17, 0, 0);
            ((TextView) viewInflate.findViewById(R.id.tv_delete_recording)).setText(getResources().getString(R.string.delete_this_recent_all_movies));
            Button button = (Button) viewInflate.findViewById(R.id.bt_start_recording);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            if (button != null) {
                button.setOnFocusChangeListener(new e.j((View) button, this));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new e.j((View) button2, this));
            }
            button2.setOnClickListener(new b());
            if (button != null) {
                button.setOnClickListener(new c());
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j1(android.app.Activity r17) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories.j1(android.app.Activity):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ProgressBar progressBar;
        VodAdapterNewFlow vodAdapterNewFlow = this.K;
        if (vodAdapterNewFlow != null && (progressBar = f27107g) != null) {
            vodAdapterNewFlow.s0(progressBar);
        }
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setClickable(true);
        }
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

    /* JADX WARN: Removed duplicated region for block: B:34:0x010d A[PHI: r7
  0x010d: PHI (r7v14 android.widget.ProgressBar) = (r7v13 android.widget.ProgressBar), (r7v35 android.widget.ProgressBar), (r7v38 android.widget.ProgressBar) binds: [B:33:0x010b, B:23:0x00d8, B:17:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    @android.annotation.SuppressLint({"ApplySharedPref"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        if (this.L) {
            this.toolbar.x(R.menu.menu_search);
        } else {
            this.toolbar.x(R.menu.menu_search_text_icon);
            int iZ = c.h.a.i.q.m.z(this.f27108h);
            if ((c.h.a.i.q.m.f(this.f27108h).equals("m3u") ? this.t.K1(iZ, "movie") : this.T.u(iZ)) > 0 && this.x.equals("-4")) {
                menu.getItem(2).getSubMenu().findItem(R.id.nav_delete_all).setVisible(true);
            }
            SharedPreferences sharedPreferences = this.D;
            if (sharedPreferences != null) {
                if (sharedPreferences.getInt("vod", 1) == 1) {
                    menu.getItem(2).getSubMenu().findItem(R.id.layout_view_show_movie_name).setVisible(false);
                    menu.getItem(2).getSubMenu().findItem(R.id.layout_view_hide_movie_name).setVisible(true);
                } else {
                    menu.getItem(2).getSubMenu().findItem(R.id.layout_view_show_movie_name).setVisible(true);
                    menu.getItem(2).getSubMenu().findItem(R.id.layout_view_hide_movie_name).setVisible(false);
                }
            }
        }
        this.S = menu;
        this.R = menu.getItem(2).getSubMenu().findItem(R.id.empty);
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

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 82) {
            return super.onKeyUp(i2, keyEvent);
        }
        Menu menu = this.S;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(R.id.empty, 0);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c1  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r12) {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        Z0();
        super.onResume();
        c.h.a.h.n.e.g(this.f27108h);
        getWindow().setFlags(1024, 1024);
        this.K.s0(f27107g);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f27109i = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f27109i.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f27108h != null) {
            b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Z0();
    }

    public void y0() {
        ProgressDialog progressDialog = this.w;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        ArrayList<c.h.a.i.f> arrayList = this.f27114n;
        if (arrayList == null || this.myRecyclerView == null || arrayList.size() == 0) {
            TextView textView = this.tvNoStream;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            this.U = true;
            this.H = new VodAdapter(this.f27114n, this.f27108h, true);
            c.h.a.i.p.b().m(this.f27114n);
            this.myRecyclerView.setAdapter(this.H);
            c.h.a.h.n.e.m0(this.f27108h, getResources().getString(R.string.use_long_press));
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }
}
