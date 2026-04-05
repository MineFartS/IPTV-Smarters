package a.v.y;

import a.v.k;
import a.v.l;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NavController f3695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f3696c;

        public a(NavController navController, b bVar) {
            this.f3695b = navController;
            this.f3696c = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.c(this.f3695b, this.f3696c);
        }
    }

    public static k a(l lVar) {
        k kVarO = lVar;
        while (kVarO instanceof l) {
            l lVar2 = (l) kVarO;
            kVarO = lVar2.O(lVar2.R());
        }
        return kVarO;
    }

    public static boolean b(k kVar, Set<Integer> set) {
        while (!set.contains(Integer.valueOf(kVar.v()))) {
            kVar = kVar.C();
            if (kVar == null) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(NavController navController, b bVar) {
        a.k.b.c cVarB = bVar.b();
        k kVarH = navController.h();
        Set<Integer> setC = bVar.c();
        if (cVarB != null && kVarH != null && b(kVarH, setC)) {
            cVarB.a();
            return true;
        }
        if (navController.s()) {
            return true;
        }
        if (bVar.a() != null) {
            return bVar.a().a();
        }
        return false;
    }

    public static void d(Toolbar toolbar, NavController navController, b bVar) {
        navController.a(new e(toolbar, bVar));
        toolbar.setNavigationOnClickListener(new a(navController, bVar));
    }
}
