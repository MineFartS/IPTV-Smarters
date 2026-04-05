package c.e.b.a.a.f;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Log;
import android.util.Property;
import android.view.animation.Interpolator;
import c.e.b.a.a.g.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f5978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Interpolator f5979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5980c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5981d = 2000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5982e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, b> f5983f = new HashMap();

    public class a extends b<Float> {
        public a(float[] fArr, Property property, Float[] fArr2) {
            super(fArr, property, fArr2);
        }
    }

    public class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float[] f5985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Property f5986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T[] f5987c;

        public b(float[] fArr, Property property, T[] tArr) {
            this.f5985a = fArr;
            this.f5986b = property;
            this.f5987c = tArr;
        }
    }

    public class c extends b<Integer> {
        public c(float[] fArr, Property property, Integer[] numArr) {
            super(fArr, property, numArr);
        }
    }

    public d(f fVar) {
        this.f5978a = fVar;
    }

    public d a(float[] fArr, Integer... numArr) {
        g(fArr, f.f6005m, numArr);
        return this;
    }

    public ObjectAnimator b() {
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[this.f5983f.size()];
        Iterator<Map.Entry<String, b>> it = this.f5983f.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            b value = it.next().getValue();
            float[] fArr = value.f5985a;
            Keyframe[] keyframeArr = new Keyframe[fArr.length];
            int i3 = this.f5982e;
            float f2 = fArr[i3];
            while (true) {
                int i4 = this.f5982e;
                Object[] objArr = value.f5987c;
                if (i3 < objArr.length + i4) {
                    int i5 = i3 - i4;
                    int length = i3 % objArr.length;
                    float f3 = fArr[length] - f2;
                    if (f3 < 0.0f) {
                        f3 += fArr[fArr.length - 1];
                    }
                    if (value instanceof c) {
                        keyframeArr[i5] = Keyframe.ofInt(f3, ((Integer) objArr[length]).intValue());
                    } else if (value instanceof a) {
                        keyframeArr[i5] = Keyframe.ofFloat(f3, ((Float) objArr[length]).floatValue());
                    } else {
                        keyframeArr[i5] = Keyframe.ofObject(f3, objArr[length]);
                    }
                    i3++;
                }
            }
            propertyValuesHolderArr[i2] = PropertyValuesHolder.ofKeyframe(value.f5986b, keyframeArr);
            i2++;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f5978a, propertyValuesHolderArr);
        objectAnimatorOfPropertyValuesHolder.setDuration(this.f5981d);
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(this.f5980c);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(this.f5979b);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public d c(long j2) {
        this.f5981d = j2;
        return this;
    }

    public d d(float... fArr) {
        h(c.e.b.a.a.f.e.b.a(fArr));
        return this;
    }

    public final void e(int i2, int i3) {
        if (i2 != i3) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    public final void f(float[] fArr, Property property, Float[] fArr2) {
        e(fArr.length, fArr2.length);
        this.f5983f.put(property.getName(), new a(fArr, property, fArr2));
    }

    public final void g(float[] fArr, Property property, Integer[] numArr) {
        e(fArr.length, numArr.length);
        this.f5983f.put(property.getName(), new c(fArr, property, numArr));
    }

    public d h(Interpolator interpolator) {
        this.f5979b = interpolator;
        return this;
    }

    public d i(float[] fArr, Integer... numArr) {
        g(fArr, f.f5996d, numArr);
        return this;
    }

    public d j(float[] fArr, Integer... numArr) {
        g(fArr, f.f5995c, numArr);
        return this;
    }

    public d k(float[] fArr, Integer... numArr) {
        g(fArr, f.f5997e, numArr);
        return this;
    }

    public d l(float[] fArr, Float... fArr2) {
        f(fArr, f.f6004l, fArr2);
        return this;
    }

    public d m(float[] fArr, Float... fArr2) {
        f(fArr, f.f6003k, fArr2);
        return this;
    }

    public d n(int i2) {
        if (i2 < 0) {
            Log.w("SpriteAnimatorBuilder", "startFrame should always be non-negative");
            i2 = 0;
        }
        this.f5982e = i2;
        return this;
    }

    public d o(float[] fArr, Float... fArr2) {
        f(fArr, f.f6000h, fArr2);
        return this;
    }

    public d p(float[] fArr, Float... fArr2) {
        f(fArr, f.f6001i, fArr2);
        return this;
    }
}
