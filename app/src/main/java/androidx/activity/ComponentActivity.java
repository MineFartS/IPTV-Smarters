package androidx.activity;

import a.a.e.d;
import a.a.e.e;
import a.a.e.f.a;
import a.i.h.g;
import a.p.a0;
import a.p.f;
import a.p.i;
import a.p.k;
import a.p.l;
import a.p.s;
import a.p.u;
import a.p.w;
import a.p.x;
import a.p.y;
import a.p.z;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.savedstate.SavedStateRegistry;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends g implements k, y, a.z.c, a.a.c, d {
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    public final a.a.d.a mContextAwareHelper;
    private w.b mDefaultFactory;
    private final l mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    public final a.z.b mSavedStateRegistryController;
    private x mViewModelStore;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e2) {
                if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e2;
                }
            }
        }
    }

    public class b extends ActivityResultRegistry {

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f3995b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a.C0001a f3996c;

            public a(int i2, a.C0001a c0001a) {
                this.f3995b = i2;
                this.f3996c = c0001a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f3995b, this.f3996c.a());
            }
        }

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$b$b, reason: collision with other inner class name */
        public class RunnableC0093b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f3998b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ IntentSender.SendIntentException f3999c;

            public RunnableC0093b(int i2, IntentSender.SendIntentException sendIntentException) {
                this.f3998b = i2;
                this.f3999c = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f3998b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f3999c));
            }
        }

        public b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void f(int i2, a.a.e.f.a<I, O> aVar, I i3, a.i.h.c cVar) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0001a<O> c0001aB = aVar.b(componentActivity, i3);
            if (c0001aB != null) {
                new Handler(Looper.getMainLooper()).post(new a(i2, c0001aB));
                return;
            }
            Intent intentA = aVar.a(componentActivity, i3);
            if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
                intentA.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                if (cVar != null) {
                    throw null;
                }
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                a.i.h.a.q(componentActivity, stringArrayExtra, i2);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                a.i.h.a.v(componentActivity, intentA, i2, bundle);
                return;
            }
            e eVar = (e) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                a.i.h.a.w(componentActivity, eVar.e(), i2, eVar.b(), eVar.c(), eVar.d(), 0, bundle);
            } catch (IntentSender.SendIntentException e2) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0093b(i2, e2));
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f4001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public x f4002b;
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new a.a.d.a();
        this.mLifecycleRegistry = new l(this);
        this.mSavedStateRegistryController = a.z.b.a(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            getLifecycle().a(new i() { // from class: androidx.activity.ComponentActivity.3
                @Override // a.p.i
                public void d(k kVar, f.b bVar) {
                    if (bVar == f.b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                        if (viewPeekDecorView != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        getLifecycle().a(new i() { // from class: androidx.activity.ComponentActivity.4
            @Override // a.p.i
            public void d(k kVar, f.b bVar) {
                if (bVar == f.b.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.getViewModelStore().a();
                }
            }
        });
        getLifecycle().a(new i() { // from class: androidx.activity.ComponentActivity.5
            @Override // a.p.i
            public void d(k kVar, f.b bVar) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().c(this);
            }
        });
        if (19 > i2 || i2 > 23) {
            return;
        }
        getLifecycle().a(new ImmLeaksCleaner(this));
    }

    public ComponentActivity(int i2) {
        this();
        this.mContentLayoutId = i2;
    }

    private void initViewTreeOwners() {
        z.a(getWindow().getDecorView(), this);
        a0.a(getWindow().getDecorView(), this);
        a.z.d.a(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public final void addOnContextAvailableListener(a.a.d.b bVar) {
        this.mContextAwareHelper.a(bVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.mViewModelStore = cVar.f4002b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new x();
            }
        }
    }

    @Override // a.a.e.d
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public w.b getDefaultViewModelProviderFactory() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new u(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.f4001a;
        }
        return null;
    }

    @Override // a.i.h.g, a.p.k
    public f getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // a.a.c
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // a.z.c
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    @Override // a.p.y
    public x getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (this.mActivityResultRegistry.b(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.c();
    }

    @Override // a.i.h.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.c(bundle);
        this.mContextAwareHelper.c(this);
        super.onCreate(bundle);
        this.mActivityResultRegistry.g(bundle);
        s.f(this);
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, a.i.h.a.c
    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.b(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        x xVar = this.mViewModelStore;
        if (xVar == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            xVar = cVar.f4002b;
        }
        if (xVar == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.f4001a = objOnRetainCustomNonConfigurationInstance;
        cVar2.f4002b = xVar;
        return cVar2;
    }

    @Override // a.i.h.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        f lifecycle = getLifecycle();
        if (lifecycle instanceof l) {
            ((l) lifecycle).o(f.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.d(bundle);
        this.mActivityResultRegistry.h(bundle);
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.d();
    }

    public final <I, O> a.a.e.c<I> registerForActivityResult(a.a.e.f.a<I, O> aVar, a.a.e.b<O> bVar) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, bVar);
    }

    public final <I, O> a.a.e.c<I> registerForActivityResult(a.a.e.f.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, a.a.e.b<O> bVar) {
        return activityResultRegistry.j("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    public final void removeOnContextAvailableListener(a.a.d.b bVar) {
        this.mContextAwareHelper.e(bVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (a.a0.a.d()) {
                a.a0.a.a("reportFullyDrawn() for " + getComponentName());
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 > 19 || (i2 == 19 && a.i.i.b.a(this, "android.permission.UPDATE_DEVICE_STATS") == 0)) {
                super.reportFullyDrawn();
            }
        } finally {
            a.a0.a.b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        initViewTreeOwners();
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
