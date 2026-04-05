package com.nst.iptvsmarterstvbox.WHMCSClientapp.adapters;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class TicketAdapter$MyViewHolder_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TicketAdapter$MyViewHolder f24916b;

    public TicketAdapter$MyViewHolder_ViewBinding(TicketAdapter$MyViewHolder ticketAdapter$MyViewHolder, View view) {
        this.f24916b = ticketAdapter$MyViewHolder;
        ticketAdapter$MyViewHolder.tvDepartmentName = (TextView) c.c(view, R.id.tv_department_name, "field 'tvDepartmentName'", TextView.class);
        ticketAdapter$MyViewHolder.tvStatus = (TextView) c.c(view, R.id.tv_status, "field 'tvStatus'", TextView.class);
        ticketAdapter$MyViewHolder.tvStatusValue = (TextView) c.c(view, R.id.tv_status_value, "field 'tvStatusValue'", TextView.class);
        ticketAdapter$MyViewHolder.tvLastUpdated = (TextView) c.c(view, R.id.tv_last_updated, "field 'tvLastUpdated'", TextView.class);
        ticketAdapter$MyViewHolder.tvLastUpdatedValue = (TextView) c.c(view, R.id.tv_last_updated_value, "field 'tvLastUpdatedValue'", TextView.class);
        ticketAdapter$MyViewHolder.llOuter = (LinearLayout) c.c(view, R.id.ll_outer, "field 'llOuter'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        TicketAdapter$MyViewHolder ticketAdapter$MyViewHolder = this.f24916b;
        if (ticketAdapter$MyViewHolder == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24916b = null;
        ticketAdapter$MyViewHolder.tvDepartmentName = null;
        ticketAdapter$MyViewHolder.tvStatus = null;
        ticketAdapter$MyViewHolder.tvStatusValue = null;
        ticketAdapter$MyViewHolder.tvLastUpdated = null;
        ticketAdapter$MyViewHolder.tvLastUpdatedValue = null;
        ticketAdapter$MyViewHolder.llOuter = null;
    }
}
