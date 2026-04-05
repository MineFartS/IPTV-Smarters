package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import android.animation.ObjectAnimator;
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
import o.d;
import o.l;

/* JADX INFO: loaded from: classes2.dex */
public class MyInvoiceActivity extends a.b.k.c {

    @BindView
    public LinearLayout cancel_box;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f24739d;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f24740e = null;

    @BindView
    public AVLoadingIndicatorView loader_show;

    @BindView
    public AVLoadingIndicatorView loader_showcnl;

    @BindView
    public AVLoadingIndicatorView loader_showrf;

    @BindView
    public AVLoadingIndicatorView loader_showup;

    @BindView
    public LinearLayout paid_box;

    @BindView
    public LinearLayout refound_box;

    @BindView
    public TextView sow_cnl;

    @BindView
    public TextView sow_no;

    @BindView
    public TextView sow_rf;

    @BindView
    public TextView sow_up;

    @BindView
    public TextView time;

    @BindView
    public LinearLayout unpaid_box;

    public class a implements d<f> {
        public a() {
        }

        @Override // o.d
        public void a(o.b<f> bVar, Throwable th) {
            MyInvoiceActivity.this.paid_box.setVisibility(8);
            MyInvoiceActivity.this.cancel_box.setVisibility(8);
            MyInvoiceActivity.this.refound_box.setVisibility(8);
            MyInvoiceActivity.this.unpaid_box.setVisibility(8);
            Toast.makeText(MyInvoiceActivity.this.f24739d, "No Response from server", 0).show();
        }

        @Override // o.d
        public void b(o.b<f> bVar, l<f> lVar) {
            if (lVar.a() != null && lVar.d()) {
                lVar.a().a();
                throw null;
            }
            Toast.makeText(MyInvoiceActivity.this.f24739d, BuildConfig.FLAVOR + lVar.b() + " | Error", 0).show();
        }
    }

    public class b implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    String string = Calendar.getInstance().getTime().toString();
                    String strC = e.C(MyInvoiceActivity.this.f24739d);
                    String strQ = e.q(string);
                    TextView textView = MyInvoiceActivity.this.time;
                    if (textView != null) {
                        textView.setText(strC);
                    }
                    TextView textView2 = MyInvoiceActivity.this.date;
                    if (textView2 != null) {
                        textView2.setText(strQ);
                    }
                } catch (Exception unused) {
                }
            }
        }

        public b() {
        }

        public final void a() {
            MyInvoiceActivity.this.runOnUiThread(new a());
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    a();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public class c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f24744b;

        public c(View view) {
            this.f24744b = view;
        }

        public void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24744b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24744b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24744b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (z) {
                Log.e("id is", BuildConfig.FLAVOR + this.f24744b.getTag());
                if (this.f24744b.getTag().equals("7")) {
                    float f2 = z ? 2.0f : 1.0f;
                    b(f2);
                    c(f2);
                } else {
                    float f3 = z ? 1.09f : 1.0f;
                    b(f3);
                    c(f3);
                    if (this.f24744b.getTag().equals("1")) {
                        this.f24744b.setBackgroundResource(R.drawable.paid_box_focus);
                    }
                    if (this.f24744b.getTag().equals("2")) {
                        this.f24744b.setBackgroundResource(R.drawable.un_paid_box_focus);
                    }
                    if (this.f24744b.getTag().equals("3")) {
                        this.f24744b.setBackgroundResource(R.drawable.refounded_box_focus);
                    }
                    if (this.f24744b.getTag().equals("4")) {
                        this.f24744b.setBackgroundResource(R.drawable.cancel_box_focus);
                    }
                }
            }
            if (z) {
                return;
            }
            if (this.f24744b.getTag().equals("7")) {
                float f4 = z ? 2.0f : 1.0f;
                b(f4);
                c(f4);
                a(z);
                return;
            }
            float f5 = z ? 1.09f : 1.0f;
            b(f5);
            c(f5);
            a(z);
            if (this.f24744b.getTag().equals("1")) {
                this.f24744b.setBackgroundResource(R.drawable.paid_box);
            }
            if (this.f24744b.getTag().equals("2")) {
                this.f24744b.setBackgroundResource(R.drawable.un_paid_box);
            }
            if (this.f24744b.getTag().equals("3")) {
                this.f24744b.setBackgroundResource(R.drawable.refounded_box);
            }
            if (this.f24744b.getTag().equals("4")) {
                this.f24744b.setBackgroundResource(R.drawable.cancel_box);
            }
        }
    }

    @OnClick
    public void click(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.cancel /* 2131427690 */:
                intent = new Intent(this, (Class<?>) CancelInvoiceActivity.class);
                break;
            case R.id.paid /* 2131428757 */:
                intent = new Intent(this, (Class<?>) PaidInvoiceActivity.class);
                break;
            case R.id.refound /* 2131428876 */:
                intent = new Intent(this, (Class<?>) InvoiceRefundedActivity.class);
                break;
            case R.id.unpaid /* 2131429585 */:
                intent = new Intent(this, (Class<?>) UnpiadInvoiceActivity.class);
                break;
            default:
                return;
        }
        startActivity(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_my_invoice);
        ButterKnife.a(this);
        this.f24739d = this;
        Thread thread = this.f24740e;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new b());
            this.f24740e = thread2;
            thread2.start();
        }
        LinearLayout linearLayout = this.paid_box;
        linearLayout.setOnFocusChangeListener(new c(linearLayout));
        LinearLayout linearLayout2 = this.unpaid_box;
        linearLayout2.setOnFocusChangeListener(new c(linearLayout2));
        LinearLayout linearLayout3 = this.cancel_box;
        linearLayout3.setOnFocusChangeListener(new c(linearLayout3));
        LinearLayout linearLayout4 = this.refound_box;
        linearLayout4.setOnFocusChangeListener(new c(linearLayout4));
        z0();
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f24740e;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f24740e.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f24740e;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new b());
            this.f24740e = thread2;
            thread2.start();
        }
    }

    public final void z0() {
        ((c.h.a.e.d.a) c.h.a.e.d.b.a().d(c.h.a.e.d.a.class)).f("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "sitcount", "yes", c.h.a.e.b.a.a(this.f24739d)).x(new a());
    }
}
