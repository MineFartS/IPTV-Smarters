package minefarts.iptvsmarters.view.activity;

import a.b.k.b;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.k.b.v;
import com.facebook.ads.NativeAd;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class SeriesActivtyNewFlow extends a.b.k.c implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ProgressBar f26381d;
    public List<Object> A;
    public Boolean B;
    public Boolean C;

    @BindView
    public LinearLayout activityLogin;

    @BindView
    public AppBarLayout appbarToolbar;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f26382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f26383f;

    @BindView
    public FrameLayout frameLayout;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView.p f26384g;

    @BindView
    public TextView home;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v f26388k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SearchView f26389l;

    @BindView
    public ImageView logo;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Handler f26390m;

    @BindView
    public RecyclerView myRecyclerView;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MenuItem f26391n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Menu f26392o;
    public c.h.a.i.q.f p;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public ProgressBar pbPagingLoader;
    public ArrayList<c.h.a.i.q.i> q;
    public ArrayList<c.h.a.i.e> r;

    @BindView
    public RelativeLayout rl_vod_layout;
    public ArrayList<c.h.a.i.e> s;
    public ArrayList<c.h.a.i.e> t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;
    public ArrayList<c.h.a.i.e> u;
    public PopupWindow w;
    public c.h.a.i.q.l y;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f26385h = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f26386i = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.b f26387j = new c.h.a.i.q.b();
    public int v = -1;
    public ArrayList<String> x = new ArrayList<>();
    public ArrayList<NativeAd> z = new ArrayList<>();

    public class a implements SearchView.l {
        public a() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            c.h.a.h.n.a.T = str.length() > 0 ? Boolean.FALSE : Boolean.TRUE;
            SeriesActivtyNewFlow.this.tvNoRecordFound.setVisibility(8);
            if (SeriesActivtyNewFlow.this.f26388k == null || (textView = SeriesActivtyNewFlow.this.tvNoRecordFound) == null || textView.getVisibility() == 0) {
                return false;
            }
            SeriesActivtyNewFlow.this.f26388k.m0(str, SeriesActivtyNewFlow.this.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivtyNewFlow.this.w.dismiss();
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f26395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f26396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f26397d;

        public c(RadioGroup radioGroup, View view, Activity activity) {
            this.f26395b = radioGroup;
            this.f26396c = view;
            this.f26397d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activity;
            String str;
            RadioButton radioButton = (RadioButton) this.f26396c.findViewById(this.f26395b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(SeriesActivtyNewFlow.this.getResources().getString(R.string.sort_atoz))) {
                activity = this.f26397d;
                str = "1";
            } else if (radioButton.getText().toString().equals(SeriesActivtyNewFlow.this.getResources().getString(R.string.sort_ztoa))) {
                activity = this.f26397d;
                str = "2";
            } else {
                activity = this.f26397d;
                str = "0";
            }
            c.h.a.i.q.m.n0(str, activity);
            SeriesActivtyNewFlow.this.w.dismiss();
            SeriesActivtyNewFlow.this.new m().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivtyNewFlow.this.f26382e.startActivity(new Intent(SeriesActivtyNewFlow.this.f26382e, (Class<?>) NewDashboardActivity.class));
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(SeriesActivtyNewFlow.this.f26382e);
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(SeriesActivtyNewFlow.this.f26382e);
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(SeriesActivtyNewFlow.this.f26382e);
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

    public class l implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26407b;

        public l(View view) {
            this.f26407b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26407b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26407b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26407b, "scaleY", f2);
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
    public class m extends AsyncTask<String, Void, Boolean> {
        public m() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return SeriesActivtyNewFlow.this.J0();
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (!new c.h.a.k.d.a.a(SeriesActivtyNewFlow.this.f26382e).A().equals(c.h.a.h.n.a.s0)) {
                if (SeriesActivtyNewFlow.this.B.booleanValue()) {
                    SeriesActivtyNewFlow.this.I0();
                    return;
                }
                c.h.a.h.n.e.a(SeriesActivtyNewFlow.this.f26382e).booleanValue();
            }
            SeriesActivtyNewFlow.this.K0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public SeriesActivtyNewFlow() {
        Boolean bool = Boolean.FALSE;
        this.B = bool;
        this.C = bool;
    }

    public final void F0() {
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

    public final ArrayList<String> G0() {
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.p.d1(c.h.a.i.q.m.z(this.f26382e));
        this.q = arrayListD1;
        if (arrayListD1 != null) {
            for (c.h.a.i.q.i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.x.add(iVar.b());
                }
            }
        }
        return this.x;
    }

    public final ArrayList<c.h.a.i.e> H0(ArrayList<c.h.a.i.e> arrayList, ArrayList<String> arrayList2) {
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
                if (!z && (arrayList3 = this.r) != null) {
                    arrayList3.add(eVar);
                }
            }
        }
        return this.r;
    }

    public final void I0() {
        if (this.z.size() <= 0) {
            K0();
            return;
        }
        List<Object> list = this.A;
        if (list != null && list.size() > 0) {
            Iterator<Object> it = this.A.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof NativeAd) {
                    Log.e("ads", "ads already exists");
                    K0();
                    return;
                }
            }
            int size = this.A.size() / this.z.size();
            Iterator<NativeAd> it2 = this.z.iterator();
            int i2 = size;
            while (it2.hasNext()) {
                try {
                    this.A.add(i2, it2.next());
                    i2 += size;
                } catch (Exception unused) {
                }
            }
        }
        K0();
    }

    public final Boolean J0() {
        try {
            if (this.f26382e != null) {
                this.r = new ArrayList<>();
                this.s = new ArrayList<>();
                this.A = new ArrayList();
                this.myRecyclerView.setVisibility(0);
                this.p = new c.h.a.i.q.f(this.f26382e);
                this.q = new ArrayList<>();
                this.t = new ArrayList<>();
                this.u = new ArrayList<>();
                this.u = this.p.j1();
                c.h.a.i.e eVar = new c.h.a.i.e();
                c.h.a.i.e eVar2 = new c.h.a.i.e();
                c.h.a.i.e eVar3 = new c.h.a.i.e();
                c.h.a.i.e eVar4 = new c.h.a.i.e();
                eVar.g("0");
                eVar.h(getResources().getString(R.string.all));
                eVar2.g("-1");
                eVar2.h(getResources().getString(R.string.favourites));
                this.v = this.p.X1("-5");
                this.y = new c.h.a.i.q.l(this.f26382e);
                int i2 = this.v;
                if (i2 != 0 && i2 > 0) {
                    eVar3.g("-5");
                    eVar3.h(getResources().getString(R.string.uncategories));
                    ArrayList<c.h.a.i.e> arrayList = this.u;
                    arrayList.add(arrayList.size(), eVar3);
                }
                eVar4.g("-4");
                eVar4.h(getResources().getString(R.string.recent_watch));
                if (this.p.I1(c.h.a.i.q.m.z(this.f26382e)) > 0 && this.u != null) {
                    ArrayList<String> arrayListG0 = G0();
                    this.x = arrayListG0;
                    ArrayList<c.h.a.i.e> arrayListH0 = H0(this.u, arrayListG0);
                    this.s = arrayListH0;
                    this.u = arrayListH0;
                }
                this.u.add(0, eVar);
                this.u.add(1, eVar2);
                eVar4.g("-4");
                eVar4.h(getResources().getString(R.string.recent_watch));
                this.u.add(2, eVar4);
                if (this.u != null) {
                    for (int i3 = 0; i3 < this.u.size(); i3++) {
                        this.A.add(new c.h.a.k.b.m(this.u.get(i3).c(), this.u.get(i3).b(), this.u.get(i3).a(), this.u.get(i3).d(), this.u.get(i3).e()));
                    }
                }
            }
            return Boolean.TRUE;
        } catch (NullPointerException unused) {
            return Boolean.FALSE;
        } catch (Exception unused2) {
            return Boolean.FALSE;
        }
    }

    public final void K0() {
        if (this.u != null) {
            this.f26388k = new v(this.A, this.f26382e);
            this.myRecyclerView.setItemAnimator(new a.y.e.c());
            this.myRecyclerView.setAdapter(this.f26388k);
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public final void L0(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.sort_layout, (RelativeLayout) activity.findViewById(R.id.rl_password_prompt));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.w = popupWindow;
            popupWindow.setContentView(viewInflate);
            byte b2 = -1;
            this.w.setWidth(-1);
            this.w.setHeight(-1);
            this.w.setFocusable(true);
            this.w.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(R.id.bt_save_password);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.rg_radio);
            RadioButton radioButton = (RadioButton) viewInflate.findViewById(R.id.rb_normal);
            RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(R.id.rb_lastadded);
            radioButton2.setVisibility(8);
            RadioButton radioButton3 = (RadioButton) viewInflate.findViewById(R.id.rb_atoz);
            RadioButton radioButton4 = (RadioButton) viewInflate.findViewById(R.id.rb_ztoa);
            RadioButton radioButton5 = (RadioButton) viewInflate.findViewById(R.id.rb_channel_asc);
            radioButton5.setVisibility(8);
            RadioButton radioButton6 = (RadioButton) viewInflate.findViewById(R.id.rb_channel_desc);
            radioButton6.setVisibility(8);
            radioButton.setOnFocusChangeListener(new l(radioButton));
            radioButton2.setOnFocusChangeListener(new l(radioButton2));
            radioButton3.setOnFocusChangeListener(new l(radioButton3));
            radioButton4.setOnFocusChangeListener(new l(radioButton4));
            radioButton5.setOnFocusChangeListener(new l(radioButton5));
            radioButton6.setOnFocusChangeListener(new l(radioButton6));
            String strH = c.h.a.i.q.m.H(activity);
            int iHashCode = strH.hashCode();
            if (iHashCode != 49) {
                if (iHashCode == 50 && strH.equals("2")) {
                    b2 = 1;
                }
            } else if (strH.equals("1")) {
                b2 = 0;
            }
            if (b2 == 0) {
                radioButton3.setChecked(true);
            } else if (b2 != 1) {
                radioButton.setChecked(true);
            } else {
                radioButton4.setChecked(true);
            }
            button2.setOnClickListener(new b());
            button.setOnClickListener(new c(radioGroup, viewInflate, activity));
        } catch (NullPointerException | Exception unused) {
        }
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
        ProgressBar progressBar;
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setClickable(true);
        }
        v vVar = this.f26388k;
        if (vVar != null && (progressBar = f26381d) != null) {
            vVar.q0(progressBar);
        }
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_bt_up) {
            new m().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            if (id != R.id.tv_header_title) {
                return;
            }
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    @SuppressLint({"ApplySharedPref"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_series_activty_new_flow);
        ButterKnife.a(this);
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(R.drawable.black_background));
        }
        c.h.a.h.n.a.T = Boolean.FALSE;
        F0();
        v0((Toolbar) findViewById(R.id.toolbar));
        getWindow().setFlags(1024, 1024);
        this.f26382e = this;
        Handler handler = new Handler();
        this.f26390m = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.myRecyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        this.f26384g = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setVisibility(0);
        new m().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.home.setOnClickListener(new d());
        this.frameLayout.setVisibility(8);
        this.logo.setOnClickListener(new e());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.x(R.menu.menu_search);
        this.f26392o = menu;
        this.f26391n = menu.getItem(2).getSubMenu().findItem(R.id.empty);
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
        Menu menu = this.f26392o;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(R.id.empty, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f26391n = menuItem;
        this.toolbar.e();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout1 && (context = this.f26382e) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new g()).g(getResources().getString(R.string.no), new f()).n();
        }
        if (itemId == R.id.menu_load_channels_vod1) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f26382e.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f26382e.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f26382e.getResources().getString(R.string.yes), new h());
            aVar.g(this.f26382e.getResources().getString(R.string.no), new i());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide1) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.f26382e.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.f26382e.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.f26382e.getResources().getString(R.string.yes), new j());
            aVar2.g(this.f26382e.getResources().getString(R.string.no), new k());
            aVar2.n();
        }
        if (itemId != R.id.action_search) {
            if (itemId == R.id.menu_sort) {
                L0(this);
                b();
            }
            return super.onOptionsItemSelected(menuItem);
        }
        SearchView searchView = (SearchView) a.i.r.j.b(menuItem);
        this.f26389l = searchView;
        searchView.setQueryHint(getResources().getString(R.string.search_series_category));
        this.f26389l.setIconifiedByDefault(false);
        this.f26389l.setOnQueryTextListener(new a());
        return true;
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        ProgressBar progressBar;
        super.onResume();
        c.h.a.h.n.e.g(this.f26382e);
        getWindow().setFlags(1024, 1024);
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        v vVar = this.f26388k;
        if (vVar != null && (progressBar = f26381d) != null) {
            vVar.q0(progressBar);
            this.f26388k.w();
        }
        v vVar2 = this.f26388k;
        if (vVar2 != null) {
            vVar2.w();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26383f = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f26383f.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f26382e != null) {
            b();
        }
    }
}
