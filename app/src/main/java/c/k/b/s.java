package c.k.b;

import android.content.Context;
import android.net.Uri;
import c.k.a.d;
import c.k.a.s;
import c.k.b.j;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class s implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.k.a.q f18743a;

    public s(Context context) {
        this(g0.f(context));
    }

    public s(c.k.a.q qVar) {
        this.f18743a = qVar;
    }

    public s(File file) {
        this(file, g0.a(file));
    }

    public s(File file, long j2) {
        this(b());
        try {
            this.f18743a.E(new c.k.a.c(file, j2));
        } catch (IOException unused) {
        }
    }

    public static c.k.a.q b() {
        c.k.a.q qVar = new c.k.a.q();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qVar.F(15000L, timeUnit);
        qVar.G(20000L, timeUnit);
        qVar.H(20000L, timeUnit);
        return qVar;
    }

    @Override // c.k.b.j
    public j.a a(Uri uri, int i2) throws j.b {
        c.k.a.d dVarA;
        if (i2 == 0) {
            dVarA = null;
        } else if (q.isOfflineOnly(i2)) {
            dVarA = c.k.a.d.f18184b;
        } else {
            d.b bVar = new d.b();
            if (!q.shouldReadFromDiskCache(i2)) {
                bVar.c();
            }
            if (!q.shouldWriteToDiskCache(i2)) {
                bVar.d();
            }
            dVarA = bVar.a();
        }
        s.b bVarN = new s.b().n(uri.toString());
        if (dVarA != null) {
            bVarN.i(dVarA);
        }
        c.k.a.u uVarA = this.f18743a.C(bVarN.h()).a();
        int iO = uVarA.o();
        if (iO < 300) {
            boolean z = uVarA.m() != null;
            c.k.a.v vVarK = uVarA.k();
            return new j.a(vVarK.d(), z, vVarK.i());
        }
        uVarA.k().close();
        throw new j.b(iO + " " + uVarA.u(), i2, iO);
    }
}
