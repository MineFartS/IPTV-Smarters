package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1257ai implements InterfaceC0668Ej<C1257ai, GQ> {
    public static String[] A0B;
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final Uri A07;
    public final GU A08;
    public final boolean A09;
    public final List<GM> A0A;

    static {
        A03();
    }

    public static void A03() {
        A0B = new String[]{"MZIolKXtwNquyPKzB78z3xL27fH", "v74uYGG7s6C8zgvEygWtTMzA8zc1ebAE", "JLnPnwELPKkmgNRcbIQ0Iwb0Sip", "ZW8Ccq7SdsBl3iggSI0P", "rKQ1cCiVY7LQfIMg0KZLPZldotcqfetV", "mIj9szAGFg5shG6bs4b", "v4hUMIVb1yK9Hg", "HTss6VvNxpaXsSYfhbMGYOx4TlzBHAoV"};
    }

    public C1257ai(long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, GU gu, Uri uri, List<GM> list) {
        List<GM> list2 = list;
        this.A00 = j2;
        this.A01 = j3;
        this.A02 = j4;
        this.A09 = z;
        this.A03 = j5;
        this.A06 = j6;
        this.A05 = j7;
        this.A04 = j8;
        this.A08 = gu;
        this.A07 = uri;
        this.A0A = list2 == null ? Collections.emptyList() : list2;
    }

    private final long A00(int i2) {
        if (i2 != this.A0A.size() - 1) {
            return this.A0A.get(i2 + 1).A00 - this.A0A.get(i2).A00;
        }
        long j2 = this.A01;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j2 - this.A0A.get(i2).A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0668Ej
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1257ai A4C(List<GQ> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new GQ(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i2 = 0;
        while (true) {
            int iA04 = A04();
            if (A0B[1].charAt(2) == '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[3] = "PsxlgmDU4xdAC3YWShpt";
            strArr[6] = "ZVt7Rm56NTjvcE";
            if (i2 < iA04) {
                int periodIndex = ((GQ) linkedList.peek()).A01;
                if (periodIndex != i2) {
                    long jA00 = A00(i2);
                    if (jA00 != -9223372036854775807L) {
                        j2 += jA00;
                    }
                } else {
                    GM gmA06 = A06(i2);
                    arrayList.add(new GM(gmA06.A01, gmA06.A00 - j2, A02(gmA06.A02, linkedList), gmA06.A03));
                }
                i2++;
            } else {
                long j3 = this.A01;
                return new C1257ai(this.A00, j3 != -9223372036854775807L ? j3 - j2 : -9223372036854775807L, this.A02, this.A09, this.A03, this.A06, this.A05, this.A04, this.A08, this.A07, arrayList);
            }
        }
    }

    public static ArrayList<GI> A02(List<GI> list, LinkedList<GQ> linkedList) {
        GQ gqPoll = linkedList.poll();
        int i2 = gqPoll.A01;
        ArrayList<GI> arrayList = new ArrayList<>();
        do {
            int i3 = gqPoll.A00;
            GI gi = list.get(i3);
            List<GP> list2 = gi.A03;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(gqPoll.A02));
                gqPoll = linkedList.poll();
                if (gqPoll.A01 != i2) {
                    break;
                }
            } while (gqPoll.A00 == i3);
            arrayList.add(new GI(gi.A00, gi.A01, arrayList2, gi.A02, gi.A04));
        } while (gqPoll.A01 == i2);
        linkedList.addFirst(gqPoll);
        if (A0B[5].length() != 19) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[3] = "FlMun1ypzz2g8aaw0qlT";
        strArr[6] = "uLMxv5QXiCAejq";
        return arrayList;
    }

    public final int A04() {
        return this.A0A.size();
    }

    public final long A05(int i2) {
        return C05639t.A00(A00(i2));
    }

    public final GM A06(int i2) {
        return this.A0A.get(i2);
    }
}
