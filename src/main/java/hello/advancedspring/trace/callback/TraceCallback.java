package hello.advancedspring.trace.callback;

public interface TraceCallback<T> {
    T call();
}
