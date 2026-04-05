package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.facebook.ads.internal.shield.NoAutoExceptionHandling;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ku, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@NoAutoExceptionHandling
@SuppressLint({"EmptyCatchBlock", "CatchGeneralException", "WrongCall"})
public final class C0826Ku extends FrameLayout {
    public static String[] A00;
    public static final AtomicBoolean A01;
    public static final AtomicReference<InterfaceC0820Kn> A02;

    public static void A00() {
        A00 = new String[]{"8uiZfgsmrD5w7H2sVgAC3n2gJlRDmu8", "AcResxUzczeVQ6", "S", "DeJxumnd3y1WcfHk", "FMZxMK7lmQCPA", "J", "wc3PTdtI7w7wp63NJxsDpEHsC40vb1e2", "jaoFPfR2hwKJJkyxUt0jn5KhPySOFpSP"};
    }

    static {
        A00();
        A01 = new AtomicBoolean();
        A02 = new AtomicReference<>();
    }

    private final void A01() {
        super.onAttachedToWindow();
    }

    private final void A02() {
        super.onDetachedFromWindow();
    }

    private final void A03() {
        super.onFinishInflate();
    }

    private final void A04(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    private final void A05(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    private final void A06(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
    }

    private final void A07(Canvas canvas) {
        super.onDraw(canvas);
    }

    private void A08(Throwable th) {
        L4.A00().A7x(3305, th);
        InterfaceC0820Kn interfaceC0820Kn = A02.get();
        if (interfaceC0820Kn != null) {
            interfaceC0820Kn.ACU(th, this);
        }
    }

    private final void A09(boolean z) {
        super.onWindowFocusChanged(z);
    }

    private final void A0A(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
    }

    private final void A0B(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
    }

    public static void A0C(boolean z, InterfaceC0820Kn interfaceC0820Kn) {
        A01.set(z);
        A02.set(interfaceC0820Kn);
    }

    private final boolean A0D() {
        return super.performClick();
    }

    private final boolean A0E(int i2, KeyEvent keyEvent) {
        return super.onKeyDown(i2, keyEvent);
    }

    private final boolean A0F(int i2, KeyEvent keyEvent) {
        return super.onKeyUp(i2, keyEvent);
    }

    private final boolean A0G(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    private final boolean A0H(MotionEvent motionEvent) {
        return super.onTrackballEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        try {
            A01();
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                super.onAttachedToWindow();
                return;
            }
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        try {
            A02();
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                super.onDetachedFromWindow();
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            A07(canvas);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                super.onDraw(canvas);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        try {
            A03();
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                super.onFinishInflate();
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i2, Rect rect) {
        try {
            A0B(z, i2, rect);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                super.onFocusChanged(z, i2, rect);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        try {
            return A0E(i2, keyEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                return super.onKeyDown(i2, keyEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        try {
            return A0F(i2, keyEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                return super.onKeyUp(i2, keyEvent);
            }
            throw th;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        try {
            A0A(z, i2, i3, i4, i5);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                super.onLayout(z, i2, i3, i4, i5);
                return;
            }
            throw th;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        try {
            A05(i2, i3);
        } catch (Throwable th) {
            AtomicBoolean atomicBoolean = A01;
            String[] strArr = A00;
            if (strArr[2].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[2] = "Z";
            strArr2[5] = "w";
            if (atomicBoolean.get()) {
                A08(th);
                String[] strArr3 = A00;
                if (strArr3[2].length() != strArr3[5].length()) {
                    String[] strArr4 = A00;
                    strArr4[2] = "i";
                    strArr4[5] = "g";
                    super.onMeasure(i2, i3);
                    return;
                }
                String[] strArr5 = A00;
                strArr5[7] = "vkL4fX6PzwoldXVPCJAguywdSt35bgjD";
                strArr5[6] = "pKAP23q7ywaPjJvUhcEhiH7V9bs9jrQJ";
                super.onMeasure(i2, i3);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        try {
            A06(i2, i3, i4, i5);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                super.onSizeChanged(i2, i3, i4, i5);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return A0G(motionEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                return super.onTouchEvent(motionEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        try {
            return A0H(motionEvent);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                return super.onTrackballEvent(motionEvent);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        try {
            A09(z);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                super.onWindowFocusChanged(z);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        try {
            A04(i2);
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                super.onWindowVisibilityChanged(i2);
                return;
            }
            throw th;
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        try {
            return A0D();
        } catch (Throwable th) {
            if (A01.get()) {
                A08(th);
                return super.performClick();
            }
            throw th;
        }
    }
}
