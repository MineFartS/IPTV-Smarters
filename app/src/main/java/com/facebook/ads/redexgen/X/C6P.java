package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6P, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6P {
    public static final String A08 = C6P.class.getSimpleName();
    public final int A00;
    public final Context A01;
    public final C04715u A02;
    public final C6B A03;
    public final C1054Tt A04;
    public final C1055Tu A05;
    public final C1056Tv A06;
    public final C04996w A07;

    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.ads.redexgen.X.6S] */
    public C6P(final Context context, final C04715u c04715u) {
        final C6T c6t = new C6T(new C6V(context, c04715u));
        ?? r2 = new Object(context, c6t, c04715u) { // from class: com.facebook.ads.redexgen.X.6S
            public static byte[] A07;
            public static String[] A08;
            public int A00;
            public final C04715u A01;
            public final C1054Tt A02;
            public final C1055Tu A03;
            public final C1056Tv A04;
            public final C6T A05;
            public final C04996w A06;

            static {
                A05();
                A04();
            }

            public static String A02(int i2, int i3, int i4) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
                for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                    bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 75);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A04() {
                A07 = new byte[]{-31, 4};
            }

            public static void A05() {
                A08 = new String[]{"Nj4TqS4QnuHXli7th2heksSDMg2Z", "RSouwChKZWzGhunCWCHEu7HkA4YX3nJn", "5fVToSkDBkuydhS3BZw", "o644y0JXIVns0cvIXh4fs0HcxxzuSHU9", "L6wIWC4w0dKe6dclyvwc8pXUf7KK", "NV8kH7O4XMciCHnyYHa8lR80N34PEowy", "S6E1x33SpjjOrFFRELF", "CEXaqd5N8FzuUquPi7vxqko1f9a5yOv1"};
            }

            {
                this.A03 = new C1055Tu(context, c04715u);
                this.A04 = new C1056Tv(context, c04715u);
                this.A02 = new C1054Tt(context, c04715u);
                this.A06 = new C04996w(context, c04715u);
                this.A05 = c6t;
                this.A01 = c04715u;
                A06();
            }

            @Nullable
            public static C04796c A00(int i2, String str, int i3, int i4) {
                if (i2 != 10300) {
                    if (i2 == 10920) {
                        return A01(str, i3, i4, EnumC04786b.A03);
                    }
                    if (i2 != 10940 && i2 != 10941) {
                        switch (i2) {
                            case 10943:
                            case 10944:
                            case 10945:
                                break;
                            default:
                                return null;
                        }
                    }
                }
                return A01(str, i3, i4, EnumC04786b.A04);
            }

            @Nullable
            public static C04796c A01(String str, int i2, int i3, EnumC04786b enumC04786b) {
                int i4 = C6R.A00[enumC04786b.ordinal()];
                if (i4 == 1) {
                    return new C04796c(Integer.valueOf(Integer.parseInt(str)), i2, i3);
                }
                if (i4 != 2) {
                    return null;
                }
                return new C04796c(str, i2, i3);
            }

            @Nullable
            private List<C04796c> A03(int i2) throws JSONException {
                ArrayList arrayList = new ArrayList();
                Map<Integer, String> mapA0i = this.A01.A0i();
                if (mapA0i == null || mapA0i.isEmpty() || !mapA0i.containsKey(Integer.valueOf(i2))) {
                    return arrayList;
                }
                JSONObject jSONObject = new JSONObject(mapA0i.get(Integer.valueOf(i2)));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    if (jSONArray != null && jSONArray.length() == 2) {
                        int i3 = jSONArray.getInt(0);
                        int minApiLevel = jSONArray.getInt(1);
                        arrayList.add(A00(i2, next, i3, minApiLevel));
                    }
                }
                return arrayList;
            }

            @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
            private final void A06() {
                String strA02 = A02(1, 1, 69);
                try {
                    JSONObject jSONObject = new JSONObject(this.A01.A0h());
                    Integer numValueOf = jSONObject.has(strA02) ? Integer.valueOf(jSONObject.getInt(strA02)) : null;
                    if (numValueOf == null) {
                        return;
                    }
                    this.A00 = numValueOf.intValue();
                    this.A06.A04(this.A00);
                    A07(jSONObject.getJSONArray(A02(0, 1, 51)));
                } catch (Throwable th) {
                    AnonymousClass66.A04(th);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
            @android.annotation.SuppressLint({"BadMethodUse-android.util.Log.e"})
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void A07(org.json.JSONArray r11) throws java.lang.Exception {
                /*
                    Method dump skipped, instruction units count: 272
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C6S.A07(org.json.JSONArray):void");
            }

            private final boolean A08(EnumSet<EnumC04846h> enumSet) {
                return (enumSet.contains(this.A01.A0a()) && enumSet.contains(EnumC04846h.A05) && enumSet.contains(EnumC04846h.A06) && !enumSet.contains(EnumC04846h.A0A)) ? false : true;
            }

            public final int A09() {
                return this.A00;
            }

            public final C1054Tt A0A() {
                return this.A02;
            }

            public final C1055Tu A0B() {
                return this.A03;
            }

            public final C1056Tv A0C() {
                return this.A04;
            }

            public final C04996w A0D() {
                return this.A06;
            }
        };
        this.A01 = context;
        this.A05 = r2.A0B();
        this.A06 = r2.A0C();
        this.A04 = r2.A0A();
        this.A00 = r2.A09();
        this.A02 = c04715u;
        this.A03 = new C6B();
        this.A03.A01(this.A04);
        this.A07 = r2.A0D();
        this.A07.A03();
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e", "CatchGeneralException"})
    public static JSONObject A00() {
        JSONObject jsonSignalObject = new JSONObject();
        Map<Integer, C04765z<AbstractC04956s>> mapA03 = C04826f.A01().A03();
        if (mapA03 == null || mapA03.isEmpty()) {
            return jsonSignalObject;
        }
        try {
            for (Integer num : mapA03.keySet()) {
                List<AbstractC04956s> listA04 = mapA03.get(num).A04();
                JSONArray jSONArray = new JSONArray();
                Iterator<AbstractC04956s> it = listA04.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().A0A(true));
                }
                jsonSignalObject.put(num.toString(), jSONArray);
            }
        } catch (Throwable th) {
            AnonymousClass66.A04(th);
        }
        return jsonSignalObject;
    }

    @SuppressLint({"BadMethodUse-java.lang.System.currentTimeMillis"})
    private void A01(String str, EnumC04816e enumC04816e, EnumC04856i enumC04856i) {
        AnonymousClass64 anonymousClass64A0Y = this.A02.A0Y();
        if (anonymousClass64A0Y != null) {
            int sessionEndTime = (int) (System.currentTimeMillis() / 1000);
            anonymousClass64A0Y.A8M(AnonymousClass71.A05(), str, this.A00, enumC04816e.A03(), sessionEndTime, A00(), enumC04856i);
        }
        AnonymousClass71.A0C(this.A02, AnonymousClass61.A07.A02(), str);
    }

    public final void A02() {
        this.A03.A00();
    }

    public final void A03(EnumC04816e enumC04816e) {
        this.A04.A04(enumC04816e, this.A01);
    }

    public final void A04(EnumC04836g enumC04836g, EnumC04816e enumC04816e, @Nullable String str) {
        A05(enumC04836g, enumC04816e, str, EnumC04856i.A04);
    }

    public final void A05(EnumC04836g enumC04836g, EnumC04816e enumC04816e, @Nullable String str, EnumC04856i enumC04856i) {
        this.A05.A05(enumC04816e);
        if (enumC04836g == EnumC04836g.A02) {
            this.A06.A04(enumC04816e);
            if (str != null) {
                A01(str, enumC04816e, enumC04856i);
            }
        }
    }

    public final boolean A06() {
        List<C04776a> listA03 = this.A05.A03();
        return (listA03 == null || listA03.isEmpty()) ? false : true;
    }
}
