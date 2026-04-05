package c.c.b;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f5183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f5184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f5185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f5186d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f5187e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f5188f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Map<String, String> f5189g = Collections.emptyMap();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<g> f5190h;

        public boolean a() {
            return this.f5187e < System.currentTimeMillis();
        }

        public boolean b() {
            return this.f5188f < System.currentTimeMillis();
        }
    }

    void a(String str, a aVar);

    a get(String str);

    void initialize();
}
