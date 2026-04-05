package minefarts.iptvsmarters.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class SuspendedServiceActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SuspendedServiceActivity f24884b;

    public SuspendedServiceActivity_ViewBinding(SuspendedServiceActivity suspendedServiceActivity, View view) {
        this.f24884b = suspendedServiceActivity;
        suspendedServiceActivity.recyclerView = (RecyclerView) c.c(view, R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        suspendedServiceActivity.tv_no_active_services = (TextView) c.c(view, R.id.tv_no_active_services, "field 'tv_no_active_services'", TextView.class);
        suspendedServiceActivity.progress = (SpinKitView) c.c(view, R.id.progress, "field 'progress'", SpinKitView.class);
        suspendedServiceActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        suspendedServiceActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        suspendedServiceActivity.tv_title = (TextView) c.c(view, R.id.tv_title, "field 'tv_title'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        SuspendedServiceActivity suspendedServiceActivity = this.f24884b;
        if (suspendedServiceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24884b = null;
        suspendedServiceActivity.recyclerView = null;
        suspendedServiceActivity.tv_no_active_services = null;
        suspendedServiceActivity.progress = null;
        suspendedServiceActivity.date = null;
        suspendedServiceActivity.time = null;
        suspendedServiceActivity.tv_title = null;
    }
}
