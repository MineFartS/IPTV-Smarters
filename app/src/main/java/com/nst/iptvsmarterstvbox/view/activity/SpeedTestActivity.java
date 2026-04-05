package minefarts.iptvsmarters.view.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import minefarts.iptvsmarters.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.ChartFactory;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class SpeedTestActivity extends a.b.k.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f26665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f26666e;

    @BindView
    public ImageView bar_speed;

    @BindView
    public TextView down_text;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.h.a.h.n.c f26667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashSet<String> f26668g;

    @BindView
    public LinearLayout graph_chart;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RotateAnimation f26669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f26670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.h.a.k.d.a.a f26671j;

    @BindView
    public TextView ping_text;

    @BindView
    public Button test_button;

    @BindView
    public TextView upl_text;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SpeedTestActivity.this.test_button.setEnabled(false);
            SpeedTestActivity.this.B0();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DecimalFormat f26673b;

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c.h.a.h.k.a f26675b;

            public a(c.h.a.h.k.a aVar) {
                this.f26675b = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity.this.f26669h = new RotateAnimation(SpeedTestActivity.f26666e, SpeedTestActivity.f26665d, 1, 0.5f, 1, 0.5f);
                SpeedTestActivity.this.f26669h.setInterpolator(new LinearInterpolator());
                SpeedTestActivity.this.f26669h.setDuration(100L);
                SpeedTestActivity speedTestActivity = SpeedTestActivity.this;
                speedTestActivity.bar_speed.startAnimation(speedTestActivity.f26669h);
                SpeedTestActivity.this.down_text.setText(b.this.f26673b.format(this.f26675b.b()) + " Mbps");
            }
        }

        /* JADX INFO: renamed from: minefarts.iptvsmarters.view.activity.SpeedTestActivity$b$b, reason: collision with other inner class name */
        public class RunnableC0277b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ List f26677b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ XYMultipleSeriesRenderer f26678c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LinearLayout f26679d;

            public RunnableC0277b(List list, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, LinearLayout linearLayout) {
                this.f26677b = list;
                this.f26678c = xYMultipleSeriesRenderer;
                this.f26679d = linearLayout;
            }

            @Override // java.lang.Runnable
            public void run() {
                XYSeries xYSeries = new XYSeries(BuildConfig.FLAVOR);
                xYSeries.setTitle(BuildConfig.FLAVOR);
                Iterator it = new ArrayList(this.f26677b).iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    xYSeries.add(i2, ((Double) it.next()).doubleValue());
                    i2++;
                }
                XYMultipleSeriesDataset xYMultipleSeriesDataset = new XYMultipleSeriesDataset();
                xYMultipleSeriesDataset.addSeries(xYSeries);
                this.f26679d.addView(ChartFactory.getLineChartView(SpeedTestActivity.this.getBaseContext(), xYMultipleSeriesDataset, this.f26678c), 0);
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c.h.a.h.k.c f26681b;

            public c(c.h.a.h.k.c cVar) {
                this.f26681b = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity.this.upl_text.setText(b.this.f26673b.format(this.f26681b.a()) + " Mbps");
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c.h.a.h.k.c f26683b;

            public d(c.h.a.h.k.c cVar) {
                this.f26683b = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity.this.f26669h = new RotateAnimation(SpeedTestActivity.f26666e, SpeedTestActivity.f26665d, 1, 0.5f, 1, 0.5f);
                SpeedTestActivity.this.f26669h.setInterpolator(new LinearInterpolator());
                SpeedTestActivity.this.f26669h.setDuration(100L);
                SpeedTestActivity speedTestActivity = SpeedTestActivity.this;
                speedTestActivity.bar_speed.startAnimation(speedTestActivity.f26669h);
                SpeedTestActivity.this.upl_text.setText(b.this.f26673b.format(this.f26683b.b()) + " Mbps");
            }
        }

        public class e implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ List f26685b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ XYMultipleSeriesRenderer f26686c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LinearLayout f26687d;

            public e(List list, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, LinearLayout linearLayout) {
                this.f26685b = list;
                this.f26686c = xYMultipleSeriesRenderer;
                this.f26687d = linearLayout;
            }

            @Override // java.lang.Runnable
            public void run() {
                XYSeries xYSeries = new XYSeries(BuildConfig.FLAVOR);
                xYSeries.setTitle(BuildConfig.FLAVOR);
                int i2 = 0;
                for (Double dValueOf : new ArrayList(this.f26685b)) {
                    if (i2 == 0) {
                        dValueOf = Double.valueOf(0.0d);
                    }
                    xYSeries.add(i2, dValueOf.doubleValue());
                    i2++;
                }
                XYMultipleSeriesDataset xYMultipleSeriesDataset = new XYMultipleSeriesDataset();
                xYMultipleSeriesDataset.addSeries(xYSeries);
                this.f26687d.addView(ChartFactory.getLineChartView(SpeedTestActivity.this.getBaseContext(), xYMultipleSeriesDataset, this.f26686c), 0);
            }
        }

        public class f implements Runnable {
            public f() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity.this.test_button.setEnabled(true);
                SpeedTestActivity speedTestActivity = SpeedTestActivity.this;
                speedTestActivity.test_button.setText(speedTestActivity.getResources().getString(R.string.restart_test));
            }
        }

        public class g implements Runnable {
            public g() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity speedTestActivity = SpeedTestActivity.this;
                speedTestActivity.test_button.setText(speedTestActivity.getResources().getString(R.string.ping_based));
            }
        }

        public class h implements Runnable {
            public h() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(SpeedTestActivity.this.getApplicationContext(), "No Connection...", 1).show();
                SpeedTestActivity.this.test_button.setEnabled(true);
                SpeedTestActivity speedTestActivity = SpeedTestActivity.this;
                speedTestActivity.test_button.setText(speedTestActivity.getResources().getString(R.string.restart_test));
            }
        }

        public class i implements Runnable {
            public i() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity speedTestActivity = SpeedTestActivity.this;
                speedTestActivity.test_button.setText(speedTestActivity.getResources().getString(R.string.problem_host));
            }
        }

        public class j implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ List f26693b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ double f26694c;

            public j(List list, double d2) {
                this.f26693b = list;
                this.f26694c = d2;
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity.this.test_button.setText(String.format("Host Location: %s [Distance: %s km]", this.f26693b.get(2), new DecimalFormat("#.##").format(this.f26694c / 1000.0d)));
            }
        }

        public class k implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinearLayout f26696b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ LinearLayout f26697c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LinearLayout f26698d;

            public k(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
                this.f26696b = linearLayout;
                this.f26697c = linearLayout2;
                this.f26698d = linearLayout3;
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity.this.ping_text.setText("0 ms");
                this.f26696b.removeAllViews();
                SpeedTestActivity.this.down_text.setText("0 Mbps");
                this.f26697c.removeAllViews();
                SpeedTestActivity.this.upl_text.setText("0 Mbps");
                this.f26698d.removeAllViews();
            }
        }

        public class l implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c.h.a.h.k.d f26700b;

            public l(c.h.a.h.k.d dVar) {
                this.f26700b = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity.this.ping_text.setText(b.this.f26673b.format(this.f26700b.a()) + " ms");
            }
        }

        public class m implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c.h.a.h.k.d f26702b;

            public m(c.h.a.h.k.d dVar) {
                this.f26702b = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity.this.ping_text.setText(b.this.f26673b.format(this.f26702b.b()) + " ms");
            }
        }

        public class n implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ List f26704b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ XYMultipleSeriesRenderer f26705c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ LinearLayout f26706d;

            public n(List list, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, LinearLayout linearLayout) {
                this.f26704b = list;
                this.f26705c = xYMultipleSeriesRenderer;
                this.f26706d = linearLayout;
            }

            @Override // java.lang.Runnable
            public void run() {
                XYSeries xYSeries = new XYSeries(BuildConfig.FLAVOR);
                xYSeries.setTitle(BuildConfig.FLAVOR);
                Iterator it = new ArrayList(this.f26704b).iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    xYSeries.add(i2, ((Double) it.next()).doubleValue());
                    i2++;
                }
                XYMultipleSeriesDataset xYMultipleSeriesDataset = new XYMultipleSeriesDataset();
                xYMultipleSeriesDataset.addSeries(xYSeries);
                this.f26706d.addView(ChartFactory.getLineChartView(SpeedTestActivity.this.getBaseContext(), xYMultipleSeriesDataset, this.f26705c), 0);
            }
        }

        public class o implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c.h.a.h.k.a f26708b;

            public o(c.h.a.h.k.a aVar) {
                this.f26708b = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                SpeedTestActivity.this.down_text.setText(b.this.f26673b.format(this.f26708b.a()) + " Mbps");
            }
        }

        public b(DecimalFormat decimalFormat) {
            this.f26673b = decimalFormat;
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x0303  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0355  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x035e  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x03b3  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x03da  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x03e2  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x03eb  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0403  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 1040
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: minefarts.iptvsmarters.view.activity.SpeedTestActivity.b.run():void");
        }
    }

    public class c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f26710b;

        public c(View view) {
            this.f26710b = view;
        }

        public final void a(boolean z) {
            if (z) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26710b, "alpha", z ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26710b, "scaleX", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26710b, "scaleY", f2);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        @SuppressLint({"ResourceType"})
        public void onFocusChange(View view, boolean z) {
            float f2;
            Button button;
            int i2;
            if (z) {
                f2 = z ? 1.12f : 1.0f;
                b(f2);
                c(f2);
                View view2 = this.f26710b;
                if (view2 == null || view2.getTag() == null || !this.f26710b.getTag().equals("1")) {
                    return;
                }
                button = SpeedTestActivity.this.test_button;
                i2 = R.drawable.blue_btn_effect;
            } else {
                if (z) {
                    return;
                }
                f2 = z ? 1.09f : 1.0f;
                b(f2);
                c(f2);
                a(z);
                View view3 = this.f26710b;
                if (view3 == null || view3.getTag() == null || !this.f26710b.getTag().equals("1")) {
                    return;
                }
                button = SpeedTestActivity.this.test_button;
                i2 = R.drawable.black_button_dark;
            }
            button.setBackgroundResource(i2);
        }
    }

    public final void A0() {
        this.test_button.setOnClickListener(new a());
    }

    public final void B0() {
        try {
            if (this.f26667f == null) {
                c.h.a.h.n.c cVar = new c.h.a.h.n.c();
                this.f26667f = cVar;
                cVar.start();
            }
            if (this.f26667f != null) {
                this.graph_chart.setVisibility(0);
                try {
                    new Thread(new b(new DecimalFormat("#.##"))).start();
                } catch (Exception e2) {
                    Toast.makeText(this.f26670i, e2.getMessage(), 0).show();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // a.l.d.e, androidx.activity.ComponentActivity, a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f26670i = this;
        super.onCreate(bundle);
        c.h.a.k.d.a.a aVar = new c.h.a.k.d.a.a(this.f26670i);
        this.f26671j = aVar;
        setContentView(aVar.A().equals(c.h.a.h.n.a.s0) ? R.layout.activity_speed_test_tv : R.layout.activity_speed_test);
        ButterKnife.a(this);
        this.f26668g = new HashSet<>();
        try {
            c.h.a.h.n.c cVar = new c.h.a.h.n.c();
            this.f26667f = cVar;
            cVar.start();
        } catch (Exception unused) {
        }
        Button button = this.test_button;
        if (button != null) {
            button.setOnFocusChangeListener(new c(button));
        }
        A0();
    }

    @Override // a.l.d.e, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            c.h.a.h.n.c cVar = new c.h.a.h.n.c();
            this.f26667f = cVar;
            cVar.start();
        } catch (Exception unused) {
        }
    }

    public int z0(double d2) {
        if (d2 <= 1.0d) {
            return (int) (d2 * 30.0d);
        }
        if (d2 <= 10.0d) {
            return ((int) (d2 * 6.0d)) + 30;
        }
        if (d2 <= 30.0d) {
            return ((int) ((d2 - 10.0d) * 3.0d)) + 90;
        }
        if (d2 <= 50.0d) {
            return ((int) ((d2 - 30.0d) * 1.5d)) + 150;
        }
        if (d2 <= 100.0d) {
            return ((int) ((d2 - 50.0d) * 1.2d)) + 180;
        }
        return 0;
    }
}
