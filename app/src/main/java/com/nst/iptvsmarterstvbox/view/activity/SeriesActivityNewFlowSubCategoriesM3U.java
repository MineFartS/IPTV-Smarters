package com.nst.iptvsmarterstvbox.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
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
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.h.n.e;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.adapter.SeriesAdapterM3U;
import com.nst.iptvsmarterstvbox.view.adapter.VodAdapterNewFlow;
import com.nst.iptvsmarterstvbox.view.adapter.VodSubCatAdpaterNew;
import java.util.ArrayList;
import java.util.Iterator;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class SeriesActivityNewFlowSubCategoriesM3U extends a.b.k.c implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList<c.h.a.i.e> f26341d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ArrayList<c.h.a.i.e> f26342e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static ArrayList<c.h.a.i.e> f26343f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static ProgressBar f26344g;
    public SharedPreferences A;
    public SharedPreferences.Editor B;
    public RecyclerView.p C;
    public SharedPreferences D;
    public SeriesAdapterM3U E;
    public VodAdapterNewFlow G;
    public PopupWindow I;
    public SharedPreferences J;
    public SharedPreferences.Editor K;
    public GridLayoutManager L;
    public Handler M;
    public MenuItem N;
    public Menu O;
    public c.h.a.i.q.k P;

    @BindView
    public AppBarLayout appbarToolbar;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f26345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SharedPreferences f26346i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<c.h.a.i.q.i> f26348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f26349l;

    @BindView
    public ImageView logo;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f26350m;

    @BindView
    public RecyclerView myRecyclerView;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f26351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<c.h.a.i.c> f26352o;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public RelativeLayout rl_sub_cat;
    public c.h.a.i.q.f s;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    @BindView
    public TextView tvViewProvider;
    public SearchView u;
    public ProgressDialog v;

    @BindView
    public TextView vodCategoryName;
    public VodSubCatAdpaterNew z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<String> f26347j = new ArrayList<>();
    public String p = BuildConfig.FLAVOR;
    public String q = BuildConfig.FLAVOR;
    public c.h.a.i.q.b r = new c.h.a.i.q.b();
    public c.h.a.i.q.b t = new c.h.a.i.q.b();
    public String w = BuildConfig.FLAVOR;
    public String x = BuildConfig.FLAVOR;
    public boolean y = false;
    public ArrayList<c.h.a.i.f> F = new ArrayList<>();
    public boolean H = false;
    public boolean Q = true;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(SeriesActivityNewFlowSubCategoriesM3U.this.f26345h);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivityNewFlowSubCategoriesM3U.this.I.dismiss();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Menu menu = SeriesActivityNewFlowSubCategoriesM3U.this.O;
            if (menu != null) {
                menu.getItem(1).getSubMenu().findItem(R.id.nav_delete_all).setVisible(false);
            }
            SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U = SeriesActivityNewFlowSubCategoriesM3U.this;
            seriesActivityNewFlowSubCategoriesM3U.P.m("movie", c.h.a.i.q.m.z(seriesActivityNewFlowSubCategoriesM3U.f26345h));
            SeriesActivityNewFlowSubCategoriesM3U.this.f26351n.clear();
            SeriesActivityNewFlowSubCategoriesM3U.this.E.w();
            SeriesActivityNewFlowSubCategoriesM3U.this.tvNoRecordFound.setVisibility(0);
            Toast.makeText(SeriesActivityNewFlowSubCategoriesM3U.this.f26345h, SeriesActivityNewFlowSubCategoriesM3U.this.getResources().getString(R.string.all_movies_deleted_successfully), 0).show();
            SeriesActivityNewFlowSubCategoriesM3U.this.I.dismiss();
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivityNewFlowSubCategoriesM3U.this.I.dismiss();
        }
    }

    public class h implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f26360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f26361c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f26362d;

        public h(RadioGroup radioGroup, View view, Activity activity) {
            this.f26360b = radioGroup;
            this.f26361c = view;
            this.f26362d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activity;
            String str;
            RadioButton radioButton = (RadioButton) this.f26361c.findViewById(this.f26360b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(SeriesActivityNewFlowSubCategoriesM3U.this.getResources().getString(R.string.sort_last_added))) {
                activity = this.f26362d;
                str = "1";
            } else if (radioButton.getText().toString().equals(SeriesActivityNewFlowSubCategoriesM3U.this.getResources().getString(R.string.sort_atoz))) {
                activity = this.f26362d;
                str = "2";
            } else if (radioButton.getText().toString().equals(SeriesActivityNewFlowSubCategoriesM3U.this.getResources().getString(R.string.sort_ztoa))) {
                activity = this.f26362d;
                str = "3";
            } else {
                activity = this.f26362d;
                str = "0";
            }
            c.h.a.i.q.m.b0(str, activity);
            SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U = SeriesActivityNewFlowSubCategoriesM3U.this;
            seriesActivityNewFlowSubCategoriesM3U.A = seriesActivityNewFlowSubCategoriesM3U.getSharedPreferences("listgridview", 0);
            int i2 = SeriesActivityNewFlowSubCategoriesM3U.this.A.getInt("series", 0);
            c.h.a.h.n.a.w = i2;
            if (i2 == 1) {
                SeriesActivityNewFlowSubCategoriesM3U.this.a1();
            } else {
                SeriesActivityNewFlowSubCategoriesM3U.this.Z0();
            }
            SeriesActivityNewFlowSubCategoriesM3U.this.I.dismiss();
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivityNewFlowSubCategoriesM3U.this.I.dismiss();
        }
    }

    public class j implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c.h.a.i.q.k f26365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f26366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f26367d;

        public j(c.h.a.i.q.k kVar, int i2, Context context) {
            this.f26365b = kVar;
            this.f26366c = i2;
            this.f26367d = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.i.q.k kVar = this.f26365b;
            if (kVar != null) {
                kVar.p(this.f26366c, "movie");
            }
            int i2 = 0;
            Toast.makeText(this.f26367d, SeriesActivityNewFlowSubCategoriesM3U.this.getResources().getString(R.string.movie_deleted_successfully), 0).show();
            if (SeriesActivityNewFlowSubCategoriesM3U.this.E != null) {
                SeriesActivityNewFlowSubCategoriesM3U.this.f26348k = new ArrayList();
                SeriesActivityNewFlowSubCategoriesM3U.this.f26349l = new ArrayList();
                SeriesActivityNewFlowSubCategoriesM3U.this.f26350m = new ArrayList();
                ArrayList<c.h.a.i.f> arrayListQ = this.f26365b.q("movie", c.h.a.i.q.m.z(this.f26367d), "getalldata");
                if (SeriesActivityNewFlowSubCategoriesM3U.this.s.I1(c.h.a.i.q.m.z(this.f26367d)) <= 0 || arrayListQ == null) {
                    SeriesActivityNewFlowSubCategoriesM3U.this.f26351n.clear();
                    if (arrayListQ.isEmpty()) {
                        SeriesActivityNewFlowSubCategoriesM3U.this.tvNoRecordFound.setVisibility(0);
                        SeriesActivityNewFlowSubCategoriesM3U.this.E.w();
                    } else {
                        while (i2 < arrayListQ.size()) {
                            SeriesActivityNewFlowSubCategoriesM3U.this.f26351n.add(arrayListQ.get(i2));
                            SeriesActivityNewFlowSubCategoriesM3U.this.E.w();
                            i2++;
                        }
                    }
                } else {
                    SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U = SeriesActivityNewFlowSubCategoriesM3U.this;
                    seriesActivityNewFlowSubCategoriesM3U.f26347j = seriesActivityNewFlowSubCategoriesM3U.W0();
                    if (SeriesActivityNewFlowSubCategoriesM3U.this.f26347j != null) {
                        SeriesActivityNewFlowSubCategoriesM3U seriesActivityNewFlowSubCategoriesM3U2 = SeriesActivityNewFlowSubCategoriesM3U.this;
                        seriesActivityNewFlowSubCategoriesM3U2.f26350m = seriesActivityNewFlowSubCategoriesM3U2.X0(arrayListQ, seriesActivityNewFlowSubCategoriesM3U2.f26347j);
                    }
                    SeriesActivityNewFlowSubCategoriesM3U.this.f26351n.clear();
                    if (SeriesActivityNewFlowSubCategoriesM3U.this.f26350m != null) {
                        while (i2 < SeriesActivityNewFlowSubCategoriesM3U.this.f26350m.size()) {
                            SeriesActivityNewFlowSubCategoriesM3U.this.f26351n.add(SeriesActivityNewFlowSubCategoriesM3U.this.f26350m.get(i2));
                            SeriesActivityNewFlowSubCategoriesM3U.this.E.w();
                            i2++;
                        }
                    }
                }
                SeriesActivityNewFlowSubCategoriesM3U.this.I.dismiss();
            }
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SeriesActivityNewFlowSubCategoriesM3U.this.d1();
            ProgressBar progressBar = SeriesActivityNewFlowSubCategoriesM3U.this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SeriesActivityNewFlowSubCategoriesM3U.this.d1();
            ProgressBar progressBar = SeriesActivityNewFlowSubCategoriesM3U.this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SeriesActivityNewFlowSubCategoriesM3U.this.d1();
            ProgressBar progressBar = SeriesActivityNewFlowSubCategoriesM3U.this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SeriesActivityNewFlowSubCategoriesM3U.this.e1(SeriesActivityNewFlowSubCategoriesM3U.f26342e);
            ProgressBar progressBar = SeriesActivityNewFlowSubCategoriesM3U.this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(SeriesActivityNewFlowSubCategoriesM3U.this.f26345h);
        }
    }

    public class p implements DialogInterface.OnClickListener {
        public p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class q implements DialogInterface.OnClickListener {
        public q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(SeriesActivityNewFlowSubCategoriesM3U.this.f26345h);
        }
    }

    public class r implements SearchView.l {
        public r() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            SeriesActivityNewFlowSubCategoriesM3U.this.tvNoRecordFound.setVisibility(8);
            if (SeriesActivityNewFlowSubCategoriesM3U.this.z == null || (textView = SeriesActivityNewFlowSubCategoriesM3U.this.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            SeriesActivityNewFlowSubCategoriesM3U.this.z.p0(str, SeriesActivityNewFlowSubCategoriesM3U.this.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class s implements SearchView.l {
        public s() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            SeriesActivityNewFlowSubCategoriesM3U.this.tvNoRecordFound.setVisibility(8);
            if (SeriesActivityNewFlowSubCategoriesM3U.this.E == null || (textView = SeriesActivityNewFlowSubCategoriesM3U.this.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            SeriesActivityNewFlowSubCategoriesM3U.this.E.s0(str, SeriesActivityNewFlowSubCategoriesM3U.this.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class t implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26378b;

        public t(View view) {
            this.f26378b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26378b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26378b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26378b, "scaleY", f2);
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

    public final void T0() {
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

    public void U0(int i2, String str, Context context, c.h.a.i.q.k kVar) {
        try {
            View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.delete_recording_popup, (RelativeLayout) findViewById(R.id.rl_password_verification));
            PopupWindow popupWindow = new PopupWindow(this);
            this.I = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.I.setWidth(-1);
            this.I.setHeight(-1);
            this.I.setFocusable(true);
            this.I.showAtLocation(viewInflate, 17, 0, 0);
            ((TextView) viewInflate.findViewById(R.id.tv_delete_recording)).setText(getResources().getString(R.string.delete_this_recent_movies));
            Button button = (Button) viewInflate.findViewById(R.id.bt_start_recording);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            if (button != null) {
                button.setOnFocusChangeListener(new e.j(button, this));
            }
            if (button2 != null) {
                button2.setOnFocusChangeListener(new e.j(button2, this));
            }
            button2.setOnClickListener(new i());
            if (button != null) {
                button.setOnClickListener(new j(kVar, i2, context));
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void V0() {
        ArrayList<c.h.a.i.f> arrayList;
        ArrayList<c.h.a.i.f> arrayList2;
        new ArrayList();
        this.F.clear();
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.E);
        }
        if (this.f26345h != null) {
            ArrayList<c.h.a.i.c> arrayListB1 = this.s.B1("series");
            if (this.f26347j != null) {
                this.f26347j = W0();
            }
            ArrayList<String> arrayList3 = this.f26347j;
            if (arrayList3 != null && arrayList3.size() > 0 && arrayListB1 != null && arrayListB1.size() > 0) {
                arrayListB1 = Y0(arrayListB1, this.f26347j);
            }
            for (c.h.a.i.c cVar : arrayListB1) {
                ArrayList<c.h.a.i.f> arrayListF1 = this.s.F1(cVar.a(), cVar.c());
                if (arrayListF1 != null && arrayListF1.size() > 0) {
                    this.F.add(arrayListF1.get(0));
                }
            }
            b();
            if (this.myRecyclerView != null && (arrayList2 = this.F) != null && arrayList2.size() != 0) {
                this.E = new SeriesAdapterM3U(this.F, this.f26345h, true, this.x);
                c.h.a.i.p.b().m(this.F);
                this.myRecyclerView.setAdapter(this.E);
                c.h.a.h.n.e.m0(this.f26345h, getResources().getString(R.string.use_long_press));
                this.tvNoStream.setVisibility(4);
            }
            if (this.tvNoStream == null || (arrayList = this.F) == null || arrayList.size() != 0) {
                return;
            }
            RecyclerView recyclerView2 = this.myRecyclerView;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.E);
            }
            ProgressBar progressBar = this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            this.tvNoStream.setText(getResources().getString(R.string.no_fav_found));
            this.tvNoStream.setVisibility(0);
        }
    }

    public final ArrayList<String> W0() {
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.s.d1(c.h.a.i.q.m.z(this.f26345h));
        this.f26348k = arrayListD1;
        if (arrayListD1 != null) {
            for (c.h.a.i.q.i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.f26347j.add(iVar.b());
                }
            }
        }
        return this.f26347j;
    }

    public final ArrayList<c.h.a.i.f> X0(ArrayList<c.h.a.i.f> arrayList, ArrayList<String> arrayList2) {
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
                this.f26349l.add(fVar);
                fVar.g();
            }
        }
        return this.f26349l;
    }

    public final ArrayList<c.h.a.i.c> Y0(ArrayList<c.h.a.i.c> arrayList, ArrayList<String> arrayList2) {
        this.f26352o = new ArrayList<>();
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
                    this.f26352o.add(cVar);
                }
            }
        }
        return this.f26352o;
    }

    public final void Z0() {
        this.f26345h = this;
        this.s = new c.h.a.i.q.f(this.f26345h);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f26345h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f26345h, c.h.a.h.n.e.y(this.f26345h) + 1);
        this.C = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        this.D = this.f26345h.getSharedPreferences("loginPrefs", 0);
        f1();
    }

    public void a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    public final void a1() {
        this.f26345h = this;
        this.s = new c.h.a.i.q.f(this.f26345h);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f26345h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f26345h);
        this.C = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        this.D = this.f26345h.getSharedPreferences("loginPrefs", 0);
        f1();
    }

    public void b() {
    }

    public final void b1(ArrayList<c.h.a.i.e> arrayList) {
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f26345h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        this.L = new c.h.a.k.d.a.a(this.f26345h).A().equals(c.h.a.h.n.a.s0) ? new GridLayoutManager(this, 2) : new GridLayoutManager(this, 2);
        this.myRecyclerView.setLayoutManager(this.L);
        this.myRecyclerView.setHasFixedSize(true);
        b();
        VodSubCatAdpaterNew vodSubCatAdpaterNew = new VodSubCatAdpaterNew(arrayList, this.f26345h, this.s);
        this.z = vodSubCatAdpaterNew;
        this.myRecyclerView.setAdapter(vodSubCatAdpaterNew);
    }

    public final void d1() {
        SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
        this.A = sharedPreferences;
        this.B = sharedPreferences.edit();
        int i2 = this.A.getInt("series", 0);
        c.h.a.h.n.a.w = i2;
        if (i2 == 1) {
            a1();
        } else {
            Z0();
        }
    }

    @Override // a.b.k.c, a.i.h.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 82 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    public final void e1(ArrayList<c.h.a.i.e> arrayList) {
        b1(arrayList);
    }

    public final void f1() {
        TextView textView;
        Context context;
        Resources resources;
        try {
            if (this.f26345h != null) {
                c.h.a.i.q.f fVar = new c.h.a.i.q.f(this.f26345h);
                c.h.a.i.q.k kVar = new c.h.a.i.q.k(this.f26345h);
                if (this.w.equals("-1")) {
                    V0();
                } else if (this.w.equals("-4")) {
                    this.f26348k = new ArrayList<>();
                    this.f26349l = new ArrayList<>();
                    this.f26350m = new ArrayList<>();
                    this.f26351n = new ArrayList<>();
                    ArrayList<c.h.a.i.f> arrayListQ = kVar.q("movie", c.h.a.i.q.m.z(this.f26345h), "getalldata");
                    if (fVar.I1(c.h.a.i.q.m.z(this.f26345h)) <= 0 || arrayListQ == null) {
                        this.f26351n = arrayListQ;
                    } else {
                        ArrayList<String> arrayListW0 = W0();
                        this.f26347j = arrayListW0;
                        if (arrayListW0 != null) {
                            this.f26350m = X0(arrayListQ, arrayListW0);
                        }
                        this.f26351n = this.f26350m;
                    }
                    b();
                    ProgressDialog progressDialog = this.v;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    ArrayList<c.h.a.i.f> arrayList = this.f26351n;
                    if (arrayList == null || this.myRecyclerView == null || arrayList.size() == 0) {
                        textView = this.tvNoStream;
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                    } else {
                        this.Q = false;
                        this.E = new SeriesAdapterM3U(this.f26351n, this.f26345h, false, this, this.x);
                        c.h.a.i.p.b().m(this.f26351n);
                        this.myRecyclerView.setAdapter(this.E);
                        context = this.f26345h;
                        resources = getResources();
                        c.h.a.h.n.e.m0(context, resources.getString(R.string.use_long_press));
                    }
                } else if (this.w.equals("0")) {
                    this.f26348k = new ArrayList<>();
                    this.f26349l = new ArrayList<>();
                    this.f26350m = new ArrayList<>();
                    this.f26351n = new ArrayList<>();
                    ArrayList<c.h.a.i.f> arrayListW02 = fVar.W0(this.w, "series");
                    if (fVar.I1(c.h.a.i.q.m.z(this.f26345h)) <= 0 || arrayListW02 == null) {
                        this.f26351n = arrayListW02;
                    } else {
                        ArrayList<String> arrayListW03 = W0();
                        this.f26347j = arrayListW03;
                        if (arrayListW03 != null) {
                            this.f26350m = X0(arrayListW02, arrayListW03);
                        }
                        this.f26351n = this.f26350m;
                    }
                    b();
                    ProgressDialog progressDialog2 = this.v;
                    if (progressDialog2 != null) {
                        progressDialog2.dismiss();
                    }
                    ArrayList<c.h.a.i.f> arrayList2 = this.f26351n;
                    if (arrayList2 == null || this.myRecyclerView == null || arrayList2.size() == 0) {
                        textView = this.tvNoStream;
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                    } else {
                        this.Q = true;
                        this.E = new SeriesAdapterM3U(this.f26351n, this.f26345h, true, this.x);
                        c.h.a.i.p.b().m(this.f26351n);
                        this.myRecyclerView.setAdapter(this.E);
                        context = this.f26345h;
                        resources = getResources();
                        c.h.a.h.n.e.m0(context, resources.getString(R.string.use_long_press));
                    }
                } else {
                    ArrayList<c.h.a.i.f> arrayListW04 = fVar.W0(this.w, "series");
                    b();
                    ProgressDialog progressDialog3 = this.v;
                    if (progressDialog3 != null) {
                        progressDialog3.dismiss();
                    }
                    if (arrayListW04 != null && this.myRecyclerView != null && arrayListW04.size() != 0) {
                        this.Q = true;
                        this.E = new SeriesAdapterM3U(arrayListW04, this.f26345h, true, this.x);
                        c.h.a.i.p.b().m(arrayListW04);
                        this.myRecyclerView.setAdapter(this.E);
                        this.E.w();
                        context = this.f26345h;
                        resources = getResources();
                        c.h.a.h.n.e.m0(context, resources.getString(R.string.use_long_press));
                    } else if (this.tvNoStream != null) {
                        ProgressBar progressBar = this.pbLoader;
                        if (progressBar != null) {
                            progressBar.setVisibility(8);
                        }
                        textView = this.tvNoStream;
                        textView.setVisibility(0);
                    }
                }
            }
            ProgressDialog progressDialog4 = this.v;
            if (progressDialog4 != null) {
                progressDialog4.dismiss();
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public final void g1() {
        View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.delete_recording_popup, (RelativeLayout) findViewById(R.id.rl_password_verification));
        PopupWindow popupWindow = new PopupWindow(this);
        this.I = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.I.setWidth(-1);
        this.I.setHeight(-1);
        this.I.setFocusable(true);
        this.I.showAtLocation(viewInflate, 17, 0, 0);
        ((TextView) viewInflate.findViewById(R.id.tv_delete_recording)).setText(getResources().getString(R.string.delete_this_recent_all_movies));
        Button button = (Button) viewInflate.findViewById(R.id.bt_start_recording);
        Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
        if (button != null) {
            button.setOnFocusChangeListener(new e.j(button, this));
        }
        if (button2 != null) {
            button2.setOnFocusChangeListener(new e.j(button2, this));
        }
        button2.setOnClickListener(new e());
        if (button != null) {
            button.setOnClickListener(new f());
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void h1(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.sort_layout, (RelativeLayout) activity.findViewById(R.id.rl_password_prompt));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.I = popupWindow;
            popupWindow.setContentView(viewInflate);
            byte b2 = -1;
            this.I.setWidth(-1);
            this.I.setHeight(-1);
            this.I.setFocusable(true);
            this.I.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(R.id.bt_save_password);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.rg_radio);
            RadioButton radioButton = (RadioButton) viewInflate.findViewById(R.id.rb_normal);
            RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(R.id.rb_lastadded);
            radioButton2.setVisibility(8);
            RadioButton radioButton3 = (RadioButton) viewInflate.findViewById(R.id.rb_channel_asc);
            radioButton3.setVisibility(8);
            RadioButton radioButton4 = (RadioButton) viewInflate.findViewById(R.id.rb_channel_desc);
            radioButton4.setVisibility(8);
            RadioButton radioButton5 = (RadioButton) viewInflate.findViewById(R.id.rb_atoz);
            RadioButton radioButton6 = (RadioButton) viewInflate.findViewById(R.id.rb_ztoa);
            radioButton.setOnFocusChangeListener(new t(radioButton));
            radioButton2.setOnFocusChangeListener(new t(radioButton2));
            radioButton5.setOnFocusChangeListener(new t(radioButton5));
            radioButton6.setOnFocusChangeListener(new t(radioButton6));
            radioButton3.setOnFocusChangeListener(new t(radioButton3));
            radioButton4.setOnFocusChangeListener(new t(radioButton4));
            String strW = c.h.a.i.q.m.w(activity);
            switch (strW.hashCode()) {
                case 49:
                    if (strW.equals("1")) {
                        b2 = 0;
                    }
                    break;
                case 50:
                    if (strW.equals("2")) {
                        b2 = 1;
                    }
                    break;
                case 51:
                    if (strW.equals("3")) {
                        b2 = 2;
                    }
                    break;
            }
            if (b2 == 0) {
                radioButton2.setChecked(true);
            } else if (b2 == 1) {
                radioButton5.setChecked(true);
            } else if (b2 != 2) {
                radioButton.setChecked(true);
            } else {
                radioButton6.setChecked(true);
            }
            button2.setOnClickListener(new g());
            button.setOnClickListener(new h(radioGroup, viewInflate, activity));
        } catch (NullPointerException | Exception unused) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ProgressBar progressBar;
        VodAdapterNewFlow vodAdapterNewFlow = this.G;
        if (vodAdapterNewFlow != null && (progressBar = f26344g) != null) {
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

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    @SuppressLint({"ApplySharedPref"})
    public void onCreate(Bundle bundle) {
        Handler handler;
        Runnable lVar;
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("sort", 0);
        this.J = sharedPreferences;
        this.K = sharedPreferences.edit();
        if (this.J.getString("sort", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.K.putString("sort", "0");
            this.K.commit();
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.w = intent.getStringExtra("category_id");
            this.x = intent.getStringExtra("category_name");
        }
        this.f26345h = this;
        this.G = new VodAdapterNewFlow();
        this.s = new c.h.a.i.q.f(this.f26345h);
        this.M = new Handler();
        this.P = new c.h.a.i.q.k(this.f26345h);
        String str = this.w;
        str.hashCode();
        if (str.equals("0")) {
            setContentView(R.layout.activity_vod_layout);
            ButterKnife.a(this);
            a();
            this.M.removeCallbacksAndMessages(null);
            ProgressBar progressBar = this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            handler = this.M;
            lVar = new l();
        } else if (str.equals("-1")) {
            setContentView(R.layout.activity_vod_layout);
            ButterKnife.a(this);
            this.M.removeCallbacksAndMessages(null);
            ProgressBar progressBar2 = this.pbLoader;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
            handler = this.M;
            lVar = new k();
        } else {
            ArrayList<c.h.a.i.e> arrayListZ0 = this.s.Z0(this.w);
            f26342e = arrayListZ0;
            if (arrayListZ0 == null || arrayListZ0.size() != 0) {
                setContentView(R.layout.activity_vod_new_flow_subcategories);
                ButterKnife.a(this);
                a();
                this.H = true;
                this.M.removeCallbacksAndMessages(null);
                ProgressBar progressBar3 = this.pbLoader;
                if (progressBar3 != null) {
                    progressBar3.setVisibility(0);
                }
                handler = this.M;
                lVar = new n();
            } else {
                setContentView(R.layout.activity_vod_layout);
                ButterKnife.a(this);
                a();
                this.M.removeCallbacksAndMessages(null);
                ProgressBar progressBar4 = this.pbLoader;
                if (progressBar4 != null) {
                    progressBar4.setVisibility(0);
                }
                handler = this.M;
                lVar = new m();
            }
        }
        handler.postDelayed(lVar, 1000L);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(R.drawable.black_background));
        }
        T0();
        v0((Toolbar) findViewById(R.id.toolbar));
        this.f26345h = this;
        if (!this.x.isEmpty()) {
            this.vodCategoryName.setText(this.x);
        }
        this.vodCategoryName.setSelected(true);
        this.logo.setOnClickListener(new o());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        if (this.H) {
            this.toolbar.x(R.menu.menu_search);
        } else {
            this.toolbar.x(R.menu.menu_search_text_icon);
            if (this.P.u(c.h.a.i.q.m.z(this.f26345h)) > 0 && this.w.equals("-4")) {
                menu.getItem(2).getSubMenu().findItem(R.id.nav_delete_all).setVisible(true);
            }
        }
        this.O = menu;
        this.N = menu.getItem(2).getSubMenu().findItem(R.id.empty);
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
        Menu menu = this.O;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(R.id.empty, 0);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x024c  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r12) {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        c.h.a.h.n.e.g(this.f26345h);
        getWindow().setFlags(1024, 1024);
        this.G.s0(f26344g);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26346i = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f26346i.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f26345h != null) {
            b();
        }
    }
}
