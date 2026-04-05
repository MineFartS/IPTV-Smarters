package c.f.a.c.f.o;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.f.a.c.f.o.a.d;
import c.f.a.c.f.o.f;
import c.f.a.c.f.q.c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class a<O extends d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0156a<?, O> f12352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g<?> f12353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12354c;

    /* JADX INFO: renamed from: c.f.a.c.f.o.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0156a<T extends f, O> extends e<T, O> {
        @RecentlyNonNull
        @Deprecated
        public T buildClient(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull c.f.a.c.f.q.d dVar, @RecentlyNonNull O o2, @RecentlyNonNull f.a aVar, @RecentlyNonNull f.b bVar) {
            return (T) buildClient(context, looper, dVar, (Object) o2, (c.f.a.c.f.o.n.f) aVar, (c.f.a.c.f.o.n.m) bVar);
        }

        @RecentlyNonNull
        public T buildClient(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull c.f.a.c.f.q.d dVar, @RecentlyNonNull O o2, @RecentlyNonNull c.f.a.c.f.o.n.f fVar, @RecentlyNonNull c.f.a.c.f.o.n.m mVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* JADX INFO: renamed from: c.f.a.c.f.o.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0157a extends d {
            @RecentlyNonNull
            Account b();
        }

        public interface b extends d {
            @RecentlyNullable
            GoogleSignInAccount a();
        }

        public static final class c implements d {
        }
    }

    public static abstract class e<T extends b, O> {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        @RecentlyNonNull
        public List<Scope> getImpliedScopes(O o2) {
            return Collections.emptyList();
        }

        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    }

    public interface f extends b {
        void connect(@RecentlyNonNull c.InterfaceC0159c interfaceC0159c);

        void disconnect();

        void disconnect(@RecentlyNonNull String str);

        @RecentlyNonNull
        c.f.a.c.f.d[] getAvailableFeatures();

        @RecentlyNonNull
        String getEndpointPackageName();

        @RecentlyNullable
        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(c.f.a.c.f.q.i iVar, Set<Scope> set);

        Set<Scope> getScopesForConnectionlessNonSignIn();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(@RecentlyNonNull c.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public static final class g<C extends f> extends c<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(@RecentlyNonNull String str, @RecentlyNonNull AbstractC0156a<C, O> abstractC0156a, @RecentlyNonNull g<C> gVar) {
        c.f.a.c.f.q.o.j(abstractC0156a, "Cannot construct an Api with a null ClientBuilder");
        c.f.a.c.f.q.o.j(gVar, "Cannot construct an Api with a null ClientKey");
        this.f12354c = str;
        this.f12352a = abstractC0156a;
        this.f12353b = gVar;
    }

    @RecentlyNonNull
    public final AbstractC0156a<?, O> a() {
        return this.f12352a;
    }

    @RecentlyNonNull
    public final String b() {
        return this.f12354c;
    }
}
