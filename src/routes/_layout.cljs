(ns routes.-layout)

(defn root-layout [{:keys [children]}]
  #jsx[:<>
       [:header {:class "border-b"}
        [:nav {:class "max-w-4xl mx-auto flex items-center px-2 h-8"}
         [:p "Demo app (squint + solid.js)"]]]
       [:main {:class "max-w-4xl mx-auto p-2"}
        children]])
