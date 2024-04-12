(ns lib.solid.router
  (:require
   ["@solidjs/router" :as sr]))

(defn router [{:keys [root routes]}]
  #jsx[sr/Router {:root root}
       (mapv
        (fn [route]
          #jsx[sr/Route route])
        routes)])
