package com.nst.iptvsmarterstvbox.WHMCSClientapp.activities;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.nst.iptvsmarterstvbox.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import o.l;

/* JADX INFO: loaded from: classes2.dex */
public class OpenTicketActivity extends a.b.k.c {

    @BindView
    public Button btSubmit;

    @BindView
    public Button bt_close;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap<Integer, String> f24795e;

    @BindView
    public EditText etMessage;

    @BindView
    public EditText et_subject_value;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f24796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f24797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f24798h;

    @BindView
    public Spinner spDepartmentValue;

    @BindView
    public Spinner sp_priority;

    @BindView
    public TextView time;

    @BindView
    public TextView tvDepartement;

    @BindView
    public TextView tvMessage;

    @BindView
    public TextView tvPriority;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<String> f24794d = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Thread f24799i = null;

    public class a implements o.d<c.h.a.e.e.b> {
        public a() {
        }

        @Override // o.d
        public void a(o.b<c.h.a.e.e.b> bVar, Throwable th) {
            c.h.a.h.n.e.I();
            Toast.makeText(OpenTicketActivity.this.f24796f, "Network error occured! Please try again", 0).show();
        }

        @Override // o.d
        @SuppressLint({"UseSparseArrays"})
        public void b(o.b<c.h.a.e.e.b> bVar, l<c.h.a.e.e.b> lVar) {
            c.h.a.h.n.e.I();
            if (lVar.a() != null && lVar.a().b().equals("success")) {
                lVar.a().a();
                throw null;
            }
            if (lVar.a() == null || !lVar.a().b().equals("error")) {
                return;
            }
            Toast.makeText(OpenTicketActivity.this.getApplicationContext(), "Error", 0).show();
        }
    }

    public class b implements o.d<c.h.a.e.e.e> {
        public b() {
        }

        @Override // o.d
        public void a(o.b<c.h.a.e.e.e> bVar, Throwable th) {
            c.h.a.h.n.e.I();
            Toast.makeText(OpenTicketActivity.this.f24796f, "Network error occured! Please try again", 0).show();
        }

        @Override // o.d
        public void b(o.b<c.h.a.e.e.e> bVar, l<c.h.a.e.e.e> lVar) {
            c.h.a.h.n.e.I();
            if (!lVar.d() || lVar.a() == null || !lVar.a().a().equals("success")) {
                if (lVar.a().a().equals("error")) {
                    Toast.makeText(OpenTicketActivity.this.getApplicationContext(), "Error", 0).show();
                }
            } else {
                Toast.makeText(OpenTicketActivity.this.getApplicationContext(), OpenTicketActivity.this.f24796f.getResources().getString(R.string.ticket_submitted), 0).show();
                Intent intent = new Intent(OpenTicketActivity.this, (Class<?>) MyTicketActivity.class);
                intent.setAction("updateticket");
                intent.setFlags(67108864);
                OpenTicketActivity.this.startActivity(intent);
                OpenTicketActivity.this.finish();
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(OpenTicketActivity.this.f24796f);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = OpenTicketActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = OpenTicketActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    OpenTicketActivity.this.B0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public static class e implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f24804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Activity f24805c;

        public e(View view, Activity activity) {
            this.f24804b = view;
            this.f24805c = activity;
        }

        public final void a(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24804b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f24804b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            int i2;
            if (this.f24805c != null) {
                if (!z) {
                    if (z) {
                        return;
                    }
                    a(1.0f);
                    b(1.0f);
                    View view2 = this.f24804b;
                    if (view2 != null && view2.getTag() != null && this.f24804b.getTag().equals("1")) {
                        view.setBackgroundResource(R.drawable.black_button_dark);
                    }
                    View view3 = this.f24804b;
                    if (view3 != null && view3.getTag() != null && this.f24804b.getTag().equals("2")) {
                        view.setBackgroundResource(R.drawable.black_button_dark);
                    }
                    View view4 = this.f24804b;
                    if (view4 == null || view4.getTag() == null || !this.f24804b.getTag().equals("3")) {
                        return;
                    }
                    view.setBackgroundResource(R.drawable.black_button_dark);
                    return;
                }
                float f2 = z ? 1.03f : 1.0f;
                View view5 = this.f24804b;
                if (view5 == null || view5.getTag() == null || !this.f24804b.getTag().equals("1")) {
                    View view6 = this.f24804b;
                    if (view6 == null || view6.getTag() == null || !this.f24804b.getTag().equals("2")) {
                        View view7 = this.f24804b;
                        if (view7 == null || view7.getTag() == null || !this.f24804b.getTag().equals("3")) {
                            view.setBackground(this.f24805c.getResources().getDrawable(R.drawable.selector_checkbox));
                            return;
                        } else {
                            a(f2);
                            b(f2);
                            i2 = R.drawable.blue_btn_effect;
                        }
                    } else {
                        a(f2);
                        b(f2);
                        i2 = R.drawable.logout_btn_effect;
                    }
                } else {
                    a(f2);
                    b(f2);
                    i2 = R.drawable.back_btn_effect;
                }
                view.setBackgroundResource(i2);
            }
        }
    }

    public void B0() {
        runOnUiThread(new c());
    }

    public void C0() {
        Context applicationContext;
        Resources resources;
        int i2;
        String string;
        int iA = c.h.a.e.b.a.a(this.f24796f);
        String strTrim = this.etMessage.getText().toString().trim();
        this.f24797g = this.spDepartmentValue.getSelectedItem().toString();
        this.f24798h = this.sp_priority.getSelectedItem().toString();
        String strTrim2 = this.et_subject_value.getText().toString().trim();
        if (!strTrim2.isEmpty()) {
            String str = this.f24797g;
            if (str == null || !str.equalsIgnoreCase(BuildConfig.FLAVOR)) {
                String str2 = this.f24798h;
                if (str2 != null && str2.equalsIgnoreCase(BuildConfig.FLAVOR)) {
                    applicationContext = this.f24796f;
                    string = "Please select priority";
                } else if (strTrim == null || !strTrim.isEmpty()) {
                    z0(strTrim, strTrim2, this.f24795e.get(Integer.valueOf(this.spDepartmentValue.getSelectedItemPosition())), iA);
                    return;
                } else {
                    applicationContext = getApplicationContext();
                    resources = this.f24796f.getResources();
                    i2 = R.string.enter_message;
                }
            } else {
                applicationContext = this.f24796f;
                string = "Please select Department";
            }
            Toast.makeText(applicationContext, string, 0).show();
        }
        applicationContext = getApplicationContext();
        resources = this.f24796f.getResources();
        i2 = R.string.enter_subject_text;
        string = resources.getString(i2);
        Toast.makeText(applicationContext, string, 0).show();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_open_ticket);
        ButterKnife.a(this);
        this.f24796f = this;
        Button button = this.btSubmit;
        button.setOnFocusChangeListener(new e(button, this));
        Button button2 = this.bt_close;
        button2.setOnFocusChangeListener(new e(button2, this));
        Thread thread = this.f24799i;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new d());
            this.f24799i = thread2;
            thread2.start();
        }
        y0();
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f24799i;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f24799i.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f24799i;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new d());
            this.f24799i = thread2;
            thread2.start();
        }
    }

    @OnClick
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.bt_close) {
            onBackPressed();
        } else {
            if (id != R.id.bt_submit) {
                return;
            }
            C0();
        }
    }

    public final void y0() {
        c.h.a.h.n.e.i0(this);
        ((c.h.a.e.d.a) c.h.a.e.d.b.a().d(c.h.a.e.d.a.class)).c("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "GetSupportDepartments", "no", c.h.a.e.b.a.a(this)).x(new a());
    }

    public final void z0(String str, String str2, String str3, int i2) {
        c.h.a.h.n.e.i0(this);
        ((c.h.a.e.d.a) c.h.a.e.d.b.a().d(c.h.a.e.d.a.class)).e("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "OpenTicket", str, str3, i2, str2).x(new b());
    }
}
