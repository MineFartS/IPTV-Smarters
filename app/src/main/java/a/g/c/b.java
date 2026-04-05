package a.g.c;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f1502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f1504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a.g.b.k.h f1505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f1507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View[] f1508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap<Integer, String> f1509i;

    public b(Context context) {
        super(context);
        this.f1502b = new int[32];
        this.f1506f = false;
        this.f1508h = null;
        this.f1509i = new HashMap<>();
        this.f1504d = context;
        g(null);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1502b = new int[32];
        this.f1506f = false;
        this.f1508h = null;
        this.f1509i = new HashMap<>();
        this.f1504d = context;
        g(attributeSet);
    }

    public final void a(String str) {
        if (str == null || str.length() == 0 || this.f1504d == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iF = f(strTrim);
        if (iF != 0) {
            this.f1509i.put(Integer.valueOf(iF), strTrim);
            b(iF);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    public final void b(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i3 = this.f1503c + 1;
        int[] iArr = this.f1502b;
        if (i3 > iArr.length) {
            this.f1502b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1502b;
        int i4 = this.f1503c;
        iArr2[i4] = i2;
        this.f1503c = i4 + 1;
    }

    public void c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }

    public void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i2 = 0; i2 < this.f1503c; i2++) {
            View viewH = constraintLayout.h(this.f1502b[i2]);
            if (viewH != null) {
                viewH.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    viewH.setTranslationZ(viewH.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1504d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                String resourceEntryName = null;
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int f(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iE = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objF = constraintLayout.f(0, str);
            if (objF instanceof Integer) {
                iE = ((Integer) objF).intValue();
            }
        }
        if (iE == 0 && constraintLayout != null) {
            iE = e(constraintLayout, str);
        }
        if (iE == 0) {
            try {
                iE = h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iE == 0 ? this.f1504d.getResources().getIdentifier(str, Name.MARK, this.f1504d.getPackageName()) : iE;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == i.m1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f1507g = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1502b, this.f1503c);
    }

    public void h(a.g.b.k.e eVar, boolean z) {
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
        String str;
        int iE;
        if (isInEditMode()) {
            setIds(this.f1507g);
        }
        a.g.b.k.h hVar = this.f1505e;
        if (hVar == null) {
            return;
        }
        hVar.b();
        for (int i2 = 0; i2 < this.f1503c; i2++) {
            int i3 = this.f1502b[i2];
            View viewH = constraintLayout.h(i3);
            if (viewH == null && (iE = e(constraintLayout, (str = this.f1509i.get(Integer.valueOf(i3))))) != 0) {
                this.f1502b[i2] = iE;
                this.f1509i.put(Integer.valueOf(iE), str);
                viewH = constraintLayout.h(iE);
            }
            if (viewH != null) {
                this.f1505e.a(constraintLayout.i(viewH));
            }
        }
        this.f1505e.c(constraintLayout.f4279d);
    }

    public void m() {
        if (this.f1505e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).n0 = (a.g.b.k.e) this.f1505e;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1507g;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        if (this.f1506f) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setIds(String str) {
        this.f1507g = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f1503c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i2);
            if (iIndexOf == -1) {
                a(str.substring(i2));
                return;
            } else {
                a(str.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1507g = null;
        this.f1503c = 0;
        for (int i2 : iArr) {
            b(i2);
        }
    }
}
