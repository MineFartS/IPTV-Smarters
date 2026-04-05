package minefarts.iptvsmarters.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class ActiveServiceActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ActiveServiceActivity f24685b;

    public ActiveServiceActivity_ViewBinding(ActiveServiceActivity activeServiceActivity, View view) {
        this.f24685b = activeServiceActivity;
        activeServiceActivity.recyclerView = (RecyclerView) c.c(view, R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        activeServiceActivity.tv_no_active_services = (TextView) c.c(view, R.id.tv_no_active_services, "field 'tv_no_active_services'", TextView.class);
        activeServiceActivity.progress = (SpinKitView) c.c(view, R.id.progress, "field 'progress'", SpinKitView.class);
        activeServiceActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        activeServiceActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        activeServiceActivity.tv_title = (TextView) c.c(view, R.id.tv_title, "field 'tv_title'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ActiveServiceActivity activeServiceActivity = this.f24685b;
        if (activeServiceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24685b = null;
        activeServiceActivity.recyclerView = null;
        activeServiceActivity.tv_no_active_services = null;
        activeServiceActivity.progress = null;
        activeServiceActivity.date = null;
        activeServiceActivity.time = null;
        activeServiceActivity.tv_title = null;
    }
}
