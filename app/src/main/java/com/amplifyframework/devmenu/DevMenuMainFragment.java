package com.amplifyframework.devmenu;

import a.v.r;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.amplifyframework.core.R;

/* JADX INFO: loaded from: classes.dex */
public final class DevMenuMainFragment extends Fragment {
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.dev_menu_fragment_main, viewGroup, false);
        viewInflate.findViewById(R.id.env_button).setOnClickListener(new View.OnClickListener() { // from class: c.b.c.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.b(view).n(R.id.show_env_info);
            }
        });
        viewInflate.findViewById(R.id.device_button).setOnClickListener(new View.OnClickListener() { // from class: c.b.c.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.b(view).n(R.id.show_device_info);
            }
        });
        viewInflate.findViewById(R.id.logs_button).setOnClickListener(new View.OnClickListener() { // from class: c.b.c.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.b(view).n(R.id.show_logs);
            }
        });
        viewInflate.findViewById(R.id.file_issue_button).setOnClickListener(new View.OnClickListener() { // from class: c.b.c.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.b(view).n(R.id.show_file_issue);
            }
        });
        return viewInflate;
    }
}
