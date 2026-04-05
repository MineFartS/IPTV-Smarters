package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.b;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
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
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.i.q.m;
import com.facebook.ads.NativeAd;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class NewEPGCategoriesActivity extends a.b.k.c implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ProgressBar f25973d;
    public SearchView C;
    public SharedPreferences D;
    public SharedPreferences.Editor E;
    public MenuItem G;
    public Menu H;
    public List<Object> K;
    public Boolean L;
    public Boolean M;
    public c.h.a.k.d.a.a N;

    @BindView
    public AppBarLayout appbarToolbar;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f25974e;

    @BindView
    public TextView emptyView;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f25975f;

    @BindView
    public FrameLayout frameLayout;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Handler f25976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GridLayoutManager f25977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.k.b.i f25978i;

    @BindView
    public ImageView ivBTUP;

    @BindView
    public ImageView iv_back_button;

    @BindView
    public ImageView logo;

    @BindView
    public RecyclerView myRecyclerView;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public ProgressBar pbPagingLoader;
    public c.h.a.i.q.f q;
    public ArrayList<c.h.a.i.q.i> r;
    public ArrayList<c.h.a.i.e> s;
    public ArrayList<c.h.a.i.e> t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;
    public ArrayList<c.h.a.i.e> u;
    public ArrayList<c.h.a.i.e> v;

    @BindView
    public ViewPager viewpager;
    public ArrayList<c.h.a.i.e> w;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25979j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25980k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f25981l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25982m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f25983n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f25984o = 20;
    public ArrayList<String> p = new ArrayList<>();
    public String x = BuildConfig.FLAVOR;
    public String y = BuildConfig.FLAVOR;
    public c.h.a.i.q.b z = new c.h.a.i.q.b();
    public c.h.a.i.q.b A = new c.h.a.i.q.b();
    public ArrayList<c.h.a.i.e> B = new ArrayList<>();
    public int F = -1;
    public AsyncTask I = null;
    public ArrayList<NativeAd> J = new ArrayList<>();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(NewEPGCategoriesActivity.this.f25974e);
        }
    }

    public class b extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f25986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f25987c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f25988d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f25989e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f25990f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RadioGroup f25991g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f25992h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f25994b;

            public a(View view) {
                this.f25994b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f25994b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f25994b.getTag().equals("1")) {
                        View view3 = this.f25994b;
                        if (view3 == null || view3.getTag() == null || !this.f25994b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = b.this.f25990f;
                    }
                    linearLayout = b.this.f25989e;
                } else {
                    View view4 = this.f25994b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f25994b.getTag().equals("1")) {
                        View view5 = this.f25994b;
                        if (view5 == null || view5.getTag() == null || !this.f25994b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = b.this.f25990f;
                    }
                    linearLayout = b.this.f25989e;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, Activity activity2) {
            super(activity);
            this.f25992h = activity2;
            this.f25986b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewEPGCategoriesActivity newEPGCategoriesActivity;
            int id = view.getId();
            if (id == R.id.btn_no) {
                dismiss();
            } else if (id == R.id.btn_yes) {
                try {
                    RadioButton radioButton = (RadioButton) findViewById(this.f25991g.getCheckedRadioButtonId());
                    if (radioButton.getText().toString().equals(this.f25992h.getResources().getString(R.string.sort_atoz))) {
                        NewEPGCategoriesActivity.this.E.putString("sort", "1");
                        newEPGCategoriesActivity = NewEPGCategoriesActivity.this;
                    } else if (radioButton.getText().toString().equals(this.f25992h.getResources().getString(R.string.sort_ztoa))) {
                        NewEPGCategoriesActivity.this.E.putString("sort", "2");
                        newEPGCategoriesActivity = NewEPGCategoriesActivity.this;
                    } else {
                        NewEPGCategoriesActivity.this.E.putString("sort", "0");
                        newEPGCategoriesActivity = NewEPGCategoriesActivity.this;
                    }
                    newEPGCategoriesActivity.E.commit();
                    NewEPGCategoriesActivity.this.I = NewEPGCategoriesActivity.this.new k().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                    dismiss();
                } catch (Exception unused) {
                }
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(R.layout.live_sorting_layout);
            this.f25987c = (TextView) findViewById(R.id.btn_yes);
            this.f25988d = (TextView) findViewById(R.id.btn_no);
            this.f25988d = (TextView) findViewById(R.id.btn_no);
            this.f25989e = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
            this.f25990f = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
            this.f25991g = (RadioGroup) findViewById(R.id.rg_radio);
            RadioButton radioButton = (RadioButton) findViewById(R.id.rb_normal);
            RadioButton radioButton2 = (RadioButton) findViewById(R.id.rb_lastadded);
            RadioButton radioButton3 = (RadioButton) findViewById(R.id.rb_atoz);
            RadioButton radioButton4 = (RadioButton) findViewById(R.id.rb_ztoa);
            RadioButton radioButton5 = (RadioButton) findViewById(R.id.rb_channel_asc);
            RadioButton radioButton6 = (RadioButton) findViewById(R.id.rb_channel_desc);
            ((RadioButton) findViewById(R.id.rb_top_rated)).setVisibility(8);
            radioButton5.setVisibility(8);
            radioButton6.setVisibility(8);
            radioButton2.setVisibility(8);
            radioButton3.setOnFocusChangeListener(NewEPGCategoriesActivity.this.new l(radioButton3));
            radioButton4.setOnFocusChangeListener(NewEPGCategoriesActivity.this.new l(radioButton4));
            String string = NewEPGCategoriesActivity.this.D.getString("sort", BuildConfig.FLAVOR);
            string.hashCode();
            if (string.equals("1")) {
                radioButton3.setChecked(true);
            } else if (string.equals("2")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            this.f25987c.setOnClickListener(this);
            this.f25988d.setOnClickListener(this);
            TextView textView = this.f25987c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f25988d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewEPGCategoriesActivity.this.onBackPressed();
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
            c.h.a.h.n.e.O(NewEPGCategoriesActivity.this.f25974e);
        }
    }

    public class f implements SearchView.l {
        public f() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            c.h.a.h.n.a.T = str.length() > 0 ? Boolean.FALSE : Boolean.TRUE;
            NewEPGCategoriesActivity.this.tvNoRecordFound.setVisibility(8);
            NewEPGCategoriesActivity newEPGCategoriesActivity = NewEPGCategoriesActivity.this;
            if (newEPGCategoriesActivity.f25978i == null || (textView = newEPGCategoriesActivity.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            NewEPGCategoriesActivity newEPGCategoriesActivity2 = NewEPGCategoriesActivity.this;
            newEPGCategoriesActivity2.f25978i.s0(str, newEPGCategoriesActivity2.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(NewEPGCategoriesActivity.this.f25974e);
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public class k extends AsyncTask<String, Void, Boolean> {
        public k() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(NewEPGCategoriesActivity.this.I0());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            NewEPGCategoriesActivity.this.J0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class l implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26005b;

        public l(View view) {
            this.f26005b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26005b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26005b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26005b, "scaleY", f2);
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

    public NewEPGCategoriesActivity() {
        Boolean bool = Boolean.FALSE;
        this.L = bool;
        this.M = bool;
    }

    public final void E0() {
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

    public final ArrayList<String> F0() {
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.q.d1(m.z(this.f25974e));
        this.r = arrayListD1;
        if (arrayListD1 != null) {
            for (c.h.a.i.q.i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.p.add(iVar.b());
                }
            }
        }
        return this.p;
    }

    public final ArrayList<c.h.a.i.e> G0(ArrayList<c.h.a.i.e> arrayList, ArrayList<String> arrayList2) {
        ArrayList<c.h.a.i.e> arrayList3;
        if (arrayList == null) {
            return null;
        }
        for (c.h.a.i.e eVar : arrayList) {
            boolean z = false;
            if (arrayList2 != null) {
                Iterator<String> it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (eVar.b().equals(it.next())) {
                        z = true;
                        break;
                    }
                }
                if (!z && (arrayList3 = this.s) != null) {
                    arrayList3.add(eVar);
                }
            }
        }
        return this.s;
    }

    @SuppressLint({"InlinedApi"})
    public void H0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I0() {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.NewEPGCategoriesActivity.I0():boolean");
    }

    public final void J0() {
        List<Object> list;
        if (this.u == null || (list = this.K) == null) {
            return;
        }
        this.f25978i = new c.h.a.k.b.i(this.f25974e, list);
        this.f25977h = new c.h.a.k.d.a.a(this.f25974e).A().equals(c.h.a.h.n.a.s0) ? new GridLayoutManager(this.f25974e, 2) : new GridLayoutManager(this.f25974e, 2);
        this.myRecyclerView.setLayoutManager(this.f25977h);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        this.myRecyclerView.setAdapter(this.f25978i);
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public final void K0(Activity activity) {
        new b((NewEPGCategoriesActivity) activity, activity).show();
    }

    public void b() {
    }

    @Override // a.b.k.c, a.i.h.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 82 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.myRecyclerView.setClickable(true);
        c.h.a.k.b.i iVar = this.f25978i;
        if (iVar != null) {
            iVar.w0(f25973d);
            this.f25978i.w();
        }
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_bt_up) {
            this.I = new k().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            if (id != R.id.tv_header_title) {
                return;
            }
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f25974e = this;
        super.onCreate(bundle);
        H0();
        setContentView(R.layout.activity_epg_categories_new_flow);
        ButterKnife.a(this);
        c.h.a.h.n.a.T = Boolean.FALSE;
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(R.drawable.black_background));
        }
        E0();
        v0((Toolbar) findViewById(R.id.toolbar));
        this.N = new c.h.a.k.d.a.a(this.f25974e);
        this.q = new c.h.a.i.q.f(this.f25974e);
        SharedPreferences sharedPreferences = getSharedPreferences("sortepg", 0);
        this.D = sharedPreferences;
        this.E = sharedPreferences.edit();
        if (this.D.getString("sort", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.E.putString("sort", "0");
            this.E.commit();
        }
        Handler handler = new Handler();
        this.f25976g = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.I = new k().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.frameLayout.setVisibility(8);
        this.logo.setOnClickListener(new a());
        this.iv_back_button.setOnClickListener(new c());
        c.h.a.h.n.e.J(this.f25974e);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.x(R.menu.menu_search);
        this.H = menu;
        this.G = menu.getItem(2).getSubMenu().findItem(R.id.empty);
        if (m.f(this.f25974e).equals("api")) {
            menu.getItem(2).getSubMenu().findItem(R.id.menu_load_channels_vod1).setVisible(false);
        }
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

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = this.I;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        this.I.cancel(true);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 82) {
            return super.onKeyUp(i2, keyEvent);
        }
        Menu menu = this.H;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(R.id.empty, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.G = menuItem;
        this.toolbar.e();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout1 && (context = this.f25974e) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new e()).g(getResources().getString(R.string.no), new d()).n();
        }
        if (itemId == R.id.action_search) {
            SearchView searchView = (SearchView) a.i.r.j.b(menuItem);
            this.C = searchView;
            searchView.setQueryHint(getResources().getString(R.string.search_epg_categories));
            this.C.setIconifiedByDefault(false);
            this.C.setOnQueryTextListener(new f());
            return true;
        }
        if (itemId == R.id.menu_load_channels_vod1) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f25974e.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f25974e.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f25974e.getResources().getString(R.string.yes), new g());
            aVar.g(this.f25974e.getResources().getString(R.string.no), new h());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide1) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.f25974e.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.f25974e.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.f25974e.getResources().getString(R.string.yes), new i());
            aVar2.g(this.f25974e.getResources().getString(R.string.no), new j());
            aVar2.n();
        }
        if (itemId == R.id.menu_sort) {
            K0(this);
            b();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        H0();
        super.onResume();
        c.h.a.h.n.e.g(this.f25974e);
        getWindow().setFlags(1024, 1024);
        this.frameLayout.setVisibility(8);
        c.h.a.k.b.i iVar = this.f25978i;
        if (iVar != null) {
            iVar.w0(f25973d);
            this.f25978i.w();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f25975f = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f25975f.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f25974e != null) {
            b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        H0();
    }
}
