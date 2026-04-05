package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class AnnouncementsActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AnnouncementsActivity f25335b;

    public AnnouncementsActivity_ViewBinding(AnnouncementsActivity announcementsActivity, View view) {
        this.f25335b = announcementsActivity;
        announcementsActivity.recyclerView = (RecyclerView) c.c(view, R.id.my_recycler_view, "field 'recyclerView'", RecyclerView.class);
        announcementsActivity.pbLoader = (ProgressBar) c.c(view, R.id.pb_paging_loader, "field 'pbLoader'", ProgressBar.class);
        announcementsActivity.noRecord = (TextView) c.c(view, R.id.no_record, "field 'noRecord'", TextView.class);
        announcementsActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        announcementsActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        announcementsActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        AnnouncementsActivity announcementsActivity = this.f25335b;
        if (announcementsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25335b = null;
        announcementsActivity.recyclerView = null;
        announcementsActivity.pbLoader = null;
        announcementsActivity.noRecord = null;
        announcementsActivity.date = null;
        announcementsActivity.time = null;
        announcementsActivity.logo = null;
    }
}
