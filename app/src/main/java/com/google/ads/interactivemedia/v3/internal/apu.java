package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes.dex */
@Hide
public final class apu extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<apu> CREATOR = new apv();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u f20352b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f20353c;

    public apu(int i2, byte[] bArr) {
        this.f20351a = i2;
        this.f20353c = bArr;
        b();
    }

    private final void b() {
        u uVar = this.f20352b;
        if (uVar != null || this.f20353c == null) {
            if (uVar == null || this.f20353c != null) {
                if (uVar != null && this.f20353c != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (uVar != null || this.f20353c != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    public final u a() {
        if (this.f20352b == null) {
            try {
                this.f20352b = u.d(this.f20353c, bkm.a());
                this.f20353c = null;
            } catch (blf | NullPointerException e2) {
                throw new IllegalStateException(e2);
            }
        }
        b();
        return this.f20352b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.l(parcel, 1, this.f20351a);
        byte[] bArrAi = this.f20353c;
        if (bArrAi == null) {
            bArrAi = this.f20352b.ai();
        }
        c.f.a.c.f.q.w.c.f(parcel, 2, bArrAi, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
