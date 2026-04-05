package a.i.s;

import a.i.r.s;
import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class j implements s {

    public static final class a {
        public static CharSequence a(Context context, ClipData.Item item, int i2) {
            if ((i2 & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence charSequenceCoerceToText = item.coerceToText(context);
            return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
        }
    }

    public static final class b {
        public static CharSequence a(Context context, ClipData.Item item, int i2) {
            CharSequence charSequenceCoerceToText = item.coerceToText(context);
            return ((i2 & 1) == 0 || !(charSequenceCoerceToText instanceof Spanned)) ? charSequenceCoerceToText : charSequenceCoerceToText.toString();
        }
    }

    public static CharSequence b(ClipData clipData, Context context, int i2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
            CharSequence charSequenceC = c(context, clipData.getItemAt(i3), i2);
            if (charSequenceC != null) {
                spannableStringBuilder.append(charSequenceC);
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence c(Context context, ClipData.Item item, int i2) {
        return Build.VERSION.SDK_INT >= 16 ? a.a(context, item, i2) : b.a(context, item, i2);
    }

    public static void d(TextView textView, a.i.r.c cVar) {
        e((Editable) textView.getText(), b(cVar.b(), textView.getContext(), cVar.c()));
    }

    public static void e(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // a.i.r.s
    public a.i.r.c a(View view, a.i.r.c cVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + cVar);
        }
        int iD = cVar.d();
        if (iD == 2) {
            return cVar;
        }
        if (iD == 3) {
            d((TextView) view, cVar);
            return null;
        }
        ClipData clipDataB = cVar.b();
        int iC = cVar.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i2 = 0; i2 < clipDataB.getItemCount(); i2++) {
            CharSequence charSequenceC = c(context, clipDataB.getItemAt(i2), iC);
            if (charSequenceC != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceC);
                } else {
                    e(editable, charSequenceC);
                    z = true;
                }
            }
        }
        return null;
    }
}
