package c.h.a.k.c;

import a.l.d.n;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.Toast;
import c.f.a.b.c3.a0;
import c.f.a.b.c3.b0;
import c.f.a.b.c3.r;
import c.f.a.b.c3.t;
import c.f.a.b.c3.v;
import c.f.a.b.c3.w;
import c.f.a.b.c3.x;
import c.f.a.b.c3.y;
import c.f.a.b.e3.a1;
import c.f.a.b.e3.z0;
import c.f.a.b.g3.f;
import c.f.a.b.g3.j;
import c.f.a.b.i3.c0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import c.f.a.b.k1;
import c.f.a.b.l2;
import c.f.a.b.p1;
import c.f.a.b.x2.a0;
import c.f.a.b.x2.p0;
import c.f.a.b.x2.y;
import com.nst.iptvsmarterstvbox.R;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0.b f17784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArraySet<c> f17785c = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<Uri, r> f17786d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f17787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.d f17788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f17789g;

    public class b implements x.d {
        public b() {
        }

        @Override // c.f.a.b.c3.x.d
        public /* synthetic */ void a(x xVar, boolean z) {
            y.b(this, xVar, z);
        }

        @Override // c.f.a.b.c3.x.d
        public /* synthetic */ void b(x xVar, boolean z) {
            y.f(this, xVar, z);
        }

        @Override // c.f.a.b.c3.x.d
        public void c(x xVar, r rVar, Exception exc) {
            j.this.f17786d.put(rVar.f6766a.f6664c, rVar);
            Iterator it = j.this.f17785c.iterator();
            while (it.hasNext()) {
                ((c) it.next()).l0();
            }
        }

        @Override // c.f.a.b.c3.x.d
        public /* synthetic */ void d(x xVar, c.f.a.b.d3.d dVar, int i2) {
            y.e(this, xVar, dVar, i2);
        }

        @Override // c.f.a.b.c3.x.d
        public void e(x xVar, r rVar) {
            j.this.f17786d.remove(rVar.f6766a.f6664c);
            Iterator it = j.this.f17785c.iterator();
            while (it.hasNext()) {
                ((c) it.next()).l0();
            }
        }

        @Override // c.f.a.b.c3.x.d
        public /* synthetic */ void f(x xVar) {
            y.c(this, xVar);
        }

        @Override // c.f.a.b.c3.x.d
        public /* synthetic */ void g(x xVar) {
            y.d(this, xVar);
        }
    }

    public interface c {
        void l0();
    }

    public final class d implements v.c, DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f17791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v f17792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p1 f17793d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public l f17794e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public j.a f17795f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public e f17796g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte[] f17797h;

        public d(n nVar, v vVar, p1 p1Var) {
            this.f17791b = nVar;
            this.f17792c = vVar;
            this.f17793d = p1Var;
            vVar.B(this);
        }

        @Override // c.f.a.b.c3.v.c
        public void a(v vVar) {
            k1 k1VarF = f(vVar);
            if (k1VarF == null) {
                h(vVar);
                return;
            }
            if (x0.f9296a < 18) {
                Toast.makeText(j.this.f17783a, R.string.error_drm_unsupported_before_api_18, 1).show();
                z.d("DownloadTracker", "Downloading DRM protected content is not supported on API versions below 18");
            } else if (!g(k1VarF.p)) {
                Toast.makeText(j.this.f17783a, R.string.download_start_error_offline_license, 1).show();
                z.d("DownloadTracker", "Downloading content where DRM scheme data is not located in the manifest is not supported");
            } else {
                e eVar = new e(k1VarF, this.f17793d.f9643d.f9687c, j.this.f17784b, this, vVar);
                this.f17796g = eVar;
                eVar.execute(new Void[0]);
            }
        }

        @Override // c.f.a.b.c3.v.c
        public void b(v vVar, IOException iOException) {
            boolean z = iOException instanceof v.f;
            int i2 = z ? R.string.download_live_unsupported : R.string.download_start_error;
            String str = z ? "Downloading live content unsupported" : "Failed to start download";
            Toast.makeText(j.this.f17783a, i2, 1).show();
            z.e("DownloadTracker", str, iOException);
        }

        public final a0 e() {
            return this.f17792c.l(x0.k0((String) c.f.a.b.j3.g.e(this.f17793d.f9645f.f9731c.toString()))).c(this.f17797h);
        }

        public final k1 f(v vVar) {
            for (int i2 = 0; i2 < vVar.n(); i2++) {
                j.a aVarM = vVar.m(i2);
                for (int i3 = 0; i3 < aVarM.c(); i3++) {
                    a1 a1VarG = aVarM.g(i3);
                    for (int i4 = 0; i4 < a1VarG.f6903c; i4++) {
                        z0 z0VarB = a1VarG.b(i4);
                        for (int i5 = 0; i5 < z0VarB.f8056b; i5++) {
                            k1 k1VarB = z0VarB.b(i5);
                            if (k1VarB.p != null) {
                                return k1VarB;
                            }
                        }
                    }
                }
            }
            return null;
        }

        public final boolean g(c.f.a.b.x2.w wVar) {
            for (int i2 = 0; i2 < wVar.f10448e; i2++) {
                if (wVar.f(i2).d()) {
                    return true;
                }
            }
            return false;
        }

        public final void h(v vVar) {
            if (vVar.n() == 0) {
                z.b("DownloadTracker", "No periods found. Downloading entire stream.");
                l();
                this.f17792c.C();
                return;
            }
            j.a aVarM = this.f17792c.m(0);
            this.f17795f = aVarM;
            if (l.l0(aVarM)) {
                l lVarQ = l.Q(R.string.exo_download_description, this.f17795f, j.this.f17788f, false, true, this, this);
                this.f17794e = lVarQ;
                lVarQ.J(this.f17791b, null);
            } else {
                z.b("DownloadTracker", "No dialog content. Downloading entire stream.");
                l();
                this.f17792c.C();
            }
        }

        public final void i(v vVar, byte[] bArr) {
            this.f17797h = bArr;
            h(vVar);
        }

        public final void j(y.a aVar) {
            Toast.makeText(j.this.f17783a, R.string.download_start_error_offline_license, 1).show();
            z.e("DownloadTracker", "Failed to fetch offline DRM license", aVar);
        }

        public void k() {
            this.f17792c.C();
            l lVar = this.f17794e;
            if (lVar != null) {
                lVar.q();
            }
            e eVar = this.f17796g;
            if (eVar != null) {
                eVar.cancel(false);
            }
        }

        public final void l() {
            m(e());
        }

        public final void m(a0 a0Var) {
            b0.x(j.this.f17783a, h.class, a0Var, false);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            for (int i3 = 0; i3 < this.f17792c.n(); i3++) {
                this.f17792c.f(i3);
                for (int i4 = 0; i4 < this.f17795f.c(); i4++) {
                    if (!this.f17794e.S(i4)) {
                        this.f17792c.d(i3, i4, j.this.f17788f, this.f17794e.V(i4));
                    }
                }
            }
            a0 a0VarE = e();
            if (a0VarE.f6666e.isEmpty()) {
                return;
            }
            m(a0VarE);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.f17794e = null;
            this.f17792c.C();
        }
    }

    public static final class e extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k1 f17799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p1.e f17800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c0.b f17801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f17802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final v f17803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte[] f17804f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public y.a f17805g;

        public e(k1 k1Var, p1.e eVar, c0.b bVar, d dVar, v vVar) {
            this.f17799a = k1Var;
            this.f17800b = eVar;
            this.f17801c = bVar;
            this.f17802d = dVar;
            this.f17803e = vVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            String string = this.f17800b.f9671b.toString();
            p1.e eVar = this.f17800b;
            p0 p0VarD = p0.d(string, eVar.f9675f, this.f17801c, eVar.f9672c, new a0.a());
            try {
                try {
                    this.f17804f = p0VarD.c(this.f17799a);
                } catch (y.a e2) {
                    this.f17805g = e2;
                }
                p0VarD.f();
                p0VarD = null;
                return null;
            } catch (Throwable th) {
                p0VarD.f();
                throw th;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r3) {
            y.a aVar = this.f17805g;
            if (aVar != null) {
                this.f17802d.j(aVar);
            } else {
                this.f17802d.i(this.f17803e, (byte[]) c.f.a.b.j3.g.i(this.f17804f));
            }
        }
    }

    public j(Context context, c0.b bVar, x xVar) {
        this.f17783a = context.getApplicationContext();
        this.f17784b = bVar;
        this.f17787e = xVar.d();
        this.f17788f = v.j(context);
        xVar.b(new b());
        i();
    }

    public void f(c cVar) {
        c.f.a.b.j3.g.e(cVar);
        this.f17785c.add(cVar);
    }

    public c.f.a.b.c3.a0 g(Uri uri) {
        r rVar = this.f17786d.get(uri);
        if (rVar == null || rVar.f6767b == 4) {
            return null;
        }
        return rVar.f6766a;
    }

    public boolean h(p1 p1Var) {
        r rVar = this.f17786d.get(((p1.g) c.f.a.b.j3.g.e(p1Var.f9643d)).f9685a);
        return (rVar == null || rVar.f6767b == 4) ? false : true;
    }

    public final void i() {
        try {
            t tVarA = this.f17787e.a(new int[0]);
            while (tVarA.g0()) {
                try {
                    r rVarK0 = tVarA.k0();
                    this.f17786d.put(rVarK0.f6766a.f6664c, rVarK0);
                } finally {
                }
            }
            tVarA.close();
        } catch (IOException e2) {
            z.j("DownloadTracker", "Failed to query downloads", e2);
        }
    }

    public void j(c cVar) {
        this.f17785c.remove(cVar);
    }

    public void k(n nVar, p1 p1Var, l2 l2Var) {
        r rVar = this.f17786d.get(((p1.g) c.f.a.b.j3.g.e(p1Var.f9643d)).f9685a);
        if (rVar != null && rVar.f6767b != 4) {
            b0.y(this.f17783a, h.class, rVar.f6766a.f6663b, false);
            return;
        }
        d dVar = this.f17789g;
        if (dVar != null) {
            dVar.k();
        }
        this.f17789g = new d(nVar, v.h(this.f17783a, p1Var, l2Var, this.f17784b), p1Var);
    }
}
