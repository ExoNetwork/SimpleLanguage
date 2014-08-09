package tk.manf.language.api;

import java.util.function.BiConsumer;

public interface Message {
    public String getRawContent();

    /**
     * Helper class to send messages easily.
     *
     * @param <T>
     * @param t
     * @param m
     */
    public default <T> void send(T t, Method<T> m) {
        send(t, this, m);
    }

    /**
     * Sends the given Message to the given Target using given Method.
     *
     * @param target
     * @param msg
     * @param action
     */
    public static <T> void send(T target, Message msg, Method<T> action) {
        action.accept(target, msg);
    }
      
    /**
     * Helper Interface to represent Method
     * @param <T> Target to send Message to
     */
    @FunctionalInterface
    public static interface Method<T> extends BiConsumer<T, Message> {}
}
