package c.f.a.c.j.c;

import android.os.Bundle;
import c.f.a.c.j.c.f8;
import c.f.a.c.j.c.j8;
import com.amazonaws.services.s3.internal.Constants;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class k9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f12905a = new c.f.a.c.d.v.b("ApplicationAnalyticsUtils");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f12906b = u.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Integer, Integer> f12908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Integer, Integer> f12909e;

    public k9(Bundle bundle, String str) {
        this.f12907c = str;
        this.f12908d = d(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.f12909e = d(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    public static Map<Integer, Integer> d(Bundle bundle, String str) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return o1.b();
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((Integer) entry.getKey(), (Integer) entry.getValue());
        }
        return Collections.unmodifiableMap(map2);
    }

    public static void e(j8.a aVar, boolean z) {
        f8.a aVarW = f8.w(aVar.w());
        aVarW.r(z);
        aVar.o(aVarW);
    }

    public static long i(String str) {
        try {
            String strReplace = str.replace("-", BuildConfig.FLAVOR);
            return new BigInteger(strReplace.substring(0, Math.min(16, strReplace.length())), 16).longValue();
        } catch (NumberFormatException e2) {
            f12905a.g("receiverSessionId %s is not valid for hash: %s", str, e2.getMessage());
            return 0L;
        }
    }

    public final j8 a(la laVar) {
        return (j8) ((oa) h(laVar).v());
    }

    public final j8 b(la laVar, int i2) {
        j8.a aVarH = h(laVar);
        f8.a aVarW = f8.w(aVarH.w());
        Map<Integer, Integer> map = this.f12909e;
        aVarW.o((map == null || !map.containsKey(Integer.valueOf(i2))) ? i2 + Constants.MAXIMUM_UPLOAD_PARTS : this.f12909e.get(Integer.valueOf(i2)).intValue());
        aVarH.o(aVarW);
        return (j8) ((oa) aVarH.v());
    }

    public final j8 c(la laVar, boolean z) {
        j8.a aVarH = h(laVar);
        e(aVarH, z);
        return (j8) ((oa) aVarH.v());
    }

    public final j8 f(la laVar) {
        j8.a aVarH = h(laVar);
        e(aVarH, true);
        f8.a aVarW = f8.w(aVarH.w());
        aVarW.o(c3.APP_SESSION_RESUMED_FROM_SAVED_SESSION.zzgj());
        aVarH.o(aVarW);
        return (j8) ((oa) aVarH.v());
    }

    public final j8 g(la laVar, int i2) {
        j8.a aVarH = h(laVar);
        f8.a aVarW = f8.w(aVarH.w());
        aVarW.o((i2 == 0 ? c3.APP_SESSION_CASTING_STOPPED : c3.APP_SESSION_REASON_ERROR).zzgj());
        Map<Integer, Integer> map = this.f12908d;
        aVarW.p((map == null || !map.containsKey(Integer.valueOf(i2))) ? i2 + Constants.MAXIMUM_UPLOAD_PARTS : this.f12908d.get(Integer.valueOf(i2)).intValue());
        aVarH.o(aVarW);
        return (j8) ((oa) aVarH.v());
    }

    public final j8.a h(la laVar) {
        j8.a aVarY = j8.L().y(laVar.f12931e);
        int i2 = laVar.f12932f;
        laVar.f12932f = i2 + 1;
        j8.a aVarP = aVarY.p(i2);
        String str = laVar.f12930d;
        if (str != null) {
            aVarP.r(str);
        }
        aVarP.u((e8) ((oa) e8.A().o(f12906b).n(this.f12907c).v()));
        f8.a aVarF = f8.F();
        if (laVar.f12929c != null) {
            aVarF.n((m8) ((oa) m8.y().n(laVar.f12929c).v()));
        }
        aVarF.r(false);
        String str2 = laVar.f12933g;
        if (str2 != null) {
            aVarF.q(i(str2));
        }
        aVarP.o(aVarF);
        return aVarP;
    }
}
