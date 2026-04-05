package minefarts.iptvsmarters.WHMCSClientapp.activities;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;
import com.wang.avi.AVLoadingIndicatorView;

/* JADX INFO: loaded from: classes2.dex */
public class ServicesDashboardActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ServicesDashboardActivity f24840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f24841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f24842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f24843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f24844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f24845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f24846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f24847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f24848j;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ServicesDashboardActivity f24849d;

        public a(ServicesDashboardActivity servicesDashboardActivity) {
            this.f24849d = servicesDashboardActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24849d.onclick(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ServicesDashboardActivity f24851d;

        public b(ServicesDashboardActivity servicesDashboardActivity) {
            this.f24851d = servicesDashboardActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24851d.onclick(view);
        }
    }

    public class c extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ServicesDashboardActivity f24853d;

        public c(ServicesDashboardActivity servicesDashboardActivity) {
            this.f24853d = servicesDashboardActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24853d.onclick(view);
        }
    }

    public class d extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ServicesDashboardActivity f24855d;

        public d(ServicesDashboardActivity servicesDashboardActivity) {
            this.f24855d = servicesDashboardActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24855d.onclick(view);
        }
    }

    public class e extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ServicesDashboardActivity f24857d;

        public e(ServicesDashboardActivity servicesDashboardActivity) {
            this.f24857d = servicesDashboardActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24857d.onclick(view);
        }
    }

    public class f extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ServicesDashboardActivity f24859d;

        public f(ServicesDashboardActivity servicesDashboardActivity) {
            this.f24859d = servicesDashboardActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24859d.onclick(view);
        }
    }

    public class g extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ServicesDashboardActivity f24861d;

        public g(ServicesDashboardActivity servicesDashboardActivity) {
            this.f24861d = servicesDashboardActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24861d.onclick(view);
        }
    }

    public class h extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ServicesDashboardActivity f24863d;

        public h(ServicesDashboardActivity servicesDashboardActivity) {
            this.f24863d = servicesDashboardActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24863d.onclick(view);
        }
    }

    public ServicesDashboardActivity_ViewBinding(ServicesDashboardActivity servicesDashboardActivity, View view) {
        this.f24840b = servicesDashboardActivity;
        servicesDashboardActivity.date = (TextView) b.c.c.c(view, R.id.date, "field 'date'", TextView.class);
        servicesDashboardActivity.time = (TextView) b.c.c.c(view, R.id.time, "field 'time'", TextView.class);
        servicesDashboardActivity.pb_loader_service = (AVLoadingIndicatorView) b.c.c.c(view, R.id.pb_loader_service, "field 'pb_loader_service'", AVLoadingIndicatorView.class);
        servicesDashboardActivity.pb_loader_invoice = (AVLoadingIndicatorView) b.c.c.c(view, R.id.pb_loader_invoice, "field 'pb_loader_invoice'", AVLoadingIndicatorView.class);
        servicesDashboardActivity.pb_loader_ticket = (AVLoadingIndicatorView) b.c.c.c(view, R.id.pb_loader_ticket, "field 'pb_loader_ticket'", AVLoadingIndicatorView.class);
        servicesDashboardActivity.tv_service_count = (TextView) b.c.c.c(view, R.id.tv_service_count, "field 'tv_service_count'", TextView.class);
        servicesDashboardActivity.tv_invoice_count = (TextView) b.c.c.c(view, R.id.tv_invoice_count, "field 'tv_invoice_count'", TextView.class);
        servicesDashboardActivity.tv_ticket_count = (TextView) b.c.c.c(view, R.id.tv_ticket_count, "field 'tv_ticket_count'", TextView.class);
        View viewB = b.c.c.b(view, R.id.iv_settings, "field 'iv_settings' and method 'onclick'");
        servicesDashboardActivity.iv_settings = (ImageView) b.c.c.a(viewB, R.id.iv_settings, "field 'iv_settings'", ImageView.class);
        this.f24841c = viewB;
        viewB.setOnClickListener(new a(servicesDashboardActivity));
        View viewB2 = b.c.c.b(view, R.id.switch_user, "field 'ivSwitchUser' and method 'onclick'");
        servicesDashboardActivity.ivSwitchUser = (ImageView) b.c.c.a(viewB2, R.id.switch_user, "field 'ivSwitchUser'", ImageView.class);
        this.f24842d = viewB2;
        viewB2.setOnClickListener(new b(servicesDashboardActivity));
        View viewB3 = b.c.c.b(view, R.id.iv_notification, "field 'iv_notification' and method 'onclick'");
        servicesDashboardActivity.iv_notification = (ImageView) b.c.c.a(viewB3, R.id.iv_notification, "field 'iv_notification'", ImageView.class);
        this.f24843e = viewB3;
        viewB3.setOnClickListener(new c(servicesDashboardActivity));
        servicesDashboardActivity.tv_notification = (TextView) b.c.c.c(view, R.id.tv_notification, "field 'tv_notification'", TextView.class);
        View viewB4 = b.c.c.b(view, R.id.account_info, "field 'account_info' and method 'onclick'");
        servicesDashboardActivity.account_info = (ImageView) b.c.c.a(viewB4, R.id.account_info, "field 'account_info'", ImageView.class);
        this.f24844f = viewB4;
        viewB4.setOnClickListener(new d(servicesDashboardActivity));
        servicesDashboardActivity.tvAccountinfoButton = (TextView) b.c.c.c(view, R.id.tv_account_info_button, "field 'tvAccountinfoButton'", TextView.class);
        View viewB5 = b.c.c.b(view, R.id.ll_services, "field 'll_services' and method 'onclick'");
        servicesDashboardActivity.ll_services = (LinearLayout) b.c.c.a(viewB5, R.id.ll_services, "field 'll_services'", LinearLayout.class);
        this.f24845g = viewB5;
        viewB5.setOnClickListener(new e(servicesDashboardActivity));
        View viewB6 = b.c.c.b(view, R.id.ll_invoices, "field 'll_invoices' and method 'onclick'");
        servicesDashboardActivity.ll_invoices = (LinearLayout) b.c.c.a(viewB6, R.id.ll_invoices, "field 'll_invoices'", LinearLayout.class);
        this.f24846h = viewB6;
        viewB6.setOnClickListener(new f(servicesDashboardActivity));
        View viewB7 = b.c.c.b(view, R.id.ll_tickets, "field 'll_tickets' and method 'onclick'");
        servicesDashboardActivity.ll_tickets = (LinearLayout) b.c.c.a(viewB7, R.id.ll_tickets, "field 'll_tickets'", LinearLayout.class);
        this.f24847i = viewB7;
        viewB7.setOnClickListener(new g(servicesDashboardActivity));
        servicesDashboardActivity.ll_buy_now = (LinearLayout) b.c.c.c(view, R.id.ll_buy_now, "field 'll_buy_now'", LinearLayout.class);
        servicesDashboardActivity.tv_freetrai_time = (TextView) b.c.c.c(view, R.id.tv_freetrai_time, "field 'tv_freetrai_time'", TextView.class);
        servicesDashboardActivity.tv_free_trial_title = (TextView) b.c.c.c(view, R.id.tv_free_trial_title, "field 'tv_free_trial_title'", TextView.class);
        View viewB8 = b.c.c.b(view, R.id.btn_buy_now, "field 'btn_buy_now' and method 'onclick'");
        servicesDashboardActivity.btn_buy_now = (Button) b.c.c.a(viewB8, R.id.btn_buy_now, "field 'btn_buy_now'", Button.class);
        this.f24848j = viewB8;
        viewB8.setOnClickListener(new h(servicesDashboardActivity));
        servicesDashboardActivity.tvSwitchUserButton = (TextView) b.c.c.c(view, R.id.tv_switch_user_button, "field 'tvSwitchUserButton'", TextView.class);
        servicesDashboardActivity.tvSettingsButton = (TextView) b.c.c.c(view, R.id.tv_settings_button, "field 'tvSettingsButton'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        ServicesDashboardActivity servicesDashboardActivity = this.f24840b;
        if (servicesDashboardActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24840b = null;
        servicesDashboardActivity.date = null;
        servicesDashboardActivity.time = null;
        servicesDashboardActivity.pb_loader_service = null;
        servicesDashboardActivity.pb_loader_invoice = null;
        servicesDashboardActivity.pb_loader_ticket = null;
        servicesDashboardActivity.tv_service_count = null;
        servicesDashboardActivity.tv_invoice_count = null;
        servicesDashboardActivity.tv_ticket_count = null;
        servicesDashboardActivity.iv_settings = null;
        servicesDashboardActivity.ivSwitchUser = null;
        servicesDashboardActivity.iv_notification = null;
        servicesDashboardActivity.tv_notification = null;
        servicesDashboardActivity.account_info = null;
        servicesDashboardActivity.tvAccountinfoButton = null;
        servicesDashboardActivity.ll_services = null;
        servicesDashboardActivity.ll_invoices = null;
        servicesDashboardActivity.ll_tickets = null;
        servicesDashboardActivity.ll_buy_now = null;
        servicesDashboardActivity.tv_freetrai_time = null;
        servicesDashboardActivity.tv_free_trial_title = null;
        servicesDashboardActivity.btn_buy_now = null;
        servicesDashboardActivity.tvSwitchUserButton = null;
        servicesDashboardActivity.tvSettingsButton = null;
        this.f24841c.setOnClickListener(null);
        this.f24841c = null;
        this.f24842d.setOnClickListener(null);
        this.f24842d = null;
        this.f24843e.setOnClickListener(null);
        this.f24843e = null;
        this.f24844f.setOnClickListener(null);
        this.f24844f = null;
        this.f24845g.setOnClickListener(null);
        this.f24845g = null;
        this.f24846h.setOnClickListener(null);
        this.f24846h = null;
        this.f24847i.setOnClickListener(null);
        this.f24847i = null;
        this.f24848j.setOnClickListener(null);
        this.f24848j = null;
    }
}
