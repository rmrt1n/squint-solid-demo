(ns main
  (:require
   ["solid-js/web" :as sw]
   ["./index.css"]
   ["./lib/solid/router.cljs" :as sr]
   ["./routes/_layout.cljs" :refer [root-layout]]
   ["./routes/index.cljs" :refer [app]]))

(def root (js/document.getElementById "root"))

(sw/render
 (fn []
   (sr/router
    {:root root-layout
     :routes [{:path "/"
               :component app}]}))
 root)
