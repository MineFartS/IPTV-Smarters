package a.l.d;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k<?> f2388a;

    public i(k<?> kVar) {
        this.f2388a = kVar;
    }

    public static i b(k<?> kVar) {
        return new i((k) a.i.q.i.f(kVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        k<?> kVar = this.f2388a;
        kVar.f2394f.k(kVar, kVar, fragment);
    }

    public void c() {
        this.f2388a.f2394f.z();
    }

    public void d(Configuration configuration) {
        this.f2388a.f2394f.B(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f2388a.f2394f.C(menuItem);
    }

    public void f() {
        this.f2388a.f2394f.D();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f2388a.f2394f.E(menu, menuInflater);
    }

    public void h() {
        this.f2388a.f2394f.F();
    }

    public void i() {
        this.f2388a.f2394f.H();
    }

    public void j(boolean z) {
        this.f2388a.f2394f.I(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.f2388a.f2394f.K(menuItem);
    }

    public void l(Menu menu) {
        this.f2388a.f2394f.L(menu);
    }

    public void m() {
        this.f2388a.f2394f.N();
    }

    public void n(boolean z) {
        this.f2388a.f2394f.O(z);
    }

    public boolean o(Menu menu) {
        return this.f2388a.f2394f.P(menu);
    }

    public void p() {
        this.f2388a.f2394f.R();
    }

    public void q() {
        this.f2388a.f2394f.S();
    }

    public void r() {
        this.f2388a.f2394f.U();
    }

    public boolean s() {
        return this.f2388a.f2394f.b0(true);
    }

    public n t() {
        return this.f2388a.f2394f;
    }

    public void u() {
        this.f2388a.f2394f.U0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2388a.f2394f.v0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        k<?> kVar = this.f2388a;
        if (!(kVar instanceof a.p.y)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        kVar.f2394f.j1(parcelable);
    }

    public Parcelable x() {
        return this.f2388a.f2394f.l1();
    }
}
