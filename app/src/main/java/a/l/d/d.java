package a.l.d;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public class d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f2321b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2330k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Dialog f2332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2333n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2334o;
    public boolean p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f2322c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DialogInterface.OnCancelListener f2323d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DialogInterface.OnDismissListener f2324e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2325f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2326g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2327h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2328i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2329j = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a.p.q<a.p.k> f2331l = new C0053d();
    public boolean q = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            d.this.f2324e.onDismiss(d.this.f2332m);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (d.this.f2332m != null) {
                d dVar = d.this;
                dVar.onCancel(dVar.f2332m);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (d.this.f2332m != null) {
                d dVar = d.this;
                dVar.onDismiss(dVar.f2332m);
            }
        }
    }

    /* JADX INFO: renamed from: a.l.d.d$d, reason: collision with other inner class name */
    public class C0053d implements a.p.q<a.p.k> {
        public C0053d() {
        }

        @Override // a.p.q
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(a.p.k kVar) {
            if (kVar == null || !d.this.f2328i) {
                return;
            }
            View viewRequireView = d.this.requireView();
            if (viewRequireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (d.this.f2332m != null) {
                if (n.G0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + d.this.f2332m);
                }
                d.this.f2332m.setContentView(viewRequireView);
            }
        }
    }

    public class e extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f2339a;

        public e(g gVar) {
            this.f2339a = gVar;
        }

        @Override // a.l.d.g
        public View c(int i2) {
            return this.f2339a.d() ? this.f2339a.c(i2) : d.this.y(i2);
        }

        @Override // a.l.d.g
        public boolean d() {
            return this.f2339a.d() || d.this.z();
        }
    }

    public final void B(Bundle bundle) {
        if (this.f2328i && !this.q) {
            try {
                this.f2330k = true;
                Dialog dialogW = w(bundle);
                this.f2332m = dialogW;
                if (this.f2328i) {
                    G(dialogW, this.f2325f);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f2332m.setOwnerActivity((Activity) context);
                    }
                    this.f2332m.setCancelable(this.f2327h);
                    this.f2332m.setOnCancelListener(this.f2323d);
                    this.f2332m.setOnDismissListener(this.f2324e);
                    this.q = true;
                } else {
                    this.f2332m = null;
                }
            } finally {
                this.f2330k = false;
            }
        }
    }

    public final Dialog C() {
        Dialog dialogU = u();
        if (dialogU != null) {
            return dialogU;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void E(boolean z) {
        this.f2327h = z;
        Dialog dialog = this.f2332m;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void F(boolean z) {
        this.f2328i = z;
    }

    public void G(Dialog dialog, int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int H(y yVar, String str) {
        this.f2334o = false;
        this.p = true;
        yVar.e(this, str);
        this.f2333n = false;
        int iJ = yVar.j();
        this.f2329j = iJ;
        return iJ;
    }

    public void J(n nVar, String str) {
        this.f2334o = false;
        this.p = true;
        y yVarM = nVar.m();
        yVarM.e(this, str);
        yVarM.j();
    }

    @Override // androidx.fragment.app.Fragment
    public g createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().i(this.f2331l);
        if (this.p) {
            return;
        }
        this.f2334o = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2321b = new Handler();
        this.f2328i = this.mContainerId == 0;
        if (bundle != null) {
            this.f2325f = bundle.getInt("android:style", 0);
            this.f2326g = bundle.getInt("android:theme", 0);
            this.f2327h = bundle.getBoolean("android:cancelable", true);
            this.f2328i = bundle.getBoolean("android:showsDialog", this.f2328i);
            this.f2329j = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f2332m;
        if (dialog != null) {
            this.f2333n = true;
            dialog.setOnDismissListener(null);
            this.f2332m.dismiss();
            if (!this.f2334o) {
                onDismiss(this.f2332m);
            }
            this.f2332m = null;
            this.q = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.p && !this.f2334o) {
            this.f2334o = true;
        }
        getViewLifecycleOwnerLiveData().m(this.f2331l);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2333n) {
            return;
        }
        if (n.G0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        r(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        StringBuilder sb;
        String str;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.f2328i && !this.f2330k) {
            B(bundle);
            if (n.G0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f2332m;
            return dialog != null ? layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext()) : layoutInflaterOnGetLayoutInflater;
        }
        if (n.G0(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (this.f2328i) {
                sb = new StringBuilder();
                str = "mCreatingDialog = true: ";
            } else {
                sb = new StringBuilder();
                str = "mShowsDialog = false: ";
            }
            sb.append(str);
            sb.append(str2);
            Log.d("FragmentManager", sb.toString());
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f2332m;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i2 = this.f2325f;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.f2326g;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z = this.f2327h;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f2328i;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i4 = this.f2329j;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f2332m;
        if (dialog != null) {
            this.f2333n = false;
            dialog.show();
            View decorView = this.f2332m.getWindow().getDecorView();
            a.p.z.a(decorView, this);
            a.p.a0.a(decorView, this);
            a.z.d.a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f2332m;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f2332m == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2332m.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f2332m == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2332m.onRestoreInstanceState(bundle2);
    }

    public void q() {
        r(false, false);
    }

    public final void r(boolean z, boolean z2) {
        if (this.f2334o) {
            return;
        }
        this.f2334o = true;
        this.p = false;
        Dialog dialog = this.f2332m;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2332m.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f2321b.getLooper()) {
                    onDismiss(this.f2332m);
                } else {
                    this.f2321b.post(this.f2322c);
                }
            }
        }
        this.f2333n = true;
        if (this.f2329j >= 0) {
            getParentFragmentManager().X0(this.f2329j, 1);
            this.f2329j = -1;
            return;
        }
        y yVarM = getParentFragmentManager().m();
        yVarM.q(this);
        if (z) {
            yVarM.k();
        } else {
            yVarM.j();
        }
    }

    public Dialog u() {
        return this.f2332m;
    }

    public int v() {
        return this.f2326g;
    }

    public Dialog w(Bundle bundle) {
        if (n.G0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(requireContext(), v());
    }

    public View y(int i2) {
        Dialog dialog = this.f2332m;
        if (dialog != null) {
            return dialog.findViewById(i2);
        }
        return null;
    }

    public boolean z() {
        return this.q;
    }
}
