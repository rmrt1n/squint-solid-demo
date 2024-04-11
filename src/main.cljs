(ns main
  (:require
   ["solid-js/web" :as s]
   ["@solidjs/router" :refer [Router Route]]
   ["./index.css"]
   ["./routes/_layout.cljs" :refer [RootLayout]]
   ["./routes/index.cljs" :refer [App]]))

(def root (js/document.getElementById "root"))

;; solid-router is here in case we're adding more pages in the future
(s/render
 (fn []
   #jsx[Router {:root RootLayout}
        [Route {:path "/" :component App}]])
 root)
