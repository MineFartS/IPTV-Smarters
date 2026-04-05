package a.i.h;

import a.i.h.j;
import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.achartengine.ChartFactory;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f1752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f1753c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f1751a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f1754d = new Object();

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            Bundle bundle = list.get(i2);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i2, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle b(j.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatF = aVar.f();
        bundle.putInt("icon", iconCompatF != null ? iconCompatF.h() : 0);
        bundle.putCharSequence(ChartFactory.TITLE, aVar.j());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", e(aVar.g()));
        bundle.putBoolean("showsUserInterface", aVar.i());
        bundle.putInt("semanticAction", aVar.h());
        return bundle;
    }

    public static Bundle c(Notification notification) {
        String str;
        String str2;
        synchronized (f1751a) {
            if (f1753c) {
                return null;
            }
            try {
                if (f1752b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f1753c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f1752b = declaredField;
                }
                Bundle bundle = (Bundle) f1752b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f1752b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e2) {
                e = e2;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f1753c = true;
                return null;
            } catch (NoSuchFieldException e3) {
                e = e3;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f1753c = true;
                return null;
            }
        }
    }

    public static Bundle d(n nVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", nVar.i());
        bundle.putCharSequence("label", nVar.h());
        bundle.putCharSequenceArray("choices", nVar.e());
        bundle.putBoolean("allowFreeFormInput", nVar.c());
        bundle.putBundle("extras", nVar.g());
        Set<String> setD = nVar.d();
        if (setD != null && !setD.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setD.size());
            Iterator<String> it = setD.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    public static Bundle[] e(n[] nVarArr) {
        if (nVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[nVarArr.length];
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            bundleArr[i2] = d(nVarArr[i2]);
        }
        return bundleArr;
    }

    public static Bundle f(Notification.Builder builder, j.a aVar) {
        IconCompat iconCompatF = aVar.f();
        builder.addAction(iconCompatF != null ? iconCompatF.h() : 0, aVar.j(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.g() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", e(aVar.g()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", e(aVar.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        return bundle;
    }
}
