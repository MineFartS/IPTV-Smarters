package c.h.a.h.m.e;

import a.y.e.f;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.f.a.c.d.o;
import c.f.a.c.d.u.d;
import c.f.a.c.d.u.u.i;
import c.h.a.h.m.e.b;
import com.nst.iptvsmarterstvbox.R;
import com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;

/* JADX INFO: loaded from: classes2.dex */
public class c extends Fragment implements b.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.h.a.h.m.b f17028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f17029c;

    public class a implements b.d {
        public a() {
        }

        @Override // c.h.a.h.m.e.b.d
        public void a(View view) {
            switch (view.getId()) {
                case R.id.container /* 2131427755 */:
                    Log.d("QueueListViewFragment", "onItemViewClicked() container " + view.getTag(R.string.queue_tag_item));
                    c.this.r(view);
                    break;
                case R.id.play_pause /* 2131428798 */:
                    Log.d("QueueListViewFragment", "onItemViewClicked() play-pause " + view.getTag(R.string.queue_tag_item));
                    c.this.u(view);
                    break;
                case R.id.play_upcoming /* 2131428800 */:
                    c.this.f17028b.v(view, (o) view.getTag(R.string.queue_tag_item));
                    break;
                case R.id.stop_upcoming /* 2131429165 */:
                    c.this.f17028b.w(view, (o) view.getTag(R.string.queue_tag_item));
                    break;
            }
        }
    }

    @Override // c.h.a.h.m.e.b.f
    public void j(RecyclerView.e0 e0Var) {
        this.f17029c.H(e0Var);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_recycler_list_view, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) getView().findViewById(R.id.recycler_view);
        this.f17028b = c.h.a.h.m.b.n(getContext());
        b bVar = new b(getActivity(), this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        f fVar = new f(new c.h.a.h.m.e.a(bVar));
        this.f17029c = fVar;
        fVar.m(recyclerView);
        bVar.h0(new a());
    }

    public final i q() {
        d dVarC = c.f.a.c.d.u.b.e(getContext()).c().c();
        if (dVarC == null || !dVarC.c()) {
            return null;
        }
        return dVarC.p();
    }

    public final void r(View view) {
        i iVarQ = q();
        if (iVarQ == null) {
            return;
        }
        o oVar = (o) view.getTag(R.string.queue_tag_item);
        if (this.f17028b.t()) {
            Log.d("QueueListViewFragment", "Is detached: itemId = " + oVar.L());
            iVarQ.H(c.h.a.h.m.f.b.a(this.f17028b.p()), this.f17028b.q(oVar.L()), 0, null);
            return;
        }
        if (this.f17028b.m() != oVar.L()) {
            iVarQ.F(oVar.L(), null);
        } else if (c.f.a.c.d.u.b.e(getContext().getApplicationContext()).c().c() != null) {
            startActivity(new Intent(getActivity(), (Class<?>) ExpandedControlsActivity.class));
        }
    }

    public final void u(View view) {
        i iVarQ = q();
        if (iVarQ != null) {
            iVarQ.W();
        }
    }
}
