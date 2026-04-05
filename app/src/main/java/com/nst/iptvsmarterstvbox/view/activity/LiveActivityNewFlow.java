package com.nst.iptvsmarterstvbox.view.activity;

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
import com.facebook.ads.NativeAd;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class LiveActivityNewFlow extends a.b.k.c implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ProgressBar f25705d;
    public PopupWindow A;
    public SearchView C;
    public Handler D;
    public MenuItem F;
    public Menu G;
    public List<Object> K;
    public Boolean L;
    public Boolean M;

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button bt_explore_all;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f25706e;

    @BindView
    public TextView emptyView;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f25707f;

    @BindView
    public FrameLayout frameLayout;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GridLayoutManager f25708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.h.a.k.b.k f25709h;

    @BindView
    public ImageView ivBTUP;

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

    @BindView
    public RelativeLayout rl_no_arrangement_found;
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

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25710i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25711j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25712k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f25713l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25714m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f25715n = 20;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<String> f25716o = new ArrayList<>();
    public String w = BuildConfig.FLAVOR;
    public String x = BuildConfig.FLAVOR;
    public c.h.a.i.q.b y = new c.h.a.i.q.b();
    public c.h.a.i.q.b z = new c.h.a.i.q.b();
    public ArrayList<c.h.a.i.e> B = new ArrayList<>();
    public int E = -1;
    public AsyncTask H = null;
    public int I = 0;
    public ArrayList<NativeAd> J = new ArrayList<>();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LiveActivityNewFlow.this.A.dismiss();
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f25718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f25719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f25720d;

        public b(RadioGroup radioGroup, View view, Activity activity) {
            this.f25718b = radioGroup;
            this.f25719c = view;
            this.f25720d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activity;
            String str;
            RadioButton radioButton = (RadioButton) this.f25719c.findViewById(this.f25718b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(LiveActivityNewFlow.this.getResources().getString(R.string.sort_atoz))) {
                activity = this.f25720d;
                str = "1";
            } else if (radioButton.getText().toString().equals(LiveActivityNewFlow.this.getResources().getString(R.string.sort_ztoa))) {
                activity = this.f25720d;
                str = "2";
            } else {
                activity = this.f25720d;
                str = "0";
            }
            c.h.a.i.q.m.R(str, activity);
            LiveActivityNewFlow.this.H = LiveActivityNewFlow.this.new l().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            LiveActivityNewFlow.this.A.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(LiveActivityNewFlow.this.f25706e);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(LiveActivityNewFlow.this.f25706e);
        }
    }

    public class g implements SearchView.l {
        public g() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            c.h.a.h.n.a.T = str.length() > 0 ? Boolean.FALSE : Boolean.TRUE;
            LiveActivityNewFlow.this.tvNoRecordFound.setVisibility(8);
            LiveActivityNewFlow liveActivityNewFlow = LiveActivityNewFlow.this;
            if (liveActivityNewFlow.f25709h == null || (textView = liveActivityNewFlow.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            LiveActivityNewFlow liveActivityNewFlow2 = LiveActivityNewFlow.this;
            liveActivityNewFlow2.f25709h.r0(str, liveActivityNewFlow2.tvNoRecordFound);
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
            c.h.a.h.n.e.N(LiveActivityNewFlow.this.f25706e);
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

    @SuppressLint({"StaticFieldLeak"})
    public class l extends AsyncTask<String, Void, Boolean> {
        public l() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(LiveActivityNewFlow.this.G0());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            LiveActivityNewFlow.this.H0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class m implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f25732b;

        public m(View view) {
            this.f25732b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25732b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25732b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f25732b, "scaleY", f2);
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

    public LiveActivityNewFlow() {
        Boolean bool = Boolean.FALSE;
        this.L = bool;
        this.M = bool;
    }

    public final void D0() {
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

    public final ArrayList<String> E0() {
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.p.d1(c.h.a.i.q.m.z(this.f25706e));
        this.q = arrayListD1;
        if (arrayListD1 != null) {
            for (c.h.a.i.q.i iVar : arrayListD1) {
                if (iVar.a().equals("1")) {
                    this.f25716o.add(iVar.b());
                }
            }
        }
        return this.f25716o;
    }

    public final ArrayList<c.h.a.i.e> F0(ArrayList<c.h.a.i.e> arrayList, ArrayList<String> arrayList2) {
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x0108 A[Catch: NullPointerException | Exception -> 0x034f, NullPointerException | Exception -> 0x034f, TryCatch #0 {NullPointerException | Exception -> 0x034f, blocks: (B:3:0x0009, B:5:0x000e, B:8:0x0092, B:8:0x0092, B:11:0x009e, B:11:0x009e, B:12:0x00b0, B:12:0x00b0, B:17:0x00d5, B:17:0x00d5, B:19:0x00e3, B:19:0x00e3, B:21:0x00e7, B:21:0x00e7, B:23:0x00f9, B:23:0x00f9, B:24:0x0101, B:24:0x0101, B:26:0x0105, B:26:0x0105, B:28:0x0115, B:28:0x0115, B:30:0x0121, B:30:0x0121, B:32:0x012f, B:32:0x012f, B:35:0x0137, B:35:0x0137, B:37:0x013f, B:37:0x013f, B:39:0x0143, B:39:0x0143, B:42:0x014b, B:42:0x014b, B:44:0x015d, B:44:0x015d, B:46:0x016f, B:46:0x016f, B:48:0x0183, B:48:0x0183, B:53:0x01fa, B:53:0x01fa, B:54:0x01ff, B:54:0x01ff, B:49:0x01ac, B:49:0x01ac, B:51:0x01d0, B:51:0x01d0, B:52:0x01d2, B:52:0x01d2, B:55:0x0203, B:55:0x0203, B:57:0x0207, B:57:0x0207, B:59:0x020d, B:59:0x020d, B:90:0x02f7, B:90:0x02f7, B:93:0x02fc, B:93:0x02fc, B:95:0x0304, B:95:0x0304, B:60:0x0213, B:60:0x0213, B:62:0x0217, B:62:0x0217, B:65:0x021f, B:65:0x021f, B:67:0x0227, B:67:0x0227, B:69:0x022b, B:69:0x022b, B:72:0x0233, B:72:0x0233, B:74:0x0245, B:74:0x0245, B:76:0x0257, B:76:0x0257, B:78:0x026b, B:78:0x026b, B:83:0x02e2, B:83:0x02e2, B:84:0x02e7, B:84:0x02e7, B:79:0x0294, B:79:0x0294, B:81:0x02b8, B:81:0x02b8, B:82:0x02ba, B:82:0x02ba, B:85:0x02eb, B:85:0x02eb, B:87:0x02ef, B:87:0x02ef, B:27:0x0108, B:27:0x0108, B:13:0x00b8, B:13:0x00b8, B:16:0x00c4, B:16:0x00c4), top: B:99:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0121 A[Catch: NullPointerException | Exception -> 0x034f, NullPointerException | Exception -> 0x034f, TryCatch #0 {NullPointerException | Exception -> 0x034f, blocks: (B:3:0x0009, B:5:0x000e, B:8:0x0092, B:8:0x0092, B:11:0x009e, B:11:0x009e, B:12:0x00b0, B:12:0x00b0, B:17:0x00d5, B:17:0x00d5, B:19:0x00e3, B:19:0x00e3, B:21:0x00e7, B:21:0x00e7, B:23:0x00f9, B:23:0x00f9, B:24:0x0101, B:24:0x0101, B:26:0x0105, B:26:0x0105, B:28:0x0115, B:28:0x0115, B:30:0x0121, B:30:0x0121, B:32:0x012f, B:32:0x012f, B:35:0x0137, B:35:0x0137, B:37:0x013f, B:37:0x013f, B:39:0x0143, B:39:0x0143, B:42:0x014b, B:42:0x014b, B:44:0x015d, B:44:0x015d, B:46:0x016f, B:46:0x016f, B:48:0x0183, B:48:0x0183, B:53:0x01fa, B:53:0x01fa, B:54:0x01ff, B:54:0x01ff, B:49:0x01ac, B:49:0x01ac, B:51:0x01d0, B:51:0x01d0, B:52:0x01d2, B:52:0x01d2, B:55:0x0203, B:55:0x0203, B:57:0x0207, B:57:0x0207, B:59:0x020d, B:59:0x020d, B:90:0x02f7, B:90:0x02f7, B:93:0x02fc, B:93:0x02fc, B:95:0x0304, B:95:0x0304, B:60:0x0213, B:60:0x0213, B:62:0x0217, B:62:0x0217, B:65:0x021f, B:65:0x021f, B:67:0x0227, B:67:0x0227, B:69:0x022b, B:69:0x022b, B:72:0x0233, B:72:0x0233, B:74:0x0245, B:74:0x0245, B:76:0x0257, B:76:0x0257, B:78:0x026b, B:78:0x026b, B:83:0x02e2, B:83:0x02e2, B:84:0x02e7, B:84:0x02e7, B:79:0x0294, B:79:0x0294, B:81:0x02b8, B:81:0x02b8, B:82:0x02ba, B:82:0x02ba, B:85:0x02eb, B:85:0x02eb, B:87:0x02ef, B:87:0x02ef, B:27:0x0108, B:27:0x0108, B:13:0x00b8, B:13:0x00b8, B:16:0x00c4, B:16:0x00c4), top: B:99:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0213 A[Catch: NullPointerException | Exception -> 0x034f, NullPointerException | Exception -> 0x034f, TryCatch #0 {NullPointerException | Exception -> 0x034f, blocks: (B:3:0x0009, B:5:0x000e, B:8:0x0092, B:8:0x0092, B:11:0x009e, B:11:0x009e, B:12:0x00b0, B:12:0x00b0, B:17:0x00d5, B:17:0x00d5, B:19:0x00e3, B:19:0x00e3, B:21:0x00e7, B:21:0x00e7, B:23:0x00f9, B:23:0x00f9, B:24:0x0101, B:24:0x0101, B:26:0x0105, B:26:0x0105, B:28:0x0115, B:28:0x0115, B:30:0x0121, B:30:0x0121, B:32:0x012f, B:32:0x012f, B:35:0x0137, B:35:0x0137, B:37:0x013f, B:37:0x013f, B:39:0x0143, B:39:0x0143, B:42:0x014b, B:42:0x014b, B:44:0x015d, B:44:0x015d, B:46:0x016f, B:46:0x016f, B:48:0x0183, B:48:0x0183, B:53:0x01fa, B:53:0x01fa, B:54:0x01ff, B:54:0x01ff, B:49:0x01ac, B:49:0x01ac, B:51:0x01d0, B:51:0x01d0, B:52:0x01d2, B:52:0x01d2, B:55:0x0203, B:55:0x0203, B:57:0x0207, B:57:0x0207, B:59:0x020d, B:59:0x020d, B:90:0x02f7, B:90:0x02f7, B:93:0x02fc, B:93:0x02fc, B:95:0x0304, B:95:0x0304, B:60:0x0213, B:60:0x0213, B:62:0x0217, B:62:0x0217, B:65:0x021f, B:65:0x021f, B:67:0x0227, B:67:0x0227, B:69:0x022b, B:69:0x022b, B:72:0x0233, B:72:0x0233, B:74:0x0245, B:74:0x0245, B:76:0x0257, B:76:0x0257, B:78:0x026b, B:78:0x026b, B:83:0x02e2, B:83:0x02e2, B:84:0x02e7, B:84:0x02e7, B:79:0x0294, B:79:0x0294, B:81:0x02b8, B:81:0x02b8, B:82:0x02ba, B:82:0x02ba, B:85:0x02eb, B:85:0x02eb, B:87:0x02ef, B:87:0x02ef, B:27:0x0108, B:27:0x0108, B:13:0x00b8, B:13:0x00b8, B:16:0x00c4, B:16:0x00c4), top: B:99:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G0() {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.LiveActivityNewFlow.G0():boolean");
    }

    public final void H0() {
        List<Object> list;
        ProgressBar progressBar;
        List<Object> list2;
        if (c.h.a.i.q.m.f(this.f25706e).equals("m3u")) {
            if (this.t == null || this.I == 0 || (list2 = this.K) == null) {
                ProgressBar progressBar2 = this.pbLoader;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                    this.rl_no_arrangement_found.setVisibility(0);
                    return;
                }
                return;
            }
            this.f25709h = new c.h.a.k.b.k(list2, this.f25706e);
            this.f25708g = new c.h.a.k.d.a.a(this.f25706e).A().equals(c.h.a.h.n.a.s0) ? new GridLayoutManager(this.f25706e, 2) : new GridLayoutManager(this.f25706e, 2);
            this.myRecyclerView.setLayoutManager(this.f25708g);
            this.myRecyclerView.setItemAnimator(new a.y.e.c());
            this.myRecyclerView.setAdapter(this.f25709h);
            progressBar = this.pbLoader;
            if (progressBar == null) {
                return;
            }
        } else {
            if (this.t == null || (list = this.K) == null) {
                return;
            }
            this.f25709h = new c.h.a.k.b.k(list, this.f25706e);
            this.f25708g = new c.h.a.k.d.a.a(this.f25706e).A().equals(c.h.a.h.n.a.s0) ? new GridLayoutManager(this.f25706e, 2) : new GridLayoutManager(this.f25706e, 2);
            this.myRecyclerView.setLayoutManager(this.f25708g);
            this.myRecyclerView.setItemAnimator(new a.y.e.c());
            this.myRecyclerView.setAdapter(this.f25709h);
            progressBar = this.pbLoader;
            if (progressBar == null) {
                return;
            }
        }
        progressBar.setVisibility(8);
    }

    public final void I0(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.sort_layout, (RelativeLayout) activity.findViewById(R.id.rl_password_prompt));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.A = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.A.setWidth(-1);
            this.A.setHeight(-1);
            this.A.setFocusable(true);
            this.A.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(R.id.bt_save_password);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_close);
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.rg_radio);
            RadioButton radioButton = (RadioButton) viewInflate.findViewById(R.id.rb_normal);
            radioButton.requestFocus();
            RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(R.id.rb_lastadded);
            radioButton2.setVisibility(8);
            RadioButton radioButton3 = (RadioButton) viewInflate.findViewById(R.id.rb_atoz);
            RadioButton radioButton4 = (RadioButton) viewInflate.findViewById(R.id.rb_ztoa);
            RadioButton radioButton5 = (RadioButton) viewInflate.findViewById(R.id.rb_channel_asc);
            radioButton5.setVisibility(8);
            RadioButton radioButton6 = (RadioButton) viewInflate.findViewById(R.id.rb_channel_desc);
            radioButton6.setVisibility(8);
            radioButton.setOnFocusChangeListener(new m(radioButton));
            radioButton2.setOnFocusChangeListener(new m(radioButton2));
            radioButton3.setOnFocusChangeListener(new m(radioButton3));
            radioButton4.setOnFocusChangeListener(new m(radioButton4));
            radioButton5.setOnFocusChangeListener(new m(radioButton5));
            radioButton6.setOnFocusChangeListener(new m(radioButton6));
            String strJ = c.h.a.i.q.m.j(activity);
            if (strJ.equals("1")) {
                radioButton3.setChecked(true);
            } else if (strJ.equals("2")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new a());
            button.setOnClickListener(new b(radioGroup, viewInflate, activity));
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
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setClickable(true);
        }
        c.h.a.k.b.k kVar = this.f25709h;
        if (kVar != null && (progressBar = f25705d) != null) {
            kVar.v0(progressBar);
            this.f25709h.w();
        }
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_bt_up) {
            this.H = new l().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else if (id == R.id.logo) {
            c.h.a.h.n.e.b(this.f25706e);
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
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_live_new_flow);
        ButterKnife.a(this);
        c.h.a.h.n.a.T = Boolean.FALSE;
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(R.drawable.black_background));
        }
        D0();
        v0((Toolbar) findViewById(R.id.toolbar));
        this.f25706e = this;
        Handler handler = new Handler();
        this.D = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.logo.setOnClickListener(new c());
        this.H = new l().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.frameLayout.setVisibility(8);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.x(R.menu.menu_search);
        this.G = menu;
        this.F = menu.getItem(2).getSubMenu().findItem(R.id.empty);
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
        AsyncTask asyncTask = this.H;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        this.H.cancel(true);
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
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout1 && (context = this.f25706e) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new f()).g(getResources().getString(R.string.no), new e()).n();
        }
        if (itemId == R.id.action_search) {
            SearchView searchView = (SearchView) a.i.r.j.b(menuItem);
            this.C = searchView;
            searchView.setQueryHint(getResources().getString(R.string.search_live_categories));
            this.C.setIconifiedByDefault(false);
            this.C.setOnQueryTextListener(new g());
            return true;
        }
        if (itemId == R.id.menu_load_channels_vod1) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f25706e.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f25706e.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f25706e.getResources().getString(R.string.yes), new h());
            aVar.g(this.f25706e.getResources().getString(R.string.no), new i());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide1) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.f25706e.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.f25706e.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.f25706e.getResources().getString(R.string.yes), new j());
            aVar2.g(this.f25706e.getResources().getString(R.string.no), new k());
            aVar2.n();
        }
        if (itemId == R.id.menu_sort) {
            this.tvNoRecordFound.setVisibility(8);
            I0(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        c.h.a.h.n.e.g(this.f25706e);
        getWindow().setFlags(1024, 1024);
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        c.h.a.k.b.k kVar = this.f25709h;
        if (kVar != null) {
            kVar.w();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f25707f = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f25707f.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }
}
