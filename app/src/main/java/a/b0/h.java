package a.b0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public class h<T> extends Property<T, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Property<T, PointF> f926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PathMeasure f927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PointF f930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f931f;

    public h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f929d = new float[2];
        this.f930e = new PointF();
        this.f926a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f927b = pathMeasure;
        this.f928c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(T t) {
        return Float.valueOf(this.f931f);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(T t, Float f2) {
        this.f931f = f2.floatValue();
        this.f927b.getPosTan(this.f928c * f2.floatValue(), this.f929d, null);
        PointF pointF = this.f930e;
        float[] fArr = this.f929d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f926a.set(t, pointF);
    }
}
