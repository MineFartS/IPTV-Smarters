package c.f.a.d.m;

import android.util.Property;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class d extends Property<ViewGroup, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Property<ViewGroup, Float> f15048a = new d("childrenAlpha");

    public d(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(ViewGroup viewGroup) {
        Float f2 = (Float) viewGroup.getTag(c.f.a.d.f.B);
        return f2 != null ? f2 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ViewGroup viewGroup, Float f2) {
        float fFloatValue = f2.floatValue();
        viewGroup.setTag(c.f.a.d.f.B, Float.valueOf(fFloatValue));
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            viewGroup.getChildAt(i2).setAlpha(fFloatValue);
        }
    }
}
