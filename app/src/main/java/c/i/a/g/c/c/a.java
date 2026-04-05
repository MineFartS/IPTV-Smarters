package c.i.a.g.c.c;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.i.a.c;
import c.i.a.d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class a implements c.i.a.g.c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c.i.a.g.c.a> f18127b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PopupWindow f18128c;

    public a(Context context) {
        this.f18126a = context;
    }

    @Override // c.i.a.g.c.b
    public void a(View view) {
        PopupWindow popupWindowB = b();
        this.f18128c = popupWindowB;
        popupWindowB.showAsDropDown(view, 0, (-this.f18126a.getResources().getDimensionPixelSize(c.i.a.a.f18039a)) * 4);
        if (this.f18127b.size() == 0) {
            Log.e(c.i.a.g.c.b.class.getName(), "The menu is empty");
        }
    }

    public final PopupWindow b() {
        LayoutInflater layoutInflater = (LayoutInflater) this.f18126a.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            throw new RuntimeException("can't access LAYOUT_INFLATER_SERVICE");
        }
        View viewInflate = layoutInflater.inflate(d.f18061c, (ViewGroup) null);
        c((RecyclerView) viewInflate.findViewById(c.f18054k));
        PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
        popupWindow.setFocusable(true);
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        popupWindow.setContentView(viewInflate);
        return popupWindow;
    }

    public final void c(RecyclerView recyclerView) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f18126a));
        recyclerView.setAdapter(new b(this.f18126a, this.f18127b));
    }
}
