package c.f.a.b.y2.b;

import android.content.Context;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    public static class a implements Comparator<CronetProvider> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f10506b;

        public a(boolean z) {
            this.f10506b = z;
        }

        public static int b(String str, String str2) {
            if (str != null && str2 != null) {
                String[] strArrU0 = x0.U0(str, "\\.");
                String[] strArrU02 = x0.U0(str2, "\\.");
                int iMin = Math.min(strArrU0.length, strArrU02.length);
                for (int i2 = 0; i2 < iMin; i2++) {
                    if (!strArrU0[i2].equals(strArrU02[i2])) {
                        try {
                            return Integer.parseInt(strArrU0[i2]) - Integer.parseInt(strArrU02[i2]);
                        } catch (NumberFormatException unused) {
                            return 0;
                        }
                    }
                }
            }
            return 0;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(CronetProvider cronetProvider, CronetProvider cronetProvider2) {
            int iC = c(cronetProvider) - c(cronetProvider2);
            return iC != 0 ? iC : -b(cronetProvider.getVersion(), cronetProvider2.getVersion());
        }

        public final int c(CronetProvider cronetProvider) {
            String name = cronetProvider.getName();
            if (CronetProvider.PROVIDER_NAME_APP_PACKAGED.equals(name)) {
                return 1;
            }
            if ("Google-Play-Services-Cronet-Provider".equals(name)) {
                return this.f10506b ? 0 : 2;
            }
            return 3;
        }
    }

    public static CronetEngine a(Context context, String str, boolean z) {
        String str2;
        ArrayList arrayList = new ArrayList(CronetProvider.getAllProviders(context));
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((CronetProvider) arrayList.get(size)).isEnabled() || CronetProvider.PROVIDER_NAME_FALLBACK.equals(((CronetProvider) arrayList.get(size)).getName())) {
                arrayList.remove(size);
            }
        }
        Collections.sort(arrayList, new a(z));
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String name = ((CronetProvider) arrayList.get(i2)).getName();
            try {
                CronetEngine.Builder builderCreateBuilder = ((CronetProvider) arrayList.get(i2)).createBuilder();
                if (str != null) {
                    builderCreateBuilder.setUserAgent(str);
                }
                CronetEngine cronetEngineBuild = builderCreateBuilder.build();
                z.b("CronetUtil", "CronetEngine built using " + name);
                return cronetEngineBuild;
            } catch (SecurityException unused) {
                str2 = "Failed to build CronetEngine. Please check that the process has android.permission.ACCESS_NETWORK_STATE.";
                z.i("CronetUtil", str2);
            } catch (UnsatisfiedLinkError unused2) {
                str2 = "Failed to link Cronet binaries. Please check that native Cronet binaries arebundled into your app.";
                z.i("CronetUtil", str2);
            }
        }
        z.i("CronetUtil", "CronetEngine could not be built.");
        return null;
    }
}
