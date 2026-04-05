package com.google.ads.interactivemedia.v3.internal;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bi implements bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f21176a = new int[2];

    @Override // com.google.ads.interactivemedia.v3.internal.bf
    public final JSONObject a(View view) {
        if (view == null) {
            return bo.b(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f21176a);
        int[] iArr = this.f21176a;
        return bo.b(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bf
    public final void b(View view, JSONObject jSONObject, be beVar, boolean z) {
        int i2;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    beVar.a(viewGroup.getChildAt(i3), this, jSONObject);
                }
                return;
            }
            HashMap map = new HashMap();
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                View childAt = viewGroup.getChildAt(i4);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i5 = 0;
            while (i5 < size) {
                ArrayList arrayList3 = (ArrayList) map.get((Float) arrayList2.get(i5));
                int size2 = arrayList3.size();
                int i6 = 0;
                while (true) {
                    i2 = i5 + 1;
                    if (i6 < size2) {
                        beVar.a((View) arrayList3.get(i6), this, jSONObject);
                        i6++;
                    }
                }
                i5 = i2;
            }
        }
    }
}
