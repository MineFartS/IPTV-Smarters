package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.ThreadSafe;
import org.joda.time.DateTimeFieldType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ThreadSafe
@SuppressLint({"StaticFieldLeak"})
public final class C04725v {
    public static EnumC04816e A06;
    public static byte[] A07;
    public static String[] A08;
    public static final AtomicReference<C04725v> A09;
    public C04745x A00;
    public C6P A01;
    public final Context A02;
    public final C04715u A03;
    public final AtomicReference<C6A> A04 = new AtomicReference<>();
    public final AtomicReference<C1053Ts> A05 = new AtomicReference<>();

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{99, 101, 116, 127, 25, DateTimeFieldType.SECOND_OF_DAY, 92, 90, 114, 109, 113};
    }

    public static void A02() {
        A08 = new String[]{"eZKmHpMMDfaoBqW8nqrxEoXtMavqlqNM", "AtFM24PyHDF8", "75v22abHTVt154frUD1Ye4KyqdVteY4i", "Q1X3dzo1KUJ0DHl8HY6jDpMlStfBjogW", "z2ZYiDayfErc", "35EgzrmLPkhoCqMLba9eqfKFMV7fawsP", "opJsobvHgIMCHkez4yG45JKspLs2PehX", "oVaFSOpmfGo5v5TJJzClDpDAWRdHWsbi"};
    }

    static {
        A02();
        A01();
        A09 = new AtomicReference<>();
    }

    public C04725v(Context context, C04715u c04715u, EnumC04816e enumC04816e) {
        this.A02 = context;
        this.A03 = c04715u;
        this.A01 = new C6P(this.A02, this.A03);
        if (this.A04.get() == null && AnonymousClass71.A0F(enumC04816e)) {
            A03(enumC04816e);
        }
    }

    private synchronized void A03(EnumC04816e enumC04816e) {
        if (this.A04.get() == null) {
            AnonymousClass66.A03(this.A03.A0Z());
            C1053Ts c1053Ts = new C1053Ts(this.A03, this.A01);
            this.A05.set(c1053Ts);
            this.A00 = new C04745x();
            this.A00.A00(c1053Ts);
            if (this.A01.A06() && AnonymousClass71.A0F(enumC04816e)) {
                c1053Ts.A06(enumC04816e);
            }
            A06 = enumC04816e;
            this.A00.A01(enumC04816e);
            this.A04.set(C6A.A00(this.A02, this.A03));
        }
    }

    private boolean A04(EnumC04816e enumC04816e) {
        if (AnonymousClass71.A0F(enumC04816e)) {
            A03(enumC04816e);
        }
        if (enumC04816e.equals(A06)) {
            return false;
        }
        A06 = enumC04816e;
        C04745x c04745x = this.A00;
        if (c04745x != null) {
            c04745x.A01(enumC04816e);
        }
        if (A08[0].charAt(4) == 't') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[2] = "al3lqCaa3X6BhafyoLSdmdZ2qZ9PyUcx";
        strArr[2] = "al3lqCaa3X6BhafyoLSdmdZ2qZ9PyUcx";
        return true;
    }

    private boolean A05(String str, EnumC04856i enumC04856i) {
        if (!AnonymousClass71.A0F(A06) || this.A04.get() == null) {
            return false;
        }
        C6P c6p = this.A01;
        if (c6p != null) {
            c6p.A05(EnumC04836g.A02, A06, str, enumC04856i);
            return true;
        }
        return true;
    }

    @SuppressLint({"CatchGeneralException"})
    public final void A06(MotionEvent motionEvent) {
        try {
            if (this.A04.get() == null) {
                return;
            }
            this.A04.get().A06(motionEvent);
        } catch (Throwable th) {
            AnonymousClass66.A04(th);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final synchronized boolean A07(String str) {
        EnumC04856i enumC04856iA00;
        String string;
        if (str != null) {
            if (!str.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject(str).getJSONObject(A00(0, 2, 69));
                    if (jSONObject != null) {
                        zA04 = jSONObject.has(A00(6, 2, 106)) ? false | A04(EnumC04816e.A00(jSONObject.getInt(A00(6, 2, 106)))) : false;
                        JSONArray jSONArray = jSONObject.getJSONArray(A00(2, 2, 83));
                        if (jSONObject.has(A00(8, 3, 69))) {
                            enumC04856iA00 = EnumC04856i.A00(jSONObject.getInt(A00(8, 3, 69)));
                        } else {
                            enumC04856iA00 = EnumC04856i.A04;
                        }
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            if (jSONObject2.has(A00(4, 2, 52)) && (string = jSONObject2.getString(A00(4, 2, 52))) != null && !string.isEmpty()) {
                                AnonymousClass71.A0C(this.A03, AnonymousClass61.A04.A02(), string);
                                zA04 |= A05(string, enumC04856iA00);
                            }
                        }
                    } else {
                        return false;
                    }
                } catch (JSONException unused) {
                } catch (Throwable th) {
                    AnonymousClass66.A04(th);
                }
                return zA04;
            }
        }
        return false;
    }
}
