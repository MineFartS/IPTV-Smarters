package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WF extends C6U {
    public final Context A00;

    public WF(Context context, C04715u c04715u) {
        super(context, c04715u);
        this.A00 = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC04956s A03(HashMap<String, WE> map) {
        return new C1132Wt(SystemClock.elapsedRealtime(), A03(), map, EnumC04946r.A0C);
    }

    public final InterfaceC04806d A0H(List<C04796c> list, C6Z c6z) {
        return new WD(this, list, c6z);
    }
}
