package com.nst.iptvsmarterstvbox.view.fragment;

import a.b.k.b;
import a.i.r.j;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.ParentalControlActivitity;
import com.nst.iptvsmarterstvbox.view.activity.SettingsActivity;
import com.nst.iptvsmarterstvbox.view.adapter.ParentalControlLiveCatgoriesAdapter;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ParentalControlCategoriesFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ParentalControlActivitity f28935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ParentalControlLiveCatgoriesAdapter f28936e;

    @BindView
    public TextView emptyView;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView.p f28937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ProgressDialog f28938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Typeface f28939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Toolbar f28940i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SearchView f28941j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.f f28942k;

    @BindView
    public RecyclerView myRecyclerView;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f28945n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Unbinder f28946o;
    public f p;

    @BindView
    public ProgressBar pbLoader;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.b f28943l = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.b f28944m = new c.h.a.i.q.b();
    public int q = -1;

    public class a implements SearchView.l {
        public a() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            ProgressBar progressBar = ParentalControlCategoriesFragment.this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            if (ParentalControlCategoriesFragment.this.f28938g != null) {
                ParentalControlCategoriesFragment.this.f28938g.dismiss();
            }
            ParentalControlCategoriesFragment parentalControlCategoriesFragment = ParentalControlCategoriesFragment.this;
            if (parentalControlCategoriesFragment.emptyView == null || parentalControlCategoriesFragment.f28936e == null) {
                return true;
            }
            ParentalControlCategoriesFragment.this.emptyView.setVisibility(8);
            ParentalControlLiveCatgoriesAdapter parentalControlLiveCatgoriesAdapter = ParentalControlCategoriesFragment.this.f28936e;
            ParentalControlCategoriesFragment parentalControlCategoriesFragment2 = ParentalControlCategoriesFragment.this;
            parentalControlLiveCatgoriesAdapter.n0(str, parentalControlCategoriesFragment2.emptyView, parentalControlCategoriesFragment2.f28938g);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c.h.a.h.n.e.N(ParentalControlCategoriesFragment.this.f28945n);
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
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

    public interface f {
    }

    public final void o() {
        RecyclerView recyclerView;
        this.f28945n = getContext();
        this.f28942k = new c.h.a.i.q.f(this.f28945n);
        this.f28939h = Typeface.createFromAsset(getActivity().getAssets(), "fonts/open_sans.ttf");
        this.f28935d = (ParentalControlActivitity) this.f28945n;
        this.myRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f28937f = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        c.h.a.i.q.f fVar = new c.h.a.i.q.f(this.f28945n);
        ArrayList<c.h.a.i.e> arrayListP1 = fVar.p1("live");
        this.q = fVar.T1("-2", "live");
        c.h.a.i.e eVar = new c.h.a.i.e();
        int i2 = this.q;
        if (i2 != 0 && i2 > 0) {
            eVar.g("-2");
            eVar.h(getResources().getString(R.string.uncategories));
            arrayListP1.add(arrayListP1.size(), eVar);
        }
        HashMap map = new HashMap();
        if (arrayListP1 != null) {
            for (c.h.a.i.e eVar2 : arrayListP1) {
                map.put(eVar2.b(), eVar2.c());
            }
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        if (arrayListP1 != null && arrayListP1.size() > 0 && (recyclerView = this.myRecyclerView) != null && this.emptyView != null) {
            recyclerView.setVisibility(0);
            this.emptyView.setVisibility(8);
            ParentalControlLiveCatgoriesAdapter parentalControlLiveCatgoriesAdapter = new ParentalControlLiveCatgoriesAdapter(arrayListP1, getContext(), this.f28935d, this.f28939h);
            this.f28936e = parentalControlLiveCatgoriesAdapter;
            this.myRecyclerView.setAdapter(parentalControlLiveCatgoriesAdapter);
            return;
        }
        RecyclerView recyclerView2 = this.myRecyclerView;
        if (recyclerView2 == null || this.emptyView == null) {
            return;
        }
        recyclerView2.setVisibility(8);
        this.emptyView.setVisibility(0);
        this.emptyView.setText(getResources().getString(R.string.no_live_cat_found));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof f) {
            this.p = (f) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f28933b = getArguments().getString("param1");
            this.f28934c = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (menu != null) {
            menu.clear();
        }
        this.f28940i.x(R.menu.menu_search);
        TypedValue typedValue = new TypedValue();
        if (this.f28945n.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f28945n.getResources().getDisplayMetrics());
        }
        for (int i2 = 0; i2 < this.f28940i.getChildCount(); i2++) {
            if (this.f28940i.getChildAt(i2) instanceof ActionMenuView) {
                ((Toolbar.e) this.f28940i.getChildAt(i2).getLayoutParams()).f135a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(false);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_parental_control_categories, viewGroup, false);
        this.f28946o = ButterKnife.b(this, viewInflate);
        o();
        q();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        setHasOptionsMenu(false);
        this.p = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getItemId();
        switch (menuItem.getItemId()) {
            case R.id.action_logout1 /* 2131427417 */:
                Context context = this.f28945n;
                if (context != null) {
                    c.h.a.h.n.e.O(context);
                }
                break;
            case R.id.action_search /* 2131427425 */:
                SearchView searchView = (SearchView) j.b(menuItem);
                this.f28941j = searchView;
                searchView.setQueryHint(getResources().getString(R.string.search_live_categories));
                this.f28941j.setIconifiedByDefault(false);
                this.f28941j.setOnQueryTextListener(new a());
                break;
            case R.id.menu_load_channels_vod1 /* 2131428603 */:
                b.a aVar = new b.a(this.f28945n);
                aVar.setTitle(this.f28945n.getResources().getString(R.string.confirm_to_refresh));
                aVar.f(this.f28945n.getResources().getString(R.string.do_you_want_toproceed));
                aVar.d(R.drawable.questionmark);
                aVar.j(this.f28945n.getResources().getString(R.string.yes), new b());
                aVar.g(this.f28945n.getResources().getString(R.string.no), new c());
                aVar.n();
                break;
            case R.id.menu_load_tv_guide1 /* 2131428605 */:
                b.a aVar2 = new b.a(this.f28945n);
                aVar2.setTitle(this.f28945n.getResources().getString(R.string.confirm_to_refresh));
                aVar2.f(this.f28945n.getResources().getString(R.string.do_you_want_toproceed));
                aVar2.d(R.drawable.questionmark);
                aVar2.j(this.f28945n.getResources().getString(R.string.yes), new d());
                aVar2.g(this.f28945n.getResources().getString(R.string.no), new e());
                aVar2.n();
                break;
            case R.id.nav_home /* 2131428714 */:
                startActivity(new Intent(this.f28945n, (Class<?>) NewDashboardActivity.class));
                startActivity(new Intent(this.f28945n, (Class<?>) SettingsActivity.class));
                SearchView searchView2 = (SearchView) j.b(menuItem);
                this.f28941j = searchView2;
                searchView2.setQueryHint(getResources().getString(R.string.search_live_categories));
                this.f28941j.setIconifiedByDefault(false);
                this.f28941j.setOnQueryTextListener(new a());
                break;
            case R.id.nav_settings /* 2131428729 */:
                startActivity(new Intent(this.f28945n, (Class<?>) SettingsActivity.class));
                SearchView searchView22 = (SearchView) j.b(menuItem);
                this.f28941j = searchView22;
                searchView22.setQueryHint(getResources().getString(R.string.search_live_categories));
                this.f28941j.setIconifiedByDefault(false);
                this.f28941j.setOnQueryTextListener(new a());
                break;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public final void q() {
        setHasOptionsMenu(true);
        this.f28940i = (Toolbar) getActivity().findViewById(R.id.toolbar);
    }
}
