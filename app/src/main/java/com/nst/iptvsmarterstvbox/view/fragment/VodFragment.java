package com.nst.iptvsmarterstvbox.view.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
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
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.i.n;
import c.h.a.i.q.k;
import c.h.a.i.q.m;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.model.callback.VodStreamsCallback;
import com.nst.iptvsmarterstvbox.view.adapter.SubCategoriesChildAdapter;
import com.nst.iptvsmarterstvbox.view.adapter.VodAdapter;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class VodFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ArrayList<c.h.a.i.e> f29140b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ArrayList<c.h.a.i.e> f29141c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList<c.h.a.i.e> f29142d = new ArrayList<>();
    public PopupWindow A;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecyclerView.p f29143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SharedPreferences f29144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public VodAdapter f29145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Toolbar f29146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SearchView f29147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.i.q.a f29148j;

    @BindView
    public RecyclerView myRecyclerView;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.h.a.i.q.f f29152n;

    @BindView
    public ProgressBar pbLoader;
    public Context q;
    public Unbinder r;
    public SharedPreferences s;
    public SharedPreferences.Editor t;

    @BindView
    public TextView tvNoRecordFound;

    @BindView
    public TextView tvNoStream;

    @BindView
    public TextView tvViewProvider;
    public String u;
    public String v;
    public c.h.a.h.a x;
    public SharedPreferences y;
    public SharedPreferences.Editor z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<VodStreamsCallback> f29149k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n f29150l = new n();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<c.h.a.i.f> f29151m = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c.h.a.i.q.b f29153o = new c.h.a.i.q.b();
    public c.h.a.i.q.b p = new c.h.a.i.q.b();
    public boolean w = false;

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
            c.h.a.h.n.e.O(VodFragment.this.q);
        }
    }

    public class c implements SearchView.l {
        public c() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            TextView textView;
            VodFragment.this.tvNoRecordFound.setVisibility(8);
            if (VodFragment.this.f29145g == null || (textView = VodFragment.this.tvNoStream) == null || textView.getVisibility() == 0) {
                return false;
            }
            VodFragment.this.f29145g.t0(str, VodFragment.this.tvNoRecordFound);
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
            c.h.a.h.n.e.N(VodFragment.this.q);
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
            VodFragment.this.A.dismiss();
        }
    }

    public class i implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f29162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f29163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f29164d;

        public i(RadioGroup radioGroup, View view, Activity activity) {
            this.f29162b = radioGroup;
            this.f29163c = view;
            this.f29164d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharedPreferences.Editor editor;
            String str;
            RadioButton radioButton = (RadioButton) this.f29163c.findViewById(this.f29162b.getCheckedRadioButtonId());
            if (radioButton.getText().toString().equals(VodFragment.this.getResources().getString(R.string.sort_last_added))) {
                editor = VodFragment.this.z;
                str = "1";
            } else if (radioButton.getText().toString().equals(VodFragment.this.getResources().getString(R.string.sort_atoz))) {
                editor = VodFragment.this.z;
                str = "2";
            } else if (radioButton.getText().toString().equals(VodFragment.this.getResources().getString(R.string.sort_ztoa))) {
                editor = VodFragment.this.z;
                str = "3";
            } else {
                editor = VodFragment.this.z;
                str = "0";
            }
            editor.putString("sort", str);
            VodFragment.this.z.commit();
            VodFragment.this.s = this.f29164d.getSharedPreferences("listgridview", 0);
            VodFragment vodFragment = VodFragment.this;
            vodFragment.t = vodFragment.s.edit();
            int i2 = VodFragment.this.s.getInt("vod", 0);
            c.h.a.h.n.a.v = i2;
            if (i2 == 1) {
                VodFragment.this.E();
            } else {
                VodFragment.this.C();
            }
            VodFragment.this.A.dismiss();
        }
    }

    public final void B() {
        RecyclerView recyclerView;
        a.y.e.c cVar;
        a();
        a.i.h.a.n(getActivity());
        setHasOptionsMenu(true);
        J();
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("listgridview", 0);
        this.s = sharedPreferences;
        this.t = sharedPreferences.edit();
        int i2 = this.s.getInt("vod", 0);
        c.h.a.h.n.a.v = i2;
        if (i2 == 1) {
            Context context = getContext();
            this.q = context;
            RecyclerView recyclerView2 = this.myRecyclerView;
            if (recyclerView2 != null && context != null) {
                recyclerView2.setHasFixedSize(true);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
                this.f29143e = linearLayoutManager;
                this.myRecyclerView.setLayoutManager(linearLayoutManager);
                recyclerView = this.myRecyclerView;
                cVar = new a.y.e.c();
                recyclerView.setItemAnimator(cVar);
            }
        } else {
            Context context2 = getContext();
            this.q = context2;
            RecyclerView recyclerView3 = this.myRecyclerView;
            if (recyclerView3 != null && context2 != null) {
                recyclerView3.setHasFixedSize(true);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), c.h.a.h.n.e.y(this.q) + 1);
                this.f29143e = gridLayoutManager;
                this.myRecyclerView.setLayoutManager(gridLayoutManager);
                recyclerView = this.myRecyclerView;
                cVar = new a.y.e.c();
                recyclerView.setItemAnimator(cVar);
            }
        }
        if (this.q != null) {
            ArrayList<c.h.a.i.f> arrayListQ = new k(this.q).q("movie", m.z(this.q), "getalldata");
            b();
            if (arrayListQ != null && this.myRecyclerView != null && arrayListQ.size() != 0) {
                VodAdapter vodAdapter = new VodAdapter(arrayListQ, getContext(), true);
                this.f29145g = vodAdapter;
                this.myRecyclerView.setAdapter(vodAdapter);
            } else {
                TextView textView = this.tvNoStream;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
        }
    }

    public final void C() {
        this.q = getContext();
        this.f29152n = new c.h.a.i.q.f(this.q);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.q == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), c.h.a.h.n.e.y(this.q) + 1);
        this.f29143e = gridLayoutManager;
        this.myRecyclerView.setLayoutManager(gridLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        SharedPreferences sharedPreferences = this.q.getSharedPreferences("loginPrefs", 0);
        this.f29144f = sharedPreferences;
        sharedPreferences.getString("username", BuildConfig.FLAVOR);
        this.f29144f.getString("password", BuildConfig.FLAVOR);
        K();
    }

    public final void E() {
        this.q = getContext();
        this.f29152n = new c.h.a.i.q.f(this.q);
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.q == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f29143e = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setItemAnimator(new a.y.e.c());
        SharedPreferences sharedPreferences = this.q.getSharedPreferences("loginPrefs", 0);
        this.f29144f = sharedPreferences;
        sharedPreferences.getString("username", BuildConfig.FLAVOR);
        this.f29144f.getString("password", BuildConfig.FLAVOR);
        K();
    }

    public final void F(ArrayList<c.h.a.i.e> arrayList) {
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView == null || this.q == null) {
            return;
        }
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.q);
        this.myRecyclerView.setLayoutManager(new LinearLayoutManager(this.q, 0, true));
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        this.myRecyclerView.setHasFixedSize(true);
        ArrayList arrayList2 = new ArrayList();
        ArrayList<c.h.a.i.f> arrayListW0 = this.f29152n.W0(this.u, "movie");
        RecyclerView recyclerView2 = new RecyclerView(this.q);
        SubCategoriesChildAdapter subCategoriesChildAdapter = new SubCategoriesChildAdapter(arrayListW0, this.q);
        recyclerView2.setAdapter(subCategoriesChildAdapter);
        arrayList2.add(new c.h.a.h.b("Bill Gates"));
        ArrayList arrayList3 = new ArrayList();
        for (c.h.a.i.e eVar : arrayList) {
            new ArrayList();
            ArrayList<c.h.a.i.f> arrayListW02 = this.f29152n.W0(eVar.b(), "movie");
            if (arrayListW02 != null && arrayListW02.size() > 0) {
                arrayList3.add(new c.h.a.h.i(recyclerView2, eVar.c(), this.f29152n.W0(eVar.b(), "movie"), subCategoriesChildAdapter, arrayList2));
            }
        }
        new ArrayList();
        ArrayList<c.h.a.i.f> arrayListW03 = this.f29152n.W0(this.u, "movie");
        if (arrayListW03 != null && arrayListW03.size() > 0) {
            arrayList3.add(new c.h.a.h.i(recyclerView2, this.v, this.f29152n.W0(this.u, "movie"), subCategoriesChildAdapter, arrayList2));
        }
        b();
        c.h.a.h.a aVar = new c.h.a.h.a(this.q, arrayList3, arrayListW0, recyclerView2);
        this.x = aVar;
        this.myRecyclerView.setAdapter(aVar);
    }

    public final void G() {
        a.i.h.a.n(getActivity());
        setHasOptionsMenu(true);
        J();
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("listgridview", 0);
        this.s = sharedPreferences;
        this.t = sharedPreferences.edit();
        int i2 = this.s.getInt("vod", 0);
        c.h.a.h.n.a.v = i2;
        if (i2 == 1) {
            E();
        } else {
            C();
        }
    }

    public final void H(ArrayList<c.h.a.i.e> arrayList) {
        a.i.h.a.n(getActivity());
        setHasOptionsMenu(true);
        J();
        F(arrayList);
    }

    public final void J() {
        this.f29146h = (Toolbar) getActivity().findViewById(R.id.toolbar);
    }

    public final void K() {
        if (this.q != null) {
            c.h.a.i.q.f fVar = new c.h.a.i.q.f(this.q);
            if (this.u.equals("-1")) {
                return;
            }
            ArrayList<c.h.a.i.f> arrayListW0 = fVar.W0(this.u, "movie");
            b();
            if (arrayListW0 != null && this.myRecyclerView != null && arrayListW0.size() != 0) {
                VodAdapter vodAdapter = new VodAdapter(arrayListW0, getContext(), true);
                this.f29145g = vodAdapter;
                this.myRecyclerView.setAdapter(vodAdapter);
            } else {
                TextView textView = this.tvNoStream;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
        }
    }

    public final void N(Activity activity) {
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
            RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(R.id.rb_lastadded);
            RadioButton radioButton3 = (RadioButton) viewInflate.findViewById(R.id.rb_atoz);
            RadioButton radioButton4 = (RadioButton) viewInflate.findViewById(R.id.rb_ztoa);
            String string = this.y.getString("sort", BuildConfig.FLAVOR);
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
            button.setOnClickListener(new i(radioGroup, viewInflate, activity));
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void a() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    public void b() {
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.u = getArguments().getString(BuildConfig.FLAVOR);
        this.v = getArguments().getString("cat_name");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.q == null || this.f29146h == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (this.q.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.q.getResources().getDisplayMetrics());
        }
        for (int i2 = 0; i2 < this.f29146h.getChildCount(); i2++) {
            if (this.f29146h.getChildAt(i2) instanceof ActionMenuView) {
                ((Toolbar.e) this.f29146h.getChildAt(i2).getLayoutParams()).f135a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.q = getContext();
        this.f29152n = new c.h.a.i.q.f(this.q);
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("sort", 0);
        this.y = sharedPreferences;
        this.z = sharedPreferences.edit();
        if (this.y.getString("sort", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.z.putString("sort", "0");
            this.z.commit();
        }
        String str = this.u;
        str.hashCode();
        switch (str) {
            case "0":
                View viewInflate = layoutInflater.inflate(R.layout.fragment_vod_streams, viewGroup, false);
                this.r = ButterKnife.b(this, viewInflate);
                a();
                G();
                y();
                return viewInflate;
            case "-1":
                View viewInflate2 = layoutInflater.inflate(R.layout.fragment_vod_streams, viewGroup, false);
                this.r = ButterKnife.b(this, viewInflate2);
                a();
                G();
                z();
                return viewInflate2;
            case "-4":
                View viewInflate3 = layoutInflater.inflate(R.layout.fragment_vod_streams, viewGroup, false);
                this.r = ButterKnife.b(this, viewInflate3);
                a();
                G();
                B();
                return viewInflate3;
            default:
                ArrayList<c.h.a.i.e> arrayListZ0 = this.f29152n.Z0(this.u);
                f29141c = arrayListZ0;
                if (arrayListZ0 == null || arrayListZ0.size() != 0) {
                    View viewInflate4 = layoutInflater.inflate(R.layout.fragment_vod_subcategories, viewGroup, false);
                    this.r = ButterKnife.b(this, viewInflate4);
                    a();
                    H(f29141c);
                    return viewInflate4;
                }
                View viewInflate5 = layoutInflater.inflate(R.layout.fragment_vod_streams, viewGroup, false);
                this.r = ButterKnife.b(this, viewInflate5);
                a();
                G();
                return viewInflate5;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.r.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e7, code lost:
    
        if (r1.size() > 0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0185  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onOptionsItemSelected(android.view.MenuItem r10) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.fragment.VodFragment.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        menu.clear();
        this.f29146h.x(R.menu.menu_search_text_icon);
    }

    public void y() {
        RecyclerView recyclerView;
        a.y.e.c cVar;
        a();
        a.i.h.a.n(getActivity());
        setHasOptionsMenu(true);
        J();
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("listgridview", 0);
        this.s = sharedPreferences;
        this.t = sharedPreferences.edit();
        int i2 = this.s.getInt("vod", 0);
        c.h.a.h.n.a.v = i2;
        if (i2 == 1) {
            this.q = getContext();
            this.f29152n = new c.h.a.i.q.f(this.q);
            RecyclerView recyclerView2 = this.myRecyclerView;
            if (recyclerView2 != null && this.q != null) {
                recyclerView2.setHasFixedSize(true);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
                this.f29143e = linearLayoutManager;
                this.myRecyclerView.setLayoutManager(linearLayoutManager);
                recyclerView = this.myRecyclerView;
                cVar = new a.y.e.c();
                recyclerView.setItemAnimator(cVar);
            }
        } else {
            this.q = getContext();
            this.f29152n = new c.h.a.i.q.f(this.q);
            RecyclerView recyclerView3 = this.myRecyclerView;
            if (recyclerView3 != null && this.q != null) {
                recyclerView3.setHasFixedSize(true);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), c.h.a.h.n.e.y(this.q) + 1);
                this.f29143e = gridLayoutManager;
                this.myRecyclerView.setLayoutManager(gridLayoutManager);
                recyclerView = this.myRecyclerView;
                cVar = new a.y.e.c();
                recyclerView.setItemAnimator(cVar);
            }
        }
        if (this.q != null) {
            ArrayList<c.h.a.i.f> arrayListW0 = new c.h.a.i.q.f(this.q).W0("0", "movie");
            b();
            if (arrayListW0 != null && this.myRecyclerView != null && arrayListW0.size() != 0) {
                VodAdapter vodAdapter = new VodAdapter(arrayListW0, getContext(), true);
                this.f29145g = vodAdapter;
                this.myRecyclerView.setAdapter(vodAdapter);
            } else {
                TextView textView = this.tvNoStream;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
        }
    }

    public void z() {
        ArrayList<c.h.a.i.f> arrayList;
        ArrayList<c.h.a.i.f> arrayList2;
        this.f29151m.clear();
        RecyclerView recyclerView = this.myRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f29145g);
        }
        if (this.q != null) {
            c.h.a.i.q.a aVar = new c.h.a.i.q.a(this.q);
            this.f29148j = aVar;
            for (c.h.a.i.b bVar : aVar.p("vod", m.z(this.q))) {
                c.h.a.i.f fVarD1 = new c.h.a.i.q.f(this.q).D1(bVar.a(), String.valueOf(bVar.e()));
                if (fVarD1 != null) {
                    this.f29151m.add(fVarD1);
                }
            }
            b();
            if (this.myRecyclerView != null && (arrayList2 = this.f29151m) != null && arrayList2.size() != 0) {
                VodAdapter vodAdapter = new VodAdapter(this.f29151m, getContext(), true);
                this.f29145g = vodAdapter;
                this.myRecyclerView.setAdapter(vodAdapter);
                this.f29145g.w();
                this.tvNoStream.setVisibility(4);
            }
            if (this.tvNoStream == null || (arrayList = this.f29151m) == null || arrayList.size() != 0) {
                return;
            }
            RecyclerView recyclerView2 = this.myRecyclerView;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.f29145g);
            }
            this.tvNoStream.setText(getResources().getString(R.string.no_fav_vod_found));
            this.tvNoStream.setVisibility(0);
        }
    }
}
