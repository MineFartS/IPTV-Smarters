package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VS extends C6U {
    public ContentResolver A00;
    public DisplayMetrics A01;

    public VS(Context context, C04715u c04715u) {
        super(context, c04715u);
        this.A01 = context.getResources().getDisplayMetrics();
        this.A00 = context.getContentResolver();
    }

    public final InterfaceC04806d A0H() {
        return new VR(this);
    }

    public final InterfaceC04806d A0I() {
        return new VO(this);
    }

    public final InterfaceC04806d A0J() {
        return new VP(this);
    }

    public final InterfaceC04806d A0K() {
        return new VN(this);
    }

    public final InterfaceC04806d A0L() {
        return new VQ(this);
    }
}
