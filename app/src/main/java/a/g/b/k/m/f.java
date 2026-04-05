package a.g.b.k.m;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f1460d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1463g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f1457a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1458b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1459c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f1461e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1464h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f1465i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1466j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<d> f1467k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<f> f1468l = new ArrayList();

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(m mVar) {
        this.f1460d = mVar;
    }

    @Override // a.g.b.k.m.d
    public void a(d dVar) {
        Iterator<f> it = this.f1468l.iterator();
        while (it.hasNext()) {
            if (!it.next().f1466j) {
                return;
            }
        }
        this.f1459c = true;
        d dVar2 = this.f1457a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f1458b) {
            this.f1460d.a(this);
            return;
        }
        f fVar = null;
        int i2 = 0;
        for (f fVar2 : this.f1468l) {
            if (!(fVar2 instanceof g)) {
                i2++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i2 == 1 && fVar.f1466j) {
            g gVar = this.f1465i;
            if (gVar != null) {
                if (!gVar.f1466j) {
                    return;
                } else {
                    this.f1462f = this.f1464h * gVar.f1463g;
                }
            }
            d(fVar.f1463g + this.f1462f);
        }
        d dVar3 = this.f1457a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f1467k.add(dVar);
        if (this.f1466j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f1468l.clear();
        this.f1467k.clear();
        this.f1466j = false;
        this.f1463g = 0;
        this.f1459c = false;
        this.f1458b = false;
    }

    public void d(int i2) {
        if (this.f1466j) {
            return;
        }
        this.f1466j = true;
        this.f1463g = i2;
        for (d dVar : this.f1467k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1460d.f1484b.p());
        sb.append(":");
        sb.append(this.f1461e);
        sb.append("(");
        sb.append(this.f1466j ? Integer.valueOf(this.f1463g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f1468l.size());
        sb.append(":d=");
        sb.append(this.f1467k.size());
        sb.append(">");
        return sb.toString();
    }
}
