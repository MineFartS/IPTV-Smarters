package a.b.q;

import a.i.r.c;
import a.i.r.i0.b;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    public class a implements b.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f744a;

        public a(View view) {
            this.f744a = view;
        }

        @Override // a.i.r.i0.b.c
        public boolean a(a.i.r.i0.c cVar, int i2, Bundle bundle) {
            if (Build.VERSION.SDK_INT >= 25 && (i2 & 1) != 0) {
                try {
                    cVar.d();
                    InputContentInfo inputContentInfo = (InputContentInfo) cVar.e();
                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                } catch (Exception e2) {
                    Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e2);
                    return false;
                }
            }
            return a.i.r.x.f0(this.f744a, new c.a(new ClipData(cVar.b(), new ClipData.Item(cVar.a())), 2).d(cVar.c()).b(bundle).a()) == null;
        }
    }

    public static final class b {
        public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                a.i.r.x.f0(textView, new c.a(dragEvent.getClipData(), 3).a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        public static boolean b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            a.i.r.x.f0(view, new c.a(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    public static b.c a(View view) {
        return new a(view);
    }

    public static boolean b(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null && a.i.r.x.F(view) != null) {
            Activity activityD = d(view);
            if (activityD == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? b.a(dragEvent, (TextView) view, activityD) : b.b(dragEvent, view, activityD);
            }
        }
        return false;
    }

    public static boolean c(TextView textView, int i2) {
        if ((i2 != 16908322 && i2 != 16908337) || a.i.r.x.F(textView) == null) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            a.i.r.x.f0(textView, new c.a(primaryClip, 1).c(i2 != 16908322 ? 1 : 0).a());
        }
        return true;
    }

    public static Activity d(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
