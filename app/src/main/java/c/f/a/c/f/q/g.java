package c.f.a.c.f.q;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.f.a.c.f.o.a;
import c.f.a.c.f.o.f;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g<T extends IInterface> extends c<T> implements a.f {
    private final d zaa;
    private final Set<Scope> zab;
    private final Account zac;

    public g(@RecentlyNonNull Context context, @RecentlyNonNull Handler handler, int i2, @RecentlyNonNull d dVar) {
        super(context, handler, h.b(context), c.f.a.c.f.e.n(), i2, null, null);
        this.zaa = (d) o.i(dVar);
        this.zac = dVar.a();
        this.zab = zaa(dVar.c());
    }

    public g(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i2, @RecentlyNonNull d dVar) {
        this(context, looper, h.b(context), c.f.a.c.f.e.n(), i2, dVar, null, null);
    }

    @Deprecated
    public g(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i2, @RecentlyNonNull d dVar, @RecentlyNonNull f.a aVar, @RecentlyNonNull f.b bVar) {
        this(context, looper, i2, dVar, (c.f.a.c.f.o.n.f) aVar, (c.f.a.c.f.o.n.m) bVar);
    }

    public g(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i2, @RecentlyNonNull d dVar, @RecentlyNonNull c.f.a.c.f.o.n.f fVar, @RecentlyNonNull c.f.a.c.f.o.n.m mVar) {
        this(context, looper, h.b(context), c.f.a.c.f.e.n(), i2, dVar, (c.f.a.c.f.o.n.f) o.i(fVar), (c.f.a.c.f.o.n.m) o.i(mVar));
    }

    public g(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull h hVar, @RecentlyNonNull c.f.a.c.f.e eVar, int i2, @RecentlyNonNull d dVar, c.f.a.c.f.o.n.f fVar, c.f.a.c.f.o.n.m mVar) {
        super(context, looper, hVar, eVar, i2, fVar == null ? null : new f0(fVar), mVar == null ? null : new g0(mVar), dVar.f());
        this.zaa = dVar;
        this.zac = dVar.a();
        this.zab = zaa(dVar.c());
    }

    private final Set<Scope> zaa(Set<Scope> set) {
        Set<Scope> setValidateScopes = validateScopes(set);
        Iterator<Scope> it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setValidateScopes;
    }

    @Override // c.f.a.c.f.q.c
    @RecentlyNullable
    public final Account getAccount() {
        return this.zac;
    }

    @RecentlyNonNull
    public final d getClientSettings() {
        return this.zaa;
    }

    @RecentlyNonNull
    public c.f.a.c.f.d[] getRequiredFeatures() {
        return new c.f.a.c.f.d[0];
    }

    @Override // c.f.a.c.f.q.c
    @RecentlyNonNull
    public final Set<Scope> getScopes() {
        return this.zab;
    }

    @Override // c.f.a.c.f.o.a.f
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zab : Collections.emptySet();
    }

    public Set<Scope> validateScopes(@RecentlyNonNull Set<Scope> set) {
        return set;
    }
}
