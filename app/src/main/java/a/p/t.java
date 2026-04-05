package a.p;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class[] f3013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Object> f3014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, SavedStateRegistry.b> f3015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, ?> f3016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SavedStateRegistry.b f3017e;

    public class a implements SavedStateRegistry.b {
        public a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            for (Map.Entry entry : new HashMap(t.this.f3015c).entrySet()) {
                t.this.c((String) entry.getKey(), ((SavedStateRegistry.b) entry.getValue()).a());
            }
            Set<String> setKeySet = t.this.f3014b.keySet();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(setKeySet.size());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            for (String str : setKeySet) {
                arrayList.add(str);
                arrayList2.add(t.this.f3014b.get(str));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    static {
        Class[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        Class<SizeF> cls = Integer.TYPE;
        clsArr[4] = cls;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        int i2 = Build.VERSION.SDK_INT;
        clsArr[27] = i2 >= 21 ? Size.class : cls;
        if (i2 >= 21) {
            cls = SizeF.class;
        }
        clsArr[28] = cls;
        f3013a = clsArr;
    }

    public t() {
        this.f3015c = new HashMap();
        this.f3016d = new HashMap();
        this.f3017e = new a();
        this.f3014b = new HashMap();
    }

    public t(Map<String, Object> map) {
        this.f3015c = new HashMap();
        this.f3016d = new HashMap();
        this.f3017e = new a();
        this.f3014b = new HashMap(map);
    }

    public static t a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new t();
        }
        HashMap map = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                map.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new t(map);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
            map.put((String) parcelableArrayList.get(i2), parcelableArrayList2.get(i2));
        }
        return new t(map);
    }

    public static void d(Object obj) {
        if (obj == null) {
            return;
        }
        for (Class cls : f3013a) {
            if (cls.isInstance(obj)) {
                return;
            }
        }
        throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
    }

    public SavedStateRegistry.b b() {
        return this.f3017e;
    }

    public <T> void c(String str, T t) {
        d(t);
        p pVar = (p) this.f3016d.get(str);
        if (pVar != null) {
            pVar.n(t);
        } else {
            this.f3014b.put(str, t);
        }
    }
}
