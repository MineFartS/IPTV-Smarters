package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1U, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1U extends C2A implements InterfaceC0916Oi {
    public static String[] A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MW A04;
    public boolean A05;
    public final C05629s A06;

    static {
        A02();
    }

    public static void A02() {
        A07 = new String[]{"T7MK6mm4Fzbg8PTMnM4kcHpb21LLpIaw", "PTQtUxKdjysMmbj8hCZsGKEwd1IRWqqZ", "Zw8mt4VncD", "79VYCrnrWW", "2MnAMBnkkiKtyd2cP7mHhabJycDYuMiE", "jaMauIT7sdi", "OgIH7ZaBRtH9hoDgrnw", "xZmsCngT77DU5lblEiekqTVKPqNdsast"};
    }

    public C1U(X2 x2) {
        super(x2);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C05629s(x2, new C0913Of(), new C0912Oe());
        A01();
    }

    public C1U(X2 x2, AttributeSet attributeSet) {
        super(x2, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C05629s(x2, new C0913Of(), new C0912Oe());
        A01();
    }

    public C1U(X2 x2, AttributeSet attributeSet, int i2) {
        super(x2, attributeSet, i2);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C05629s(x2, new C0913Of(), new C0912Oe());
        A01();
    }

    private int A00(int availableWidth) {
        int numFullItems = this.A00 * 2;
        int itemSize = (getMeasuredWidth() - getPaddingLeft()) - numFullItems;
        int iA0E = getAdapter().A0E();
        int i2 = 0;
        int numItems = Integer.MAX_VALUE;
        while (numItems > availableWidth) {
            i2++;
            if (i2 >= iA0E) {
                return availableWidth;
            }
            int numItems2 = i2 * numFullItems;
            numItems = (int) ((itemSize - numItems2) / (i2 + 0.333f));
        }
        return numItems;
    }

    private void A01() {
        this.A06.A2F(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        C0856Lz.A0N(this);
    }

    private void A03(int i2, int i3) {
        if (i2 == this.A03 && i3 == this.A02) {
            return;
        }
        this.A03 = i2;
        if (A07[1].charAt(11) == 'q') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[6] = "hNBaptvkpj";
        strArr[6] = "hNBaptvkpj";
        this.A02 = i3;
        if (this.A04 != null) {
            throw null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2A
    public final void A23(int i2, boolean z) {
        super.A23(i2, z);
        A03(i2, 0);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0916Oi
    public final int A6q(int i2) {
        int iAbs = Math.abs(i2);
        if (iAbs <= ((C2A) this).A06) {
            return 0;
        }
        int i3 = this.A01;
        if (i3 == 0) {
            return 1;
        }
        return 1 + (iAbs / i3);
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C0660Eb, android.view.View
    public final void onMeasure(int i2, int itemSize) {
        int iRound;
        int iA00;
        super.onMeasure(i2, itemSize);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A05) {
            iRound = (((int) C0856Lz.A01) * JT.A0B(getContext())) + paddingTop;
        } else {
            iRound = Math.round(getMeasuredWidth() / 1.91f);
        }
        int mode = View.MeasureSpec.getMode(itemSize);
        if (mode == Integer.MIN_VALUE) {
            iRound = Math.min(View.MeasureSpec.getSize(itemSize), iRound);
        } else if (mode == 1073741824) {
            iRound = View.MeasureSpec.getSize(itemSize);
        }
        int i3 = iRound - paddingTop;
        if (this.A05) {
            iA00 = Math.min(MT.A09, i3);
        } else {
            iA00 = A00(i3);
        }
        setMeasuredDimension(getMeasuredWidth(), iA00 + paddingTop);
        if (!this.A05) {
            setChildWidth((this.A00 * 2) + iA00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0660Eb
    public void setAdapter(@Nullable AnonymousClass43 anonymousClass43) {
        this.A06.A2M(anonymousClass43 == null ? -1 : anonymousClass43.hashCode());
        super.setAdapter(anonymousClass43);
    }

    public void setChildSpacing(int i2) {
        this.A00 = i2;
    }

    public void setChildWidth(int i2) {
        this.A01 = i2;
        int measuredWidth = getMeasuredWidth();
        this.A06.A2N((((measuredWidth - getPaddingLeft()) - getPaddingRight()) - this.A01) / 2);
        this.A06.A2L(((double) this.A01) / ((double) measuredWidth));
    }

    public void setCurrentPosition(int i2) {
        A23(i2, false);
    }

    public void setOnPageChangedListener(MW mw) {
        this.A04 = mw;
    }

    public void setShowTextInCarousel(boolean z) {
        this.A05 = z;
    }
}
