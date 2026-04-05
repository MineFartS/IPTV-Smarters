package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.NavigableSet;

/* JADX INFO: loaded from: assets/audience_network.dex */
public interface I6 {
    void A3Q(String str, II ii) throws I4;

    void A44(File file) throws I4;

    long A5a();

    long A5c(String str, long j2, long j3);

    @NonNull
    NavigableSet<IA> A5d(String str);

    long A5o(String str);

    IG A5p(String str);

    void ACK(IA ia);

    void ACR(IA ia) throws I4;

    void ACx(String str, long j2) throws I4;

    File ADM(String str, long j2, long j3) throws I4;

    IA ADO(String str, long j2) throws InterruptedException, I4;

    @Nullable
    IA ADP(String str, long j2) throws I4;
}
