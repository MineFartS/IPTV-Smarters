package a.b0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f997b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f996a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<m> f998c = new ArrayList<>();

    @Deprecated
    public s() {
    }

    public s(View view) {
        this.f997b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f997b == sVar.f997b && this.f996a.equals(sVar.f996a);
    }

    public int hashCode() {
        return (this.f997b.hashCode() * 31) + this.f996a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f997b + "\n") + "    values:";
        for (String str2 : this.f996a.keySet()) {
            str = str + "    " + str2 + ": " + this.f996a.get(str2) + "\n";
        }
        return str;
    }
}
