package com.nst.iptvsmarterstvbox.view.activity;

import a.b.k.b;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.h.a.h.n.e;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class PlayerSelectionActivity extends a.b.k.c implements View.OnClickListener {

    @BindView
    public AppBarLayout appbarToolbar;

    @BindView
    public Button btnBackPlayerselection;

    @BindView
    public Button btn_reset_player_selection;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f26042d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f26043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.h.a.i.q.f f26044f;

    @BindView
    public ImageView iv_add_player;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.d f26049k;

    @BindView
    public LinearLayout ll_catchup_player;

    @BindView
    public LinearLayout ll_series_player;

    @BindView
    public ImageView logo;

    @BindView
    public RelativeLayout rlSettings;

    @BindView
    public TextView separator;

    @BindView
    public TextView separatorSecond;

    @BindView
    public Spinner spCatchup;

    @BindView
    public Spinner spEpg;

    @BindView
    public Spinner spLive;

    @BindView
    public Spinner spRecordings;

    @BindView
    public Spinner spSeries;

    @BindView
    public Spinner spVod;

    @BindView
    public TextView textView;

    @BindView
    public TextView textViewSecond;

    @BindView
    public TextView time;

    @BindView
    public Toolbar toolbar;
    public c.h.a.k.d.a.a v;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.h.a.i.q.b f26045g = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.h.a.i.q.b f26046h = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f26047i = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26048j = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList<ExternalPlayerModelClass> f26050l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<ExternalPlayerModelClass> f26051m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<ExternalPlayerModelClass> f26052n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<ExternalPlayerModelClass> f26053o = new ArrayList<>();
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public int u = 0;
    public Thread w = null;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PopupWindow f26054b;

        public a(PopupWindow popupWindow) {
            this.f26054b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerSelectionActivity.this.X0();
            PopupWindow popupWindow = this.f26054b;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f26054b.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.O(PlayerSelectionActivity.this.f26042d);
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(PlayerSelectionActivity.this.f26042d);
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
            c.h.a.h.n.e.b(PlayerSelectionActivity.this.f26042d);
        }
    }

    public class i implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f26063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f26064c;

        public i(LinkedHashMap linkedHashMap, List list) {
            this.f26063b = linkedHashMap;
            this.f26064c = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        @SuppressLint({"NewApi"})
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            new c.h.a.i.q.m();
            if (PlayerSelectionActivity.this.u == i2) {
                String strH = c.h.a.i.q.m.h(PlayerSelectionActivity.this.f26042d);
                String strG = c.h.a.i.q.m.g(PlayerSelectionActivity.this.f26042d);
                if (strH == null || strH.isEmpty() || strH.equals(BuildConfig.FLAVOR)) {
                    return;
                }
                PlayerSelectionActivity.this.spEpg.setSelection(PlayerSelectionActivity.this.R0(this.f26064c, strH, strG, this.f26063b));
                return;
            }
            PlayerSelectionActivity.this.u = i2;
            PlayerSelectionActivity.this.spEpg.setSelection(i2);
            if (this.f26063b.containsKey(this.f26064c.get(i2))) {
                String str = (String) this.f26063b.get(this.f26064c.get(i2));
                String str2 = (String) PlayerSelectionActivity.S0(this.f26063b, str);
                if (str == null || str.isEmpty() || str.equals(BuildConfig.FLAVOR) || PlayerSelectionActivity.this.f26042d == null || str2 == null || str2.isEmpty() || str2.equals(BuildConfig.FLAVOR)) {
                    return;
                }
                c.h.a.i.q.m.O(str, str2, PlayerSelectionActivity.this.f26042d);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f26066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f26067c;

        public j(LinkedHashMap linkedHashMap, List list) {
            this.f26066b = linkedHashMap;
            this.f26067c = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            new c.h.a.i.q.m();
            if (PlayerSelectionActivity.this.t == i2) {
                String strR = c.h.a.i.q.m.r(PlayerSelectionActivity.this.f26042d);
                String strQ = c.h.a.i.q.m.q(PlayerSelectionActivity.this.f26042d);
                if (strR == null || strR.isEmpty() || strR.equals(BuildConfig.FLAVOR)) {
                    return;
                }
                PlayerSelectionActivity.this.spRecordings.setSelection(PlayerSelectionActivity.this.R0(this.f26067c, strR, strQ, this.f26066b));
                return;
            }
            PlayerSelectionActivity.this.t = i2;
            PlayerSelectionActivity.this.spRecordings.setSelection(i2);
            if (this.f26066b.containsKey(this.f26067c.get(i2))) {
                String str = (String) this.f26066b.get(this.f26067c.get(i2));
                String str2 = (String) PlayerSelectionActivity.S0(this.f26066b, str);
                if (str == null || str.isEmpty() || str.equals(BuildConfig.FLAVOR) || PlayerSelectionActivity.this.f26042d == null || str2 == null || str2.isEmpty() || str2.equals(BuildConfig.FLAVOR)) {
                    return;
                }
                c.h.a.i.q.m.X(str, str2, PlayerSelectionActivity.this.f26042d);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class k implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f26069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f26070c;

        public k(LinkedHashMap linkedHashMap, List list) {
            this.f26069b = linkedHashMap;
            this.f26070c = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        @TargetApi(19)
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            new c.h.a.i.q.m();
            if (PlayerSelectionActivity.this.s == i2) {
                String strE = c.h.a.i.q.m.e(PlayerSelectionActivity.this.f26042d);
                String strD = c.h.a.i.q.m.d(PlayerSelectionActivity.this.f26042d);
                if (strE == null || strE.isEmpty() || strE.equals(BuildConfig.FLAVOR)) {
                    return;
                }
                PlayerSelectionActivity.this.spCatchup.setSelection(PlayerSelectionActivity.this.R0(this.f26070c, strE, strD, this.f26069b));
                return;
            }
            PlayerSelectionActivity.this.s = i2;
            PlayerSelectionActivity.this.spCatchup.setSelection(i2);
            if (this.f26069b.containsKey(this.f26070c.get(i2))) {
                String str = (String) this.f26069b.get(this.f26070c.get(i2));
                String str2 = (String) PlayerSelectionActivity.S0(this.f26069b, str);
                if (str == null || str.isEmpty() || str.equals(BuildConfig.FLAVOR) || PlayerSelectionActivity.this.f26042d == null || str2 == null || str2.isEmpty() || str2.equals(BuildConfig.FLAVOR)) {
                    return;
                }
                c.h.a.i.q.m.M(str, str2, PlayerSelectionActivity.this.f26042d);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class l implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f26072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f26073c;

        public l(LinkedHashMap linkedHashMap, List list) {
            this.f26072b = linkedHashMap;
            this.f26073c = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            new c.h.a.i.q.m();
            if (PlayerSelectionActivity.this.r == i2) {
                String strV = c.h.a.i.q.m.v(PlayerSelectionActivity.this.f26042d);
                String strU = c.h.a.i.q.m.u(PlayerSelectionActivity.this.f26042d);
                if (strV == null || strV.isEmpty() || strV.equals(BuildConfig.FLAVOR)) {
                    return;
                }
                PlayerSelectionActivity.this.spSeries.setSelection(PlayerSelectionActivity.this.R0(this.f26073c, strV, strU, this.f26072b));
                return;
            }
            PlayerSelectionActivity.this.r = i2;
            PlayerSelectionActivity.this.spSeries.setSelection(i2);
            if (this.f26072b.containsKey(this.f26073c.get(i2))) {
                String str = (String) this.f26072b.get(this.f26073c.get(i2));
                String str2 = (String) PlayerSelectionActivity.S0(this.f26072b, str);
                if (str == null || str.isEmpty() || str.equals(BuildConfig.FLAVOR) || PlayerSelectionActivity.this.f26042d == null || str2 == null || str2.isEmpty() || str2.equals(BuildConfig.FLAVOR)) {
                    return;
                }
                c.h.a.i.q.m.a0(str, str2, PlayerSelectionActivity.this.f26042d);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class m implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f26075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f26076c;

        public m(LinkedHashMap linkedHashMap, List list) {
            this.f26075b = linkedHashMap;
            this.f26076c = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            new c.h.a.i.q.m();
            if (PlayerSelectionActivity.this.q == i2) {
                String strD = c.h.a.i.q.m.D(PlayerSelectionActivity.this.f26042d);
                String strC = c.h.a.i.q.m.C(PlayerSelectionActivity.this.f26042d);
                if (strD == null || strD.isEmpty() || strD.equals(BuildConfig.FLAVOR)) {
                    return;
                }
                PlayerSelectionActivity.this.spVod.setSelection(PlayerSelectionActivity.this.R0(this.f26076c, strD, strC, this.f26075b));
                return;
            }
            PlayerSelectionActivity.this.q = i2;
            PlayerSelectionActivity.this.spVod.setSelection(i2);
            if (this.f26075b.containsKey(this.f26076c.get(i2))) {
                String str = (String) this.f26075b.get(this.f26076c.get(i2));
                String str2 = (String) PlayerSelectionActivity.S0(this.f26075b, str);
                if (str == null || str.isEmpty() || str.equals(BuildConfig.FLAVOR) || PlayerSelectionActivity.this.f26042d == null || str2 == null || str2.isEmpty() || str2.equals(BuildConfig.FLAVOR)) {
                    return;
                }
                c.h.a.i.q.m.i0(str, str2, PlayerSelectionActivity.this.f26042d);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class n implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f26078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f26079c;

        public n(LinkedHashMap linkedHashMap, List list) {
            this.f26078b = linkedHashMap;
            this.f26079c = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            new c.h.a.i.q.m();
            if (PlayerSelectionActivity.this.p == i2) {
                String strL = c.h.a.i.q.m.l(PlayerSelectionActivity.this.f26042d);
                String strK = c.h.a.i.q.m.k(PlayerSelectionActivity.this.f26042d);
                if (strL == null || strL.isEmpty() || strL.equals(BuildConfig.FLAVOR)) {
                    return;
                }
                PlayerSelectionActivity.this.spLive.setSelection(PlayerSelectionActivity.this.R0(this.f26079c, strL, strK, this.f26078b));
                return;
            }
            PlayerSelectionActivity.this.p = i2;
            PlayerSelectionActivity.this.spLive.setSelection(i2);
            if (this.f26078b.containsKey(this.f26079c.get(i2))) {
                String str = (String) this.f26078b.get(this.f26079c.get(i2));
                String str2 = (String) PlayerSelectionActivity.S0(this.f26078b, str);
                if (str == null || str.isEmpty() || str.equals(BuildConfig.FLAVOR) || PlayerSelectionActivity.this.f26042d == null || str2 == null || str2.isEmpty() || str2.equals(BuildConfig.FLAVOR)) {
                    return;
                }
                c.h.a.i.q.m.S(str, str2, PlayerSelectionActivity.this.f26042d);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(PlayerSelectionActivity.this.f26042d);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = PlayerSelectionActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = PlayerSelectionActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class p implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PopupWindow f26082b;

        public p(PopupWindow popupWindow) {
            this.f26082b = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PopupWindow popupWindow = this.f26082b;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f26082b.dismiss();
        }
    }

    public class q implements Runnable {
        public q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    PlayerSelectionActivity.this.P0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class r implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26085b;

        public r(View view) {
            this.f26085b = view;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26085b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26085b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            View view2;
            int i2;
            if (!z) {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                a(f2);
                b(f2);
                if (this.f26085b.getTag().equals("1") || this.f26085b.getTag().equals("2")) {
                    this.f26085b.setBackgroundResource(R.drawable.black_button_dark);
                    return;
                }
                return;
            }
            f2 = z ? 1.05f : 1.0f;
            Log.e("id is", BuildConfig.FLAVOR + this.f26085b.getTag());
            if (this.f26085b.getTag().equals("1")) {
                a(f2);
                b(f2);
                view2 = this.f26085b;
                i2 = R.drawable.back_btn_effect;
            } else if (!this.f26085b.getTag().equals("2")) {
                a(1.12f);
                b(1.12f);
                return;
            } else {
                a(f2);
                b(f2);
                view2 = this.f26085b;
                i2 = R.drawable.logout_btn_effect;
            }
            view2.setBackgroundResource(i2);
        }
    }

    @SuppressLint({"NewApi"})
    public static <T, E> T S0(Map<T, E> map, E e2) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (a.i.q.c.a(e2, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public final void N0() {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        for (ExternalPlayerModelClass externalPlayerModelClass : this.f26052n) {
            arrayList.add(externalPlayerModelClass.a());
            linkedHashMap.put(externalPlayerModelClass.a(), externalPlayerModelClass.b());
        }
        b1(this.f26052n, linkedHashMap, arrayList);
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>();
        for (ExternalPlayerModelClass externalPlayerModelClass2 : this.f26050l) {
            arrayList2.add(externalPlayerModelClass2.a());
            linkedHashMap2.put(externalPlayerModelClass2.a(), externalPlayerModelClass2.b());
        }
        h1(this.f26050l, linkedHashMap2, arrayList2);
        g1(this.f26050l, linkedHashMap2, arrayList2);
        V0(this.f26050l, linkedHashMap2, arrayList2);
        e1(this.f26050l, linkedHashMap2, arrayList2);
        a1(this.f26050l, linkedHashMap2, arrayList2);
    }

    public final void O0() {
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

    public void P0() {
        runOnUiThread(new o());
    }

    public final void Q0() {
        Button button = this.btnBackPlayerselection;
        if (button != null) {
            button.setOnFocusChangeListener(new r(button));
        }
        Button button2 = this.btn_reset_player_selection;
        button2.setOnFocusChangeListener(new r(button2));
        this.btn_reset_player_selection.requestFocus();
        this.btn_reset_player_selection.requestFocusFromTouch();
    }

    public final int R0(List<String> list, String str, String str2, LinkedHashMap<String, String> linkedHashMap) {
        Iterator<Map.Entry<String, String>> it = linkedHashMap.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().getValue().toString().equals(str)) {
                return i2;
            }
            i2++;
        }
        return 0;
    }

    public final void T0() {
        ArrayList<ExternalPlayerModelClass> arrayList = this.f26050l;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<ExternalPlayerModelClass> arrayList2 = this.f26052n;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f26042d = this;
        this.f26044f = new c.h.a.i.q.f(this.f26042d);
        if (this.f26042d != null) {
            this.f26049k = new c.h.a.i.q.d(this.f26042d);
            ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
            externalPlayerModelClass.c(BuildConfig.FLAVOR);
            externalPlayerModelClass.d("Built-in Player (Hardware/Software Decoder)");
            externalPlayerModelClass.f("default");
            this.f26050l.add(externalPlayerModelClass);
            ArrayList<ExternalPlayerModelClass> arrayListL = this.f26049k.l();
            this.f26051m = arrayListL;
            this.f26050l.addAll(1, arrayListL);
        }
        if (this.f26042d != null) {
            this.f26049k = new c.h.a.i.q.d(this.f26042d);
            ExternalPlayerModelClass externalPlayerModelClass2 = new ExternalPlayerModelClass();
            externalPlayerModelClass2.c(BuildConfig.FLAVOR);
            externalPlayerModelClass2.d("Built-in Player (Native)");
            externalPlayerModelClass2.f("default_native");
            this.f26052n.add(externalPlayerModelClass2);
            this.f26049k = new c.h.a.i.q.d(this.f26042d);
            ExternalPlayerModelClass externalPlayerModelClass3 = new ExternalPlayerModelClass();
            externalPlayerModelClass3.c(BuildConfig.FLAVOR);
            externalPlayerModelClass3.d("Built-in Player (Hardware/Software Decoder)");
            externalPlayerModelClass3.f("default");
            this.f26052n.add(externalPlayerModelClass3);
            ArrayList<ExternalPlayerModelClass> arrayListL2 = this.f26049k.l();
            this.f26053o = arrayListL2;
            this.f26052n.addAll(2, arrayListL2);
        }
        SharedPreferences sharedPreferences = getSharedPreferences("selectedPlayer", 0);
        this.f26043e = sharedPreferences;
        sharedPreferences.getString("selectedPlayer", BuildConfig.FLAVOR);
    }

    public final void U0() {
        new c.h.a.i.q.m();
        c.h.a.i.q.m.M("default", "Default Player", this.f26042d);
        this.spCatchup.setSelection(0);
    }

    public final void V0(ArrayList<ExternalPlayerModelClass> arrayList, LinkedHashMap<String, String> linkedHashMap, List<String> list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spCatchup.setAdapter((SpinnerAdapter) arrayAdapter);
        this.spCatchup.setOnItemSelectedListener(new k(linkedHashMap, list));
    }

    public final void W0() {
        new c.h.a.i.q.m();
        c.h.a.i.q.m.S("default", "Default Player", this.f26042d);
        this.spLive.setSelection(0);
    }

    public final void X0() {
        W0();
        Y0();
        f1();
        U0();
        d1();
        Z0();
    }

    public final void Y0() {
        new c.h.a.i.q.m();
        c.h.a.i.q.m.i0("default", "Default Player", this.f26042d);
        this.spVod.setSelection(0);
    }

    public final void Z0() {
        new c.h.a.i.q.m();
        c.h.a.i.q.m.O("default", "Default Player", this.f26042d);
        this.spEpg.setSelection(0);
    }

    public final void a1(ArrayList<ExternalPlayerModelClass> arrayList, LinkedHashMap<String, String> linkedHashMap, List<String> list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spEpg.setAdapter((SpinnerAdapter) arrayAdapter);
        this.spEpg.setOnItemSelectedListener(new i(linkedHashMap, list));
    }

    public final void b1(ArrayList<ExternalPlayerModelClass> arrayList, LinkedHashMap<String, String> linkedHashMap, List<String> list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spLive.setAdapter((SpinnerAdapter) arrayAdapter);
        this.spLive.setOnItemSelectedListener(new n(linkedHashMap, list));
    }

    public final void d1() {
        new c.h.a.i.q.m();
        c.h.a.i.q.m.X("default", "Default Player", this.f26042d);
        this.spRecordings.setSelection(0);
    }

    public final void e1(ArrayList<ExternalPlayerModelClass> arrayList, LinkedHashMap<String, String> linkedHashMap, List<String> list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spRecordings.setAdapter((SpinnerAdapter) arrayAdapter);
        this.spRecordings.setOnItemSelectedListener(new j(linkedHashMap, list));
    }

    public final void f1() {
        new c.h.a.i.q.m();
        c.h.a.i.q.m.a0("default", "Default Player", this.f26042d);
        this.spSeries.setSelection(0);
    }

    public final void g1(ArrayList<ExternalPlayerModelClass> arrayList, LinkedHashMap<String, String> linkedHashMap, List<String> list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spSeries.setAdapter((SpinnerAdapter) arrayAdapter);
        this.spSeries.setOnItemSelectedListener(new l(linkedHashMap, list));
    }

    public final void h1(ArrayList<ExternalPlayerModelClass> arrayList, LinkedHashMap<String, String> linkedHashMap, List<String> list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spVod.setAdapter((SpinnerAdapter) arrayAdapter);
        this.spVod.setOnItemSelectedListener(new m(linkedHashMap, list));
    }

    @SuppressLint({"RtlHardcoded"})
    public final void i1() {
        try {
            View viewInflate = ((LayoutInflater) this.f26042d.getSystemService("layout_inflater")).inflate(R.layout.playera_add_alert_box, (RelativeLayout) findViewById(R.id.rl_outer));
            PopupWindow popupWindow = new PopupWindow(this.f26042d);
            popupWindow.setContentView(viewInflate);
            popupWindow.setWidth(-1);
            popupWindow.setHeight(-1);
            popupWindow.setFocusable(true);
            popupWindow.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(R.id.btn_no);
            Button button2 = (Button) viewInflate.findViewById(R.id.btn_yes);
            button2.setText(getResources().getString(R.string.yes_all_caps));
            ((TextView) viewInflate.findViewById(R.id.tv_description)).setText(getResources().getString(R.string.are_you_sure_you_want_reset_player));
            button.setOnFocusChangeListener(new e.j(button, this));
            button2.setOnFocusChangeListener(new e.j(button2, this));
            button.setOnClickListener(new p(popupWindow));
            button2.setOnClickListener(new a(popupWindow));
        } catch (NullPointerException | Exception unused) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
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
        int i2;
        LinearLayout linearLayout;
        this.f26042d = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f26042d);
        this.v = aVar;
        setContentView(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_player_selection_tv : R.layout.activity_player_selection);
        ButterKnife.a(this);
        Q0();
        O0();
        v0((Toolbar) findViewById(R.id.toolbar));
        getWindow().setFlags(1024, 1024);
        Thread thread = this.w;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new q());
            this.w = thread2;
            thread2.start();
        }
        if (c.h.a.i.q.m.f(this.f26042d).equals("m3u")) {
            linearLayout = this.ll_catchup_player;
            i2 = 8;
        } else {
            i2 = 0;
            this.ll_catchup_player.setVisibility(0);
            linearLayout = this.ll_series_player;
        }
        linearLayout.setVisibility(i2);
        this.logo.setOnClickListener(new h());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.toolbar.x(R.menu.menu_text_icon);
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
        if (itemId == R.id.action_logout && (context = this.f26042d) != null) {
            new b.a(context, R.style.AlertDialogCustom).setTitle(getResources().getString(R.string.logout_title)).f(getResources().getString(R.string.logout_message)).j(getResources().getString(R.string.yes), new c()).g(getResources().getString(R.string.no), new b()).n();
        }
        if (itemId == R.id.menu_load_channels_vod) {
            b.a aVar = new b.a(this);
            aVar.setTitle(this.f26042d.getResources().getString(R.string.confirm_to_refresh));
            aVar.f(this.f26042d.getResources().getString(R.string.do_you_want_toproceed));
            aVar.d(R.drawable.questionmark);
            aVar.j(this.f26042d.getResources().getString(R.string.yes), new d());
            aVar.g(this.f26042d.getResources().getString(R.string.no), new e());
            aVar.n();
        }
        if (itemId == R.id.menu_load_tv_guide) {
            b.a aVar2 = new b.a(this);
            aVar2.setTitle(this.f26042d.getResources().getString(R.string.confirm_to_refresh));
            aVar2.f(this.f26042d.getResources().getString(R.string.do_you_want_toproceed));
            aVar2.d(R.drawable.questionmark);
            aVar2.j(this.f26042d.getResources().getString(R.string.yes), new f());
            aVar2.g(this.f26042d.getResources().getString(R.string.no), new g());
            aVar2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.w;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.w.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.w;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new q());
            this.w = thread2;
            thread2.start();
        }
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
        T0();
        N0();
        c.h.a.h.n.e.g(this.f26042d);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f26043e = sharedPreferences;
        if (sharedPreferences.getString("username", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR) && this.f26043e.getString("password", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    @Override // a.b.k.c, a.l.d.e, android.app.Activity
    public void onStop() {
        super.onStop();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
    }

    @OnClick
    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.btn_back_playerselection /* 2131427633 */:
                onBackPressed();
                break;
            case R.id.btn_reset_player_selection /* 2131427665 */:
            case R.id.iv_reset_player /* 2131428190 */:
            case R.id.ll_reset_player /* 2131428454 */:
            case R.id.tv_reset_player /* 2131429524 */:
                i1();
                break;
            case R.id.iv_add_player /* 2131428101 */:
            case R.id.ll_add_player /* 2131428284 */:
            case R.id.tv_add_player /* 2131429284 */:
                startActivity(new Intent(this, (Class<?>) ExternalPlayerActivity.class));
                break;
        }
    }
}
