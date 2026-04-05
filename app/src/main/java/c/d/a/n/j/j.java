package c.d.a.n.j;

import android.text.TextUtils;
import com.amazonaws.http.HttpHeader;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, List<i>> f5682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Map<String, String> f5683d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f5684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Map<String, List<i>> f5685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5686c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map<String, List<i>> f5687d = f5685b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f5688e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f5689f = true;

        static {
            String property = System.getProperty("http.agent");
            f5684a = property;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put(HttpHeader.USER_AGENT, Collections.singletonList(new b(property)));
            }
            map.put("Accept-Encoding", Collections.singletonList(new b("identity")));
            f5685b = Collections.unmodifiableMap(map);
        }

        public j a() {
            this.f5686c = true;
            return new j(this.f5687d);
        }
    }

    public static final class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5690a;

        public b(String str) {
            this.f5690a = str;
        }

        @Override // c.d.a.n.j.i
        public String a() {
            return this.f5690a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f5690a.equals(((b) obj).f5690a);
            }
            return false;
        }

        public int hashCode() {
            return this.f5690a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f5690a + "'}";
        }
    }

    public j(Map<String, List<i>> map) {
        this.f5682c = Collections.unmodifiableMap(map);
    }

    public final Map<String, String> a() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.f5682c.entrySet()) {
            StringBuilder sb = new StringBuilder();
            List<i> value = entry.getValue();
            for (int i2 = 0; i2 < value.size(); i2++) {
                sb.append(value.get(i2).a());
                if (i2 != value.size() - 1) {
                    sb.append(',');
                }
            }
            map.put(entry.getKey(), sb.toString());
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f5682c.equals(((j) obj).f5682c);
        }
        return false;
    }

    @Override // c.d.a.n.j.e
    public Map<String, String> getHeaders() {
        if (this.f5683d == null) {
            synchronized (this) {
                if (this.f5683d == null) {
                    this.f5683d = Collections.unmodifiableMap(a());
                }
            }
        }
        return this.f5683d;
    }

    public int hashCode() {
        return this.f5682c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f5682c + '}';
    }
}
