package c.l.a.d;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class a extends c.l.a.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f18846i = {1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: c.l.a.d.a$a, reason: collision with other inner class name */
    public class C0252a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f18847b;

        public C0252a(int i2) {
            this.f18847b = i2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f18846i[this.f18847b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.h();
        }
    }

    @Override // c.l.a.a
    public void b(Canvas canvas, Paint paint) {
        float fMin = (Math.min(e(), d()) - 8.0f) / 6.0f;
        float f2 = 2.0f * fMin;
        float fE = (e() / 2) - (f2 + 4.0f);
        float fD = d() / 2;
        for (int i2 = 0; i2 < 3; i2++) {
            canvas.save();
            float f3 = i2;
            canvas.translate((f2 * f3) + fE + (f3 * 4.0f), fD);
            float[] fArr = this.f18846i;
            canvas.scale(fArr[i2], fArr[i2]);
            canvas.drawCircle(0.0f, 0.0f, fMin, paint);
            canvas.restore();
        }
    }

    @Override // c.l.a.a
    public ArrayList<ValueAnimator> g() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {120, 240, 360};
        for (int i2 = 0; i2 < 3; i2++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.3f, 1.0f);
            valueAnimatorOfFloat.setDuration(750L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(iArr[i2]);
            a(valueAnimatorOfFloat, new C0252a(i2));
            arrayList.add(valueAnimatorOfFloat);
        }
        return arrayList;
    }
}
