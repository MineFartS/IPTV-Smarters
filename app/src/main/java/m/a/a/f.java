package m.a.a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f31119a = Arrays.asList("raw", "drawable", "mipmap");

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f31120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f31121b;

        public a() {
            this.f31120a = false;
            this.f31121b = -1;
        }

        public a(View view, AttributeSet attributeSet, int i2, int i3) {
            TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, i.f31125b, i2, i3);
            this.f31120a = typedArrayObtainStyledAttributes.getBoolean(i.f31126c, false);
            this.f31121b = typedArrayObtainStyledAttributes.getInt(i.f31127d, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static void a(int i2, Drawable drawable) {
        if (drawable instanceof b) {
            ((b) drawable).h(i2);
        }
    }

    public static float b(Resources resources, int i2) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.density;
        if (i3 == 0) {
            i3 = 160;
        } else if (i3 == 65535) {
            i3 = 0;
        }
        int i4 = resources.getDisplayMetrics().densityDpi;
        if (i3 <= 0 || i4 <= 0) {
            return 1.0f;
        }
        return i4 / i3;
    }
}
