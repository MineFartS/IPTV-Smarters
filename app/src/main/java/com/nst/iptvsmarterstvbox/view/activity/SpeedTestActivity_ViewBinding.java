package com.nst.iptvsmarterstvbox.view.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.c.c;
import butterknife.Unbinder;
import com.nst.iptvsmarterstvbox.R;

/* JADX INFO: loaded from: classes2.dex */
public class SpeedTestActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SpeedTestActivity f26712b;

    public SpeedTestActivity_ViewBinding(SpeedTestActivity speedTestActivity, View view) {
        this.f26712b = speedTestActivity;
        speedTestActivity.test_button = (Button) c.c(view, R.id.test_button, "field 'test_button'", Button.class);
        speedTestActivity.ping_text = (TextView) c.c(view, R.id.ping_text, "field 'ping_text'", TextView.class);
        speedTestActivity.down_text = (TextView) c.c(view, R.id.down_text, "field 'down_text'", TextView.class);
        speedTestActivity.upl_text = (TextView) c.c(view, R.id.upl_text, "field 'upl_text'", TextView.class);
        speedTestActivity.bar_speed = (ImageView) c.c(view, R.id.bar_speed, "field 'bar_speed'", ImageView.class);
        speedTestActivity.graph_chart = (LinearLayout) c.c(view, R.id.graph_chart, "field 'graph_chart'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        SpeedTestActivity speedTestActivity = this.f26712b;
        if (speedTestActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f26712b = null;
        speedTestActivity.test_button = null;
        speedTestActivity.ping_text = null;
        speedTestActivity.down_text = null;
        speedTestActivity.upl_text = null;
        speedTestActivity.bar_speed = null;
        speedTestActivity.graph_chart = null;
    }
}
