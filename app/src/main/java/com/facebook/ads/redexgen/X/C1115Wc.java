package com.facebook.ads.redexgen.X;

import android.icu.util.TimeZone;
import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1115Wc implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ C1116Wd A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"smnl8goxbtEXy2ari0oo94M5wBAsJ", "4jdGfKjJVtKongVqtnlXz1qpag9QmJcO", "6HhyQoH63eZiDTc8tIM8lg1a8XmlaMXL", "TRovmJ8dsKeWsGtAEtnO1NLs5DkGdItv", "EJDQOjfPW", "Fvhxx1JOY2tpNVIZJk2UFnorm88CMjoG", "Hr", "QB67UPOvQOrUPNaLWc8iYWX5dhIe7kRi"};
    }

    public C1115Wc(C1116Wd c1116Wd) {
        this.A00 = c1116Wd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 24) {
            AbstractC04956s abstractC04956sA08 = this.A00.A08(EnumC04916o.A05);
            String[] strArr = A01;
            if (strArr[5].charAt(2) != strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "zHpdef4a8sETM0qy6DqDlJHNwIYZi";
            strArr2[0] = "zHpdef4a8sETM0qy6DqDlJHNwIYZi";
            return abstractC04956sA08;
        }
        return this.A00.A09(TimeZone.getDefault().getDisplayName());
    }
}
