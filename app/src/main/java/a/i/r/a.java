package a.i.r;

import a.i.r.g0.c;
import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final View.AccessibilityDelegate f1962a = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View.AccessibilityDelegate f1963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View.AccessibilityDelegate f1964c;

    /* JADX INFO: renamed from: a.i.r.a$a, reason: collision with other inner class name */
    public static final class C0040a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f1965a;

        public C0040a(a aVar) {
            this.f1965a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f1965a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            a.i.r.g0.d dVarB = this.f1965a.b(view);
            if (dVarB != null) {
                return (AccessibilityNodeProvider) dVarB.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1965a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            a.i.r.g0.c cVarX0 = a.i.r.g0.c.x0(accessibilityNodeInfo);
            cVarX0.o0(x.X(view));
            cVarX0.g0(x.S(view));
            cVarX0.k0(x.p(view));
            cVarX0.s0(x.K(view));
            this.f1965a.g(view, cVarX0);
            cVarX0.e(accessibilityNodeInfo.getText(), view);
            List<c.a> listC = a.c(view);
            for (int i2 = 0; i2 < listC.size(); i2++) {
                cVarX0.b(listC.get(i2));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1965a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f1965a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.f1965a.j(view, i2, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i2) {
            this.f1965a.l(view, i2);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f1965a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(f1962a);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1963b = accessibilityDelegate;
        this.f1964c = new C0040a(this);
    }

    public static List<c.a> c(View view) {
        List<c.a> list = (List) view.getTag(a.i.d.P);
        return list == null ? Collections.emptyList() : list;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1963b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public a.i.r.g0.d b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f1963b.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new a.i.r.g0.d(accessibilityNodeProvider);
    }

    public View.AccessibilityDelegate d() {
        return this.f1964c;
    }

    public final boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrP = a.i.r.g0.c.p(view.createAccessibilityNodeInfo().getText());
            for (int i2 = 0; clickableSpanArrP != null && i2 < clickableSpanArrP.length; i2++) {
                if (clickableSpan.equals(clickableSpanArrP[i2])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f1963b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, a.i.r.g0.c cVar) {
        this.f1963b.onInitializeAccessibilityNodeInfo(view, cVar.w0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f1963b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1963b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i2, Bundle bundle) {
        List<c.a> listC = c(view);
        boolean zPerformAccessibilityAction = false;
        int i3 = 0;
        while (true) {
            if (i3 >= listC.size()) {
                break;
            }
            c.a aVar = listC.get(i3);
            if (aVar.b() == i2) {
                zPerformAccessibilityAction = aVar.d(view, bundle);
                break;
            }
            i3++;
        }
        if (!zPerformAccessibilityAction && Build.VERSION.SDK_INT >= 16) {
            zPerformAccessibilityAction = this.f1963b.performAccessibilityAction(view, i2, bundle);
        }
        return (zPerformAccessibilityAction || i2 != a.i.d.f1636a) ? zPerformAccessibilityAction : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public final boolean k(int i2, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(a.i.d.Q);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i2)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void l(View view, int i2) {
        this.f1963b.sendAccessibilityEvent(view, i2);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f1963b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
