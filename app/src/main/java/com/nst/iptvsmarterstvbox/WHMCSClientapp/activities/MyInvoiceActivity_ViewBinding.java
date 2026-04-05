package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;
import com.wang.avi.AVLoadingIndicatorView;

/* JADX INFO: loaded from: classes2.dex */
public class MyInvoiceActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MyInvoiceActivity f24746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f24747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f24748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f24749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f24750f;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MyInvoiceActivity f24751d;

        public a(MyInvoiceActivity myInvoiceActivity) {
            this.f24751d = myInvoiceActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24751d.click(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MyInvoiceActivity f24753d;

        public b(MyInvoiceActivity myInvoiceActivity) {
            this.f24753d = myInvoiceActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24753d.click(view);
        }
    }

    public class c extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MyInvoiceActivity f24755d;

        public c(MyInvoiceActivity myInvoiceActivity) {
            this.f24755d = myInvoiceActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24755d.click(view);
        }
    }

    public class d extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MyInvoiceActivity f24757d;

        public d(MyInvoiceActivity myInvoiceActivity) {
            this.f24757d = myInvoiceActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24757d.click(view);
        }
    }

    public MyInvoiceActivity_ViewBinding(MyInvoiceActivity myInvoiceActivity, View view) {
        this.f24746b = myInvoiceActivity;
        myInvoiceActivity.time = (TextView) b.c.c.c(view, R.id.time, "field 'time'", TextView.class);
        myInvoiceActivity.date = (TextView) b.c.c.c(view, R.id.date, "field 'date'", TextView.class);
        myInvoiceActivity.sow_no = (TextView) b.c.c.c(view, R.id.sow_no, "field 'sow_no'", TextView.class);
        myInvoiceActivity.sow_up = (TextView) b.c.c.c(view, R.id.sow_up, "field 'sow_up'", TextView.class);
        myInvoiceActivity.sow_rf = (TextView) b.c.c.c(view, R.id.sow_rf, "field 'sow_rf'", TextView.class);
        myInvoiceActivity.sow_cnl = (TextView) b.c.c.c(view, R.id.sow_cnl, "field 'sow_cnl'", TextView.class);
        myInvoiceActivity.loader_show = (AVLoadingIndicatorView) b.c.c.c(view, R.id.loader_show, "field 'loader_show'", AVLoadingIndicatorView.class);
        myInvoiceActivity.loader_showup = (AVLoadingIndicatorView) b.c.c.c(view, R.id.loader_showup, "field 'loader_showup'", AVLoadingIndicatorView.class);
        myInvoiceActivity.loader_showrf = (AVLoadingIndicatorView) b.c.c.c(view, R.id.loader_showrf, "field 'loader_showrf'", AVLoadingIndicatorView.class);
        myInvoiceActivity.loader_showcnl = (AVLoadingIndicatorView) b.c.c.c(view, R.id.loader_showcnl, "field 'loader_showcnl'", AVLoadingIndicatorView.class);
        View viewB = b.c.c.b(view, R.id.unpaid, "field 'unpaid_box' and method 'click'");
        myInvoiceActivity.unpaid_box = (LinearLayout) b.c.c.a(viewB, R.id.unpaid, "field 'unpaid_box'", LinearLayout.class);
        this.f24747c = viewB;
        viewB.setOnClickListener(new a(myInvoiceActivity));
        View viewB2 = b.c.c.b(view, R.id.paid, "field 'paid_box' and method 'click'");
        myInvoiceActivity.paid_box = (LinearLayout) b.c.c.a(viewB2, R.id.paid, "field 'paid_box'", LinearLayout.class);
        this.f24748d = viewB2;
        viewB2.setOnClickListener(new b(myInvoiceActivity));
        View viewB3 = b.c.c.b(view, R.id.refound, "field 'refound_box' and method 'click'");
        myInvoiceActivity.refound_box = (LinearLayout) b.c.c.a(viewB3, R.id.refound, "field 'refound_box'", LinearLayout.class);
        this.f24749e = viewB3;
        viewB3.setOnClickListener(new c(myInvoiceActivity));
        View viewB4 = b.c.c.b(view, R.id.cancel, "field 'cancel_box' and method 'click'");
        myInvoiceActivity.cancel_box = (LinearLayout) b.c.c.a(viewB4, R.id.cancel, "field 'cancel_box'", LinearLayout.class);
        this.f24750f = viewB4;
        viewB4.setOnClickListener(new d(myInvoiceActivity));
    }

    @Override // butterknife.Unbinder
    public void a() {
        MyInvoiceActivity myInvoiceActivity = this.f24746b;
        if (myInvoiceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24746b = null;
        myInvoiceActivity.time = null;
        myInvoiceActivity.date = null;
        myInvoiceActivity.sow_no = null;
        myInvoiceActivity.sow_up = null;
        myInvoiceActivity.sow_rf = null;
        myInvoiceActivity.sow_cnl = null;
        myInvoiceActivity.loader_show = null;
        myInvoiceActivity.loader_showup = null;
        myInvoiceActivity.loader_showrf = null;
        myInvoiceActivity.loader_showcnl = null;
        myInvoiceActivity.unpaid_box = null;
        myInvoiceActivity.paid_box = null;
        myInvoiceActivity.refound_box = null;
        myInvoiceActivity.cancel_box = null;
        this.f24747c.setOnClickListener(null);
        this.f24747c = null;
        this.f24748d.setOnClickListener(null);
        this.f24748d = null;
        this.f24749e.setOnClickListener(null);
        this.f24749e = null;
        this.f24750f.setOnClickListener(null);
        this.f24750f = null;
    }
}
