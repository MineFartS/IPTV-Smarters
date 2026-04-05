package com.nst.iptvsmarterstvbox.view.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import c.h.a.i.q.m;
import c.h.a.k.b.q;
import com.google.android.material.tabs.TabLayout;
import com.nst.iptvsmarterstvbox.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class ParentalCotrolFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Unbinder f29046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f29047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<Integer> f29048d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Typeface f29049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Typeface f29050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f29051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f29052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f29053i;

    @BindView
    public ImageView ivLine;

    @BindView
    public View lineBelowTabs;

    @BindView
    public ViewPager pager;

    @BindView
    public RelativeLayout rlMyInvoices;

    @BindView
    public TabLayout tabLayoutInvoices;

    @BindView
    public TextView tvMyInvoices;

    @BindView
    public View viewLineMyInvoices;

    public class a implements TabLayout.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f29054a;

        public a(q qVar) {
            this.f29054a = qVar;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
            ParentalCotrolFragment.this.pager.setCurrentItem(gVar.g());
            int iG = gVar.g();
            View viewE = gVar.e();
            if (iG == 0) {
                this.f29054a.r(viewE, ParentalCotrolFragment.this.f29049e, iG);
                return;
            }
            if (iG == 1 || iG == 2) {
                this.f29054a.t(viewE, ParentalCotrolFragment.this.f29049e, iG);
            } else {
                if (iG != 3) {
                    return;
                }
                this.f29054a.s(viewE, ParentalCotrolFragment.this.f29049e);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
            int iG = gVar.g();
            View viewE = gVar.e();
            if (iG == 0) {
                this.f29054a.x(viewE, ParentalCotrolFragment.this.f29050f);
                return;
            }
            if (iG == 1 || iG == 2) {
                this.f29054a.w(viewE, ParentalCotrolFragment.this.f29050f);
            } else {
                if (iG != 3) {
                    return;
                }
                this.f29054a.y(viewE, ParentalCotrolFragment.this.f29050f);
            }
        }
    }

    public interface b {
    }

    public final void l() {
        this.f29047c = getContext();
        getActivity().getSharedPreferences("loginPrefs", 0);
        n();
    }

    public final void n() {
        TabLayout tabLayout;
        TabLayout.g gVarZ;
        Resources resources;
        int i2;
        String strF = m.f(this.f29047c);
        if (strF.equals("m3u")) {
            tabLayout = this.tabLayoutInvoices;
            gVarZ = tabLayout.z();
            resources = this.f29047c.getResources();
            i2 = R.string.all;
        } else {
            TabLayout tabLayout2 = this.tabLayoutInvoices;
            tabLayout2.e(tabLayout2.z().r(getResources().getString(R.string.categories)));
            TabLayout tabLayout3 = this.tabLayoutInvoices;
            tabLayout3.e(tabLayout3.z().r(getResources().getString(R.string.vod_categories)));
            TabLayout tabLayout4 = this.tabLayoutInvoices;
            tabLayout4.e(tabLayout4.z().r(getResources().getString(R.string.series_categories)));
            tabLayout = this.tabLayoutInvoices;
            gVarZ = tabLayout.z();
            resources = getResources();
            i2 = R.string.radio_categories;
        }
        tabLayout.e(gVarZ.r(resources.getString(i2)));
        TabLayout tabLayout5 = this.tabLayoutInvoices;
        tabLayout5.e(tabLayout5.z().r(getResources().getString(R.string.update_password_heading)));
        this.tabLayoutInvoices.setTabGravity(0);
        q qVar = new q(getChildFragmentManager(), this.tabLayoutInvoices.getTabCount(), getContext(), this.f29048d, strF);
        this.pager.setAdapter(qVar);
        this.tabLayoutInvoices.setupWithViewPager(this.pager);
        for (int i3 = 0; i3 < this.tabLayoutInvoices.getTabCount(); i3++) {
            this.tabLayoutInvoices.x(i3).o(qVar.q(i3));
        }
        View viewE = this.tabLayoutInvoices.x(0).e();
        View viewE2 = this.tabLayoutInvoices.x(1).e();
        qVar.u(viewE, this.f29049e);
        qVar.v(viewE2, this.f29049e);
        this.pager.setCurrentItem(0);
        this.pager.c(new TabLayout.h(this.tabLayoutInvoices));
        this.tabLayoutInvoices.d(new a(qVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof b) {
            this.f29053i = (b) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f29051g = getArguments().getString("param1");
            this.f29052h = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_parental_cotrol, viewGroup, false);
        this.f29046b = ButterKnife.b(this, viewInflate);
        l();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f29053i = null;
    }
}
