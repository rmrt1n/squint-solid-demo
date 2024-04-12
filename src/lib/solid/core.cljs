(ns lib.solid.core
  (:require ["solid-js" :as solid]))

(defn signal
  ([v]
   (solid/createSignal v))
  ([v opts]
   (solid/createSignal v opts)))

(defn effect
  ([f]
   (solid/createEffect f))
  ([f v]
   (solid/createEffect f v)))
