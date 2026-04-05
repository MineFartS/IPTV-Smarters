package minefarts.iptvsmarters.view.activity;

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
import c.h.a.k.b.y;
import com.facebook.ads.NativeAd;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class TVArchiveActivityNewFlow extends a.b.k.c implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ProgressBar f26825d;
    public SharedPreferences A;
    public SharedPreferences.Editor B;
    public SearchView D;
    public Handler E;
    public MenuItem F;
    public Menu G;
    public List<Object> J;
    public Boolean K;
    public Boolean L;

    @BindView
    public AppBarLayout appbarToolbar;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f26826e;

    @BindView
    public TextView emptyView;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f26827f;

    @BindView
    public FrameLayout frameLayout;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GridLayoutManager f26828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y f26829h;

    @BindView
    public ImageView ivBTUP;

    @BindView
    public ImageView iv_back_button;

    @BindView
    public ImageView logo;

    @BindView
    public RecyclerView myRecyclerView;
    public c.h.a.i.q.f p;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public ProgressBar pbPagingLoader;
    public ArrayList<c.h.a.i.q.i> q;
    public ArrayList<c.h.a.i.e> r;
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

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26830i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f26831j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26832k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f26833l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f26834m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f26835n = 20;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<String> f26836o = new ArrayList<>();
    public String w = BuildConfig.FLAVOR;
    public String x = BuildConfig.FLAVOR;
    public c.h.a.i.q.b y = new c.h.a.i.q.b();
    public c.h.a.i.q.b z = new c.h.a.i.q.b();
    public ArrayList<c.h.a.i.e> C = new ArrayList<>();
    public AsyncTask H = null;
    public ArrayList<NativeAd> I = new ArrayList<>();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(TVArchiveActivityNewFlow.this.f26826e);
        }
    }

    public class b extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f26838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f26839c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f26840d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f26841e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f26842f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RadioGroup f26843g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f26844h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public View f26846b;

            public a(View view) {
                this.f26846b = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            @SuppressLint({"ResourceType"})
            public void onFocusChange(View view, boolean z) {
                int i2;
                LinearLayout linearLayout;
                if (z) {
                    View view2 = this.f26846b;
                    i2 = R.drawable.blue_btn_effect;
                    if (view2 == null || view2.getTag() == null || !this.f26846b.getTag().equals("1")) {
                        View view3 = this.f26846b;
                        if (view3 == null || view3.getTag() == null || !this.f26846b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = b.this.f26842f;
                    }
                    linearLayout = b.this.f26841e;
                } else {
                    View view4 = this.f26846b;
                    i2 = R.drawable.black_button_dark;
                    if (view4 == null || view4.getTag() == null || !this.f26846b.getTag().equals("1")) {
                        View view5 = this.f26846b;
                        if (view5 == null || view5.getTag() == null || !this.f26846b.getTag().equals("2")) {
                            return;
                        }
                        linearLayout = b.this.f26842f;
                    }
                    linearLayout = b.this.f26841e;
                }
                linearLayout.setBackgroundResource(i2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, Activity activity2) {
            super(activity);
            this.f26844h = activity2;
            this.f26838b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TVArchiveActivityNewFlow tVArchiveActivityNewFlow;
            int id = view.getId();
            if (id == R.id.btn_no) {
                dismiss();
            } else if (id == R.id.btn_yes) {
                try {
                    RadioButton radioButton = (RadioButton) findViewById(this.f26843g.getCheckedRadioButtonId());
                    if (radioButton.getText().toString().equals(this.f26844h.getResources().getString(R.string.sort_atoz))) {
                        TVArchiveActivityNewFlow.this.B.putString("sort", "1");
                        tVArchiveActivityNewFlow = TVArchiveActivityNewFlow.this;
                    } else if (radioButton.getText().toString().equals(this.f26844h.getResources().getString(R.string.sort_ztoa))) {
                        TVArchiveActivityNewFlow.this.B.putString("sort", "2");
                        tVArchiveActivityNewFlow = TVArchiveActivityNewFlow.this;
                    } else {
                        TVArchiveActivityNewFlow.this.B.putString("sort", "0");
                        tVArchiveActivityNewFlow = TVArchiveActivityNewFlow.this;
                    }
                    tVArchiveActivityNewFlow.B.commit();
                    TVArchiveActivityNewFlow.this.H = TVArchiveActivityNewFlow.this.new l().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
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
            this.f26839c = (TextView) findViewById(R.id.btn_yes);
            this.f26840d = (TextView) findViewById(R.id.btn_no);
            this.f26840d = (TextView) findViewById(R.id.btn_no);
            this.f26841e = (LinearLayout) findViewById(R.id.ll_no_button_main_layout);
            this.f26842f = (LinearLayout) findViewById(R.id.ll_yes_button_main_layout);
            this.f26843g = (RadioGroup) findViewById(R.id.rg_radio);
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
            radioButton3.setOnFocusChangeListener(TVArchiveActivityNewFlow.this.new k(radioButton3));
            radioButton4.setOnFocusChangeListener(TVArchiveActivityNewFlow.this.new k(radioButton4));
            String string = TVArchiveActivityNewFlow.this.A.getString("sort", BuildConfig.FLAVOR);
            string.hashCode();
            if (string.equals("1")) {
                radioButton3.setChecked(true);
            } else if (string.equals("2")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            this.f26839c.setOnClickListener(this);
            this.f26840d.setOnClickListener(this);
            TextView textView = this.f26839c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f26840d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TVArchiveActivityNewFlow.this.onBackPressed();
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
            c.h.a.h.n.e.O(TVArchiveActivityNewFlow.this.f26826e);
        }
    }

    public class f implements SearchView.l {
        public f() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            c.h.a.h.n.a.T = str.length() > 0 ? Boolean.FALSE : Boolean.TRUE;
            TVArchiveActivityNewFlow.this.tvNoRecordFound.setVisibility(8);
            TVArchiveActivityNewFlow tVArchiveActivityNewFlow = TVArchiveActivityNewFlow.this;
            if (tVArchiveActivityNewFlow.f26829h == null || (textView = tVArchiveActivityNewFlow.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            TVArchiveActivityNewFlow tVArchiveActivityNewFlow2 = TVArchiveActivityNewFlow.this;
            tVArchiveActivityNewFlow2.f26829h.q0(str, tVArchiveActivityNewFlow2.tvNoRecordFound);
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
            c.h.a.h.n.e.N(TVArchiveActivityNewFlow.this.f26826e);
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

    public class k implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26856b;

        public k(View view) {
            this.f26856b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26856b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26856b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26856b, "scaleY", f2);
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

    @SuppressLint({"StaticFieldLeak"})
    public class l extends AsyncTask<String, Void, Boolean> {
        public l() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(TVArchiveActivityNewFlow.this.G0());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            TVArchiveActivityNewFlow.this.H0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public TVArchiveActivityNewFlow() {
        Boolean bool = Boolean.FALSE;
        this.K = bool;
        this.L = bool;
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

    public void F0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public final boolean G0() {
        AsyncTask asyncTask;
        try {
            if (this.f26826e == null) {
                return true;
            }
            this.p = new c.h.a.i.q.f(this.f26826e);
            this.q = new ArrayList<>();
            this.r = new ArrayList<>();
            this.s = new ArrayList<>();
            this.t = new ArrayList<>();
            this.u = new ArrayList<>();
            this.v = new ArrayList<>();
            this.J = new ArrayList();
            this.u = this.p.o1();
            c.h.a.i.e eVar = new c.h.a.i.e();
            eVar.g("0");
            eVar.h(getResources().getString(R.string.all));
            this.u.add(0, eVar);
            this.t = this.u;
            if (!m.f(this.f26826e).equals("m3u")) {
                ArrayList<c.h.a.i.e> arrayList = this.t;
                if (arrayList != null && arrayList.size() > 0) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < this.t.size() && ((asyncTask = this.H) == null || !asyncTask.isCancelled()); i3++) {
                        if (this.t.get(i3).b().equals("0") || this.t.get(i3).b().equals("-1")) {
                            c.h.a.i.e eVar2 = new c.h.a.i.e();
                            eVar2.i(0);
                            eVar2.h(this.t.get(i3).c());
                            eVar2.g(this.t.get(i3).b());
                            this.v.add(i2, eVar2);
                        } else {
                            ArrayList<c.h.a.i.f> arrayListU0 = this.p.U0(this.t.get(i3).b());
                            if (arrayListU0 != null && arrayListU0.size() != 0) {
                                c.h.a.i.e eVar3 = new c.h.a.i.e();
                                eVar3.i(arrayListU0.size());
                                eVar3.h(this.t.get(i3).c());
                                eVar3.g(this.t.get(i3).b());
                                this.v.add(i2, eVar3);
                            }
                        }
                        i2++;
                    }
                }
                ArrayList<c.h.a.i.e> arrayList2 = this.v;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    this.t = this.v;
                }
            }
            if (this.t == null) {
                return true;
            }
            for (int i4 = 0; i4 < this.t.size(); i4++) {
                this.J.add(new c.h.a.k.b.m(this.t.get(i4).c(), this.t.get(i4).b(), this.t.get(i4).a(), this.t.get(i4).d(), this.t.get(i4).e()));
            }
            return true;
        } catch (NullPointerException | Exception unused) {
            return true;
        }
    }

    public final void H0() {
        if (this.t != null) {
            this.f26829h = new y(this.J, this.f26826e);
            this.f26828g = new c.h.a.k.d.a.a(this.f26826e).A().equals(c.h.a.h.n.a.s0) ? new GridLayoutManager(this.f26826e, 2) : new GridLayoutManager(this.f26826e, 2);
            this.myRecyclerView.setLayoutManager(this.f26828g);
            this.myRecyclerView.setItemAnimator(new a.y.e.c());
            this.myRecyclerView.setAdapter(this.f26829h);
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public final void I0(Activity activity) {
        new b((TVArchiveActivityNewFlow) activity, activity).show();
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
        y yVar = this.f26829h;
        if (yVar != null) {
            yVar.t0(f26825d);
            this.f26829h.w();
        }
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_bt_up) {
            this.H = new l().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            if (id != R.id.tv_header_title) {
                return;
            }
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f26826e = this;
        F0();
        super.onCreate(bundle);
        setContentView(R.layout.activity_tv_archive_new_flow);
        ButterKnife.a(this);
        c.h.a.h.n.a.T = Boolean.FALSE;
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(R.drawable.black_background));
        }
        SharedPreferences sharedPreferences = getSharedPreferences("sortcatch", 0);
        this.A = sharedPreferences;
        this.B = sharedPreferences.edit();
        if (this.A.getString("sort", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.B.putString("sort", "0");
            this.B.apply();
        }
        E0();
        v0((Toolbar) findViewById(R.id.toolbar));
        Handler handler = new Handler();
        this.E = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.logo.setOnClickListener(new a());
        this.iv_back_button.setOnClickListener(new c());
        this.H = new l().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.frameLayout.setVisibility(8);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.x(R.menu.menu_search);
        this.G = menu;
        this.F = menu.getItem(2).getSubMenu().findItem(R.id.empty);
        if (m.f(this.f26826e).equals("api")) {
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

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.F = menuItem;
        this.toolbar.e();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout1 && (context = this.f26826e) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new e()).g(getResources().getString(R.string.no), new d()).n();
        }
        if (itemId == R.id.action_search) {
            SearchView searchView = (SearchView) a.i.r.j.b(menuItem);
            this.D = searchView;
            searchView.setQueryHint(getResources().getString(R.string.search_catchup_categories));
            this.D.setIconifiedByDefault(false);
            this.D.setOnQueryTextListener(new f());
            return true;
        }
        if (itemId == R.id.menu_load_channels_vod1) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f26826e.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f26826e.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f26826e.getResources().getString(R.string.yes), new g());
            aVar.g(this.f26826e.getResources().getString(R.string.no), new h());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide1) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.f26826e.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.f26826e.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.f26826e.getResources().getString(R.string.yes), new i());
            aVar2.g(this.f26826e.getResources().getString(R.string.no), new j());
            aVar2.n();
        }
        if (itemId == R.id.menu_sort) {
            I0(this);
            b();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        F0();
        super.onResume();
        c.h.a.h.n.e.g(this.f26826e);
        getWindow().setFlags(1024, 1024);
        this.frameLayout.setVisibility(8);
        y yVar = this.f26829h;
        if (yVar != null) {
            yVar.t0(f26825d);
            this.f26829h.w();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26827f = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f26827f.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f26826e != null) {
            b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        F0();
    }
}
