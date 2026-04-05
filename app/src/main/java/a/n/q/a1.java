package a.n.q;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class a1 extends EditText {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f2740b = Pattern.compile("\\S+");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Property<a1, Integer> f2741c = new a(Integer.class, "streamPosition");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Random f2742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bitmap f2743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f2744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObjectAnimator f2746h;

    public static class a extends Property<a1, Integer> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(a1 a1Var) {
            return Integer.valueOf(a1Var.getStreamPosition());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(a1 a1Var, Integer num) {
            a1Var.setStreamPosition(num.intValue());
        }
    }

    public class b extends ReplacementSpan {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2748c;

        public b(int i2, int i3) {
            this.f2747b = i2;
            this.f2748c = i3;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
            int iMeasureText = (int) paint.measureText(charSequence, i2, i3);
            int width = a1.this.f2743e.getWidth();
            int i7 = width * 2;
            int i8 = iMeasureText / i7;
            int i9 = (iMeasureText % i7) / 2;
            boolean zD = a1.d(a1.this);
            a1.this.f2742d.setSeed(this.f2747b);
            int alpha = paint.getAlpha();
            for (int i10 = 0; i10 < i8; i10++) {
                int i11 = this.f2748c + i10;
                a1 a1Var = a1.this;
                if (i11 >= a1Var.f2745g) {
                    break;
                }
                float f3 = (i10 * i7) + i9 + (width / 2);
                float f4 = zD ? ((iMeasureText + f2) - f3) - width : f2 + f3;
                paint.setAlpha((a1Var.f2742d.nextInt(4) + 1) * 63);
                canvas.drawBitmap(a1.this.f2742d.nextBoolean() ? a1.this.f2744f : a1.this.f2743e, f4, i5 - r3.getHeight(), paint);
            }
            paint.setAlpha(alpha);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
            return (int) paint.measureText(charSequence, i2, i3);
        }
    }

    public a1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2742d = new Random();
    }

    public a1(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f2742d = new Random();
    }

    public static boolean d(View view) {
        return Build.VERSION.SDK_INT >= 17 && 1 == view.getLayoutDirection();
    }

    public final void a(SpannableStringBuilder spannableStringBuilder, String str, int i2) {
        Matcher matcher = f2740b.matcher(str);
        while (matcher.find()) {
            int iStart = matcher.start() + i2;
            spannableStringBuilder.setSpan(new b(str.charAt(matcher.start()), iStart), iStart, matcher.end() + i2, 33);
        }
    }

    public final void b() {
        ObjectAnimator objectAnimator = this.f2746h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final Bitmap c(int i2, float f2) {
        return Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), i2), (int) (r3.getWidth() * f2), (int) (r3.getHeight() * f2), false);
    }

    public void e() {
        this.f2745g = -1;
        b();
        setText(BuildConfig.FLAVOR);
    }

    public final void f() {
        b();
        int streamPosition = getStreamPosition();
        int length = length();
        int i2 = length - streamPosition;
        if (i2 > 0) {
            if (this.f2746h == null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                this.f2746h = objectAnimator;
                objectAnimator.setTarget(this);
                this.f2746h.setProperty(f2741c);
            }
            this.f2746h.setIntValues(streamPosition, length);
            this.f2746h.setDuration(((long) i2) * 50);
            this.f2746h.start();
        }
    }

    public void g(String str, String str2) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (str2 != null) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            a(spannableStringBuilder, str2, length);
        }
        this.f2745g = Math.max(str.length(), this.f2745g);
        h(new SpannedString(spannableStringBuilder));
        f();
    }

    public int getStreamPosition() {
        return this.f2745g;
    }

    public final void h(CharSequence charSequence) {
        setText(charSequence);
        bringPointIntoView(length());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2743e = c(a.n.d.f2599e, 1.3f);
        this.f2744f = c(a.n.d.f2600f, 1.3f);
        e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(a1.class.getCanonicalName());
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.i.s.i.s(this, callback));
    }

    public void setFinalRecognizedText(CharSequence charSequence) {
        h(charSequence);
    }

    public void setStreamPosition(int i2) {
        this.f2745g = i2;
        invalidate();
    }
}
