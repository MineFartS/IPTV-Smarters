package c.f.a.c.j.c;

import c.f.a.c.d.u.u.i;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends c.f.a.c.d.u.u.l.a implements i.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CastSeekBar f12759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.c.d.u.u.l.c f12761d;

    public a0(CastSeekBar castSeekBar, long j2, c.f.a.c.d.u.u.l.c cVar) {
        this.f12759b = castSeekBar;
        this.f12760c = j2;
        this.f12761d = cVar;
        g();
    }

    @Override // c.f.a.c.d.u.u.i.e
    public final void a(long j2, long j3) {
        h();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void c() {
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void e(c.f.a.c.d.u.d dVar) {
        super.e(dVar);
        if (b() != null) {
            b().c(this, this.f12760c);
        }
        g();
    }

    @Override // c.f.a.c.d.u.u.l.a
    public final void f() {
        if (b() != null) {
            b().P(this);
        }
        super.f();
        g();
    }

    public final void g() {
        h();
        ArrayList arrayList = null;
        if (b() != null) {
            MediaInfo mediaInfoJ = b().j();
            if (b().p() && !b().s() && mediaInfoJ != null) {
                CastSeekBar castSeekBar = this.f12759b;
                List<c.f.a.c.d.b> listJ = mediaInfoJ.J();
                if (listJ != null) {
                    arrayList = new ArrayList();
                    for (c.f.a.c.d.b bVar : listJ) {
                        if (bVar != null) {
                            long jL = bVar.L();
                            int iA = jL == -1000 ? this.f12761d.a() : Math.min(this.f12761d.d(jL), this.f12761d.a());
                            if (iA >= 0) {
                                arrayList.add(new CastSeekBar.a(iA));
                            }
                        }
                    }
                }
                castSeekBar.setAdBreaks(arrayList);
                return;
            }
        }
        this.f12759b.setAdBreaks(null);
    }

    public final void h() {
        c.f.a.c.d.u.u.i iVarB = b();
        if (iVarB == null || !iVarB.p() || iVarB.v()) {
            this.f12759b.setEnabled(false);
        } else {
            this.f12759b.setEnabled(true);
        }
        CastSeekBar.b bVar = new CastSeekBar.b();
        bVar.f24205a = i();
        bVar.f24206b = this.f12761d.a();
        bVar.f24207c = this.f12761d.d(0L);
        c.f.a.c.d.u.u.i iVarB2 = b();
        bVar.f24208d = (iVarB2 != null && iVarB2.p() && iVarB2.w()) ? this.f12761d.i() : i();
        c.f.a.c.d.u.u.i iVarB3 = b();
        bVar.f24209e = (iVarB3 != null && iVarB3.p() && iVarB3.w()) ? this.f12761d.j() : i();
        c.f.a.c.d.u.u.i iVarB4 = b();
        bVar.f24210f = iVarB4 != null && iVarB4.p() && iVarB4.w();
        this.f12759b.b(bVar);
    }

    public final int i() {
        c.f.a.c.d.u.u.i iVarB = b();
        if (iVarB != null) {
            iVarB.r();
        }
        return this.f12761d.f();
    }
}
