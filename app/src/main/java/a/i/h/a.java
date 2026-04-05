package a.i.h;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a extends a.i.i.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static d f1668c;

    /* JADX INFO: renamed from: a.i.h.a$a, reason: collision with other inner class name */
    public class RunnableC0026a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String[] f1669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f1670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f1671d;

        public RunnableC0026a(String[] strArr, Activity activity, int i2) {
            this.f1669b = strArr;
            this.f1670c = activity;
            this.f1671d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f1669b.length];
            PackageManager packageManager = this.f1670c.getPackageManager();
            String packageName = this.f1670c.getPackageName();
            int length = this.f1669b.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = packageManager.checkPermission(this.f1669b[i2], packageName);
            }
            ((c) this.f1670c).onRequestPermissionsResult(this.f1671d, this.f1669b, iArr);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f1672b;

        public b(Activity activity) {
            this.f1672b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1672b.isFinishing() || a.i.h.d.i(this.f1672b)) {
                return;
            }
            this.f1672b.recreate();
        }
    }

    public interface c {
        void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
    }

    public interface d {
        boolean a(Activity activity, String[] strArr, int i2);
    }

    public interface e {
        void validateRequestPermissionsRequestCode(int i2);
    }

    public static class f extends SharedElementCallback {

        /* JADX INFO: renamed from: a.i.h.a$f$a, reason: collision with other inner class name */
        public class C0027a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SharedElementCallback.OnSharedElementsReadyListener f1673a;

            public C0027a(SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
                this.f1673a = onSharedElementsReadyListener;
            }
        }

        public f(o oVar) {
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            throw null;
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            new C0027a(onSharedElementsReadyListener);
            throw null;
        }
    }

    public static void l(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void m(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    @Deprecated
    public static boolean n(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static void o(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    public static void p(Activity activity) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            if (i2 <= 23) {
                new Handler(activity.getMainLooper()).post(new b(activity));
                return;
            } else if (a.i.h.d.i(activity)) {
                return;
            }
        }
        activity.recreate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void q(Activity activity, String[] strArr, int i2) {
        d dVar = f1668c;
        if (dVar == null || !dVar.a(activity, strArr, i2)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof e) {
                    ((e) activity).validateRequestPermissionsRequestCode(i2);
                }
                activity.requestPermissions(strArr, i2);
            } else if (activity instanceof c) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0026a(strArr, activity, i2));
            }
        }
    }

    public static <T extends View> T r(Activity activity, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) activity.requireViewById(i2);
        }
        T t = (T) activity.findViewById(i2);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void s(Activity activity, o oVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setEnterSharedElementCallback(oVar != null ? new f(oVar) : null);
        }
    }

    public static void t(Activity activity, o oVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setExitSharedElementCallback(oVar != null ? new f(oVar) : null);
        }
    }

    public static boolean u(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void v(Activity activity, Intent intent, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i2, bundle);
        } else {
            activity.startActivityForResult(intent, i2);
        }
    }

    public static void w(Activity activity, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
        }
    }

    public static void x(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }
}
