package c.d.a.n.i;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class f implements c.d.a.n.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.d.a.n.e f5569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.d.a.n.e f5570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.d.a.n.g f5571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.d.a.n.f f5572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c.d.a.n.k.j.c f5573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c.d.a.n.b f5574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c.d.a.n.c f5575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f5576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.d.a.n.c f5578m;

    public f(String str, c.d.a.n.c cVar, int i2, int i3, c.d.a.n.e eVar, c.d.a.n.e eVar2, c.d.a.n.g gVar, c.d.a.n.f fVar, c.d.a.n.k.j.c cVar2, c.d.a.n.b bVar) {
        this.f5566a = str;
        this.f5575j = cVar;
        this.f5567b = i2;
        this.f5568c = i3;
        this.f5569d = eVar;
        this.f5570e = eVar2;
        this.f5571f = gVar;
        this.f5572g = fVar;
        this.f5573h = cVar2;
        this.f5574i = bVar;
    }

    @Override // c.d.a.n.c
    public void a(MessageDigest messageDigest) {
        byte[] bArrArray = ByteBuffer.allocate(8).putInt(this.f5567b).putInt(this.f5568c).array();
        this.f5575j.a(messageDigest);
        messageDigest.update(this.f5566a.getBytes("UTF-8"));
        messageDigest.update(bArrArray);
        c.d.a.n.e eVar = this.f5569d;
        String id = BuildConfig.FLAVOR;
        messageDigest.update((eVar != null ? eVar.getId() : BuildConfig.FLAVOR).getBytes("UTF-8"));
        c.d.a.n.e eVar2 = this.f5570e;
        messageDigest.update((eVar2 != null ? eVar2.getId() : BuildConfig.FLAVOR).getBytes("UTF-8"));
        c.d.a.n.g gVar = this.f5571f;
        messageDigest.update((gVar != null ? gVar.getId() : BuildConfig.FLAVOR).getBytes("UTF-8"));
        c.d.a.n.f fVar = this.f5572g;
        messageDigest.update((fVar != null ? fVar.getId() : BuildConfig.FLAVOR).getBytes("UTF-8"));
        c.d.a.n.b bVar = this.f5574i;
        if (bVar != null) {
            id = bVar.getId();
        }
        messageDigest.update(id.getBytes("UTF-8"));
    }

    public c.d.a.n.c b() {
        if (this.f5578m == null) {
            this.f5578m = new k(this.f5566a, this.f5575j);
        }
        return this.f5578m;
    }

    @Override // c.d.a.n.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f5566a.equals(fVar.f5566a) || !this.f5575j.equals(fVar.f5575j) || this.f5568c != fVar.f5568c || this.f5567b != fVar.f5567b) {
            return false;
        }
        c.d.a.n.g gVar = this.f5571f;
        if ((gVar == null) ^ (fVar.f5571f == null)) {
            return false;
        }
        if (gVar != null && !gVar.getId().equals(fVar.f5571f.getId())) {
            return false;
        }
        c.d.a.n.e eVar = this.f5570e;
        if ((eVar == null) ^ (fVar.f5570e == null)) {
            return false;
        }
        if (eVar != null && !eVar.getId().equals(fVar.f5570e.getId())) {
            return false;
        }
        c.d.a.n.e eVar2 = this.f5569d;
        if ((eVar2 == null) ^ (fVar.f5569d == null)) {
            return false;
        }
        if (eVar2 != null && !eVar2.getId().equals(fVar.f5569d.getId())) {
            return false;
        }
        c.d.a.n.f fVar2 = this.f5572g;
        if ((fVar2 == null) ^ (fVar.f5572g == null)) {
            return false;
        }
        if (fVar2 != null && !fVar2.getId().equals(fVar.f5572g.getId())) {
            return false;
        }
        c.d.a.n.k.j.c cVar = this.f5573h;
        if ((cVar == null) ^ (fVar.f5573h == null)) {
            return false;
        }
        if (cVar != null && !cVar.getId().equals(fVar.f5573h.getId())) {
            return false;
        }
        c.d.a.n.b bVar = this.f5574i;
        if ((bVar == null) ^ (fVar.f5574i == null)) {
            return false;
        }
        return bVar == null || bVar.getId().equals(fVar.f5574i.getId());
    }

    @Override // c.d.a.n.c
    public int hashCode() {
        if (this.f5577l == 0) {
            int iHashCode = this.f5566a.hashCode();
            this.f5577l = iHashCode;
            int iHashCode2 = (iHashCode * 31) + this.f5575j.hashCode();
            this.f5577l = iHashCode2;
            int i2 = (iHashCode2 * 31) + this.f5567b;
            this.f5577l = i2;
            int i3 = (i2 * 31) + this.f5568c;
            this.f5577l = i3;
            int i4 = i3 * 31;
            c.d.a.n.e eVar = this.f5569d;
            int iHashCode3 = i4 + (eVar != null ? eVar.getId().hashCode() : 0);
            this.f5577l = iHashCode3;
            int i5 = iHashCode3 * 31;
            c.d.a.n.e eVar2 = this.f5570e;
            int iHashCode4 = i5 + (eVar2 != null ? eVar2.getId().hashCode() : 0);
            this.f5577l = iHashCode4;
            int i6 = iHashCode4 * 31;
            c.d.a.n.g gVar = this.f5571f;
            int iHashCode5 = i6 + (gVar != null ? gVar.getId().hashCode() : 0);
            this.f5577l = iHashCode5;
            int i7 = iHashCode5 * 31;
            c.d.a.n.f fVar = this.f5572g;
            int iHashCode6 = i7 + (fVar != null ? fVar.getId().hashCode() : 0);
            this.f5577l = iHashCode6;
            int i8 = iHashCode6 * 31;
            c.d.a.n.k.j.c cVar = this.f5573h;
            int iHashCode7 = i8 + (cVar != null ? cVar.getId().hashCode() : 0);
            this.f5577l = iHashCode7;
            int i9 = iHashCode7 * 31;
            c.d.a.n.b bVar = this.f5574i;
            this.f5577l = i9 + (bVar != null ? bVar.getId().hashCode() : 0);
        }
        return this.f5577l;
    }

    public String toString() {
        if (this.f5576k == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("EngineKey{");
            sb.append(this.f5566a);
            sb.append('+');
            sb.append(this.f5575j);
            sb.append("+[");
            sb.append(this.f5567b);
            sb.append('x');
            sb.append(this.f5568c);
            sb.append("]+");
            sb.append('\'');
            c.d.a.n.e eVar = this.f5569d;
            String id = BuildConfig.FLAVOR;
            sb.append(eVar != null ? eVar.getId() : BuildConfig.FLAVOR);
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            c.d.a.n.e eVar2 = this.f5570e;
            sb.append(eVar2 != null ? eVar2.getId() : BuildConfig.FLAVOR);
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            c.d.a.n.g gVar = this.f5571f;
            sb.append(gVar != null ? gVar.getId() : BuildConfig.FLAVOR);
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            c.d.a.n.f fVar = this.f5572g;
            sb.append(fVar != null ? fVar.getId() : BuildConfig.FLAVOR);
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            c.d.a.n.k.j.c cVar = this.f5573h;
            sb.append(cVar != null ? cVar.getId() : BuildConfig.FLAVOR);
            sb.append('\'');
            sb.append('+');
            sb.append('\'');
            c.d.a.n.b bVar = this.f5574i;
            if (bVar != null) {
                id = bVar.getId();
            }
            sb.append(id);
            sb.append('\'');
            sb.append('}');
            this.f5576k = sb.toString();
        }
        return this.f5576k;
    }
}
