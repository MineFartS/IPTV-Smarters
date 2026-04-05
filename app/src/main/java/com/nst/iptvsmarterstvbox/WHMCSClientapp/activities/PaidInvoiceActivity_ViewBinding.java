package minefarts.iptvsmarters.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class PaidInvoiceActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PaidInvoiceActivity f24816b;

    public PaidInvoiceActivity_ViewBinding(PaidInvoiceActivity paidInvoiceActivity, View view) {
        this.f24816b = paidInvoiceActivity;
        paidInvoiceActivity.recyclerView = (RecyclerView) c.c(view, R.id.recy_view, "field 'recyclerView'", RecyclerView.class);
        paidInvoiceActivity.textNotFound = (TextView) c.c(view, R.id.text_not_found, "field 'textNotFound'", TextView.class);
        paidInvoiceActivity.progress = (SpinKitView) c.c(view, R.id.progress, "field 'progress'", SpinKitView.class);
        paidInvoiceActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        paidInvoiceActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        PaidInvoiceActivity paidInvoiceActivity = this.f24816b;
        if (paidInvoiceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24816b = null;
        paidInvoiceActivity.recyclerView = null;
        paidInvoiceActivity.textNotFound = null;
        paidInvoiceActivity.progress = null;
        paidInvoiceActivity.time = null;
        paidInvoiceActivity.date = null;
    }
}
