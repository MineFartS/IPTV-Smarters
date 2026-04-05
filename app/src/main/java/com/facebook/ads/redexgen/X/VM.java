package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VM extends C6U {
    public static PackageManager A00;
    public static String[] A01;

    static {
        A04();
    }

    public static void A04() {
        A01 = new String[]{"mMUsySdK", "G1dnExSQKLbMoTCo5d1h1U5A6G7ndhFt", "GiJYkTHpyeTaf3ywPcthUoX2rTVjWFCb", "0A5FUJ9kDHtL7zu8WVVZPRsd6iFGNBV", "Uxf0Oizk", "zpV62zjrrTP1cgdKU18BbBXv", "Pb6NlhKASELFsFyHLiNoj4ENeXMrfTQa", "RrSFtRYH4qZAbHiyxnUErsMfABxwLq"};
    }

    public VM(Context context, C04715u c04715u) {
        super(context, c04715u);
        A00 = context.getPackageManager();
    }

    public static /* synthetic */ PackageManager A01() {
        PackageManager packageManager = A00;
        if (A01[1].charAt(22) == 'k') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[7] = "gjUVtXXuXbvsWPZLBaiwFqVTuNtnGy";
        strArr[3] = "aaBFOo2Y3N72goZoHRvUb35kO6Lzp1W";
        return packageManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC04956s A03(HashMap<String, VL> map) {
        return new C1132Wt(SystemClock.elapsedRealtime(), A03(), map, EnumC04946r.A0C);
    }

    public final InterfaceC04806d A0H(List<C04796c> list) {
        return new VK(this, list);
    }
}
