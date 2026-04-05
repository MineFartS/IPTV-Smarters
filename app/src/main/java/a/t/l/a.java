package a.t.l;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f3336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<IntentFilter> f3337b;

    /* JADX INFO: renamed from: a.t.l.a$a, reason: collision with other inner class name */
    public static final class C0072a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f3338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<String> f3339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<IntentFilter> f3340c;

        public C0072a(a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            this.f3338a = new Bundle(aVar.f3336a);
            aVar.c();
            if (aVar.f3337b.isEmpty()) {
                return;
            }
            this.f3340c = new ArrayList<>(aVar.f3337b);
        }

        public C0072a(String str, String str2) {
            this.f3338a = new Bundle();
            h(str);
            i(str2);
        }

        public C0072a a(IntentFilter intentFilter) {
            if (intentFilter == null) {
                throw new IllegalArgumentException("filter must not be null");
            }
            if (this.f3340c == null) {
                this.f3340c = new ArrayList<>();
            }
            if (!this.f3340c.contains(intentFilter)) {
                this.f3340c.add(intentFilter);
            }
            return this;
        }

        public C0072a b(Collection<IntentFilter> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("filters must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator<IntentFilter> it = collection.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            return this;
        }

        public a c() {
            ArrayList<IntentFilter> arrayList = this.f3340c;
            if (arrayList != null) {
                this.f3338a.putParcelableArrayList("controlFilters", arrayList);
            }
            ArrayList<String> arrayList2 = this.f3339b;
            if (arrayList2 != null) {
                this.f3338a.putStringArrayList("groupMemberIds", arrayList2);
            }
            return new a(this.f3338a, this.f3340c);
        }

        @Deprecated
        public C0072a d(boolean z) {
            this.f3338a.putBoolean("connecting", z);
            return this;
        }

        public C0072a e(String str) {
            this.f3338a.putString("status", str);
            return this;
        }

        public C0072a f(int i2) {
            this.f3338a.putInt("deviceType", i2);
            return this;
        }

        public C0072a g(boolean z) {
            this.f3338a.putBoolean("enabled", z);
            return this;
        }

        public C0072a h(String str) {
            this.f3338a.putString(Name.MARK, str);
            return this;
        }

        public C0072a i(String str) {
            this.f3338a.putString("name", str);
            return this;
        }

        public C0072a j(int i2) {
            this.f3338a.putInt("playbackStream", i2);
            return this;
        }

        public C0072a k(int i2) {
            this.f3338a.putInt("playbackType", i2);
            return this;
        }

        public C0072a l(int i2) {
            this.f3338a.putInt("presentationDisplayId", i2);
            return this;
        }

        public C0072a m(int i2) {
            this.f3338a.putInt("volume", i2);
            return this;
        }

        public C0072a n(int i2) {
            this.f3338a.putInt("volumeHandling", i2);
            return this;
        }

        public C0072a o(int i2) {
            this.f3338a.putInt("volumeMax", i2);
            return this;
        }
    }

    public a(Bundle bundle, List<IntentFilter> list) {
        this.f3336a = bundle;
        this.f3337b = list;
    }

    public static a d(Bundle bundle) {
        if (bundle != null) {
            return new a(bundle, null);
        }
        return null;
    }

    public Bundle a() {
        return this.f3336a;
    }

    public boolean b() {
        return this.f3336a.getBoolean("canDisconnect", false);
    }

    public void c() {
        if (this.f3337b == null) {
            ArrayList parcelableArrayList = this.f3336a.getParcelableArrayList("controlFilters");
            this.f3337b = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.f3337b = Collections.emptyList();
            }
        }
    }

    public int e() {
        return this.f3336a.getInt("connectionState", 0);
    }

    public List<IntentFilter> f() {
        c();
        return this.f3337b;
    }

    public String g() {
        return this.f3336a.getString("status");
    }

    public int h() {
        return this.f3336a.getInt("deviceType");
    }

    public Bundle i() {
        return this.f3336a.getBundle("extras");
    }

    public List<String> j() {
        return this.f3336a.getStringArrayList("groupMemberIds");
    }

    public Uri k() {
        String string = this.f3336a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public String l() {
        return this.f3336a.getString(Name.MARK);
    }

    public int m() {
        return this.f3336a.getInt("maxClientVersion", Integer.MAX_VALUE);
    }

    public int n() {
        return this.f3336a.getInt("minClientVersion", 1);
    }

    public String o() {
        return this.f3336a.getString("name");
    }

    public int p() {
        return this.f3336a.getInt("playbackStream", -1);
    }

    public int q() {
        return this.f3336a.getInt("playbackType", 1);
    }

    public int r() {
        return this.f3336a.getInt("presentationDisplayId", -1);
    }

    public IntentSender s() {
        return (IntentSender) this.f3336a.getParcelable("settingsIntent");
    }

    public int t() {
        return this.f3336a.getInt("volume");
    }

    public String toString() {
        return "MediaRouteDescriptor{ id=" + l() + ", groupMemberIds=" + j() + ", name=" + o() + ", description=" + g() + ", iconUri=" + k() + ", isEnabled=" + x() + ", isConnecting=" + w() + ", connectionState=" + e() + ", controlFilters=" + Arrays.toString(f().toArray()) + ", playbackType=" + q() + ", playbackStream=" + p() + ", deviceType=" + h() + ", volume=" + t() + ", volumeMax=" + v() + ", volumeHandling=" + u() + ", presentationDisplayId=" + r() + ", extras=" + i() + ", isValid=" + y() + ", minClientVersion=" + n() + ", maxClientVersion=" + m() + " }";
    }

    public int u() {
        return this.f3336a.getInt("volumeHandling", 0);
    }

    public int v() {
        return this.f3336a.getInt("volumeMax");
    }

    @Deprecated
    public boolean w() {
        return this.f3336a.getBoolean("connecting", false);
    }

    public boolean x() {
        return this.f3336a.getBoolean("enabled", true);
    }

    public boolean y() {
        c();
        return (TextUtils.isEmpty(l()) || TextUtils.isEmpty(o()) || this.f3337b.contains(null)) ? false : true;
    }
}
