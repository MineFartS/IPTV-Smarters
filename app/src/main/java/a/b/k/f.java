package a.b.k;

import a.b.p.b;
import a.b.p.f;
import a.b.p.j.g;
import a.b.p.j.m;
import a.b.q.a1;
import a.b.q.d0;
import a.b.q.u0;
import a.b.q.z;
import a.b.q.z0;
import a.i.i.e.f;
import a.i.r.b0;
import a.i.r.f0;
import a.i.r.g;
import a.i.r.x;
import a.p.f;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import com.amazonaws.event.ProgressEvent;
import com.facebook.ads.AdError;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public class f extends a.b.k.e implements g.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a.f.i<String, Integer> f146e = new a.f.i<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f151j;
    public boolean A;
    public boolean B;
    public ViewGroup C;
    public TextView D;
    public View E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public t[] N;
    public t O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public p Y;
    public p Z;
    public boolean f0;
    public int g0;
    public final Runnable h0;
    public boolean i0;
    public Rect j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f152k;
    public Rect k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f153l;
    public a.b.k.h l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Window f154m;
    public a.b.k.i m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n f155n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a.b.k.d f156o;
    public a.b.k.a p;
    public MenuInflater q;
    public CharSequence r;
    public z s;
    public h t;
    public u u;
    public a.b.p.b v;
    public ActionBarContextView w;
    public PopupWindow x;
    public Runnable y;
    public b0 z;

    public class a implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f157a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f157a = uncaughtExceptionHandler;
        }

        public final boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!a(th)) {
                this.f157a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f157a.uncaughtException(thread, notFoundException);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            if ((fVar.g0 & 1) != 0) {
                fVar.V(0);
            }
            f fVar2 = f.this;
            if ((fVar2.g0 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0) {
                fVar2.V(108);
            }
            f fVar3 = f.this;
            fVar3.f0 = false;
            fVar3.g0 = 0;
        }
    }

    public class c implements a.i.r.r {
        public c() {
        }

        @Override // a.i.r.r
        public f0 a(View view, f0 f0Var) {
            int i2 = f0Var.i();
            int iM0 = f.this.M0(f0Var, null);
            if (i2 != iM0) {
                f0Var = f0Var.m(f0Var.g(), iM0, f0Var.h(), f0Var.f());
            }
            return x.b0(view, f0Var);
        }
    }

    public class d implements d0.a {
        public d() {
        }

        @Override // a.b.q.d0.a
        public void a(Rect rect) {
            rect.top = f.this.M0(null, rect);
        }
    }

    public class e implements ContentFrameLayout.a {
        public e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            f.this.T();
        }
    }

    /* JADX INFO: renamed from: a.b.k.f$f, reason: collision with other inner class name */
    public class RunnableC0003f implements Runnable {

        /* JADX INFO: renamed from: a.b.k.f$f$a */
        public class a extends a.i.r.d0 {
            public a() {
            }

            @Override // a.i.r.c0
            public void b(View view) {
                f.this.w.setAlpha(1.0f);
                f.this.z.h(null);
                f.this.z = null;
            }

            @Override // a.i.r.d0, a.i.r.c0
            public void c(View view) {
                f.this.w.setVisibility(0);
            }
        }

        public RunnableC0003f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.x.showAtLocation(fVar.w, 55, 0, 0);
            f.this.W();
            if (!f.this.E0()) {
                f.this.w.setAlpha(1.0f);
                f.this.w.setVisibility(0);
            } else {
                f.this.w.setAlpha(0.0f);
                f fVar2 = f.this;
                fVar2.z = x.d(fVar2.w).a(1.0f);
                f.this.z.h(new a());
            }
        }
    }

    public class g extends a.i.r.d0 {
        public g() {
        }

        @Override // a.i.r.c0
        public void b(View view) {
            f.this.w.setAlpha(1.0f);
            f.this.z.h(null);
            f.this.z = null;
        }

        @Override // a.i.r.d0, a.i.r.c0
        public void c(View view) {
            f.this.w.setVisibility(0);
            f.this.w.sendAccessibilityEvent(32);
            if (f.this.w.getParent() instanceof View) {
                x.m0((View) f.this.w.getParent());
            }
        }
    }

    public final class h implements m.a {
        public h() {
        }

        @Override // a.b.p.j.m.a
        public void b(a.b.p.j.g gVar, boolean z) {
            f.this.M(gVar);
        }

        @Override // a.b.p.j.m.a
        public boolean c(a.b.p.j.g gVar) {
            Window.Callback callbackG0 = f.this.g0();
            if (callbackG0 == null) {
                return true;
            }
            callbackG0.onMenuOpened(108, gVar);
            return true;
        }
    }

    public class i implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b.a f166a;

        public class a extends a.i.r.d0 {
            public a() {
            }

            @Override // a.i.r.c0
            public void b(View view) {
                f.this.w.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.w.getParent() instanceof View) {
                    x.m0((View) f.this.w.getParent());
                }
                f.this.w.k();
                f.this.z.h(null);
                f fVar2 = f.this;
                fVar2.z = null;
                x.m0(fVar2.C);
            }
        }

        public i(b.a aVar) {
            this.f166a = aVar;
        }

        @Override // a.b.p.b.a
        public void a(a.b.p.b bVar) {
            this.f166a.a(bVar);
            f fVar = f.this;
            if (fVar.x != null) {
                fVar.f154m.getDecorView().removeCallbacks(f.this.y);
            }
            f fVar2 = f.this;
            if (fVar2.w != null) {
                fVar2.W();
                f fVar3 = f.this;
                fVar3.z = x.d(fVar3.w).a(0.0f);
                f.this.z.h(new a());
            }
            f fVar4 = f.this;
            a.b.k.d dVar = fVar4.f156o;
            if (dVar != null) {
                dVar.o(fVar4.v);
            }
            f fVar5 = f.this;
            fVar5.v = null;
            x.m0(fVar5.C);
        }

        @Override // a.b.p.b.a
        public boolean b(a.b.p.b bVar, Menu menu) {
            return this.f166a.b(bVar, menu);
        }

        @Override // a.b.p.b.a
        public boolean c(a.b.p.b bVar, Menu menu) {
            x.m0(f.this.C);
            return this.f166a.c(bVar, menu);
        }

        @Override // a.b.p.b.a
        public boolean d(a.b.p.b bVar, MenuItem menuItem) {
            return this.f166a.d(bVar, menuItem);
        }
    }

    public static class j {
        public static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        public static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.densityDpi;
            int i3 = configuration2.densityDpi;
            if (i2 != i3) {
                configuration3.densityDpi = i3;
            }
        }
    }

    public static class k {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    public static class l {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static class m {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.colorMode & 3;
            int i3 = configuration2.colorMode;
            if (i2 != (i3 & 3)) {
                configuration3.colorMode |= i3 & 3;
            }
            int i4 = configuration.colorMode & 12;
            int i5 = configuration2.colorMode;
            if (i4 != (i5 & 12)) {
                configuration3.colorMode |= i5 & 12;
            }
        }
    }

    public class n extends a.b.p.i {
        public n(Window.Callback callback) {
            super(callback);
        }

        public final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(f.this.f153l, callback);
            a.b.p.b bVarG0 = f.this.G0(aVar);
            if (bVarG0 != null) {
                return aVar.e(bVarG0);
            }
            return null;
        }

        @Override // a.b.p.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.U(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // a.b.p.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || f.this.s0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // a.b.p.i, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // a.b.p.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof a.b.p.j.g)) {
                return super.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // a.b.p.i, android.view.Window.Callback
        public boolean onMenuOpened(int i2, Menu menu) {
            super.onMenuOpened(i2, menu);
            f.this.v0(i2);
            return true;
        }

        @Override // a.b.p.i, android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) {
            super.onPanelClosed(i2, menu);
            f.this.w0(i2);
        }

        @Override // a.b.p.i, android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            a.b.p.j.g gVar = menu instanceof a.b.p.j.g ? (a.b.p.j.g) menu : null;
            if (i2 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.a0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i2, view, menu);
            if (gVar != null) {
                gVar.a0(false);
            }
            return zOnPreparePanel;
        }

        @Override // a.b.p.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            a.b.p.j.g gVar;
            t tVarE0 = f.this.e0(0, true);
            if (tVarE0 == null || (gVar = tVarE0.f187j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i2);
            }
        }

        @Override // a.b.p.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return f.this.n0() ? b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // a.b.p.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            return (f.this.n0() && i2 == 0) ? b(callback) : super.onWindowStartingActionMode(callback, i2);
        }
    }

    public class o extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PowerManager f170c;

        public o(Context context) {
            super();
            this.f170c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // a.b.k.f.p
        public IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // a.b.k.f.p
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !k.a(this.f170c)) ? 1 : 2;
        }

        @Override // a.b.k.f.p
        public void d() {
            f.this.G();
        }
    }

    public abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BroadcastReceiver f172a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        public p() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f172a;
            if (broadcastReceiver != null) {
                try {
                    f.this.f153l.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f172a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f172a == null) {
                this.f172a = new a();
            }
            f.this.f153l.registerReceiver(this.f172a, intentFilterB);
        }
    }

    public class q extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a.b.k.m f175c;

        public q(a.b.k.m mVar) {
            super();
            this.f175c = mVar;
        }

        @Override // a.b.k.f.p
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // a.b.k.f.p
        public int c() {
            return this.f175c.d() ? 2 : 1;
        }

        @Override // a.b.k.f.p
        public void d() {
            f.this.G();
        }
    }

    public static class r {
        public static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    public class s extends ContentFrameLayout {
        public s(Context context) {
            super(context);
        }

        public final boolean c(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.U(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            f.this.O(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(a.b.l.a.a.d(getContext(), i2));
        }
    }

    public static final class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f181d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f182e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f183f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ViewGroup f184g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public View f185h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public View f186i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public a.b.p.j.g f187j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public a.b.p.j.e f188k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Context f189l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f190m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f191n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f192o;
        public boolean p;
        public boolean q = false;
        public boolean r;
        public Bundle s;

        public t(int i2) {
            this.f178a = i2;
        }

        public a.b.p.j.n a(m.a aVar) {
            if (this.f187j == null) {
                return null;
            }
            if (this.f188k == null) {
                a.b.p.j.e eVar = new a.b.p.j.e(this.f189l, a.b.g.f95j);
                this.f188k = eVar;
                eVar.g(aVar);
                this.f187j.b(this.f188k);
            }
            return this.f188k.i(this.f184g);
        }

        public boolean b() {
            if (this.f185h == null) {
                return false;
            }
            return this.f186i != null || this.f188k.a().getCount() > 0;
        }

        public void c(a.b.p.j.g gVar) {
            a.b.p.j.e eVar;
            a.b.p.j.g gVar2 = this.f187j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.O(this.f188k);
            }
            this.f187j = gVar;
            if (gVar == null || (eVar = this.f188k) == null) {
                return;
            }
            gVar.b(eVar);
        }

        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(a.b.a.f17a, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                themeNewTheme.applyStyle(i2, true);
            }
            themeNewTheme.resolveAttribute(a.b.a.I, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 == 0) {
                i3 = a.b.i.f117c;
            }
            themeNewTheme.applyStyle(i3, true);
            a.b.p.d dVar = new a.b.p.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f189l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(a.b.j.z0);
            this.f179b = typedArrayObtainStyledAttributes.getResourceId(a.b.j.C0, 0);
            this.f183f = typedArrayObtainStyledAttributes.getResourceId(a.b.j.B0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final class u implements m.a {
        public u() {
        }

        @Override // a.b.p.j.m.a
        public void b(a.b.p.j.g gVar, boolean z) {
            a.b.p.j.g gVarD = gVar.D();
            boolean z2 = gVarD != gVar;
            f fVar = f.this;
            if (z2) {
                gVar = gVarD;
            }
            t tVarZ = fVar.Z(gVar);
            if (tVarZ != null) {
                if (!z2) {
                    f.this.P(tVarZ, z);
                } else {
                    f.this.L(tVarZ.f178a, tVarZ, gVarD);
                    f.this.P(tVarZ, true);
                }
            }
        }

        @Override // a.b.p.j.m.a
        public boolean c(a.b.p.j.g gVar) {
            Window.Callback callbackG0;
            if (gVar != gVar.D()) {
                return true;
            }
            f fVar = f.this;
            if (!fVar.H || (callbackG0 = fVar.g0()) == null || f.this.T) {
                return true;
            }
            callbackG0.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z = i2 < 21;
        f147f = z;
        f148g = new int[]{R.attr.windowBackground};
        f149h = !"robolectric".equals(Build.FINGERPRINT);
        f150i = i2 >= 17;
        if (!z || f151j) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        f151j = true;
    }

    public f(Activity activity, a.b.k.d dVar) {
        this(activity, null, dVar, activity);
    }

    public f(Dialog dialog, a.b.k.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    public f(Context context, Window window, a.b.k.d dVar, Object obj) {
        a.f.i<String, Integer> iVar;
        Integer num;
        a.b.k.c cVarJ0;
        this.z = null;
        this.A = true;
        this.U = -100;
        this.h0 = new b();
        this.f153l = context;
        this.f156o = dVar;
        this.f152k = obj;
        if (this.U == -100 && (obj instanceof Dialog) && (cVarJ0 = J0()) != null) {
            this.U = cVarJ0.m0().k();
        }
        if (this.U == -100 && (num = (iVar = f146e).get(obj.getClass().getName())) != null) {
            this.U = num.intValue();
            iVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            J(window);
        }
        a.b.q.i.h();
    }

    public static Configuration a0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                l.a(configuration, configuration2, configuration3);
            } else if (!a.i.q.d.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i7 = configuration.touchscreen;
            int i8 = configuration2.touchscreen;
            if (i7 != i8) {
                configuration3.touchscreen = i8;
            }
            int i9 = configuration.keyboard;
            int i10 = configuration2.keyboard;
            if (i9 != i10) {
                configuration3.keyboard = i10;
            }
            int i11 = configuration.keyboardHidden;
            int i12 = configuration2.keyboardHidden;
            if (i11 != i12) {
                configuration3.keyboardHidden = i12;
            }
            int i13 = configuration.navigation;
            int i14 = configuration2.navigation;
            if (i13 != i14) {
                configuration3.navigation = i14;
            }
            int i15 = configuration.navigationHidden;
            int i16 = configuration2.navigationHidden;
            if (i15 != i16) {
                configuration3.navigationHidden = i16;
            }
            int i17 = configuration.orientation;
            int i18 = configuration2.orientation;
            if (i17 != i18) {
                configuration3.orientation = i18;
            }
            int i19 = configuration.screenLayout & 15;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 15)) {
                configuration3.screenLayout |= i20 & 15;
            }
            int i21 = configuration.screenLayout & 192;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 192)) {
                configuration3.screenLayout |= i22 & 192;
            }
            int i23 = configuration.screenLayout & 48;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 48)) {
                configuration3.screenLayout |= i24 & 48;
            }
            int i25 = configuration.screenLayout & 768;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 768)) {
                configuration3.screenLayout |= i26 & 768;
            }
            if (i6 >= 26) {
                m.a(configuration, configuration2, configuration3);
            }
            int i27 = configuration.uiMode & 15;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 15)) {
                configuration3.uiMode |= i28 & 15;
            }
            int i29 = configuration.uiMode & 48;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 48)) {
                configuration3.uiMode |= i30 & 48;
            }
            int i31 = configuration.screenWidthDp;
            int i32 = configuration2.screenWidthDp;
            if (i31 != i32) {
                configuration3.screenWidthDp = i32;
            }
            int i33 = configuration.screenHeightDp;
            int i34 = configuration2.screenHeightDp;
            if (i33 != i34) {
                configuration3.screenHeightDp = i34;
            }
            int i35 = configuration.smallestScreenWidthDp;
            int i36 = configuration2.smallestScreenWidthDp;
            if (i35 != i36) {
                configuration3.smallestScreenWidthDp = i36;
            }
            if (i6 >= 17) {
                j.b(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    @Override // a.b.k.e
    public void A(int i2) {
        X();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f153l).inflate(i2, viewGroup);
        this.f155n.a().onContentChanged();
    }

    public final boolean A0(t tVar, int i2, KeyEvent keyEvent, int i3) {
        a.b.p.j.g gVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tVar.f190m || B0(tVar, keyEvent)) && (gVar = tVar.f187j) != null) {
            zPerformShortcut = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.s == null) {
            P(tVar, true);
        }
        return zPerformShortcut;
    }

    @Override // a.b.k.e
    public void B(View view) {
        X();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f155n.a().onContentChanged();
    }

    public final boolean B0(t tVar, KeyEvent keyEvent) {
        z zVar;
        z zVar2;
        z zVar3;
        if (this.T) {
            return false;
        }
        if (tVar.f190m) {
            return true;
        }
        t tVar2 = this.O;
        if (tVar2 != null && tVar2 != tVar) {
            P(tVar2, false);
        }
        Window.Callback callbackG0 = g0();
        if (callbackG0 != null) {
            tVar.f186i = callbackG0.onCreatePanelView(tVar.f178a);
        }
        int i2 = tVar.f178a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (zVar3 = this.s) != null) {
            zVar3.c();
        }
        if (tVar.f186i == null && (!z || !(z0() instanceof a.b.k.k))) {
            a.b.p.j.g gVar = tVar.f187j;
            if (gVar == null || tVar.r) {
                if (gVar == null && (!k0(tVar) || tVar.f187j == null)) {
                    return false;
                }
                if (z && this.s != null) {
                    if (this.t == null) {
                        this.t = new h();
                    }
                    this.s.a(tVar.f187j, this.t);
                }
                tVar.f187j.d0();
                if (!callbackG0.onCreatePanelMenu(tVar.f178a, tVar.f187j)) {
                    tVar.c(null);
                    if (z && (zVar = this.s) != null) {
                        zVar.a(null, this.t);
                    }
                    return false;
                }
                tVar.r = false;
            }
            tVar.f187j.d0();
            Bundle bundle = tVar.s;
            if (bundle != null) {
                tVar.f187j.P(bundle);
                tVar.s = null;
            }
            if (!callbackG0.onPreparePanel(0, tVar.f186i, tVar.f187j)) {
                if (z && (zVar2 = this.s) != null) {
                    zVar2.a(null, this.t);
                }
                tVar.f187j.c0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            tVar.p = z2;
            tVar.f187j.setQwertyMode(z2);
            tVar.f187j.c0();
        }
        tVar.f190m = true;
        tVar.f191n = false;
        this.O = tVar;
        return true;
    }

    @Override // a.b.k.e
    public void C(View view, ViewGroup.LayoutParams layoutParams) {
        X();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f155n.a().onContentChanged();
    }

    public final void C0(boolean z) {
        z zVar = this.s;
        if (zVar == null || !zVar.d() || (ViewConfiguration.get(this.f153l).hasPermanentMenuKey() && !this.s.e())) {
            t tVarE0 = e0(0, true);
            tVarE0.q = true;
            P(tVarE0, false);
            y0(tVarE0, null);
            return;
        }
        Window.Callback callbackG0 = g0();
        if (this.s.b() && z) {
            this.s.f();
            if (this.T) {
                return;
            }
            callbackG0.onPanelClosed(108, e0(0, true).f187j);
            return;
        }
        if (callbackG0 == null || this.T) {
            return;
        }
        if (this.f0 && (this.g0 & 1) != 0) {
            this.f154m.getDecorView().removeCallbacks(this.h0);
            this.h0.run();
        }
        t tVarE02 = e0(0, true);
        a.b.p.j.g gVar = tVarE02.f187j;
        if (gVar == null || tVarE02.r || !callbackG0.onPreparePanel(0, tVarE02.f186i, gVar)) {
            return;
        }
        callbackG0.onMenuOpened(108, tVarE02.f187j);
        this.s.g();
    }

    @Override // a.b.k.e
    public void D(Toolbar toolbar) {
        Window window;
        Window.Callback callbackA;
        if (this.f152k instanceof Activity) {
            a.b.k.a aVarM = m();
            if (aVarM instanceof a.b.k.n) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.q = null;
            if (aVarM != null) {
                aVarM.n();
            }
            if (toolbar != null) {
                a.b.k.k kVar = new a.b.k.k(toolbar, f0(), this.f155n);
                this.p = kVar;
                window = this.f154m;
                callbackA = kVar.A();
            } else {
                this.p = null;
                window = this.f154m;
                callbackA = this.f155n;
            }
            window.setCallback(callbackA);
            o();
        }
    }

    public final int D0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i2 != 9) {
            return i2;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    @Override // a.b.k.e
    public void E(int i2) {
        this.V = i2;
    }

    public final boolean E0() {
        ViewGroup viewGroup;
        return this.B && (viewGroup = this.C) != null && x.U(viewGroup);
    }

    @Override // a.b.k.e
    public final void F(CharSequence charSequence) {
        this.r = charSequence;
        z zVar = this.s;
        if (zVar != null) {
            zVar.setWindowTitle(charSequence);
            return;
        }
        if (z0() != null) {
            z0().x(charSequence);
            return;
        }
        TextView textView = this.D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final boolean F0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f154m.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || x.T((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    public boolean G() {
        return H(true);
    }

    public a.b.p.b G0(b.a aVar) {
        a.b.k.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        a.b.p.b bVar = this.v;
        if (bVar != null) {
            bVar.c();
        }
        i iVar = new i(aVar);
        a.b.k.a aVarM = m();
        if (aVarM != null) {
            a.b.p.b bVarY = aVarM.y(iVar);
            this.v = bVarY;
            if (bVarY != null && (dVar = this.f156o) != null) {
                dVar.j(bVarY);
            }
        }
        if (this.v == null) {
            this.v = H0(iVar);
        }
        return this.v;
    }

    public final boolean H(boolean z) {
        if (this.T) {
            return false;
        }
        int iK = K();
        boolean zK0 = K0(o0(this.f153l, iK), z);
        if (iK == 0) {
            d0(this.f153l).e();
        } else {
            p pVar = this.Y;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (iK == 3) {
            c0(this.f153l).e();
        } else {
            p pVar2 = this.Z;
            if (pVar2 != null) {
                pVar2.a();
            }
        }
        return zK0;
    }

    public a.b.p.b H0(b.a aVar) {
        a.b.p.b bVarN;
        Context dVar;
        a.b.k.d dVar2;
        W();
        a.b.p.b bVar = this.v;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        a.b.k.d dVar3 = this.f156o;
        if (dVar3 == null || this.T) {
            bVarN = null;
        } else {
            try {
                bVarN = dVar3.N(aVar);
            } catch (AbstractMethodError unused) {
                bVarN = null;
            }
        }
        if (bVarN != null) {
            this.v = bVarN;
        } else {
            if (this.w == null) {
                if (this.K) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f153l.getTheme();
                    theme.resolveAttribute(a.b.a.f22f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f153l.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new a.b.p.d(this.f153l, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f153l;
                    }
                    this.w = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, a.b.a.f25i);
                    this.x = popupWindow;
                    a.i.s.h.b(popupWindow, 2);
                    this.x.setContentView(this.w);
                    this.x.setWidth(-1);
                    dVar.getTheme().resolveAttribute(a.b.a.f18b, typedValue, true);
                    this.w.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.x.setHeight(-2);
                    this.y = new RunnableC0003f();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.C.findViewById(a.b.f.f78h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(b0()));
                        this.w = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.w != null) {
                W();
                this.w.k();
                a.b.p.e eVar = new a.b.p.e(this.w.getContext(), this.w, aVar, this.x == null);
                if (aVar.b(eVar, eVar.e())) {
                    eVar.k();
                    this.w.h(eVar);
                    this.v = eVar;
                    if (E0()) {
                        this.w.setAlpha(0.0f);
                        b0 b0VarA = x.d(this.w).a(1.0f);
                        this.z = b0VarA;
                        b0VarA.h(new g());
                    } else {
                        this.w.setAlpha(1.0f);
                        this.w.setVisibility(0);
                        this.w.sendAccessibilityEvent(32);
                        if (this.w.getParent() instanceof View) {
                            x.m0((View) this.w.getParent());
                        }
                    }
                    if (this.x != null) {
                        this.f154m.getDecorView().post(this.y);
                    }
                } else {
                    this.v = null;
                }
            }
        }
        a.b.p.b bVar2 = this.v;
        if (bVar2 != null && (dVar2 = this.f156o) != null) {
            dVar2.j(bVar2);
        }
        return this.v;
    }

    public final void I() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.C.findViewById(R.id.content);
        View decorView = this.f154m.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f153l.obtainStyledAttributes(a.b.j.z0);
        typedArrayObtainStyledAttributes.getValue(a.b.j.L0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(a.b.j.M0, contentFrameLayout.getMinWidthMinor());
        int i2 = a.b.j.J0;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = a.b.j.K0;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            typedArrayObtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = a.b.j.H0;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            typedArrayObtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = a.b.j.I0;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            typedArrayObtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final void I0() {
        if (this.B) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J(Window window) {
        if (this.f154m != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(callback);
        this.f155n = nVar;
        window.setCallback(nVar);
        u0 u0VarU = u0.u(this.f153l, null, f148g);
        Drawable drawableH = u0VarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        u0VarU.w();
        this.f154m = window;
    }

    public final a.b.k.c J0() {
        for (Context baseContext = this.f153l; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof a.b.k.c) {
                return (a.b.k.c) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public final int K() {
        int i2 = this.U;
        return i2 != -100 ? i2 : a.b.k.e.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean K0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f153l
            r1 = 0
            android.content.res.Configuration r0 = r6.Q(r0, r7, r1)
            boolean r2 = r6.m0()
            android.content.Context r3 = r6.f153l
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L47
            if (r8 == 0) goto L47
            if (r2 != 0) goto L47
            boolean r8 = r6.Q
            if (r8 == 0) goto L47
            boolean r8 = a.b.k.f.f149h
            if (r8 != 0) goto L30
            boolean r8 = r6.R
            if (r8 == 0) goto L47
        L30:
            java.lang.Object r8 = r6.f152k
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L47
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L47
            java.lang.Object r8 = r6.f152k
            android.app.Activity r8 = (android.app.Activity) r8
            a.i.h.a.p(r8)
            r8 = 1
            goto L48
        L47:
            r8 = 0
        L48:
            if (r8 != 0) goto L50
            if (r3 == r0) goto L50
            r6.L0(r0, r2, r1)
            goto L51
        L50:
            r4 = r8
        L51:
            if (r4 == 0) goto L5e
            java.lang.Object r8 = r6.f152k
            boolean r0 = r8 instanceof a.b.k.c
            if (r0 == 0) goto L5e
            a.b.k.c r8 = (a.b.k.c) r8
            r8.q0(r7)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.f.K0(int, boolean):boolean");
    }

    public void L(int i2, t tVar, Menu menu) {
        if (menu == null) {
            if (tVar == null && i2 >= 0) {
                t[] tVarArr = this.N;
                if (i2 < tVarArr.length) {
                    tVar = tVarArr[i2];
                }
            }
            if (tVar != null) {
                menu = tVar.f187j;
            }
        }
        if ((tVar == null || tVar.f192o) && !this.T) {
            this.f155n.a().onPanelClosed(i2, menu);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L0(int i2, boolean z, Configuration configuration) {
        Resources resources = this.f153l.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            a.b.k.j.a(resources);
        }
        int i4 = this.V;
        if (i4 != 0) {
            this.f153l.setTheme(i4);
            if (i3 >= 23) {
                this.f153l.getTheme().applyStyle(this.V, true);
            }
        }
        if (z) {
            Object obj = this.f152k;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof a.p.k) {
                    if (!((a.p.k) activity).getLifecycle().b().isAtLeast(f.c.STARTED)) {
                        return;
                    }
                } else if (!this.S) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    public void M(a.b.p.j.g gVar) {
        if (this.M) {
            return;
        }
        this.M = true;
        this.s.i();
        Window.Callback callbackG0 = g0();
        if (callbackG0 != null && !this.T) {
            callbackG0.onPanelClosed(108, gVar);
        }
        this.M = false;
    }

    public final int M0(f0 f0Var, Rect rect) {
        boolean z;
        boolean z2;
        int i2 = f0Var != null ? f0Var.i() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.w;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
            if (this.w.isShown()) {
                if (this.j0 == null) {
                    this.j0 = new Rect();
                    this.k0 = new Rect();
                }
                Rect rect2 = this.j0;
                Rect rect3 = this.k0;
                if (f0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(f0Var.g(), f0Var.i(), f0Var.h(), f0Var.f());
                }
                a1.a(this.C, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                f0 f0VarJ = x.J(this.C);
                int iG = f0VarJ == null ? 0 : f0VarJ.g();
                int iH = f0VarJ == null ? 0 : f0VarJ.h();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 <= 0 || this.E != null) {
                    View view = this.E;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != iG || marginLayoutParams2.rightMargin != iH) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = iG;
                            marginLayoutParams2.rightMargin = iH;
                            this.E.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f153l);
                    this.E = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iG;
                    layoutParams.rightMargin = iH;
                    this.C.addView(this.E, -1, layoutParams);
                }
                View view3 = this.E;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    N0(this.E);
                }
                if (!this.J && z) {
                    i2 = 0;
                }
                z = z;
                z = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z = false;
            }
            if (z) {
                this.w.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.E;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return i2;
    }

    public final void N() {
        p pVar = this.Y;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.Z;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    public final void N0(View view) {
        Context context;
        int i2;
        if ((x.N(view) & 8192) != 0) {
            context = this.f153l;
            i2 = a.b.c.f34b;
        } else {
            context = this.f153l;
            i2 = a.b.c.f33a;
        }
        view.setBackgroundColor(a.i.i.b.d(context, i2));
    }

    public void O(int i2) {
        P(e0(i2, true), true);
    }

    public void P(t tVar, boolean z) {
        ViewGroup viewGroup;
        z zVar;
        if (z && tVar.f178a == 0 && (zVar = this.s) != null && zVar.b()) {
            M(tVar.f187j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f153l.getSystemService("window");
        if (windowManager != null && tVar.f192o && (viewGroup = tVar.f184g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                L(tVar.f178a, tVar, null);
            }
        }
        tVar.f190m = false;
        tVar.f191n = false;
        tVar.f192o = false;
        tVar.f185h = null;
        tVar.q = true;
        if (this.O == tVar) {
            this.O = null;
        }
    }

    public final Configuration Q(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    public final ViewGroup R() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f153l.obtainStyledAttributes(a.b.j.z0);
        int i2 = a.b.j.E0;
        if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(a.b.j.N0, false)) {
            z(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i2, false)) {
            z(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(a.b.j.F0, false)) {
            z(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(a.b.j.G0, false)) {
            z(10);
        }
        this.K = typedArrayObtainStyledAttributes.getBoolean(a.b.j.A0, false);
        typedArrayObtainStyledAttributes.recycle();
        Y();
        this.f154m.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f153l);
        if (this.L) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(this.J ? a.b.g.f100o : a.b.g.f99n, (ViewGroup) null);
        } else if (this.K) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(a.b.g.f91f, (ViewGroup) null);
            this.I = false;
            this.H = false;
        } else if (this.H) {
            TypedValue typedValue = new TypedValue();
            this.f153l.getTheme().resolveAttribute(a.b.a.f22f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new a.b.p.d(this.f153l, typedValue.resourceId) : this.f153l).inflate(a.b.g.p, (ViewGroup) null);
            z zVar = (z) viewGroup.findViewById(a.b.f.p);
            this.s = zVar;
            zVar.setWindowCallback(g0());
            if (this.I) {
                this.s.h(109);
            }
            if (this.F) {
                this.s.h(2);
            }
            if (this.G) {
                this.s.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.H + ", windowActionBarOverlay: " + this.I + ", android:windowIsFloating: " + this.K + ", windowActionModeOverlay: " + this.J + ", windowNoTitle: " + this.L + " }");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            x.A0(viewGroup, new c());
        } else if (viewGroup instanceof d0) {
            ((d0) viewGroup).setOnFitSystemWindowsListener(new d());
        }
        if (this.s == null) {
            this.D = (TextView) viewGroup.findViewById(a.b.f.M);
        }
        a1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(a.b.f.f72b);
        ViewGroup viewGroup2 = (ViewGroup) this.f154m.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f154m.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new e());
        return viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View S(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        a.b.k.h hVar;
        boolean zF0 = false;
        if (this.l0 == null) {
            String string = this.f153l.obtainStyledAttributes(a.b.j.z0).getString(a.b.j.D0);
            if (string == null) {
                hVar = new a.b.k.h();
            } else {
                try {
                    this.l0 = (a.b.k.h) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    hVar = new a.b.k.h();
                    this.l0 = hVar;
                }
            }
            this.l0 = hVar;
        }
        boolean z2 = f147f;
        if (z2) {
            if (this.m0 == null) {
                this.m0 = new a.b.k.i();
            }
            if (this.m0.a(attributeSet)) {
                z = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zF0 = F0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zF0 = true;
                }
                z = zF0;
            }
        } else {
            z = false;
        }
        return this.l0.q(view, str, context, attributeSet, z, z2, true, z0.b());
    }

    public void T() {
        a.b.p.j.g gVar;
        z zVar = this.s;
        if (zVar != null) {
            zVar.i();
        }
        if (this.x != null) {
            this.f154m.getDecorView().removeCallbacks(this.y);
            if (this.x.isShowing()) {
                try {
                    this.x.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.x = null;
        }
        W();
        t tVarE0 = e0(0, false);
        if (tVarE0 == null || (gVar = tVarE0.f187j) == null) {
            return;
        }
        gVar.close();
    }

    public boolean U(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f152k;
        if (((obj instanceof g.a) || (obj instanceof a.b.k.g)) && (decorView = this.f154m.getDecorView()) != null && a.i.r.g.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f155n.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? q0(keyCode, keyEvent) : t0(keyCode, keyEvent);
    }

    public void V(int i2) {
        t tVarE0;
        t tVarE02 = e0(i2, true);
        if (tVarE02.f187j != null) {
            Bundle bundle = new Bundle();
            tVarE02.f187j.Q(bundle);
            if (bundle.size() > 0) {
                tVarE02.s = bundle;
            }
            tVarE02.f187j.d0();
            tVarE02.f187j.clear();
        }
        tVarE02.r = true;
        tVarE02.q = true;
        if ((i2 != 108 && i2 != 0) || this.s == null || (tVarE0 = e0(0, false)) == null) {
            return;
        }
        tVarE0.f190m = false;
        B0(tVarE0, null);
    }

    public void W() {
        b0 b0Var = this.z;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public final void X() {
        if (this.B) {
            return;
        }
        this.C = R();
        CharSequence charSequenceF0 = f0();
        if (!TextUtils.isEmpty(charSequenceF0)) {
            z zVar = this.s;
            if (zVar != null) {
                zVar.setWindowTitle(charSequenceF0);
            } else if (z0() != null) {
                z0().x(charSequenceF0);
            } else {
                TextView textView = this.D;
                if (textView != null) {
                    textView.setText(charSequenceF0);
                }
            }
        }
        I();
        x0(this.C);
        this.B = true;
        t tVarE0 = e0(0, false);
        if (this.T) {
            return;
        }
        if (tVarE0 == null || tVarE0.f187j == null) {
            l0(108);
        }
    }

    public final void Y() {
        if (this.f154m == null) {
            Object obj = this.f152k;
            if (obj instanceof Activity) {
                J(((Activity) obj).getWindow());
            }
        }
        if (this.f154m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public t Z(Menu menu) {
        t[] tVarArr = this.N;
        int length = tVarArr != null ? tVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            t tVar = tVarArr[i2];
            if (tVar != null && tVar.f187j == menu) {
                return tVar;
            }
        }
        return null;
    }

    @Override // a.b.p.j.g.a
    public boolean a(a.b.p.j.g gVar, MenuItem menuItem) {
        t tVarZ;
        Window.Callback callbackG0 = g0();
        if (callbackG0 == null || this.T || (tVarZ = Z(gVar.D())) == null) {
            return false;
        }
        return callbackG0.onMenuItemSelected(tVarZ.f178a, menuItem);
    }

    @Override // a.b.p.j.g.a
    public void b(a.b.p.j.g gVar) {
        C0(true);
    }

    public final Context b0() {
        a.b.k.a aVarM = m();
        Context contextK = aVarM != null ? aVarM.k() : null;
        return contextK == null ? this.f153l : contextK;
    }

    public final p c0(Context context) {
        if (this.Z == null) {
            this.Z = new o(context);
        }
        return this.Z;
    }

    @Override // a.b.k.e
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        X();
        ((ViewGroup) this.C.findViewById(R.id.content)).addView(view, layoutParams);
        this.f155n.a().onContentChanged();
    }

    public final p d0(Context context) {
        if (this.Y == null) {
            this.Y = new q(a.b.k.m.a(context));
        }
        return this.Y;
    }

    public t e0(int i2, boolean z) {
        t[] tVarArr = this.N;
        if (tVarArr == null || tVarArr.length <= i2) {
            t[] tVarArr2 = new t[i2 + 1];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.N = tVarArr2;
            tVarArr = tVarArr2;
        }
        t tVar = tVarArr[i2];
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(i2);
        tVarArr[i2] = tVar2;
        return tVar2;
    }

    @Override // a.b.k.e
    public Context f(Context context) {
        this.Q = true;
        int iO0 = o0(context, K());
        Configuration configurationA0 = null;
        if (f150i && (context instanceof ContextThemeWrapper)) {
            try {
                r.a((ContextThemeWrapper) context, Q(context, iO0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof a.b.p.d) {
            try {
                ((a.b.p.d) context).a(Q(context, iO0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f149h) {
            return super.f(context);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration = new Configuration();
            configuration.uiMode = -1;
            configuration.fontScale = 0.0f;
            Configuration configuration2 = j.a(context, configuration).getResources().getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            configuration2.uiMode = configuration3.uiMode;
            if (!configuration2.equals(configuration3)) {
                configurationA0 = a0(configuration2, configuration3);
            }
        }
        Configuration configurationQ = Q(context, iO0, configurationA0);
        a.b.p.d dVar = new a.b.p.d(context, a.b.i.f118d);
        dVar.a(configurationQ);
        boolean z = false;
        try {
            z = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z) {
            f.b.a(dVar.getTheme());
        }
        return super.f(dVar);
    }

    public final CharSequence f0() {
        Object obj = this.f152k;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.r;
    }

    public final Window.Callback g0() {
        return this.f154m.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h0() {
        /*
            r3 = this;
            r3.X()
            boolean r0 = r3.H
            if (r0 == 0) goto L37
            a.b.k.a r0 = r3.p
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f152k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            a.b.k.n r0 = new a.b.k.n
            java.lang.Object r1 = r3.f152k
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.I
            r0.<init>(r1, r2)
        L1d:
            r3.p = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            a.b.k.n r0 = new a.b.k.n
            java.lang.Object r1 = r3.f152k
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            a.b.k.a r0 = r3.p
            if (r0 == 0) goto L37
            boolean r1 = r3.i0
            r0.r(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.f.h0():void");
    }

    @Override // a.b.k.e
    public <T extends View> T i(int i2) {
        X();
        return (T) this.f154m.findViewById(i2);
    }

    public final boolean i0(t tVar) {
        View view = tVar.f186i;
        if (view != null) {
            tVar.f185h = view;
            return true;
        }
        if (tVar.f187j == null) {
            return false;
        }
        if (this.u == null) {
            this.u = new u();
        }
        View view2 = (View) tVar.a(this.u);
        tVar.f185h = view2;
        return view2 != null;
    }

    public final boolean j0(t tVar) {
        tVar.d(b0());
        tVar.f184g = new s(tVar.f189l);
        tVar.f180c = 81;
        return true;
    }

    @Override // a.b.k.e
    public int k() {
        return this.U;
    }

    public final boolean k0(t tVar) {
        Context context = this.f153l;
        int i2 = tVar.f178a;
        if ((i2 == 0 || i2 == 108) && this.s != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(a.b.a.f22f, typedValue, true);
            Resources.Theme themeNewTheme = null;
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(a.b.a.f23g, typedValue, true);
            } else {
                theme.resolveAttribute(a.b.a.f23g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                a.b.p.d dVar = new a.b.p.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        a.b.p.j.g gVar = new a.b.p.j.g(context);
        gVar.R(this);
        tVar.c(gVar);
        return true;
    }

    @Override // a.b.k.e
    public MenuInflater l() {
        if (this.q == null) {
            h0();
            a.b.k.a aVar = this.p;
            this.q = new a.b.p.g(aVar != null ? aVar.k() : this.f153l);
        }
        return this.q;
    }

    public final void l0(int i2) {
        this.g0 = (1 << i2) | this.g0;
        if (this.f0) {
            return;
        }
        x.h0(this.f154m.getDecorView(), this.h0);
        this.f0 = true;
    }

    @Override // a.b.k.e
    public a.b.k.a m() {
        h0();
        return this.p;
    }

    public final boolean m0() {
        if (!this.X && (this.f152k instanceof Activity)) {
            PackageManager packageManager = this.f153l.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f153l, this.f152k.getClass()), i2 >= 29 ? 269221888 : i2 >= 24 ? 786432 : 0);
                this.W = (activityInfo == null || (activityInfo.configChanges & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.W = false;
            }
        }
        this.X = true;
        return this.W;
    }

    @Override // a.b.k.e
    public void n() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f153l);
        if (layoutInflaterFrom.getFactory() == null) {
            a.i.r.h.b(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof f) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public boolean n0() {
        return this.A;
    }

    @Override // a.b.k.e
    public void o() {
        a.b.k.a aVarM = m();
        if (aVarM == null || !aVarM.l()) {
            l0(0);
        }
    }

    public int o0(Context context, int i2) {
        p pVarD0;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    pVarD0 = c0(context);
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                pVarD0 = d0(context);
            }
            return pVarD0.c();
        }
        return i2;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return S(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // a.b.k.e
    public void p(Configuration configuration) {
        a.b.k.a aVarM;
        if (this.H && this.B && (aVarM = m()) != null) {
            aVarM.m(configuration);
        }
        a.b.q.i.b().g(this.f153l);
        H(false);
    }

    public boolean p0() {
        a.b.p.b bVar = this.v;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        a.b.k.a aVarM = m();
        return aVarM != null && aVarM.h();
    }

    @Override // a.b.k.e
    public void q(Bundle bundle) {
        this.Q = true;
        H(false);
        Y();
        Object obj = this.f152k;
        if (obj instanceof Activity) {
            String strC = null;
            try {
                strC = a.i.h.h.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (strC != null) {
                a.b.k.a aVarZ0 = z0();
                if (aVarZ0 == null) {
                    this.i0 = true;
                } else {
                    aVarZ0.r(true);
                }
            }
            a.b.k.e.c(this);
        }
        this.R = true;
    }

    public boolean q0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.P = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            r0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    @Override // a.b.k.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f152k
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            a.b.k.e.x(r3)
        L9:
            boolean r0 = r3.f0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f154m
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.h0
            r0.removeCallbacks(r1)
        L18:
            r0 = 0
            r3.S = r0
            r0 = 1
            r3.T = r0
            int r0 = r3.U
            r1 = -100
            if (r0 == r1) goto L48
            java.lang.Object r0 = r3.f152k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L48
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L48
            a.f.i<java.lang.String, java.lang.Integer> r0 = a.b.k.f.f146e
            java.lang.Object r1 = r3.f152k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.U
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L57
        L48:
            a.f.i<java.lang.String, java.lang.Integer> r0 = a.b.k.f.f146e
            java.lang.Object r1 = r3.f152k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L57:
            a.b.k.a r0 = r3.p
            if (r0 == 0) goto L5e
            r0.n()
        L5e:
            r3.N()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.f.r():void");
    }

    public final boolean r0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        t tVarE0 = e0(i2, true);
        if (tVarE0.f192o) {
            return false;
        }
        return B0(tVarE0, keyEvent);
    }

    @Override // a.b.k.e
    public void s(Bundle bundle) {
        X();
    }

    public boolean s0(int i2, KeyEvent keyEvent) {
        a.b.k.a aVarM = m();
        if (aVarM != null && aVarM.o(i2, keyEvent)) {
            return true;
        }
        t tVar = this.O;
        if (tVar != null && A0(tVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            t tVar2 = this.O;
            if (tVar2 != null) {
                tVar2.f191n = true;
            }
            return true;
        }
        if (this.O == null) {
            t tVarE0 = e0(0, true);
            B0(tVarE0, keyEvent);
            boolean zA0 = A0(tVarE0, keyEvent.getKeyCode(), keyEvent, 1);
            tVarE0.f190m = false;
            if (zA0) {
                return true;
            }
        }
        return false;
    }

    @Override // a.b.k.e
    public void t() {
        a.b.k.a aVarM = m();
        if (aVarM != null) {
            aVarM.u(true);
        }
    }

    public boolean t0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z = this.P;
            this.P = false;
            t tVarE0 = e0(0, false);
            if (tVarE0 != null && tVarE0.f192o) {
                if (!z) {
                    P(tVarE0, true);
                }
                return true;
            }
            if (p0()) {
                return true;
            }
        } else if (i2 == 82) {
            u0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // a.b.k.e
    public void u(Bundle bundle) {
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            a.b.p.b r0 = r4.v
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            a.b.k.f$t r2 = r4.e0(r5, r0)
            if (r5 != 0) goto L43
            a.b.q.z r5 = r4.s
            if (r5 == 0) goto L43
            boolean r5 = r5.d()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f153l
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            a.b.q.z r5 = r4.s
            boolean r5 = r5.b()
            if (r5 != 0) goto L3c
            boolean r5 = r4.T
            if (r5 != 0) goto L62
            boolean r5 = r4.B0(r2, r6)
            if (r5 == 0) goto L62
            a.b.q.z r5 = r4.s
            boolean r0 = r5.g()
            goto L68
        L3c:
            a.b.q.z r5 = r4.s
            boolean r0 = r5.f()
            goto L68
        L43:
            boolean r5 = r2.f192o
            if (r5 != 0) goto L64
            boolean r3 = r2.f191n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f190m
            if (r5 == 0) goto L62
            boolean r5 = r2.r
            if (r5 == 0) goto L5b
            r2.f190m = r1
            boolean r5 = r4.B0(r2, r6)
            goto L5c
        L5b:
            r5 = 1
        L5c:
            if (r5 == 0) goto L62
            r4.y0(r2, r6)
            goto L68
        L62:
            r0 = 0
            goto L68
        L64:
            r4.P(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f153l
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            goto L85
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.f.u0(int, android.view.KeyEvent):boolean");
    }

    @Override // a.b.k.e
    public void v() {
        this.S = true;
        G();
    }

    public void v0(int i2) {
        a.b.k.a aVarM;
        if (i2 != 108 || (aVarM = m()) == null) {
            return;
        }
        aVarM.i(true);
    }

    @Override // a.b.k.e
    public void w() {
        this.S = false;
        a.b.k.a aVarM = m();
        if (aVarM != null) {
            aVarM.u(false);
        }
    }

    public void w0(int i2) {
        if (i2 == 108) {
            a.b.k.a aVarM = m();
            if (aVarM != null) {
                aVarM.i(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            t tVarE0 = e0(i2, true);
            if (tVarE0.f192o) {
                P(tVarE0, false);
            }
        }
    }

    public void x0(ViewGroup viewGroup) {
    }

    public final void y0(t tVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (tVar.f192o || this.T) {
            return;
        }
        if (tVar.f178a == 0) {
            if ((this.f153l.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackG0 = g0();
        if (callbackG0 != null && !callbackG0.onMenuOpened(tVar.f178a, tVar.f187j)) {
            P(tVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f153l.getSystemService("window");
        if (windowManager != null && B0(tVar, keyEvent)) {
            ViewGroup viewGroup = tVar.f184g;
            if (viewGroup != null && !tVar.q) {
                View view = tVar.f186i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                }
                tVar.f191n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, tVar.f181d, tVar.f182e, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
                layoutParams2.gravity = tVar.f180c;
                layoutParams2.windowAnimations = tVar.f183f;
                windowManager.addView(tVar.f184g, layoutParams2);
                tVar.f192o = true;
            }
            if (viewGroup == null) {
                if (!j0(tVar) || tVar.f184g == null) {
                    return;
                }
            } else if (tVar.q && viewGroup.getChildCount() > 0) {
                tVar.f184g.removeAllViews();
            }
            if (!i0(tVar) || !tVar.b()) {
                tVar.q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = tVar.f185h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            tVar.f184g.setBackgroundResource(tVar.f179b);
            ViewParent parent = tVar.f185h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(tVar.f185h);
            }
            tVar.f184g.addView(tVar.f185h, layoutParams3);
            if (!tVar.f185h.hasFocus()) {
                tVar.f185h.requestFocus();
            }
            i2 = -2;
            tVar.f191n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i2, -2, tVar.f181d, tVar.f182e, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
            layoutParams22.gravity = tVar.f180c;
            layoutParams22.windowAnimations = tVar.f183f;
            windowManager.addView(tVar.f184g, layoutParams22);
            tVar.f192o = true;
        }
    }

    @Override // a.b.k.e
    public boolean z(int i2) {
        int iD0 = D0(i2);
        if (this.L && iD0 == 108) {
            return false;
        }
        if (this.H && iD0 == 1) {
            this.H = false;
        }
        if (iD0 == 1) {
            I0();
            this.L = true;
            return true;
        }
        if (iD0 == 2) {
            I0();
            this.F = true;
            return true;
        }
        if (iD0 == 5) {
            I0();
            this.G = true;
            return true;
        }
        if (iD0 == 10) {
            I0();
            this.J = true;
            return true;
        }
        if (iD0 == 108) {
            I0();
            this.H = true;
            return true;
        }
        if (iD0 != 109) {
            return this.f154m.requestFeature(iD0);
        }
        I0();
        this.I = true;
        return true;
    }

    public final a.b.k.a z0() {
        return this.p;
    }
}
