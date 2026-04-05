package c.h.a.k.h;

import android.net.Uri;
import android.text.InputFilter;
import android.text.Spanned;
import android.widget.EditText;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static InputFilter f17893a = new C0237b();

    public static class a implements InputFilter {
        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
            while (i2 < i3) {
                if (Character.isWhitespace(charSequence.charAt(i2))) {
                    return BuildConfig.FLAVOR;
                }
                i2++;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: c.h.a.k.h.b$b, reason: collision with other inner class name */
    public static class C0237b implements InputFilter {
        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
            while (i2 < i3) {
                if (Character.getType(charSequence.charAt(i2)) == 19) {
                    return BuildConfig.FLAVOR;
                }
                i2++;
            }
            return null;
        }
    }

    public static void a(EditText editText) {
        editText.setFilters(new InputFilter[]{new a()});
    }

    public static boolean b(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean c(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }
}
