    public static Object assertImpl = (java.util.function.Function<Object, Object>) (message) ->
        (java.util.function.Function<Object, Object>) (success) ->
        (java.util.function.Supplier<Object>) () -> {
            if (!((Boolean) success)) throw new RuntimeException((String) message);
            return null;
        };

    public static Object checkThrows = (java.util.function.Function<Object, Object>) (fn) ->
        (java.util.function.Supplier<Object>) () -> {
            try {
                Object result = ((java.util.function.Function<Object, Object>) fn).apply(null);
                if (result instanceof java.util.function.Supplier) ((java.util.function.Supplier<Object>) result).get();
                return false;
            } catch (Throwable thrown) {
                // JavaScript treats a stack overflow as an Error, which is what
                // the assertThrows contract checks.
                if (thrown instanceof RuntimeException || thrown instanceof Error) return true;
                RuntimeException error = new RuntimeException("Threw something other than an Error");
                error.initCause(thrown);
                throw error;
            }
        };
