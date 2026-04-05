package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdChoicesViewApi;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04404o implements AdChoicesViewApi {
    public static byte[] A07;
    public static String[] A08;
    public TextView A00;
    public String A01;
    public boolean A02 = false;
    public final float A03 = C0856Lz.A01;
    public final AdChoicesView A04;
    public final NativeAdBase A05;
    public final X2 A06;

    static {
        A08();
        A07();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{56, 29, 58, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 26, 28, 10};
    }

    public static void A08() {
        A08 = new String[]{"gvO42MF", "iIdUVCS", "4ayqEVday587OvHv9KTxdb7b7wSBomyU", "oCu", "csOI", "U1PTH9OJfN", "wm8DLeb0fzTxf", "N58zr1rga3p3lU4dt8STYYI"};
    }

    public C04404o(AdChoicesView adChoicesView, Context context, NativeAdBase nativeAdBase) {
        this.A04 = adChoicesView;
        this.A06 = AnonymousClass52.A02(context);
        this.A05 = nativeAdBase;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private ImageView A00(C0803Ju c0803Ju) {
        ImageView imageView = new ImageView(this.A04.getContext());
        this.A04.addView(imageView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Math.round(c0803Ju.getWidth() * this.A03), Math.round(c0803Ju.getHeight() * this.A03));
        layoutParams.addRule(9);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(Math.round(this.A03 * 4.0f), Math.round(this.A03 * 2.0f), Math.round(this.A03 * 2.0f), Math.round(this.A03 * 2.0f));
        imageView.setLayoutParams(layoutParams);
        C1320bj.A0f(c0803Ju, imageView, this.A06);
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        Paint paint = new Paint();
        paint.setTextSize(this.A00.getTextSize());
        int iRound = Math.round(paint.measureText(this.A01) + (this.A03 * 4.0f));
        final int textWidth = this.A04.getWidth();
        final int targetWidth = textWidth - iRound;
        Animation animation = new Animation() { // from class: com.facebook.ads.redexgen.X.4m
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f2, Transformation transformation) {
                int i2 = (int) (textWidth + ((targetWidth - r2) * f2));
                this.A02.A04.getLayoutParams().width = i2;
                this.A02.A04.requestLayout();
                this.A02.A00.getLayoutParams().width = i2 - targetWidth;
                this.A02.A00.requestLayout();
            }

            @Override // android.view.animation.Animation
            public final boolean willChangeBounds() {
                return true;
            }
        };
        animation.setAnimationListener(new Animation.AnimationListener() { // from class: com.facebook.ads.redexgen.X.4n
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation2) {
                this.A00.A02 = false;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation2) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation2) {
            }
        });
        animation.setDuration(300L);
        animation.setFillAfter(true);
        this.A04.startAnimation(animation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        Paint paint = new Paint();
        paint.setTextSize(this.A00.getTextSize());
        int iRound = Math.round(paint.measureText(this.A01) + (this.A03 * 4.0f));
        final int textWidth = this.A04.getWidth();
        final int startWidth = textWidth + iRound;
        this.A02 = true;
        Animation expandAnimation = new Animation() { // from class: com.facebook.ads.redexgen.X.4k
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f2, Transformation transformation) {
                int i2 = (int) (textWidth + ((startWidth - r2) * f2));
                this.A02.A04.getLayoutParams().width = i2;
                this.A02.A04.requestLayout();
                this.A02.A00.getLayoutParams().width = i2 - textWidth;
                this.A02.A00.requestLayout();
            }

            @Override // android.view.animation.Animation
            public final boolean willChangeBounds() {
                return true;
            }
        };
        expandAnimation.setAnimationListener(new AnimationAnimationListenerC04374l(this));
        expandAnimation.setDuration(300L);
        expandAnimation.setFillAfter(true);
        this.A04.startAnimation(expandAnimation);
    }

    @Override // com.facebook.ads.internal.api.AdChoicesViewApi
    public final void initialize(boolean z, @Nullable NativeAdLayout nativeAdLayout) {
        C1320bj.A0J(this.A05.getInternalNativeAd()).A1L(nativeAdLayout);
        C0986Rb c0986RbA0v = C1320bj.A0J(this.A05.getInternalNativeAd()).A0v();
        if (c0986RbA0v != null && c0986RbA0v.A0g() && !c0986RbA0v.A0e()) {
            this.A04.setVisibility(8);
            return;
        }
        this.A01 = this.A05.getAdChoicesText();
        if (TextUtils.isEmpty(this.A01)) {
            String[] strArr = A08;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[4] = "ttxb";
            strArr2[3] = "x8K";
            this.A01 = A04(0, 9, 21);
        }
        C0803Ju adChoicesIcon = C1320bj.A0J(this.A05.getInternalNativeAd()).getAdChoicesIcon();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.A04.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.ads.redexgen.X.4j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                if (this.A00.A02) {
                    C1320bj.A0J(this.A00.A05.getInternalNativeAd()).A1D();
                    return true;
                }
                this.A00.A06();
                return true;
            }
        });
        this.A00 = new TextView(this.A04.getContext());
        this.A04.addView(this.A00);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (z && adChoicesIcon != null) {
            ImageView adChoicesImageView = A00(adChoicesIcon);
            layoutParams2.addRule(11, adChoicesImageView.getId());
            if (A08[2].charAt(8) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr3 = A08;
            strArr3[5] = "acVQqvBAW9";
            strArr3[5] = "acVQqvBAW9";
            layoutParams2.width = 0;
            layoutParams.width = Math.round((adChoicesIcon.getWidth() + 4) * this.A03);
            layoutParams.height = Math.round((adChoicesIcon.getHeight() + 2) * this.A03);
            this.A02 = false;
        } else {
            this.A02 = true;
        }
        this.A04.setLayoutParams(layoutParams);
        layoutParams2.addRule(15, -1);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.setSingleLine();
        this.A00.setText(this.A01);
        this.A00.setTextSize(10.0f);
        this.A00.setTextColor(-4341303);
        LX.A04(this.A04, LX.A07);
        LX.A04(this.A00, LX.A07);
    }
}
