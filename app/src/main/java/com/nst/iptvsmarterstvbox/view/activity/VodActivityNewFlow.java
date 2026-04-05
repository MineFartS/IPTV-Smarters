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
import com.facebook.ads.NativeAd;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.adapter.VodAdapterNewFlow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class VodActivityNewFlow extends a.b.k.c implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ProgressBar f27048d;
    public MenuItem A;
    public Menu B;
    public c.h.a.i.q.l E;
    public List<Object> G;
    public Boolean H;
    public Boolean I;

    @BindView
    public LinearLayout activityLogin;

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button bt_explore_all;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f27049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f27050f;

    @BindView
    public FrameLayout frameLayout;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView.p f27051g;

    @BindView
    public TextView home;

    @BindView
    public ImageView iv_back_button;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.f f27055k;

    @BindView
    public ImageView logo;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<c.h.a.i.e> f27057m;

    @BindView
    public RecyclerView myRecyclerView;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<c.h.a.i.e> f27058n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<c.h.a.i.e> f27059o;
    public VodAdapterNewFlow p;

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
    public ArrayList<c.h.a.i.e> u;
    public ArrayList<c.h.a.i.e> v;
    public ArrayList<c.h.a.i.e> w;
    public PopupWindow y;
    public Handler z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f27052h = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f27053i = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.b f27054j = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.b f27056l = new c.h.a.i.q.b();
    public ArrayList<String> r = new ArrayList<>();
    public int x = -1;
    public AsyncTask C = null;
    public int D = 0;
    public ArrayList<NativeAd> F = new ArrayList<>();

    public class a implements SearchView.l {
        public a() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            c.h.a.h.n.a.T = str.length() > 0 ? Boolean.FALSE : Boolean.TRUE;
            VodActivityNewFlow.this.tvNoRecordFound.setVisibility(8);
            if (VodActivityNewFlow.this.p == null || (textView = VodActivityNewFlow.this.tvNoRecordFound) == null || textView.getVisibility() == 0) {
                return false;
            }
            VodActivityNewFlow.this.p.o0(str, VodActivityNewFlow.this.tvNoRecordFound);
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
            VodActivityNewFlow.this.y.dismiss();
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f27062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f27063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f27064d;

        public c(RadioGroup radioGroup, View view, Activity activity) {
            this.f27062b = radioGroup;
            this.f27063c = view;
            this.f27064d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activity;
            String str;
            RadioButton radioButton = (RadioButton) this.f27063c.findViewById(this.f27062b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(VodActivityNewFlow.this.getResources().getString(R.string.sort_atoz))) {
                activity = this.f27064d;
                str = "1";
            } else if (radioButton.getText().toString().equals(VodActivityNewFlow.this.getResources().getString(R.string.sort_ztoa))) {
                activity = this.f27064d;
                str = "2";
            } else {
                activity = this.f27064d;
                str = "0";
            }
            c.h.a.i.q.m.l0(str, activity);
            VodActivityNewFlow.this.C = VodActivityNewFlow.this.new n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            VodActivityNewFlow.this.y.dismiss();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodActivityNewFlow.this.f27049e.startActivity(new Intent(VodActivityNewFlow.this.f27049e, (Class<?>) NewDashboardActivity.class));
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.h.a.h.n.e.b(VodActivityNewFlow.this.f27049e);
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodActivityNewFlow.this.onBackPressed();
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
            c.h.a.h.n.e.O(VodActivityNewFlow.this.f27049e);
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(VodActivityNewFlow.this.f27049e);
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

    public class k implements DialogInterface.OnClickListener {
        public k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
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

    public class m implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f27075b;

        public m(View view) {
            this.f27075b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27075b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27075b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27075b, "scaleY", f2);
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
    public class n extends AsyncTask<String, Void, Boolean> {
        public n() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(VodActivityNewFlow.this.I0());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            VodActivityNewFlow.this.J0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public VodActivityNewFlow() {
        Boolean bool = Boolean.FALSE;
        this.H = bool;
        this.I = bool;
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
        ArrayList<c.h.a.i.q.i> arrayListD1 = this.f27055k.d1(c.h.a.i.q.m.z(this.f27049e));
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
                if (!z && (arrayList3 = this.t) != null) {
                    arrayList3.add(eVar);
                }
            }
        }
        return this.t;
    }

    public final void H0() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0109 A[Catch: NullPointerException | Exception -> 0x0378, NullPointerException | Exception -> 0x0378, TryCatch #0 {NullPointerException | Exception -> 0x0378, blocks: (B:3:0x0007, B:5:0x000c, B:9:0x0093, B:9:0x0093, B:10:0x00a4, B:10:0x00a4, B:13:0x00b7, B:13:0x00b7, B:16:0x00c3, B:16:0x00c3, B:17:0x00d3, B:17:0x00d3, B:22:0x00f6, B:22:0x00f6, B:26:0x010d, B:26:0x010d, B:28:0x011d, B:28:0x011d, B:30:0x0121, B:30:0x0121, B:32:0x012f, B:32:0x012f, B:34:0x0135, B:34:0x0135, B:36:0x0141, B:36:0x0141, B:38:0x0145, B:38:0x0145, B:41:0x014d, B:41:0x014d, B:43:0x0155, B:43:0x0155, B:45:0x0159, B:45:0x0159, B:48:0x0161, B:48:0x0161, B:50:0x0173, B:50:0x0173, B:52:0x0185, B:52:0x0185, B:54:0x0197, B:54:0x0197, B:56:0x01ab, B:56:0x01ab, B:61:0x0222, B:61:0x0222, B:62:0x0227, B:62:0x0227, B:57:0x01d4, B:57:0x01d4, B:59:0x01f8, B:59:0x01f8, B:60:0x01fa, B:60:0x01fa, B:63:0x022b, B:63:0x022b, B:65:0x022f, B:65:0x022f, B:67:0x0235, B:67:0x0235, B:99:0x0320, B:99:0x0320, B:102:0x0325, B:102:0x0325, B:104:0x032d, B:104:0x032d, B:68:0x023b, B:68:0x023b, B:70:0x023f, B:70:0x023f, B:73:0x0247, B:73:0x0247, B:75:0x024f, B:75:0x024f, B:77:0x0253, B:77:0x0253, B:80:0x025b, B:80:0x025b, B:82:0x026d, B:82:0x026d, B:84:0x027f, B:84:0x027f, B:86:0x0291, B:86:0x0291, B:88:0x02a3, B:88:0x02a3, B:90:0x02b7, B:90:0x02b7, B:92:0x030e, B:92:0x030e, B:93:0x0310, B:93:0x0310, B:91:0x02e3, B:91:0x02e3, B:94:0x0314, B:94:0x0314, B:96:0x0318, B:96:0x0318, B:33:0x0132, B:33:0x0132, B:25:0x0109, B:25:0x0109, B:18:0x00db, B:18:0x00db, B:21:0x00e7, B:21:0x00e7), top: B:108:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0132 A[Catch: NullPointerException | Exception -> 0x0378, NullPointerException | Exception -> 0x0378, TryCatch #0 {NullPointerException | Exception -> 0x0378, blocks: (B:3:0x0007, B:5:0x000c, B:9:0x0093, B:9:0x0093, B:10:0x00a4, B:10:0x00a4, B:13:0x00b7, B:13:0x00b7, B:16:0x00c3, B:16:0x00c3, B:17:0x00d3, B:17:0x00d3, B:22:0x00f6, B:22:0x00f6, B:26:0x010d, B:26:0x010d, B:28:0x011d, B:28:0x011d, B:30:0x0121, B:30:0x0121, B:32:0x012f, B:32:0x012f, B:34:0x0135, B:34:0x0135, B:36:0x0141, B:36:0x0141, B:38:0x0145, B:38:0x0145, B:41:0x014d, B:41:0x014d, B:43:0x0155, B:43:0x0155, B:45:0x0159, B:45:0x0159, B:48:0x0161, B:48:0x0161, B:50:0x0173, B:50:0x0173, B:52:0x0185, B:52:0x0185, B:54:0x0197, B:54:0x0197, B:56:0x01ab, B:56:0x01ab, B:61:0x0222, B:61:0x0222, B:62:0x0227, B:62:0x0227, B:57:0x01d4, B:57:0x01d4, B:59:0x01f8, B:59:0x01f8, B:60:0x01fa, B:60:0x01fa, B:63:0x022b, B:63:0x022b, B:65:0x022f, B:65:0x022f, B:67:0x0235, B:67:0x0235, B:99:0x0320, B:99:0x0320, B:102:0x0325, B:102:0x0325, B:104:0x032d, B:104:0x032d, B:68:0x023b, B:68:0x023b, B:70:0x023f, B:70:0x023f, B:73:0x0247, B:73:0x0247, B:75:0x024f, B:75:0x024f, B:77:0x0253, B:77:0x0253, B:80:0x025b, B:80:0x025b, B:82:0x026d, B:82:0x026d, B:84:0x027f, B:84:0x027f, B:86:0x0291, B:86:0x0291, B:88:0x02a3, B:88:0x02a3, B:90:0x02b7, B:90:0x02b7, B:92:0x030e, B:92:0x030e, B:93:0x0310, B:93:0x0310, B:91:0x02e3, B:91:0x02e3, B:94:0x0314, B:94:0x0314, B:96:0x0318, B:96:0x0318, B:33:0x0132, B:33:0x0132, B:25:0x0109, B:25:0x0109, B:18:0x00db, B:18:0x00db, B:21:0x00e7, B:21:0x00e7), top: B:108:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0141 A[Catch: NullPointerException | Exception -> 0x0378, NullPointerException | Exception -> 0x0378, TryCatch #0 {NullPointerException | Exception -> 0x0378, blocks: (B:3:0x0007, B:5:0x000c, B:9:0x0093, B:9:0x0093, B:10:0x00a4, B:10:0x00a4, B:13:0x00b7, B:13:0x00b7, B:16:0x00c3, B:16:0x00c3, B:17:0x00d3, B:17:0x00d3, B:22:0x00f6, B:22:0x00f6, B:26:0x010d, B:26:0x010d, B:28:0x011d, B:28:0x011d, B:30:0x0121, B:30:0x0121, B:32:0x012f, B:32:0x012f, B:34:0x0135, B:34:0x0135, B:36:0x0141, B:36:0x0141, B:38:0x0145, B:38:0x0145, B:41:0x014d, B:41:0x014d, B:43:0x0155, B:43:0x0155, B:45:0x0159, B:45:0x0159, B:48:0x0161, B:48:0x0161, B:50:0x0173, B:50:0x0173, B:52:0x0185, B:52:0x0185, B:54:0x0197, B:54:0x0197, B:56:0x01ab, B:56:0x01ab, B:61:0x0222, B:61:0x0222, B:62:0x0227, B:62:0x0227, B:57:0x01d4, B:57:0x01d4, B:59:0x01f8, B:59:0x01f8, B:60:0x01fa, B:60:0x01fa, B:63:0x022b, B:63:0x022b, B:65:0x022f, B:65:0x022f, B:67:0x0235, B:67:0x0235, B:99:0x0320, B:99:0x0320, B:102:0x0325, B:102:0x0325, B:104:0x032d, B:104:0x032d, B:68:0x023b, B:68:0x023b, B:70:0x023f, B:70:0x023f, B:73:0x0247, B:73:0x0247, B:75:0x024f, B:75:0x024f, B:77:0x0253, B:77:0x0253, B:80:0x025b, B:80:0x025b, B:82:0x026d, B:82:0x026d, B:84:0x027f, B:84:0x027f, B:86:0x0291, B:86:0x0291, B:88:0x02a3, B:88:0x02a3, B:90:0x02b7, B:90:0x02b7, B:92:0x030e, B:92:0x030e, B:93:0x0310, B:93:0x0310, B:91:0x02e3, B:91:0x02e3, B:94:0x0314, B:94:0x0314, B:96:0x0318, B:96:0x0318, B:33:0x0132, B:33:0x0132, B:25:0x0109, B:25:0x0109, B:18:0x00db, B:18:0x00db, B:21:0x00e7, B:21:0x00e7), top: B:108:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023b A[Catch: NullPointerException | Exception -> 0x0378, NullPointerException | Exception -> 0x0378, TryCatch #0 {NullPointerException | Exception -> 0x0378, blocks: (B:3:0x0007, B:5:0x000c, B:9:0x0093, B:9:0x0093, B:10:0x00a4, B:10:0x00a4, B:13:0x00b7, B:13:0x00b7, B:16:0x00c3, B:16:0x00c3, B:17:0x00d3, B:17:0x00d3, B:22:0x00f6, B:22:0x00f6, B:26:0x010d, B:26:0x010d, B:28:0x011d, B:28:0x011d, B:30:0x0121, B:30:0x0121, B:32:0x012f, B:32:0x012f, B:34:0x0135, B:34:0x0135, B:36:0x0141, B:36:0x0141, B:38:0x0145, B:38:0x0145, B:41:0x014d, B:41:0x014d, B:43:0x0155, B:43:0x0155, B:45:0x0159, B:45:0x0159, B:48:0x0161, B:48:0x0161, B:50:0x0173, B:50:0x0173, B:52:0x0185, B:52:0x0185, B:54:0x0197, B:54:0x0197, B:56:0x01ab, B:56:0x01ab, B:61:0x0222, B:61:0x0222, B:62:0x0227, B:62:0x0227, B:57:0x01d4, B:57:0x01d4, B:59:0x01f8, B:59:0x01f8, B:60:0x01fa, B:60:0x01fa, B:63:0x022b, B:63:0x022b, B:65:0x022f, B:65:0x022f, B:67:0x0235, B:67:0x0235, B:99:0x0320, B:99:0x0320, B:102:0x0325, B:102:0x0325, B:104:0x032d, B:104:0x032d, B:68:0x023b, B:68:0x023b, B:70:0x023f, B:70:0x023f, B:73:0x0247, B:73:0x0247, B:75:0x024f, B:75:0x024f, B:77:0x0253, B:77:0x0253, B:80:0x025b, B:80:0x025b, B:82:0x026d, B:82:0x026d, B:84:0x027f, B:84:0x027f, B:86:0x0291, B:86:0x0291, B:88:0x02a3, B:88:0x02a3, B:90:0x02b7, B:90:0x02b7, B:92:0x030e, B:92:0x030e, B:93:0x0310, B:93:0x0310, B:91:0x02e3, B:91:0x02e3, B:94:0x0314, B:94:0x0314, B:96:0x0318, B:96:0x0318, B:33:0x0132, B:33:0x0132, B:25:0x0109, B:25:0x0109, B:18:0x00db, B:18:0x00db, B:21:0x00e7, B:21:0x00e7), top: B:108:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I0() {
        /*
            Method dump skipped, instruction units count: 889
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlow.I0():boolean");
    }

    public final void J0() {
        ProgressBar progressBar;
        if (c.h.a.i.q.m.f(this.f27049e).equals("m3u")) {
            if (this.v == null || this.D == 0) {
                ProgressBar progressBar2 = this.pbLoader;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                    this.rl_no_arrangement_found.setVisibility(0);
                    return;
                }
                return;
            }
            this.p = new VodAdapterNewFlow(this.G, this.f27049e);
            this.myRecyclerView.setItemAnimator(new a.y.e.c());
            this.myRecyclerView.setAdapter(this.p);
            progressBar = this.pbLoader;
            if (progressBar == null) {
                return;
            }
        } else {
            if (this.v == null) {
                return;
            }
            this.p = new VodAdapterNewFlow(this.G, this.f27049e);
            this.myRecyclerView.setItemAnimator(new a.y.e.c());
            this.myRecyclerView.setAdapter(this.p);
            progressBar = this.pbLoader;
            if (progressBar == null) {
                return;
            }
        }
        progressBar.setVisibility(8);
    }

    public final void K0(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(R.layout.sort_layout, (RelativeLayout) activity.findViewById(R.id.rl_password_prompt));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.y = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.y.setWidth(-1);
            this.y.setHeight(-1);
            this.y.setFocusable(true);
            this.y.showAtLocation(viewInflate, 17, 0, 0);
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
            radioButton.setOnFocusChangeListener(new m(radioButton));
            radioButton2.setOnFocusChangeListener(new m(radioButton2));
            radioButton3.setOnFocusChangeListener(new m(radioButton3));
            radioButton4.setOnFocusChangeListener(new m(radioButton4));
            radioButton5.setOnFocusChangeListener(new m(radioButton5));
            radioButton6.setOnFocusChangeListener(new m(radioButton6));
            String strF = c.h.a.i.q.m.F(activity);
            if (strF.equals("1")) {
                radioButton3.setChecked(true);
            } else if (strF.equals("2")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new b());
            button.setOnClickListener(new c(radioGroup, viewInflate, activity));
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
        VodAdapterNewFlow vodAdapterNewFlow = this.p;
        if (vodAdapterNewFlow != null && (progressBar = f27048d) != null) {
            vodAdapterNewFlow.s0(progressBar);
        }
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_bt_up) {
            this.C = new n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
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
        H0();
        setContentView(R.layout.activity_vod_new_flow);
        ButterKnife.a(this);
        this.f27049e = this;
        AppBarLayout appBarLayout = this.appbarToolbar;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(R.drawable.black_background));
        }
        c.h.a.h.n.a.T = Boolean.FALSE;
        E0();
        v0((Toolbar) findViewById(R.id.toolbar));
        getWindow().setFlags(1024, 1024);
        Handler handler = new Handler();
        this.z = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.f27057m = new ArrayList<>();
        this.f27058n = new ArrayList<>();
        this.f27055k = new c.h.a.i.q.f(this.f27049e);
        this.myRecyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        this.f27051g = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setVisibility(0);
        this.C = new n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.home.setOnClickListener(new d());
        this.frameLayout.setVisibility(8);
        this.logo.setOnClickListener(new e());
        this.iv_back_button.setOnClickListener(new f());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.x(R.menu.menu_search);
        this.B = menu;
        this.A = menu.getItem(2).getSubMenu().findItem(R.id.empty);
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
        AsyncTask asyncTask = this.C;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        this.C.cancel(true);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 82) {
            return super.onKeyUp(i2, keyEvent);
        }
        Menu menu = this.B;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(R.id.empty, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.A = menuItem;
        this.toolbar.e();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_home) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == R.id.nav_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == R.id.action_logout1 && (context = this.f27049e) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new h()).g(getResources().getString(R.string.no), new g()).n();
        }
        if (itemId == R.id.menu_load_channels_vod1) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f27049e.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f27049e.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f27049e.getResources().getString(R.string.yes), new i());
            aVar.g(this.f27049e.getResources().getString(R.string.no), new j());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide1) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.f27049e.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.f27049e.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.f27049e.getResources().getString(R.string.yes), new k());
            aVar2.g(this.f27049e.getResources().getString(R.string.no), new l());
            aVar2.n();
        }
        if (itemId == R.id.action_search) {
            SearchView searchView = (SearchView) a.i.r.j.b(menuItem);
            this.q = searchView;
            searchView.setQueryHint(getResources().getString(R.string.search_vod_category));
            this.q.setIconifiedByDefault(false);
            this.q.setOnQueryTextListener(new a());
        }
        if (itemId == R.id.menu_sort) {
            K0(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        H0();
        super.onResume();
        c.h.a.h.n.e.g(this.f27049e);
        getWindow().setFlags(1024, 1024);
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        VodAdapterNewFlow vodAdapterNewFlow = this.p;
        if (vodAdapterNewFlow != null) {
            vodAdapterNewFlow.s0(f27048d);
            this.p.w();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f27050f = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f27050f.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        H0();
    }
}
