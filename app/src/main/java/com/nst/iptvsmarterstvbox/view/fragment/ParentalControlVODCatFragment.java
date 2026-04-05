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

/* JADX INFO: loaded from: classes2.dex */
public class ParentalControlVODCatFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f29026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ParentalControlActivitity f29028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ParentalControlVODCatAdapter f29029e;

    @BindView
    public TextView emptyView;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView.p f29030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ProgressDialog f29031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Typeface f29032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Toolbar f29033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SearchView f29034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.h.a.i.q.f f29035k;

    @BindView
    public RecyclerView myRecyclerView;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f29039o;
    public Unbinder p;

    @BindView
    public ProgressBar pbLoader;
    public f q;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.h.a.i.q.b f29036l = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.h.a.i.q.b f29037m = new c.h.a.i.q.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29038n = -1;

    public class a implements SearchView.l {
        public a() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean onQueryTextChange(String str) {
            ProgressBar progressBar = ParentalControlVODCatFragment.this.pbLoader;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            if (ParentalControlVODCatFragment.this.f29031g != null) {
                ParentalControlVODCatFragment.this.f29031g.dismiss();
            }
            ParentalControlVODCatFragment parentalControlVODCatFragment = ParentalControlVODCatFragment.this;
            if (parentalControlVODCatFragment.emptyView == null || parentalControlVODCatFragment.f29029e == null) {
                return true;
            }
            ParentalControlVODCatFragment.this.emptyView.setVisibility(8);
            ParentalControlVODCatAdapter parentalControlVODCatAdapter = ParentalControlVODCatFragment.this.f29029e;
            ParentalControlVODCatFragment parentalControlVODCatFragment2 = ParentalControlVODCatFragment.this;
            parentalControlVODCatAdapter.n0(str, parentalControlVODCatFragment2.emptyView, parentalControlVODCatFragment2.f29031g);
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
        this.f29039o = getContext();
        this.f29035k = new c.h.a.i.q.f(this.f29039o);
        this.f29032h = Typeface.createFromAsset(getActivity().getAssets(), "fonts/open_sans.ttf");
        this.f29028d = (ParentalControlActivitity) this.f29039o;
        this.myRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f29030f = linearLayoutManager;
        this.myRecyclerView.setLayoutManager(linearLayoutManager);
        c.h.a.i.q.f fVar = new c.h.a.i.q.f(this.f29039o);
        ArrayList<c.h.a.i.e> arrayListB1 = fVar.b1();
        this.f29038n = fVar.T1("-3", "movie");
        c.h.a.i.e eVar = new c.h.a.i.e();
        int i2 = this.f29038n;
        if (i2 != 0 && i2 > 0) {
            eVar.g("-3");
            eVar.h(getResources().getString(R.string.uncategories));
            arrayListB1.add(arrayListB1.size(), eVar);
        }
        HashMap map = new HashMap();
        if (arrayListB1 != null) {
            for (c.h.a.i.e eVar2 : arrayListB1) {
                map.put(eVar2.b(), eVar2.c());
            }
        }
        ProgressBar progressBar = this.pbLoader;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        if (arrayListB1 != null && arrayListB1.size() > 0 && (recyclerView = this.myRecyclerView) != null && this.emptyView != null) {
            recyclerView.setVisibility(0);
            this.emptyView.setVisibility(8);
            ParentalControlVODCatAdapter parentalControlVODCatAdapter = new ParentalControlVODCatAdapter(arrayListB1, getContext(), this.f29028d, this.f29032h);
            this.f29029e = parentalControlVODCatAdapter;
            this.myRecyclerView.setAdapter(parentalControlVODCatAdapter);
            return;
        }
        RecyclerView recyclerView2 = this.myRecyclerView;
        if (recyclerView2 == null || this.emptyView == null) {
            return;
        }
        recyclerView2.setVisibility(8);
        this.emptyView.setVisibility(0);
        this.emptyView.setText(getResources().getString(R.string.no_vod_cat_found));
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
            this.f29026b = getArguments().getString("param1");
            this.f29027c = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (menu != null) {
            menu.clear();
        }
        this.f29033i.x(R.menu.menu_search);
        TypedValue typedValue = new TypedValue();
        if (this.f29039o.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f29039o.getResources().getDisplayMetrics());
        }
        for (int i2 = 0; i2 < this.f29033i.getChildCount(); i2++) {
            if (this.f29033i.getChildAt(i2) instanceof ActionMenuView) {
                ((Toolbar.e) this.f29033i.getChildAt(i2).getLayoutParams()).f135a = 16;
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
                Context context = this.f29039o;
                if (context != null) {
                    c.h.a.h.n.e.O(context);
                }
                break;
            case R.id.action_search /* 2131427425 */:
                SearchView searchView = (SearchView) j.b(menuItem);
                this.f29034j = searchView;
                searchView.setQueryHint(getResources().getString(R.string.search_categories));
                this.f29034j.setIconifiedByDefault(false);
                this.f29034j.setOnQueryTextListener(new a());
                break;
            case R.id.menu_load_channels_vod1 /* 2131428603 */:
                b.a aVar = new b.a(this.f29039o);
                aVar.d(R.drawable.questionmark);
                aVar.j(this.f29039o.getResources().getString(R.string.yes), new b());
                aVar.g(this.f29039o.getResources().getString(R.string.no), new c());
                aVar.n();
                break;
            case R.id.menu_load_tv_guide1 /* 2131428605 */:
                b.a aVar2 = new b.a(this.f29039o);
                aVar2.d(R.drawable.questionmark);
                aVar2.j(this.f29039o.getResources().getString(R.string.yes), new d());
                aVar2.g(this.f29039o.getResources().getString(R.string.no), new e());
                aVar2.n();
                break;
            case R.id.nav_home /* 2131428714 */:
                startActivity(new Intent(this.f29039o, (Class<?>) NewDashboardActivity.class));
                startActivity(new Intent(this.f29039o, (Class<?>) SettingsActivity.class));
                SearchView searchView2 = (SearchView) j.b(menuItem);
                this.f29034j = searchView2;
                searchView2.setQueryHint(getResources().getString(R.string.search_categories));
                this.f29034j.setIconifiedByDefault(false);
                this.f29034j.setOnQueryTextListener(new a());
                break;
            case R.id.nav_settings /* 2131428729 */:
                startActivity(new Intent(this.f29039o, (Class<?>) SettingsActivity.class));
                SearchView searchView22 = (SearchView) j.b(menuItem);
                this.f29034j = searchView22;
                searchView22.setQueryHint(getResources().getString(R.string.search_categories));
                this.f29034j.setIconifiedByDefault(false);
                this.f29034j.setOnQueryTextListener(new a());
                break;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public final void q() {
        setHasOptionsMenu(true);
        this.f29033i = (Toolbar) getActivity().findViewById(R.id.toolbar);
    }
}
