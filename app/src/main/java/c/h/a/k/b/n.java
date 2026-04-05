package c.h.a.k.b;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;
import minefarts.iptvsmarters.R;

/* JADX INFO: loaded from: classes2.dex */
public class n extends RecyclerView.e0 {
    public NativeAdLayout u;
    public TextView v;
    public Button w;
    public MediaView x;
    public TextView y;

    public n(View view) {
        super(view);
        NativeAdLayout nativeAdLayout = (NativeAdLayout) view.findViewById(R.id.native_banner_ad_container);
        this.u = nativeAdLayout;
        this.v = (TextView) nativeAdLayout.findViewById(R.id.native_ad_title);
        this.y = (TextView) this.u.findViewById(R.id.native_ad_social_context);
        this.x = (MediaView) this.u.findViewById(R.id.native_icon_view);
        this.w = (Button) this.u.findViewById(R.id.native_ad_call_to_action);
    }

    public NativeAdLayout R() {
        return this.u;
    }

    public Button S() {
        return this.w;
    }

    public MediaView T() {
        return this.x;
    }

    public TextView U() {
        return this.y;
    }

    public TextView V() {
        return this.v;
    }
}
