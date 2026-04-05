package minefarts.iptvsmarters.WHMCSClientapp.activities;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;
import com.wang.avi.AVLoadingIndicatorView;

/* JADX INFO: loaded from: classes2.dex */
public class MySerivcesActiviy_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MySerivcesActiviy f24766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f24767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f24768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f24769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f24770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f24771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f24772h;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MySerivcesActiviy f24773d;

        public a(MySerivcesActiviy mySerivcesActiviy) {
            this.f24773d = mySerivcesActiviy;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24773d.onclick(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MySerivcesActiviy f24775d;

        public b(MySerivcesActiviy mySerivcesActiviy) {
            this.f24775d = mySerivcesActiviy;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24775d.onclick(view);
        }
    }

    public class c extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MySerivcesActiviy f24777d;

        public c(MySerivcesActiviy mySerivcesActiviy) {
            this.f24777d = mySerivcesActiviy;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24777d.onclick(view);
        }
    }

    public class d extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MySerivcesActiviy f24779d;

        public d(MySerivcesActiviy mySerivcesActiviy) {
            this.f24779d = mySerivcesActiviy;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24779d.onclick(view);
        }
    }

    public class e extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MySerivcesActiviy f24781d;

        public e(MySerivcesActiviy mySerivcesActiviy) {
            this.f24781d = mySerivcesActiviy;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24781d.onclick(view);
        }
    }

    public class f extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MySerivcesActiviy f24783d;

        public f(MySerivcesActiviy mySerivcesActiviy) {
            this.f24783d = mySerivcesActiviy;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f24783d.onclick(view);
        }
    }

    public MySerivcesActiviy_ViewBinding(MySerivcesActiviy mySerivcesActiviy, View view) {
        this.f24766b = mySerivcesActiviy;
        mySerivcesActiviy.date = (TextView) b.c.c.c(view, R.id.date, "field 'date'", TextView.class);
        mySerivcesActiviy.time = (TextView) b.c.c.c(view, R.id.time, "field 'time'", TextView.class);
        View viewB = b.c.c.b(view, R.id.ll_active, "field 'll_active' and method 'onclick'");
        mySerivcesActiviy.ll_active = (LinearLayout) b.c.c.a(viewB, R.id.ll_active, "field 'll_active'", LinearLayout.class);
        this.f24767c = viewB;
        viewB.setOnClickListener(new a(mySerivcesActiviy));
        View viewB2 = b.c.c.b(view, R.id.ll_cancelled, "field 'll_cancelled' and method 'onclick'");
        mySerivcesActiviy.ll_cancelled = (LinearLayout) b.c.c.a(viewB2, R.id.ll_cancelled, "field 'll_cancelled'", LinearLayout.class);
        this.f24768d = viewB2;
        viewB2.setOnClickListener(new b(mySerivcesActiviy));
        View viewB3 = b.c.c.b(view, R.id.ll_pending, "field 'll_pending' and method 'onclick'");
        mySerivcesActiviy.ll_pending = (LinearLayout) b.c.c.a(viewB3, R.id.ll_pending, "field 'll_pending'", LinearLayout.class);
        this.f24769e = viewB3;
        viewB3.setOnClickListener(new c(mySerivcesActiviy));
        View viewB4 = b.c.c.b(view, R.id.ll_suspended, "field 'll_suspended' and method 'onclick'");
        mySerivcesActiviy.ll_suspended = (LinearLayout) b.c.c.a(viewB4, R.id.ll_suspended, "field 'll_suspended'", LinearLayout.class);
        this.f24770f = viewB4;
        viewB4.setOnClickListener(new d(mySerivcesActiviy));
        View viewB5 = b.c.c.b(view, R.id.ll_terminated, "field 'll_terminated' and method 'onclick'");
        mySerivcesActiviy.ll_terminated = (LinearLayout) b.c.c.a(viewB5, R.id.ll_terminated, "field 'll_terminated'", LinearLayout.class);
        this.f24771g = viewB5;
        viewB5.setOnClickListener(new e(mySerivcesActiviy));
        View viewB6 = b.c.c.b(view, R.id.ll_fraud, "field 'll_fraud' and method 'onclick'");
        mySerivcesActiviy.ll_fraud = (LinearLayout) b.c.c.a(viewB6, R.id.ll_fraud, "field 'll_fraud'", LinearLayout.class);
        this.f24772h = viewB6;
        viewB6.setOnClickListener(new f(mySerivcesActiviy));
        mySerivcesActiviy.pb_loader_pending = (AVLoadingIndicatorView) b.c.c.c(view, R.id.pb_loader_pending, "field 'pb_loader_pending'", AVLoadingIndicatorView.class);
        mySerivcesActiviy.pb_loader_active = (AVLoadingIndicatorView) b.c.c.c(view, R.id.pb_loader_active, "field 'pb_loader_active'", AVLoadingIndicatorView.class);
        mySerivcesActiviy.pb_loader_cancelled = (AVLoadingIndicatorView) b.c.c.c(view, R.id.pb_loader_cancelled, "field 'pb_loader_cancelled'", AVLoadingIndicatorView.class);
        mySerivcesActiviy.pb_loader_suspended = (AVLoadingIndicatorView) b.c.c.c(view, R.id.pb_loader_suspended, "field 'pb_loader_suspended'", AVLoadingIndicatorView.class);
        mySerivcesActiviy.pb_loader_terminated = (AVLoadingIndicatorView) b.c.c.c(view, R.id.pb_loader_terminated, "field 'pb_loader_terminated'", AVLoadingIndicatorView.class);
        mySerivcesActiviy.pb_loader_fraud = (AVLoadingIndicatorView) b.c.c.c(view, R.id.pb_loader_fraud, "field 'pb_loader_fraud'", AVLoadingIndicatorView.class);
        mySerivcesActiviy.tv_active_count = (TextView) b.c.c.c(view, R.id.tv_active_count, "field 'tv_active_count'", TextView.class);
        mySerivcesActiviy.tv_cancelled_count = (TextView) b.c.c.c(view, R.id.tv_cancelled_count, "field 'tv_cancelled_count'", TextView.class);
        mySerivcesActiviy.tv_pending_count = (TextView) b.c.c.c(view, R.id.tv_pending_count, "field 'tv_pending_count'", TextView.class);
        mySerivcesActiviy.tv_suspended_count = (TextView) b.c.c.c(view, R.id.tv_suspended_count, "field 'tv_suspended_count'", TextView.class);
        mySerivcesActiviy.tv_terminated_count = (TextView) b.c.c.c(view, R.id.tv_terminated_count, "field 'tv_terminated_count'", TextView.class);
        mySerivcesActiviy.tv_fraud_count = (TextView) b.c.c.c(view, R.id.tv_fraud_count, "field 'tv_fraud_count'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        MySerivcesActiviy mySerivcesActiviy = this.f24766b;
        if (mySerivcesActiviy == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24766b = null;
        mySerivcesActiviy.date = null;
        mySerivcesActiviy.time = null;
        mySerivcesActiviy.ll_active = null;
        mySerivcesActiviy.ll_cancelled = null;
        mySerivcesActiviy.ll_pending = null;
        mySerivcesActiviy.ll_suspended = null;
        mySerivcesActiviy.ll_terminated = null;
        mySerivcesActiviy.ll_fraud = null;
        mySerivcesActiviy.pb_loader_pending = null;
        mySerivcesActiviy.pb_loader_active = null;
        mySerivcesActiviy.pb_loader_cancelled = null;
        mySerivcesActiviy.pb_loader_suspended = null;
        mySerivcesActiviy.pb_loader_terminated = null;
        mySerivcesActiviy.pb_loader_fraud = null;
        mySerivcesActiviy.tv_active_count = null;
        mySerivcesActiviy.tv_cancelled_count = null;
        mySerivcesActiviy.tv_pending_count = null;
        mySerivcesActiviy.tv_suspended_count = null;
        mySerivcesActiviy.tv_terminated_count = null;
        mySerivcesActiviy.tv_fraud_count = null;
        this.f24767c.setOnClickListener(null);
        this.f24767c = null;
        this.f24768d.setOnClickListener(null);
        this.f24768d = null;
        this.f24769e.setOnClickListener(null);
        this.f24769e = null;
        this.f24770f.setOnClickListener(null);
        this.f24770f = null;
        this.f24771g.setOnClickListener(null);
        this.f24771g = null;
        this.f24772h.setOnClickListener(null);
        this.f24772h = null;
    }
}
