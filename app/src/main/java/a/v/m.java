package a.v;

import a.v.s;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
@s.b("navigation")
public class m extends s<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f3594a;

    public m(t tVar) {
        this.f3594a = tVar;
    }

    @Override // a.v.s
    public boolean e() {
        return true;
    }

    @Override // a.v.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public l a() {
        return new l(this);
    }

    @Override // a.v.s
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public k b(l lVar, Bundle bundle, p pVar, s.a aVar) {
        int iR = lVar.R();
        if (iR == 0) {
            throw new IllegalStateException("no start destination defined via app:startDestination for " + lVar.s());
        }
        k kVarP = lVar.P(iR, false);
        if (kVarP != null) {
            return this.f3594a.e(kVarP.B()).b(kVarP, kVarP.d(bundle), pVar, aVar);
        }
        throw new IllegalArgumentException("navigation destination " + lVar.Q() + " is not a direct child of this NavGraph");
    }
}
