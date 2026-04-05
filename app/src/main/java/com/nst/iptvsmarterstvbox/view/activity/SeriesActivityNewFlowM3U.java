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
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdsManager;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class SeriesActivityNewFlowM3U extends a.b.k.c implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ProgressBar f26309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f26310e;
    public Handler A;
    public MenuItem B;
    public Menu C;
    public NativeAdsManager F;
    public List<Object> H;
    public Boolean I;
    public Boolean J;

    @BindView
    public LinearLayout activityLogin;

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button bt_explore_all;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f26311f;

    @BindView
    public FrameLayout frameLayout;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SharedPreferences f26312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RecyclerView.p f26313h;

    @BindView
    public TextView home;

    @BindView
    public ImageView iv_back_button;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.f f26317l;

    @BindView
    public ImageView logo;

    @BindView
    public RecyclerView myRecyclerView;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<c.h.a.i.e> f26319n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<c.h.a.i.e> f26320o;
    public v p;

    @BindView
    public ProgressBar pbLoader;

    @BindView
    public ProgressBar pbPagingLoader;
    public SearchView q;

    @BindView
    public RelativeLayout rl_no_arrangement_found;

    @BindView
    public RelativeLayout rl_vod_layout;
    public ArrayList<c.h.a.i.q.i> s;
    public ArrayList<c.h.a.i.e> t;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvSettings;
    public ArrayList<c.h.a.i.e> u;
    public ArrayList<c.h.a.i.e> v;
    public ArrayList<c.h.a.i.e> w;
    public ArrayList<c.h.a.i.e> x;
    public PopupWindow z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f26314i = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26315j = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.b f26316k = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.b f26318m = new c.h.a.i.q.b();
    public ArrayList<String> r = new ArrayList<>();
    public int y = -1;
    public AsyncTask D = null;
    public int E = 0;
    public ArrayList<NativeAd> G = new ArrayList<>();

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class b implements SearchView.l {
        public b() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            SeriesActivityNewFlowM3U.this.tvNoRecordFound.setVisibility(8);
            if (SeriesActivityNewFlowM3U.this.p == null || (textView = SeriesActivityNewFlowM3U.this.tvNoRecordFound) == null || textView.getVisibility() == 0) {
                return false;
            }
            SeriesActivityNewFlowM3U.this.p.m0(str, SeriesActivityNewFlowM3U.this.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivityNewFlowM3U.this.z.dismiss();
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f26324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f26325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f26326d;

        public d(RadioGroup radioGroup, View view, Activity activity) {
            this.f26324b = radioGroup;
            this.f26325c = view;
            this.f26326d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activity;
            String str;
            RadioButton radioButton = (RadioButton) this.f26325c.findViewById(this.f26324b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(SeriesActivityNewFlowM3U.this.getResources().getString(R.string.sort_atoz))) {
                activity = this.f26326d;
                str = "1";
            } else if (radioButton.getText().toString().equals(SeriesActivityNewFlowM3U.this.getResources().getString(R.string.sort_ztoa))) {
                activity = this.f26326d;
                str = "2";
            } else {
                activity = this.f26326d;
                str = "0";
            }
            c.h.a.i.q.m.n0(str, activity);
            SeriesActivityNewFlowM3U.this.D = SeriesActivityNewFlowM3U.this.new o().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            SeriesActivityNewFlowM3U.this.z.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(SeriesActivityNewFlowM3U.this.f26311f);
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivityNewFlowM3U.this.onBackPressed();
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivityNewFlowM3U.this.f26311f.startActivity(new Intent(SeriesActivityNewFlowM3U.this.f26311f, (Class<?>) NewDashboardActivity.class));
        }
    }

    public class h implements NativeAdsManager.Listener {
        public h() {
        }

        @Override // com.facebook.ads.NativeAdsManager.Listener
        public void onAdError(AdError adError) {
            Log.e("ads", "ads failed");
            SeriesActivityNewFlowM3U.this.N0();
        }

        @Override // com.facebook.ads.NativeAdsManager.Listener
        public void onAdsLoaded() {
            Log.i("fbads", "onAdsLoaded!" + SeriesActivityNewFlowM3U.this.F.getUniqueNativeAdCount());
            int uniqueNativeAdCount = SeriesActivityNewFlowM3U.this.F.getUniqueNativeAdCount();
            for (int i2 = 0; i2 < uniqueNativeAdCount; i2++) {
                SeriesActivityNewFlowM3U.this.I0(i2, SeriesActivityNewFlowM3U.this.F.nextNativeAd());
            }
            if (SeriesActivityNewFlowM3U.this.F.isLoaded()) {
                Log.e("ads", "ads loaded");
                SeriesActivityNewFlowM3U.this.N0();
            }
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(SeriesActivityNewFlowM3U.this.f26311f);
        }
    }

    public class k implements DialogInterface.OnClickListener {
        public k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(SeriesActivityNewFlowM3U.this.f26311f);
        }
    }

    public class l implements DialogInterface.OnClickListener {
        public l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class m implements DialogInterface.OnClickListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public class n implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26337b;

        public n(View view) {
            this.f26337b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26337b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26337b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26337b, "scaleY", f2);
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
    public class o extends AsyncTask<String, Void, Boolean> {
        public o() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(SeriesActivityNewFlowM3U.this.O0());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (!new c.h.a.k.d.a.a(SeriesActivityNewFlowM3U.this.f26311f).A().equals(c.h.a.h.n.a.s0)) {
                if (SeriesActivityNewFlowM3U.this.I.booleanValue()) {
                    SeriesActivityNewFlowM3U.this.N0();
                    return;
                } else if (!c.h.a.h.n.e.a(SeriesActivityNewFlowM3U.this.f26311f).booleanValue()) {
                    SeriesActivityNewFlowM3U.this.Q0();
                    return;
                }
            }
            SeriesActivityNewFlowM3U.this.P0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public SeriesActivityNewFlowM3U() {
        Boolean bool = Boolean.FALSE;
        this.I = bool;
        this.J = bool;
    }

    public void I0(int i2, NativeAd nativeAd) {
        if (nativeAd == null) {
            return;
        }
        this.G.add(i2, nativeAd);
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

    public final ArrayList<String> K0() {
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.f26317l.d1(c.h.a.i.q.m.z(this.f26311f));
        this.s = arrayListD1;
        if (arrayListD1 != null) {
            for (c.h.a.i.q.i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.r.add(iVar.b());
                }
            }
        }
        return this.r;
    }

    public final ArrayList<c.h.a.i.e> L0(ArrayList<c.h.a.i.e> arrayList, ArrayList<String> arrayList2) {
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
                if (!z && (arrayList3 = this.t) != null) {
                    arrayList3.add(eVar);
                }
            }
        }
        return this.t;
    }

    public final void M0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public final void N0() {
        if (this.G.size() <= 0) {
            P0();
            return;
        }
        List<Object> list = this.H;
        if (list != null && list.size() > 0) {
            Iterator<Object> it = this.H.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof NativeAd) {
                    Log.e("ads", "ads already exists");
                    P0();
                    return;
                }
            }
            int size = this.H.size() / this.G.size();
            Iterator<NativeAd> it2 = this.G.iterator();
            int i2 = size;
            while (it2.hasNext()) {
                try {
                    this.H.add(i2, it2.next());
                    i2 += size;
                } catch (Exception unused) {
                }
            }
        }
        P0();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0160 A[Catch: NullPointerException | Exception -> 0x021d, TryCatch #0 {NullPointerException | Exception -> 0x021d, blocks: (B:3:0x0007, B:5:0x001a, B:8:0x0097, B:9:0x00b1, B:11:0x00c7, B:13:0x00cb, B:15:0x00d9, B:17:0x00df, B:19:0x00e3, B:22:0x00eb, B:24:0x00f3, B:26:0x00f7, B:29:0x00ff, B:31:0x0111, B:33:0x0123, B:35:0x0137, B:40:0x01ae, B:41:0x01b3, B:36:0x0160, B:38:0x0184, B:39:0x0186, B:42:0x01b7, B:44:0x01bb, B:46:0x01c1, B:47:0x01c5, B:50:0x01ca, B:52:0x01d2, B:16:0x00dc), top: B:56:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0184 A[Catch: NullPointerException | Exception -> 0x021d, TryCatch #0 {NullPointerException | Exception -> 0x021d, blocks: (B:3:0x0007, B:5:0x001a, B:8:0x0097, B:9:0x00b1, B:11:0x00c7, B:13:0x00cb, B:15:0x00d9, B:17:0x00df, B:19:0x00e3, B:22:0x00eb, B:24:0x00f3, B:26:0x00f7, B:29:0x00ff, B:31:0x0111, B:33:0x0123, B:35:0x0137, B:40:0x01ae, B:41:0x01b3, B:36:0x0160, B:38:0x0184, B:39:0x0186, B:42:0x01b7, B:44:0x01bb, B:46:0x01c1, B:47:0x01c5, B:50:0x01ca, B:52:0x01d2, B:16:0x00dc), top: B:56:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean O0() {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.SeriesActivityNewFlowM3U.O0():boolean");
    }

    public final void P0() {
        if (this.v == null || this.E == 0) {
            ProgressBar progressBar = this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(8);
                this.rl_no_arrangement_found.setVisibility(0);
                return;
            }
            return;
        }
        this.p = new v(this.H, this.f26311f);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        this.myRecyclerView.setAdapter(this.p);
        ProgressBar progressBar2 = this.pbLoader;
        if (progressBar2 != null) {
            progressBar2.setVisibility(8);
        }
    }

    public final void Q0() {
        Log.e("ads", "loadNativeAds");
        this.I = Boolean.TRUE;
        List<Object> list = this.H;
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            f26310e = this.H.size() / 10;
        } catch (Exception unused) {
            f26310e = 0;
        }
        NativeAdsManager nativeAdsManager = new NativeAdsManager(this.f26311f, "269613774129228_336799674077304", f26310e);
        this.F = nativeAdsManager;
        nativeAdsManager.setListener(new h());
        if (f26310e > 0) {
            this.F.loadAds();
        } else {
            P0();
        }
    }

    public final void R0(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.sort_layout, (RelativeLayout) activity.findViewById(R.id.rl_password_prompt));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.z = popupWindow;
            popupWindow.setContentView(viewInflate);
            byte b2 = -1;
            this.z.setWidth(-1);
            this.z.setHeight(-1);
            this.z.setFocusable(true);
            this.z.showAtLocation(viewInflate, 17, 0, 0);
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
            radioButton.setOnFocusChangeListener(new n(radioButton));
            radioButton2.setOnFocusChangeListener(new n(radioButton2));
            radioButton3.setOnFocusChangeListener(new n(radioButton3));
            radioButton4.setOnFocusChangeListener(new n(radioButton4));
            radioButton5.setOnFocusChangeListener(new n(radioButton5));
            radioButton6.setOnFocusChangeListener(new n(radioButton6));
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
            button2.setOnClickListener(new c());
            button.setOnClickListener(new d(radioGroup, viewInflate, activity));
        } catch (NullPointerException | Exception unused) {
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
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setClickable(true);
        }
        v vVar = this.p;
        if (vVar != null && (progressBar = f26309d) != null) {
            vVar.q0(progressBar);
        }
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_bt_up) {
            this.D = new o().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            if (id != R.id.tv_header_title) {
                return;
            }
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        M0();
        setContentView(R.layout.activity_vod_new_flow);
        ButterKnife.a(this);
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(R.drawable.black_background));
        }
        TextView textView = this.tvSettings;
        if (textView != null) {
            textView.setText(getResources().getString(R.string.series));
        }
        J0();
        v0((Toolbar) findViewById(R.id.toolbar));
        getWindow().setFlags(1024, 1024);
        this.f26311f = this;
        Handler handler = new Handler();
        this.A = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.logo.setOnClickListener(new e());
        this.iv_back_button.setOnClickListener(new f());
        this.f26317l = new c.h.a.i.q.f(this.f26311f);
        this.myRecyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        this.f26313h = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setVisibility(0);
        this.D = new o().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.home.setOnClickListener(new g());
        this.frameLayout.setVisibility(8);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.x(R.menu.menu_search);
        this.C = menu;
        this.B = menu.getItem(2).getSubMenu().findItem(R.id.empty);
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
        AsyncTask asyncTask = this.D;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        this.D.cancel(true);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 82) {
            return super.onKeyUp(i2, keyEvent);
        }
        Menu menu = this.C;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(R.id.empty, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.B = menuItem;
        this.toolbar.e();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout1 && (context = this.f26311f) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new j()).g(getResources().getString(R.string.no), new i()).n();
        }
        if (itemId == R.id.menu_load_channels_vod1) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f26311f.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f26311f.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f26311f.getResources().getString(R.string.yes), new k());
            aVar.g(this.f26311f.getResources().getString(R.string.no), new l());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide1) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.f26311f.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.f26311f.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.f26311f.getResources().getString(R.string.yes), new m());
            aVar2.g(this.f26311f.getResources().getString(R.string.no), new a());
            aVar2.n();
        }
        if (itemId == R.id.action_search) {
            SearchView searchView = (SearchView) a.i.r.j.b(menuItem);
            this.q = searchView;
            searchView.setQueryHint(getResources().getString(R.string.search_series_category));
            this.q.setIconifiedByDefault(false);
            this.q.setOnQueryTextListener(new b());
        }
        if (itemId == R.id.menu_sort) {
            R0(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        M0();
        super.onResume();
        c.h.a.h.n.e.g(this.f26311f);
        getWindow().setFlags(1024, 1024);
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        v vVar = this.p;
        if (vVar != null) {
            vVar.q0(f26309d);
            this.p.w();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26312g = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f26312g.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        M0();
    }
}
