package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RV extends AbstractRunnableC0829Kx {
    public static byte[] A01;
    public static String[] A02;
    public final /* synthetic */ String A00;

    static {
        A03();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = (bArrCopyOfRange[i5] - i4) - 47;
            if (A02[6].charAt(27) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[5] = "CuQnTMvQt2iEBPylhK7T15";
            strArr[1] = "FSZFy24WJ9CShZHmahty6u";
            bArrCopyOfRange[i5] = (byte) i6;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        if (A02[6].charAt(27) != 'c') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[3] = "LuOw";
        strArr[3] = "LuOw";
        A01 = new byte[]{-99, -87, -100, -88, -84, -100, -91, -102, -80, -106, -102, -104, -89, -89, -96, -91, -98};
    }

    public static void A03() {
        A02 = new String[]{"CdCLIQRd", "Gozok8EGiq89CC7S8QZsNr", "pl5lQHAXyLio1ost", "M44cRouQCRL7K0vypo2P04DU", "Y2GzUIW8g3L", "Bs9wehYqNd3BdGUVOwkaAN", "ajmsB695tQiR2xtfKUGvlSwazulcZzs7", "Sy9bhDNhoUd7kDt0yrvFBLns12VVbk64"};
    }

    public RV(String str) {
        this.A00 = str;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        try {
            C03450u.A04.await();
            synchronized (C03450u.A00) {
                Iterator<String> itKeys = C03450u.A00.A04().keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C03450u.A0J(this.A00)) {
                        C03450u.A0C((C1K) C03450u.A00.A04().get(next), next, next.equals(this.A00));
                    }
                }
                C03450u.A00.A05();
                C03450u.A0A();
            }
        } catch (InterruptedException e2) {
            C03450u.A01.A04().A86(A00(0, 17, 8), C05228d.A0w, new C05238e(e2));
        } catch (JSONException e3) {
            C03450u.A08();
            C03450u.A01.A04().A86(A00(0, 17, 8), C05228d.A0v, new C05238e(e3));
        }
    }
}
