package minefarts.iptvsmarters.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class UnpiadInvoiceActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UnpiadInvoiceActivity f24893b;

    public UnpiadInvoiceActivity_ViewBinding(UnpiadInvoiceActivity unpiadInvoiceActivity, View view) {
        this.f24893b = unpiadInvoiceActivity;
        unpiadInvoiceActivity.noRecordFound = (TextView) c.c(view, R.id.no_record_found, "field 'noRecordFound'", TextView.class);
        unpiadInvoiceActivity.recyclerView = (RecyclerView) c.c(view, R.id.recyl_view, "field 'recyclerView'", RecyclerView.class);
        unpiadInvoiceActivity.progress = (SpinKitView) c.c(view, R.id.progress, "field 'progress'", SpinKitView.class);
        unpiadInvoiceActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        unpiadInvoiceActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        UnpiadInvoiceActivity unpiadInvoiceActivity = this.f24893b;
        if (unpiadInvoiceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24893b = null;
        unpiadInvoiceActivity.noRecordFound = null;
        unpiadInvoiceActivity.recyclerView = null;
        unpiadInvoiceActivity.progress = null;
        unpiadInvoiceActivity.time = null;
        unpiadInvoiceActivity.date = null;
    }
}
