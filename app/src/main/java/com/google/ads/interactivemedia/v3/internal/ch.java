package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.View;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ch implements dy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ed f21541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f21543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cf f21544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ce f21545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Activity f21546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21547g;

    public ch(String str, ed edVar, View view) {
        cg cgVar = new cg(null);
        this.f21542b = str;
        this.f21541a = edVar;
        this.f21543c = view;
        this.f21544d = cgVar;
        this.f21546f = null;
        this.f21545e = null;
        this.f21547g = false;
    }

    private static int n(int i2, float f2) {
        return (int) Math.ceil(i2 / f2);
    }

    private final DisplayMetrics o() {
        return this.f21543c.getContext().getResources().getDisplayMetrics();
    }

    private static com.google.ads.interactivemedia.v3.impl.data.ar p(com.google.ads.interactivemedia.v3.impl.data.ar arVar, float f2) {
        com.google.ads.interactivemedia.v3.impl.data.aq aqVarBuilder = com.google.ads.interactivemedia.v3.impl.data.ar.builder();
        aqVarBuilder.left(n(arVar.left(), f2));
        aqVarBuilder.top(n(arVar.top(), f2));
        aqVarBuilder.height(n(arVar.height(), f2));
        aqVarBuilder.width(n(arVar.width(), f2));
        return aqVarBuilder.build();
    }

    public final com.google.ads.interactivemedia.v3.impl.data.b e(String str, String str2, String str3) {
        double d2;
        com.google.ads.interactivemedia.v3.impl.data.ar arVarP = p(com.google.ads.interactivemedia.v3.impl.data.ar.builder().locationOnScreenOfView(this.f21543c).build(), o().density);
        Rect rect = new Rect();
        boolean globalVisibleRect = this.f21543c.getGlobalVisibleRect(rect);
        IBinder windowToken = this.f21543c.getWindowToken();
        if (!globalVisibleRect || windowToken == null || !this.f21543c.isShown()) {
            rect.set(0, 0, 0, 0);
        }
        com.google.ads.interactivemedia.v3.impl.data.aq aqVarBuilder = com.google.ads.interactivemedia.v3.impl.data.ar.builder();
        aqVarBuilder.left(rect.left);
        aqVarBuilder.top(rect.top);
        aqVarBuilder.height(rect.height());
        aqVarBuilder.width(rect.width());
        com.google.ads.interactivemedia.v3.impl.data.ar arVarP2 = p(aqVarBuilder.build(), o().density);
        boolean z = (this.f21543c.getGlobalVisibleRect(new Rect()) && this.f21543c.isShown()) ? false : true;
        AudioManager audioManager = (AudioManager) this.f21543c.getContext().getSystemService("audio");
        if (audioManager != null) {
            double streamVolume = audioManager.getStreamVolume(3);
            double streamMaxVolume = audioManager.getStreamMaxVolume(3);
            Double.isNaN(streamVolume);
            Double.isNaN(streamMaxVolume);
            d2 = streamVolume / streamMaxVolume;
        } else {
            d2 = 0.0d;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.google.ads.interactivemedia.v3.impl.data.a aVarBuilder = com.google.ads.interactivemedia.v3.impl.data.b.builder();
        aVarBuilder.queryId(str);
        aVarBuilder.eventId(str2);
        aVarBuilder.appState(str3);
        aVarBuilder.nativeTime(jCurrentTimeMillis);
        aVarBuilder.nativeVolume(d2);
        aVarBuilder.nativeViewHidden(z);
        aVarBuilder.nativeViewBounds(arVarP);
        aVarBuilder.nativeViewVisibleBounds(arVarP2);
        return aVarBuilder.build();
    }

    public final void g() {
        this.f21541a.c(this, this.f21542b);
    }

    public final void h() {
        this.f21541a.m(this.f21542b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.dy
    public final void i(String str, String str2) {
        this.f21541a.o(new dw(du.activityMonitor, dv.viewability, this.f21542b, e(str, str2, BuildConfig.FLAVOR)));
    }

    public final void j() {
        Application applicationB;
        if (!this.f21547g || (applicationB = ly.b(this.f21543c.getContext())) == null) {
            return;
        }
        ce ceVar = new ce(this);
        this.f21545e = ceVar;
        applicationB.registerActivityLifecycleCallbacks(ceVar);
    }

    public final void k(boolean z) {
        this.f21547g = z;
    }

    public final void l() {
        ce ceVar;
        Application applicationB = ly.b(this.f21543c.getContext());
        if (applicationB == null || (ceVar = this.f21545e) == null) {
            return;
        }
        applicationB.unregisterActivityLifecycleCallbacks(ceVar);
    }
}
