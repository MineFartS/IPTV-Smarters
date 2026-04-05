package c.f.a.c.f.q;

import android.accounts.Account;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Account f12556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Scope> f12557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<Scope> f12558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<c.f.a.c.f.o.a<?>, a0> f12559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final View f12561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f12562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f12563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c.f.a.c.m.a f12564i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f12565j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Account f12566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a.f.b<Scope> f12567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f12568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f12569d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c.f.a.c.m.a f12570e = c.f.a.c.m.a.f14517a;

        @RecentlyNonNull
        public d a() {
            return new d(this.f12566a, this.f12567b, null, 0, null, this.f12568c, this.f12569d, this.f12570e, false);
        }

        @RecentlyNonNull
        public a b(@RecentlyNonNull String str) {
            this.f12568c = str;
            return this;
        }

        @RecentlyNonNull
        public final a c(@Nullable Account account) {
            this.f12566a = account;
            return this;
        }

        @RecentlyNonNull
        public final a d(@RecentlyNonNull Collection<Scope> collection) {
            if (this.f12567b == null) {
                this.f12567b = new a.f.b<>();
            }
            this.f12567b.addAll(collection);
            return this;
        }

        @RecentlyNonNull
        public final a e(@RecentlyNonNull String str) {
            this.f12569d = str;
            return this;
        }
    }

    public d(@Nullable Account account, @RecentlyNonNull Set<Scope> set, @RecentlyNonNull Map<c.f.a.c.f.o.a<?>, a0> map, int i2, @Nullable View view, @RecentlyNonNull String str, @RecentlyNonNull String str2, @Nullable c.f.a.c.m.a aVar, boolean z) {
        this.f12556a = account;
        Set<Scope> setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f12557b = setEmptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f12559d = map;
        this.f12561f = view;
        this.f12560e = i2;
        this.f12562g = str;
        this.f12563h = str2;
        this.f12564i = aVar == null ? c.f.a.c.m.a.f14517a : aVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator<a0> it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().f12546a);
        }
        this.f12558c = Collections.unmodifiableSet(hashSet);
    }

    @RecentlyNullable
    public Account a() {
        return this.f12556a;
    }

    @RecentlyNonNull
    public Account b() {
        Account account = this.f12556a;
        return account != null ? account : new Account(c.DEFAULT_ACCOUNT, "com.google");
    }

    @RecentlyNonNull
    public Set<Scope> c() {
        return this.f12558c;
    }

    @RecentlyNonNull
    public String d() {
        return this.f12562g;
    }

    @RecentlyNonNull
    public Set<Scope> e() {
        return this.f12557b;
    }

    @RecentlyNullable
    public final String f() {
        return this.f12563h;
    }

    @RecentlyNonNull
    public final c.f.a.c.m.a g() {
        return this.f12564i;
    }

    @RecentlyNullable
    public final Integer h() {
        return this.f12565j;
    }

    public final void i(@RecentlyNonNull Integer num) {
        this.f12565j = num;
    }
}
