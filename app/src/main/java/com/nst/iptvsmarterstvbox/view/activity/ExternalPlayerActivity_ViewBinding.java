package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class ExternalPlayerActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ExternalPlayerActivity f25615b;

    public ExternalPlayerActivity_ViewBinding(ExternalPlayerActivity externalPlayerActivity, View view) {
        this.f25615b = externalPlayerActivity;
        externalPlayerActivity.ll_progressbar = (LinearLayout) c.c(view, R.id.ll_progressbar, "field 'll_progressbar'", LinearLayout.class);
        externalPlayerActivity.ll_no_data_found = (LinearLayout) c.c(view, R.id.ll_no_data_found, "field 'll_no_data_found'", LinearLayout.class);
        externalPlayerActivity.recyclerView = (RecyclerView) c.c(view, R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        externalPlayerActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        externalPlayerActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        externalPlayerActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ExternalPlayerActivity externalPlayerActivity = this.f25615b;
        if (externalPlayerActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25615b = null;
        externalPlayerActivity.ll_progressbar = null;
        externalPlayerActivity.ll_no_data_found = null;
        externalPlayerActivity.recyclerView = null;
        externalPlayerActivity.date = null;
        externalPlayerActivity.time = null;
        externalPlayerActivity.logo = null;
    }
}
