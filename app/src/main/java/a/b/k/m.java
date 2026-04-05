package a.b.k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import org.achartengine.chart.TimeChart;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static m f233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationManager f235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f236d = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f240d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f242f;
    }

    public m(Context context, LocationManager locationManager) {
        this.f234b = context;
        this.f235c = locationManager;
    }

    public static m a(Context context) {
        if (f233a == null) {
            Context applicationContext = context.getApplicationContext();
            f233a = new m(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f233a;
    }

    @SuppressLint({"MissingPermission"})
    public final Location b() {
        Location locationC = a.i.i.d.b(this.f234b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = a.i.i.d.b(this.f234b, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    public final Location c(String str) {
        try {
            if (this.f235c.isProviderEnabled(str)) {
                return this.f235c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    public boolean d() {
        a aVar = this.f236d;
        if (e()) {
            return aVar.f237a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f237a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i2 = Calendar.getInstance().get(11);
        return i2 < 6 || i2 >= 22;
    }

    public final boolean e() {
        return this.f236d.f242f > System.currentTimeMillis();
    }

    public final void f(Location location) {
        long j2;
        a aVar = this.f236d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        l lVarB = l.b();
        lVarB.a(jCurrentTimeMillis - TimeChart.DAY, location.getLatitude(), location.getLongitude());
        long j3 = lVarB.f230b;
        lVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = lVarB.f232d == 1;
        long j4 = lVarB.f231c;
        long j5 = lVarB.f230b;
        boolean z2 = z;
        lVarB.a(TimeChart.DAY + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = lVarB.f231c;
        if (j4 == -1 || j5 == -1) {
            j2 = 43200000 + jCurrentTimeMillis;
        } else {
            j2 = (jCurrentTimeMillis > j5 ? 0 + j6 : jCurrentTimeMillis > j4 ? 0 + j5 : 0 + j4) + 60000;
        }
        aVar.f237a = z2;
        aVar.f238b = j3;
        aVar.f239c = j4;
        aVar.f240d = j5;
        aVar.f241e = j6;
        aVar.f242f = j2;
    }
}
