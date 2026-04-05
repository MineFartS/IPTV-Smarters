package a.v;

import a.v.s;
import android.annotation.SuppressLint;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"TypeParameterUnusedInFormals"})
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap<Class<?>, String> f3629a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, s<? extends k>> f3630b = new HashMap<>();

    public static String c(Class<? extends s> cls) {
        HashMap<Class<?>, String> map = f3629a;
        String strValue = map.get(cls);
        if (strValue == null) {
            s.b bVar = (s.b) cls.getAnnotation(s.b.class);
            strValue = bVar != null ? bVar.value() : null;
            if (!g(strValue)) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for " + cls.getSimpleName());
            }
            map.put(cls, strValue);
        }
        return strValue;
    }

    public static boolean g(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    public final s<? extends k> a(s<? extends k> sVar) {
        return b(c(sVar.getClass()), sVar);
    }

    public s<? extends k> b(String str, s<? extends k> sVar) {
        if (g(str)) {
            return this.f3630b.put(str, sVar);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public final <T extends s<?>> T d(Class<T> cls) {
        return (T) e(c(cls));
    }

    public <T extends s<?>> T e(String str) {
        if (!g(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        s<? extends k> sVar = this.f3630b.get(str);
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    public Map<String, s<? extends k>> f() {
        return this.f3630b;
    }
}
