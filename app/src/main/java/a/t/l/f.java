package a.t.l;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f3357a = new f(new Bundle(), null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f3358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f3359c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<String> f3360a;

        public a() {
        }

        public a(f fVar) {
            if (fVar == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            fVar.c();
            if (fVar.f3359c.isEmpty()) {
                return;
            }
            this.f3360a = new ArrayList<>(fVar.f3359c);
        }

        public a a(Collection<String> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("categories must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator<String> it = collection.iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
            return this;
        }

        public a b(String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            if (this.f3360a == null) {
                this.f3360a = new ArrayList<>();
            }
            if (!this.f3360a.contains(str)) {
                this.f3360a.add(str);
            }
            return this;
        }

        public a c(f fVar) {
            if (fVar == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            a(fVar.e());
            return this;
        }

        public f d() {
            if (this.f3360a == null) {
                return f.f3357a;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", this.f3360a);
            return new f(bundle, this.f3360a);
        }
    }

    public f(Bundle bundle, List<String> list) {
        this.f3358b = bundle;
        this.f3359c = list;
    }

    public static f d(Bundle bundle) {
        if (bundle != null) {
            return new f(bundle, null);
        }
        return null;
    }

    public Bundle a() {
        return this.f3358b;
    }

    public boolean b(f fVar) {
        if (fVar == null) {
            return false;
        }
        c();
        fVar.c();
        return this.f3359c.containsAll(fVar.f3359c);
    }

    public void c() {
        if (this.f3359c == null) {
            ArrayList<String> stringArrayList = this.f3358b.getStringArrayList("controlCategories");
            this.f3359c = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f3359c = Collections.emptyList();
            }
        }
    }

    public List<String> e() {
        c();
        return this.f3359c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        c();
        fVar.c();
        return this.f3359c.equals(fVar.f3359c);
    }

    public boolean f() {
        c();
        return this.f3359c.isEmpty();
    }

    public boolean g() {
        c();
        return !this.f3359c.contains(null);
    }

    public boolean h(List<IntentFilter> list) {
        if (list != null) {
            c();
            int size = this.f3359c.size();
            if (size != 0) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    IntentFilter intentFilter = list.get(i2);
                    if (intentFilter != null) {
                        for (int i3 = 0; i3 < size; i3++) {
                            if (intentFilter.hasCategory(this.f3359c.get(i3))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        c();
        return this.f3359c.hashCode();
    }

    public String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(e().toArray()) + " }";
    }
}
