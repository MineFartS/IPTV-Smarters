package minefarts.iptvsmarters.WHMCSClientapp.activities;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import c.h.a.e.e.g;
import c.h.a.e.e.h;
import c.h.a.h.n.e;
import com.github.ybq.android.spinkit.SpinKitView;
import minefarts.iptvsmarters.R;
import java.util.Calendar;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import o.l;

/* JADX INFO: loaded from: classes2.dex */
public class ViewTicketActivity extends a.b.k.c {

    @BindView
    public Button btReply;

    @BindView
    public Button bt_cancel_reply;

    @BindView
    public TextView date;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f24895e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AlertDialog f24897g;

    @BindView
    public LinearLayout ll_replay;

    @BindView
    public SpinKitView progress;

    @BindView
    public RecyclerView recyclerView;

    @BindView
    public TextView textNotFound;

    @BindView
    public TextView time;

    @BindView
    public TextView tv_title;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f24894d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f24896f = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f24898h = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Thread f24899i = null;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strC = c.h.a.h.n.e.C(ViewTicketActivity.this.f24895e);
                String strQ = c.h.a.h.n.e.q(string);
                TextView textView = ViewTicketActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = ViewTicketActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class b implements o.d<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AlertDialog f24901a;

        public b(AlertDialog alertDialog) {
            this.f24901a = alertDialog;
        }

        @Override // o.d
        public void a(o.b<h> bVar, Throwable th) {
            Toast.makeText(ViewTicketActivity.this.f24895e, "Network error occured! Please try again", 0).show();
            c.h.a.h.n.e.I();
        }

        @Override // o.d
        public void b(o.b<h> bVar, l<h> lVar) {
            Context context;
            String str;
            c.h.a.h.n.e.I();
            if (!lVar.d() || lVar.a() == null) {
                context = ViewTicketActivity.this.f24895e;
                str = "Response Error";
            } else {
                if (lVar.a().a().equals("success")) {
                    Toast.makeText(ViewTicketActivity.this.getApplicationContext(), "Your ticket added successfully", 0).show();
                    AlertDialog alertDialog = this.f24901a;
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                    ViewTicketActivity.this.y0();
                    return;
                }
                context = ViewTicketActivity.this.f24895e;
                str = "Error";
            }
            Toast.makeText(context, str, 0).show();
        }
    }

    public class c implements o.d<g> {
        public c() {
        }

        @Override // o.d
        public void a(o.b<g> bVar, Throwable th) {
            ViewTicketActivity.this.E0(Boolean.FALSE);
        }

        @Override // o.d
        public void b(o.b<g> bVar, l<g> lVar) {
            if (!lVar.d() || lVar.a() == null || !lVar.a().b().equals("success")) {
                ViewTicketActivity.this.E0(Boolean.FALSE);
            } else {
                ViewTicketActivity.this.E0(Boolean.TRUE);
                lVar.a().a();
                throw null;
            }
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EditText f24904b;

        public d(EditText editText) {
            this.f24904b = editText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String string = this.f24904b.getText().toString();
            if (string != null && string.equalsIgnoreCase(BuildConfig.FLAVOR)) {
                c.h.a.h.n.e.l0(ViewTicketActivity.this.f24895e, "Please enter message");
            } else {
                ViewTicketActivity viewTicketActivity = ViewTicketActivity.this;
                viewTicketActivity.D0(string, viewTicketActivity.f24897g);
            }
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewTicketActivity.this.f24897g.dismiss();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    ViewTicketActivity.this.C0();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public void C0() {
        runOnUiThread(new a());
    }

    public final void D0(String str, AlertDialog alertDialog) {
        if (this.f24895e != null) {
            c.h.a.h.n.e.i0(this);
            ((c.h.a.e.d.a) c.h.a.e.d.b.a().d(c.h.a.e.d.a.class)).g("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "AddTicketReply", "no", str, c.h.a.e.b.a.a(this.f24895e), this.f24896f).x(new b(alertDialog));
        }
    }

    public void E0(Boolean bool) {
        if (bool.booleanValue()) {
            this.recyclerView.setVisibility(0);
            this.btReply.setVisibility(0);
            this.ll_replay.setVisibility(0);
        } else {
            this.textNotFound.setVisibility(0);
            this.btReply.setVisibility(8);
            this.ll_replay.setVisibility(8);
        }
        this.progress.setVisibility(8);
    }

    public void F0() {
        if (this.f24895e != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.AlertDialogCustom);
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.replay_alertbox, (ViewGroup) null);
            Button button = (Button) viewInflate.findViewById(R.id.btn_send);
            Button button2 = (Button) viewInflate.findViewById(R.id.bt_cancel_reply);
            button.setOnFocusChangeListener(new e.j(button, this));
            button2.setOnFocusChangeListener(new e.j(button2, this));
            button.setOnClickListener(new d((EditText) viewInflate.findViewById(R.id.et_message)));
            button2.setOnClickListener(new e());
            builder.setView(viewInflate);
            this.f24897g = builder.create();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(this.f24897g.getWindow().getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -2;
            this.f24897g.show();
            this.f24897g.getWindow().setAttributes(layoutParams);
            this.f24897g.setCancelable(false);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_view_ticket);
        ButterKnife.a(this);
        this.f24895e = this;
        Thread thread = this.f24899i;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new f());
            this.f24899i = thread2;
            thread2.start();
        }
        Button button = this.btReply;
        button.setOnFocusChangeListener(new e.j(button, this));
        Button button2 = this.bt_cancel_reply;
        button2.setOnFocusChangeListener(new e.j(button2, this));
        Intent intent = getIntent();
        this.f24896f = intent.getStringExtra("ticketid");
        String stringExtra = intent.getStringExtra("Title");
        this.f24898h = stringExtra;
        if (stringExtra == null || stringExtra.equalsIgnoreCase(BuildConfig.FLAVOR)) {
            this.tv_title.setVisibility(8);
        } else {
            this.tv_title.setText("#" + this.f24898h);
        }
        y0();
    }

    @Override // a.l.d.e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f24899i;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f24899i.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f24899i;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new f());
            this.f24899i = thread2;
            thread2.start();
        }
    }

    @OnClick
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.bt_cancel_reply) {
            onBackPressed();
        } else {
            if (id != R.id.bt_reply) {
                return;
            }
            F0();
        }
    }

    public final void y0() {
        ((c.h.a.e.d.a) c.h.a.e.d.b.a().d(c.h.a.e.d.a.class)).a("OUBQqC6334OcxjS", "61Ce6WTJP12wy1a", "GetTicket", "no", this.f24896f).x(new c());
    }
}
