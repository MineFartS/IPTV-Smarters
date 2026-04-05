package minefarts.iptvsmarters.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class TerminatedServiceActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TerminatedServiceActivity f24889b;

    public TerminatedServiceActivity_ViewBinding(TerminatedServiceActivity terminatedServiceActivity, View view) {
        this.f24889b = terminatedServiceActivity;
        terminatedServiceActivity.recyclerView = (RecyclerView) c.c(view, R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        terminatedServiceActivity.tv_no_active_services = (TextView) c.c(view, R.id.tv_no_active_services, "field 'tv_no_active_services'", TextView.class);
        terminatedServiceActivity.progress = (SpinKitView) c.c(view, R.id.progress, "field 'progress'", SpinKitView.class);
        terminatedServiceActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        terminatedServiceActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        terminatedServiceActivity.tv_title = (TextView) c.c(view, R.id.tv_title, "field 'tv_title'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        TerminatedServiceActivity terminatedServiceActivity = this.f24889b;
        if (terminatedServiceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24889b = null;
        terminatedServiceActivity.recyclerView = null;
        terminatedServiceActivity.tv_no_active_services = null;
        terminatedServiceActivity.progress = null;
        terminatedServiceActivity.date = null;
        terminatedServiceActivity.time = null;
        terminatedServiceActivity.tv_title = null;
    }
}
