package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public interface awm extends ExecutorService {
    <T> awl<T> a(Callable<T> callable);
}
