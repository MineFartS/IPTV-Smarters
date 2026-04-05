package a.i.r.g0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2069a;

    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f2070a;

        public a(d dVar) {
            this.f2070a = dVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
            a.i.r.g0.c cVarB = this.f2070a.b(i2);
            if (cVarB == null) {
                return null;
            }
            return cVarB.w0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i2) {
            List<a.i.r.g0.c> listC = this.f2070a.c(str, i2);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(listC.get(i3).w0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i2, int i3, Bundle bundle) {
            return this.f2070a.f(i2, i3, bundle);
        }
    }

    public static class b extends a {
        public b(d dVar) {
            super(dVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i2) {
            a.i.r.g0.c cVarD = this.f2070a.d(i2);
            if (cVarD == null) {
                return null;
            }
            return cVarD.w0();
        }
    }

    public static class c extends b {
        public c(d dVar) {
            super(dVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f2070a.a(i2, a.i.r.g0.c.x0(accessibilityNodeInfo), str, bundle);
        }
    }

    public d() {
        int i2 = Build.VERSION.SDK_INT;
        this.f2069a = i2 >= 26 ? new c(this) : i2 >= 19 ? new b(this) : i2 >= 16 ? new a(this) : null;
    }

    public d(Object obj) {
        this.f2069a = obj;
    }

    public void a(int i2, a.i.r.g0.c cVar, String str, Bundle bundle) {
    }

    public a.i.r.g0.c b(int i2) {
        return null;
    }

    public List<a.i.r.g0.c> c(String str, int i2) {
        return null;
    }

    public a.i.r.g0.c d(int i2) {
        return null;
    }

    public Object e() {
        return this.f2069a;
    }

    public boolean f(int i2, int i3, Bundle bundle) {
        return false;
    }
}
