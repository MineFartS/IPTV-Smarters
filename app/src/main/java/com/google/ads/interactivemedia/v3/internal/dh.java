package com.google.ads.interactivemedia.v3.internal;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dh implements CompanionAdSlot {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f21646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f21647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<CompanionAdSlot.ClickListener> f21648e = new ArrayList(1);

    public final List<CompanionAdSlot.ClickListener> a() {
        return this.f21648e;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final void addClickListener(CompanionAdSlot.ClickListener clickListener) {
        this.f21648e.add(clickListener);
    }

    public final void b(String str) {
        this.f21647d = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final ViewGroup getContainer() {
        return this.f21646c;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final int getHeight() {
        return this.f21645b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final int getWidth() {
        return this.f21644a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final boolean isFilled() {
        return this.f21646c.findViewWithTag(this.f21647d) != null;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final void removeClickListener(CompanionAdSlot.ClickListener clickListener) {
        this.f21648e.remove(clickListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final void setContainer(ViewGroup viewGroup) {
        this.f21646c = viewGroup;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final void setSize(int i2, int i3) {
        this.f21644a = i2;
        this.f21645b = i3;
    }
}
