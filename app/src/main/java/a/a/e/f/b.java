package a.a.e.f;

import a.a.e.f.a;
import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a<String[], Map<String, Boolean>> {
    public static Intent e(String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // a.a.e.f.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] strArr) {
        return e(strArr);
    }

    @Override // a.a.e.f.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a.C0001a<Map<String, Boolean>> b(Context context, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new a.C0001a<>(Collections.emptyMap());
        }
        a.f.a aVar = new a.f.a();
        boolean z = true;
        for (String str : strArr) {
            boolean z2 = a.i.i.b.a(context, str) == 0;
            aVar.put(str, Boolean.valueOf(z2));
            if (!z2) {
                z = false;
            }
        }
        if (z) {
            return new a.C0001a<>(aVar);
        }
        return null;
    }

    @Override // a.a.e.f.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Map<String, Boolean> c(int i2, Intent intent) {
        if (i2 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            int length = stringArrayExtra.length;
            for (int i3 = 0; i3 < length; i3++) {
                map.put(stringArrayExtra[i3], Boolean.valueOf(intArrayExtra[i3] == 0));
            }
            return map;
        }
        return Collections.emptyMap();
    }
}
