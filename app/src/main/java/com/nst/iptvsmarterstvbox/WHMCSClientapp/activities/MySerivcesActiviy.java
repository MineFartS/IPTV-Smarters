package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.h.a.e.e.f;
import c.h.a.h.n.e;
import com.nst.iptvsmarterstvbox.R;
import com.wang.avi.AVLoadingIndicatorView;
import java.util.Calendar;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import o.l;

/* JADX INFO: loaded from: classes2.dex */
public class MySerivcesActiviy extends a.b.k.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f24759d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f24760e = null;

    @BindView
    public LinearLayout ll_active;

    @BindView
    public LinearLayout ll_cancelled;

    @BindView
    public LinearLayout ll_fraud;

    @BindView
    public LinearLayout ll_pending;

    @BindView
    public LinearLayout ll_suspended;

    @BindView
    public LinearLayout ll_terminated;

    @BindView
    public AVLoadingIndicatorView pb_loader_active;

    @BindView
    public AVLoadingIndicatorView pb_loader_cancelled;

    @BindView
    public AVLoadingIndicatorView pb_loader_fraud;

    @BindView
    public AVLoadingIndicatorView pb_loader_pending;

    @BindView
    public AVLoadingIndicatorView pb_loader_suspended;

    @BindView
    public AVLoadingIndicatorView pb_loader_terminated;

    @BindView
    public TextView time;

    @BindView
    public TextView tv_active_count;

    @BindView
    public TextView tv_cancelled_count;

    @BindView
    public TextView tv_fraud_count;

    @BindView
    public TextView tv_pending_count;

    @BindView
    public TextView tv_suspended_count;

    @BindView
    public TextView tv_terminated_count;

    public class a implements o.d<f> {
        public a() {
        }

        @Override // o.d
        public void a(o.b<f> bVar, Throwable th) {
            MySerivcesActiviy.this.A0();
        }

        @Override // o.d
        public void b(o.b<f> bVar, l<f> lVar) {
            Context context;
            String str;
            if (!lVar.d() || lVar.a() == null) {
                context = MySerivcesActiviy.this.f24759d;
                str = BuildConfig.FLAVOR + lVar.b() + " | Error";
            } else {
                if (lVar.a().b().equalsIgnoreCase("success")) {
                    lVar.a().a();
                    throw null;
                }
                context = MySerivcesActiviy.this.f24759d;
                str = "Failed";
            }
            Toast.makeText(context, str, 0).show();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = e.C(MySerivcesActiviy.this.f24759d);
                String strQ = e.q(string);
                TextView textView = MySerivcesActiviy.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = MySerivcesActiviy.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    MySerivcesActiviy.this.z0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class d implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f24764b;

        public d(View view) {
            this.f24764b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24764b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24764b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24764b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            View view2;
            int i2;
            float f3;
            if (z) {
                Log.e("id is", BuildConfig.FLAVOR + this.f24764b.getTag());
                if (this.f24764b.getTag().equals("7")) {
                    f3 = z ? 2.0f : 1.0f;
                    b(f3);
                    c(f3);
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                b(f2);
                c(f2);
                if (this.f24764b.getTag().equals("1")) {
                    view2 = this.f24764b;
                    i2 = R.drawable.active_drawable_box_focus;
                } else if (this.f24764b.getTag().equals("2")) {
                    view2 = this.f24764b;
                    i2 = R.drawable.cancel_box_focus;
                } else if (this.f24764b.getTag().equals("3")) {
                    view2 = this.f24764b;
                    i2 = R.drawable.ticket_focus_dashboard_drawable;
                } else if (this.f24764b.getTag().equals("4")) {
                    view2 = this.f24764b;
                    i2 = R.drawable.suspended_focus_dashboard_drawable;
                } else if (this.f24764b.getTag().equals("5")) {
                    view2 = this.f24764b;
                    i2 = R.drawable.terminated_focus_dashboard_drawable;
                } else {
                    if (!this.f24764b.getTag().equals("6")) {
                        return;
                    }
                    view2 = this.f24764b;
                    i2 = R.drawable.fraud_focus_dashboard_drawable;
                }
            } else {
                if (z) {
                    return;
                }
                if (this.f24764b.getTag().equals("7")) {
                    f3 = z ? 2.0f : 1.0f;
                    b(f3);
                    c(f3);
                    a(z);
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                b(f2);
                c(f2);
                a(z);
                if (this.f24764b.getTag().equals("1")) {
                    view2 = this.f24764b;
                    i2 = R.drawable.active_drawable;
                } else if (this.f24764b.getTag().equals("2")) {
                    view2 = this.f24764b;
                    i2 = R.drawable.cancel_box;
                } else if (this.f24764b.getTag().equals("3")) {
                    view2 = this.f24764b;
                    i2 = R.drawable.ticket_dashboard_drawable;
                } else if (this.f24764b.getTag().equals("4")) {
                    view2 = this.f24764b;
                    i2 = R.drawable.suspended_dashboard_drawable;
                } else if (this.f24764b.getTag().equals("5")) {
                    view2 = this.f24764b;
                    i2 = R.drawable.terminated_dashboard_drawable;
                } else {
                    if (!this.f24764b.getTag().equals("6")) {
                        return;
                    }
                    view2 = this.f24764b;
                    i2 = R.drawable.fraud_dashboard_drawable;
                }
            }
            view2.setBackgroundResource(i2);
        }
    }

    public void A0() {
        ((c.h.a.e.d.a) c.h.a.e.d.b.a().d(c.h.a.e.d.a.class)).f("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "sitcount", "yes", c.h.a.e.b.a.a(this.f24759d)).x(new a());
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_my_serivces_activiy);
        ButterKnife.a(this);
        this.f24759d = this;
        Thread thread = this.f24760e;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new c());
            this.f24760e = thread2;
            thread2.start();
        }
        LinearLayout linearLayout = this.ll_active;
        linearLayout.setOnFocusChangeListener(new d(linearLayout));
        LinearLayout linearLayout2 = this.ll_cancelled;
        linearLayout2.setOnFocusChangeListener(new d(linearLayout2));
        LinearLayout linearLayout3 = this.ll_pending;
        linearLayout3.setOnFocusChangeListener(new d(linearLayout3));
        LinearLayout linearLayout4 = this.ll_suspended;
        linearLayout4.setOnFocusChangeListener(new d(linearLayout4));
        LinearLayout linearLayout5 = this.ll_terminated;
        linearLayout5.setOnFocusChangeListener(new d(linearLayout5));
        LinearLayout linearLayout6 = this.ll_fraud;
        linearLayout6.setOnFocusChangeListener(new d(linearLayout6));
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f24760e;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f24760e.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f24760e;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new c());
            this.f24760e = thread2;
            thread2.start();
        }
        A0();
    }

    @OnClick
    public void onclick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.ll_active /* 2131428280 */:
                intent = new Intent(this, (Class<?>) ActiveServiceActivity.class);
                break;
            case R.id.ll_cancelled /* 2131428309 */:
                intent = new Intent(this, (Class<?>) CancelledSerivceActivity.class);
                break;
            case R.id.ll_fraud /* 2131428374 */:
                intent = new Intent(this, (Class<?>) FraudServiceActivity.class);
                break;
            case R.id.ll_pending /* 2131428430 */:
                intent = new Intent(this, (Class<?>) PendingServiceActivity.class);
                break;
            case R.id.ll_suspended /* 2131428483 */:
                intent = new Intent(this, (Class<?>) SuspendedServiceActivity.class);
                break;
            case R.id.ll_terminated /* 2131428486 */:
                intent = new Intent(this, (Class<?>) TerminatedServiceActivity.class);
                break;
            default:
                return;
        }
        startActivity(intent);
    }

    public void z0() {
        runOnUiThread(new b());
    }
}
