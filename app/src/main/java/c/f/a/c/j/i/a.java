package c.f.a.c.j.i;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import c.c.a.a.g;
import c.c.a.a.y;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f13694a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            j(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            i(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        String name = obj.getClass().getName();
        j(str, name.length() != 0 ? "Unexpected type for bundle response code: ".concat(name) : new String("Unexpected type for bundle response code: "));
        return 6;
    }

    public static Bundle b(c.c.a.a.a aVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    public static Bundle c(int i2, boolean z, String str, String str2, ArrayList<y> arrayList) {
        Bundle bundle = new Bundle();
        if (i2 >= 9) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (i2 >= 9 && z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (i2 >= 14) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            int size = arrayList.size();
            boolean z2 = false;
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.get(i3);
                arrayList2.add(null);
                z2 |= !TextUtils.isEmpty(null);
            }
            if (z2) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
            }
        }
        return bundle;
    }

    public static Bundle d(c.c.a.a.f fVar, boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (fVar.d() != 0) {
            bundle.putInt("prorationMode", fVar.d());
        }
        if (!TextUtils.isEmpty(fVar.h())) {
            bundle.putString("accountId", fVar.h());
        }
        if (!TextUtils.isEmpty(fVar.i())) {
            bundle.putString("obfuscatedProfileId", fVar.i());
        }
        if (fVar.a()) {
            bundle.putBoolean("vr", true);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(fVar.j())) {
            bundle.putString("oldSkuPurchaseToken", fVar.j());
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("oldSkuPurchaseId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("paymentsPurchaseParams", null);
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static Bundle e(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static c.c.a.a.g f(Intent intent, String str) {
        if (intent != null) {
            g.a aVarC = c.c.a.a.g.c();
            aVarC.c(a(intent.getExtras(), str));
            aVarC.b(g(intent.getExtras(), str));
            return aVarC.a();
        }
        j("BillingHelper", "Got null intent!");
        g.a aVarC2 = c.c.a.a.g.c();
        aVarC2.c(6);
        aVarC2.b("An internal error occurred.");
        return aVarC2.a();
    }

    public static String g(Bundle bundle, String str) {
        if (bundle == null) {
            j(str, "Unexpected null bundle received!");
            return BuildConfig.FLAVOR;
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            i(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return BuildConfig.FLAVOR;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        String name = obj.getClass().getName();
        j(str, name.length() != 0 ? "Unexpected type for debug message: ".concat(name) : new String("Unexpected type for debug message: "));
        return BuildConfig.FLAVOR;
    }

    public static List<Purchase> h(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            j("BillingHelper", "Couldn't find purchase lists, trying to find single data.");
            Purchase purchaseK = k(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseK == null) {
                j("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(purchaseK);
        } else {
            for (int i2 = 0; i2 < stringArrayList.size() && i2 < stringArrayList2.size(); i2++) {
                Purchase purchaseK2 = k(stringArrayList.get(i2), stringArrayList2.get(i2));
                if (purchaseK2 != null) {
                    arrayList.add(purchaseK2);
                }
            }
        }
        return arrayList;
    }

    public static void i(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    public static void j(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static Purchase k(String str, String str2) {
        if (str == null || str2 == null) {
            j("BillingHelper", "Received a bad purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
            sb.append("Got JSONException while parsing purchase data: ");
            sb.append(strValueOf);
            j("BillingHelper", sb.toString());
            return null;
        }
    }
}
