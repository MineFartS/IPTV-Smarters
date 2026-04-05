package com.nst.iptvsmarterstvbox.view.ijkplayer.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.f.a.b.j3.z;
import c.h.a.i.q.m;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.adapter.MultiPlayerCategoriesAdapter;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti1;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti2;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti3;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti4;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public class NSTIJKPlayerMultiActivity extends a.b.k.c implements c.h.a.k.f.g, View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f29190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f29191e;
    public String A;
    public ArrayList<c.h.a.i.e> A0;
    public String B;
    public ArrayList<c.h.a.i.e> B0;
    public c.h.a.i.q.f C;
    public String D;
    public ArrayList<c.h.a.i.e> D0;
    public String E;
    public ArrayList<c.h.a.i.e> E0;
    public TextView F;
    public ArrayList<c.h.a.i.q.i> F0;
    public String G;
    public ArrayList<c.h.a.i.e> G0;
    public TextView H;
    public DateFormat I;
    public MultiPlayerCategoriesAdapter I0;
    public GridLayoutManager J0;
    public RecyclerView K0;
    public ProgressBar L0;
    public RelativeLayout M0;
    public AppBarLayout O0;
    public TextView P0;
    public ProgressBar Q0;
    public ProgressBar R0;
    public ProgressBar S0;
    public ProgressBar T0;
    public ImageView U0;
    public SimpleDateFormat V;
    public ImageView V0;
    public NSTIJKPlayerMulti1 W;
    public ImageView W0;
    public NSTIJKPlayerMulti2 X;
    public ImageView X0;
    public NSTIJKPlayerMulti3 Y;
    public ImageView Y0;
    public NSTIJKPlayerMulti4 Z;
    public ImageView Z0;
    public Runnable a1;
    public Handler b1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f29192f;
    public Date f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f29193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f29194h;
    public String h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f29195i;
    public String i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f29196j;
    public SharedPreferences j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f29197k;
    public c.h.a.k.d.a.a k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f29198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f29199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f29200n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f29201o;
    public LinearLayout p;
    public LinearLayout q;
    public LinearLayout r;
    public LinearLayout s;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public PopupWindow y0;
    public String z;
    public PopupWindow z0;
    public boolean t = false;
    public String J = BuildConfig.FLAVOR;
    public String K = BuildConfig.FLAVOR;
    public String L = BuildConfig.FLAVOR;
    public String M = BuildConfig.FLAVOR;
    public int N = 0;
    public int O = 0;
    public int P = 0;
    public int Q = 0;
    public String R = BuildConfig.FLAVOR;
    public String S = BuildConfig.FLAVOR;
    public String T = BuildConfig.FLAVOR;
    public String U = BuildConfig.FLAVOR;
    public Boolean g0 = Boolean.TRUE;
    public int l0 = 0;
    public String m0 = BuildConfig.FLAVOR;
    public String n0 = BuildConfig.FLAVOR;
    public String o0 = BuildConfig.FLAVOR;
    public String p0 = BuildConfig.FLAVOR;
    public String q0 = BuildConfig.FLAVOR;
    public String r0 = BuildConfig.FLAVOR;
    public String s0 = BuildConfig.FLAVOR;
    public String t0 = BuildConfig.FLAVOR;
    public String u0 = BuildConfig.FLAVOR;
    public String v0 = BuildConfig.FLAVOR;
    public String w0 = BuildConfig.FLAVOR;
    public String x0 = BuildConfig.FLAVOR;
    public ArrayList<String> C0 = new ArrayList<>();
    public int H0 = 0;
    public AsyncTask N0 = null;
    public View c1 = null;
    public final boolean[] d1 = {false};

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity = NSTIJKPlayerMultiActivity.this;
            nSTIJKPlayerMultiActivity.g1(nSTIJKPlayerMultiActivity.f29192f);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NSTIJKPlayerMultiActivity.this.z0 == null) {
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity = NSTIJKPlayerMultiActivity.this;
                nSTIJKPlayerMultiActivity.d1[0] = false;
                nSTIJKPlayerMultiActivity.b1.postDelayed(nSTIJKPlayerMultiActivity.a1, 100L);
            } else if (NSTIJKPlayerMultiActivity.this.z0.isShowing()) {
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity2 = NSTIJKPlayerMultiActivity.this;
                nSTIJKPlayerMultiActivity2.d1[0] = true;
                nSTIJKPlayerMultiActivity2.b1.removeCallbacks(nSTIJKPlayerMultiActivity2.a1);
            } else {
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity3 = NSTIJKPlayerMultiActivity.this;
                nSTIJKPlayerMultiActivity3.g1(nSTIJKPlayerMultiActivity3.f29192f);
            }
            NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity4 = NSTIJKPlayerMultiActivity.this;
            if (nSTIJKPlayerMultiActivity4.d1[0]) {
                return;
            }
            nSTIJKPlayerMultiActivity4.b1.postDelayed(nSTIJKPlayerMultiActivity4.a1, 100L);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerMultiActivity.this.i0 = "default";
            NSTIJKPlayerMultiActivity.this.h1();
            NSTIJKPlayerMultiActivity.this.z0.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerMultiActivity.this.i0 = "screen1";
            NSTIJKPlayerMultiActivity.this.h1();
            NSTIJKPlayerMultiActivity.this.z0.dismiss();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerMultiActivity.this.i0 = "screen2";
            NSTIJKPlayerMultiActivity.this.h1();
            NSTIJKPlayerMultiActivity.this.z0.dismiss();
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerMultiActivity.this.i0 = "screen3";
            NSTIJKPlayerMultiActivity.this.h1();
            NSTIJKPlayerMultiActivity.this.z0.dismiss();
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerMultiActivity.this.i0 = "screen4";
            NSTIJKPlayerMultiActivity.this.h1();
            NSTIJKPlayerMultiActivity.this.z0.dismiss();
        }
    }

    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerMultiActivity.this.i0 = "screen5";
            NSTIJKPlayerMultiActivity.this.h1();
            NSTIJKPlayerMultiActivity.this.z0.dismiss();
        }
    }

    public class j implements PopupMenu.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f29211a;

        public j(int i2) {
            this.f29211a = i2;
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == R.id.nav_edit_channel) {
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity = NSTIJKPlayerMultiActivity.this;
                nSTIJKPlayerMultiActivity.N0(nSTIJKPlayerMultiActivity.f29192f);
                return false;
            }
            if (itemId != R.id.nav_remove_channel) {
                return false;
            }
            NSTIJKPlayerMultiActivity.this.d1(this.f29211a);
            NSTIJKPlayerMultiActivity.this.T0(this.f29211a);
            return false;
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
                return Boolean.valueOf(NSTIJKPlayerMultiActivity.this.V0());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity;
            GridLayoutManager gridLayoutManager;
            ProgressBar progressBar;
            NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity2;
            GridLayoutManager gridLayoutManager2;
            super.onPostExecute(bool);
            if (m.f(NSTIJKPlayerMultiActivity.this.f29192f).equals("m3u")) {
                if (NSTIJKPlayerMultiActivity.this.A0 == null || NSTIJKPlayerMultiActivity.this.H0 == 0) {
                    ProgressBar progressBar2 = NSTIJKPlayerMultiActivity.this.L0;
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(8);
                        NSTIJKPlayerMultiActivity.this.M0.setVisibility(0);
                        return;
                    }
                    return;
                }
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity3 = NSTIJKPlayerMultiActivity.this;
                ArrayList arrayList = NSTIJKPlayerMultiActivity.this.A0;
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity4 = NSTIJKPlayerMultiActivity.this;
                Context context = nSTIJKPlayerMultiActivity4.f29192f;
                nSTIJKPlayerMultiActivity3.I0 = new MultiPlayerCategoriesAdapter(arrayList, context, (c.h.a.k.f.g) context, nSTIJKPlayerMultiActivity4.y0, NSTIJKPlayerMultiActivity.this.l0);
                if (new c.h.a.k.d.a.a(NSTIJKPlayerMultiActivity.this.f29192f).A().equals(c.h.a.h.n.a.s0)) {
                    nSTIJKPlayerMultiActivity2 = NSTIJKPlayerMultiActivity.this;
                    gridLayoutManager2 = new GridLayoutManager(nSTIJKPlayerMultiActivity2.f29192f, 2);
                } else {
                    nSTIJKPlayerMultiActivity2 = NSTIJKPlayerMultiActivity.this;
                    gridLayoutManager2 = new GridLayoutManager(nSTIJKPlayerMultiActivity2.f29192f, 2);
                }
                nSTIJKPlayerMultiActivity2.J0 = gridLayoutManager2;
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity5 = NSTIJKPlayerMultiActivity.this;
                nSTIJKPlayerMultiActivity5.K0.setLayoutManager(nSTIJKPlayerMultiActivity5.J0);
                NSTIJKPlayerMultiActivity.this.K0.setItemAnimator(new a.y.e.c());
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity6 = NSTIJKPlayerMultiActivity.this;
                nSTIJKPlayerMultiActivity6.K0.setAdapter(nSTIJKPlayerMultiActivity6.I0);
                progressBar = NSTIJKPlayerMultiActivity.this.L0;
                if (progressBar == null) {
                    return;
                }
            } else {
                if (NSTIJKPlayerMultiActivity.this.A0 == null) {
                    return;
                }
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity7 = NSTIJKPlayerMultiActivity.this;
                ArrayList arrayList2 = NSTIJKPlayerMultiActivity.this.A0;
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity8 = NSTIJKPlayerMultiActivity.this;
                Context context2 = nSTIJKPlayerMultiActivity8.f29192f;
                nSTIJKPlayerMultiActivity7.I0 = new MultiPlayerCategoriesAdapter(arrayList2, context2, (c.h.a.k.f.g) context2, nSTIJKPlayerMultiActivity8.y0, NSTIJKPlayerMultiActivity.this.l0);
                if (new c.h.a.k.d.a.a(NSTIJKPlayerMultiActivity.this.f29192f).A().equals(c.h.a.h.n.a.s0)) {
                    nSTIJKPlayerMultiActivity = NSTIJKPlayerMultiActivity.this;
                    gridLayoutManager = new GridLayoutManager(nSTIJKPlayerMultiActivity.f29192f, 2);
                } else {
                    nSTIJKPlayerMultiActivity = NSTIJKPlayerMultiActivity.this;
                    gridLayoutManager = new GridLayoutManager(nSTIJKPlayerMultiActivity.f29192f, 2);
                }
                nSTIJKPlayerMultiActivity.J0 = gridLayoutManager;
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity9 = NSTIJKPlayerMultiActivity.this;
                nSTIJKPlayerMultiActivity9.K0.setLayoutManager(nSTIJKPlayerMultiActivity9.J0);
                NSTIJKPlayerMultiActivity.this.K0.setItemAnimator(new a.y.e.c());
                NSTIJKPlayerMultiActivity nSTIJKPlayerMultiActivity10 = NSTIJKPlayerMultiActivity.this;
                nSTIJKPlayerMultiActivity10.K0.setAdapter(nSTIJKPlayerMultiActivity10.I0);
                progressBar = NSTIJKPlayerMultiActivity.this.L0;
                if (progressBar == null) {
                    return;
                }
            }
            progressBar.setVisibility(8);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public static long O0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static String Q0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    public final boolean M0() {
        String str;
        String str2;
        SimpleDateFormat simpleDateFormat = this.V;
        if (O0(simpleDateFormat, simpleDateFormat.format(new Date(c.h.a.k.d.c.a.f.a(this.f29192f))), this.I.format(this.f0)) >= c.h.a.k.d.c.a.d.p() && (str = this.E) != null && this.D != null && (!f29190d.equals(str) || (this.E != null && (str2 = this.D) != null && !f29191e.equals(str2)))) {
            this.g0 = Boolean.FALSE;
        }
        return this.g0.booleanValue();
    }

    @SuppressLint({"ResourceType"})
    public final void N0(Context context) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.categories_popup, (LinearLayout) findViewById(R.id.ll_root));
        this.L0 = (ProgressBar) viewInflate.findViewById(R.id.pb_loader);
        this.K0 = (RecyclerView) viewInflate.findViewById(R.id.my_recycler_view);
        this.M0 = (RelativeLayout) viewInflate.findViewById(R.id.rl_no_arrangement_found);
        this.O0 = (AppBarLayout) viewInflate.findViewById(R.id.appbar_toolbar);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_settings);
        this.P0 = textView;
        textView.setText(context.getResources().getString(R.string.categories));
        PopupWindow popupWindow = new PopupWindow(context);
        this.y0 = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.y0.setWidth(-1);
        this.y0.setHeight(-1);
        this.y0.setFocusable(true);
        this.y0.setOnDismissListener(new a());
        ProgressBar progressBar = this.L0;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        AppBarLayout appBarLayout = this.O0;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(R.color.trasparent_light));
        }
        this.N0 = new k().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.y0.showAtLocation(viewInflate, 1, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void P0(int r13) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity.P0(int):void");
    }

    public final ArrayList<String> R0() {
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.C.d1(m.z(this.f29192f));
        this.F0 = arrayListD1;
        if (arrayListD1 != null) {
            for (c.h.a.i.q.i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.C0.add(iVar.b());
                }
            }
        }
        return this.C0;
    }

    public final ArrayList<c.h.a.i.e> S0(ArrayList<c.h.a.i.e> arrayList, ArrayList<String> arrayList2) {
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
                if (!z && (arrayList3 = this.E0) != null) {
                    arrayList3.add(eVar);
                }
            }
        }
        return this.E0;
    }

    public final void T0(int i2) {
        LinearLayout linearLayout;
        if (i2 == 1) {
            this.W.setVisibility(8);
            linearLayout = this.f29194h;
        } else if (i2 == 2) {
            this.X.setVisibility(8);
            linearLayout = this.f29195i;
        } else if (i2 == 3) {
            this.Y.setVisibility(8);
            linearLayout = this.f29196j;
        } else {
            if (i2 != 4) {
                return;
            }
            this.Z.setVisibility(8);
            linearLayout = this.f29197k;
        }
        linearLayout.setVisibility(8);
    }

    public final void U0() {
        this.A0 = new ArrayList<>();
        this.B0 = new ArrayList<>();
        this.D0 = new ArrayList<>();
        this.E0 = new ArrayList<>();
        this.F0 = new ArrayList<>();
        this.G0 = new ArrayList<>();
        this.j0 = this.f29192f.getSharedPreferences("loginPrefs", 0);
        this.k0 = new c.h.a.k.d.a.a(this.f29192f);
        if (m.f(this.f29192f).equals("m3u")) {
            this.h0 = "m3u";
        } else {
            this.h0 = "api";
        }
        this.C = new c.h.a.i.q.f(this);
        this.f29193g = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.i.i() + c.h.a.k.d.c.a.i.h());
        this.W = (NSTIJKPlayerMulti1) findViewById(R.id.video_view_1);
        this.X = (NSTIJKPlayerMulti2) findViewById(R.id.video_view_2);
        this.Y = (NSTIJKPlayerMulti3) findViewById(R.id.video_view_3);
        this.Z = (NSTIJKPlayerMulti4) findViewById(R.id.video_view_4);
        this.W.setLiveStreamDBHandler(this.C);
        this.X.setLiveStreamDBHandler(this.C);
        this.Y.setLiveStreamDBHandler(this.C);
        this.Z.setLiveStreamDBHandler(this.C);
        NSTIJKPlayerMulti1 nSTIJKPlayerMulti1 = this.W;
        nSTIJKPlayerMulti1.W(this, nSTIJKPlayerMulti1);
        NSTIJKPlayerMulti2 nSTIJKPlayerMulti2 = this.X;
        nSTIJKPlayerMulti2.W(this, nSTIJKPlayerMulti2);
        NSTIJKPlayerMulti3 nSTIJKPlayerMulti3 = this.Y;
        nSTIJKPlayerMulti3.W(this, nSTIJKPlayerMulti3);
        NSTIJKPlayerMulti4 nSTIJKPlayerMulti4 = this.Z;
        nSTIJKPlayerMulti4.W(this, nSTIJKPlayerMulti4);
        this.p = (LinearLayout) findViewById(R.id.app_video_top_box);
        this.q = (LinearLayout) findViewById(R.id.app_video_top_box_2);
        this.r = (LinearLayout) findViewById(R.id.app_video_top_box_3);
        this.s = (LinearLayout) findViewById(R.id.app_video_top_box_4);
        this.D = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.e.d());
        this.f0 = new Date();
        this.F = (TextView) findViewById(R.id.date);
        this.H = (TextView) findViewById(R.id.time);
        this.f29194h = (LinearLayout) findViewById(R.id.app_video_status);
        this.f29195i = (LinearLayout) findViewById(R.id.app_video_status_2);
        this.f29196j = (LinearLayout) findViewById(R.id.app_video_status_3);
        this.f29197k = (LinearLayout) findViewById(R.id.app_video_status_4);
        this.f29198l = (TextView) findViewById(R.id.app_video_status_text);
        this.f29199m = (TextView) findViewById(R.id.app_video_status_text_2);
        this.f29200n = (TextView) findViewById(R.id.app_video_status_text_3);
        this.f29201o = (TextView) findViewById(R.id.app_video_status_text_4);
        this.Q0 = (ProgressBar) findViewById(R.id.app_video_loading_1);
        this.R0 = (ProgressBar) findViewById(R.id.app_video_loading_2);
        this.S0 = (ProgressBar) findViewById(R.id.app_video_loading_3);
        this.T0 = (ProgressBar) findViewById(R.id.app_video_loading_4);
        this.V = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
        try {
            IjkMediaPlayer.loadLibrariesOnce(null);
            IjkMediaPlayer.native_profileBegin("libijkplayer.so");
        } catch (Exception | UnsatisfiedLinkError unused) {
        }
        this.I = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
        findViewById(R.id.app_video_box_1).setOnClickListener(this);
        findViewById(R.id.app_video_box_1).setOnLongClickListener(this);
        findViewById(R.id.app_video_box_2).setOnClickListener(this);
        findViewById(R.id.app_video_box_2).setOnLongClickListener(this);
        findViewById(R.id.app_video_box_3).setOnClickListener(this);
        findViewById(R.id.app_video_box_3).setOnLongClickListener(this);
        findViewById(R.id.app_video_box_4).setOnClickListener(this);
        findViewById(R.id.app_video_box_4).setOnLongClickListener(this);
        this.E = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.a.a());
        f29190d = Q0(this.f29192f);
        f29191e = getApplicationContext().getPackageName();
        this.G = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.g.f() + c.h.a.k.d.c.a.g.h());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3 A[Catch: NullPointerException | Exception -> 0x0275, NullPointerException | Exception -> 0x0275, TRY_ENTER, TryCatch #0 {NullPointerException | Exception -> 0x0275, blocks: (B:3:0x0005, B:5:0x000a, B:7:0x000e, B:9:0x0012, B:10:0x001a, B:12:0x0061, B:14:0x0065, B:16:0x0077, B:17:0x007f, B:19:0x0083, B:21:0x0093, B:24:0x00a3, B:24:0x00a3, B:26:0x00ac, B:26:0x00ac, B:29:0x00b4, B:29:0x00b4, B:31:0x00bc, B:31:0x00bc, B:33:0x00c0, B:33:0x00c0, B:36:0x00c8, B:36:0x00c8, B:38:0x00da, B:38:0x00da, B:40:0x00ec, B:40:0x00ec, B:42:0x0100, B:42:0x0100, B:47:0x0177, B:47:0x0177, B:48:0x017c, B:48:0x017c, B:43:0x0129, B:43:0x0129, B:45:0x014d, B:45:0x014d, B:46:0x014f, B:46:0x014f, B:49:0x0180, B:49:0x0180, B:51:0x0184, B:51:0x0184, B:53:0x018a, B:53:0x018a, B:54:0x0190, B:54:0x0190, B:56:0x0194, B:56:0x0194, B:59:0x019c, B:59:0x019c, B:61:0x01a4, B:61:0x01a4, B:63:0x01a8, B:63:0x01a8, B:66:0x01b0, B:66:0x01b0, B:68:0x01c2, B:68:0x01c2, B:70:0x01d4, B:70:0x01d4, B:72:0x01e8, B:72:0x01e8, B:77:0x025f, B:77:0x025f, B:78:0x0264, B:78:0x0264, B:73:0x0211, B:73:0x0211, B:75:0x0235, B:75:0x0235, B:76:0x0237, B:76:0x0237, B:79:0x0268, B:79:0x0268, B:81:0x026c, B:81:0x026c, B:20:0x0086), top: B:86:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018a A[Catch: NullPointerException | Exception -> 0x0275, NullPointerException | Exception -> 0x0275, TryCatch #0 {NullPointerException | Exception -> 0x0275, blocks: (B:3:0x0005, B:5:0x000a, B:7:0x000e, B:9:0x0012, B:10:0x001a, B:12:0x0061, B:14:0x0065, B:16:0x0077, B:17:0x007f, B:19:0x0083, B:21:0x0093, B:24:0x00a3, B:24:0x00a3, B:26:0x00ac, B:26:0x00ac, B:29:0x00b4, B:29:0x00b4, B:31:0x00bc, B:31:0x00bc, B:33:0x00c0, B:33:0x00c0, B:36:0x00c8, B:36:0x00c8, B:38:0x00da, B:38:0x00da, B:40:0x00ec, B:40:0x00ec, B:42:0x0100, B:42:0x0100, B:47:0x0177, B:47:0x0177, B:48:0x017c, B:48:0x017c, B:43:0x0129, B:43:0x0129, B:45:0x014d, B:45:0x014d, B:46:0x014f, B:46:0x014f, B:49:0x0180, B:49:0x0180, B:51:0x0184, B:51:0x0184, B:53:0x018a, B:53:0x018a, B:54:0x0190, B:54:0x0190, B:56:0x0194, B:56:0x0194, B:59:0x019c, B:59:0x019c, B:61:0x01a4, B:61:0x01a4, B:63:0x01a8, B:63:0x01a8, B:66:0x01b0, B:66:0x01b0, B:68:0x01c2, B:68:0x01c2, B:70:0x01d4, B:70:0x01d4, B:72:0x01e8, B:72:0x01e8, B:77:0x025f, B:77:0x025f, B:78:0x0264, B:78:0x0264, B:73:0x0211, B:73:0x0211, B:75:0x0235, B:75:0x0235, B:76:0x0237, B:76:0x0237, B:79:0x0268, B:79:0x0268, B:81:0x026c, B:81:0x026c, B:20:0x0086), top: B:86:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0190 A[Catch: NullPointerException | Exception -> 0x0275, NullPointerException | Exception -> 0x0275, TryCatch #0 {NullPointerException | Exception -> 0x0275, blocks: (B:3:0x0005, B:5:0x000a, B:7:0x000e, B:9:0x0012, B:10:0x001a, B:12:0x0061, B:14:0x0065, B:16:0x0077, B:17:0x007f, B:19:0x0083, B:21:0x0093, B:24:0x00a3, B:24:0x00a3, B:26:0x00ac, B:26:0x00ac, B:29:0x00b4, B:29:0x00b4, B:31:0x00bc, B:31:0x00bc, B:33:0x00c0, B:33:0x00c0, B:36:0x00c8, B:36:0x00c8, B:38:0x00da, B:38:0x00da, B:40:0x00ec, B:40:0x00ec, B:42:0x0100, B:42:0x0100, B:47:0x0177, B:47:0x0177, B:48:0x017c, B:48:0x017c, B:43:0x0129, B:43:0x0129, B:45:0x014d, B:45:0x014d, B:46:0x014f, B:46:0x014f, B:49:0x0180, B:49:0x0180, B:51:0x0184, B:51:0x0184, B:53:0x018a, B:53:0x018a, B:54:0x0190, B:54:0x0190, B:56:0x0194, B:56:0x0194, B:59:0x019c, B:59:0x019c, B:61:0x01a4, B:61:0x01a4, B:63:0x01a8, B:63:0x01a8, B:66:0x01b0, B:66:0x01b0, B:68:0x01c2, B:68:0x01c2, B:70:0x01d4, B:70:0x01d4, B:72:0x01e8, B:72:0x01e8, B:77:0x025f, B:77:0x025f, B:78:0x0264, B:78:0x0264, B:73:0x0211, B:73:0x0211, B:75:0x0235, B:75:0x0235, B:76:0x0237, B:76:0x0237, B:79:0x0268, B:79:0x0268, B:81:0x026c, B:81:0x026c, B:20:0x0086), top: B:86:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean V0() {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity.V0():boolean");
    }

    public void W0(int i2) {
        if (i2 == 1) {
            this.W.d0();
            this.X.R();
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.Y.d0();
                    this.W.R();
                    this.X.R();
                    this.Z.R();
                }
                if (i2 == 4) {
                    this.Z.d0();
                    this.W.R();
                    this.X.R();
                    this.Y.R();
                    return;
                }
                return;
            }
            this.X.d0();
            this.W.R();
        }
        this.Y.R();
        this.Z.R();
    }

    @SuppressLint({"SetTextI18n"})
    public final void X0() {
        f1(1, true, true);
        if (!M0()) {
            i1(1);
            return;
        }
        ArrayList<c.h.a.i.f> arrayListU1 = this.C.u1(this.R, "live");
        if (arrayListU1 != null && arrayListU1.size() != 0) {
            this.m0 = arrayListU1.get(0).getName();
            this.u = arrayListU1.get(0).I();
            this.y = arrayListU1.get(0).X();
            this.q0 = arrayListU1.get(0).g();
            this.u0 = arrayListU1.get(0).e0();
            try {
                this.N = Integer.parseInt(arrayListU1.get(0).Y());
            } catch (NumberFormatException unused) {
                this.N = -1;
            }
        }
        this.W.V();
        if (this.g0.booleanValue()) {
            this.W.Y(Uri.parse(this.J), true, this.m0);
            NSTIJKPlayerMulti1 nSTIJKPlayerMulti1 = this.W;
            nSTIJKPlayerMulti1.A = 0;
            nSTIJKPlayerMulti1.C = false;
            nSTIJKPlayerMulti1.start();
        }
    }

    @SuppressLint({"SetTextI18n"})
    public void Y0() {
        f1(2, true, true);
        if (!M0()) {
            i1(2);
            return;
        }
        ArrayList<c.h.a.i.f> arrayListU1 = this.C.u1(this.S, "live");
        if (arrayListU1 != null && arrayListU1.size() != 0) {
            this.n0 = arrayListU1.get(0).getName();
            this.v = arrayListU1.get(0).I();
            this.z = arrayListU1.get(0).X();
            this.r0 = arrayListU1.get(0).g();
            this.v0 = arrayListU1.get(0).e0();
            try {
                this.O = Integer.parseInt(arrayListU1.get(0).Y());
            } catch (NumberFormatException unused) {
                this.O = -1;
            }
        }
        this.X.V();
        if (this.g0.booleanValue()) {
            this.X.Y(Uri.parse(this.K), true, this.n0);
            NSTIJKPlayerMulti2 nSTIJKPlayerMulti2 = this.X;
            nSTIJKPlayerMulti2.A = 0;
            nSTIJKPlayerMulti2.C = false;
            nSTIJKPlayerMulti2.start();
        }
    }

    @SuppressLint({"SetTextI18n"})
    public void Z0() {
        f1(3, true, true);
        if (!M0()) {
            i1(3);
            return;
        }
        ArrayList<c.h.a.i.f> arrayListU1 = this.C.u1(this.T, "live");
        if (arrayListU1 != null && arrayListU1.size() != 0) {
            this.o0 = arrayListU1.get(0).getName();
            this.w = arrayListU1.get(0).I();
            this.A = arrayListU1.get(0).X();
            this.s0 = arrayListU1.get(0).g();
            this.w0 = arrayListU1.get(0).e0();
            try {
                this.P = Integer.parseInt(arrayListU1.get(0).Y());
            } catch (NumberFormatException unused) {
                this.P = -1;
            }
        }
        this.Y.V();
        if (this.g0.booleanValue()) {
            this.Y.Y(Uri.parse(this.L), true, this.o0);
            NSTIJKPlayerMulti3 nSTIJKPlayerMulti3 = this.Y;
            nSTIJKPlayerMulti3.A = 0;
            nSTIJKPlayerMulti3.C = false;
            nSTIJKPlayerMulti3.start();
        }
    }

    @SuppressLint({"SetTextI18n"})
    public void a1() {
        f1(4, true, true);
        if (!M0()) {
            i1(4);
            return;
        }
        ArrayList<c.h.a.i.f> arrayListU1 = this.C.u1(this.U, "live");
        if (arrayListU1 != null && arrayListU1.size() != 0) {
            this.p0 = arrayListU1.get(0).getName();
            this.x = arrayListU1.get(0).I();
            this.B = arrayListU1.get(0).X();
            this.t0 = arrayListU1.get(0).g();
            this.x0 = arrayListU1.get(0).e0();
            try {
                this.Q = Integer.parseInt(arrayListU1.get(0).Y());
            } catch (NumberFormatException unused) {
                this.Q = -1;
            }
        }
        this.Z.V();
        if (this.g0.booleanValue()) {
            this.Z.Y(Uri.parse(this.M), true, this.p0);
            NSTIJKPlayerMulti4 nSTIJKPlayerMulti4 = this.Z;
            nSTIJKPlayerMulti4.A = 0;
            nSTIJKPlayerMulti4.C = false;
            nSTIJKPlayerMulti4.start();
        }
    }

    public final void b1(int i2, View view) {
        if (this.f29192f != null) {
            this.l0 = i2;
            PopupMenu popupMenu = new PopupMenu(this, view);
            popupMenu.getMenuInflater().inflate(R.menu.menu_multiplayer, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new j(i2));
            popupMenu.show();
        }
    }

    public void d1(int i2) {
        NSTIJKPlayerMulti1 nSTIJKPlayerMulti1;
        NSTIJKPlayerMulti2 nSTIJKPlayerMulti2;
        NSTIJKPlayerMulti3 nSTIJKPlayerMulti3;
        NSTIJKPlayerMulti4 nSTIJKPlayerMulti4;
        NSTIJKPlayerMulti1 nSTIJKPlayerMulti12;
        NSTIJKPlayerMulti2 nSTIJKPlayerMulti22;
        NSTIJKPlayerMulti3 nSTIJKPlayerMulti32;
        NSTIJKPlayerMulti4 nSTIJKPlayerMulti42;
        Boolean bool = Boolean.FALSE;
        if (i2 == 0) {
            bool = Boolean.TRUE;
        }
        if ((bool.booleanValue() || i2 == 1) && (nSTIJKPlayerMulti1 = this.W) != null) {
            nSTIJKPlayerMulti1.pause();
        }
        if ((bool.booleanValue() || i2 == 2) && (nSTIJKPlayerMulti2 = this.X) != null) {
            nSTIJKPlayerMulti2.pause();
        }
        if ((bool.booleanValue() || i2 == 3) && (nSTIJKPlayerMulti3 = this.Y) != null) {
            nSTIJKPlayerMulti3.pause();
        }
        if ((bool.booleanValue() || i2 == 4) && (nSTIJKPlayerMulti4 = this.Z) != null) {
            nSTIJKPlayerMulti4.pause();
        }
        try {
            if ((bool.booleanValue() || i2 == 1) && (nSTIJKPlayerMulti12 = this.W) != null) {
                if (nSTIJKPlayerMulti12.P()) {
                    this.W.J();
                } else {
                    this.W.c0();
                    this.W.T(true);
                    this.W.b0();
                }
                IjkMediaPlayer.native_profileEnd();
                if (i2 == 1) {
                    this.J = BuildConfig.FLAVOR;
                    this.W.f29552c = null;
                    this.Q0.setVisibility(8);
                }
            }
            if ((bool.booleanValue() || i2 == 2) && (nSTIJKPlayerMulti22 = this.X) != null) {
                if (nSTIJKPlayerMulti22.P()) {
                    this.X.J();
                } else {
                    this.X.c0();
                    this.X.T(true);
                    this.X.b0();
                }
                IjkMediaPlayer.native_profileEnd();
                if (i2 == 2) {
                    this.K = BuildConfig.FLAVOR;
                    this.X.f29577c = null;
                    this.R0.setVisibility(8);
                }
            }
            if ((bool.booleanValue() || i2 == 3) && (nSTIJKPlayerMulti32 = this.Y) != null) {
                if (nSTIJKPlayerMulti32.P()) {
                    this.Y.J();
                } else {
                    this.Y.c0();
                    this.Y.T(true);
                    this.Y.b0();
                }
                IjkMediaPlayer.native_profileEnd();
                if (i2 == 3) {
                    this.L = BuildConfig.FLAVOR;
                    this.Y.f29602c = null;
                    this.S0.setVisibility(8);
                }
            }
            if ((bool.booleanValue() || i2 == 4) && (nSTIJKPlayerMulti42 = this.Z) != null) {
                if (nSTIJKPlayerMulti42.P()) {
                    this.Z.J();
                } else {
                    this.Z.c0();
                    this.Z.T(true);
                    this.Z.b0();
                }
                IjkMediaPlayer.native_profileEnd();
                if (i2 == 4) {
                    this.M = BuildConfig.FLAVOR;
                    this.Z.f29627c = null;
                    this.T0.setVisibility(8);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // a.b.k.c, a.i.h.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyEvent.getAction() == 0;
        if (keyCode == 82) {
            try {
                keyEvent = z ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent);
                return keyEvent;
            } catch (Exception unused) {
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1() {
        findViewById(R.id.app_video_box_1).setBackground(getResources().getDrawable(R.drawable.selector_checkbox));
        findViewById(R.id.app_video_box_2).setBackground(getResources().getDrawable(R.drawable.selector_checkbox));
        findViewById(R.id.app_video_box_3).setBackground(getResources().getDrawable(R.drawable.selector_checkbox));
        findViewById(R.id.app_video_box_4).setBackground(getResources().getDrawable(R.drawable.selector_checkbox));
    }

    public final void f1(int i2, boolean z, boolean z2) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        e1();
        if (i2 == 1) {
            if ((z && this.f29194h.getVisibility() != 0) || (z && z2)) {
                this.W.setVisibility(0);
            }
            findViewById(R.id.app_video_box_1).setFocusable(true);
            findViewById(R.id.app_video_box_1).requestFocus();
            findViewById(R.id.app_video_box_1).setBackground(getResources().getDrawable(R.drawable.shape_checkbox_focused));
            viewFindViewById3 = findViewById(R.id.app_video_box_2);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    if ((z && this.f29196j.getVisibility() != 0) || (z && z2)) {
                        this.Y.setVisibility(0);
                    }
                    findViewById(R.id.app_video_box_3).setFocusable(true);
                    findViewById(R.id.app_video_box_3).requestFocus();
                    findViewById(R.id.app_video_box_3).setBackground(getResources().getDrawable(R.drawable.shape_checkbox_focused));
                    findViewById(R.id.app_video_box_1).setFocusable(false);
                    viewFindViewById2 = findViewById(R.id.app_video_box_2);
                    viewFindViewById2.setFocusable(false);
                    viewFindViewById = findViewById(R.id.app_video_box_4);
                    viewFindViewById.setFocusable(false);
                }
                if (i2 == 4) {
                    if ((z && this.f29197k.getVisibility() != 0) || (z && z2)) {
                        this.Z.setVisibility(0);
                    }
                    findViewById(R.id.app_video_box_4).setFocusable(true);
                    findViewById(R.id.app_video_box_4).requestFocus();
                    findViewById(R.id.app_video_box_4).setBackground(getResources().getDrawable(R.drawable.shape_checkbox_focused));
                    findViewById(R.id.app_video_box_1).setFocusable(false);
                    findViewById(R.id.app_video_box_2).setFocusable(false);
                    viewFindViewById = findViewById(R.id.app_video_box_3);
                    viewFindViewById.setFocusable(false);
                }
                return;
            }
            if ((z && this.f29195i.getVisibility() != 0) || (z && z2)) {
                this.X.setVisibility(0);
            }
            findViewById(R.id.app_video_box_2).setFocusable(true);
            findViewById(R.id.app_video_box_2).requestFocus();
            findViewById(R.id.app_video_box_2).setBackground(getResources().getDrawable(R.drawable.shape_checkbox_focused));
            viewFindViewById3 = findViewById(R.id.app_video_box_1);
        }
        viewFindViewById3.setFocusable(false);
        viewFindViewById2 = findViewById(R.id.app_video_box_3);
        viewFindViewById2.setFocusable(false);
        viewFindViewById = findViewById(R.id.app_video_box_4);
        viewFindViewById.setFocusable(false);
    }

    @SuppressLint({"ResourceType"})
    public final void g1(Context context) {
        try {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.screenPopup);
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            View viewInflate = new c.h.a.k.d.a.a(context).A().equals(c.h.a.h.n.a.s0) ? layoutInflater.inflate(R.layout.screen_selector_popup_tv, linearLayout) : layoutInflater.inflate(R.layout.screen_selector_popup, linearLayout);
            this.U0 = (ImageView) viewInflate.findViewById(R.id.deafult);
            this.V0 = (ImageView) viewInflate.findViewById(R.id.screen1);
            this.W0 = (ImageView) viewInflate.findViewById(R.id.screen2);
            this.X0 = (ImageView) viewInflate.findViewById(R.id.screen3);
            this.Y0 = (ImageView) viewInflate.findViewById(R.id.screen4);
            this.Z0 = (ImageView) viewInflate.findViewById(R.id.screen5);
            PopupWindow popupWindow = new PopupWindow(context);
            this.z0 = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.z0.setWidth(-1);
            this.z0.setHeight(-1);
            this.z0.setFocusable(true);
            this.z0.showAtLocation(viewInflate, 0, 0, 0);
            this.U0.setOnClickListener(new d());
            this.V0.setOnClickListener(new e());
            this.W0.setOnClickListener(new f());
            this.X0.setOnClickListener(new g());
            this.Y0.setOnClickListener(new h());
            this.Z0.setOnClickListener(new i());
        } catch (Exception unused) {
        }
    }

    public final void h1() {
        int i2;
        d1(0);
        String str = this.i0;
        str.hashCode();
        switch (str) {
            case "screen1":
                i2 = R.layout.activity_vlcplayer_multiplayer1;
                break;
            case "screen2":
                i2 = R.layout.activity_vlcplayer_multiplayer2;
                break;
            case "screen3":
                i2 = R.layout.activity_vlcplayer_multiplayer3;
                break;
            case "screen4":
                i2 = R.layout.activity_vlcplayer_multiplayer4;
                break;
            case "screen5":
                i2 = R.layout.activity_vlcplayer_multiplayer5;
                break;
            default:
                i2 = R.layout.activity_vlcplayer_multiplayer;
                break;
        }
        setContentView(i2);
        U0();
        if (this.R.equals("0") || this.J.equals(BuildConfig.FLAVOR)) {
            f1(1, false, false);
        } else {
            X0();
        }
    }

    public final void i1(int i2) {
        TextView textView;
        StringBuilder sb;
        String strO0 = c.h.a.h.n.e.o0(c.h.a.k.d.c.a.h.a() + c.h.a.k.d.c.a.h.i());
        if (i2 == 1) {
            this.W.setVisibility(8);
            this.f29194h.setVisibility(0);
            textView = this.f29198l;
            sb = new StringBuilder();
        } else if (i2 == 2) {
            this.X.setVisibility(8);
            this.f29195i.setVisibility(0);
            textView = this.f29199m;
            sb = new StringBuilder();
        } else if (i2 == 3) {
            this.Y.setVisibility(8);
            this.f29196j.setVisibility(0);
            textView = this.f29200n;
            sb = new StringBuilder();
        } else {
            if (i2 != 4) {
                return;
            }
            this.Z.setVisibility(8);
            this.f29197k.setVisibility(0);
            textView = this.f29201o;
            sb = new StringBuilder();
        }
        sb.append(strO0);
        sb.append(this.f29193g);
        sb.append(this.G);
        textView.setText(sb.toString());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void j1(String str) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    b2 = 0;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    b2 = 1;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    b2 = 2;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    b2 = 3;
                }
                break;
        }
        switch (b2) {
            case 0:
            default:
                e1();
                this.l0 = 1;
                W0(1);
                findViewById(R.id.app_video_box_1).setFocusable(true);
                findViewById(R.id.app_video_box_1).requestFocus();
                findViewById(R.id.app_video_box_1).setBackground(getResources().getDrawable(R.drawable.shape_checkbox_focused));
                viewFindViewById = findViewById(R.id.app_video_box_2);
                viewFindViewById.setFocusable(false);
                viewFindViewById2 = findViewById(R.id.app_video_box_3);
                viewFindViewById2.setFocusable(false);
                viewFindViewById3 = findViewById(R.id.app_video_box_4);
                break;
            case 1:
                e1();
                this.l0 = 2;
                W0(2);
                findViewById(R.id.app_video_box_2).setFocusable(true);
                findViewById(R.id.app_video_box_2).requestFocus();
                findViewById(R.id.app_video_box_2).setBackground(getResources().getDrawable(R.drawable.shape_checkbox_focused));
                viewFindViewById = findViewById(R.id.app_video_box_1);
                viewFindViewById.setFocusable(false);
                viewFindViewById2 = findViewById(R.id.app_video_box_3);
                viewFindViewById2.setFocusable(false);
                viewFindViewById3 = findViewById(R.id.app_video_box_4);
                break;
            case 2:
                e1();
                this.l0 = 3;
                W0(3);
                findViewById(R.id.app_video_box_3).setFocusable(true);
                findViewById(R.id.app_video_box_3).requestFocus();
                findViewById(R.id.app_video_box_3).setBackground(getResources().getDrawable(R.drawable.shape_checkbox_focused));
                findViewById(R.id.app_video_box_1).setFocusable(false);
                viewFindViewById2 = findViewById(R.id.app_video_box_2);
                viewFindViewById2.setFocusable(false);
                viewFindViewById3 = findViewById(R.id.app_video_box_4);
                break;
            case 3:
                e1();
                this.l0 = 4;
                W0(4);
                findViewById(R.id.app_video_box_4).setFocusable(true);
                findViewById(R.id.app_video_box_4).requestFocus();
                findViewById(R.id.app_video_box_4).setBackground(getResources().getDrawable(R.drawable.shape_checkbox_focused));
                findViewById(R.id.app_video_box_1).setFocusable(false);
                findViewById(R.id.app_video_box_2).setFocusable(false);
                viewFindViewById3 = findViewById(R.id.app_video_box_3);
                break;
        }
        viewFindViewById3.setFocusable(false);
    }

    public final void k1() {
        try {
            this.b1 = new Handler();
            c cVar = new c();
            this.a1 = cVar;
            if (this.d1[0]) {
                return;
            }
            cVar.run();
        } catch (Exception e2) {
            z.b(BuildConfig.FLAVOR, BuildConfig.FLAVOR + e2);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i2;
        switch (view.getId()) {
            case R.id.app_video_box_1 /* 2131427470 */:
                i2 = 1;
                break;
            case R.id.app_video_box_2 /* 2131427471 */:
                i2 = 2;
                break;
            case R.id.app_video_box_3 /* 2131427472 */:
                i2 = 3;
                break;
            case R.id.app_video_box_4 /* 2131427473 */:
                i2 = 4;
                break;
            default:
                return;
        }
        try {
            P0(i2);
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f29192f = this;
        super.onCreate(bundle);
        this.i0 = m.s(this.f29192f);
        h1();
        if (m.x(this.f29192f)) {
            new Handler().postDelayed(new b(), 100L);
            k1();
        }
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        this.J = getIntent().getStringExtra("url");
        String strValueOf = String.valueOf(getIntent().getIntExtra("CHANNEL_NUM", 0));
        this.R = strValueOf;
        if (strValueOf.equals("0") || this.J.equals(BuildConfig.FLAVOR)) {
            f1(1, false, false);
        } else {
            X0();
        }
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            d1(0);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0197  */
    @Override // a.b.k.c, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r16, android.view.KeyEvent r17) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerMultiActivity.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        switch (view.getId()) {
            case R.id.app_video_box_1 /* 2131427470 */:
                try {
                    if (!this.J.equals(BuildConfig.FLAVOR)) {
                        W0(1);
                        f1(1, true, false);
                        b1(1, view);
                    }
                } catch (Exception unused) {
                }
                break;
            case R.id.app_video_box_2 /* 2131427471 */:
                try {
                    if (!this.K.equals(BuildConfig.FLAVOR)) {
                        W0(2);
                        f1(2, true, false);
                        b1(2, view);
                    }
                } catch (Exception unused2) {
                }
                break;
            case R.id.app_video_box_3 /* 2131427472 */:
                try {
                    if (!this.L.equals(BuildConfig.FLAVOR)) {
                        W0(3);
                        f1(3, true, false);
                        b1(3, view);
                    }
                } catch (Exception unused3) {
                }
                break;
            case R.id.app_video_box_4 /* 2131427473 */:
                try {
                    if (!this.M.equals(BuildConfig.FLAVOR)) {
                        W0(4);
                        f1(4, true, false);
                        b1(4, view);
                    }
                } catch (Exception unused4) {
                }
                break;
        }
        return true;
        return true;
        return true;
        return true;
        return true;
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        c.h.a.h.n.e.g(this.f29192f);
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            d1(0);
        } catch (Exception unused) {
        }
    }

    @Override // c.h.a.k.f.g
    public void r(String str, String str2) {
        int i2 = this.l0;
        if (i2 == 1) {
            if (this.W != null) {
                this.J = str;
                this.R = str2;
                findViewById(R.id.app_video_box_1).setFocusable(true);
                X0();
                return;
            }
            return;
        }
        if (i2 == 2) {
            if (this.X != null) {
                this.K = str;
                this.S = str2;
                findViewById(R.id.app_video_box_2).setFocusable(true);
                Y0();
                return;
            }
            return;
        }
        if (i2 == 3) {
            if (this.Y != null) {
                this.L = str;
                this.T = str2;
                findViewById(R.id.app_video_box_3).setFocusable(true);
                Z0();
                return;
            }
            return;
        }
        if (i2 != 4 || this.Z == null) {
            return;
        }
        this.M = str;
        this.U = str2;
        findViewById(R.id.app_video_box_4).setFocusable(true);
        a1();
    }
}
