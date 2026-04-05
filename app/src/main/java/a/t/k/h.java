package a.t.k;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static int a(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z ? a.t.b.f3138f : a.t.b.f3137e, typedValue, true);
        int i2 = typedValue.type;
        if (i2 == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else {
            if (i2 != 6) {
                return -2;
            }
            int i3 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i3, i3);
        }
        return (int) fraction;
    }

    public static <E> HashMap<E, BitmapDrawable> b(Context context, ListView listView, ArrayAdapter<E> arrayAdapter) {
        HashMap<E, BitmapDrawable> map = new HashMap<>();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        for (int i2 = 0; i2 < listView.getChildCount(); i2++) {
            map.put(arrayAdapter.getItem(firstVisiblePosition + i2), f(context, listView.getChildAt(i2)));
        }
        return map;
    }

    public static <E> HashMap<E, Rect> c(ListView listView, ArrayAdapter<E> arrayAdapter) {
        HashMap<E, Rect> map = new HashMap<>();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        for (int i2 = 0; i2 < listView.getChildCount(); i2++) {
            E item = arrayAdapter.getItem(firstVisiblePosition + i2);
            View childAt = listView.getChildAt(i2);
            map.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
        }
        return map;
    }

    public static <E> Set<E> d(List<E> list, List<E> list2) {
        HashSet hashSet = new HashSet(list2);
        hashSet.removeAll(list);
        return hashSet;
    }

    public static <E> Set<E> e(List<E> list, List<E> list2) {
        HashSet hashSet = new HashSet(list);
        hashSet.removeAll(list2);
        return hashSet;
    }

    public static BitmapDrawable f(Context context, View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
    }

    public static <E> boolean g(List<E> list, List<E> list2) {
        return new HashSet(list).equals(new HashSet(list2));
    }
}
