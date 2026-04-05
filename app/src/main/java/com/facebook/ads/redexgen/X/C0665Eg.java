package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Eg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0665Eg extends T6 {
    public static TimeInterpolator A0B;
    public static String[] A0C;
    public ArrayList<C4X> A0A = new ArrayList<>();
    public ArrayList<C4X> A07 = new ArrayList<>();
    public ArrayList<C04143n> A09 = new ArrayList<>();
    public ArrayList<C04133m> A08 = new ArrayList<>();
    public ArrayList<ArrayList<C4X>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<C04143n>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<C04133m>> A03 = new ArrayList<>();
    public ArrayList<C4X> A00 = new ArrayList<>();
    public ArrayList<C4X> A04 = new ArrayList<>();
    public ArrayList<C4X> A06 = new ArrayList<>();
    public ArrayList<C4X> A02 = new ArrayList<>();

    static {
        A01();
    }

    public static void A01() {
        A0C = new String[]{"K3xavpXOVVnTPS8V8FmisIpuez1NdmFn", "QjoCrUVtXYT15qNhmppxWCsnlOvXMRWn", "HVYav4KnfeU3lAWSFDiSVAYelCZD7hW1", "SKhwmHHGUoQzTLK2kw5WKB1efbL3jYLm", "aZpNXGptJoOcjVlsPlgA0RFw1bcc4fI1", "y8DDj9eTKGlZyxtiH83YwnquX80t2qUq", "Eqht3urb", "PkOCx2w9GPXTa0iGANdHxOJetOGxrMw0"};
    }

    private void A02(C04133m c04133m) {
        if (c04133m.A05 != null) {
            A07(c04133m, c04133m.A05);
        }
        if (c04133m.A04 != null) {
            A07(c04133m, c04133m.A04);
        }
    }

    private void A03(final C4X c4x) {
        final View view = c4x.A0H;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A06.add(c4x);
        viewPropertyAnimatorAnimate.setDuration(A06()).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3h
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                view.setAlpha(1.0f);
                this.A02.A0Q(c4x);
                this.A02.A06.remove(c4x);
                this.A02.A0Y();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                this.A02.A0R(c4x);
            }
        }).start();
    }

    private void A04(C4X c4x) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        c4x.A0H.animate().setInterpolator(A0B);
        A0E(c4x);
    }

    private final void A05(List<C4X> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A06(List<C04133m> list, C4X c4x) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C04133m c04133m = list.get(size);
            if (A07(c04133m, c4x) && c04133m.A05 == null && c04133m.A04 == null) {
                list.remove(c04133m);
            }
        }
    }

    private boolean A07(C04133m c04133m, C4X c4x) {
        boolean z = false;
        if (c04133m.A04 == c4x) {
            c04133m.A04 = null;
        } else if (c04133m.A05 == c4x) {
            c04133m.A05 = null;
            z = true;
        } else {
            return false;
        }
        c4x.A0H.setAlpha(1.0f);
        c4x.A0H.setTranslationX(0.0f);
        c4x.A0H.setTranslationY(0.0f);
        A0S(c4x, z);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final void A0C() {
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            C04143n c04143n = this.A09.get(size);
            View view = c04143n.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0O(c04143n.A04);
            this.A09.remove(size);
        }
        for (int size2 = this.A0A.size() - 1; size2 >= 0; size2--) {
            A0Q(this.A0A.get(size2));
            this.A0A.remove(size2);
        }
        for (int size3 = this.A07.size() - 1; size3 >= 0; size3--) {
            C4X c4x = this.A07.get(size3);
            c4x.A0H.setAlpha(1.0f);
            A0M(c4x);
            this.A07.remove(size3);
        }
        for (int size4 = this.A08.size() - 1; size4 >= 0; size4--) {
            A02(this.A08.get(size4));
        }
        this.A08.clear();
        if (!A0F()) {
            return;
        }
        int listCount = this.A05.size();
        for (int i2 = listCount - 1; i2 >= 0; i2--) {
            ArrayList<C04143n> arrayList = this.A05.get(i2);
            int listCount2 = arrayList.size();
            for (int i3 = listCount2 - 1; i3 >= 0; i3--) {
                C04143n moveInfo = arrayList.get(i3);
                View view2 = moveInfo.A04.A0H;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                A0O(moveInfo.A04);
                arrayList.remove(i3);
                if (arrayList.isEmpty()) {
                    this.A05.remove(arrayList);
                }
            }
        }
        for (int size5 = this.A01.size() - 1; size5 >= 0; size5--) {
            ArrayList<C4X> arrayList2 = this.A01.get(size5);
            int i4 = arrayList2.size();
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                C4X item = arrayList2.get(i5);
                item.A0H.setAlpha(1.0f);
                A0M(item);
                arrayList2.remove(i5);
                if (arrayList2.isEmpty()) {
                    this.A01.remove(arrayList2);
                }
            }
        }
        for (int size6 = this.A03.size() - 1; size6 >= 0; size6--) {
            ArrayList<C04133m> arrayList3 = this.A03.get(size6);
            int j2 = arrayList3.size();
            for (int i6 = j2 - 1; i6 >= 0; i6--) {
                A02(arrayList3.get(i6));
                if (arrayList3.isEmpty()) {
                    this.A03.remove(arrayList3);
                }
            }
        }
        A05(this.A06);
        A05(this.A04);
        A05(this.A00);
        A05(this.A02);
        A09();
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0033 */
    @Override // com.facebook.ads.redexgen.X.C4B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0D() {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0665Eg.A0D():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
    
        r5 = r5 - 1;
     */
    @Override // com.facebook.ads.redexgen.X.C4B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0E(com.facebook.ads.redexgen.X.C4X r10) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0665Eg.A0E(com.facebook.ads.redexgen.X.4X):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    @Override // com.facebook.ads.redexgen.X.C4B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0F() {
        /*
            r4 = this;
            java.util.ArrayList<com.facebook.ads.redexgen.X.4X> r0 = r4.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc2
            java.util.ArrayList<com.facebook.ads.redexgen.X.3m> r0 = r4.A08
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc2
            java.util.ArrayList<com.facebook.ads.redexgen.X.3n> r0 = r4.A09
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc2
            java.util.ArrayList<com.facebook.ads.redexgen.X.4X> r0 = r4.A0A
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc2
            java.util.ArrayList<com.facebook.ads.redexgen.X.4X> r0 = r4.A04
            boolean r3 = r0.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0665Eg.A0C
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Laa
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0665Eg.A0C
            java.lang.String r1 = "HATKbuX1ioRbKjbJza4uRkbMkwnilInw"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "55W5G9gSwoJRpeM2nuMk9rdzPBhIsXI5"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto Lc2
            java.util.ArrayList<com.facebook.ads.redexgen.X.4X> r0 = r4.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc2
            java.util.ArrayList<com.facebook.ads.redexgen.X.4X> r0 = r4.A00
            boolean r3 = r0.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0665Eg.A0C
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La7
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0665Eg.A0C
            java.lang.String r1 = "PBqWGImhwZdo7IXQpaNFK9QlBHxMp4wk"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "PBqWGImhwZdo7IXQpaNFK9QlBHxMp4wk"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto Lc2
        L78:
            java.util.ArrayList<com.facebook.ads.redexgen.X.4X> r0 = r4.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc2
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.3n>> r0 = r4.A05
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc2
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.4X>> r0 = r4.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc2
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.3m>> r3 = r4.A03
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0665Eg.A0C
            r0 = 7
            r1 = r1[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            r0 = 119(0x77, float:1.67E-43)
            if (r1 == r0) goto Lb0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        La7:
            if (r3 == 0) goto Lc2
            goto L78
        Laa:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Lb0:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0665Eg.A0C
            java.lang.String r1 = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK"
            r0 = 7
            r2[r0] = r1
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lc4
        Lc2:
            r0 = 1
        Lc3:
            return r0
        Lc4:
            r0 = 0
            goto Lc3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0665Eg.A0F():boolean");
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final boolean A0G(@NonNull C4X c4x, @NonNull List<Object> list) {
        return !list.isEmpty() || super.A0G(c4x, list);
    }

    @Override // com.facebook.ads.redexgen.X.T6
    public final boolean A0U(C4X c4x) {
        A04(c4x);
        c4x.A0H.setAlpha(0.0f);
        this.A07.add(c4x);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.T6
    public final boolean A0V(C4X c4x) {
        A04(c4x);
        this.A0A.add(c4x);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.T6
    public final boolean A0W(C4X c4x, int i2, int i3, int i4, int i5) {
        View view = c4x.A0H;
        int deltaY = i2 + ((int) c4x.A0H.getTranslationX());
        int fromX = (int) c4x.A0H.getTranslationY();
        int i6 = i3 + fromX;
        A04(c4x);
        int fromY = i4 - deltaY;
        int i7 = i5 - i6;
        if (fromY == 0 && i7 == 0) {
            A0O(c4x);
            return false;
        }
        if (fromY != 0) {
            int deltaX = -fromY;
            view.setTranslationX(deltaX);
        }
        if (i7 != 0) {
            int deltaX2 = -i7;
            view.setTranslationY(deltaX2);
        }
        this.A09.add(new C04143n(c4x, deltaY, i6, i4, i5));
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.T6
    public final boolean A0X(C4X c4x, C4X c4x2, int deltaX, int deltaY, int i2, int i3) {
        if (c4x == c4x2) {
            return A0W(c4x, deltaX, deltaY, i2, i3);
        }
        float translationX = c4x.A0H.getTranslationX();
        float translationY = c4x.A0H.getTranslationY();
        float alpha = c4x.A0H.getAlpha();
        A04(c4x);
        int i4 = (int) ((i2 - deltaX) - translationX);
        int i5 = (int) ((i3 - deltaY) - translationY);
        c4x.A0H.setTranslationX(translationX);
        c4x.A0H.setTranslationY(translationY);
        c4x.A0H.setAlpha(alpha);
        if (c4x2 != null) {
            A04(c4x2);
            c4x2.A0H.setTranslationX(-i4);
            c4x2.A0H.setTranslationY(-i5);
            c4x2.A0H.setAlpha(0.0f);
        }
        this.A08.add(new C04133m(c4x, c4x2, deltaX, deltaY, i2, i3));
        return true;
    }

    public final void A0Y() {
        if (!A0F()) {
            A09();
        }
    }

    public final void A0Z(final C04133m c04133m) {
        final View view;
        C4X c4x = c04133m.A05;
        if (c4x == null) {
            view = null;
        } else {
            view = c4x.A0H;
        }
        C4X c4x2 = c04133m.A04;
        final View view2 = c4x2 != null ? c4x2.A0H : null;
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(A04());
            this.A02.add(c04133m.A05);
            duration.translationX(c04133m.A02 - c04133m.A00);
            duration.translationY(c04133m.A03 - c04133m.A01);
            ViewPropertyAnimator oldViewAnim = duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3k
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    this.A03.A0S(c04133m.A05, true);
                    this.A03.A02.remove(c04133m.A05);
                    this.A03.A0Y();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    this.A03.A0T(c04133m.A05, true);
                }
            });
            oldViewAnim.start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.A02.add(c04133m.A04);
            ViewPropertyAnimator newViewAnimation = viewPropertyAnimatorAnimate.translationX(0.0f);
            newViewAnimation.translationY(0.0f).setDuration(A04()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3l
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    viewPropertyAnimatorAnimate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    this.A03.A0S(c04133m.A04, false);
                    this.A03.A02.remove(c04133m.A04);
                    this.A03.A0Y();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    this.A03.A0T(c04133m.A04, false);
                }
            }).start();
        }
    }

    public final void A0a(final C4X c4x) {
        final View view = c4x.A0H;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A00.add(c4x);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(A03()).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3i
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                this.A02.A0M(c4x);
                this.A02.A00.remove(c4x);
                this.A02.A0Y();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                this.A02.A0N(c4x);
            }
        }).start();
    }

    public final void A0b(final C4X c4x, int i2, int i3, int i4, int deltaX) {
        final View view = c4x.A0H;
        final int i5 = i4 - i2;
        final int deltaX2 = deltaX - i3;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (deltaX2 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A04.add(c4x);
        ViewPropertyAnimator animation = viewPropertyAnimatorAnimate.setDuration(A05());
        animation.setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3j
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (deltaX2 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                this.A04.A0O(c4x);
                this.A04.A04.remove(c4x);
                this.A04.A0Y();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                this.A04.A0P(c4x);
            }
        }).start();
    }
}
