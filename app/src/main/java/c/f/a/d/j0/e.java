package c.f.a.d.j0;

/* JADX INFO: loaded from: classes2.dex */
public class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f14888a = -1.0f;

    @Override // c.f.a.d.j0.d
    public void a(m mVar, float f2, float f3, float f4) {
        mVar.o(0.0f, f4 * f3, 180.0f, 180.0f - f2);
        double dSin = Math.sin(Math.toRadians(f2));
        double d2 = f4;
        Double.isNaN(d2);
        double d3 = f3;
        Double.isNaN(d3);
        double dSin2 = Math.sin(Math.toRadians(90.0f - f2));
        Double.isNaN(d2);
        Double.isNaN(d3);
        mVar.m((float) (dSin * d2 * d3), (float) (dSin2 * d2 * d3));
    }
}
