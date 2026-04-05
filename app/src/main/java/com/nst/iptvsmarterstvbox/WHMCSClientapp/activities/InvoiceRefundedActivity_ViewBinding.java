package minefarts.iptvsmarters.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class InvoiceRefundedActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InvoiceRefundedActivity f24738b;

    public InvoiceRefundedActivity_ViewBinding(InvoiceRefundedActivity invoiceRefundedActivity, View view) {
        this.f24738b = invoiceRefundedActivity;
        invoiceRefundedActivity.recyclerView = (RecyclerView) c.c(view, R.id.recy_view, "field 'recyclerView'", RecyclerView.class);
        invoiceRefundedActivity.textNotFound = (TextView) c.c(view, R.id.text_not_found, "field 'textNotFound'", TextView.class);
        invoiceRefundedActivity.progress = (SpinKitView) c.c(view, R.id.progress, "field 'progress'", SpinKitView.class);
        invoiceRefundedActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        invoiceRefundedActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        InvoiceRefundedActivity invoiceRefundedActivity = this.f24738b;
        if (invoiceRefundedActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24738b = null;
        invoiceRefundedActivity.recyclerView = null;
        invoiceRefundedActivity.textNotFound = null;
        invoiceRefundedActivity.progress = null;
        invoiceRefundedActivity.time = null;
        invoiceRefundedActivity.date = null;
    }
}
