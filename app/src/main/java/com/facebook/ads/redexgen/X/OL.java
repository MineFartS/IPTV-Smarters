package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OL extends C4X {
    public static String[] A0A;

    @DoNotStrip
    public Q1 A00;
    public Q2 A01;

    @Nullable
    public Q2 A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final SparseBooleanArray A07;
    public final X2 A08;
    public final R6 A09;

    static {
        A08();
    }

    public static void A08() {
        A0A = new String[]{"av2tITPhYKbVn20ukUfJR25ELbcgjHbj", "MLeLe181lhP7dC21QqjxU1VDKV9lNkzJ", "XUmY4VBJ2tlJWKlPJ7YkBdCsKtcC", "bK6oHsXedskfaWsjnVeS6YyvP0sRA20b", "BhCeFQN4dHt9z3MLE3p7bnIzhrf86Cw8", "mLW9T0fP2Q5Hob07hRXsv0QUH1fN4", "pNzPXZ5fcby2PvmlRsfUzns43oHDF5Mi", "3YktW7BrcDIc4Xw2f2zdWv5xFETbHIAE"};
    }

    public OL(R6 r6, SparseBooleanArray sparseBooleanArray, Q2 q2, int i2, int i3, int i4, int i5, X2 x2) {
        super(r6);
        this.A08 = x2;
        this.A09 = r6;
        this.A07 = sparseBooleanArray;
        this.A01 = q2;
        this.A03 = i2;
        this.A04 = i3;
        this.A05 = i4;
        this.A06 = i5;
    }

    private void A09(JZ jz, C0849Ls c0849Ls, String str, C0919Ol c0919Ol) {
        if (this.A07.get(c0919Ol.A02())) {
            return;
        }
        Q2 q2 = this.A02;
        if (q2 != null) {
            q2.A0X();
            if (A0A[4].charAt(16) != 'E') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[4] = "iteeE4SnfkkyQnEAEqI0za4snrHpWaXy";
            strArr[4] = "iteeE4SnfkkyQnEAEqI0za4snrHpWaXy";
            this.A02 = null;
        }
        this.A00 = new C0915Oh(this, str, c0919Ol, jz, c0919Ol.A04(), c0849Ls);
        this.A02 = new Q2(this.A09, 10, new WeakReference(this.A00), this.A08);
        this.A02.A0a(false);
        this.A02.A0Y(100);
        this.A02.A0Z(100);
        this.A09.setOnAssetsLoadedListener(new C0914Og(this, c0919Ol));
    }

    public final void A0m(C0919Ol c0919Ol, JZ jz, C7C c7c, C0849Ls c0849Ls, String videoUrl) {
        int iA02 = c0919Ol.A02();
        this.A09.setTag(-1593835536, Integer.valueOf(iA02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A03, -2);
        marginLayoutParams.setMargins(iA02 == 0 ? this.A04 : this.A05, 0, iA02 >= this.A06 + (-1) ? this.A04 : this.A05, 0);
        String strA07 = c0919Ol.A03().A0E().A07();
        String strA08 = c0919Ol.A03().A0E().A08();
        this.A09.setIsVideo(!TextUtils.isEmpty(strA08));
        if (this.A09.A0k()) {
            this.A09.setVideoPlaceholderUrl(strA07);
            this.A09.setVideoUrl(c7c.A0M(strA08));
        } else {
            this.A09.setImageUrl(strA07);
        }
        this.A09.setLayoutParams(marginLayoutParams);
        this.A09.setAdTitleAndDescription(c0919Ol.A03().A0F().A06(), c0919Ol.A03().A0F().A01());
        this.A09.setCTAInfo(c0919Ol.A03().A0G(), c0919Ol.A04());
        this.A09.A0i(c0919Ol.A04());
        A09(jz, c0849Ls, videoUrl, c0919Ol);
    }
}
