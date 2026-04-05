package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Message;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6A, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6A {

    @Nullable
    public static C6A A07;
    public static String[] A08;
    public static final AtomicBoolean A09;
    public AnonymousClass69 A00 = new AnonymousClass69(this, C05016y.A00().A04().getLooper());
    public C6J A01;
    public C6K A02;
    public List<C6N> A03;
    public final Context A04;
    public final C04715u A05;
    public final EnumC04846h A06;

    public static void A02() {
        A08 = new String[]{"lhELmGRUtbYPcwJFNCjn5HfCntRtzqQU", "Mt1hbHTlPicMeG4rtX3JBcBhsjGdj", "WXTUL6dhKmyeG13MmR9X1nSF3ta0T4v7", "pnvqG2PyjZWupJIeMnGxGNF5M9wfPV2M", "tVIu8wQwIUzvrLJUsX9QEkuDOevngDVu", "qDTAVfu3jvCTQwnOSiE3SjcB7mVx4hBM", "klm6aBATY902pfwdRKxrpHOkJcym9ne5", "D4wxrsR0ab6WquJuKpvZlDWLQMdeNXqb"};
    }

    static {
        A02();
        A09 = new AtomicBoolean();
    }

    public C6A(C04715u c04715u, Context context) {
        this.A05 = c04715u;
        this.A04 = context;
        this.A06 = c04715u.A0a();
    }

    public static synchronized C6A A00(Context context, C04715u c04715u) {
        if (A07 == null) {
            A07 = new C6A(c04715u, context);
        }
        return A07;
    }

    private synchronized void A03() {
        A09.set(false);
        this.A03 = new ArrayList();
        String[] strArr = A08;
        if (strArr[2].charAt(18) != strArr[4].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "OJ9tJzFQNQxQ8qaEQfi4ar7y8Z5YVilt";
        strArr2[1] = "oKX4c494QlidqOlhH9QFYLNn1ihcq";
    }

    public final synchronized void A04() {
        if (this.A01 != null) {
            this.A01.A04(this.A03);
        }
        A03();
    }

    public final synchronized void A05(Map<Integer, C04776a> map, EnumC04816e enumC04816e) {
        A03();
        C6E c6e = new C6E(this.A05, map);
        for (Map.Entry<Integer, C04776a> entry : map.entrySet()) {
            C04776a bdSignal = entry.getValue();
            if (bdSignal != null && bdSignal.A04(enumC04816e)) {
                int iIntValue = entry.getKey().intValue();
                if (iIntValue != 10800) {
                    switch (iIntValue) {
                        case 10810:
                            this.A03.add(C6N.A04);
                            break;
                        case 10811:
                            this.A03.add(C6N.A08);
                            break;
                        case 10812:
                            this.A03.add(C6N.A0A);
                            break;
                        case 10813:
                            this.A03.add(C6N.A07);
                            break;
                        case 10814:
                            this.A03.add(C6N.A0B);
                            break;
                        case 10815:
                            this.A03.add(C6N.A0C);
                            break;
                        case 10816:
                            this.A03.add(C6N.A0E);
                            break;
                        case 10817:
                            this.A03.add(C6N.A09);
                            break;
                        case 10818:
                            this.A03.add(C6N.A06);
                            break;
                        case 10819:
                            this.A03.add(C6N.A05);
                            break;
                        case 10820:
                            this.A03.add(C6N.A0D);
                            break;
                    }
                } else {
                    this.A02 = new C6K(this.A04, c6e, this.A06);
                    A09.set(true);
                }
            }
        }
        this.A01 = new C6J(this.A04, c6e, this.A06);
        this.A01.A03(this.A03);
        if (!this.A00.getLooper().getThread().isAlive()) {
            this.A00 = new AnonymousClass69(this, C05016y.A00().A04().getLooper());
        }
    }

    public final synchronized boolean A06(MotionEvent motionEvent) {
        if (!A09.get()) {
            return false;
        }
        Message message = new Message();
        message.what = AnonymousClass68.A03.ordinal();
        message.obj = motionEvent;
        this.A00.sendMessage(message);
        return true;
    }
}
