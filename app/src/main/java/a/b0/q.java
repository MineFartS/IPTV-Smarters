package a.b0;

import a.b0.m;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class q extends m {
    public int N;
    public ArrayList<m> L = new ArrayList<>();
    public boolean M = true;
    public boolean O = false;
    public int P = 0;

    public class a extends n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f990b;

        public a(m mVar) {
            this.f990b = mVar;
        }

        @Override // a.b0.m.f
        public void c(m mVar) {
            this.f990b.b0();
            mVar.X(this);
        }
    }

    public static class b extends n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public q f992b;

        public b(q qVar) {
            this.f992b = qVar;
        }

        @Override // a.b0.n, a.b0.m.f
        public void a(m mVar) {
            q qVar = this.f992b;
            if (qVar.O) {
                return;
            }
            qVar.j0();
            this.f992b.O = true;
        }

        @Override // a.b0.m.f
        public void c(m mVar) {
            q qVar = this.f992b;
            int i2 = qVar.N - 1;
            qVar.N = i2;
            if (i2 == 0) {
                qVar.O = false;
                qVar.q();
            }
            mVar.X(this);
        }
    }

    @Override // a.b0.m
    public void T(View view) {
        super.T(view);
        int size = this.L.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.L.get(i2).T(view);
        }
    }

    @Override // a.b0.m
    public void Z(View view) {
        super.Z(view);
        int size = this.L.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.L.get(i2).Z(view);
        }
    }

    @Override // a.b0.m
    public void b0() {
        if (this.L.isEmpty()) {
            j0();
            q();
            return;
        }
        z0();
        if (this.M) {
            Iterator<m> it = this.L.iterator();
            while (it.hasNext()) {
                it.next().b0();
            }
            return;
        }
        for (int i2 = 1; i2 < this.L.size(); i2++) {
            this.L.get(i2 - 1).a(new a(this.L.get(i2)));
        }
        m mVar = this.L.get(0);
        if (mVar != null) {
            mVar.b0();
        }
    }

    @Override // a.b0.m
    public void cancel() {
        super.cancel();
        int size = this.L.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.L.get(i2).cancel();
        }
    }

    @Override // a.b0.m
    public void e0(m.e eVar) {
        super.e0(eVar);
        this.P |= 8;
        int size = this.L.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.L.get(i2).e0(eVar);
        }
    }

    @Override // a.b0.m
    public void g(s sVar) {
        if (L(sVar.f997b)) {
            for (m mVar : this.L) {
                if (mVar.L(sVar.f997b)) {
                    mVar.g(sVar);
                    sVar.f998c.add(mVar);
                }
            }
        }
    }

    @Override // a.b0.m
    public void g0(g gVar) {
        super.g0(gVar);
        this.P |= 4;
        if (this.L != null) {
            for (int i2 = 0; i2 < this.L.size(); i2++) {
                this.L.get(i2).g0(gVar);
            }
        }
    }

    @Override // a.b0.m
    public void h0(p pVar) {
        super.h0(pVar);
        this.P |= 2;
        int size = this.L.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.L.get(i2).h0(pVar);
        }
    }

    @Override // a.b0.m
    public void j(s sVar) {
        super.j(sVar);
        int size = this.L.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.L.get(i2).j(sVar);
        }
    }

    @Override // a.b0.m
    public void k(s sVar) {
        if (L(sVar.f997b)) {
            for (m mVar : this.L) {
                if (mVar.L(sVar.f997b)) {
                    mVar.k(sVar);
                    sVar.f998c.add(mVar);
                }
            }
        }
    }

    @Override // a.b0.m
    public String k0(String str) {
        String strK0 = super.k0(str);
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strK0);
            sb.append("\n");
            sb.append(this.L.get(i2).k0(str + "  "));
            strK0 = sb.toString();
        }
        return strK0;
    }

    @Override // a.b0.m
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public q a(m.f fVar) {
        return (q) super.a(fVar);
    }

    @Override // a.b0.m
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public q b(View view) {
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            this.L.get(i2).b(view);
        }
        return (q) super.b(view);
    }

    @Override // a.b0.m
    /* JADX INFO: renamed from: n */
    public m clone() {
        q qVar = (q) super.clone();
        qVar.L = new ArrayList<>();
        int size = this.L.size();
        for (int i2 = 0; i2 < size; i2++) {
            qVar.o0(this.L.get(i2).clone());
        }
        return qVar;
    }

    public q n0(m mVar) {
        o0(mVar);
        long j2 = this.f966g;
        if (j2 >= 0) {
            mVar.d0(j2);
        }
        if ((this.P & 1) != 0) {
            mVar.f0(w());
        }
        if ((this.P & 2) != 0) {
            mVar.h0(B());
        }
        if ((this.P & 4) != 0) {
            mVar.g0(A());
        }
        if ((this.P & 8) != 0) {
            mVar.e0(u());
        }
        return this;
    }

    public final void o0(m mVar) {
        this.L.add(mVar);
        mVar.v = this;
    }

    @Override // a.b0.m
    public void p(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long jD = D();
        int size = this.L.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = this.L.get(i2);
            if (jD > 0 && (this.M || i2 == 0)) {
                long jD2 = mVar.D();
                if (jD2 > 0) {
                    mVar.i0(jD2 + jD);
                } else {
                    mVar.i0(jD);
                }
            }
            mVar.p(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    public m p0(int i2) {
        if (i2 < 0 || i2 >= this.L.size()) {
            return null;
        }
        return this.L.get(i2);
    }

    public int q0() {
        return this.L.size();
    }

    @Override // a.b0.m
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public q X(m.f fVar) {
        return (q) super.X(fVar);
    }

    @Override // a.b0.m
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public q Y(View view) {
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            this.L.get(i2).Y(view);
        }
        return (q) super.Y(view);
    }

    @Override // a.b0.m
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public q d0(long j2) {
        ArrayList<m> arrayList;
        super.d0(j2);
        if (this.f966g >= 0 && (arrayList = this.L) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.L.get(i2).d0(j2);
            }
        }
        return this;
    }

    @Override // a.b0.m
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public q f0(TimeInterpolator timeInterpolator) {
        this.P |= 1;
        ArrayList<m> arrayList = this.L;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.L.get(i2).f0(timeInterpolator);
            }
        }
        return (q) super.f0(timeInterpolator);
    }

    public q x0(int i2) {
        if (i2 == 0) {
            this.M = true;
        } else {
            if (i2 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i2);
            }
            this.M = false;
        }
        return this;
    }

    @Override // a.b0.m
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public q i0(long j2) {
        return (q) super.i0(j2);
    }

    public final void z0() {
        b bVar = new b(this);
        Iterator<m> it = this.L.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.N = this.L.size();
    }
}
