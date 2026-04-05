package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.facebook.ads.internal.adquality.AdQualityRule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SR implements InterfaceC0840Lj<Bundle> {
    public static byte[] A04;
    public AnonymousClass22 A00;
    public final View A01;
    public final X2 A02;
    public final List<SS> A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{126, 121, 108, 121, 100, 126, 121, 100, 110, 126, 106, 123, 109, 106, 109};
    }

    public SR(View view, List<AnonymousClass20> list, Bundle bundle, X2 x2) {
        this.A02 = x2;
        this.A01 = view;
        List<AdQualityRule> rules = new ArrayList<>(list.size());
        this.A03 = rules;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 15));
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.A03.add(new SS(list.get(i2), (Bundle) parcelableArrayList.get(i2)));
        }
        this.A00 = (AnonymousClass22) C0835Ld.A00(bundle.getByteArray(A00(0, 10, 28)));
    }

    public SR(View view, List<AnonymousClass20> list, X2 x2) {
        this.A02 = x2;
        this.A01 = view;
        this.A03 = new ArrayList(list.size());
        Iterator<AnonymousClass20> it = list.iterator();
        while (it.hasNext()) {
            this.A03.add(new SS(it.next()));
        }
        this.A00 = new AnonymousClass22();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 28), C0835Ld.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A03.size());
        Iterator<SS> it = this.A03.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().A06());
        }
        bundle.putParcelableArrayList(A00(10, 5, 15), arrayList);
        return bundle;
    }

    public final AnonymousClass22 A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        for (SS test : this.A03) {
            test.A07();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double viewableRatio, double d2) {
        if (d2 >= 0.0d) {
            this.A00.A05(viewableRatio, d2);
        }
        double dA00 = Q2.A0E(this.A01, 0, this.A02).A00();
        this.A00.A04(viewableRatio, dA00);
        Iterator<SS> it = this.A03.iterator();
        while (it.hasNext()) {
            it.next().A08(viewableRatio, dA00);
        }
    }
}
