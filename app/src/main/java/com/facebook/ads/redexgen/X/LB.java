package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LB {
    public static byte[] A00;
    public static String[] A01;
    public static final Package A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final Set<X2> A06;
    public static final AtomicReference<LF> A07;

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-111, -92, -89, -79, -70, -62, -92, -89, -62, -78, -91, -83, -62, -84, -89, -62, -82, -88, -68, -68, -49, -46, -36, -27, -19, -35, -32, -41, -43, -41, -36, -49, -38, -19, -45, -26, -30, -32, -49, -31, 102, 121, 124, -122, -113, -105, -117, 121, -114, 125, 124, -105, -117, -116, 121, -116, 125, -105, 124, 121, -116, 121, -57, -43, -22, -39, -40, -108, -25, -24, -43, -24, -39, -108, -42, -23, -30, -40, -32, -39, -108, -35, -25, -108, -39, -31, -28, -24, -19, -107};
    }

    public static void A08() {
        A01 = new String[]{"R2O7PMYP6nkOeNui3I4WlXx4fu7rpRKA", "y", "n9RLgUbY6qPVyxnn4C2MCNq6tOX6tKMu", "KtI8XvYnNiAs4lVQz", "VIjGruAAxxfbDEfj8", "jnPluIPOifq7BY1vqnqKLiUetY3DHsfM", "J5aiTqmsNT2689NKU", "zCaDldCe0EtEl2h3W"};
    }

    static {
        A08();
        A07();
        A02 = LB.class.getPackage();
        A04 = A02 + A06(40, 22, 38);
        A03 = A02 + A06(0, 19, 81);
        A05 = A02 + A06(19, 21, 124);
        A06 = Collections.newSetFromMap(new WeakHashMap());
        A07 = new AtomicReference<>();
    }

    public static Intent A00(Intent cloneIntent) {
        Intent intentCloneFilter = cloneIntent.cloneFilter();
        intentCloneFilter.setFlags(cloneIntent.getFlags());
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(cloneIntent.getExtras());
        intentCloneFilter.putExtra(A05, parcelObtain.marshall());
        parcelObtain.recycle();
        return intentCloneFilter;
    }

    public static Intent A01(Intent startIntent, ClassLoader classLoader) {
        Intent intentCloneFilter = startIntent.cloneFilter();
        intentCloneFilter.setFlags(startIntent.getFlags());
        Bundle bundle = new Bundle();
        Parcel parcelObtain = Parcel.obtain();
        byte[] byteArrayExtra = startIntent.getByteArrayExtra(A05);
        if (byteArrayExtra != null) {
            parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            parcelObtain.setDataPosition(0);
            bundle = parcelObtain.readBundle(classLoader);
            parcelObtain.recycle();
        }
        intentCloneFilter.putExtras(bundle);
        return intentCloneFilter;
    }

    public static Bundle A02(Bundle bundle, ClassLoader classLoader) {
        Parcel parcelObtain = Parcel.obtain();
        byte[] byteArray = bundle.getByteArray(A04);
        if (byteArray != null) {
            parcelObtain.unmarshall(byteArray, 0, byteArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle2 = parcelObtain.readBundle(classLoader);
            parcelObtain.recycle();
            String[] strArr = A01;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "08vXapB5qdF8q1e2g";
            strArr2[3] = "bPV7EQI3jYdBWJzP2";
            return bundle2;
        }
        throw new IllegalStateException(A06(62, 28, 98));
    }

    @Nullable
    public static X2 A03(Intent intent) {
        String adId = intent.getStringExtra(A03);
        if (adId != null) {
            for (X2 x2 : A06) {
                if (adId.equals(x2.A0A().getId())) {
                    return x2;
                }
            }
            return null;
        }
        return null;
    }

    public static AdActivityIntent A04(X2 x2) {
        AdActivityIntent adActivityIntent = new AdActivityIntent(x2.getApplicationContext(), A05());
        adActivityIntent.putExtra(A03, x2.A0A().getId());
        A06.add(x2);
        return adActivityIntent;
    }

    public static Class A05() {
        if (A01[1].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "4NnM5dRGBMW0KGxzs";
        strArr[3] = "N6FCbEqQMIqNBYuck";
        return AudienceNetworkActivity.class;
    }

    public static void A09(Bundle bundle, Bundle bundle2) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle2);
        bundle.putByteArray(A04, parcelObtain.marshall());
        parcelObtain.recycle();
    }

    public static void A0A(X2 x2, AdActivityIntent adActivityIntent) {
        x2.getApplicationContext().startActivity(A00(adActivityIntent));
    }

    public static boolean A0B(Intent intent, Set<String> set) {
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        String prefix = data.toString();
        for (String url : set) {
            if (prefix.startsWith(url)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0C(X2 x2, Intent intent) {
        return A0D(x2, intent, A07.get());
    }

    @VisibleForTesting
    public static boolean A0D(X2 x2, Intent intent, @Nullable LF lf) {
        if (A0B(intent, JT.A0T(x2))) {
            return false;
        }
        Context context = x2;
        String[] strArr = A01;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "W";
        strArr2[1] = "W";
        Activity activityA09 = x2.A09();
        if (activityA09 != null) {
            context = activityA09;
        } else {
            intent.addFlags(268435456);
        }
        if (lf == null || A0B(intent, JT.A0V(x2))) {
            context.startActivity(intent);
            return true;
        }
        return lf.startActivity(context, intent);
    }
}
