package c.h.a;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.h.a.k.b.j;
import com.nst.iptvsmarterstvbox.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PopupWindow f16672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f16673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f16674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f16675d;

    public void a(List<c.h.a.g.c.c> list) {
        this.f16675d.W(list);
    }

    public void b(Context context) {
        if (this.f16672a == null) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.vw_layout_folder_list, (ViewGroup) null);
            this.f16673b = viewInflate;
            this.f16674c = (RecyclerView) viewInflate.findViewById(R.id.rv_folder);
            j jVar = new j(context, new ArrayList());
            this.f16675d = jVar;
            this.f16674c.setAdapter(jVar);
            this.f16674c.setLayoutManager(new LinearLayoutManager(context));
            this.f16673b.setFocusable(true);
            this.f16673b.setFocusableInTouchMode(true);
            PopupWindow popupWindow = new PopupWindow(this.f16673b);
            this.f16672a = popupWindow;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            this.f16672a.setFocusable(true);
            this.f16672a.setOutsideTouchable(false);
            this.f16672a.setTouchable(true);
        }
    }

    public void c(j.b bVar) {
        this.f16675d.h0(bVar);
    }

    public void d(View view) {
        if (this.f16672a.isShowing()) {
            this.f16672a.dismiss();
            return;
        }
        this.f16673b.measure(0, 0);
        this.f16672a.showAsDropDown(view, (view.getMeasuredWidth() - this.f16673b.getMeasuredWidth()) / 2, 0);
        this.f16672a.update(view, this.f16673b.getMeasuredWidth(), this.f16673b.getMeasuredHeight());
    }
}
