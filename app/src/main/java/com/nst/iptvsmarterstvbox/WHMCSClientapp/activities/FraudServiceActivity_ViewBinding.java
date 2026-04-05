package minefarts.iptvsmarters.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class FraudServiceActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FraudServiceActivity f24710b;

    public FraudServiceActivity_ViewBinding(FraudServiceActivity fraudServiceActivity, View view) {
        this.f24710b = fraudServiceActivity;
        fraudServiceActivity.recyclerView = (RecyclerView) c.c(view, R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        fraudServiceActivity.tv_no_active_services = (TextView) c.c(view, R.id.tv_no_active_services, "field 'tv_no_active_services'", TextView.class);
        fraudServiceActivity.progress = (SpinKitView) c.c(view, R.id.progress, "field 'progress'", SpinKitView.class);
        fraudServiceActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        fraudServiceActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        fraudServiceActivity.tv_title = (TextView) c.c(view, R.id.tv_title, "field 'tv_title'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        FraudServiceActivity fraudServiceActivity = this.f24710b;
        if (fraudServiceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24710b = null;
        fraudServiceActivity.recyclerView = null;
        fraudServiceActivity.tv_no_active_services = null;
        fraudServiceActivity.progress = null;
        fraudServiceActivity.date = null;
        fraudServiceActivity.time = null;
        fraudServiceActivity.tv_title = null;
    }
}
