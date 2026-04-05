package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import a.b.k.c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.h.a.e.b.a;
import com.nst.iptvsmarterstvbox.R;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class InvoicePaidDetailActivity extends c {

    @BindView
    public Button back;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f24727d = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f24728e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f24729f = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f24730g;

    @BindView
    public WebView webview;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, (Class<?>) MyInvoiceActivity.class));
    }

    @OnClick
    public void onClick(View view) {
        if (view.getId() != R.id.back) {
            return;
        }
        startActivity(this.f24728e.equalsIgnoreCase("paid") ? new Intent(this, (Class<?>) PaidInvoiceActivity.class) : this.f24728e.equalsIgnoreCase("Unpaid") ? new Intent(this, (Class<?>) UnpiadInvoiceActivity.class) : this.f24728e.equalsIgnoreCase("Cancelled") ? new Intent(this, (Class<?>) CancelInvoiceActivity.class) : this.f24728e.equalsIgnoreCase("Refund") ? new Intent(this, (Class<?>) InvoiceRefundedActivity.class) : new Intent(this, (Class<?>) MyInvoiceActivity.class));
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_invoice_paid_detail);
        ButterKnife.a(this);
        this.f24730g = this;
        Intent intent = getIntent();
        this.f24728e = intent.getStringExtra("status");
        this.f24727d = intent.getStringExtra("invoice_id");
        y0();
    }

    public final void y0() {
        if (this.f24727d != null) {
            WebView webView = (WebView) findViewById(R.id.webview);
            this.webview = webView;
            webView.loadUrl("https://cms.alldrama.tv/viewinvoice.php?id=" + this.f24727d + "&loginemail=" + a.b(this.f24730g) + "&api_username=OUBQqC6334OcxjS&gotourl=viewinvoice.php?id=" + this.f24727d);
        }
    }
}
