package com.google.ads.interactivemedia.v3.internal;

import android.hardware.display.DisplayManager;

/* JADX INFO: loaded from: classes.dex */
public final class anc implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ane f20213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DisplayManager f20214b;

    public anc(ane aneVar, DisplayManager displayManager) {
        this.f20213a = aneVar;
        this.f20214b = displayManager;
    }

    public final void a() {
        this.f20214b.registerDisplayListener(this, amn.v());
    }

    public final void b() {
        this.f20214b.unregisterDisplayListener(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i2) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        if (i2 == 0) {
            this.f20213a.o();
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i2) {
    }
}
