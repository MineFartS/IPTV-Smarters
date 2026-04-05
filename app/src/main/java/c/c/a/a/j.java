package c.c.a.a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<String> f5142b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<String> f5144b;

        public /* synthetic */ a(v vVar) {
        }

        public j a() {
            if (this.f5143a == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.f5144b == null) {
                throw new IllegalArgumentException("SKU list or SkuWithOffer list must be set");
            }
            j jVar = new j();
            jVar.f5141a = this.f5143a;
            jVar.f5142b = this.f5144b;
            return jVar;
        }

        public a b(List<String> list) {
            this.f5144b = new ArrayList(list);
            return this;
        }

        public a c(String str) {
            this.f5143a = str;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f5141a;
    }

    public List<String> b() {
        return this.f5142b;
    }
}
