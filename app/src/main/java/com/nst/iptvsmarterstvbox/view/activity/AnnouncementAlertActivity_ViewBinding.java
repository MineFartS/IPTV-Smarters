package minefarts.iptvsmarters.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import b.c.c;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class AnnouncementAlertActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AnnouncementAlertActivity f25324b;

    public AnnouncementAlertActivity_ViewBinding(AnnouncementAlertActivity announcementAlertActivity, View view) {
        this.f25324b = announcementAlertActivity;
        announcementAlertActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        announcementAlertActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        announcementAlertActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        AnnouncementAlertActivity announcementAlertActivity = this.f25324b;
        if (announcementAlertActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f25324b = null;
        announcementAlertActivity.date = null;
        announcementAlertActivity.time = null;
        announcementAlertActivity.logo = null;
    }
}
