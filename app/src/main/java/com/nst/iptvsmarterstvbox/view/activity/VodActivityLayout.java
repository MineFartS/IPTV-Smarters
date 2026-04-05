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
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
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
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.adapter.VodAdapter;
import com.nst.iptvsmarterstvbox.view.adapter.VodSubCatAdpaterNew;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class VodActivityLayout extends a.b.k.c implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList<c.h.a.i.e> f27024d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ArrayList<c.h.a.i.e> f27025e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static ArrayList<c.h.a.i.e> f27026f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static ProgressBar f27027g;
    public SharedPreferences A;
    public SharedPreferences.Editor B;
    public PopupWindow C;
    public MenuItem D;
    public Menu E;

    @BindView
    public AppBarLayout appbarToolbar;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f27028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SharedPreferences f27029i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.f f27033m;

    @BindView
    public RecyclerView myRecyclerView;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SearchView f27035o;
    public ProgressDialog p;

    @BindView
    public ProgressBar pbLoader;
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
    public VodAdapter x;
    public VodSubCatAdpaterNew z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f27030j = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f27031k = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.b f27032l = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.h.a.i.q.b f27034n = new c.h.a.i.q.b();
    public String q = BuildConfig.FLAVOR;
    public String r = BuildConfig.FLAVOR;
    public boolean s = false;
    public ArrayList<c.h.a.i.f> y = new ArrayList<>();

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(VodActivityLayout.this.f27028h);
        }
    }

    public class c implements SearchView.l {
        public c() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            VodActivityLayout.this.tvNoRecordFound.setVisibility(8);
            if (VodActivityLayout.this.x == null || (textView = VodActivityLayout.this.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            VodActivityLayout.this.x.t0(str, VodActivityLayout.this.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(VodActivityLayout.this.f27028h);
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
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

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodActivityLayout.this.C.dismiss();
        }
    }

    public class i implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f27044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f27045c;

        public i(RadioGroup radioGroup, View view) {
            this.f27044b = radioGroup;
            this.f27045c = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor;
            String str;
            RadioButton radioButton = (RadioButton) this.f27045c.findViewById(this.f27044b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(VodActivityLayout.this.getResources().getString(R.string.sort_last_added))) {
                editor = VodActivityLayout.this.B;
                str = "1";
            } else if (radioButton.getText().toString().equals(VodActivityLayout.this.getResources().getString(R.string.sort_atoz))) {
                editor = VodActivityLayout.this.B;
                str = "2";
            } else if (radioButton.getText().toString().equals(VodActivityLayout.this.getResources().getString(R.string.sort_ztoa))) {
                editor = VodActivityLayout.this.B;
                str = "3";
            } else {
                editor = VodActivityLayout.this.B;
                str = "0";
            }
            editor.putString("sort", str);
            VodActivityLayout.this.B.commit();
            VodActivityLayout vodActivityLayout = VodActivityLayout.this;
            vodActivityLayout.t = vodActivityLayout.getSharedPreferences("listgridview", 0);
            VodActivityLayout vodActivityLayout2 = VodActivityLayout.this;
            vodActivityLayout2.u = vodActivityLayout2.t.edit();
            int i2 = VodActivityLayout.this.t.getInt("vod", 0);
            c.h.a.h.n.a.v = i2;
            if (i2 == 1) {
                VodActivityLayout.this.K0();
            } else {
                VodActivityLayout.this.J0();
            }
            VodActivityLayout.this.C.dismiss();
        }
    }

    public final void H0() {
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

    public void I0() {
        RecyclerView recyclerView;
        a.y.e.c cVar;
        a();
        SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
        this.t = sharedPreferences;
        this.u = sharedPreferences.edit();
        int i2 = this.t.getInt("vod", 0);
        c.h.a.h.n.a.v = i2;
        this.f27028h = this;
        if (i2 == 1) {
            this.f27033m = new c.h.a.i.q.f(this.f27028h);
            RecyclerView recyclerView2 = this.myRecyclerView;
            if (recyclerView2 != null && this.f27028h != null) {
                recyclerView2.setHasFixedSize(true);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f27028h);
                this.v = linearLayoutManager;
                this.myRecyclerView.setLayoutManager(linearLayoutManager);
                recyclerView = this.myRecyclerView;
                cVar = new a.y.e.c();
                recyclerView.setItemAnimator(cVar);
            }
        } else {
            this.f27033m = new c.h.a.i.q.f(this.f27028h);
            RecyclerView recyclerView3 = this.myRecyclerView;
            if (recyclerView3 != null && this.f27028h != null) {
                recyclerView3.setHasFixedSize(true);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f27028h, c.h.a.h.n.e.y(this.f27028h) + 2);
                this.v = gridLayoutManager;
                this.myRecyclerView.setLayoutManager(gridLayoutManager);
                recyclerView = this.myRecyclerView;
                cVar = new a.y.e.c();
                recyclerView.setItemAnimator(cVar);
            }
        }
        if (this.f27028h != null) {
            ArrayList<c.h.a.i.f> arrayListW0 = new c.h.a.i.q.f(this.f27028h).W0("0", "movie");
            b();
            if (arrayListW0 == null || this.myRecyclerView == null || arrayListW0.size() == 0) {
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
                this.x = new VodAdapter(arrayListW0, this.f27028h, true);
                c.h.a.h.n.e.m0(this.f27028h, getResources().getString(R.string.use_long_press));
                this.myRecyclerView.setAdapter(this.x);
            }
        }
        ProgressDialog progressDialog3 = this.p;
        if (progressDialog3 != null) {
            progressDialog3.dismiss();
        }
    }

    public final void J0() {
        this.f27028h = this;
        this.f27033m = new c.h.a.i.q.f(this.f27028h);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f27028h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f27028h, c.h.a.h.n.e.y(this.f27028h) + 2);
        this.v = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        SharedPreferences sharedPreferences = this.f27028h.getSharedPreferences("loginPrefs", 0);
        this.w = sharedPreferences;
        sharedPreferences.getString("username", BuildConfig.FLAVOR);
        this.w.getString("password", BuildConfig.FLAVOR);
        N0();
    }

    public final void K0() {
        this.f27028h = this;
        this.f27033m = new c.h.a.i.q.f(this.f27028h);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f27028h == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f27028h);
        this.v = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        SharedPreferences sharedPreferences = this.f27028h.getSharedPreferences("loginPrefs", 0);
        this.w = sharedPreferences;
        sharedPreferences.getString("username", BuildConfig.FLAVOR);
        this.w.getString("password", BuildConfig.FLAVOR);
        N0();
    }

    public void L0(ProgressBar progressBar) {
        f27027g = progressBar;
    }

    public final void M0() {
        SharedPreferences sharedPreferences = getSharedPreferences("listgridview", 0);
        this.t = sharedPreferences;
        this.u = sharedPreferences.edit();
        int i2 = this.t.getInt("vod", 0);
        c.h.a.h.n.a.v = i2;
        if (i2 == 1) {
            K0();
        } else {
            J0();
        }
    }

    public final void N0() {
        if (this.f27028h != null) {
            c.h.a.i.q.f fVar = new c.h.a.i.q.f(this.f27028h);
            if (!this.q.equals("-1")) {
                ArrayList<c.h.a.i.f> arrayListW0 = fVar.W0(this.q, "movie");
                b();
                ProgressDialog progressDialog = this.p;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                if (arrayListW0 == null || this.myRecyclerView == null || arrayListW0.size() == 0) {
                    TextView textView = this.tvNoStream;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                } else {
                    VodAdapter vodAdapter = new VodAdapter(arrayListW0, this.f27028h, true);
                    this.x = vodAdapter;
                    this.myRecyclerView.setAdapter(vodAdapter);
                    c.h.a.h.n.e.m0(this.f27028h, getResources().getString(R.string.use_long_press));
                }
            }
        }
        ProgressDialog progressDialog2 = this.p;
        if (progressDialog2 != null) {
            progressDialog2.dismiss();
        }
    }

    public final void O0(Activity activity) {
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
            String string = this.A.getString("sort", BuildConfig.FLAVOR);
            if (string.equals("1")) {
                radioButton2.setChecked(true);
            } else if (string.equals("2")) {
                radioButton3.setChecked(true);
            } else if (string.equals("3")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new h());
            button.setOnClickListener(new i(radioGroup, viewInflate));
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

    @Override // a.b.k.c, a.i.h.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 82 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ProgressBar progressBar;
        VodSubCatAdpaterNew vodSubCatAdpaterNew = this.z;
        if (vodSubCatAdpaterNew != null && (progressBar = f27027g) != null) {
            vodSubCatAdpaterNew.s0(progressBar);
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
        SharedPreferences sharedPreferences = getSharedPreferences("sort", 0);
        this.A = sharedPreferences;
        this.B = sharedPreferences.edit();
        if (this.A.getString("sort", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.B.putString("sort", "0");
            this.B.commit();
        }
        getWindow().setFlags(1024, 1024);
        Intent intent = getIntent();
        if (intent != null) {
            this.q = intent.getStringExtra("category_id");
            this.r = intent.getStringExtra("category_name");
        }
        this.f27028h = this;
        this.z = new VodSubCatAdpaterNew();
        this.f27033m = new c.h.a.i.q.f(this.f27028h);
        setContentView(R.layout.activity_vod_layout);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        ButterKnife.a(this);
        a();
        M0();
        H0();
        v0((Toolbar) findViewById(R.id.toolbar));
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(R.drawable.black_background));
        }
        this.f27028h = this;
        if (!this.r.isEmpty()) {
            this.vodCategoryName.setText(this.r);
        }
        this.vodCategoryName.setSelected(true);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.x(R.menu.menu_search_text_icon);
        this.E = menu;
        this.D = menu.getItem(2).getSubMenu().findItem(R.id.empty);
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
        Menu menu = this.E;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(R.id.empty, 0);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e1, code lost:
    
        if (r1.size() > 0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017f  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r12) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodActivityLayout.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        c.h.a.h.n.e.g(this.f27028h);
        getWindow().setFlags(1024, 1024);
        this.z.s0(f27027g);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f27029i = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f27029i.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f27028h != null) {
            b();
        }
    }
}
