package c.f.b.b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f0<K0, V0> {

    public static class a extends e<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f15854a;

        public a(int i2) {
            this.f15854a = i2;
        }

        @Override // c.f.b.b.f0.e
        public <K, V> Map<K, Collection<V>> c() {
            return l0.c(this.f15854a);
        }
    }

    public static class b extends e<K0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f15855a;

        public b(Comparator comparator) {
            this.f15855a = comparator;
        }

        @Override // c.f.b.b.f0.e
        public <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f15855a);
        }
    }

    public static final class c<V> implements c.f.b.a.o<List<V>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f15856b;

        public c(int i2) {
            this.f15856b = j.b(i2, "expectedValuesPerKey");
        }

        @Override // c.f.b.a.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f15856b);
        }
    }

    public static abstract class d<K0, V0> extends f0<K0, V0> {
        public d() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> a0<K, V> e();
    }

    public static abstract class e<K0> {

        public class a extends d<K0, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f15857a;

            public a(int i2) {
                this.f15857a = i2;
            }

            @Override // c.f.b.b.f0.d
            public <K extends K0, V> a0<K, V> e() {
                return g0.b(e.this.c(), new c(this.f15857a));
            }
        }

        public d<K0, Object> a() {
            return b(2);
        }

        public d<K0, Object> b(int i2) {
            j.b(i2, "expectedValuesPerKey");
            return new a(i2);
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    public f0() {
    }

    public /* synthetic */ f0(a aVar) {
        this();
    }

    public static e<Object> a() {
        return b(8);
    }

    public static e<Object> b(int i2) {
        j.b(i2, "expectedKeys");
        return new a(i2);
    }

    public static e<Comparable> c() {
        return d(k0.c());
    }

    public static <K0> e<K0> d(Comparator<K0> comparator) {
        c.f.b.a.k.j(comparator);
        return new b(comparator);
    }
}
