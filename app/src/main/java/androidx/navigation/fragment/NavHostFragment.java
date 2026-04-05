package androidx.navigation.fragment;

import a.l.d.d;
import a.l.d.h;
import a.v.n;
import a.v.r;
import a.v.s;
import a.v.v;
import a.v.x.a;
import a.v.x.b;
import a.v.x.c;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;

/* JADX INFO: loaded from: classes.dex */
public class NavHostFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f4737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f4738c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f4739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4741f;

    public static NavController n(Fragment fragment) {
        for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof NavHostFragment) {
                return ((NavHostFragment) parentFragment).q();
            }
            Fragment fragmentY0 = parentFragment.getParentFragmentManager().y0();
            if (fragmentY0 instanceof NavHostFragment) {
                return ((NavHostFragment) fragmentY0).q();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return r.b(view);
        }
        Dialog dialogU = fragment instanceof d ? ((d) fragment).u() : null;
        if (dialogU != null && dialogU.getWindow() != null) {
            return r.b(dialogU.getWindow().getDecorView());
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
    }

    @Deprecated
    public s<? extends a.C0084a> l() {
        return new a(requireContext(), getChildFragmentManager(), o());
    }

    public final int o() {
        int id = getId();
        return (id == 0 || id == -1) ? b.f3668a : id;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.f4741f) {
            getParentFragmentManager().m().w(this).j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        ((DialogFragmentNavigator) this.f4737b.l().d(DialogFragmentNavigator.class)).h(fragment);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        n nVar = new n(requireContext());
        this.f4737b = nVar;
        nVar.D(this);
        this.f4737b.E(requireActivity().getOnBackPressedDispatcher());
        n nVar2 = this.f4737b;
        Boolean bool = this.f4738c;
        nVar2.c(bool != null && bool.booleanValue());
        this.f4738c = null;
        this.f4737b.F(getViewModelStore());
        r(this.f4737b);
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f4741f = true;
                getParentFragmentManager().m().w(this).j();
            }
            this.f4740e = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            this.f4737b.y(bundle2);
        }
        int i2 = this.f4740e;
        if (i2 != 0) {
            this.f4737b.A(i2);
        } else {
            Bundle arguments = getArguments();
            int i3 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
            Bundle bundle3 = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
            if (i3 != 0) {
                this.f4737b.B(i3, bundle3);
            }
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h hVar = new h(layoutInflater.getContext());
        hVar.setId(o());
        return hVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.f4739d;
        if (view != null && r.b(view) == this.f4737b) {
            r.e(this.f4739d, null);
        }
        this.f4739d = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.p);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(v.q, 0);
        if (resourceId != 0) {
            this.f4740e = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, c.r);
        if (typedArrayObtainStyledAttributes2.getBoolean(c.s, false)) {
            this.f4741f = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrimaryNavigationFragmentChanged(boolean z) {
        n nVar = this.f4737b;
        if (nVar != null) {
            nVar.c(z);
        } else {
            this.f4738c = Boolean.valueOf(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundleZ = this.f4737b.z();
        if (bundleZ != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundleZ);
        }
        if (this.f4741f) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i2 = this.f4740e;
        if (i2 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
        }
        r.e(view, this.f4737b);
        if (view.getParent() != null) {
            View view2 = (View) view.getParent();
            this.f4739d = view2;
            if (view2.getId() == getId()) {
                r.e(this.f4739d, this.f4737b);
            }
        }
    }

    public final NavController q() {
        n nVar = this.f4737b;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    public void r(NavController navController) {
        navController.l().a(new DialogFragmentNavigator(requireContext(), getChildFragmentManager()));
        navController.l().a(l());
    }
}
