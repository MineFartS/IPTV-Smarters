package com.google.ads.interactivemedia.v3.internal;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bh implements bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bf f21115a;

    public bh(bf bfVar) {
        this.f21115a = bfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bf
    public final JSONObject a(View view) {
        return bo.b(0, 0, 0, 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bf
    public final void b(View view, JSONObject jSONObject, be beVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        aw awVarA = aw.a();
        if (awVarA != null) {
            Collection<ap> collectionB = awVarA.b();
            int size = collectionB.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator<ap> it = collectionB.iterator();
            while (it.hasNext()) {
                View viewG = it.next().g();
                if (viewG != null && (Build.VERSION.SDK_INT < 19 || viewG.isAttachedToWindow())) {
                    if (viewG.isShown()) {
                        View view2 = viewG;
                        while (true) {
                            if (view2 == null) {
                                View rootView = viewG.getRootView();
                                if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                    identityHashMap.put(rootView, rootView);
                                    float fD = ly.d(rootView);
                                    int size2 = arrayList.size();
                                    while (size2 > 0) {
                                        int i2 = size2 - 1;
                                        if (ly.d((View) arrayList.get(i2)) <= fD) {
                                            break;
                                        } else {
                                            size2 = i2;
                                        }
                                    }
                                    arrayList.add(size2, rootView);
                                }
                            } else if (view2.getAlpha() != 0.0f) {
                                Object parent = view2.getParent();
                                view2 = parent instanceof View ? (View) parent : null;
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            beVar.a((View) arrayList.get(i3), this.f21115a, jSONObject);
        }
    }
}
