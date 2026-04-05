package a.w.a;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f3740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f3741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f3742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f3743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f3744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f3745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f3746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f3747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f3748i = new float[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3749j = true;

    static {
        c cVar = new c();
        f3740a = cVar;
        m(cVar);
        p(cVar);
        c cVar2 = new c();
        f3741b = cVar2;
        o(cVar2);
        p(cVar2);
        c cVar3 = new c();
        f3742c = cVar3;
        l(cVar3);
        p(cVar3);
        c cVar4 = new c();
        f3743d = cVar4;
        m(cVar4);
        n(cVar4);
        c cVar5 = new c();
        f3744e = cVar5;
        o(cVar5);
        n(cVar5);
        c cVar6 = new c();
        f3745f = cVar6;
        l(cVar6);
        n(cVar6);
    }

    public c() {
        float[] fArr = new float[3];
        this.f3746g = fArr;
        float[] fArr2 = new float[3];
        this.f3747h = fArr2;
        r(fArr);
        r(fArr2);
        q();
    }

    public static void l(c cVar) {
        float[] fArr = cVar.f3747h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    public static void m(c cVar) {
        float[] fArr = cVar.f3747h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    public static void n(c cVar) {
        float[] fArr = cVar.f3746g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    public static void o(c cVar) {
        float[] fArr = cVar.f3747h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    public static void p(c cVar) {
        float[] fArr = cVar.f3746g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    public static void r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public float a() {
        return this.f3748i[1];
    }

    public float b() {
        return this.f3747h[2];
    }

    public float c() {
        return this.f3746g[2];
    }

    public float d() {
        return this.f3747h[0];
    }

    public float e() {
        return this.f3746g[0];
    }

    public float f() {
        return this.f3748i[2];
    }

    public float g() {
        return this.f3748i[0];
    }

    public float h() {
        return this.f3747h[1];
    }

    public float i() {
        return this.f3746g[1];
    }

    public boolean j() {
        return this.f3749j;
    }

    public void k() {
        int length = this.f3748i.length;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            float f3 = this.f3748i[i2];
            if (f3 > 0.0f) {
                f2 += f3;
            }
        }
        if (f2 != 0.0f) {
            int length2 = this.f3748i.length;
            for (int i3 = 0; i3 < length2; i3++) {
                float[] fArr = this.f3748i;
                if (fArr[i3] > 0.0f) {
                    fArr[i3] = fArr[i3] / f2;
                }
            }
        }
    }

    public final void q() {
        float[] fArr = this.f3748i;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }
}
