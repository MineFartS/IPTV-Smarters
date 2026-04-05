package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.mirror.NativeViewabilityLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class K1 implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ C8C A00;
    public final /* synthetic */ K4 A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{3, 27, 5, 60, 61, 39, 32, 59, 38, 45, 89, 78, 91, 68, 89, 95, 66, 69, 76, 54, 33, 53, 49, 33, 55, 48, 27, 45, 32};
    }

    public K1(K4 k4, String str, C8C c8c) {
        this.A01 = k4;
        this.A02 = str;
        this.A00 = c8c;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ArrayList<NativeViewabilityLogger.ViewabilityRecord> clone;
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            C05238e c05238e = new C05238e(A00(0, 3, 52));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, 45), jSONArray);
            jSONObject.put(A00(19, 10, 61), this.A02);
            synchronized (this.A01.A0D) {
                clone = new ArrayList<>(this.A01.A0D);
                this.A01.A0D.clear();
            }
            Iterator<NativeViewabilityLogger.ViewabilityRecord> it = clone.iterator();
            while (it.hasNext()) {
                K3 k3 = (K3) it.next();
                jSONArray.put(A00(0, 0, 60) + k3.A00 + ';' + k3.A02 + ';' + k3.A01);
            }
            c05238e.A05(jSONObject);
            c05238e.A03(1);
            this.A00.A04().A87(A00(10, 9, 82), C05228d.A22, c05238e);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
