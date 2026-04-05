package c.c.a.a;

import android.os.Bundle;
import c.c.a.a.g;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static g a(Bundle bundle, String str, String str2) {
        String str3;
        g gVar = t.f5176l;
        if (bundle == null) {
            str3 = String.format("%s got null owned items list", str2);
        } else {
            int iA = c.f.a.c.j.i.a.a(bundle, "BillingClient");
            String strG = c.f.a.c.j.i.a.g(bundle, "BillingClient");
            g.a aVarC = g.c();
            aVarC.c(iA);
            aVarC.b(strG);
            g gVarA = aVarC.a();
            if (iA != 0) {
                c.f.a.c.j.i.a.j("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(iA)));
                return gVarA;
            }
            if (bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                if (stringArrayList == null) {
                    str3 = String.format("Bundle returned from %s contains null SKUs list.", str2);
                } else if (stringArrayList2 == null) {
                    str3 = String.format("Bundle returned from %s contains null purchases list.", str2);
                } else {
                    if (stringArrayList3 != null) {
                        return t.p;
                    }
                    str3 = String.format("Bundle returned from %s contains null signatures list.", str2);
                }
            } else {
                str3 = String.format("Bundle returned from %s doesn't contain required fields.", str2);
            }
        }
        c.f.a.c.j.i.a.j("BillingClient", str3);
        return gVar;
    }
}
