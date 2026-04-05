package a.l.d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public class l implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f2395b;

    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v f2396b;

        public a(v vVar) {
            this.f2396b = vVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.f2396b.k();
            this.f2396b.m();
            e0.n((ViewGroup) fragmentK.mView.getParent(), l.this.f2395b).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public l(n nVar) {
        this.f2395b = nVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        v vVarW;
        StringBuilder sb;
        String str2;
        if (h.class.getName().equals(str)) {
            return new h(context, attributeSet, this.f2395b);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, Name.LABEL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.l.c.f2224d);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(a.l.c.f2225e);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(a.l.c.f2226f, -1);
        String string = typedArrayObtainStyledAttributes.getString(a.l.c.f2227g);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !j.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentH0 = resourceId != -1 ? this.f2395b.h0(resourceId) : null;
        if (fragmentH0 == null && string != null) {
            fragmentH0 = this.f2395b.i0(string);
        }
        if (fragmentH0 == null && id != -1) {
            fragmentH0 = this.f2395b.h0(id);
        }
        if (fragmentH0 == null) {
            fragmentH0 = this.f2395b.r0().a(context.getClassLoader(), attributeValue);
            fragmentH0.mFromLayout = true;
            fragmentH0.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentH0.mContainerId = id;
            fragmentH0.mTag = string;
            fragmentH0.mInLayout = true;
            n nVar = this.f2395b;
            fragmentH0.mFragmentManager = nVar;
            fragmentH0.mHost = nVar.u0();
            fragmentH0.onInflate(this.f2395b.u0().f(), attributeSet, fragmentH0.mSavedFragmentState);
            vVarW = this.f2395b.g(fragmentH0);
            if (n.G0(2)) {
                sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(fragmentH0);
                str2 = " has been inflated via the <fragment> tag: id=0x";
                sb.append(str2);
                sb.append(Integer.toHexString(resourceId));
                Log.v("FragmentManager", sb.toString());
            }
        } else {
            if (fragmentH0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentH0.mInLayout = true;
            n nVar2 = this.f2395b;
            fragmentH0.mFragmentManager = nVar2;
            fragmentH0.mHost = nVar2.u0();
            fragmentH0.onInflate(this.f2395b.u0().f(), attributeSet, fragmentH0.mSavedFragmentState);
            vVarW = this.f2395b.w(fragmentH0);
            if (n.G0(2)) {
                sb = new StringBuilder();
                sb.append("Retained Fragment ");
                sb.append(fragmentH0);
                str2 = " has been re-attached via the <fragment> tag: id=0x";
                sb.append(str2);
                sb.append(Integer.toHexString(resourceId));
                Log.v("FragmentManager", sb.toString());
            }
        }
        fragmentH0.mContainer = (ViewGroup) view;
        vVarW.m();
        vVarW.j();
        View view2 = fragmentH0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentH0.mView.getTag() == null) {
            fragmentH0.mView.setTag(string);
        }
        fragmentH0.mView.addOnAttachStateChangeListener(new a(vVarW));
        return fragmentH0.mView;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
