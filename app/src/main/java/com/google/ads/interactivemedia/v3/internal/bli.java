package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public class bli {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile blz f21355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile bkd f21356b;

    static {
        bkm.a();
    }

    public final int a() {
        if (this.f21356b != null) {
            return this.f21356b.d();
        }
        if (this.f21355a != null) {
            return this.f21355a.aj();
        }
        return 0;
    }

    public final bkd b() {
        if (this.f21356b != null) {
            return this.f21356b;
        }
        synchronized (this) {
            if (this.f21356b != null) {
                return this.f21356b;
            }
            this.f21356b = this.f21355a == null ? bkd.f21262b : this.f21355a.ag();
            return this.f21356b;
        }
    }

    public final blz c(blz blzVar) {
        if (this.f21355a == null) {
            synchronized (this) {
                if (this.f21355a == null) {
                    try {
                        this.f21355a = blzVar;
                        this.f21356b = bkd.f21262b;
                    } catch (blf unused) {
                        this.f21355a = blzVar;
                        this.f21356b = bkd.f21262b;
                    }
                }
            }
        }
        return this.f21355a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bli)) {
            return false;
        }
        bli bliVar = (bli) obj;
        blz blzVar = this.f21355a;
        blz blzVar2 = bliVar.f21355a;
        return (blzVar == null && blzVar2 == null) ? b().equals(bliVar.b()) : (blzVar == null || blzVar2 == null) ? blzVar != null ? blzVar.equals(bliVar.c(blzVar.aU())) : c(blzVar2.aU()).equals(blzVar2) : blzVar.equals(blzVar2);
    }

    public int hashCode() {
        return 1;
    }
}
