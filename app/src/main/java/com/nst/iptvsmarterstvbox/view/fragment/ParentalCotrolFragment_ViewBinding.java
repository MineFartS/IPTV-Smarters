package com.nst.iptvsmarterstvbox.view.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import b.c.c;
import butterknife.Unbinder;
import com.google.android.material.tabs.TabLayout;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class ParentalCotrolFragment_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ParentalCotrolFragment f29056b;

    public ParentalCotrolFragment_ViewBinding(ParentalCotrolFragment parentalCotrolFragment, View view) {
        this.f29056b = parentalCotrolFragment;
        parentalCotrolFragment.ivLine = (ImageView) c.c(view, R.id.iv_line, "field 'ivLine'", ImageView.class);
        parentalCotrolFragment.tvMyInvoices = (TextView) c.c(view, R.id.tv_my_invoices, "field 'tvMyInvoices'", TextView.class);
        parentalCotrolFragment.viewLineMyInvoices = c.b(view, R.id.view_line_my_invoices, "field 'viewLineMyInvoices'");
        parentalCotrolFragment.tabLayoutInvoices = (TabLayout) c.c(view, R.id.tab_layout_invoices, "field 'tabLayoutInvoices'", TabLayout.class);
        parentalCotrolFragment.lineBelowTabs = c.b(view, R.id.line_below_tabs, "field 'lineBelowTabs'");
        parentalCotrolFragment.pager = (ViewPager) c.c(view, R.id.pager, "field 'pager'", ViewPager.class);
        parentalCotrolFragment.rlMyInvoices = (RelativeLayout) c.c(view, R.id.rl_my_invoices, "field 'rlMyInvoices'", RelativeLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ParentalCotrolFragment parentalCotrolFragment = this.f29056b;
        if (parentalCotrolFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f29056b = null;
        parentalCotrolFragment.ivLine = null;
        parentalCotrolFragment.tvMyInvoices = null;
        parentalCotrolFragment.viewLineMyInvoices = null;
        parentalCotrolFragment.tabLayoutInvoices = null;
        parentalCotrolFragment.lineBelowTabs = null;
        parentalCotrolFragment.pager = null;
        parentalCotrolFragment.rlMyInvoices = null;
    }
}
