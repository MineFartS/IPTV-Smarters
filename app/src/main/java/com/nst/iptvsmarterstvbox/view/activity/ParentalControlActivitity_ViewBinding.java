package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class ParentalControlActivitity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ParentalControlActivitity f26027b;

    public ParentalControlActivitity_ViewBinding(ParentalControlActivitity parentalControlActivitity, View view) {
        this.f26027b = parentalControlActivitity;
        parentalControlActivitity.toolbar = (Toolbar) c.c(view, R.id.toolbar, "field 'toolbar'", Toolbar.class);
        parentalControlActivitity.tvHeaderTitle = (ImageView) c.c(view, R.id.tv_header_title, "field 'tvHeaderTitle'", ImageView.class);
        parentalControlActivitity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        parentalControlActivitity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        parentalControlActivitity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ParentalControlActivitity parentalControlActivitity = this.f26027b;
        if (parentalControlActivitity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26027b = null;
        parentalControlActivitity.toolbar = null;
        parentalControlActivitity.tvHeaderTitle = null;
        parentalControlActivitity.date = null;
        parentalControlActivitity.time = null;
        parentalControlActivitity.logo = null;
    }
}
