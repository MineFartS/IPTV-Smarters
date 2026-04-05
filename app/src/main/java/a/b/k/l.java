package a.b.k;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static l f229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f232d;

    public static l b() {
        if (f229a == null) {
            f229a = new l();
        }
        return f229a;
    }

    public void a(long j2, double d2, double d3) {
        float f2 = (j2 - 946728000000L) / 8.64E7f;
        double d4 = (0.01720197f * f2) + 6.24006f;
        double dSin = Math.sin(d4) * 0.03341960161924362d;
        Double.isNaN(d4);
        double dSin2 = dSin + d4 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        Double.isNaN(f2 - 9.0E-4f);
        double dRound = Math.round(r11 - r9) + 9.0E-4f;
        Double.isNaN(dRound);
        double dSin3 = dRound + ((-d3) / 360.0d) + (Math.sin(d4) * 0.0053d) + (Math.sin(2.0d * dSin2) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin2) * Math.sin(0.4092797040939331d));
        double d5 = 0.01745329238474369d * d2;
        double dSin4 = (Math.sin(-0.10471975803375244d) - (Math.sin(d5) * Math.sin(dAsin))) / (Math.cos(d5) * Math.cos(dAsin));
        if (dSin4 >= 1.0d) {
            this.f232d = 1;
        } else {
            if (dSin4 > -1.0d) {
                double dAcos = (float) (Math.acos(dSin4) / 6.283185307179586d);
                Double.isNaN(dAcos);
                this.f230b = Math.round((dSin3 + dAcos) * 8.64E7d) + 946728000000L;
                Double.isNaN(dAcos);
                long jRound = Math.round((dSin3 - dAcos) * 8.64E7d) + 946728000000L;
                this.f231c = jRound;
                if (jRound >= j2 || this.f230b <= j2) {
                    this.f232d = 1;
                    return;
                } else {
                    this.f232d = 0;
                    return;
                }
            }
            this.f232d = 0;
        }
        this.f230b = -1L;
        this.f231c = -1L;
    }
}
