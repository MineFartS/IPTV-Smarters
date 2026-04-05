package com.nst.iptvsmarterstvbox.view.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
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
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.i.q.m;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.adapter.VodAdapter;
import com.nst.iptvsmarterstvbox.view.adapter.VodAdapterNewFlow;
import com.nst.iptvsmarterstvbox.view.adapter.VodSubCatAdpaterNew;
import java.util.ArrayList;
import java.util.Iterator;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class VodActivityNewFlowSecondSubCategories extends a.b.k.c implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList<c.h.a.i.e> f27078d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ArrayList<c.h.a.i.e> f27079e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static ArrayList<c.h.a.i.e> f27080f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static ProgressBar f27081g;
    public VodAdapterNewFlow A;
    public PopupWindow C;
    public SharedPreferences D;
    public SharedPreferences.Editor E;
    public GridLayoutManager F;
    public ArrayList<c.h.a.i.q.i> H;
    public ArrayList<c.h.a.i.f> I;
    public ArrayList<c.h.a.i.f> J;
    public ArrayList<c.h.a.i.f> K;

    @BindView
    public AppBarLayout appbarToolbar;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f27082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SharedPreferences f27083i;

    @BindView
    public ImageView logo;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.f f27087m;

    @BindView
    public RecyclerView myRecyclerView;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SearchView f27089o;
    public ProgressDialog p;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public RelativeLayout rl_sub_cat;
    public VodSubCatAdpaterNew t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    @BindView
    public TextView tvViewProvider;
    public SharedPreferences u;
    public SharedPreferences.Editor v;

    @BindView
    public TextView vodCategoryName;
    public RecyclerView.p w;
    public SharedPreferences x;
    public VodAdapter y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f27084j = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f27085k = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.b f27086l = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.h.a.i.q.b f27088n = new c.h.a.i.q.b();
    public String q = BuildConfig.FLAVOR;
    public String r = BuildConfig.FLAVOR;
    public boolean s = false;
    public ArrayList<c.h.a.i.f> z = new ArrayList<>();
    public boolean B = false;
    public ArrayList<String> G = new ArrayList<>();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodActivityNewFlowSecondSubCategories.this.C.dismiss();
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f27091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f27092c;

        public b(RadioGroup radioGroup, View view) {
            this.f27091b = radioGroup;
            this.f27092c = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor;
            String str;
            RadioButton radioButton = (RadioButton) this.f27092c.findViewById(this.f27091b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(VodActivityNewFlowSecondSubCategories.this.getResources().getString(R.string.sort_last_added))) {
                editor = VodActivityNewFlowSecondSubCategories.this.E;
                str = "1";
            } else if (radioButton.getText().toString().equals(VodActivityNewFlowSecondSubCategories.this.getResources().getString(R.string.sort_atoz))) {
                editor = VodActivityNewFlowSecondSubCategories.this.E;
                str = "2";
            } else if (radioButton.getText().toString().equals(VodActivityNewFlowSecondSubCategories.this.getResources().getString(R.string.sort_ztoa))) {
                editor = VodActivityNewFlowSecondSubCategories.this.E;
                str = "3";
            } else {
                editor = VodActivityNewFlowSecondSubCategories.this.E;
                str = "0";
            }
            editor.putString("sort", str);
            VodActivityNewFlowSecondSubCategories.this.E.commit();
            VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories = VodActivityNewFlowSecondSubCategories.this;
            vodActivityNewFlowSecondSubCategories.u = vodActivityNewFlowSecondSubCategories.getSharedPreferences("listgridview", 0);
            VodActivityNewFlowSecondSubCategories vodActivityNewFlowSecondSubCategories2 = VodActivityNewFlowSecondSubCategories.this;
            vodActivityNewFlowSecondSubCategories2.v = vodActivityNewFlowSecondSubCategories2.u.edit();
            int i2 = VodActivityNewFlowSecondSubCategories.this.u.getInt("vod", 0);
            c.h.a.h.n.a.v = i2;
            if (i2 == 1) {
                VodActivityNewFlowSecondSubCategories.this.N0();
            } else {
                VodActivityNewFlowSecondSubCategories.this.M0();
            }
            VodActivityNewFlowSecondSubCategories.this.C.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(VodActivityNewFlowSecondSubCategories.this.f27082h);
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
            c.h.a.h.n.e.O(VodActivityNewFlowSecondSubCategories.this.f27082h);
        }
    }

    public class f implements SearchView.l {
        public f() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            VodActivityNewFlowSecondSubCategories.this.tvNoRecordFound.setVisibility(8);
            if (VodActivityNewFlowSecondSubCategories.this.t == null || (textView = VodActivityNewFlowSecondSubCategories.this.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            VodActivityNewFlowSecondSubCategories.this.t.p0(str, VodActivityNewFlowSecondSubCategories.this.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class g implements SearchView.l {
        public g() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            VodActivityNewFlowSecondSubCategories.this.tvNoRecordFound.setVisibility(8);
            if (VodActivityNewFlowSecondSubCategories.this.y == null || (textView = VodActivityNewFlowSecondSubCategories.this.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            VodActivityNewFlowSecondSubCategories.this.y.t0(str, VodActivityNewFlowSecondSubCategories.this.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(VodActivityNewFlowSecondSubCategories.this.f27082h);
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
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public class k implements DialogInterface.OnClickListener {
        public k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public final void I0() {
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

    public void J0() {
        RecyclerView recyclerView;
        a.y.e.c cVar;
        try {
            a();
            SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
            this.u = sharedPreferences;
            this.v = sharedPreferences.edit();
            int i2 = this.u.getInt("vod", 0);
            c.h.a.h.n.a.v = i2;
            if (i2 == 1) {
                this.f27082h = this;
                this.f27087m = new c.h.a.i.q.f(this.f27082h);
                RecyclerView recyclerView2 = this.myRecyclerView;
                if (recyclerView2 != null && this.f27082h != null) {
                    recyclerView2.setHasFixedSize(true);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f27082h);
                    this.w = linearLayoutManager;
                    this.myRecyclerView.setLayoutManager(linearLayoutManager);
                    recyclerView = this.myRecyclerView;
                    cVar = new a.y.e.c();
                    recyclerView.setItemAnimator(cVar);
                }
            } else {
                this.f27082h = this;
                this.f27087m = new c.h.a.i.q.f(this.f27082h);
                RecyclerView recyclerView3 = this.myRecyclerView;
                if (recyclerView3 != null && this.f27082h != null) {
                    recyclerView3.setHasFixedSize(true);
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f27082h, c.h.a.h.n.e.y(this.f27082h) + 1);
                    this.w = gridLayoutManager;
                    this.myRecyclerView.setLayoutManager(gridLayoutManager);
                    recyclerView = this.myRecyclerView;
                    cVar = new a.y.e.c();
                    recyclerView.setItemAnimator(cVar);
                }
            }
            if (this.f27082h != null) {
                c.h.a.i.q.f fVar = new c.h.a.i.q.f(this.f27082h);
                ArrayList<c.h.a.i.f> arrayListW0 = fVar.W0("0", "movie");
                this.H = new ArrayList<>();
                this.I = new ArrayList<>();
                this.J = new ArrayList<>();
                this.K = new ArrayList<>();
                if (fVar.I1(m.z(this.f27082h)) <= 0 || arrayListW0 == null) {
                    this.K = arrayListW0;
                } else {
                    ArrayList<String> arrayListK0 = K0();
                    this.G = arrayListK0;
                    if (arrayListK0 != null) {
                        this.J = L0(arrayListW0, arrayListK0);
                    }
                    this.K = this.J;
                }
                b();
                ArrayList<c.h.a.i.f> arrayList = this.K;
                if (arrayList == null || this.myRecyclerView == null || arrayList.size() == 0) {
                    ProgressDialog progressDialog = this.p;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                    }
                    TextView textView = this.tvNoStream;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                } else {
                    ProgressDialog progressDialog2 = this.p;
                    if (progressDialog2 != null) {
                        progressDialog2.dismiss();
                    }
                    VodAdapter vodAdapter = new VodAdapter(arrayListW0, this.f27082h, true);
                    this.y = vodAdapter;
                    this.myRecyclerView.setAdapter(vodAdapter);
                }
            }
            ProgressDialog progressDialog3 = this.p;
            if (progressDialog3 != null) {
                progressDialog3.dismiss();
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public final ArrayList<String> K0() {
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.f27087m.d1(m.z(this.f27082h));
        this.H = arrayListD1;
        if (arrayListD1 != null) {
            for (c.h.a.i.q.i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.G.add(iVar.b());
                }
            }
        }
        return this.G;
    }

    public final ArrayList<c.h.a.i.f> L0(ArrayList<c.h.a.i.f> arrayList, ArrayList<String> arrayList2) {
        ArrayList<c.h.a.i.f> arrayList3;
        if (arrayList == null) {
            return null;
        }
        for (c.h.a.i.f fVar : arrayList) {
            boolean z = false;
            if (arrayList2 != null) {
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
                if (!z && (arrayList3 = this.I) != null) {
                    arrayList3.add(fVar);
                }
            }
        }
        return this.I;
    }

    public final void M0() {
        this.f27082h = this;
        this.f27087m = new c.h.a.i.q.f(this.f27082h);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f27082h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f27082h, c.h.a.h.n.e.y(this.f27082h) + 1);
        this.w = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        SharedPreferences sharedPreferences = this.f27082h.getSharedPreferences("loginPrefs", 0);
        this.x = sharedPreferences;
        sharedPreferences.getString("username", BuildConfig.FLAVOR);
        this.x.getString("password", BuildConfig.FLAVOR);
        Q0();
    }

    public final void N0() {
        this.f27082h = this;
        this.f27087m = new c.h.a.i.q.f(this.f27082h);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f27082h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f27082h);
        this.w = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        SharedPreferences sharedPreferences = this.f27082h.getSharedPreferences("loginPrefs", 0);
        this.x = sharedPreferences;
        sharedPreferences.getString("username", BuildConfig.FLAVOR);
        this.x.getString("password", BuildConfig.FLAVOR);
        Q0();
    }

    public final void O0(ArrayList<c.h.a.i.e> arrayList) {
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f27082h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        this.F = new c.h.a.k.d.a.a(this.f27082h).A().equals(c.h.a.h.n.a.s0) ? new GridLayoutManager(this, 2) : new GridLayoutManager(this, 2);
        this.myRecyclerView.setLayoutManager(this.F);
        this.myRecyclerView.setHasFixedSize(true);
        b();
        VodSubCatAdpaterNew vodSubCatAdpaterNew = new VodSubCatAdpaterNew(arrayList, this.f27082h, this.f27087m);
        this.t = vodSubCatAdpaterNew;
        this.myRecyclerView.setAdapter(vodSubCatAdpaterNew);
    }

    public final void P0(ArrayList<c.h.a.i.e> arrayList) {
        O0(arrayList);
    }

    public final void Q0() {
        TextView textView;
        try {
            if (this.f27082h != null) {
                c.h.a.i.q.f fVar = new c.h.a.i.q.f(this.f27082h);
                if (!this.q.equals("-1")) {
                    if (this.q.equals("0")) {
                        this.H = new ArrayList<>();
                        this.I = new ArrayList<>();
                        this.J = new ArrayList<>();
                        this.K = new ArrayList<>();
                        ArrayList<c.h.a.i.f> arrayListW0 = fVar.W0(this.q, "movie");
                        if (fVar.I1(m.z(this.f27082h)) <= 0 || arrayListW0 == null) {
                            this.K = arrayListW0;
                        } else {
                            ArrayList<String> arrayListK0 = K0();
                            this.G = arrayListK0;
                            if (arrayListK0 != null) {
                                this.J = L0(arrayListW0, arrayListK0);
                            }
                            this.K = this.J;
                        }
                        b();
                        ProgressDialog progressDialog = this.p;
                        if (progressDialog != null) {
                            progressDialog.dismiss();
                        }
                        ArrayList<c.h.a.i.f> arrayList = this.K;
                        if (arrayList == null || this.myRecyclerView == null || arrayList.size() == 0) {
                            textView = this.tvNoStream;
                            if (textView != null) {
                                textView.setVisibility(0);
                            }
                        } else {
                            VodAdapter vodAdapter = new VodAdapter(this.K, this.f27082h, true);
                            this.y = vodAdapter;
                            this.myRecyclerView.setAdapter(vodAdapter);
                            c.h.a.h.n.e.m0(this.f27082h, getResources().getString(R.string.use_long_press));
                        }
                    } else {
                        ArrayList<c.h.a.i.f> arrayListW02 = fVar.W0(this.q, "movie");
                        b();
                        ProgressDialog progressDialog2 = this.p;
                        if (progressDialog2 != null) {
                            progressDialog2.dismiss();
                        }
                        if (arrayListW02 == null || this.myRecyclerView == null || arrayListW02.size() == 0) {
                            textView = this.tvNoStream;
                            if (textView != null) {
                                textView.setVisibility(0);
                            }
                        } else {
                            VodAdapter vodAdapter2 = new VodAdapter(arrayListW02, this.f27082h, true);
                            this.y = vodAdapter2;
                            this.myRecyclerView.setAdapter(vodAdapter2);
                        }
                    }
                }
            }
            ProgressDialog progressDialog3 = this.p;
            if (progressDialog3 != null) {
                progressDialog3.dismiss();
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public final void R0(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.sort_layout, (RelativeLayout) activity.findViewById(R.id.rl_password_prompt));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.C = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.C.setWidth(-1);
            this.C.setHeight(-1);
            this.C.setFocusable(true);
            this.C.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(R.id.bt_save_password);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.rg_radio);
            RadioButton radioButton = (RadioButton) viewInflate.findViewById(R.id.rb_normal);
            RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(R.id.rb_lastadded);
            RadioButton radioButton3 = (RadioButton) viewInflate.findViewById(R.id.rb_atoz);
            RadioButton radioButton4 = (RadioButton) viewInflate.findViewById(R.id.rb_ztoa);
            String string = this.D.getString("sort", BuildConfig.FLAVOR);
            if (string.equals("1")) {
                radioButton2.setChecked(true);
            } else if (string.equals("2")) {
                radioButton3.setChecked(true);
            } else if (string.equals("3")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new a());
            button.setOnClickListener(new b(radioGroup, viewInflate));
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    public void b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ProgressBar progressBar;
        VodAdapterNewFlow vodAdapterNewFlow = this.A;
        if (vodAdapterNewFlow != null && (progressBar = f27081g) != null) {
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
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("sort", 0);
        this.D = sharedPreferences;
        this.E = sharedPreferences.edit();
        if (this.D.getString("sort", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.E.putString("sort", "0");
            this.E.commit();
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.q = intent.getStringExtra("category_id");
            this.r = intent.getStringExtra("category_name");
        }
        this.f27082h = this;
        this.A = new VodAdapterNewFlow();
        this.logo.setOnClickListener(new c());
        c.h.a.i.q.f fVar = new c.h.a.i.q.f(this.f27082h);
        this.f27087m = fVar;
        f27079e = fVar.Z0(this.q);
        setContentView(R.layout.activity_vod_new_flow_subcategories);
        ButterKnife.a(this);
        a();
        this.B = true;
        P0(f27079e);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(R.drawable.black_background));
        }
        I0();
        v0((Toolbar) findViewById(R.id.toolbar));
        this.f27082h = this;
        if (!this.r.isEmpty()) {
            this.vodCategoryName.setText(this.r);
        }
        this.vodCategoryName.setSelected(true);
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
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i3 = 0; i3 < this.toolbar.getChildCount(); i3++) {
            if (this.toolbar.getChildAt(i3) instanceof ActionMenuView) {
                ((Toolbar.e) this.toolbar.getChildAt(i3).getLayoutParams()).f135a = 16;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x020d, code lost:
    
        if (r1.size() > 0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0214  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r12) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSecondSubCategories.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        c.h.a.h.n.e.g(this.f27082h);
        getWindow().setFlags(1024, 1024);
        this.A.s0(f27081g);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f27083i = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f27083i.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f27082h != null) {
            b();
        }
    }
}
