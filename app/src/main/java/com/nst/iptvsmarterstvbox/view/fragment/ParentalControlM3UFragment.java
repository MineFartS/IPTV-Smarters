package minefarts.iptvsmarters.view.fragment;

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
import minefarts.iptvsmarters.R;
import minefarts.iptvsmarters.view.activity.NewDashboardActivity;
import minefarts.iptvsmarters.view.activity.ParentalControlActivitity;
import minefarts.iptvsmarters.view.activity.SettingsActivity;
import minefarts.iptvsmarters.view.adapter.ParentalControlVODCatAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class ParentalControlM3UFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ParentalControlActivitity f28955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ParentalControlVODCatAdapter f28956e;

    @BindView
    public TextView emptyView;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView.p f28957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ProgressDialog f28958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Typeface f28959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Toolbar f28960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SearchView f28961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.f f28962k;

    @BindView
    public RecyclerView myRecyclerView;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f28966o;
    public Unbinder p;

    @BindView
    public ProgressBar pbLoader;
    public f q;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.b f28963l = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.b f28964m = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f28965n = -1;

    public class a implements SearchView.l {
        public a() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            ProgressBar progressBar = ParentalControlM3UFragment.this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            if (ParentalControlM3UFragment.this.f28958g != null) {
                ParentalControlM3UFragment.this.f28958g.dismiss();
            }
            ParentalControlM3UFragment parentalControlM3UFragment = ParentalControlM3UFragment.this;
            if (parentalControlM3UFragment.emptyView == null || parentalControlM3UFragment.f28956e == null) {
                return true;
            }
            ParentalControlM3UFragment.this.emptyView.setVisibility(8);
            ParentalControlVODCatAdapter parentalControlVODCatAdapter = ParentalControlM3UFragment.this.f28956e;
            ParentalControlM3UFragment parentalControlM3UFragment2 = ParentalControlM3UFragment.this;
            parentalControlVODCatAdapter.n0(str, parentalControlM3UFragment2.emptyView, parentalControlM3UFragment2.f28958g);
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
        this.f28966o = getContext();
        this.f28962k = new c.h.a.i.q.f(this.f28966o);
        this.f28959h = Typeface.createFromAsset(getActivity().getAssets(), "fonts/open_sans.ttf");
        this.f28955d = (ParentalControlActivitity) this.f28966o;
        this.myRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f28957f = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        c.h.a.i.q.f fVar = new c.h.a.i.q.f(this.f28966o);
        ArrayList<c.h.a.i.e> arrayListR1 = fVar.r1();
        this.f28965n = fVar.V1(Boolean.FALSE);
        c.h.a.i.e eVar = new c.h.a.i.e();
        int i2 = this.f28965n;
        if (i2 != 0 && i2 > 0) {
            eVar.g(BuildConfig.FLAVOR);
            eVar.h(getResources().getString(R.string.uncategories));
            arrayListR1.add(arrayListR1.size(), eVar);
        }
        HashMap map = new HashMap();
        if (arrayListR1 != null) {
            for (c.h.a.i.e eVar2 : arrayListR1) {
                map.put(eVar2.b(), eVar2.c());
            }
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        if (arrayListR1 != null && arrayListR1.size() > 0 && (recyclerView = this.myRecyclerView) != null && this.emptyView != null) {
            recyclerView.setVisibility(0);
            this.emptyView.setVisibility(8);
            ParentalControlVODCatAdapter parentalControlVODCatAdapter = new ParentalControlVODCatAdapter(arrayListR1, getContext(), this.f28955d, this.f28959h);
            this.f28956e = parentalControlVODCatAdapter;
            this.myRecyclerView.setAdapter(parentalControlVODCatAdapter);
            return;
        }
        RecyclerView recyclerView2 = this.myRecyclerView;
        if (recyclerView2 == null || this.emptyView == null) {
            return;
        }
        recyclerView2.setVisibility(8);
        this.emptyView.setVisibility(0);
        this.emptyView.setText(getResources().getString(R.string.no_cat_found));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof f) {
            this.q = (f) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f28953b = getArguments().getString("param1");
            this.f28954c = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (menu != null) {
            menu.clear();
        }
        this.f28960i.x(R.menu.menu_search);
        TypedValue typedValue = new TypedValue();
        if (this.f28966o.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f28966o.getResources().getDisplayMetrics());
        }
        for (int i2 = 0; i2 < this.f28960i.getChildCount(); i2++) {
            if (this.f28960i.getChildAt(i2) instanceof ActionMenuView) {
                ((Toolbar.e) this.f28960i.getChildAt(i2).getLayoutParams()).f135a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(false);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_parental_control_vodcat, viewGroup, false);
        this.p = ButterKnife.b(this, viewInflate);
        o();
        q();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.q = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.action_logout1 /* 2131427417 */:
                Context context = this.f28966o;
                if (context != null) {
                    c.h.a.h.n.e.O(context);
                }
                break;
            case R.id.action_search /* 2131427425 */:
                SearchView searchView = (SearchView) j.b(menuItem);
                this.f28961j = searchView;
                searchView.setQueryHint(getResources().getString(R.string.search_categories));
                this.f28961j.setIconifiedByDefault(false);
                this.f28961j.setOnQueryTextListener(new a());
                break;
            case R.id.menu_load_channels_vod1 /* 2131428603 */:
                b.a aVar = new b.a(this.f28966o);
                aVar.d(R.drawable.questionmark);
                aVar.j(this.f28966o.getResources().getString(R.string.yes), new b());
                aVar.g(this.f28966o.getResources().getString(R.string.no), new c());
                aVar.n();
                break;
            case R.id.menu_load_tv_guide1 /* 2131428605 */:
                b.a aVar2 = new b.a(this.f28966o);
                aVar2.d(R.drawable.questionmark);
                aVar2.j(this.f28966o.getResources().getString(R.string.yes), new d());
                aVar2.g(this.f28966o.getResources().getString(R.string.no), new e());
                aVar2.n();
                break;
            case R.id.nav_home /* 2131428714 */:
                startActivity(new Intent(this.f28966o, (Class<?>) NewDashboardActivity.class));
                startActivity(new Intent(this.f28966o, (Class<?>) SettingsActivity.class));
                SearchView searchView2 = (SearchView) j.b(menuItem);
                this.f28961j = searchView2;
                searchView2.setQueryHint(getResources().getString(R.string.search_categories));
                this.f28961j.setIconifiedByDefault(false);
                this.f28961j.setOnQueryTextListener(new a());
                break;
            case R.id.nav_settings /* 2131428729 */:
                startActivity(new Intent(this.f28966o, (Class<?>) SettingsActivity.class));
                SearchView searchView22 = (SearchView) j.b(menuItem);
                this.f28961j = searchView22;
                searchView22.setQueryHint(getResources().getString(R.string.search_categories));
                this.f28961j.setIconifiedByDefault(false);
                this.f28961j.setOnQueryTextListener(new a());
                break;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public final void q() {
        setHasOptionsMenu(true);
        this.f28960i = (Toolbar) getActivity().findViewById(R.id.toolbar);
    }
}
