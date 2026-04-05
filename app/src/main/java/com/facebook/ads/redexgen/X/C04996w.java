package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04996w {
    public int A00;
    public final Context A01;
    public final C04715u A02;
    public final InterfaceC04966t A03;
    public final InterfaceC04976u A04;
    public final Set<C04776a> A05 = new HashSet();

    public C04996w(Context context, C04715u c04715u) {
        this.A02 = c04715u;
        this.A01 = context;
        this.A04 = c04715u.A0c();
        this.A03 = c04715u.A0b();
    }

    @Nullable
    private C04936q A00() {
        if (this.A02.A0a() == EnumC04846h.A0G) {
            return null;
        }
        Context context = this.A01;
        return new C04936q(context == null ? BuildConfig.FLAVOR : context.getPackageName());
    }

    @SuppressLint({"CatchGeneralException"})
    private void A01(long j2) {
        AbstractC04956s signalValueTypeDef;
        try {
            JSONObject jSONObject = new JSONObject();
            for (C04776a c04776a : this.A05) {
                InterfaceC04806d interfaceC04806dA01 = c04776a.A01();
                if (interfaceC04806dA01 == null) {
                    signalValueTypeDef = new C1126Wn(SystemClock.elapsedRealtime(), A00(), new C04926p(EnumC04916o.A04));
                } else {
                    try {
                        signalValueTypeDef = interfaceC04806dA01.A51();
                    } catch (Throwable th) {
                        signalValueTypeDef = AnonymousClass71.A04(this.A01.getPackageName(), th);
                    }
                }
                jSONObject.put(Integer.toString(c04776a.A00()), signalValueTypeDef.A0A(false));
            }
            throw null;
        } catch (Throwable t) {
            AnonymousClass66.A04(t);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    private void A02(long j2) {
        try {
            this.A02.A0j().schedule(new Runnable() { // from class: com.facebook.ads.redexgen.X.6v
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    if (C0822Kp.A02(this)) {
                        return;
                    }
                    try {
                        this.A00.A03();
                    } catch (Throwable th) {
                        C0822Kp.A00(th, this);
                    }
                }
            }, j2, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            AnonymousClass66.A04(th);
        }
    }

    @SuppressLint({"BadMethodUse-java.lang.System.currentTimeMillis"})
    public final void A03() {
        if (this.A02.A0W() <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.A04.getLastPeriodicCollectionTimeMs() >= this.A02.A0W()) {
            A01(jCurrentTimeMillis);
            A02(this.A02.A0W());
        } else {
            A02(Math.abs(jCurrentTimeMillis - (this.A04.getLastPeriodicCollectionTimeMs() + this.A02.A0W())));
        }
    }

    public final void A04(int i2) {
        this.A00 = i2;
    }

    public final void A05(C04776a c04776a) {
        this.A05.add(c04776a);
    }
}
