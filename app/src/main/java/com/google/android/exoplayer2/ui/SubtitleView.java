package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import c.f.a.b.f3.c;
import c.f.a.b.f3.l;
import c.f.a.b.h3.d1;
import c.f.a.b.h3.g0;
import c.f.a.b.h3.g1;
import c.f.a.b.h3.h0;
import c.f.a.b.j3.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SubtitleView extends FrameLayout implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<c> f24051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h0 f24052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f24055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24058i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f24059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f24060k;

    public interface a {
        void a(List<c> list, h0 h0Var, float f2, int i2, float f3);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24051b = Collections.emptyList();
        this.f24052c = h0.f8678a;
        this.f24053d = 0;
        this.f24054e = 0.0533f;
        this.f24055f = 0.08f;
        this.f24056g = true;
        this.f24057h = true;
        g0 g0Var = new g0(context);
        this.f24059j = g0Var;
        this.f24060k = g0Var;
        addView(g0Var);
        this.f24058i = 1;
    }

    private List<c> getCuesWithStylingPreferencesApplied() {
        if (this.f24056g && this.f24057h) {
            return this.f24051b;
        }
        ArrayList arrayList = new ArrayList(this.f24051b.size());
        for (int i2 = 0; i2 < this.f24051b.size(); i2++) {
            arrayList.add(a(this.f24051b.get(i2)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (x0.f9296a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private h0 getUserCaptionStyle() {
        if (x0.f9296a < 19 || isInEditMode()) {
            return h0.f8678a;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? h0.f8678a : h0.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t) {
        removeView(this.f24060k);
        View view = this.f24060k;
        if (view instanceof g1) {
            ((g1) view).g();
        }
        this.f24060k = t;
        this.f24059j = t;
        addView(t);
    }

    @Override // c.f.a.b.f3.l
    public void Q(List<c> list) {
        setCues(list);
    }

    public final c a(c cVar) {
        c.b bVarA = cVar.a();
        if (!this.f24056g) {
            d1.c(bVarA);
        } else if (!this.f24057h) {
            d1.d(bVarA);
        }
        return bVarA.a();
    }

    public void b(float f2, boolean z) {
        c(z ? 1 : 0, f2);
    }

    public final void c(int i2, float f2) {
        this.f24053d = i2;
        this.f24054e = f2;
        f();
    }

    public void d() {
        setStyle(getUserCaptionStyle());
    }

    public void e() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void f() {
        this.f24059j.a(getCuesWithStylingPreferencesApplied(), this.f24052c, this.f24054e, this.f24053d, this.f24055f);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f24057h = z;
        f();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f24056g = z;
        f();
    }

    public void setBottomPaddingFraction(float f2) {
        this.f24055f = f2;
        f();
    }

    public void setCues(List<c> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f24051b = list;
        f();
    }

    public void setFractionalTextSize(float f2) {
        b(f2, false);
    }

    public void setStyle(h0 h0Var) {
        this.f24052c = h0Var;
        f();
    }

    public void setViewType(int i2) {
        KeyEvent.Callback g0Var;
        if (this.f24058i == i2) {
            return;
        }
        if (i2 == 1) {
            g0Var = new g0(getContext());
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException();
            }
            g0Var = new g1(getContext());
        }
        setView(g0Var);
        this.f24058i = i2;
    }
}
