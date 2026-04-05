package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ain {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public aty<String> f19841a = aty.n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public aty<String> f19842b = aty.n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19843c = 0;

    @Deprecated
    public ain() {
    }

    public void b(Context context) {
        CaptioningManager captioningManager;
        int i2 = amn.f20135a;
        if (i2 >= 19) {
            if ((i2 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f19843c = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f19842b = aty.o(amn.H(locale));
                }
            }
        }
    }
}
