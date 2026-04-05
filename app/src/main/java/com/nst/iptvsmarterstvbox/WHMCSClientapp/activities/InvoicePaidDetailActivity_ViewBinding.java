package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import b.c.b;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class InvoicePaidDetailActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InvoicePaidDetailActivity f24731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f24732c;

    public class a extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InvoicePaidDetailActivity f24733d;

        public a(InvoicePaidDetailActivity invoicePaidDetailActivity) {
            this.f24733d = invoicePaidDetailActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24733d.onClick(view);
        }
    }

    public InvoicePaidDetailActivity_ViewBinding(InvoicePaidDetailActivity invoicePaidDetailActivity, View view) {
        this.f24731b = invoicePaidDetailActivity;
        invoicePaidDetailActivity.webview = (WebView) c.c(view, R.id.webview, "field 'webview'", WebView.class);
        View viewB = c.b(view, R.id.back, "field 'back' and method 'onClick'");
        invoicePaidDetailActivity.back = (Button) c.a(viewB, R.id.back, "field 'back'", Button.class);
        this.f24732c = viewB;
        viewB.setOnClickListener(new a(invoicePaidDetailActivity));
    }

    @Override // butterknife.Unbinder
    public void a() {
        InvoicePaidDetailActivity invoicePaidDetailActivity = this.f24731b;
        if (invoicePaidDetailActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24731b = null;
        invoicePaidDetailActivity.webview = null;
        invoicePaidDetailActivity.back = null;
        this.f24732c.setOnClickListener(null);
        this.f24732c = null;
    }
}
