package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class hy extends ig {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final StackTraceElement[] f21936h;

    public hy(hc hcVar, k kVar, int i2, StackTraceElement[] stackTraceElementArr) {
        super(hcVar, "vuf0ICTkN+8t3/Roe9XcG+iOkkRVIongIbQ07rmD3KnIXUvNCzewBpWyZLB3p3/7", "wNtnu9iz9FxlWQ/xUwtzm8lbyA6loylNTisLT38FjBA=", kVar, i2, 45);
        this.f21936h = stackTraceElementArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ig
    public final void a() {
        StackTraceElement[] stackTraceElementArr = this.f21936h;
        if (stackTraceElementArr != null) {
            gw gwVar = new gw((String) this.f21957e.invoke(null, stackTraceElementArr));
            synchronized (this.f21956d) {
                this.f21956d.E(gwVar.f21877a.longValue());
                if (gwVar.f21878b.booleanValue()) {
                    this.f21956d.t(gwVar.f21879c.booleanValue() ? ab.ENUM_FALSE : ab.ENUM_TRUE);
                } else {
                    this.f21956d.t(ab.ENUM_FAILURE);
                }
            }
        }
    }
}
