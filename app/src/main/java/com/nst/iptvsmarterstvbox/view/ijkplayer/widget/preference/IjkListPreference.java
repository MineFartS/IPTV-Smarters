package com.nst.iptvsmarterstvbox.view.ijkplayer.widget.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import c.h.a.b;

/* JADX INFO: loaded from: classes2.dex */
public class IjkListPreference extends ListPreference {
    public CharSequence[] U;

    public IjkListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        W(context, attributeSet);
    }

    public static String X() {
        return "W91ciBUViBTZXJ2aWNlIFByb3ZpZGVyIGhhcyBub3QgcHJvdmlkZWQgeW91ciB0aGUgb3JpZ2luYWwgYXBwLg==";
    }

    public static String Y() {
        return "3VjaCBraW5kIG9mIGFwcHMgY291bGQgc2VuZCB0aGUgZGF0YSB0byBsZWdhbCBhdXRob3JpdGllcy4=";
    }

    public static String Z() {
        return "W";
    }

    public final void W(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.A0, 0, 0);
        if (typedArrayObtainStyledAttributes == null) {
            return;
        }
        this.U = typedArrayObtainStyledAttributes.getTextArray(0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
