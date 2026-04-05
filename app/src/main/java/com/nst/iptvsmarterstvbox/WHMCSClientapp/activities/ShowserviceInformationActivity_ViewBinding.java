package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class ShowserviceInformationActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ShowserviceInformationActivity f24879b;

    public ShowserviceInformationActivity_ViewBinding(ShowserviceInformationActivity showserviceInformationActivity, View view) {
        this.f24879b = showserviceInformationActivity;
        showserviceInformationActivity.tv_title = (TextView) c.c(view, R.id.tv_title, "field 'tv_title'", TextView.class);
        showserviceInformationActivity.tv_product = (TextView) c.c(view, R.id.tv_product, "field 'tv_product'", TextView.class);
        showserviceInformationActivity.tv_status = (TextView) c.c(view, R.id.tv_status, "field 'tv_status'", TextView.class);
        showserviceInformationActivity.tv_registration_date = (TextView) c.c(view, R.id.tv_registration_date, "field 'tv_registration_date'", TextView.class);
        showserviceInformationActivity.tv_next_due_date = (TextView) c.c(view, R.id.tv_next_due_date, "field 'tv_next_due_date'", TextView.class);
        showserviceInformationActivity.tv_recurring_amount = (TextView) c.c(view, R.id.tv_recurring_amount, "field 'tv_recurring_amount'", TextView.class);
        showserviceInformationActivity.tv_billing_cycle = (TextView) c.c(view, R.id.tv_billing_cycle, "field 'tv_billing_cycle'", TextView.class);
        showserviceInformationActivity.tv_payment_method = (TextView) c.c(view, R.id.tv_payment_method, "field 'tv_payment_method'", TextView.class);
        showserviceInformationActivity.tv_first_time_payment = (TextView) c.c(view, R.id.tv_first_time_payment, "field 'tv_first_time_payment'", TextView.class);
        showserviceInformationActivity.btn_back = (Button) c.c(view, R.id.btn_back, "field 'btn_back'", Button.class);
        showserviceInformationActivity.btn_service_home = (Button) c.c(view, R.id.btn_service_home, "field 'btn_service_home'", Button.class);
        showserviceInformationActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        showserviceInformationActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ShowserviceInformationActivity showserviceInformationActivity = this.f24879b;
        if (showserviceInformationActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24879b = null;
        showserviceInformationActivity.tv_title = null;
        showserviceInformationActivity.tv_product = null;
        showserviceInformationActivity.tv_status = null;
        showserviceInformationActivity.tv_registration_date = null;
        showserviceInformationActivity.tv_next_due_date = null;
        showserviceInformationActivity.tv_recurring_amount = null;
        showserviceInformationActivity.tv_billing_cycle = null;
        showserviceInformationActivity.tv_payment_method = null;
        showserviceInformationActivity.tv_first_time_payment = null;
        showserviceInformationActivity.btn_back = null;
        showserviceInformationActivity.btn_service_home = null;
        showserviceInformationActivity.date = null;
        showserviceInformationActivity.time = null;
    }
}
