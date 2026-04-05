package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class PendingServiceActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PendingServiceActivity f24821b;

    public PendingServiceActivity_ViewBinding(PendingServiceActivity pendingServiceActivity, View view) {
        this.f24821b = pendingServiceActivity;
        pendingServiceActivity.recyclerView = (RecyclerView) c.c(view, R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        pendingServiceActivity.tv_no_active_services = (TextView) c.c(view, R.id.tv_no_active_services, "field 'tv_no_active_services'", TextView.class);
        pendingServiceActivity.progress = (SpinKitView) c.c(view, R.id.progress, "field 'progress'", SpinKitView.class);
        pendingServiceActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        pendingServiceActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        pendingServiceActivity.tv_title = (TextView) c.c(view, R.id.tv_title, "field 'tv_title'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        PendingServiceActivity pendingServiceActivity = this.f24821b;
        if (pendingServiceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24821b = null;
        pendingServiceActivity.recyclerView = null;
        pendingServiceActivity.tv_no_active_services = null;
        pendingServiceActivity.progress = null;
        pendingServiceActivity.date = null;
        pendingServiceActivity.time = null;
        pendingServiceActivity.tv_title = null;
    }
}
