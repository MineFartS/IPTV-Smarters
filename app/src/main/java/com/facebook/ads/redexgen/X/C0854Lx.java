package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0854Lx extends RelativeLayout implements Q0, P7, InterfaceC0957Py {
    public static String[] A0E;
    public static final KP A0F;
    public static final KJ A0G;
    public static final K5 A0H;
    public static final C0766Ij A0I;
    public static final C0765Ii A0J;
    public static final IV A0K;
    public static final IK A0L;
    public static final IF A0M;
    public int A00;
    public C0789Jg A01;
    public PB A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final Handler A08;
    public final View.OnTouchListener A09;
    public final X2 A0A;
    public final C9E<C9F, C9D> A0B;
    public final List<PE> A0C;
    public final InterfaceC0956Px A0D;

    public static void A0H() {
        A0E = new String[]{"bTF0mPynjITMPKd7AWnGFE0wjuUHqGk", "NLuteA0O4hImypGMVaagZ7KROvpQko", "vHIsSgA1dNPe0TxNLDw8T5r", "Tu3OEd7", "fTm", "FLX2LFKD3Z9kyRG7iyj3Ajj18EKg1", "ES7oyLysdjBWPeOJZDQ9P8Sn", "e8"};
    }

    static {
        A0H();
        A0H = new K5();
        A0F = new KP();
        A0I = new C0766Ij();
        A0J = new C0765Ii();
        A0G = new KJ();
        A0K = new IV();
        A0M = new IF();
        A0L = new IK();
    }

    public C0854Lx(X2 x2) {
        super(x2);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C9E<>();
        this.A05 = false;
        this.A06 = true;
        this.A00 = 200;
        this.A09 = new P5(this);
        this.A0A = x2;
        if (A0P(x2)) {
            this.A0D = new GV(x2);
        } else {
            this.A0D = new GH(x2);
        }
        A0F();
    }

    public C0854Lx(X2 x2, AttributeSet attributeSet) {
        super(x2, attributeSet);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C9E<>();
        this.A05 = false;
        this.A06 = true;
        this.A00 = 200;
        this.A09 = new P5(this);
        this.A0A = x2;
        if (A0P(x2)) {
            this.A0D = new GV(x2, attributeSet);
        } else {
            this.A0D = new GH(x2, attributeSet);
        }
        A0F();
    }

    public C0854Lx(X2 x2, AttributeSet attributeSet, int i2) {
        super(x2, attributeSet, i2);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C9E<>();
        this.A05 = false;
        this.A06 = true;
        this.A00 = 200;
        this.A09 = new P5(this);
        this.A0A = x2;
        if (A0P(x2)) {
            this.A0D = new GV(x2, attributeSet, i2);
        } else {
            this.A0D = new GH(x2, attributeSet, i2);
        }
        A0F();
    }

    public static /* synthetic */ KJ A0B() {
        KJ kj = A0G;
        if (A0E[1].length() != 30) {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[2] = "s0JISK";
        strArr[2] = "s0JISK";
        return kj;
    }

    public static /* synthetic */ K5 A0C() {
        K5 k5 = A0H;
        if (A0E[0].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[6] = "XnBln0F0zo0j2g49JSScdoR2";
        strArr[6] = "XnBln0F0zo0j2g49JSScdoR2";
        return k5;
    }

    private void A0F() {
        this.A0A.A0A().A2u();
        this.A0D.setRequestedVolume(1.0f);
        this.A0D.setVideoStateChangeListener(this);
        this.A02 = new PB(this.A0A, this.A0D);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
        setOnTouchListener(this.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G() {
        this.A07.postDelayed(new C0867Mk(this), this.A00);
    }

    private final void A0I() {
        for (PE plugin : this.A0C) {
            if (plugin instanceof KS) {
                A0N((KS) plugin);
            }
            plugin.A7w(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(EnumC0788Jf enumC0788Jf) {
        C0789Jg c0789Jg = this.A01;
        if (c0789Jg == null) {
            return;
        }
        c0789Jg.A03(enumC0788Jf, null);
    }

    private void A0M(PE pe) {
        if (pe instanceof KS) {
            A0O((KS) pe);
        }
        pe.ADd(this);
    }

    private void A0N(KS ks) {
        if (ks.getParent() == null) {
            if (ks instanceof C7V) {
                this.A02.A01(ks);
            } else {
                addView(ks);
            }
        }
    }

    private void A0O(KS ks) {
        if (ks instanceof C7V) {
            this.A02.A02(ks);
        } else {
            C0856Lz.A0M(ks);
        }
    }

    private boolean A0P(X2 x2) {
        if (GV.A09()) {
            boolean zA1c = JT.A1c(x2);
            if (A0E[2].length() == 19) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[0] = "Y2Yi8VJKipCio7lj7Ydrs3ww6YI9yuS";
            strArr[0] = "Y2Yi8VJKipCio7lj7Ydrs3ww6YI9yuS";
            if (zA1c) {
                return true;
            }
        }
        return false;
    }

    public final void A0S() {
        this.A0D.setVideoStateChangeListener(null);
        this.A0D.destroy();
    }

    public final void A0T() {
        if (A0f()) {
            return;
        }
        this.A0D.A7J();
    }

    public final void A0U() {
        Iterator<PE> it = this.A0C.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0E[0].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[0] = "GYUlZXdJo7nruMh2UHaMalRUd7rYm0D";
            strArr[0] = "GYUlZXdJo7nruMh2UHaMalRUd7rYm0D";
            if (zHasNext) {
                PE plugin = it.next();
                A0M(plugin);
            } else {
                this.A0C.clear();
                String[] strArr2 = A0E;
                if (strArr2[4].length() != strArr2[3].length()) {
                    String[] strArr3 = A0E;
                    strArr3[4] = "dBG";
                    strArr3[3] = "pEPub8w";
                    return;
                }
                return;
            }
        }
    }

    public final void A0V(int i2) {
        this.A07.removeCallbacksAndMessages(null);
        this.A0D.seekTo(i2);
    }

    public final void A0W(int i2) {
        this.A0D.ADR(i2);
    }

    public final void A0X(P9 p9) {
        this.A08.post(new C0864Mh(this));
        this.A0D.ADH(p9.A02());
    }

    public final void A0Y(PD pd, int i2) {
        if (this.A03 && this.A0D.getState() == EnumC0958Pz.A06) {
            this.A03 = false;
        }
        this.A0D.ADL(pd, i2);
    }

    public final void A0Z(PE pe) {
        this.A0C.add(pe);
    }

    public final void A0a(PE pe) {
        this.A0C.remove(pe);
        A0M(pe);
    }

    public final void A0b(boolean z, int i2) {
        if (A0f()) {
            return;
        }
        this.A0D.ABa(z, i2);
        this.A05 = z;
    }

    public final void A0c(boolean z, boolean z2, int i2) {
        this.A06 = z2;
        A0b(z, i2);
    }

    public final boolean A0d() {
        return this.A0D.A7Q();
    }

    public final boolean A0e() {
        return getVolume() == 0.0f;
    }

    public final boolean A0f() {
        return getState() == EnumC0958Pz.A05;
    }

    public final boolean A0g() {
        return A0f() && this.A05;
    }

    public final boolean A0h() {
        return getState() == EnumC0958Pz.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.P7
    public final boolean A7g() {
        return A0P(this.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.P7
    public final boolean A7i() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void AAv(int i2, int i3) {
        this.A08.post(new C0865Mi(this, i2, i3));
        A0G();
    }

    @Override // com.facebook.ads.redexgen.X.Q0
    public final void ABP(EnumC0958Pz enumC0958Pz) {
        int currentPositionInMillis = getCurrentPositionInMillis();
        this.A08.post(new C0866Mj(this, enumC0958Pz, getDuration(), currentPositionInMillis));
    }

    @Override // com.facebook.ads.redexgen.X.P7
    public int getCurrentPositionInMillis() {
        return this.A0D.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0D.getDuration();
    }

    @NonNull
    public C9E<C9F, C9D> getEventBus() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.P7
    public long getInitialBufferTime() {
        return this.A0D.getInitialBufferTime();
    }

    public EnumC0958Pz getState() {
        return this.A0D.getState();
    }

    public Handler getStateHandler() {
        return this.A08;
    }

    public TextureView getTextureView() {
        return (TextureView) this.A0D;
    }

    public int getVideoHeight() {
        return this.A0D.getVideoHeight();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.P7
    public PD getVideoStartReason() {
        return this.A0D.getStartReason();
    }

    public View getVideoView() {
        return this.A02;
    }

    public int getVideoWidth() {
        return this.A0D.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.X.P7
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.P7
    public float getVolume() {
        return this.A0D.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0B.A03(A0L);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0B.A03(A0M);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        InterfaceC0956Px interfaceC0956Px = this.A0D;
        if (interfaceC0956Px != null) {
            interfaceC0956Px.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(C0789Jg c0789Jg) {
        this.A01 = c0789Jg;
    }

    public void setIsFullScreen(boolean z) {
        this.A04 = z;
        this.A0D.setFullScreen(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(@Nullable String str) {
        this.A0D.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i2) {
        this.A00 = i2;
    }

    public void setVideoURI(@Nullable Uri uri) {
        if (uri == null) {
            A0U();
        } else {
            A0I();
            this.A0D.setup(uri);
        }
        this.A03 = false;
    }

    public void setVideoURI(@Nullable String str) {
        this.A0A.A0A().A31(str);
        setVideoURI(str != null ? Uri.parse(str) : null);
    }

    public void setVolume(float f2) {
        if (f2 == 1.0f) {
            A0J(EnumC0788Jf.A0b);
            this.A0A.A0A().A35();
        } else {
            A0J(EnumC0788Jf.A0a);
            this.A0A.A0A().A34();
        }
        this.A0D.setRequestedVolume(f2);
        C9E<C9F, C9D> eventBus = getEventBus();
        if (A0E[2].length() == 19) {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[2] = "etD2zaPMct9y2wbR2YehsJmmTem";
        strArr[2] = "etD2zaPMct9y2wbR2YehsJmmTem";
        eventBus.A03(A0K);
    }
}
