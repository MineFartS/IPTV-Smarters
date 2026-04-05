package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class OpenTicketActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OpenTicketActivity f24806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f24807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f24808d;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ OpenTicketActivity f24809d;

        public a(OpenTicketActivity openTicketActivity) {
            this.f24809d = openTicketActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24809d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ OpenTicketActivity f24811d;

        public b(OpenTicketActivity openTicketActivity) {
            this.f24811d = openTicketActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24811d.onViewClicked(view);
        }
    }

    public OpenTicketActivity_ViewBinding(OpenTicketActivity openTicketActivity, View view) {
        this.f24806b = openTicketActivity;
        openTicketActivity.et_subject_value = (EditText) c.c(view, R.id.et_subject_value, "field 'et_subject_value'", EditText.class);
        openTicketActivity.tvDepartement = (TextView) c.c(view, R.id.tv_departement, "field 'tvDepartement'", TextView.class);
        openTicketActivity.spDepartmentValue = (Spinner) c.c(view, R.id.sp_department_value, "field 'spDepartmentValue'", Spinner.class);
        openTicketActivity.tvPriority = (TextView) c.c(view, R.id.tv_priority, "field 'tvPriority'", TextView.class);
        openTicketActivity.sp_priority = (Spinner) c.c(view, R.id.sp_priority, "field 'sp_priority'", Spinner.class);
        openTicketActivity.tvMessage = (TextView) c.c(view, R.id.tv_message, "field 'tvMessage'", TextView.class);
        openTicketActivity.etMessage = (EditText) c.c(view, R.id.et_message, "field 'etMessage'", EditText.class);
        View viewB = c.b(view, R.id.bt_submit, "field 'btSubmit' and method 'onViewClicked'");
        openTicketActivity.btSubmit = (Button) c.a(viewB, R.id.bt_submit, "field 'btSubmit'", Button.class);
        this.f24807c = viewB;
        viewB.setOnClickListener(new a(openTicketActivity));
        View viewB2 = c.b(view, R.id.bt_close, "field 'bt_close' and method 'onViewClicked'");
        openTicketActivity.bt_close = (Button) c.a(viewB2, R.id.bt_close, "field 'bt_close'", Button.class);
        this.f24808d = viewB2;
        viewB2.setOnClickListener(new b(openTicketActivity));
        openTicketActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        openTicketActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        OpenTicketActivity openTicketActivity = this.f24806b;
        if (openTicketActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24806b = null;
        openTicketActivity.et_subject_value = null;
        openTicketActivity.tvDepartement = null;
        openTicketActivity.spDepartmentValue = null;
        openTicketActivity.tvPriority = null;
        openTicketActivity.sp_priority = null;
        openTicketActivity.tvMessage = null;
        openTicketActivity.etMessage = null;
        openTicketActivity.btSubmit = null;
        openTicketActivity.bt_close = null;
        openTicketActivity.time = null;
        openTicketActivity.date = null;
        this.f24807c.setOnClickListener(null);
        this.f24807c = null;
        this.f24808d.setOnClickListener(null);
        this.f24808d = null;
    }
}
