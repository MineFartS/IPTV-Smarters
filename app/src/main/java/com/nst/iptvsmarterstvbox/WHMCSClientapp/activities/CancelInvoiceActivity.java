package minefarts.iptvsmarters.WHMCSClientapp.activities;

import a.b.k.c;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.a.e.a.b;
import c.h.a.e.d.d;
import c.h.a.h.n.e;
import com.github.ybq.android.spinkit.SpinKitView;
import minefarts.iptvsmarters.R;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public class CancelInvoiceActivity extends c implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f24697d;

    @BindView
    public TextView date;

    @BindView
    public SpinKitView progress;

    @BindView
    public RecyclerView recyclerView;

    @BindView
    public TextView textNotFound;

    @BindView
    public TextView time;

    public class a implements Runnable {

        /* JADX INFO: renamed from: minefarts.iptvsmarters.WHMCSClientapp.activities.CancelInvoiceActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0270a implements Runnable {
            public RunnableC0270a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                String string = Calendar.getInstance().getTime().toString();
                String strC = e.C(CancelInvoiceActivity.this.f24697d);
                String strQ = e.q(string);
                TextView textView = CancelInvoiceActivity.this.time;
                if (textView != null) {
                    textView.setText(strC);
                }
                TextView textView2 = CancelInvoiceActivity.this.date;
                if (textView2 != null) {
                    textView2.setText(strQ);
                }
            }
        }

        public a() {
        }

        public final void a() {
            CancelInvoiceActivity.this.runOnUiThread(new RunnableC0270a());
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            try {
                a();
                Thread.sleep(1000L);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_cancel_invoice);
        ButterKnife.a(this);
        new Thread(new a()).start();
        this.f24697d = this;
        this.recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        new d(this, this.f24697d, "Cancelled").a();
    }

    @Override // c.h.a.e.a.b
    public void v(String str) {
        this.progress.setVisibility(8);
        this.recyclerView.setVisibility(8);
        this.textNotFound.setVisibility(0);
        this.textNotFound.setText(getResources().getString(R.string.no_record));
    }
}
