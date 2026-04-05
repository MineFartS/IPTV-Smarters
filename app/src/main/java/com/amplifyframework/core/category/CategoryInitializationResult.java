package com.amplifyframework.core.category;

import com.amplifyframework.core.InitializationResult;
import com.amplifyframework.core.InitializationStatus;
import com.amplifyframework.util.Immutable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class CategoryInitializationResult {
    private final InitializationStatus initializationStatus;
    private final Map<String, InitializationResult> pluginInitializationResults;

    public interface PluginCriteria<T> {
        boolean appliesTo(T t);
    }

    private CategoryInitializationResult(InitializationStatus initializationStatus, Map<String, InitializationResult> map) {
        this.initializationStatus = initializationStatus;
        this.pluginInitializationResults = map;
    }

    private static boolean anyFailed(Map<String, InitializationResult> map) {
        Iterator<InitializationResult> it = map.values().iterator();
        while (it.hasNext()) {
            if (it.next().isFailure()) {
                return true;
            }
        }
        return false;
    }

    public static CategoryInitializationResult failure() {
        return new CategoryInitializationResult(InitializationStatus.FAILED, Collections.emptyMap());
    }

    private Set<String> filterPluginResults(PluginCriteria<Map.Entry<String, InitializationResult>> pluginCriteria) {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, InitializationResult> entry : this.pluginInitializationResults.entrySet()) {
            if (pluginCriteria.appliesTo(entry)) {
                hashSet.add(entry.getKey());
            }
        }
        return hashSet;
    }

    public static CategoryInitializationResult with(Map<String, InitializationResult> map) {
        map.getClass();
        return new CategoryInitializationResult(anyFailed(map) ? InitializationStatus.FAILED : InitializationStatus.SUCCEEDED, map);
    }

    public Set<String> getFailedPlugins() {
        return filterPluginResults(new PluginCriteria() { // from class: c.b.b.b.a
            @Override // com.amplifyframework.core.category.CategoryInitializationResult.PluginCriteria
            public final boolean appliesTo(Object obj) {
                return ((InitializationResult) ((Map.Entry) obj).getValue()).isFailure();
            }
        });
    }

    public InitializationStatus getInitializationStatus() {
        return this.initializationStatus;
    }

    public Map<String, Throwable> getPluginInitializationFailures() {
        HashMap map = new HashMap();
        for (Map.Entry<String, InitializationResult> entry : this.pluginInitializationResults.entrySet()) {
            Throwable failure = entry.getValue().getFailure();
            String key = entry.getKey();
            if (failure != null) {
                map.put(key, failure);
            }
        }
        return Immutable.of(map);
    }

    public Set<String> getSuccessfulPlugins() {
        return filterPluginResults(new PluginCriteria() { // from class: c.b.b.b.b
            @Override // com.amplifyframework.core.category.CategoryInitializationResult.PluginCriteria
            public final boolean appliesTo(Object obj) {
                return ((InitializationResult) ((Map.Entry) obj).getValue()).isSuccess();
            }
        });
    }

    public boolean isFailure() {
        return InitializationStatus.FAILED.equals(this.initializationStatus);
    }

    public boolean isSuccess() {
        return InitializationStatus.SUCCEEDED.equals(this.initializationStatus);
    }
}
