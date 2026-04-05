package a.i.r.g0;

import a.i.r.g0.f;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f2048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccessibilityNodeInfo f2049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2050c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2051d = -1;

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2052a = new a(1, null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f2053b = new a(2, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f2054c = new a(4, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f2055d = new a(8, null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f2056e = new a(16, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f2057f = new a(32, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f2058g = new a(64, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f2059h = new a(128, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f2060i = new a(256, (CharSequence) null, (Class<? extends f.a>) f.b.class);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f2061j = new a(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED, (CharSequence) null, (Class<? extends f.a>) f.b.class);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f2062k = new a(1024, (CharSequence) null, (Class<? extends f.a>) f.c.class);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f2063l = new a(2048, (CharSequence) null, (Class<? extends f.a>) f.c.class);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f2064m = new a(ProgressEvent.PART_FAILED_EVENT_CODE, null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f2065n = new a(8192, null);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f2066o = new a(16384, null);
        public static final a p = new a(32768, null);
        public static final a q = new a(65536, null);
        public static final a r = new a(131072, (CharSequence) null, (Class<? extends f.a>) f.g.class);
        public static final a s = new a(262144, null);
        public static final a t = new a(524288, null);
        public static final a u = new a(Constants.MB, null);
        public static final a v = new a(2097152, (CharSequence) null, (Class<? extends f.a>) f.h.class);
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;
        public final Object N;
        public final int O;
        public final Class<? extends f.a> P;
        public final f Q;

        static {
            int i2 = Build.VERSION.SDK_INT;
            w = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            x = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, f.e.class);
            y = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            z = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            A = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            B = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            C = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            D = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            E = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            F = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            G = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            H = new a(i2 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, f.C0043f.class);
            I = new a(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, f.d.class);
            J = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            K = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            L = new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            M = new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        public a(int i2, CharSequence charSequence, f fVar) {
            this(null, i2, charSequence, fVar, null);
        }

        public a(int i2, CharSequence charSequence, Class<? extends f.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(Object obj, int i2, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.O = i2;
            this.Q = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            }
            this.N = obj;
            this.P = cls;
        }

        public a a(CharSequence charSequence, f fVar) {
            return new a(null, this.O, charSequence, fVar, this.P);
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.N).getId();
            }
            return 0;
        }

        public CharSequence c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.N).getLabel();
            }
            return null;
        }

        public boolean d(View view, Bundle bundle) {
            if (this.Q == null) {
                return false;
            }
            f.a aVar = null;
            Class<? extends f.a> cls = this.P;
            if (cls != null) {
                try {
                    f.a aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        aVarNewInstance.a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception e2) {
                        e = e2;
                        aVar = aVarNewInstance;
                        Class<? extends f.a> cls2 = this.P;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? Constants.NULL_VERSION_ID : cls2.getName()), e);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            return this.Q.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.N;
            Object obj3 = ((a) obj).N;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.N;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f2067a;

        public b(Object obj) {
            this.f2067a = obj;
        }

        public static b a(int i2, int i3, boolean z, int i4) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z, i4)) : i5 >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z)) : new b(null);
        }
    }

    /* JADX INFO: renamed from: a.i.r.g0.c$c, reason: collision with other inner class name */
    public static class C0042c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f2068a;

        public C0042c(Object obj) {
            this.f2068a = obj;
        }

        public static C0042c a(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
            int i6 = Build.VERSION.SDK_INT;
            return i6 >= 21 ? new C0042c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z, z2)) : i6 >= 19 ? new C0042c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z)) : new C0042c(null);
        }
    }

    public c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2049b = accessibilityNodeInfo;
    }

    public static c K() {
        return x0(AccessibilityNodeInfo.obtain());
    }

    public static c L(View view) {
        return x0(AccessibilityNodeInfo.obtain(view));
    }

    public static c M(c cVar) {
        return x0(AccessibilityNodeInfo.obtain(cVar.f2049b));
    }

    public static String i(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case ProgressEvent.PART_FAILED_EVENT_CODE /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionImeEnter:
                return "ACTION_IME_ENTER";
            default:
                switch (i2) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static c x0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    public boolean A() {
        return this.f2049b.isChecked();
    }

    public boolean B() {
        return this.f2049b.isClickable();
    }

    public boolean C() {
        return this.f2049b.isEnabled();
    }

    public boolean D() {
        return this.f2049b.isFocusable();
    }

    public boolean E() {
        return this.f2049b.isFocused();
    }

    public boolean F() {
        return this.f2049b.isLongClickable();
    }

    public boolean G() {
        return this.f2049b.isPassword();
    }

    public boolean H() {
        return this.f2049b.isScrollable();
    }

    public boolean I() {
        return this.f2049b.isSelected();
    }

    public boolean J() {
        return Build.VERSION.SDK_INT >= 26 ? this.f2049b.isShowingHintText() : k(4);
    }

    public boolean N(int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f2049b.performAction(i2, bundle);
        }
        return false;
    }

    public void O() {
        this.f2049b.recycle();
    }

    public boolean P(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f2049b.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.N);
        }
        return false;
    }

    public final void Q(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayU = u(view);
        if (sparseArrayU != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < sparseArrayU.size(); i2++) {
                if (sparseArrayU.valueAt(i2).get() == null) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                sparseArrayU.remove(((Integer) arrayList.get(i3)).intValue());
            }
        }
    }

    public void R(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2049b.setAccessibilityFocused(z);
        }
    }

    public final void S(int i2, boolean z) {
        Bundle bundleR = r();
        if (bundleR != null) {
            int i3 = bundleR.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i2 ^ (-1));
            if (!z) {
                i2 = 0;
            }
            bundleR.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }

    @Deprecated
    public void T(Rect rect) {
        this.f2049b.setBoundsInParent(rect);
    }

    public void U(Rect rect) {
        this.f2049b.setBoundsInScreen(rect);
    }

    public void V(boolean z) {
        this.f2049b.setCheckable(z);
    }

    public void W(boolean z) {
        this.f2049b.setChecked(z);
    }

    public void X(CharSequence charSequence) {
        this.f2049b.setClassName(charSequence);
    }

    public void Y(boolean z) {
        this.f2049b.setClickable(z);
    }

    public void Z(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2049b.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f2067a);
        }
    }

    public void a(int i2) {
        this.f2049b.addAction(i2);
    }

    public void a0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2049b.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0042c) obj).f2068a);
        }
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2049b.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.N);
        }
    }

    public void b0(CharSequence charSequence) {
        this.f2049b.setContentDescription(charSequence);
    }

    public void c(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2049b.addChild(view, i2);
        }
    }

    public void c0(boolean z) {
        this.f2049b.setEnabled(z);
    }

    public final void d(ClickableSpan clickableSpan, Spanned spanned, int i2) {
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
    }

    public void d0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2049b.setError(charSequence);
        }
    }

    public void e(CharSequence charSequence, View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19 || i2 >= 26) {
            return;
        }
        f();
        Q(view);
        ClickableSpan[] clickableSpanArrP = p(charSequence);
        if (clickableSpanArrP == null || clickableSpanArrP.length <= 0) {
            return;
        }
        r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", a.i.d.f1636a);
        SparseArray<WeakReference<ClickableSpan>> sparseArrayS = s(view);
        for (int i3 = 0; i3 < clickableSpanArrP.length; i3++) {
            int iY = y(clickableSpanArrP[i3], sparseArrayS);
            sparseArrayS.put(iY, new WeakReference<>(clickableSpanArrP[i3]));
            d(clickableSpanArrP[i3], (Spanned) charSequence, iY);
        }
    }

    public void e0(boolean z) {
        this.f2049b.setFocusable(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2049b;
        if (accessibilityNodeInfo == null) {
            if (cVar.f2049b != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f2049b)) {
            return false;
        }
        return this.f2051d == cVar.f2051d && this.f2050c == cVar.f2050c;
    }

    public final void f() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2049b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f2049b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f2049b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f2049b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    public void f0(boolean z) {
        this.f2049b.setFocused(z);
    }

    public final List<Integer> g(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f2049b.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f2049b.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void g0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2049b.setHeading(z);
        } else {
            S(2, z);
        }
    }

    public List<a> h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f2049b.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new a(actionList.get(i2)));
        }
        return arrayList;
    }

    public void h0(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f2049b.setHintText(charSequence);
        } else if (i2 >= 19) {
            this.f2049b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2049b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2049b.setMaxTextLength(i2);
        }
    }

    public int j() {
        return this.f2049b.getActions();
    }

    public void j0(CharSequence charSequence) {
        this.f2049b.setPackageName(charSequence);
    }

    public final boolean k(int i2) {
        Bundle bundleR = r();
        return bundleR != null && (bundleR.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i2) == i2;
    }

    public void k0(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            this.f2049b.setPaneTitle(charSequence);
        } else if (i2 >= 19) {
            this.f2049b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    @Deprecated
    public void l(Rect rect) {
        this.f2049b.getBoundsInParent(rect);
    }

    public void l0(View view) {
        this.f2050c = -1;
        this.f2049b.setParent(view);
    }

    public void m(Rect rect) {
        this.f2049b.getBoundsInScreen(rect);
    }

    public void m0(View view, int i2) {
        this.f2050c = i2;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2049b.setParent(view, i2);
        }
    }

    public int n() {
        return this.f2049b.getChildCount();
    }

    public void n0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2049b.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    public CharSequence o() {
        return this.f2049b.getClassName();
    }

    public void o0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2049b.setScreenReaderFocusable(z);
        } else {
            S(1, z);
        }
    }

    public void p0(boolean z) {
        this.f2049b.setScrollable(z);
    }

    public CharSequence q() {
        return this.f2049b.getContentDescription();
    }

    public void q0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2049b.setShowingHintText(z);
        } else {
            S(4, z);
        }
    }

    public Bundle r() {
        return Build.VERSION.SDK_INT >= 19 ? this.f2049b.getExtras() : new Bundle();
    }

    public void r0(View view, int i2) {
        this.f2051d = i2;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2049b.setSource(view, i2);
        }
    }

    public final SparseArray<WeakReference<ClickableSpan>> s(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayU = u(view);
        if (sparseArrayU != null) {
            return sparseArrayU;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(a.i.d.Q, sparseArray);
        return sparseArray;
    }

    public void s0(CharSequence charSequence) {
        if (a.i.n.a.a()) {
            this.f2049b.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f2049b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public CharSequence t() {
        return this.f2049b.getPackageName();
    }

    public void t0(CharSequence charSequence) {
        this.f2049b.setText(charSequence);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        sb.append("; boundsInParent: " + rect);
        m(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(t());
        sb.append("; className: ");
        sb.append(o());
        sb.append("; text: ");
        sb.append(v());
        sb.append("; contentDescription: ");
        sb.append(q());
        sb.append("; viewId: ");
        sb.append(w());
        sb.append("; checkable: ");
        sb.append(z());
        sb.append("; checked: ");
        sb.append(A());
        sb.append("; focusable: ");
        sb.append(D());
        sb.append("; focused: ");
        sb.append(E());
        sb.append("; selected: ");
        sb.append(I());
        sb.append("; clickable: ");
        sb.append(B());
        sb.append("; longClickable: ");
        sb.append(F());
        sb.append("; enabled: ");
        sb.append(C());
        sb.append("; password: ");
        sb.append(G());
        sb.append("; scrollable: " + H());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> listH = h();
            for (int i2 = 0; i2 < listH.size(); i2++) {
                a aVar = listH.get(i2);
                String strI = i(aVar.b());
                if (strI.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                    strI = aVar.c().toString();
                }
                sb.append(strI);
                if (i2 != listH.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int iJ = j();
            while (iJ != 0) {
                int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(iJ);
                iJ &= iNumberOfTrailingZeros ^ (-1);
                sb.append(i(iNumberOfTrailingZeros));
                if (iJ != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final SparseArray<WeakReference<ClickableSpan>> u(View view) {
        return (SparseArray) view.getTag(a.i.d.Q);
    }

    public void u0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f2049b.setTraversalAfter(view);
        }
    }

    public CharSequence v() {
        if (!x()) {
            return this.f2049b.getText();
        }
        List<Integer> listG = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listG2 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listG3 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listG4 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2049b.getText(), 0, this.f2049b.getText().length()));
        for (int i2 = 0; i2 < listG.size(); i2++) {
            spannableString.setSpan(new a.i.r.g0.a(listG4.get(i2).intValue(), this, r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listG.get(i2).intValue(), listG2.get(i2).intValue(), listG3.get(i2).intValue());
        }
        return spannableString;
    }

    public void v0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2049b.setVisibleToUser(z);
        }
    }

    public String w() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f2049b.getViewIdResourceName();
        }
        return null;
    }

    public AccessibilityNodeInfo w0() {
        return this.f2049b;
    }

    public final boolean x() {
        return !g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public final int y(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                if (clickableSpan.equals(sparseArray.valueAt(i2).get())) {
                    return sparseArray.keyAt(i2);
                }
            }
        }
        int i3 = f2048a;
        f2048a = i3 + 1;
        return i3;
    }

    public boolean z() {
        return this.f2049b.isCheckable();
    }
}
