package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.q.o;
import c.f.a.c.j.h.yd;
import c.f.a.c.k.b.c5;
import c.f.a.c.k.b.g7;
import c.f.a.c.k.b.z5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile AppMeasurement f24276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c5 f24277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g7 f24278c;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @RecentlyNonNull
        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @RecentlyNonNull
        @Keep
        public String mExpiredEventName;

        @RecentlyNonNull
        @Keep
        public Bundle mExpiredEventParams;

        @RecentlyNonNull
        @Keep
        public String mName;

        @RecentlyNonNull
        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @RecentlyNonNull
        @Keep
        public String mTimedOutEventName;

        @RecentlyNonNull
        @Keep
        public Bundle mTimedOutEventParams;

        @RecentlyNonNull
        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @RecentlyNonNull
        @Keep
        public String mTriggeredEventName;

        @RecentlyNonNull
        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @RecentlyNonNull
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            o.i(bundle);
            this.mAppId = (String) z5.b(bundle, "app_id", String.class, null);
            this.mOrigin = (String) z5.b(bundle, "origin", String.class, null);
            this.mName = (String) z5.b(bundle, "name", String.class, null);
            this.mValue = z5.b(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) z5.b(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) z5.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) z5.b(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) z5.b(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) z5.b(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) z5.b(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) z5.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) z5.b(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) z5.b(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) z5.b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) z5.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) z5.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                z5.a(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }
    }

    public AppMeasurement(c5 c5Var) {
        o.i(c5Var);
        this.f24277b = c5Var;
        this.f24278c = null;
    }

    public AppMeasurement(g7 g7Var) {
        o.i(g7Var);
        this.f24278c = g7Var;
        this.f24277b = null;
    }

    @RecentlyNonNull
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(@RecentlyNonNull Context context) {
        g7 g7Var;
        if (f24276a == null) {
            synchronized (AppMeasurement.class) {
                if (f24276a == null) {
                    try {
                        g7Var = (g7) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    } catch (ClassNotFoundException | Exception unused) {
                        g7Var = null;
                    }
                    if (g7Var != null) {
                        f24276a = new AppMeasurement(g7Var);
                    } else {
                        f24276a = new AppMeasurement(c5.h(context, new yd(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return f24276a;
    }

    @Keep
    public void beginAdUnitExposure(@RecentlyNonNull String str) {
        g7 g7Var = this.f24278c;
        if (g7Var != null) {
            g7Var.a(str);
        } else {
            o.i(this.f24277b);
            this.f24277b.g().h(str, this.f24277b.a().b());
        }
    }

    @Keep
    public void clearConditionalUserProperty(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Bundle bundle) {
        g7 g7Var = this.f24278c;
        if (g7Var != null) {
            g7Var.h(str, str2, bundle);
        } else {
            o.i(this.f24277b);
            this.f24277b.F().B(str, str2, bundle);
        }
    }

    @Keep
    public void endAdUnitExposure(@RecentlyNonNull String str) {
        g7 g7Var = this.f24278c;
        if (g7Var != null) {
            g7Var.n(str);
        } else {
            o.i(this.f24277b);
            this.f24277b.g().i(str, this.f24277b.a().b());
        }
    }

    @Keep
    public long generateEventId() {
        g7 g7Var = this.f24278c;
        if (g7Var != null) {
            return g7Var.e();
        }
        o.i(this.f24277b);
        return this.f24277b.G().g0();
    }

    @RecentlyNonNull
    @Keep
    public String getAppInstanceId() {
        g7 g7Var = this.f24278c;
        if (g7Var != null) {
            return g7Var.o();
        }
        o.i(this.f24277b);
        return this.f24277b.F().q();
    }

    @RecentlyNonNull
    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        List<Bundle> listC;
        g7 g7Var = this.f24278c;
        if (g7Var != null) {
            listC = g7Var.b(str, str2);
        } else {
            o.i(this.f24277b);
            listC = this.f24277b.F().C(str, str2);
        }
        ArrayList arrayList = new ArrayList(listC == null ? 0 : listC.size());
        Iterator<Bundle> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    @RecentlyNonNull
    @Keep
    public String getCurrentScreenClass() {
        g7 g7Var = this.f24278c;
        if (g7Var != null) {
            return g7Var.j();
        }
        o.i(this.f24277b);
        return this.f24277b.F().F();
    }

    @RecentlyNonNull
    @Keep
    public String getCurrentScreenName() {
        g7 g7Var = this.f24278c;
        if (g7Var != null) {
            return g7Var.f();
        }
        o.i(this.f24277b);
        return this.f24277b.F().E();
    }

    @RecentlyNonNull
    @Keep
    public String getGmpAppId() {
        g7 g7Var = this.f24278c;
        if (g7Var != null) {
            return g7Var.c();
        }
        o.i(this.f24277b);
        return this.f24277b.F().G();
    }

    @Keep
    public int getMaxUserProperties(@RecentlyNonNull String str) {
        g7 g7Var = this.f24278c;
        if (g7Var != null) {
            return g7Var.i(str);
        }
        o.i(this.f24277b);
        this.f24277b.F().y(str);
        return 25;
    }

    @RecentlyNonNull
    @Keep
    public Map<String, Object> getUserProperties(@RecentlyNonNull String str, @RecentlyNonNull String str2, boolean z) {
        g7 g7Var = this.f24278c;
        if (g7Var != null) {
            return g7Var.k(str, str2, z);
        }
        o.i(this.f24277b);
        return this.f24277b.F().D(str, str2, z);
    }

    @Keep
    public void logEventInternal(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Bundle bundle) {
        g7 g7Var = this.f24278c;
        if (g7Var != null) {
            g7Var.g(str, str2, bundle);
        } else {
            o.i(this.f24277b);
            this.f24277b.F().X(str, str2, bundle);
        }
    }

    @Keep
    public void setConditionalUserProperty(@RecentlyNonNull ConditionalUserProperty conditionalUserProperty) {
        o.i(conditionalUserProperty);
        g7 g7Var = this.f24278c;
        if (g7Var != null) {
            g7Var.d(conditionalUserProperty.a());
        } else {
            o.i(this.f24277b);
            this.f24277b.F().z(conditionalUserProperty.a());
        }
    }
}
