package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rh implements rp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f22892a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Constructor<? extends rj> f22893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22894d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f22895e = 112800;

    static {
        Constructor<? extends rj> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(rj.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating FLAC extension", e2);
        }
        f22893c = constructor;
    }

    private final void c(int i2, List<rj> list) {
        rj vpVar;
        switch (i2) {
            case 0:
                vpVar = new vp();
                break;
            case 1:
                vpVar = new vs();
                break;
            case 2:
                vpVar = new vu(null);
                break;
            case 3:
                vpVar = new sl(null);
                break;
            case 4:
                Constructor<? extends rj> constructor = f22893c;
                if (constructor == null) {
                    vpVar = new sq(null);
                    break;
                } else {
                    try {
                        list.add(constructor.newInstance(0));
                        return;
                    } catch (Exception e2) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e2);
                    }
                }
                break;
            case 5:
                vpVar = new st();
                break;
            case 6:
                vpVar = new tm(0);
                break;
            case 7:
                vpVar = new tt((byte[]) null);
                break;
            case 8:
                list.add(new ul(null));
                vpVar = new uq(null);
                break;
            case 9:
                vpVar = new ve();
                break;
            case 10:
                vpVar = new wt();
                break;
            case 11:
                vpVar = new xc(1, 112800);
                break;
            case 12:
                vpVar = new xn();
                break;
            case 13:
            default:
                return;
            case 14:
                vpVar = new sy();
                break;
        }
        list.add(vpVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rp
    public final synchronized rj[] a() {
        return b(Uri.EMPTY, new HashMap());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rp
    public final synchronized rj[] b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int iE = agg.e(map);
        if (iE != -1) {
            c(iE, arrayList);
        }
        int iF = agg.f(uri);
        if (iF != -1 && iF != iE) {
            c(iF, arrayList);
        }
        int[] iArr = f22892a;
        int length = iArr.length;
        for (int i2 = 0; i2 < 14; i2++) {
            int i3 = iArr[i2];
            if (i3 != iE && i3 != iF) {
                c(i3, arrayList);
            }
        }
        return (rj[]) arrayList.toArray(new rj[arrayList.size()]);
    }
}
