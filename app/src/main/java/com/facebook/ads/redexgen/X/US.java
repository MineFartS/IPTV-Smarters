package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.SystemClock;
import java.util.HashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class US extends C6U {
    public final Context A00;
    public final ApplicationInfo A01;
    public final C04715u A02;
    public final C05006x A03;

    public US(Context context, C04715u c04715u) {
        super(context, c04715u);
        this.A01 = context.getApplicationInfo();
        this.A00 = context;
        this.A02 = c04715u;
        this.A03 = C05006x.A00(this.A00, this.A02.A0a(), this.A02.A0g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC04956s A05(HashMap<Integer, UR> map) {
        return new C1132Wt(SystemClock.elapsedRealtime(), A03(), map, EnumC04946r.A06);
    }

    public final InterfaceC04806d A0H() {
        return new UH(this);
    }

    public final InterfaceC04806d A0I() {
        return new UF(this);
    }

    public final InterfaceC04806d A0J() {
        return new UE(this);
    }

    public final InterfaceC04806d A0K() {
        return new UA(this);
    }

    public final InterfaceC04806d A0L() {
        return new UM(this);
    }

    public final InterfaceC04806d A0M() {
        return new UP(this);
    }

    public final InterfaceC04806d A0N() {
        return new UI(this);
    }

    public final InterfaceC04806d A0O() {
        return new UJ(this);
    }

    public final InterfaceC04806d A0P() {
        return new UN(this);
    }

    public final InterfaceC04806d A0Q() {
        return new UQ(this);
    }

    public final InterfaceC04806d A0R() {
        return new UO(this);
    }

    public final InterfaceC04806d A0S() {
        return new UL(this);
    }

    public final InterfaceC04806d A0T() {
        return new UK(this);
    }

    public final InterfaceC04806d A0U() {
        return new U8(this);
    }

    public final InterfaceC04806d A0V() {
        return new U9(this);
    }

    public final InterfaceC04806d A0W() {
        return new UB(this);
    }

    public final InterfaceC04806d A0X() {
        return new UC(this);
    }

    public final InterfaceC04806d A0Y() {
        return new UD(this);
    }

    public final InterfaceC04806d A0Z() {
        return new UG(this);
    }
}
