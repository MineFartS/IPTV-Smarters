package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class RateUsActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RateUsActivity f26150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f26151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f26152d;

    public class a extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RateUsActivity f26153d;

        public a(RateUsActivity rateUsActivity) {
            this.f26153d = rateUsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26153d.onViewClicked(view);
        }
    }

    public class b extends b.c.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RateUsActivity f26155d;

        public b(RateUsActivity rateUsActivity) {
            this.f26155d = rateUsActivity;
        }

        @Override // b.c.b
        public void a(View view) {
            this.f26155d.onViewClicked(view);
        }
    }

    public RateUsActivity_ViewBinding(RateUsActivity rateUsActivity, View view) {
        this.f26150b = rateUsActivity;
        View viewB = c.b(view, R.id.btn_rateus, "field 'btn_rateus' and method 'onViewClicked'");
        rateUsActivity.btn_rateus = (Button) c.a(viewB, R.id.btn_rateus, "field 'btn_rateus'", Button.class);
        this.f26151c = viewB;
        viewB.setOnClickListener(new a(rateUsActivity));
        View viewB2 = c.b(view, R.id.btn_later, "field 'btn_later' and method 'onViewClicked'");
        rateUsActivity.btn_later = (Button) c.a(viewB2, R.id.btn_later, "field 'btn_later'", Button.class);
        this.f26152d = viewB2;
        viewB2.setOnClickListener(new b(rateUsActivity));
        rateUsActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        rateUsActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        rateUsActivity.logo = (ImageView) c.c(view, R.id.logo, "field 'logo'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        RateUsActivity rateUsActivity = this.f26150b;
        if (rateUsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26150b = null;
        rateUsActivity.btn_rateus = null;
        rateUsActivity.btn_later = null;
        rateUsActivity.date = null;
        rateUsActivity.time = null;
        rateUsActivity.logo = null;
        this.f26151c.setOnClickListener(null);
        this.f26151c = null;
        this.f26152d.setOnClickListener(null);
        this.f26152d = null;
    }
}
