package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class CancelInvoiceActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CancelInvoiceActivity f24700b;

    public CancelInvoiceActivity_ViewBinding(CancelInvoiceActivity cancelInvoiceActivity, View view) {
        this.f24700b = cancelInvoiceActivity;
        cancelInvoiceActivity.recyclerView = (RecyclerView) c.c(view, R.id.recy_view, "field 'recyclerView'", RecyclerView.class);
        cancelInvoiceActivity.textNotFound = (TextView) c.c(view, R.id.text_not_found, "field 'textNotFound'", TextView.class);
        cancelInvoiceActivity.progress = (SpinKitView) c.c(view, R.id.progress, "field 'progress'", SpinKitView.class);
        cancelInvoiceActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        cancelInvoiceActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        CancelInvoiceActivity cancelInvoiceActivity = this.f24700b;
        if (cancelInvoiceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24700b = null;
        cancelInvoiceActivity.recyclerView = null;
        cancelInvoiceActivity.textNotFound = null;
        cancelInvoiceActivity.progress = null;
        cancelInvoiceActivity.date = null;
        cancelInvoiceActivity.time = null;
    }
}
