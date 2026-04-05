package c.a.a.h;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static int a(Context context, int i2) {
        return b(context, i2, 0);
    }

    public static int b(Context context, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i2});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i3);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static void c(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(drawable);
        } else {
            view.setBackground(drawable);
        }
    }
}
