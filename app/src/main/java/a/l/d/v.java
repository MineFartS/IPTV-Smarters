package a.l.d;

import a.l.d.e0;
import a.p.f;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f2474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f2475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f2476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2477d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2478e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f2479b;

        public a(View view) {
            this.f2479b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f2479b.removeOnAttachStateChangeListener(this);
            a.i.r.x.m0(this.f2479b);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2481a;

        static {
            int[] iArr = new int[f.c.values().length];
            f2481a = iArr;
            try {
                iArr[f.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2481a[f.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2481a[f.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2481a[f.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public v(m mVar, x xVar, Fragment fragment) {
        this.f2474a = mVar;
        this.f2475b = xVar;
        this.f2476c = fragment;
    }

    public v(m mVar, x xVar, Fragment fragment, u uVar) {
        this.f2474a = mVar;
        this.f2475b = xVar;
        this.f2476c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = uVar.f2473n;
        fragment.mSavedFragmentState = bundle == null ? new Bundle() : bundle;
    }

    public v(m mVar, x xVar, ClassLoader classLoader, j jVar, u uVar) {
        this.f2474a = mVar;
        this.f2475b = xVar;
        Fragment fragmentA = jVar.a(classLoader, uVar.f2461b);
        this.f2476c = fragmentA;
        Bundle bundle = uVar.f2470k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentA.setArguments(uVar.f2470k);
        fragmentA.mWho = uVar.f2462c;
        fragmentA.mFromLayout = uVar.f2463d;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = uVar.f2464e;
        fragmentA.mContainerId = uVar.f2465f;
        fragmentA.mTag = uVar.f2466g;
        fragmentA.mRetainInstance = uVar.f2467h;
        fragmentA.mRemoving = uVar.f2468i;
        fragmentA.mDetached = uVar.f2469j;
        fragmentA.mHidden = uVar.f2471l;
        fragmentA.mMaxState = f.c.values()[uVar.f2472m];
        Bundle bundle2 = uVar.f2473n;
        fragmentA.mSavedFragmentState = bundle2 == null ? new Bundle() : bundle2;
        if (n.G0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    public void a() {
        if (n.G0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f2476c);
        }
        Fragment fragment = this.f2476c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        m mVar = this.f2474a;
        Fragment fragment2 = this.f2476c;
        mVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    public void b() {
        int iJ = this.f2475b.j(this.f2476c);
        Fragment fragment = this.f2476c;
        fragment.mContainer.addView(fragment.mView, iJ);
    }

    public void c() {
        if (n.G0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f2476c);
        }
        Fragment fragment = this.f2476c;
        Fragment fragment2 = fragment.mTarget;
        v vVarM = null;
        if (fragment2 != null) {
            v vVarM2 = this.f2475b.m(fragment2.mWho);
            if (vVarM2 == null) {
                throw new IllegalStateException("Fragment " + this.f2476c + " declared target fragment " + this.f2476c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f2476c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            vVarM = vVarM2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (vVarM = this.f2475b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f2476c + " declared target fragment " + this.f2476c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (vVarM != null && (n.f2403b || vVarM.k().mState < 1)) {
            vVarM.m();
        }
        Fragment fragment4 = this.f2476c;
        fragment4.mHost = fragment4.mFragmentManager.u0();
        Fragment fragment5 = this.f2476c;
        fragment5.mParentFragment = fragment5.mFragmentManager.x0();
        this.f2474a.g(this.f2476c, false);
        this.f2476c.performAttach();
        this.f2474a.b(this.f2476c, false);
    }

    public int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f2476c;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int iMin = this.f2478e;
        int i2 = b.f2481a[fragment2.mMaxState.ordinal()];
        if (i2 != 1) {
            iMin = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment3 = this.f2476c;
        if (fragment3.mFromLayout) {
            if (fragment3.mInLayout) {
                iMin = Math.max(this.f2478e, 2);
                View view = this.f2476c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f2478e < 4 ? Math.min(iMin, fragment3.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.f2476c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        e0.e.b bVarL = null;
        if (n.f2403b && (viewGroup = (fragment = this.f2476c).mContainer) != null) {
            bVarL = e0.n(viewGroup, fragment.getParentFragmentManager()).l(this);
        }
        if (bVarL == e0.e.b.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (bVarL == e0.e.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f2476c;
            if (fragment4.mRemoving) {
                iMin = fragment4.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f2476c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (n.G0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f2476c);
        }
        return iMin;
    }

    public void e() {
        if (n.G0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f2476c);
        }
        Fragment fragment = this.f2476c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f2476c.mState = 1;
            return;
        }
        this.f2474a.h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f2476c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        m mVar = this.f2474a;
        Fragment fragment3 = this.f2476c;
        mVar.c(fragment3, fragment3.mSavedFragmentState, false);
    }

    public void f() {
        String resourceName;
        if (this.f2476c.mFromLayout) {
            return;
        }
        if (n.G0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2476c);
        }
        Fragment fragment = this.f2476c;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f2476c;
        ViewGroup viewGroup2 = fragment2.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i2 = fragment2.mContainerId;
            if (i2 != 0) {
                if (i2 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f2476c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.o0().c(this.f2476c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f2476c;
                    if (!fragment3.mRestored) {
                        try {
                            resourceName = fragment3.getResources().getResourceName(this.f2476c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f2476c.mContainerId) + " (" + resourceName + ") for fragment " + this.f2476c);
                    }
                }
            }
        }
        Fragment fragment4 = this.f2476c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f2476c.mView;
        if (view != null) {
            boolean z = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f2476c;
            fragment5.mView.setTag(a.l.b.f2218a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f2476c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (a.i.r.x.T(this.f2476c.mView)) {
                a.i.r.x.m0(this.f2476c.mView);
            } else {
                View view2 = this.f2476c.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f2476c.performViewCreated();
            m mVar = this.f2474a;
            Fragment fragment7 = this.f2476c;
            mVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f2476c.mView.getVisibility();
            float alpha = this.f2476c.mView.getAlpha();
            if (n.f2403b) {
                this.f2476c.setPostOnViewCreatedAlpha(alpha);
                Fragment fragment8 = this.f2476c;
                if (fragment8.mContainer != null && visibility == 0) {
                    View viewFindFocus = fragment8.mView.findFocus();
                    if (viewFindFocus != null) {
                        this.f2476c.setFocusedView(viewFindFocus);
                        if (n.G0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f2476c);
                        }
                    }
                    this.f2476c.mView.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f2476c;
                if (visibility == 0 && fragment9.mContainer != null) {
                    z = true;
                }
                fragment9.mIsNewlyAdded = z;
            }
        }
        this.f2476c.mState = 2;
    }

    public void g() {
        Fragment fragmentF;
        if (n.G0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f2476c);
        }
        Fragment fragment = this.f2476c;
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.mRemoving && !fragment.isInBackStack();
        if (!(z || this.f2475b.o().p(this.f2476c))) {
            String str = this.f2476c.mTargetWho;
            if (str != null && (fragmentF = this.f2475b.f(str)) != null && fragmentF.mRetainInstance) {
                this.f2476c.mTarget = fragmentF;
            }
            this.f2476c.mState = 0;
            return;
        }
        k<?> kVar = this.f2476c.mHost;
        if (kVar instanceof a.p.y) {
            zIsChangingConfigurations = this.f2475b.o().m();
        } else if (kVar.f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) kVar.f()).isChangingConfigurations();
        }
        if (z || zIsChangingConfigurations) {
            this.f2475b.o().g(this.f2476c);
        }
        this.f2476c.performDestroy();
        this.f2474a.d(this.f2476c, false);
        for (v vVar : this.f2475b.k()) {
            if (vVar != null) {
                Fragment fragmentK = vVar.k();
                if (this.f2476c.mWho.equals(fragmentK.mTargetWho)) {
                    fragmentK.mTarget = this.f2476c;
                    fragmentK.mTargetWho = null;
                }
            }
        }
        Fragment fragment2 = this.f2476c;
        String str2 = fragment2.mTargetWho;
        if (str2 != null) {
            fragment2.mTarget = this.f2475b.f(str2);
        }
        this.f2475b.q(this);
    }

    public void h() {
        View view;
        if (n.G0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f2476c);
        }
        Fragment fragment = this.f2476c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f2476c.performDestroyView();
        this.f2474a.n(this.f2476c, false);
        Fragment fragment2 = this.f2476c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.n(null);
        this.f2476c.mInLayout = false;
    }

    public void i() {
        if (n.G0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f2476c);
        }
        this.f2476c.performDetach();
        boolean z = false;
        this.f2474a.e(this.f2476c, false);
        Fragment fragment = this.f2476c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.f2475b.o().p(this.f2476c)) {
            if (n.G0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f2476c);
            }
            this.f2476c.initState();
        }
    }

    public void j() {
        Fragment fragment = this.f2476c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (n.G0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2476c);
            }
            Fragment fragment2 = this.f2476c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f2476c.mSavedFragmentState);
            View view = this.f2476c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2476c;
                fragment3.mView.setTag(a.l.b.f2218a, fragment3);
                Fragment fragment4 = this.f2476c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f2476c.performViewCreated();
                m mVar = this.f2474a;
                Fragment fragment5 = this.f2476c;
                mVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f2476c.mState = 2;
            }
        }
    }

    public Fragment k() {
        return this.f2476c;
    }

    public final boolean l(View view) {
        if (view == this.f2476c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f2476c.mView) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f2477d) {
            if (n.G0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f2477d = true;
            while (true) {
                int iD = d();
                Fragment fragment = this.f2476c;
                int i2 = fragment.mState;
                if (iD == i2) {
                    if (n.f2403b && fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            e0 e0VarN = e0.n(viewGroup, fragment.getParentFragmentManager());
                            if (this.f2476c.mHidden) {
                                e0VarN.c(this);
                            } else {
                                e0VarN.e(this);
                            }
                        }
                        Fragment fragment2 = this.f2476c;
                        n nVar = fragment2.mFragmentManager;
                        if (nVar != null) {
                            nVar.E0(fragment2);
                        }
                        Fragment fragment3 = this.f2476c;
                        fragment3.mHiddenChanged = false;
                        fragment3.onHiddenChanged(fragment3.mHidden);
                    }
                    return;
                }
                if (iD <= i2) {
                    switch (i2 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            this.f2476c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (n.G0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f2476c);
                            }
                            Fragment fragment4 = this.f2476c;
                            if (fragment4.mView != null && fragment4.mSavedViewState == null) {
                                t();
                            }
                            Fragment fragment5 = this.f2476c;
                            if (fragment5.mView != null && (viewGroup3 = fragment5.mContainer) != null) {
                                e0.n(viewGroup3, fragment5.getParentFragmentManager()).d(this);
                            }
                            this.f2476c.mState = 3;
                            break;
                        case 4:
                            w();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i2 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                e0.n(viewGroup2, fragment.getParentFragmentManager()).b(e0.e.c.from(this.f2476c.mView.getVisibility()), this);
                            }
                            this.f2476c.mState = 4;
                            break;
                        case 5:
                            v();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
            }
        } finally {
            this.f2477d = false;
        }
    }

    public void n() {
        if (n.G0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f2476c);
        }
        this.f2476c.performPause();
        this.f2474a.f(this.f2476c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f2476c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f2476c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f2476c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f2476c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f2476c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f2476c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f2476c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f2476c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    public void p() {
        if (n.G0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f2476c);
        }
        View focusedView = this.f2476c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (n.G0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f2476c);
                sb.append(" resulting in focused view ");
                sb.append(this.f2476c.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f2476c.setFocusedView(null);
        this.f2476c.performResume();
        this.f2474a.i(this.f2476c, false);
        Fragment fragment = this.f2476c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle q() {
        Bundle bundle = new Bundle();
        this.f2476c.performSaveInstanceState(bundle);
        this.f2474a.j(this.f2476c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f2476c.mView != null) {
            t();
        }
        if (this.f2476c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f2476c.mSavedViewState);
        }
        if (this.f2476c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f2476c.mSavedViewRegistryState);
        }
        if (!this.f2476c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f2476c.mUserVisibleHint);
        }
        return bundle;
    }

    public Fragment.m r() {
        Bundle bundleQ;
        if (this.f2476c.mState <= -1 || (bundleQ = q()) == null) {
            return null;
        }
        return new Fragment.m(bundleQ);
    }

    public u s() {
        u uVar = new u(this.f2476c);
        Fragment fragment = this.f2476c;
        if (fragment.mState <= -1 || uVar.f2473n != null) {
            uVar.f2473n = fragment.mSavedFragmentState;
        } else {
            Bundle bundleQ = q();
            uVar.f2473n = bundleQ;
            if (this.f2476c.mTargetWho != null) {
                if (bundleQ == null) {
                    uVar.f2473n = new Bundle();
                }
                uVar.f2473n.putString("android:target_state", this.f2476c.mTargetWho);
                int i2 = this.f2476c.mTargetRequestCode;
                if (i2 != 0) {
                    uVar.f2473n.putInt("android:target_req_state", i2);
                }
            }
        }
        return uVar;
    }

    public void t() {
        if (this.f2476c.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f2476c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f2476c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f2476c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f2476c.mSavedViewRegistryState = bundle;
    }

    public void u(int i2) {
        this.f2478e = i2;
    }

    public void v() {
        if (n.G0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f2476c);
        }
        this.f2476c.performStart();
        this.f2474a.k(this.f2476c, false);
    }

    public void w() {
        if (n.G0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f2476c);
        }
        this.f2476c.performStop();
        this.f2474a.l(this.f2476c, false);
    }
}
