package minefarts.iptvsmarters.view.activity;

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
import android.os.Bundle;
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
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import c.h.a.h.n.e;
import c.h.a.i.q.l;
import c.h.a.i.q.m;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.model.callback.GetEpisdoeDetailsCallback;
import minefarts.iptvsmarters.model.callback.SeriesDBModel;
import minefarts.iptvsmarters.view.adapter.SeriesAdapter;
import minefarts.iptvsmarters.view.adapter.VodAdapterNewFlow;
import minefarts.iptvsmarters.view.adapter.VodSubCatAdpaterNew;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class SeriesActivitNewFlowSubCat extends a.b.k.c implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList<c.h.a.i.e> f26282d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ArrayList<c.h.a.i.e> f26283e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static ArrayList<c.h.a.i.e> f26284f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static ProgressBar f26285g;
    public VodAdapterNewFlow A;
    public PopupWindow C;
    public GridLayoutManager D;
    public Handler E;
    public MenuItem F;
    public Menu G;
    public String I;
    public ArrayList<SeriesDBModel> J;
    public ArrayList<SeriesDBModel> K;
    public ArrayList<SeriesDBModel> L;
    public ArrayList<c.h.a.i.q.i> M;
    public l T;

    @BindView
    public AppBarLayout appbarToolbar;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f26286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SharedPreferences f26287i;

    @BindView
    public ImageView logo;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.f f26291m;

    @BindView
    public RecyclerView myRecyclerView;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ProgressDialog f26293o;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public RelativeLayout rl_sub_cat;
    public VodSubCatAdpaterNew s;
    public SharedPreferences t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    @BindView
    public TextView tvViewProvider;
    public SharedPreferences.Editor u;
    public RecyclerView.p v;

    @BindView
    public TextView vodCategoryName;
    public SharedPreferences w;
    public SeriesAdapter x;
    public c.h.a.i.q.a z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26288j = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f26289k = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.b f26290l = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.h.a.i.q.b f26292n = new c.h.a.i.q.b();
    public String p = BuildConfig.FLAVOR;
    public String q = BuildConfig.FLAVOR;
    public boolean r = false;
    public ArrayList<SeriesDBModel> y = new ArrayList<>();
    public boolean B = false;
    public ArrayList<String> H = new ArrayList<>();
    public ArrayList<GetEpisdoeDetailsCallback> N = new ArrayList<>();
    public Map<String, String> O = new HashMap();
    public Map<String, String> P = new HashMap();
    public ArrayList<SeriesDBModel> Q = new ArrayList<>();
    public ArrayList<GetEpisdoeDetailsCallback> R = new ArrayList<>();
    public ArrayList<GetEpisdoeDetailsCallback> S = new ArrayList<>();
    public List<GetEpisdoeDetailsCallback> U = new ArrayList();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(SeriesActivitNewFlowSubCat.this.f26286h);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(SeriesActivitNewFlowSubCat.this.f26286h);
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivitNewFlowSubCat.this.C.dismiss();
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f26298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f26299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f26300d;

        public e(RadioGroup radioGroup, View view, Activity activity) {
            this.f26298b = radioGroup;
            this.f26299c = view;
            this.f26300d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activity;
            String str;
            RadioButton radioButton = (RadioButton) this.f26299c.findViewById(this.f26298b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(SeriesActivitNewFlowSubCat.this.getResources().getString(R.string.sort_last_added))) {
                activity = this.f26300d;
                str = "1";
            } else if (radioButton.getText().toString().equals(SeriesActivitNewFlowSubCat.this.getResources().getString(R.string.sort_atoz))) {
                activity = this.f26300d;
                str = "2";
            } else if (radioButton.getText().toString().equals(SeriesActivitNewFlowSubCat.this.getResources().getString(R.string.sort_ztoa))) {
                activity = this.f26300d;
                str = "3";
            } else {
                activity = this.f26300d;
                str = "0";
            }
            m.b0(str, activity);
            SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat = SeriesActivitNewFlowSubCat.this;
            seriesActivitNewFlowSubCat.t = seriesActivitNewFlowSubCat.getSharedPreferences("listgridview", 0);
            int i2 = SeriesActivitNewFlowSubCat.this.t.getInt("series", 0);
            c.h.a.h.n.a.w = i2;
            if (i2 == 1) {
                SeriesActivitNewFlowSubCat.this.R0();
            } else {
                SeriesActivitNewFlowSubCat.this.Q0();
            }
            SeriesActivitNewFlowSubCat.this.C.dismiss();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new i(SeriesActivitNewFlowSubCat.this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            SeriesActivitNewFlowSubCat.this.C.dismiss();
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivitNewFlowSubCat.this.C.dismiss();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class h extends AsyncTask<String, Void, String> {
        public h() {
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
                r0 = 1997009972(0x7707f434, float:2.757473E33)
                if (r3 == r0) goto L1a
                goto L37
            L1a:
                java.lang.String r0 = "get_recent_watch"
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
                minefarts.iptvsmarters.view.activity.SeriesActivitNewFlowSubCat r8 = minefarts.iptvsmarters.view.activity.SeriesActivitNewFlowSubCat.this     // Catch: java.lang.Exception -> L57
                java.lang.String r8 = minefarts.iptvsmarters.view.activity.SeriesActivitNewFlowSubCat.H0(r8)     // Catch: java.lang.Exception -> L57
                return r8
            L47:
                minefarts.iptvsmarters.view.activity.SeriesActivitNewFlowSubCat r0 = minefarts.iptvsmarters.view.activity.SeriesActivitNewFlowSubCat.this     // Catch: java.lang.Exception -> L57
                r8 = r8[r6]     // Catch: java.lang.Exception -> L57
                java.lang.String r8 = r0.M0(r8)     // Catch: java.lang.Exception -> L57
                return r8
            L50:
                minefarts.iptvsmarters.view.activity.SeriesActivitNewFlowSubCat r8 = minefarts.iptvsmarters.view.activity.SeriesActivitNewFlowSubCat.this     // Catch: java.lang.Exception -> L57
                java.lang.String r8 = r8.N0()     // Catch: java.lang.Exception -> L57
                return r8
            L57:
                java.lang.String r8 = "error"
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.SeriesActivitNewFlowSubCat.h.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            str.hashCode();
            byte b2 = -1;
            switch (str.hashCode()) {
                case -74801864:
                    if (str.equals("get_all")) {
                        b2 = 0;
                    }
                    break;
                case -74797390:
                    if (str.equals("get_fav")) {
                        b2 = 1;
                    }
                    break;
                case 1997009972:
                    if (str.equals("get_recent_watch")) {
                        b2 = 2;
                    }
                    break;
            }
            SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat = SeriesActivitNewFlowSubCat.this;
            switch (b2) {
                case 0:
                    seriesActivitNewFlowSubCat.y0();
                    break;
                case 1:
                    seriesActivitNewFlowSubCat.L0();
                    break;
                case 2:
                    seriesActivitNewFlowSubCat.z0();
                    break;
                default:
                    seriesActivitNewFlowSubCat.T0(false);
                    break;
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class i extends AsyncTask<Void, Void, Boolean> {
        public i() {
        }

        public /* synthetic */ i(SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat, a aVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            try {
                return SeriesActivitNewFlowSubCat.this.K0();
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            ProgressBar progressBar = SeriesActivitNewFlowSubCat.this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            if (bool.booleanValue()) {
                Toast.makeText(SeriesActivitNewFlowSubCat.this.f26286h, SeriesActivitNewFlowSubCat.this.getResources().getString(R.string.all_series_deleted_successfully), 0).show();
                SeriesActivitNewFlowSubCat.this.T0(false);
                return;
            }
            SeriesActivitNewFlowSubCat.this.U.clear();
            SeriesActivitNewFlowSubCat.this.myRecyclerView.setVisibility(8);
            SeriesActivitNewFlowSubCat seriesActivitNewFlowSubCat = SeriesActivitNewFlowSubCat.this;
            seriesActivitNewFlowSubCat.tvNoRecordFound.setText(seriesActivitNewFlowSubCat.getResources().getString(R.string.no_episode_found));
            SeriesActivitNewFlowSubCat.this.tvNoRecordFound.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            ProgressBar progressBar = SeriesActivitNewFlowSubCat.this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        }
    }

    public class j implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26306b;

        public j(View view) {
            this.f26306b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26306b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26306b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26306b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            if (z) {
                b(1.15f);
                c(1.15f);
            } else {
                if (z) {
                    return;
                }
                b(1.0f);
                c(1.0f);
                a(z);
            }
        }
    }

    public final void J0() {
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

    public Boolean K0() {
        List<GetEpisdoeDetailsCallback> list = this.U;
        if (list == null || list.size() <= 0) {
            return Boolean.FALSE;
        }
        if (this.T == null) {
            this.T = new l(this.f26286h);
        }
        for (int i2 = 0; i2 < this.U.size(); i2++) {
            this.T.n(this.U.get(i2).j());
        }
        return Boolean.TRUE;
    }

    public void L0() {
        ArrayList<SeriesDBModel> arrayList;
        ArrayList<SeriesDBModel> arrayList2;
        try {
            if (this.myRecyclerView != null && (arrayList2 = this.y) != null && arrayList2.size() != 0) {
                SeriesAdapter seriesAdapter = new SeriesAdapter(this.y, this.f26286h);
                this.x = seriesAdapter;
                this.myRecyclerView.setAdapter(seriesAdapter);
                this.x.w();
                c.h.a.h.n.e.m0(this.f26286h, getResources().getString(R.string.use_long_press));
                this.tvNoStream.setVisibility(4);
            }
            if (this.tvNoStream != null && (arrayList = this.y) != null && arrayList.size() == 0) {
                RecyclerView recyclerView = this.myRecyclerView;
                if (recyclerView != null) {
                    recyclerView.setAdapter(this.x);
                }
                this.tvNoStream.setText(getResources().getString(R.string.no_series_found));
                this.tvNoStream.setVisibility(0);
            }
            ProgressBar progressBar = this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } catch (Exception unused) {
        }
    }

    public String M0(String str) {
        try {
            this.M = new ArrayList<>();
            this.J = new ArrayList<>();
            this.K = new ArrayList<>();
            this.L = new ArrayList<>();
            this.L = this.f26291m.m1(str);
            return "get_all";
        } catch (Exception unused) {
            return "get_all";
        }
    }

    public String N0() {
        return "get_fav";
    }

    public final ArrayList<String> O0() {
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.f26291m.d1(m.z(this.f26286h));
        this.M = arrayListD1;
        if (arrayListD1 != null) {
            for (c.h.a.i.q.i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.H.add(iVar.b());
                }
            }
        }
        return this.H;
    }

    public final String P0() {
        this.H = new ArrayList<>();
        new ArrayList();
        this.U = new ArrayList();
        l lVar = new l(this.f26286h);
        this.T = lVar;
        ArrayList<GetEpisdoeDetailsCallback> arrayListR = lVar.r("getalldata");
        if (this.f26291m == null) {
            this.f26291m = new c.h.a.i.q.f(this.f26286h);
        }
        if (this.f26291m.I1(m.z(this.f26286h)) <= 0) {
            this.U = arrayListR;
            return "get_recent_watch";
        }
        this.H = O0();
        for (GetEpisdoeDetailsCallback getEpisdoeDetailsCallback : arrayListR) {
            boolean z = false;
            Iterator<String> it = this.H.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (getEpisdoeDetailsCallback.b().equals(it.next())) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                this.U.add(getEpisdoeDetailsCallback);
            }
        }
        return "get_recent_watch";
    }

    public final void Q0() {
        this.f26286h = this;
        this.f26291m = new c.h.a.i.q.f(this.f26286h);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f26286h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f26286h, c.h.a.h.n.e.y(this.f26286h) + 1);
        this.v = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        this.w = this.f26286h.getSharedPreferences("loginPrefs", 0);
        X0();
    }

    public final void R0() {
        this.f26286h = this;
        this.f26291m = new c.h.a.i.q.f(this.f26286h);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f26286h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f26286h);
        this.v = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        this.w = this.f26286h.getSharedPreferences("loginPrefs", 0);
        X0();
    }

    public final void S0(ArrayList<c.h.a.i.e> arrayList) {
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f26286h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        this.D = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setHasFixedSize(true);
        b();
        VodSubCatAdpaterNew vodSubCatAdpaterNew = new VodSubCatAdpaterNew(arrayList, this.f26286h, this.f26291m);
        this.s = vodSubCatAdpaterNew;
        this.myRecyclerView.setAdapter(vodSubCatAdpaterNew);
    }

    public void T0(boolean z) {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (z) {
            this.tvNoStream.setVisibility(8);
            this.myRecyclerView.setVisibility(0);
        } else {
            this.myRecyclerView.setVisibility(8);
            this.tvNoStream.setText(getResources().getString(R.string.no_episode_found));
            this.tvNoStream.setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[PHI: r0
  0x007b: PHI (r0v3 android.widget.ProgressBar) = (r0v2 android.widget.ProgressBar), (r0v14 android.widget.ProgressBar), (r0v25 android.widget.ProgressBar) binds: [B:24:0x0092, B:20:0x0079, B:11:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void U0() {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.SeriesActivitNewFlowSubCat.U0():void");
    }

    public final void V0() {
        SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
        this.t = sharedPreferences;
        this.u = sharedPreferences.edit();
        int i2 = this.t.getInt("series", 0);
        c.h.a.h.n.a.w = i2;
        if (i2 == 1) {
            R0();
        } else {
            Q0();
        }
    }

    public final void W0(ArrayList<c.h.a.i.e> arrayList) {
        S0(arrayList);
    }

    public final void X0() {
        try {
            if (this.f26286h != null) {
                new c.h.a.i.q.f(this.f26286h);
                String str = this.p;
                byte b2 = -1;
                int iHashCode = str.hashCode();
                if (iHashCode != 1444) {
                    if (iHashCode == 1447 && str.equals("-4")) {
                        b2 = 1;
                    }
                } else if (str.equals("-1")) {
                    b2 = 0;
                }
                if (b2 == 0) {
                    new h().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
                } else if (b2 != 1) {
                    new h().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_all", this.p);
                } else {
                    new h().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_recent_watch");
                }
            }
            ProgressDialog progressDialog = this.f26293o;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public final void Y0() {
        try {
            View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.delete_recording_popup, (RelativeLayout) findViewById(R.id.rl_password_verification));
            PopupWindow popupWindow = new PopupWindow(this);
            this.C = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.C.setWidth(-1);
            this.C.setHeight(-1);
            this.C.setFocusable(true);
            this.C.showAtLocation(viewInflate, 17, 0, 0);
            ((TextView) viewInflate.findViewById(R.id.tv_delete_recording)).setText(getResources().getString(R.string.delete_all_series_this_recording));
            Button button = (Button) viewInflate.findViewById(R.id.bt_start_recording);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            if (button2 != null) {
                button2.setOnFocusChangeListener(new e.j(button2, this));
            }
            if (button != null) {
                button.setOnFocusChangeListener(new e.j(button, this));
            }
            button.setOnClickListener(new f());
            if (button2 != null) {
                button2.setOnClickListener(new g());
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z0(android.app.Activity r17) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.SeriesActivitNewFlowSubCat.Z0(android.app.Activity):void");
    }

    public void a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    public void b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // a.b.k.c, a.i.h.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 82 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        VodAdapterNewFlow vodAdapterNewFlow = this.A;
        if (vodAdapterNewFlow != null) {
            vodAdapterNewFlow.s0(f26285g);
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

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_series_activit_new_flow_sub_cat);
        getWindow().setFlags(1024, 1024);
        this.f26286h = this;
        Intent intent = getIntent();
        if (intent != null) {
            this.p = intent.getStringExtra("category_id");
            this.q = intent.getStringExtra("category_name");
        }
        this.M = new ArrayList<>();
        this.J = new ArrayList<>();
        this.K = new ArrayList<>();
        this.L = new ArrayList<>();
        this.A = new VodAdapterNewFlow();
        this.z = new c.h.a.i.q.a(this.f26286h);
        this.f26291m = new c.h.a.i.q.f(this.f26286h);
        this.E = new Handler();
        U0();
        this.I = this.I;
        this.logo.setOnClickListener(new a());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Toolbar toolbar;
        int i2;
        super.onCreateOptionsMenu(menu);
        if (this.B) {
            toolbar = this.toolbar;
            i2 = R.menu.menu_search;
        } else {
            toolbar = this.toolbar;
            i2 = R.menu.menu_search_text_icon;
        }
        toolbar.x(i2);
        this.G = menu;
        this.F = menu.getItem(2).getSubMenu().findItem(R.id.empty);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i3 = 0; i3 < this.toolbar.getChildCount(); i3++) {
            if (this.toolbar.getChildAt(i3) instanceof ActionMenuView) {
                ((Toolbar.e) this.toolbar.getChildAt(i3).getLayoutParams()).f135a = 16;
            }
        }
        if (this.p.equalsIgnoreCase("-4")) {
            this.F = menu.getItem(2).getSubMenu().findItem(R.id.layout_view_linear).setVisible(true);
            this.F = menu.getItem(2).getSubMenu().findItem(R.id.layout_view_grid).setVisible(true);
            if (this.T == null) {
                this.T = new l(this.f26286h);
            }
            if (this.T.u() > 0) {
                menu.getItem(2).getSubMenu().findItem(R.id.nav_delete_all).setVisible(true);
            }
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 82) {
            return super.onKeyUp(i2, keyEvent);
        }
        Menu menu = this.G;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(R.id.empty, 0);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007f  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r9) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.SeriesActivitNewFlowSubCat.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        ProgressBar progressBar;
        super.onResume();
        c.h.a.h.n.e.g(this.f26286h);
        getWindow().setFlags(1024, 1024);
        VodAdapterNewFlow vodAdapterNewFlow = this.A;
        if (vodAdapterNewFlow != null && (progressBar = f26285g) != null) {
            vodAdapterNewFlow.s0(progressBar);
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26287i = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f26287i.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    public void y0() {
        try {
            ArrayList<SeriesDBModel> arrayList = this.L;
            if (arrayList == null || this.myRecyclerView == null || arrayList.size() == 0) {
                TextView textView = this.tvNoStream;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else {
                SeriesAdapter seriesAdapter = new SeriesAdapter(this.L, this.f26286h);
                this.x = seriesAdapter;
                this.myRecyclerView.setAdapter(seriesAdapter);
                c.h.a.h.n.e.m0(this.f26286h, getResources().getString(R.string.use_long_press));
            }
            ProgressBar progressBar = this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } catch (Exception unused) {
        }
    }

    public final void z0() {
    }
}
