package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.c.b;
import b.c.c;
import butterknife.Unbinder;
import com.github.ybq.android.spinkit.SpinKitView;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class MyTicketActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MyTicketActivity f24790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f24791c;

    public class a extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MyTicketActivity f24792d;

        public a(MyTicketActivity myTicketActivity) {
            this.f24792d = myTicketActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24792d.onViewClicked();
        }
    }

    public MyTicketActivity_ViewBinding(MyTicketActivity myTicketActivity, View view) {
        this.f24790b = myTicketActivity;
        myTicketActivity.recyclerView = (RecyclerView) c.c(view, R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
        View viewB = c.b(view, R.id.iv_fab, "field 'iv_fab' and method 'onViewClicked'");
        myTicketActivity.iv_fab = (ImageView) c.a(viewB, R.id.iv_fab, "field 'iv_fab'", ImageView.class);
        this.f24791c = viewB;
        viewB.setOnClickListener(new a(myTicketActivity));
        myTicketActivity.tvNoSupportTicket = (TextView) c.c(view, R.id.tv_no_support_ticket, "field 'tvNoSupportTicket'", TextView.class);
        myTicketActivity.llRecycleview = (LinearLayout) c.c(view, R.id.ll_recycleview, "field 'llRecycleview'", LinearLayout.class);
        myTicketActivity.llFloatingButton = (LinearLayout) c.c(view, R.id.ll_floating_button, "field 'llFloatingButton'", LinearLayout.class);
        myTicketActivity.progress = (SpinKitView) c.c(view, R.id.progress, "field 'progress'", SpinKitView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        MyTicketActivity myTicketActivity = this.f24790b;
        if (myTicketActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24790b = null;
        myTicketActivity.recyclerView = null;
        myTicketActivity.iv_fab = null;
        myTicketActivity.tvNoSupportTicket = null;
        myTicketActivity.llRecycleview = null;
        myTicketActivity.llFloatingButton = null;
        myTicketActivity.progress = null;
        this.f24791c.setOnClickListener(null);
        this.f24791c = null;
    }
}
