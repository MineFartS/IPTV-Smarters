package minefarts.iptvsmarters.WHMCSClientapp.activities;

import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import b.c.c;
import butterknife.Unbinder;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class BuyNowActivity_ViewBinding implements Unbinder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BuyNowActivity f24696b;

    public BuyNowActivity_ViewBinding(BuyNowActivity buyNowActivity, View view) {
        this.f24696b = buyNowActivity;
        buyNowActivity.webview = (WebView) c.c(view, R.id.webview, "field 'webview'", WebView.class);
        buyNowActivity.date = (TextView) c.c(view, R.id.date, "field 'date'", TextView.class);
        buyNowActivity.time = (TextView) c.c(view, R.id.time, "field 'time'", TextView.class);
        buyNowActivity.tv_title = (TextView) c.c(view, R.id.tv_title, "field 'tv_title'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void a() {
        BuyNowActivity buyNowActivity = this.f24696b;
        if (buyNowActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f24696b = null;
        buyNowActivity.webview = null;
        buyNowActivity.date = null;
        buyNowActivity.time = null;
        buyNowActivity.tv_title = null;
    }
}
