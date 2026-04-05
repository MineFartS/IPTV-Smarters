package a.c0.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class f implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f1068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f1069b;

    public f(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayS = a.i.i.e.g.s(resources, theme, attributeSet, a.f1052l);
        d(typedArrayS, xmlPullParser);
        typedArrayS.recycle();
    }

    public final void a(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
        b(path);
    }

    public final void b(Path path) {
        int i2 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int iMin = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (iMin <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f1068a = new float[iMin];
        this.f1069b = new float[iMin];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < iMin; i3++) {
            pathMeasure.getPosTan((i3 * length) / (iMin - 1), fArr, null);
            this.f1068a[i3] = fArr[0];
            this.f1069b[i3] = fArr[1];
        }
        if (Math.abs(this.f1068a[0]) <= 1.0E-5d && Math.abs(this.f1069b[0]) <= 1.0E-5d) {
            int i4 = iMin - 1;
            if (Math.abs(this.f1068a[i4] - 1.0f) <= 1.0E-5d && Math.abs(this.f1069b[i4] - 1.0f) <= 1.0E-5d) {
                float f2 = 0.0f;
                int i5 = 0;
                while (i2 < iMin) {
                    float[] fArr2 = this.f1068a;
                    int i6 = i5 + 1;
                    float f3 = fArr2[i5];
                    if (f3 < f2) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f3);
                    }
                    fArr2[i2] = f3;
                    i2++;
                    f2 = f3;
                    i5 = i6;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f1068a[0]);
        sb.append(",");
        sb.append(this.f1069b[0]);
        sb.append(" end:");
        int i7 = iMin - 1;
        sb.append(this.f1068a[i7]);
        sb.append(",");
        sb.append(this.f1069b[i7]);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void c(float f2, float f3) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f2, f3, 1.0f, 1.0f);
        b(path);
    }

    public final void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (a.i.i.e.g.r(xmlPullParser, "pathData")) {
            String strM = a.i.i.e.g.m(typedArray, xmlPullParser, "pathData", 4);
            Path pathE = a.i.j.c.e(strM);
            if (pathE != null) {
                b(pathE);
                return;
            }
            throw new InflateException("The path is null, which is created from " + strM);
        }
        if (!a.i.i.e.g.r(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!a.i.i.e.g.r(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float fJ = a.i.i.e.g.j(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float fJ2 = a.i.i.e.g.j(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean zR = a.i.i.e.g.r(xmlPullParser, "controlX2");
        if (zR != a.i.i.e.g.r(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (zR) {
            a(fJ, fJ2, a.i.i.e.g.j(typedArray, xmlPullParser, "controlX2", 2, 0.0f), a.i.i.e.g.j(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        } else {
            c(fJ, fJ2);
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.f1068a.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f2 < this.f1068a[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float[] fArr = this.f1068a;
        float f3 = fArr[length] - fArr[i2];
        if (f3 == 0.0f) {
            return this.f1069b[i2];
        }
        float f4 = (f2 - fArr[i2]) / f3;
        float[] fArr2 = this.f1069b;
        float f5 = fArr2[i2];
        return f5 + (f4 * (fArr2[length] - f5));
    }
}
