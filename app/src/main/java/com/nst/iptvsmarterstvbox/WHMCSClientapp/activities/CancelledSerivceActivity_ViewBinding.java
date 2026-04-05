package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.c;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class CancelledSerivceActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CancelledSerivceActivity f24705b;

    public CancelledSerivceActivity_ViewBinding(CancelledSerivceActivity cancelledSerivceActivity, View view) {
        this.f24705b = cancelledSerivceActivity;
        cancelledSerivceActivity.recyclerView = (RecyclerView) c.c(view, R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        cancelledSerivceActivity.tv_no_active_services = (TextView) c.c(view, R.id.tv_no_active_services, "field 'tv_no_active_services'", TextView.class);
        cancelledSerivceActivity.progress = (SpinKitView) c.c(view, R.id.progress, "field 'progress'", SpinKitView.class);
        cancelledSerivceActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        cancelledSerivceActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        cancelledSerivceActivity.tv_title = (TextView) c.c(view, R.id.tv_title, "field 'tv_title'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        CancelledSerivceActivity cancelledSerivceActivity = this.f24705b;
        if (cancelledSerivceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24705b = null;
        cancelledSerivceActivity.recyclerView = null;
        cancelledSerivceActivity.tv_no_active_services = null;
        cancelledSerivceActivity.progress = null;
        cancelledSerivceActivity.date = null;
        cancelledSerivceActivity.time = null;
        cancelledSerivceActivity.tv_title = null;
    }
}
