package minefarts.iptvsmarters.view.activity;

import a.b.k.b;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
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
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.appbar.AppBarLayout;
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.adapter.LiveStreamsAdapter;
import minefarts.iptvsmarters.view.adapter.TVArchiveLiveChannelsAdapterNewFlow;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class TVArchiveActivityLayout extends a.b.k.c implements View.OnClickListener {
    public SharedPreferences.Editor A;
    public SharedPreferences B;
    public SharedPreferences.Editor C;
    public PopupWindow D;
    public TVArchiveLiveChannelsAdapterNewFlow E;
    public GridLayoutManager F;

    @BindView
    public AppBarLayout appbarToolbar;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f26797d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f26798e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.h.a.i.q.f f26802i;

    @BindView
    public ImageView iv_back_button;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SearchView f26804k;

    @BindView
    public ImageView logo;

    @BindView
    public RecyclerView myRecyclerView;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RecyclerView.p f26807n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SharedPreferences f26808o;

    @BindView
    public ProgressBar pbLoader;
    public c.h.a.i.q.a q;
    public LiveStreamsAdapter r;
    public ArrayList<c.h.a.i.q.i> t;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    @BindView
    public TextView tvViewProvider;
    public ArrayList<c.h.a.i.f> u;
    public ArrayList<c.h.a.i.f> v;
    public ArrayList<c.h.a.i.f> w;
    public ArrayList<c.h.a.i.f> x;
    public ArrayList<c.h.a.i.f> y;
    public SharedPreferences z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26799f = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26800g = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.h.a.i.q.b f26801h = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.b f26803j = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f26805l = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f26806m = BuildConfig.FLAVOR;
    public ArrayList<c.h.a.i.f> p = new ArrayList<>();
    public ArrayList<String> s = new ArrayList<>();
    public Thread G = null;

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
            TVArchiveActivityLayout.this.D.dismiss();
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f26811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f26812c;

        public c(RadioGroup radioGroup, View view) {
            this.f26811b = radioGroup;
            this.f26812c = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor;
            String str;
            RadioButton radioButton = (RadioButton) this.f26812c.findViewById(this.f26811b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(TVArchiveActivityLayout.this.getResources().getString(R.string.sort_last_added))) {
                editor = TVArchiveActivityLayout.this.C;
                str = "1";
            } else if (radioButton.getText().toString().equals(TVArchiveActivityLayout.this.getResources().getString(R.string.sort_atoz))) {
                editor = TVArchiveActivityLayout.this.C;
                str = "2";
            } else if (radioButton.getText().toString().equals(TVArchiveActivityLayout.this.getResources().getString(R.string.sort_ztoa))) {
                editor = TVArchiveActivityLayout.this.C;
                str = "3";
            } else {
                editor = TVArchiveActivityLayout.this.C;
                str = "0";
            }
            editor.putString("sort", str);
            TVArchiveActivityLayout.this.C.apply();
            TVArchiveActivityLayout tVArchiveActivityLayout = TVArchiveActivityLayout.this;
            tVArchiveActivityLayout.z = tVArchiveActivityLayout.getSharedPreferences("listgridview", 0);
            int i2 = TVArchiveActivityLayout.this.z.getInt("livestream", 0);
            c.h.a.h.n.a.u = i2;
            if (i2 == 1) {
                TVArchiveActivityLayout.this.M0();
            } else {
                TVArchiveActivityLayout.this.N0();
            }
            TVArchiveActivityLayout.this.D.dismiss();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(TVArchiveActivityLayout.this.f26797d);
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TVArchiveActivityLayout.this.onBackPressed();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(TVArchiveActivityLayout.this.f26797d);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = TVArchiveActivityLayout.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = TVArchiveActivityLayout.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(TVArchiveActivityLayout.this.f26797d);
        }
    }

    public class i implements SearchView.l {
        public i() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            TVArchiveActivityLayout.this.tvNoRecordFound.setVisibility(8);
            if (TVArchiveActivityLayout.this.r == null || (textView = TVArchiveActivityLayout.this.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            TVArchiveActivityLayout.this.r.m0(str, TVArchiveActivityLayout.this.tvNoRecordFound);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(TVArchiveActivityLayout.this.f26797d);
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

    public class l implements DialogInterface.OnClickListener {
        public l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    TVArchiveActivityLayout.this.H0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public final void G0() {
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

    public void H0() {
        runOnUiThread(new f());
    }

    public void I0() {
        ArrayList<c.h.a.i.f> arrayList;
        ArrayList<c.h.a.i.f> arrayList2;
        this.p.clear();
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.r);
        }
        if (this.f26797d != null) {
            c.h.a.i.q.a aVar = new c.h.a.i.q.a(this.f26797d);
            this.q = aVar;
            for (c.h.a.i.b bVar : aVar.p("live", c.h.a.i.q.m.z(this.f26797d))) {
                this.p.add(new c.h.a.i.q.f(this.f26797d).D1(bVar.a(), String.valueOf(bVar.e())));
            }
            b();
            if (this.myRecyclerView != null && (arrayList2 = this.p) != null && arrayList2.size() != 0) {
                LiveStreamsAdapter liveStreamsAdapter = new LiveStreamsAdapter(this.p, this.f26797d);
                this.r = liveStreamsAdapter;
                this.myRecyclerView.setAdapter(liveStreamsAdapter);
                this.r.w();
                this.tvNoStream.setVisibility(4);
            }
            if (this.tvNoStream == null || (arrayList = this.p) == null || arrayList.size() != 0) {
                return;
            }
            RecyclerView recyclerView2 = this.myRecyclerView;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.r);
            }
            this.tvNoStream.setText(getResources().getString(R.string.no_fav_channel_found));
            this.tvNoStream.setVisibility(0);
        }
    }

    public final ArrayList<String> J0() {
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.f26802i.d1(c.h.a.i.q.m.z(this.f26797d));
        this.t = arrayListD1;
        if (arrayListD1 != null) {
            for (c.h.a.i.q.i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.s.add(iVar.b());
                }
            }
        }
        return this.s;
    }

    public final ArrayList<c.h.a.i.f> K0(ArrayList<c.h.a.i.f> arrayList, ArrayList<String> arrayList2) {
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
                if (!z && (arrayList3 = this.u) != null) {
                    arrayList3.add(fVar);
                }
            }
        }
        return this.u;
    }

    public void L0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public final void M0() {
        this.f26797d = this;
        this.f26802i = new c.h.a.i.q.f(this.f26797d);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f26797d == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f26797d, c.h.a.h.n.e.y(this.f26797d) + 1);
        this.f26807n = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        this.f26808o = this.f26797d.getSharedPreferences("loginPrefs", 0);
        P0();
    }

    public final void N0() {
        this.f26797d = this;
        this.f26802i = new c.h.a.i.q.f(this.f26797d);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.f26797d == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f26797d);
        this.f26807n = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        this.f26808o = this.f26797d.getSharedPreferences("loginPrefs", 0);
        P0();
    }

    public void O0(ArrayList<c.h.a.i.f> arrayList) {
        this.E = new TVArchiveLiveChannelsAdapterNewFlow(arrayList, this.f26797d);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        this.F = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        this.myRecyclerView.setAdapter(this.E);
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    public final void P0() {
        try {
            if (this.f26797d != null) {
                c.h.a.i.q.f fVar = new c.h.a.i.q.f(this.f26797d);
                this.t = new ArrayList<>();
                this.u = new ArrayList<>();
                this.v = new ArrayList<>();
                this.w = new ArrayList<>();
                this.x = new ArrayList<>();
                this.y = new ArrayList<>();
                ArrayList<c.h.a.i.f> arrayListU0 = fVar.U0(this.f26805l);
                Log.e("channelAvailable size", " >>>>>>>> " + arrayListU0.size());
                Log.e("channelAvailable", " >>>>>>>> " + arrayListU0.toString());
                if (fVar.I1(c.h.a.i.q.m.z(this.f26797d)) > 0) {
                    ArrayList<String> arrayListJ0 = J0();
                    this.s = arrayListJ0;
                    if (arrayListJ0 != null) {
                        this.v = K0(arrayListU0, arrayListJ0);
                    }
                    this.w = this.v;
                } else {
                    this.w = arrayListU0;
                }
                if (this.f26805l.equals("-1")) {
                    b();
                    return;
                }
                ArrayList<c.h.a.i.f> arrayList = this.w;
                if (arrayList != null && this.myRecyclerView != null && arrayList.size() != 0) {
                    b();
                    O0(this.w);
                    return;
                }
                b();
                TextView textView = this.tvNoStream;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void Q0(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.sort_layout, (RelativeLayout) activity.findViewById(R.id.rl_password_prompt));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.D = popupWindow;
            popupWindow.setContentView(viewInflate);
            byte b2 = -1;
            this.D.setWidth(-1);
            this.D.setHeight(-1);
            this.D.setFocusable(true);
            this.D.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(R.id.bt_save_password);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.rg_radio);
            RadioButton radioButton = (RadioButton) viewInflate.findViewById(R.id.rb_normal);
            RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(R.id.rb_lastadded);
            RadioButton radioButton3 = (RadioButton) viewInflate.findViewById(R.id.rb_atoz);
            RadioButton radioButton4 = (RadioButton) viewInflate.findViewById(R.id.rb_ztoa);
            String string = this.B.getString("sort", BuildConfig.FLAVOR);
            switch (string.hashCode()) {
                case 49:
                    if (string.equals("1")) {
                        b2 = 0;
                    }
                    break;
                case 50:
                    if (string.equals("2")) {
                        b2 = 1;
                    }
                    break;
                case 51:
                    if (string.equals("3")) {
                        b2 = 2;
                    }
                    break;
            }
            if (b2 == 0) {
                radioButton2.setChecked(true);
            } else if (b2 == 1) {
                radioButton3.setChecked(true);
            } else if (b2 != 2) {
                radioButton.setChecked(true);
            } else {
                radioButton4.setChecked(true);
            }
            button2.setOnClickListener(new b());
            button.setOnClickListener(new c(radioGroup, viewInflate));
        } catch (NullPointerException | Exception unused) {
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
        this.myRecyclerView.setClickable(true);
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
        this.f26797d = this;
        L0();
        super.onCreate(bundle);
        setContentView(R.layout.activity_tv_archive_new_flow_layout);
        ButterKnife.a(this);
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(R.drawable.black_background));
        }
        SharedPreferences sharedPreferences = getSharedPreferences("sort", 0);
        this.B = sharedPreferences;
        this.C = sharedPreferences.edit();
        if (this.B.getString("sort", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.C.putString("sort", "0");
            this.C.apply();
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.f26805l = intent.getStringExtra("category_id");
            this.f26806m = intent.getStringExtra("category_name");
        }
        this.f26802i = new c.h.a.i.q.f(this.f26797d);
        SharedPreferences sharedPreferences2 = getSharedPreferences("listgridview", 0);
        this.z = sharedPreferences2;
        c.h.a.h.n.a.u = sharedPreferences2.getInt("livestream", 0);
        this.logo.setOnClickListener(new d());
        this.iv_back_button.setOnClickListener(new e());
        if (c.h.a.h.n.a.u == 1) {
            M0();
        } else {
            N0();
        }
        if (this.f26805l.equals("-1")) {
            I0();
        }
        G0();
        v0((Toolbar) findViewById(R.id.toolbar));
        this.f26797d = this;
        Thread thread = this.G;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new m());
            this.G = thread2;
            thread2.start();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.x(R.menu.menu_search_text_icon);
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

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout1 && (context = this.f26797d) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new h()).g(getResources().getString(R.string.no), new g()).n();
        }
        if (itemId == R.id.action_search) {
            SearchView searchView = (SearchView) a.i.r.j.b(menuItem);
            this.f26804k = searchView;
            searchView.setQueryHint(getResources().getString(R.string.search_channel));
            this.f26804k.setIconifiedByDefault(false);
            this.f26804k.setOnQueryTextListener(new i());
            return true;
        }
        if (itemId == R.id.menu_load_channels_vod1) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f26797d.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f26797d.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f26797d.getResources().getString(R.string.yes), new j());
            aVar.g(this.f26797d.getResources().getString(R.string.no), new k());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide1) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.f26797d.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.f26797d.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.f26797d.getResources().getString(R.string.yes), new l());
            aVar2.g(this.f26797d.getResources().getString(R.string.no), new a());
            aVar2.n();
        }
        if (itemId == R.id.layout_view_grid) {
            this.A.putInt("livestream", 1);
            this.A.commit();
            M0();
        }
        if (itemId == R.id.layout_view_linear) {
            this.A.putInt("livestream", 0);
            this.A.commit();
            N0();
        }
        if (itemId == R.id.menu_sort) {
            Q0(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.G;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.G.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        L0();
        super.onResume();
        Thread thread = this.G;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new m());
            this.G = thread2;
            thread2.start();
        }
        c.h.a.h.n.e.g(this.f26797d);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26798e = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f26798e.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f26797d != null) {
            b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        L0();
    }
}
