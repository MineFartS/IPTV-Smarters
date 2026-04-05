package a.t.l;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f3353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<a.t.l.a> f3354b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f3355a = new Bundle();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<a.t.l.a> f3356b;

        public a a(a.t.l.a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            ArrayList<a.t.l.a> arrayList = this.f3356b;
            if (arrayList == null) {
                this.f3356b = new ArrayList<>();
            } else if (arrayList.contains(aVar)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            this.f3356b.add(aVar);
            return this;
        }

        public d b() {
            ArrayList<a.t.l.a> arrayList = this.f3356b;
            if (arrayList != null) {
                int size = arrayList.size();
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList2.add(this.f3356b.get(i2).a());
                }
                this.f3355a.putParcelableArrayList("routes", arrayList2);
            }
            return new d(this.f3355a, this.f3356b);
        }
    }

    public d(Bundle bundle, List<a.t.l.a> list) {
        this.f3353a = bundle;
        this.f3354b = list;
    }

    public static d b(Bundle bundle) {
        if (bundle != null) {
            return new d(bundle, null);
        }
        return null;
    }

    public void a() {
        if (this.f3354b == null) {
            ArrayList parcelableArrayList = this.f3353a.getParcelableArrayList("routes");
            if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                this.f3354b = Collections.emptyList();
                return;
            }
            int size = parcelableArrayList.size();
            this.f3354b = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f3354b.add(a.t.l.a.d((Bundle) parcelableArrayList.get(i2)));
            }
        }
    }

    public List<a.t.l.a> c() {
        a();
        return this.f3354b;
    }

    public boolean d() {
        a();
        int size = this.f3354b.size();
        for (int i2 = 0; i2 < size; i2++) {
            a.t.l.a aVar = this.f3354b.get(i2);
            if (aVar == null || !aVar.y()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "MediaRouteProviderDescriptor{ routes=" + Arrays.toString(c().toArray()) + ", isValid=" + d() + " }";
    }
}
