package c.f.a.a.j.y.j;

import android.app.job.JobInfo;
import c.f.a.a.j.y.j.d;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.achartengine.chart.TimeChart;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class g {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c.f.a.a.j.a0.a f6274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<c.f.a.a.d, b> f6275b = new HashMap();

        public a a(c.f.a.a.d dVar, b bVar) {
            this.f6275b.put(dVar, bVar);
            return this;
        }

        public g b() {
            if (this.f6274a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f6275b.keySet().size() < c.f.a.a.d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<c.f.a.a.d, b> map = this.f6275b;
            this.f6275b = new HashMap();
            return g.d(this.f6274a, map);
        }

        public a c(c.f.a.a.j.a0.a aVar) {
            this.f6274a = aVar;
            return this;
        }
    }

    @AutoValue
    public static abstract class b {

        @AutoValue.Builder
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j2);

            public abstract a c(Set<c> set);

            public abstract a d(long j2);
        }

        public static a a() {
            return new d.b().c(Collections.emptySet());
        }

        public abstract long b();

        public abstract Set<c> c();

        public abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static a b() {
        return new a();
    }

    public static g d(c.f.a.a.j.a0.a aVar, Map<c.f.a.a.d, b> map) {
        return new c.f.a.a.j.y.j.c(aVar, map);
    }

    public static g f(c.f.a.a.j.a0.a aVar) {
        return b().a(c.f.a.a.d.DEFAULT, b.a().b(30000L).d(TimeChart.DAY).a()).a(c.f.a.a.d.HIGHEST, b.a().b(1000L).d(TimeChart.DAY).a()).a(c.f.a.a.d.VERY_LOW, b.a().b(TimeChart.DAY).d(TimeChart.DAY).c(i(c.NETWORK_UNMETERED, c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    public static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    public final long a(int i2, long j2) {
        int i3 = i2 - 1;
        double dMax = Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i3)));
        double dPow = Math.pow(3.0d, i3);
        double d2 = j2;
        Double.isNaN(d2);
        return (long) (dPow * d2 * dMax);
    }

    public JobInfo.Builder c(JobInfo.Builder builder, c.f.a.a.d dVar, long j2, int i2) {
        builder.setMinimumLatency(g(dVar, j2, i2));
        j(builder, h().get(dVar).c());
        return builder;
    }

    public abstract c.f.a.a.j.a0.a e();

    public long g(c.f.a.a.d dVar, long j2, int i2) {
        long jA = j2 - e().a();
        b bVar = h().get(dVar);
        return Math.min(Math.max(a(i2, bVar.b()), jA), bVar.d());
    }

    public abstract Map<c.f.a.a.d, b> h();

    public final void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
